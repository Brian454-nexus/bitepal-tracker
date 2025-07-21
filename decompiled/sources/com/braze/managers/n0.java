package com.braze.managers;

import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n0 {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:33:0x0014, B:4:0x0025, B:6:0x002d, B:7:0x0033, B:9:0x0039, B:10:0x0043, B:12:0x0069, B:16:0x0085, B:18:0x0089, B:20:0x0095, B:31:0x0073), top: B:32:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:33:0x0014, B:4:0x0025, B:6:0x002d, B:7:0x0033, B:9:0x0039, B:10:0x0043, B:12:0x0069, B:16:0x0085, B:18:0x0089, B:20:0x0095, B:31:0x0073), top: B:32:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.braze.managers.o0 a(final org.json.JSONObject r22, boolean r23) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "expiration_time"
            java.lang.String r2 = "authorization_code"
            java.lang.String r3 = "jsonData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            com.braze.managers.o0 r3 = new com.braze.managers.o0
            r3.<init>()
            r4 = 1
            r5 = 0
            if (r23 != 0) goto L24
            java.lang.String r6 = "enabled"
            boolean r6 = r0.getBoolean(r6)     // Catch: org.json.JSONException -> L1f
            if (r6 == 0) goto L1d
            goto L24
        L1d:
            r6 = r5
            goto L25
        L1f:
            r0 = move-exception
            r16 = r0
            goto Lad
        L24:
            r6 = r4
        L25:
            r3.f12481a = r6     // Catch: org.json.JSONException -> L1f
            boolean r6 = r0.has(r2)     // Catch: org.json.JSONException -> L1f
            if (r6 == 0) goto L33
            java.lang.String r2 = r0.getString(r2)     // Catch: org.json.JSONException -> L1f
            r3.f12483c = r2     // Catch: org.json.JSONException -> L1f
        L33:
            boolean r2 = r0.has(r1)     // Catch: org.json.JSONException -> L1f
            if (r2 == 0) goto L43
            long r1 = r0.getLong(r1)     // Catch: org.json.JSONException -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: org.json.JSONException -> L1f
            r3.f12482b = r1     // Catch: org.json.JSONException -> L1f
        L43:
            java.lang.String r1 = "batching_config"
            org.json.JSONObject r1 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L1f
            java.lang.String r2 = "flush_interval_size"
            long r6 = r1.getLong(r2)     // Catch: org.json.JSONException -> L1f
            r3.f12484d = r6     // Catch: org.json.JSONException -> L1f
            java.lang.String r2 = "flush_interval_seconds"
            long r6 = r1.getLong(r2)     // Catch: org.json.JSONException -> L1f
            r3.f12485e = r6     // Catch: org.json.JSONException -> L1f
            java.lang.String r2 = "max_payload_size"
            long r1 = r1.getLong(r2)     // Catch: org.json.JSONException -> L1f
            r3.f12486f = r1     // Catch: org.json.JSONException -> L1f
            long r6 = r3.f12484d     // Catch: org.json.JSONException -> L1f
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L73
            long r6 = r3.f12485e     // Catch: org.json.JSONException -> L1f
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L73
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L85
        L73:
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE     // Catch: org.json.JSONException -> L1f
            Z3.L2 r10 = new Z3.L2     // Catch: org.json.JSONException -> L1f
            r10.<init>()     // Catch: org.json.JSONException -> L1f
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r21
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: org.json.JSONException -> L1f
            r5 = r4
        L85:
            java.lang.Long r0 = r3.f12482b     // Catch: org.json.JSONException -> L1f
            if (r0 == 0) goto Lab
            long r0 = r0.longValue()     // Catch: org.json.JSONException -> L1f
            long r6 = com.braze.support.DateTimeUtils.nowInSeconds()     // Catch: org.json.JSONException -> L1f
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lab
            com.braze.support.BrazeLogger r13 = com.braze.support.BrazeLogger.INSTANCE     // Catch: org.json.JSONException -> L1f
            Z3.M2 r18 = new Z3.M2     // Catch: org.json.JSONException -> L1f
            r18.<init>()     // Catch: org.json.JSONException -> L1f
            r19 = 7
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r14 = r21
            com.braze.support.BrazeLogger.brazelog$default(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: org.json.JSONException -> L1f
            goto Lc1
        Lab:
            r4 = r5
            goto Lc1
        Lad:
            com.braze.support.BrazeLogger r13 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r15 = com.braze.support.BrazeLogger.Priority.f12981E
            Z3.N2 r18 = new Z3.N2
            r18.<init>()
            r19 = 4
            r20 = 0
            r17 = 0
            r14 = r21
            com.braze.support.BrazeLogger.brazelog$default(r13, r14, r15, r16, r17, r18, r19, r20)
        Lc1:
            if (r4 == 0) goto Lc8
            com.braze.managers.o0 r3 = new com.braze.managers.o0
            r3.<init>()
        Lc8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.n0.a(org.json.JSONObject, boolean):com.braze.managers.o0");
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
