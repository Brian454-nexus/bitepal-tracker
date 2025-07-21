package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13027d = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* renamed from: c, reason: collision with root package name */
    public final String f13028c;

    public b(JSONObject jSONObject) {
        super(jSONObject);
        this.f13028c = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.a)) {
            return false;
        }
        com.braze.triggers.events.a aVar = (com.braze.triggers.events.a) bVar;
        if (StringUtils.isNullOrBlank(aVar.f13062f) || !aVar.f13062f.equals(this.f13028c)) {
            return false;
        }
        return this.f13041a.a(bVar);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject b6 = super.b();
        try {
            b6.put("type", "custom_event_property");
            JSONObject jSONObject = b6.getJSONObject("data");
            jSONObject.put("event_name", this.f13028c);
            b6.put("data", jSONObject);
            return b6;
        } catch (JSONException e6) {
            BrazeLogger.e(f13027d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e6);
            return b6;
        }
    }
}
