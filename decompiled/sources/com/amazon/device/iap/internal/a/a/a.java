package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
abstract class a extends h {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11543b = "getItem_data";

    /* renamed from: c, reason: collision with root package name */
    protected final Set<String> f11544c;

    public a(com.amazon.device.iap.internal.a.c cVar, String str, Set<String> set) {
        super(cVar, f11543b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f11544c = set;
        a(com.amazon.a.a.o.b.f11185O, set);
    }
}
