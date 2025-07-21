package com.amazon.device.iap.internal.a.a;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11545d = "b";

    public b(com.amazon.device.iap.internal.a.c cVar, Set<String> set) {
        super(cVar, "1.0", set);
    }

    private Product a(String str, Map map) {
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f11207k).toUpperCase());
            String string = jSONObject.getString(com.amazon.a.a.o.b.f11199c);
            String optString = jSONObject.optString(com.amazon.a.a.o.b.f11220x);
            return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(jSONObject.getString(com.amazon.a.a.o.b.f11206j)).setTitle(jSONObject.getString(com.amazon.a.a.o.b.f11189S)).setCoinsRewardAmount(jSONObject.optInt(com.amazon.a.a.o.b.f11190T, 0)).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str2);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f11545d, "data: " + b6);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        for (String str : ((a) this).f11544c) {
            if (b6.containsKey(str)) {
                try {
                    hashMap.put(str, a(str, b6));
                } catch (IllegalArgumentException e6) {
                    linkedHashSet.add(str);
                    com.amazon.device.iap.internal.util.b.b(f11545d, "Error parsing JSON for SKU " + str + ": " + e6.getMessage());
                }
            } else {
                linkedHashSet.add(str);
            }
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new ProductDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }
}
