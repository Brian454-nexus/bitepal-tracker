package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13040b = BrazeLogger.getBrazeLogTag((Class<?>) l.class);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.conditions.logical.a f13041a;

    public l(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i6);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                arrayList2.add(new g(jSONArray2.getJSONObject(i7)));
            }
            arrayList.add(new com.braze.triggers.conditions.logical.c(arrayList2));
        }
        this.f13041a = new com.braze.triggers.conditions.logical.a(arrayList);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f13041a.getJsonObject());
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e6) {
            BrazeLogger.e(f13040b, "Caught exception creating Json.", e6);
            return jSONObject;
        }
    }
}
