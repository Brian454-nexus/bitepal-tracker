package com.braze.models;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public final Banner a(final JSONObject jSONObject) {
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: a4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.a.a();
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("banner");
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: a4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.models.a.b();
                    }
                }, 6, (Object) null);
                return null;
            }
            String string = optJSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = optJSONObject.getString("placement_id");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = optJSONObject.getString("html");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new Banner(string, string2, string3, optJSONObject.getBoolean("is_control"), optJSONObject.getLong("expires_at"), optJSONObject.getBoolean("is_test_send"));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: a4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.a.b(jSONObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize banner Json: " + jSONObject;
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}
