package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13039a;

    public j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null || optJSONObject.isNull("campaign_id")) {
            return;
        }
        this.f13039a = optJSONObject.optString("campaign_id", null);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.g)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f13039a)) {
            return true;
        }
        com.braze.triggers.events.g gVar = (com.braze.triggers.events.g) bVar;
        return !StringUtils.isNullOrBlank(gVar.f13066e) && gVar.f13066e.equals(this.f13039a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f13039a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f13039a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
