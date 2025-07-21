package com.braze.models.response;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f12647a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12648b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12649c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f12650d;

    public c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f12647a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f12648b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f12649c = jsonObject.optBoolean("full_sync", false);
        this.f12650d = jsonObject.optJSONArray("cards");
    }

    public c(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.f12649c = false;
        this.f12647a = -1L;
        this.f12648b = -1L;
        this.f12650d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
