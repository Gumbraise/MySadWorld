package com.google.appinventor.components.runtime.repackaged.org.json;

import java.util.Iterator;

public class XML {
    public static final Character AMP = new Character('&');
    public static final Character APOS = new Character('\'');
    public static final Character BANG = new Character('!');

    /* renamed from: EQ */
    public static final Character f38EQ = new Character('=');

    /* renamed from: GT */
    public static final Character f39GT = new Character('>');

    /* renamed from: LT */
    public static final Character f40LT = new Character('<');
    public static final Character QUEST = new Character('?');
    public static final Character QUOT = new Character('\"');
    public static final Character SLASH = new Character('/');

    public static String escape(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            switch (c) {
                case '\"':
                    sb.append("&quot;");
                    break;
                case '&':
                    sb.append("&amp;");
                    break;
                case '\'':
                    sb.append("&apos;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }

    public static void noSpace(String string) throws JSONException {
        int length = string.length();
        if (length == 0) {
            throw new JSONException("Empty string.");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                throw new JSONException(new StringBuffer().append("'").append(string).append("' contains a space character.").toString());
            }
        }
    }

    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v5
      assigns: []
      uses: []
      mth insns count: 171
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parse(com.google.appinventor.components.runtime.repackaged.org.json.XMLTokener r11, com.google.appinventor.components.runtime.repackaged.org.json.JSONObject r12, java.lang.String r13) throws com.google.appinventor.components.runtime.repackaged.org.json.JSONException {
        /*
            r10 = 91
            r9 = 45
            r7 = 1
            r6 = 0
            r2 = 0
            java.lang.Object r5 = r11.nextToken()
            java.lang.Character r8 = BANG
            if (r5 != r8) goto L_0x006d
            char r0 = r11.next()
            if (r0 != r9) goto L_0x0032
            char r7 = r11.next()
            if (r7 != r9) goto L_0x0021
            java.lang.String r7 = "-->"
            r11.skipPast(r7)
        L_0x0020:
            return r6
        L_0x0021:
            r11.back()
        L_0x0024:
            r1 = 1
        L_0x0025:
            java.lang.Object r5 = r11.nextMeta()
            if (r5 != 0) goto L_0x005d
            java.lang.String r6 = "Missing '>' after '<!'."
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x0032:
            if (r0 != r10) goto L_0x0024
            java.lang.Object r5 = r11.nextToken()
            java.lang.String r7 = "CDATA"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0056
            char r7 = r11.next()
            if (r7 != r10) goto L_0x0056
            java.lang.String r3 = r11.nextCDATA()
            int r7 = r3.length()
            if (r7 <= 0) goto L_0x0020
            java.lang.String r7 = "content"
            r12.accumulate(r7, r3)
            goto L_0x0020
        L_0x0056:
            java.lang.String r6 = "Expected 'CDATA['"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x005d:
            java.lang.Character r7 = f40LT
            if (r5 != r7) goto L_0x0066
            int r1 = r1 + 1
        L_0x0063:
            if (r1 > 0) goto L_0x0025
            goto L_0x0020
        L_0x0066:
            java.lang.Character r7 = f39GT
            if (r5 != r7) goto L_0x0063
            int r1 = r1 + -1
            goto L_0x0063
        L_0x006d:
            java.lang.Character r8 = QUEST
            if (r5 != r8) goto L_0x0077
            java.lang.String r7 = "?>"
            r11.skipPast(r7)
            goto L_0x0020
        L_0x0077:
            java.lang.Character r8 = SLASH
            if (r5 != r8) goto L_0x00d3
            java.lang.Object r5 = r11.nextToken()
            if (r13 != 0) goto L_0x0099
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = "Mismatched close tag "
            java.lang.StringBuffer r6 = r6.append(r7)
            java.lang.StringBuffer r6 = r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x0099:
            boolean r6 = r5.equals(r13)
            if (r6 != 0) goto L_0x00c1
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = "Mismatched "
            java.lang.StringBuffer r6 = r6.append(r7)
            java.lang.StringBuffer r6 = r6.append(r13)
            java.lang.String r7 = " and "
            java.lang.StringBuffer r6 = r6.append(r7)
            java.lang.StringBuffer r6 = r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x00c1:
            java.lang.Object r6 = r11.nextToken()
            java.lang.Character r8 = f39GT
            if (r6 == r8) goto L_0x00d0
            java.lang.String r6 = "Misshaped close tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x00d0:
            r6 = r7
            goto L_0x0020
        L_0x00d3:
            boolean r8 = r5 instanceof java.lang.Character
            if (r8 == 0) goto L_0x00de
            java.lang.String r6 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x00de:
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            com.google.appinventor.components.runtime.repackaged.org.json.JSONObject r2 = new com.google.appinventor.components.runtime.repackaged.org.json.JSONObject
            r2.<init>()
        L_0x00e7:
            if (r5 != 0) goto L_0x01b8
            java.lang.Object r5 = r11.nextToken()
            r3 = r5
        L_0x00ee:
            boolean r8 = r3 instanceof java.lang.String
            if (r8 == 0) goto L_0x011c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r11.nextToken()
            java.lang.Character r8 = f38EQ
            if (r5 != r8) goto L_0x0116
            java.lang.Object r5 = r11.nextToken()
            boolean r8 = r5 instanceof java.lang.String
            if (r8 != 0) goto L_0x010b
            java.lang.String r6 = "Missing value"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x010b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = stringToValue(r5)
            r2.accumulate(r3, r8)
            r5 = 0
            goto L_0x00e7
        L_0x0116:
            java.lang.String r8 = ""
            r2.accumulate(r3, r8)
            goto L_0x00e7
        L_0x011c:
            java.lang.Character r8 = SLASH
            if (r3 != r8) goto L_0x0141
            java.lang.Object r7 = r11.nextToken()
            java.lang.Character r8 = f39GT
            if (r7 == r8) goto L_0x012f
            java.lang.String r6 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x012f:
            int r7 = r2.length()
            if (r7 <= 0) goto L_0x013a
            r12.accumulate(r4, r2)
            goto L_0x0020
        L_0x013a:
            java.lang.String r7 = ""
            r12.accumulate(r4, r7)
            goto L_0x0020
        L_0x0141:
            java.lang.Character r8 = f39GT
            if (r3 != r8) goto L_0x01b1
        L_0x0145:
            java.lang.Object r5 = r11.nextContent()
            if (r5 != 0) goto L_0x0165
            if (r4 == 0) goto L_0x0020
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r7 = "Unclosed tag "
            java.lang.StringBuffer r6 = r6.append(r7)
            java.lang.StringBuffer r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x0165:
            boolean r8 = r5 instanceof java.lang.String
            if (r8 == 0) goto L_0x017c
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
            int r8 = r3.length()
            if (r8 <= 0) goto L_0x0145
            java.lang.String r8 = "content"
            java.lang.Object r9 = stringToValue(r3)
            r2.accumulate(r8, r9)
            goto L_0x0145
        L_0x017c:
            java.lang.Character r8 = f40LT
            if (r5 != r8) goto L_0x0145
            boolean r8 = parse(r11, r2, r4)
            if (r8 == 0) goto L_0x0145
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0193
            java.lang.String r7 = ""
            r12.accumulate(r4, r7)
            goto L_0x0020
        L_0x0193:
            int r8 = r2.length()
            if (r8 != r7) goto L_0x01ac
            java.lang.String r7 = "content"
            java.lang.Object r7 = r2.opt(r7)
            if (r7 == 0) goto L_0x01ac
            java.lang.String r7 = "content"
            java.lang.Object r7 = r2.opt(r7)
            r12.accumulate(r4, r7)
            goto L_0x0020
        L_0x01ac:
            r12.accumulate(r4, r2)
            goto L_0x0020
        L_0x01b1:
            java.lang.String r6 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r6 = r11.syntaxError(r6)
            throw r6
        L_0x01b8:
            r3 = r5
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.repackaged.org.json.XML.parse(com.google.appinventor.components.runtime.repackaged.org.json.XMLTokener, com.google.appinventor.components.runtime.repackaged.org.json.JSONObject, java.lang.String):boolean");
    }

    public static Object stringToValue(String string) {
        if ("true".equalsIgnoreCase(string)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(string)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(string)) {
            return JSONObject.NULL;
        }
        try {
            char initial = string.charAt(0);
            if (initial == '-' || (initial >= '0' && initial <= '9')) {
                Long value = new Long(string);
                if (value.toString().equals(string)) {
                    return value;
                }
            }
        } catch (Exception e) {
            try {
                Double value2 = new Double(string);
                if (value2.toString().equals(string)) {
                    return value2;
                }
            } catch (Exception e2) {
            }
        }
        return string;
    }

    public static JSONObject toJSONObject(String string) throws JSONException {
        JSONObject jo = new JSONObject();
        XMLTokener x = new XMLTokener(string);
        while (x.more() && x.skipPast("<")) {
            parse(x, jo, null);
        }
        return jo;
    }

    public static String toString(Object object) throws JSONException {
        return toString(object, null);
    }

    public static String toString(Object object, String tagName) throws JSONException {
        String str;
        StringBuffer sb = new StringBuffer();
        if (object instanceof JSONObject) {
            if (tagName != null) {
                sb.append('<');
                sb.append(tagName);
                sb.append('>');
            }
            JSONObject jo = (JSONObject) object;
            Iterator keys = jo.keys();
            while (keys.hasNext()) {
                String key = keys.next().toString();
                Object value = jo.opt(key);
                if (value == null) {
                    value = "";
                }
                if (value instanceof String) {
                    String str2 = (String) value;
                }
                if ("content".equals(key)) {
                    if (value instanceof JSONArray) {
                        JSONArray ja = (JSONArray) value;
                        int length = ja.length();
                        for (int i = 0; i < length; i++) {
                            if (i > 0) {
                                sb.append(10);
                            }
                            sb.append(escape(ja.get(i).toString()));
                        }
                    } else {
                        sb.append(escape(value.toString()));
                    }
                } else if (value instanceof JSONArray) {
                    JSONArray ja2 = (JSONArray) value;
                    int length2 = ja2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object value2 = ja2.get(i2);
                        if (value2 instanceof JSONArray) {
                            sb.append('<');
                            sb.append(key);
                            sb.append('>');
                            sb.append(toString(value2));
                            sb.append("</");
                            sb.append(key);
                            sb.append('>');
                        } else {
                            sb.append(toString(value2, key));
                        }
                    }
                } else if ("".equals(value)) {
                    sb.append('<');
                    sb.append(key);
                    sb.append("/>");
                } else {
                    sb.append(toString(value, key));
                }
            }
            if (tagName != null) {
                sb.append("</");
                sb.append(tagName);
                sb.append('>');
            }
            return sb.toString();
        }
        if (object.getClass().isArray()) {
            object = new JSONArray(object);
        }
        if (object instanceof JSONArray) {
            JSONArray ja3 = (JSONArray) object;
            int length3 = ja3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                Object opt = ja3.opt(i3);
                if (tagName == null) {
                    str = "array";
                } else {
                    str = tagName;
                }
                sb.append(toString(opt, str));
            }
            return sb.toString();
        }
        String string = object == null ? "null" : escape(object.toString());
        if (tagName == null) {
            return new StringBuffer().append("\"").append(string).append("\"").toString();
        }
        return string.length() == 0 ? new StringBuffer().append("<").append(tagName).append("/>").toString() : new StringBuffer().append("<").append(tagName).append(">").append(string).append("</").append(tagName).append(">").toString();
    }
}
