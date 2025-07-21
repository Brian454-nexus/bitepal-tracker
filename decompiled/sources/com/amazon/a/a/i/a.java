package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f10917b = "a";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10918e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f, reason: collision with root package name */
    private static final String f10919f = "Amazon Appstore required";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10920g = "Amazon Appstore Update Required";

    /* renamed from: j, reason: collision with root package name */
    private static final long f10921j = 31536000;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f10922h;

    /* renamed from: i, reason: collision with root package name */
    private final c f10923i;

    public a(c cVar) {
        super(cVar);
        this.f10923i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        if (f10919f.equalsIgnoreCase(this.f10923i.e()) || f10920g.equalsIgnoreCase(this.f10923i.e())) {
            try {
                Activity b6 = this.f10922h.b();
                if (b6 == null) {
                    b6 = this.f10922h.a();
                }
                b6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f10918e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f10917b;
    }
}
