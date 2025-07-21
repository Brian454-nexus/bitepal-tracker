package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11588c = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, com.amazon.a.a.o.b.ah);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Receipt a6;
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f11588c, "data: " + b6);
        String str = (String) b().get(com.amazon.a.a.o.b.f11172B);
        String str2 = (String) b6.get("userId");
        String str3 = (String) b6.get(com.amazon.a.a.o.b.f11209m);
        String str4 = (String) b6.get(com.amazon.a.a.o.b.f11174D);
        if (f.a(str4)) {
            a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str4);
        PurchaseResponse.RequestStatus safeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(com.amazon.a.a.o.b.f11210n));
        if (safeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                a6 = com.amazon.device.iap.internal.util.c.a(jSONObject, str2, str);
            } catch (Throwable unused) {
                a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            a6 = null;
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(safeValueOf).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipt(a6).build());
        return true;
    }
}
