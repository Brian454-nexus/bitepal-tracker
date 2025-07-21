package com.amazon.a.b;

import java.util.Date;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f11301a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11302b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11303c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f11304d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11305e;

    public b(com.amazon.a.a.o.b.f fVar) {
        this.f11301a = a("checksum", fVar);
        this.f11302b = a("customerId", fVar);
        this.f11303c = a("deviceId", fVar);
        this.f11305e = a("packageName", fVar);
        this.f11304d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) {
        String a6 = fVar.a(str);
        if (com.amazon.a.a.o.e.a(a6)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return a6;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) {
        String a6 = a(str, fVar);
        try {
            return new Date(Long.parseLong(a6));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, a6);
        }
    }

    public String c() {
        return this.f11303c;
    }

    public Date d() {
        return this.f11304d;
    }

    public String e() {
        return this.f11305e;
    }

    public String a() {
        return this.f11301a;
    }

    public String b() {
        return this.f11302b;
    }
}
