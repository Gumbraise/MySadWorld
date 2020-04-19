package gnu.kawa.functions;

import gnu.mapping.Namespace;
import gnu.mapping.Symbol;
import java.text.BreakIterator;

public class UnicodeUtils {

    /* renamed from: Cc */
    static final Symbol f64Cc;

    /* renamed from: Cf */
    static final Symbol f65Cf;

    /* renamed from: Cn */
    static final Symbol f66Cn;

    /* renamed from: Co */
    static final Symbol f67Co;

    /* renamed from: Cs */
    static final Symbol f68Cs;

    /* renamed from: Ll */
    static final Symbol f69Ll;

    /* renamed from: Lm */
    static final Symbol f70Lm;

    /* renamed from: Lo */
    static final Symbol f71Lo;

    /* renamed from: Lt */
    static final Symbol f72Lt;

    /* renamed from: Lu */
    static final Symbol f73Lu;

    /* renamed from: Mc */
    static final Symbol f74Mc;

    /* renamed from: Me */
    static final Symbol f75Me;

    /* renamed from: Mn */
    static final Symbol f76Mn;

    /* renamed from: Nd */
    static final Symbol f77Nd;

    /* renamed from: Nl */
    static final Symbol f78Nl;

    /* renamed from: No */
    static final Symbol f79No;

    /* renamed from: Pc */
    static final Symbol f80Pc;

    /* renamed from: Pd */
    static final Symbol f81Pd;

    /* renamed from: Pe */
    static final Symbol f82Pe;

    /* renamed from: Pf */
    static final Symbol f83Pf;

    /* renamed from: Pi */
    static final Symbol f84Pi;

    /* renamed from: Po */
    static final Symbol f85Po;

    /* renamed from: Ps */
    static final Symbol f86Ps;

    /* renamed from: Sc */
    static final Symbol f87Sc;

    /* renamed from: Sk */
    static final Symbol f88Sk;

    /* renamed from: Sm */
    static final Symbol f89Sm;

    /* renamed from: So */
    static final Symbol f90So;

    /* renamed from: Zl */
    static final Symbol f91Zl;

    /* renamed from: Zp */
    static final Symbol f92Zp;

    /* renamed from: Zs */
    static final Symbol f93Zs;

    public static boolean isWhitespace(int ch) {
        if (ch == 32 || (ch >= 9 && ch <= 13)) {
            return true;
        }
        if (ch < 133) {
            return false;
        }
        if (ch == 133 || ch == 160 || ch == 5760 || ch == 6158) {
            return true;
        }
        if (ch < 8192 || ch > 12288) {
            return false;
        }
        if (ch <= 8202 || ch == 8232 || ch == 8233 || ch == 8239 || ch == 8287 || ch == 12288) {
            return true;
        }
        return false;
    }

    public static String capitalize(String str) {
        StringBuilder sbuf = new StringBuilder();
        BreakIterator wb = BreakIterator.getWordInstance();
        wb.setText(str);
        int start = wb.first();
        for (int end = wb.next(); end != -1; end = wb.next()) {
            boolean isWord = false;
            int p = start;
            while (true) {
                if (p >= end) {
                    break;
                } else if (Character.isLetter(str.codePointAt(p))) {
                    isWord = true;
                    break;
                } else {
                    p++;
                }
            }
            if (!isWord) {
                sbuf.append(str, start, end);
            } else {
                sbuf.append(Character.toTitleCase(str.charAt(start)));
                sbuf.append(str.substring(start + 1, end).toLowerCase());
            }
            start = end;
        }
        return sbuf.toString();
    }

    public static String foldCase(CharSequence str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        StringBuilder sbuf = null;
        int start = 0;
        int i = 0;
        while (true) {
            int ch = i == len ? -1 : str.charAt(i);
            boolean sigma = ch == 931 || ch == 963 || ch == 962;
            if (ch < 0 || ch == 304 || ch == 305 || sigma) {
                if (sbuf == null && ch >= 0) {
                    sbuf = new StringBuilder();
                }
                if (i > start) {
                    String converted = str.subSequence(start, i).toString().toUpperCase().toLowerCase();
                    if (sbuf == null) {
                        return converted;
                    }
                    sbuf.append(converted);
                }
                if (ch < 0) {
                    return sbuf.toString();
                }
                if (sigma) {
                    ch = 963;
                }
                sbuf.append((char) ch);
                start = i + 1;
            }
            i++;
        }
    }

    public static Symbol generalCategory(int ch) {
        switch (Character.getType(ch)) {
            case 1:
                return f73Lu;
            case 2:
                return f69Ll;
            case 3:
                return f72Lt;
            case 4:
                return f70Lm;
            case 5:
                return f71Lo;
            case 6:
                return f76Mn;
            case 7:
                return f75Me;
            case 8:
                return f74Mc;
            case 9:
                return f77Nd;
            case 10:
                return f78Nl;
            case 11:
                return f79No;
            case 12:
                return f93Zs;
            case 13:
                return f91Zl;
            case 14:
                return f92Zp;
            case 15:
                return f64Cc;
            case 16:
                return f65Cf;
            case 18:
                return f67Co;
            case 19:
                return f68Cs;
            case 20:
                return f81Pd;
            case 21:
                return f86Ps;
            case 22:
                return f82Pe;
            case 23:
                return f80Pc;
            case 24:
                return f85Po;
            case 25:
                return f89Sm;
            case 26:
                return f87Sc;
            case 27:
                return f88Sk;
            case 28:
                return f90So;
            case 29:
                return f84Pi;
            case 30:
                return f83Pf;
            default:
                return f66Cn;
        }
    }

    static {
        Namespace empty = Namespace.EmptyNamespace;
        f74Mc = empty.getSymbol("Mc");
        f80Pc = empty.getSymbol("Pc");
        f64Cc = empty.getSymbol("Cc");
        f87Sc = empty.getSymbol("Sc");
        f81Pd = empty.getSymbol("Pd");
        f77Nd = empty.getSymbol("Nd");
        f75Me = empty.getSymbol("Me");
        f82Pe = empty.getSymbol("Pe");
        f83Pf = empty.getSymbol("Pf");
        f65Cf = empty.getSymbol("Cf");
        f84Pi = empty.getSymbol("Pi");
        f78Nl = empty.getSymbol("Nl");
        f91Zl = empty.getSymbol("Zl");
        f69Ll = empty.getSymbol("Ll");
        f89Sm = empty.getSymbol("Sm");
        f70Lm = empty.getSymbol("Lm");
        f88Sk = empty.getSymbol("Sk");
        f76Mn = empty.getSymbol("Mn");
        f71Lo = empty.getSymbol("Lo");
        f79No = empty.getSymbol("No");
        f85Po = empty.getSymbol("Po");
        f90So = empty.getSymbol("So");
        f92Zp = empty.getSymbol("Zp");
        f67Co = empty.getSymbol("Co");
        f93Zs = empty.getSymbol("Zs");
        f86Ps = empty.getSymbol("Ps");
        f68Cs = empty.getSymbol("Cs");
        f72Lt = empty.getSymbol("Lt");
        f66Cn = empty.getSymbol("Cn");
        f73Lu = empty.getSymbol("Lu");
    }
}
