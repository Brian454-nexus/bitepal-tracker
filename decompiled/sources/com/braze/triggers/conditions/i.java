package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13037d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* renamed from: c, reason: collision with root package name */
    public final String f13038c;

    public i(JSONObject jSONObject) {
        super(jSONObject);
        this.f13038c = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f) || StringUtils.isNullOrBlank(this.f13038c)) {
            return false;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        if (!StringUtils.isNullOrBlank(fVar.f13065f) && fVar.f13065f.equals(this.f13038c)) {
            return this.f13041a.a(bVar);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject b6 = super.b();
        try {
            b6.put("type", "purchase_property");
            JSONObject jSONObject = b6.getJSONObject("data");
            jSONObject.put("product_id", this.f13038c);
            b6.put("data", jSONObject);
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.e(f13037d, "Caught exception creating Json.", e6);
            return b6;
        }
    }
}
