package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements IPutIntoJson, com.braze.models.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f12631a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12632b;

    public i(long j6, boolean z6) {
        this.f12631a = j6;
        this.f12632b = z6;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getValue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f12631a);
        return jSONObject;
    }

    @Override // com.braze.models.k
    public final boolean isEmpty() {
        return !this.f12632b;
    }
}
