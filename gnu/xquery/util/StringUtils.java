package gnu.xquery.util;

import gnu.bytecode.Access;
import gnu.kawa.xml.KNode;
import gnu.kawa.xml.UntypedAtomic;
import gnu.kawa.xml.XIntegerType;
import gnu.lists.Consumer;
import gnu.mapping.CallContext;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import gnu.text.Path;
import gnu.text.URIPath;
import gnu.xml.TextUtils;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    private static String ERROR_VALUE = "<error>";

    static String coerceToString(Object arg, String functionName, int iarg, String onEmpty) {
        if (arg instanceof KNode) {
            arg = KNode.atomicValue(arg);
        }
        if ((arg == Values.empty || arg == null) && onEmpty != ERROR_VALUE) {
            return onEmpty;
        }
        if ((arg instanceof UntypedAtomic) || (arg instanceof CharSequence) || (arg instanceof URI) || (arg instanceof Path)) {
            return arg.toString();
        }
        throw new WrongType(functionName, iarg, arg, onEmpty == ERROR_VALUE ? "xs:string" : "xs:string?");
    }

    public static Object lowerCase(Object node) {
        return coerceToString(node, "lower-case", 1, "").toLowerCase();
    }

    public static Object upperCase(Object node) {
        return coerceToString(node, "upper-case", 1, "").toUpperCase();
    }

    static double asDouble(Object value) {
        if (!(value instanceof Number)) {
            value = NumberValue.numberValue(value);
        }
        return ((Number) value).doubleValue();
    }

    public static Object substring(Object str, Object start) {
        double d1 = asDouble(start);
        if (Double.isNaN(d1)) {
            return "";
        }
        int i = (int) (d1 - 0.5d);
        if (i < 0) {
            i = 0;
        }
        String s = coerceToString(str, "substring", 1, "");
        int len = s.length();
        int offset = 0;
        while (true) {
            int offset2 = offset;
            i--;
            if (i < 0) {
                return s.substring(offset2);
            }
            if (offset2 >= len) {
                return "";
            }
            offset = offset2 + 1;
            char ch = s.charAt(offset2);
            if (ch >= 55296 && ch < 56320 && offset < len) {
                offset++;
            }
        }
    }

    public static Object substring(Object str, Object start, Object length) {
        String s = coerceToString(str, "substring", 1, "");
        int len = s.length();
        double d1 = Math.floor(asDouble(start) - 0.5d);
        double d2 = d1 + Math.floor(asDouble(length) + 0.5d);
        if (d1 <= 0.0d) {
            d1 = 0.0d;
        }
        if (d2 > ((double) len)) {
            d2 = (double) len;
        }
        if (d2 <= d1) {
            return "";
        }
        int i1 = (int) d1;
        int i2 = ((int) d2) - i1;
        int offset = 0;
        while (true) {
            int offset2 = offset;
            i1--;
            if (i1 < 0) {
                int i12 = offset2;
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        return s.substring(i12, offset2);
                    }
                    if (offset2 >= len) {
                        return "";
                    }
                    int offset3 = offset2 + 1;
                    char ch = s.charAt(offset2);
                    if (ch >= 55296 && ch < 56320 && offset3 < len) {
                        offset3++;
                    }
                    offset2 = offset3;
                }
            } else if (offset2 >= len) {
                return "";
            } else {
                offset = offset2 + 1;
                char ch2 = s.charAt(offset2);
                if (ch2 >= 55296 && ch2 < 56320 && offset < len) {
                    offset++;
                }
            }
        }
    }

    public static Object stringLength(Object str) {
        String s = coerceToString(str, "string-length", 1, "");
        int slen = s.length();
        int len = 0;
        int i = 0;
        while (i < slen) {
            int i2 = i + 1;
            char ch = s.charAt(i);
            if (ch >= 55296 && ch < 56320 && i2 < slen) {
                i2++;
            }
            len++;
            i = i2;
        }
        return IntNum.make(len);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r3 = r2.indexOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object substringBefore(java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.String r4 = "substring-before"
            r5 = 1
            java.lang.String r6 = ""
            java.lang.String r2 = coerceToString(r7, r4, r5, r6)
            java.lang.String r4 = "substring-before"
            r5 = 2
            java.lang.String r6 = ""
            java.lang.String r0 = coerceToString(r8, r4, r5, r6)
            int r1 = r0.length()
            if (r1 != 0) goto L_0x001b
            java.lang.String r4 = ""
        L_0x001a:
            return r4
        L_0x001b:
            int r3 = r2.indexOf(r0)
            if (r3 < 0) goto L_0x0027
            r4 = 0
            java.lang.String r4 = r2.substring(r4, r3)
            goto L_0x001a
        L_0x0027:
            java.lang.String r4 = ""
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: gnu.xquery.util.StringUtils.substringBefore(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Object substringAfter(Object str, Object find) {
        String s = coerceToString(str, "substring-after", 1, "");
        String f = coerceToString(find, "substring-after", 2, "");
        int flen = f.length();
        if (flen == 0) {
            return s;
        }
        int start = s.indexOf(f);
        return start >= 0 ? s.substring(start + flen) : "";
    }

    public static Object translate(Object str, Object map, Object trans) {
        String sv = coerceToString(str, "translate", 1, "");
        Object map2 = KNode.atomicValue(map);
        if ((map2 instanceof UntypedAtomic) || (map2 instanceof String)) {
            String m = map2.toString();
            int mlen = m.length();
            Object trans2 = KNode.atomicValue(trans);
            if ((trans2 instanceof UntypedAtomic) || (trans2 instanceof String)) {
                String t = trans2.toString();
                if (mlen == 0) {
                    return sv;
                }
                int slen = sv.length();
                StringBuffer s = new StringBuffer(slen);
                int tlen = t.length();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= slen) {
                        return s.toString();
                    }
                    i = i2 + 1;
                    char c1 = sv.charAt(i2);
                    char c2 = 0;
                    if (c1 >= 55296 && c1 < 56320 && i < slen) {
                        c2 = sv.charAt(i);
                        i++;
                    }
                    int j = 0;
                    int mi = 0;
                    while (true) {
                        if (mi >= mlen) {
                            int i3 = mi;
                            break;
                        }
                        int mi2 = mi + 1;
                        char m1 = m.charAt(mi);
                        char m2 = 0;
                        if (m1 >= 55296 && m1 < 56320 && mi2 < mlen) {
                            m2 = m.charAt(mi2);
                            mi2++;
                        }
                        if (m1 == c1 && m2 == c2) {
                            int ti = 0;
                            while (true) {
                                int ti2 = ti;
                                if (ti2 >= tlen) {
                                    break;
                                }
                                ti = ti2 + 1;
                                char t1 = t.charAt(ti2);
                                char t2 = 0;
                                if (t1 >= 55296 && t1 < 56320 && ti < tlen) {
                                    t2 = t.charAt(ti);
                                    ti++;
                                }
                                if (j == 0) {
                                    c1 = t1;
                                    c2 = t2;
                                    break;
                                }
                                j--;
                            }
                        } else {
                            j++;
                            mi = mi2;
                        }
                    }
                    s.append(c1);
                    if (c2 != 0) {
                        s.append(c2);
                    }
                }
            } else {
                throw new WrongType("translate", 3, str, "xs:string");
            }
        } else {
            throw new WrongType("translate", 2, str, "xs:string");
        }
    }

    public static Object stringPad(Object str, Object padcount) {
        int count = ((Number) NumberValue.numberValue(padcount)).intValue();
        if (count > 0) {
            String sv = coerceToString(str, "string-pad", 1, "");
            StringBuffer s = new StringBuffer(count * sv.length());
            for (int i = 0; i < count; i++) {
                s.append(sv);
            }
            return s.toString();
        } else if (count == 0) {
            return "";
        } else {
            throw new IndexOutOfBoundsException("Invalid string-pad count");
        }
    }

    public static Object contains(Object str, Object contain) {
        return coerceToString(str, "contains", 1, "").indexOf(coerceToString(contain, "contains", 2, "")) < 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Object startsWith(Object str, Object with) {
        return coerceToString(str, "starts-with", 1, "").startsWith(coerceToString(with, "starts-with", 2, "")) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Object endsWith(Object str, Object with) {
        return coerceToString(str, "ends-with", 1, "").endsWith(coerceToString(with, "ends-with", 2, "")) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Object stringJoin(Object strseq, Object join) {
        StringBuffer s = new StringBuffer();
        String glue = coerceToString(join, "string-join", 2, ERROR_VALUE);
        int glen = glue.length();
        int index = 0;
        boolean started = false;
        while (true) {
            int next = Values.nextIndex(strseq, index);
            if (next < 0) {
                return s.toString();
            }
            Object obj = Values.nextValue(strseq, index);
            if (obj != Values.empty) {
                if (started && glen > 0) {
                    s.append(glue);
                }
                s.append(TextUtils.stringValue(obj));
                started = true;
                index = next;
            }
        }
    }

    public static String concat$V(Object arg1, Object arg2, Object[] args) {
        String str1 = TextUtils.stringValue(SequenceUtils.coerceToZeroOrOne(arg1, "concat", 1));
        String str2 = TextUtils.stringValue(SequenceUtils.coerceToZeroOrOne(arg2, "concat", 2));
        StringBuilder result = new StringBuilder(str1);
        result.append(str2);
        int count = args.length;
        for (int i = 0; i < count; i++) {
            result.append(TextUtils.stringValue(SequenceUtils.coerceToZeroOrOne(args[i], "concat", i + 2)));
        }
        return result.toString();
    }

    public static Object compare(Object val1, Object val2, NamedCollator coll) {
        if (val1 == Values.empty || val1 == null || val2 == Values.empty || val2 == null) {
            return Values.empty;
        }
        if (coll == null) {
            coll = NamedCollator.codepointCollation;
        }
        int ret = coll.compare(val1.toString(), val2.toString());
        if (ret < 0) {
            return IntNum.minusOne();
        }
        return ret > 0 ? IntNum.one() : IntNum.zero();
    }

    public static void stringToCodepoints$X(Object arg, CallContext ctx) {
        String str = coerceToString(arg, "string-to-codepoints", 1, "");
        int len = str.length();
        Consumer out = ctx.consumer;
        int i = 0;
        while (i < len) {
            int i2 = i + 1;
            int ch = str.charAt(i);
            if (ch >= 55296 && ch < 56320 && i2 < len) {
                ch = ((ch - 55296) * 1024) + (str.charAt(i2) - 56320) + 65536;
                i2++;
            }
            out.writeInt(ch);
            i = i2;
        }
    }

    private static void appendCodepoint(Object code, StringBuffer sbuf) {
        int i = ((IntNum) XIntegerType.integerType.cast(code)).intValue();
        if (i <= 0 || (i > 55295 && (i < 57344 || ((i > 65533 && i < 65536) || i > 1114111)))) {
            throw new IllegalArgumentException("codepoints-to-string: " + i + " is not a valid XML character [FOCH0001]");
        }
        if (i >= 65536) {
            sbuf.append((char) (((i - 65536) >> 10) + 55296));
            i = (i & 1023) + 56320;
        }
        sbuf.append((char) i);
    }

    public static String codepointsToString(Object arg) {
        if (arg == null) {
            return "";
        }
        StringBuffer sbuf = new StringBuffer();
        if (arg instanceof Values) {
            Values vals = (Values) arg;
            int ipos = vals.startPos();
            while (true) {
                ipos = vals.nextPos(ipos);
                if (ipos == 0) {
                    break;
                }
                appendCodepoint(vals.getPosPrevious(ipos), sbuf);
            }
        } else {
            appendCodepoint(arg, sbuf);
        }
        return sbuf.toString();
    }

    public static String encodeForUri(Object arg) {
        return URIPath.encodeForUri(coerceToString(arg, "encode-for-uri", 1, ""), 'U');
    }

    public static String iriToUri(Object arg) {
        return URIPath.encodeForUri(coerceToString(arg, "iri-to-uru", 1, ""), Access.INNERCLASS_CONTEXT);
    }

    public static String escapeHtmlUri(Object arg) {
        return URIPath.encodeForUri(coerceToString(arg, "escape-html-uri", 1, ""), 'H');
    }

    public static String normalizeSpace(Object arg) {
        String str = coerceToString(arg, "normalize-space", 1, "");
        int len = str.length();
        StringBuffer sbuf = null;
        int skipped = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (sbuf == null && skipped == 0 && i > 0) {
                    sbuf = new StringBuffer(str.substring(0, i));
                }
                skipped++;
            } else {
                if (skipped > 0) {
                    if (sbuf != null) {
                        sbuf.append(' ');
                    } else if (skipped > 1 || i == 1 || str.charAt(i - 1) != ' ') {
                        sbuf = new StringBuffer();
                    }
                    skipped = 0;
                }
                if (sbuf != null) {
                    sbuf.append(ch);
                }
            }
        }
        if (sbuf != null) {
            return sbuf.toString();
        }
        return skipped > 0 ? "" : str;
    }

    public static Pattern makePattern(String pattern, String flags) {
        int fl = 0;
        int i = flags.length();
        while (true) {
            i--;
            if (i >= 0) {
                switch (flags.charAt(i)) {
                    case 'i':
                        fl |= 66;
                        break;
                    case 'm':
                        fl |= 8;
                        break;
                    case 's':
                        fl |= 32;
                        break;
                    case 'x':
                        StringBuffer sbuf = new StringBuffer();
                        int plen = pattern.length();
                        int inBracket = 0;
                        int j = 0;
                        while (j < plen) {
                            int j2 = j + 1;
                            char pch = pattern.charAt(j);
                            if (pch == '\\' && j2 < plen) {
                                sbuf.append(pch);
                                pch = pattern.charAt(j2);
                                j2++;
                            } else if (pch == '[') {
                                inBracket++;
                            } else if (pch == ']') {
                                inBracket--;
                            } else if (inBracket == 0 && Character.isWhitespace(pch)) {
                                j = j2;
                            }
                            sbuf.append(pch);
                            j = j2;
                        }
                        pattern = sbuf.toString();
                        break;
                    default:
                        throw new IllegalArgumentException("unknown 'replace' flag");
                }
            } else {
                if (pattern.indexOf("{Is") >= 0) {
                    StringBuffer sbuf2 = new StringBuffer();
                    int plen2 = pattern.length();
                    int j3 = 0;
                    while (j3 < plen2) {
                        int j4 = j3 + 1;
                        char pch2 = pattern.charAt(j3);
                        if (pch2 != '\\' || j4 + 4 >= plen2) {
                            sbuf2.append(pch2);
                        } else {
                            sbuf2.append(pch2);
                            int j5 = j4 + 1;
                            char pch3 = pattern.charAt(j4);
                            sbuf2.append(pch3);
                            if ((pch3 == 'p' || pch3 == 'P') && pattern.charAt(j5) == '{' && pattern.charAt(j5 + 1) == 'I' && pattern.charAt(j5 + 2) == 's') {
                                sbuf2.append('{');
                                sbuf2.append(Access.INNERCLASS_CONTEXT);
                                sbuf2.append('n');
                                j4 = j5 + 3;
                            } else {
                                j4 = j5;
                            }
                        }
                        j3 = j4;
                    }
                    pattern = sbuf2.toString();
                }
                return Pattern.compile(pattern, fl);
            }
        }
    }

    public static boolean matches(Object input, String pattern) {
        return matches(input, pattern, "");
    }

    public static boolean matches(Object arg, String pattern, String flags) {
        return makePattern(pattern, flags).matcher(coerceToString(arg, "matches", 1, "")).find();
    }

    public static String replace(Object input, String pattern, String replacement) {
        return replace(input, pattern, replacement, "");
    }

    public static String replace(Object arg, String pattern, String replacement, String flags) {
        String str = coerceToString(arg, "replace", 1, "");
        int rlen = replacement.length();
        int i = 0;
        while (i < rlen) {
            int i2 = i + 1;
            char rch = replacement.charAt(i);
            if (rch == '\\') {
                if (i2 < rch) {
                    int i3 = i2 + 1;
                    char rch2 = replacement.charAt(i2);
                    if (rch2 == '\\' || rch2 == '$') {
                        i2 = i3;
                    } else {
                        int i4 = i3;
                    }
                }
                throw new IllegalArgumentException("invalid replacement string [FORX0004]");
            }
            i = i2;
        }
        return makePattern(pattern, flags).matcher(str).replaceAll(replacement);
    }

    public static void tokenize$X(Object arg, String pattern, CallContext ctx) {
        tokenize$X(arg, pattern, "", ctx);
    }

    public static void tokenize$X(Object arg, String pattern, String flags, CallContext ctx) {
        String str = coerceToString(arg, "tokenize", 1, "");
        Consumer out = ctx.consumer;
        Matcher matcher = makePattern(pattern, flags).matcher(str);
        if (str.length() != 0) {
            int start = 0;
            while (matcher.find()) {
                int end = matcher.start();
                out.writeObject(str.substring(start, end));
                start = matcher.end();
                if (start == end) {
                    throw new IllegalArgumentException("pattern matches empty string");
                }
            }
            out.writeObject(str.substring(start));
        }
    }

    public static Object codepointEqual(Object arg1, Object arg2) {
        String str1 = coerceToString(arg1, "codepoint-equal", 1, (String) null);
        String str2 = coerceToString(arg2, "codepoint-equal", 2, (String) null);
        if (str1 == null || str2 == null) {
            return Values.empty;
        }
        return str1.equals(str2) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Object normalizeUnicode(Object arg) {
        return normalizeUnicode(arg, "NFC");
    }

    public static Object normalizeUnicode(Object arg, String form) {
        String str = coerceToString(arg, "normalize-unicode", 1, "");
        if ("".equals(form.trim().toUpperCase())) {
            return str;
        }
        throw new UnsupportedOperationException("normalize-unicode: unicode string normalization not available");
    }
}
