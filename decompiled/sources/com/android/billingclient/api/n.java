package com.android.billingclient.api;

import com.android.billingclient.api.f;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {
    public n(JSONObject jSONObject) {
        jSONObject.getString("type");
        JSONArray optJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                arrayList.add(Integer.valueOf(optJSONArray.getInt(i6)));
            }
        }
        new f.d(jSONObject.getJSONArray("pricingPhases"));
    }
}
