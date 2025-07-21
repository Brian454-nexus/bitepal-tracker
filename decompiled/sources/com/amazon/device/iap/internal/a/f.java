package com.amazon.device.iap.internal.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11582a = 3715222306172636179L;

    /* renamed from: b, reason: collision with root package name */
    private final String f11583b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11584c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11585d;

    public f(String str, String str2, String str3) {
        this.f11583b = str;
        this.f11584c = str2;
        this.f11585d = str3;
    }

    public String a() {
        return this.f11583b;
    }

    public String b() {
        return this.f11584c;
    }

    public String c() {
        return this.f11585d;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f11583b = str;
        this.f11584c = str2;
        this.f11585d = str3;
    }
}
