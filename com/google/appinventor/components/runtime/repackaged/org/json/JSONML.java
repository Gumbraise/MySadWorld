package com.google.appinventor.components.runtime.repackaged.org.json;

import java.util.Iterator;

public class JSONML {
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v12
      assigns: []
      uses: []
      mth insns count: 194
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object parse(com.google.appinventor.components.runtime.repackaged.org.json.XMLTokener r12, boolean r13, com.google.appinventor.components.runtime.repackaged.org.json.JSONArray r14) throws com.google.appinventor.components.runtime.repackaged.org.json.JSONException {
        /*
            r11 = 91
            r10 = 45
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            boolean r8 = r12.more()
            if (r8 != 0) goto L_0x0015
            java.lang.String r8 = "Bad XML"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x0015:
            java.lang.Object r7 = r12.nextContent()
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f40LT
            if (r7 != r8) goto L_0x01e9
            java.lang.Object r7 = r12.nextToken()
            boolean r8 = r7 instanceof java.lang.Character
            if (r8 == 0) goto L_0x00d0
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.SLASH
            if (r7 != r8) goto L_0x005f
            java.lang.Object r7 = r12.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L_0x0050
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = new com.google.appinventor.components.runtime.repackaged.org.json.JSONException
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            java.lang.String r10 = "Expected a closing name instead of '"
            java.lang.StringBuffer r9 = r9.append(r10)
            java.lang.StringBuffer r9 = r9.append(r7)
            java.lang.String r10 = "'."
            java.lang.StringBuffer r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0050:
            java.lang.Object r8 = r12.nextToken()
            java.lang.Character r9 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f39GT
            if (r8 == r9) goto L_0x018f
            java.lang.String r8 = "Misshaped close tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x005f:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.BANG
            if (r7 != r8) goto L_0x00be
            char r1 = r12.next()
            if (r1 != r10) goto L_0x0079
            char r8 = r12.next()
            if (r8 != r10) goto L_0x0075
            java.lang.String r8 = "-->"
            r12.skipPast(r8)
            goto L_0x0008
        L_0x0075:
            r12.back()
            goto L_0x0008
        L_0x0079:
            if (r1 != r11) goto L_0x009f
            java.lang.Object r7 = r12.nextToken()
            java.lang.String r8 = "CDATA"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0098
            char r8 = r12.next()
            if (r8 != r11) goto L_0x0098
            if (r14 == 0) goto L_0x0008
            java.lang.String r8 = r12.nextCDATA()
            r14.put(r8)
            goto L_0x0008
        L_0x0098:
            java.lang.String r8 = "Expected 'CDATA['"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x009f:
            r3 = 1
        L_0x00a0:
            java.lang.Object r7 = r12.nextMeta()
            if (r7 != 0) goto L_0x00ad
            java.lang.String r8 = "Missing '>' after '<!'."
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x00ad:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f40LT
            if (r7 != r8) goto L_0x00b7
            int r3 = r3 + 1
        L_0x00b3:
            if (r3 > 0) goto L_0x00a0
            goto L_0x0008
        L_0x00b7:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f39GT
            if (r7 != r8) goto L_0x00b3
            int r3 = r3 + -1
            goto L_0x00b3
        L_0x00be:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.QUEST
            if (r7 != r8) goto L_0x00c9
            java.lang.String r8 = "?>"
            r12.skipPast(r8)
            goto L_0x0008
        L_0x00c9:
            java.lang.String r8 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x00d0:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L_0x00f2
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r9 = "Bad tagName '"
            java.lang.StringBuffer r8 = r8.append(r9)
            java.lang.StringBuffer r8 = r8.append(r7)
            java.lang.String r9 = "'."
            java.lang.StringBuffer r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x00f2:
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            com.google.appinventor.components.runtime.repackaged.org.json.JSONArray r4 = new com.google.appinventor.components.runtime.repackaged.org.json.JSONArray
            r4.<init>()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONObject r5 = new com.google.appinventor.components.runtime.repackaged.org.json.JSONObject
            r5.<init>()
            if (r13 == 0) goto L_0x011a
            r4.put(r6)
            if (r14 == 0) goto L_0x0109
            r14.put(r4)
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r7 != 0) goto L_0x01fa
            java.lang.Object r7 = r12.nextToken()
            r0 = r7
        L_0x0111:
            if (r0 != 0) goto L_0x0125
            java.lang.String r8 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x011a:
            java.lang.String r8 = "tagName"
            r5.put(r8, r6)
            if (r14 == 0) goto L_0x0109
            r14.put(r5)
            goto L_0x0109
        L_0x0125:
            boolean r8 = r0 instanceof java.lang.String
            if (r8 != 0) goto L_0x0147
            if (r13 == 0) goto L_0x0134
            int r8 = r5.length()
            if (r8 <= 0) goto L_0x0134
            r4.put(r5)
        L_0x0134:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.SLASH
            if (r0 != r8) goto L_0x0192
            java.lang.Object r8 = r12.nextToken()
            java.lang.Character r9 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f39GT
            if (r8 == r9) goto L_0x018a
            java.lang.String r8 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x0147:
            java.lang.String r0 = (java.lang.String) r0
            if (r13 != 0) goto L_0x0162
            java.lang.String r8 = "tagName"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x015b
            java.lang.String r8 = "childNode"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0162
        L_0x015b:
            java.lang.String r8 = "Reserved attribute."
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x0162:
            java.lang.Object r7 = r12.nextToken()
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f38EQ
            if (r7 != r8) goto L_0x0184
            java.lang.Object r7 = r12.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L_0x0179
            java.lang.String r8 = "Missing value"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x0179:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.stringToValue(r7)
            r5.accumulate(r0, r8)
            r7 = 0
            goto L_0x010a
        L_0x0184:
            java.lang.String r8 = ""
            r5.accumulate(r0, r8)
            goto L_0x010a
        L_0x018a:
            if (r14 != 0) goto L_0x0008
            if (r13 == 0) goto L_0x0190
            r7 = r4
        L_0x018f:
            return r7
        L_0x0190:
            r7 = r5
            goto L_0x018f
        L_0x0192:
            java.lang.Character r8 = com.google.appinventor.components.runtime.repackaged.org.json.XML.f39GT
            if (r0 == r8) goto L_0x019d
            java.lang.String r8 = "Misshaped tag"
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x019d:
            java.lang.Object r2 = parse(r12, r13, r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0008
            boolean r8 = r2.equals(r6)
            if (r8 != 0) goto L_0x01d3
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r9 = "Mismatched '"
            java.lang.StringBuffer r8 = r8.append(r9)
            java.lang.StringBuffer r8 = r8.append(r6)
            java.lang.String r9 = "' and '"
            java.lang.StringBuffer r8 = r8.append(r9)
            java.lang.StringBuffer r8 = r8.append(r2)
            java.lang.String r9 = "'"
            java.lang.StringBuffer r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.google.appinventor.components.runtime.repackaged.org.json.JSONException r8 = r12.syntaxError(r8)
            throw r8
        L_0x01d3:
            r6 = 0
            if (r13 != 0) goto L_0x01e1
            int r8 = r4.length()
            if (r8 <= 0) goto L_0x01e1
            java.lang.String r8 = "childNodes"
            r5.put(r8, r4)
        L_0x01e1:
            if (r14 != 0) goto L_0x0008
            if (r13 == 0) goto L_0x01e7
            r7 = r4
            goto L_0x018f
        L_0x01e7:
            r7 = r5
            goto L_0x018f
        L_0x01e9:
            if (r14 == 0) goto L_0x0008
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x01f5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = com.google.appinventor.components.runtime.repackaged.org.json.XML.stringToValue(r7)
        L_0x01f5:
            r14.put(r7)
            goto L_0x0008
        L_0x01fa:
            r0 = r7
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.repackaged.org.json.JSONML.parse(com.google.appinventor.components.runtime.repackaged.org.json.XMLTokener, boolean, com.google.appinventor.components.runtime.repackaged.org.json.JSONArray):java.lang.Object");
    }

    public static JSONArray toJSONArray(String string) throws JSONException {
        return toJSONArray(new XMLTokener(string));
    }

    public static JSONArray toJSONArray(XMLTokener x) throws JSONException {
        return (JSONArray) parse(x, true, null);
    }

    public static JSONObject toJSONObject(XMLTokener x) throws JSONException {
        return (JSONObject) parse(x, false, null);
    }

    public static JSONObject toJSONObject(String string) throws JSONException {
        return toJSONObject(new XMLTokener(string));
    }

    public static String toString(JSONArray ja) throws JSONException {
        int i;
        StringBuffer sb = new StringBuffer();
        String tagName = ja.getString(0);
        XML.noSpace(tagName);
        String tagName2 = XML.escape(tagName);
        sb.append('<');
        sb.append(tagName2);
        Object object = ja.opt(1);
        if (object instanceof JSONObject) {
            i = 2;
            JSONObject jo = (JSONObject) object;
            Iterator keys = jo.keys();
            while (keys.hasNext()) {
                String key = keys.next().toString();
                XML.noSpace(key);
                String value = jo.optString(key);
                if (value != null) {
                    sb.append(' ');
                    sb.append(XML.escape(key));
                    sb.append('=');
                    sb.append('\"');
                    sb.append(XML.escape(value));
                    sb.append('\"');
                }
            }
        } else {
            i = 1;
        }
        int length = ja.length();
        if (i >= length) {
            sb.append('/');
            sb.append('>');
        } else {
            sb.append('>');
            do {
                Object object2 = ja.get(i);
                i++;
                if (object2 != null) {
                    if (object2 instanceof String) {
                        sb.append(XML.escape(object2.toString()));
                        continue;
                    } else if (object2 instanceof JSONObject) {
                        sb.append(toString((JSONObject) object2));
                        continue;
                    } else if (object2 instanceof JSONArray) {
                        sb.append(toString((JSONArray) object2));
                        continue;
                    } else {
                        continue;
                    }
                }
            } while (i < length);
            sb.append('<');
            sb.append('/');
            sb.append(tagName2);
            sb.append('>');
        }
        return sb.toString();
    }

    public static String toString(JSONObject jo) throws JSONException {
        StringBuffer sb = new StringBuffer();
        String tagName = jo.optString("tagName");
        if (tagName == null) {
            return XML.escape(jo.toString());
        }
        XML.noSpace(tagName);
        String tagName2 = XML.escape(tagName);
        sb.append('<');
        sb.append(tagName2);
        Iterator keys = jo.keys();
        while (keys.hasNext()) {
            String key = keys.next().toString();
            if (!"tagName".equals(key) && !"childNodes".equals(key)) {
                XML.noSpace(key);
                String value = jo.optString(key);
                if (value != null) {
                    sb.append(' ');
                    sb.append(XML.escape(key));
                    sb.append('=');
                    sb.append('\"');
                    sb.append(XML.escape(value));
                    sb.append('\"');
                }
            }
        }
        JSONArray ja = jo.optJSONArray("childNodes");
        if (ja == null) {
            sb.append('/');
            sb.append('>');
        } else {
            sb.append('>');
            int length = ja.length();
            for (int i = 0; i < length; i++) {
                Object object = ja.get(i);
                if (object != null) {
                    if (object instanceof String) {
                        sb.append(XML.escape(object.toString()));
                    } else if (object instanceof JSONObject) {
                        sb.append(toString((JSONObject) object));
                    } else if (object instanceof JSONArray) {
                        sb.append(toString((JSONArray) object));
                    } else {
                        sb.append(object.toString());
                    }
                }
            }
            sb.append('<');
            sb.append('/');
            sb.append(tagName2);
            sb.append('>');
        }
        return sb.toString();
    }
}
