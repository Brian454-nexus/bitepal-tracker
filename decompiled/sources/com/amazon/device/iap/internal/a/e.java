package com.amazon.device.iap.internal.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11572a = 7955687159702952249L;

    /* renamed from: b, reason: collision with root package name */
    private final String f11573b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11574c;

    public e(String str, String str2) {
        this.f11573b = str;
        this.f11574c = str2;
    }

    public String a() {
        return this.f11573b;
    }

    public String b() {
        return this.f11574c;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f11573b = str;
        this.f11574c = str2;
    }
}
