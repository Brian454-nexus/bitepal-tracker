package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11569d = "purchase_fulfilled";

    /* renamed from: b, reason: collision with root package name */
    protected final Set<String> f11570b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f11571c;

    public b(c cVar, Set<String> set, String str) {
        super(cVar, f11569d, com.amazon.a.a.o.b.ah, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f11570b = set;
        this.f11571c = str;
        b(false);
        a(com.amazon.a.a.o.b.f11176F, set);
        a(com.amazon.a.a.o.b.f11203g, str);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        return true;
    }

    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object a6 = j().a().a(com.amazon.a.a.o.b.ao);
        if (a6 != null && Boolean.FALSE.equals(a6)) {
            a(com.amazon.a.a.o.b.f11203g, com.amazon.device.iap.internal.model.a.DELIVERY_ATTEMPTED.toString());
        }
        super.l();
    }
}
