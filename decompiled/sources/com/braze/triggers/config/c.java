package com.braze.triggers.config;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.triggers.config.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final long f13045a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13047c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13049e;

    /* renamed from: f, reason: collision with root package name */
    public final b f13050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13051g;

    public c(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f13045a = json.optLong("start_time", -1L);
        this.f13046b = json.optLong("end_time", -1L);
        this.f13047c = json.optInt("priority", 0);
        this.f13051g = json.optInt("min_seconds_since_last_trigger", -1);
        this.f13048d = json.optInt("delay", 0);
        this.f13049e = json.optInt("timeout", -1);
        this.f13050f = new b(json);
    }

    public static final String b() {
        return "Could not convert ScheduleConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        try {
            JSONObject jsonObject = this.f13050f.getJsonObject();
            if (jsonObject == null) {
                return null;
            }
            jsonObject.put("start_time", this.f13045a);
            jsonObject.put("end_time", this.f13046b);
            jsonObject.put("priority", this.f13047c);
            jsonObject.put("min_seconds_since_last_trigger", this.f13051g);
            jsonObject.put("timeout", this.f13049e);
            jsonObject.put("delay", this.f13048d);
            return jsonObject;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: s4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
