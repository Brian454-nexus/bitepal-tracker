package com.amazon.device.iap.internal.b;

import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11600a = "KEY_TIMESTAMP";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11601b = "KEY_REQUEST_ID";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11602c = "KEY_USER_ID";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11603d = "KEY_RECEIPT_STRING";

    /* renamed from: e, reason: collision with root package name */
    private final String f11604e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11605f;

    /* renamed from: g, reason: collision with root package name */
    private final long f11606g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11607h;

    public c(String str, String str2, String str3, long j6) {
        this.f11604e = str;
        this.f11605f = str2;
        this.f11607h = str3;
        this.f11606g = j6;
    }

    public String a() {
        return this.f11604e;
    }

    public String b() {
        return this.f11607h;
    }

    public String c() {
        return this.f11605f;
    }

    public long d() {
        return this.f11606g;
    }

    public String e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f11602c, this.f11604e);
        jSONObject.put(f11603d, this.f11605f);
        jSONObject.put(f11601b, this.f11607h);
        jSONObject.put(f11600a, this.f11606g);
        return jSONObject.toString();
    }

    public static c a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f11602c), jSONObject.getString(f11603d), jSONObject.getString(f11601b), jSONObject.getLong(f11600a));
        } catch (Throwable th) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th);
        }
    }
}
