package com.amazon.device.iap.internal.a.h;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11590b = "submit_metric";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11591c = "metricName";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11592d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, f11590b, "1.0", cVar.d().toString(), PurchasingService.SDK_VERSION);
        a(f11591c, str);
        a(f11592d, str2);
        b(false);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        return true;
    }
}
