package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
final class e {
    public static List<Promotion> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(com.amazon.a.a.o.b.f11213q);
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(b(jSONArray.getJSONObject(i6)));
        }
        return arrayList;
    }

    private static Promotion b(JSONObject jSONObject) {
        return new Promotion(jSONObject.getString(com.amazon.a.a.o.b.f11214r), a(jSONObject.getJSONArray(com.amazon.a.a.o.b.f11215s)));
    }

    private static PromotionPlan c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string = jSONObject.getString(com.amazon.a.a.o.b.f11216t);
        int i6 = jSONObject.getInt(com.amazon.a.a.o.b.f11217u);
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11218v);
        if (f.a(optString) && (jSONObject2 = jSONObject.getJSONObject(com.amazon.a.a.o.b.f11219w)) != null) {
            Currency currency = Currency.getInstance(jSONObject2.getString(com.amazon.a.a.o.b.f11197a));
            optString = currency.getSymbol() + new BigDecimal(jSONObject2.getString(com.amazon.a.a.o.b.f11195Y));
        }
        return new PromotionPlan(string, optString, i6);
    }

    private static List<PromotionPlan> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            arrayList.add(c(jSONArray.getJSONObject(i6)));
        }
        return arrayList;
    }
}
