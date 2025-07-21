package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13026a;

    public a(JSONObject jSONObject) {
        this.f13026a = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.a)) {
            return false;
        }
        com.braze.triggers.events.a aVar = (com.braze.triggers.events.a) bVar;
        return !StringUtils.isNullOrBlank(aVar.f13062f) && aVar.f13062f.equals(this.f13026a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f13026a);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
