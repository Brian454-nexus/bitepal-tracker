package com.braze.support;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f12996a = new i();

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize feature flag Json: " + jSONObject;
    }

    public final FeatureFlag a(final JSONObject featureFlagObject) {
        Intrinsics.checkNotNullParameter(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean z6 = featureFlagObject.getBoolean("enabled");
            JSONObject optJSONObject = featureFlagObject.optJSONObject("properties");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z6, optJSONObject, JsonUtils.getOptionalString(featureFlagObject, "fts"));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.i.b(featureFlagObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
