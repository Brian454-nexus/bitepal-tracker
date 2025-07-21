package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11550d = "c";

    /* renamed from: e, reason: collision with root package name */
    private static final Date f11551e = new Date(0);

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z6) {
        super(cVar, "1.0", z6);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f11550d, "data: " + b6);
        String str = (String) b6.get("userId");
        String str2 = (String) b6.get(com.amazon.a.a.o.b.f11209m);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) b6.get(com.amazon.a.a.o.b.f11177G));
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                Receipt a6 = com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i6), str, (String) null);
                arrayList.add(a6);
                if (ProductType.ENTITLED == a6.getProductType()) {
                    com.amazon.device.iap.internal.b.a.a().a(str, a6.getReceiptId(), a6.getSku());
                }
            } catch (e e6) {
                com.amazon.device.iap.internal.util.b.b(f11550d, "fail to parse receipt, requestId:" + e6.a());
            } catch (f e7) {
                com.amazon.device.iap.internal.util.b.b(f11550d, "fail to verify receipt, requestId:" + e7.a());
            } catch (Throwable th) {
                com.amazon.device.iap.internal.util.b.b(f11550d, "fail to verify receipt, requestId:" + th.getMessage());
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) b6.get(com.amazon.a.a.o.b.f11178H));
        for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
            try {
                String string = jSONArray2.getString(i7);
                arrayList.add(new ReceiptBuilder().setSku(string).setProductType(ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(f11551e).setReceiptId(com.amazon.device.iap.internal.b.a.a().a(str, string)).build());
            } catch (JSONException unused) {
                com.amazon.device.iap.internal.util.b.b(f11550d, "fail to parse JSON[" + i7 + "] in \"" + jSONArray2 + "\"");
            }
        }
        String str3 = (String) b6.get(com.amazon.a.a.o.b.f11198b);
        boolean equalsIgnoreCase = com.amazon.a.a.o.b.af.equalsIgnoreCase((String) b6.get(com.amazon.a.a.o.b.f11205i));
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse build = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(arrayList).setHasMore(equalsIgnoreCase).build();
        build.getReceipts().addAll(com.amazon.device.iap.internal.b.d.a().b(build.getUserData().getUserId()));
        cVar.a().a(build);
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        return true;
    }
}
