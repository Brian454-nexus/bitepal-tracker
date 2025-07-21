package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
abstract class b extends h {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11548b = "purchase_updates";

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f11549c;

    public b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z6) {
        super(cVar, f11548b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f11549c = z6;
    }

    @Override // com.amazon.a.a.n.a.a
    public void e() {
        super.e();
        a(com.amazon.a.a.o.b.f11198b, this.f11549c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
        a(com.amazon.a.a.o.b.ac, Boolean.valueOf(com.amazon.device.iap.internal.d.f().d()));
    }
}
