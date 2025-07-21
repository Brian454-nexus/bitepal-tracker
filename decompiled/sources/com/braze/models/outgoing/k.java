package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k implements IPutIntoJson, com.braze.models.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f12637a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f12638b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f12639c;

    /* renamed from: d, reason: collision with root package name */
    public final i f12640d;

    public k(String str, Boolean bool, Boolean bool2, i iVar) {
        this.f12637a = str;
        this.f12638b = bool;
        this.f12639c = bool2;
        this.f12640d = iVar;
    }

    public final boolean b() {
        return this.f12639c != null;
    }

    @Override // com.braze.models.k
    public final boolean isEmpty() {
        i iVar;
        JSONObject jsonObject = getJsonObject();
        if (jsonObject.length() == 0) {
            return true;
        }
        if (this.f12638b == null && this.f12639c == null && (iVar = this.f12640d) != null) {
            return !iVar.f12632b;
        }
        if (jsonObject.length() == 1) {
            return jsonObject.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f12637a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f12637a);
        }
        Boolean bool = this.f12638b;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f12639c;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        i iVar = this.f12640d;
        if (iVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", iVar.f12631a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }
}
