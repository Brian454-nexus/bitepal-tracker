package com.amazon.a.a.m;

import com.amazon.a.a.k.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11024a = "DATA_AUTHENTICATION_KEY";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11025b = "APPLICATION_LICENSE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11026c = "LICENSE_FAILURE_CONTENT";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11027d = "LICENSE_FAILURE_RAW_EXCEPTION";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11028e = "TEST_MODE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11029f = "PACKAGE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11030g = "COMMAND";

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f11031h;

    /* renamed from: i, reason: collision with root package name */
    private b f11032i = new b();

    public <T> void a(String str, a aVar) {
        this.f11032i.a(str, aVar);
    }

    public boolean b(String str) {
        return this.f11032i.a(str);
    }

    public void c(String str) {
        this.f11032i.c(str);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f11031h.b(this.f11032i);
    }

    public String toString() {
        return this.f11032i.toString();
    }

    public <T> void a(String str, T t6) {
        this.f11032i.a(str, (String) t6);
    }

    public <T> T a(String str) {
        return (T) this.f11032i.b(str);
    }
}
