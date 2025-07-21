package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13029a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f13030b = new HashSet();

    public e(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f13029a = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                this.f13030b.add(optJSONArray.getString(i6));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (bVar instanceof com.braze.triggers.events.d) {
            com.braze.triggers.events.d dVar = (com.braze.triggers.events.d) bVar;
            if (!StringUtils.isNullOrBlank(dVar.f13063e) && dVar.f13063e.equals(this.f13029a)) {
                return this.f13030b.size() > 0 ? !StringUtils.isNullOrBlank(dVar.f13064f) && this.f13030b.contains(dVar.f13064f) : StringUtils.isNullOrBlank(dVar.f13064f);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f13029a);
            if (this.f13030b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f13030b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
