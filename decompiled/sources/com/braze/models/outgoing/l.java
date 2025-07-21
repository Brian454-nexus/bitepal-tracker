package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements IPutIntoJson, com.braze.models.k {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12641a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f12642b;

    public l(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.f12641a = userObject;
        this.f12642b = new JSONArray().put(userObject);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONArray jsonArrayForJsonPut = this.f12642b;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    @Override // com.braze.models.k
    public final boolean isEmpty() {
        return this.f12641a.length() == 0 || (this.f12641a.length() == 1 && this.f12641a.has("user_id"));
    }
}
