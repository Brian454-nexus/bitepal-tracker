package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11536b = "a";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11537e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11538f = "Amazon Appstore required";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11539g = "Amazon Appstore Update Required";

    /* renamed from: j, reason: collision with root package name */
    private static final long f11540j = 31536000;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f11541h;

    /* renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f11542i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f11542i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        com.amazon.device.iap.internal.util.b.a(f11536b, "doAction");
        if (f11538f.equalsIgnoreCase(this.f11542i.e()) || f11539g.equalsIgnoreCase(this.f11542i.e())) {
            try {
                Activity b6 = this.f11541h.b();
                if (b6 == null) {
                    b6 = this.f11541h.a();
                }
                b6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f11537e)));
            } catch (Exception e6) {
                com.amazon.device.iap.internal.util.b.b(f11536b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e6);
            }
        }
    }

    public String toString() {
        return f11536b;
    }
}
