package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private final String f11567c;

    /* renamed from: d, reason: collision with root package name */
    private final FulfillmentResult f11568d;

    public a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.f11567c = str;
        this.f11568d = fulfillmentResult;
        a((h) new b(this, hashSet, fulfillmentResult.toString()));
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void b() {
    }

    @Override // com.amazon.device.iap.internal.a.c, com.amazon.a.a.j.a
    public void c() {
        String c6;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.f11568d;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (c6 = d.a().c(this.f11567c)) != null) {
            new com.amazon.device.iap.internal.a.g.b(this, c6).l();
            d.a().a(this.f11567c);
        }
    }
}
