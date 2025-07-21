package com.amazon.a.a.o.b.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11230a = "DATA_AUTH_KEY_LOAD_FAILURE";

    /* renamed from: b, reason: collision with root package name */
    private static final long f11231b = 1;

    private a(String str, Throwable th) {
        super(f11230a, str, th);
    }

    public static a a(Throwable th) {
        return new a("CERT_FAILED_TO_LOAD", th);
    }

    public static a b(Throwable th) {
        return new a("FAILED_TO_ESTABLISH_TRUST", th);
    }

    public static a d() {
        return new a("CERT_NOT_FOUND", null);
    }

    public static a e() {
        return new a("CERT_INVALID", null);
    }

    public static a f() {
        return new a("VERIFICATION_FAILED", null);
    }
}
