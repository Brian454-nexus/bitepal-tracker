package com.braze.triggers.config;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13044a;

    public b(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f13044a = json.optInt("re_eligibility", -1);
    }

    public static final String b() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            return new JSONObject().put("re_eligibility", this.f13044a);
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: s4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.config.b.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
