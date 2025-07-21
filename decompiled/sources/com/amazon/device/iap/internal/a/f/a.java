package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
abstract class a extends h {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11586b = "purchase_response";

    public a(com.amazon.device.iap.internal.a.c cVar, String str) {
        super(cVar, f11586b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
    }

    public void a(String str, String str2, String str3, PurchaseResponse.RequestStatus requestStatus) {
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(requestStatus).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipt(null).build());
    }
}
