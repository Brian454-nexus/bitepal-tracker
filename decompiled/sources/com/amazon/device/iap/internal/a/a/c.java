package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Promotion;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11546d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar, Set<String> set) {
        super(cVar, com.amazon.a.a.o.b.ah, set);
    }

    private Product a(String str, Map map) {
        JSONObject optJSONObject;
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f11207k).toUpperCase());
            String string = jSONObject.getString(com.amazon.a.a.o.b.f11199c);
            List<Promotion> list = null;
            String optString = jSONObject.optString(com.amazon.a.a.o.b.f11220x, null);
            if (f.a(optString) && (optJSONObject = jSONObject.optJSONObject(com.amazon.a.a.o.b.f11221y)) != null) {
                Currency currency = Currency.getInstance(optJSONObject.getString(com.amazon.a.a.o.b.f11197a));
                optString = currency.getSymbol() + new BigDecimal(optJSONObject.getString(com.amazon.a.a.o.b.f11195Y));
            }
            String string2 = jSONObject.getString(com.amazon.a.a.o.b.f11189S);
            String string3 = jSONObject.getString(com.amazon.a.a.o.b.f11206j);
            int optInt = jSONObject.optInt(com.amazon.a.a.o.b.f11190T, 0);
            String string4 = jSONObject.isNull(com.amazon.a.a.o.b.f11211o) ? null : jSONObject.getString(com.amazon.a.a.o.b.f11211o);
            String string5 = jSONObject.isNull(com.amazon.a.a.o.b.f11212p) ? null : jSONObject.getString(com.amazon.a.a.o.b.f11212p);
            if (!jSONObject.isNull(com.amazon.a.a.o.b.f11213q)) {
                list = e.a(jSONObject);
            }
            return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(string3).setTitle(string2).setCoinsRewardAmount(optInt).setSubscriptionPeriod(string4).setFreeTrialPeriod(string5).setPromotions(list).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str2);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f11546d, "data: " + b6);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        for (String str : ((a) this).f11544c) {
            if (b6.containsKey(str)) {
                try {
                    hashMap.put(str, a(str, b6));
                } catch (IllegalArgumentException e6) {
                    linkedHashSet.add(str);
                    String str2 = (String) b6.get(str);
                    String k6 = k();
                    StringBuilder sb = new StringBuilder();
                    String str3 = f11546d;
                    sb.append(str3);
                    sb.append(".onResult()");
                    MetricsHelper.submitJsonParsingExceptionMetrics(k6, str2, sb.toString());
                    com.amazon.device.iap.internal.util.b.b(str3, "Error parsing JSON for SKU " + str + ": " + e6.getMessage());
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
