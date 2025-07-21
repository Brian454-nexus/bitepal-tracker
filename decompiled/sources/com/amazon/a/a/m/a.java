package com.amazon.a.a.m;

import java.util.Date;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a extends com.amazon.a.a.e.a<a> {

    /* renamed from: b, reason: collision with root package name */
    private final Object f11018b;

    /* renamed from: c, reason: collision with root package name */
    private final Date f11019c;

    public a(Object obj, Date date) {
        this.f11018b = obj;
        this.f11019c = date;
    }

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        return this.f11019c;
    }

    public final Object h() {
        return this.f11018b;
    }
}
