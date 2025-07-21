package com.amazon.device.iap.internal.a.e;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.util.MetricsHelper;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
abstract class a extends h {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11575b = "purchase_item";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11576f = "a";

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f11577c;

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f11578d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f11579e;

    public a(com.amazon.device.iap.internal.a.c cVar, String str, String str2) {
        super(cVar, f11575b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f11579e = str2;
        boolean d6 = com.amazon.device.iap.internal.d.f().d();
        a(com.amazon.a.a.o.b.f11181K, str2);
        a(com.amazon.a.a.o.b.ac, Boolean.valueOf(d6));
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        String str = f11576f;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b6);
        if (!b6.containsKey(com.amazon.a.a.o.b.f11222z)) {
            com.amazon.device.iap.internal.util.b.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.b.a(str, "found intent");
        final Intent intent = (Intent) b6.remove(com.amazon.a.a.o.b.f11222z);
        this.f11577c.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.iap.internal.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity b7 = a.this.f11578d.b();
                    if (b7 == null) {
                        b7 = a.this.f11578d.a();
                    }
                    com.amazon.device.iap.internal.util.b.a(a.f11576f, "About to fire intent with activity " + b7);
                    b7.startActivity(intent);
                } catch (Exception e6) {
                    MetricsHelper.submitExceptionMetrics(a.this.k(), a.f11576f + ".onResult().execute()", e6);
                    com.amazon.device.iap.internal.util.b.b(a.f11576f, "Exception when attempting to fire intent: " + e6);
                }
            }
        });
        return true;
    }
}
