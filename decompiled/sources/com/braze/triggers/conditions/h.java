package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13036a;

    public h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull("product_id")) {
            return;
        }
        this.f13036a = optJSONObject.optString("product_id", null);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f13036a)) {
            return true;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        return !StringUtils.isNullOrBlank(fVar.f13065f) && fVar.f13065f.equals(this.f13036a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f13036a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f13036a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
