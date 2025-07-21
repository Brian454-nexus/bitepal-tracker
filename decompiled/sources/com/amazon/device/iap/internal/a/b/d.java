package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11552d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, boolean z6) {
        super(cVar, com.amazon.a.a.o.b.ah, z6);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i6), str, str3));
            } catch (e e6) {
                com.amazon.device.iap.internal.util.b.b(f11552d, "fail to parse receipt, requestId:" + e6.a());
            } catch (f e7) {
                com.amazon.device.iap.internal.util.b.b(f11552d, "fail to verify receipt, requestId:" + e7.a());
            } catch (Throwable th) {
                com.amazon.device.iap.internal.util.b.b(f11552d, "fail to verify receipt, requestId:" + th.getMessage());
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f11552d, "data: " + b6);
        String str = (String) b6.get("userId");
        String str2 = (String) b6.get(com.amazon.a.a.o.b.f11209m);
        List<Receipt> a6 = a(str, (String) b6.get(com.amazon.a.a.o.b.f11177G), (String) b6.get(com.amazon.a.a.o.b.f11172B));
        String str3 = (String) b6.get(com.amazon.a.a.o.b.f11198b);
        boolean booleanValue = Boolean.valueOf((String) b6.get(com.amazon.a.a.o.b.f11205i)).booleanValue();
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse build = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(a6).setHasMore(booleanValue).build();
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        cVar.a().a(build);
        return true;
    }
}
