package com.braze.models;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 \u00192\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001aB-\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "id", "", "enabled", "properties", "trackingString", "<init>", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "getEnabled", "()Z", "Lorg/json/JSONObject;", "getProperties", "getTrackingString$android_sdk_base_release", "Companion", "com/braze/models/h", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class FeatureFlag implements IPutIntoJson<JSONObject> {
    public static final h Companion = new h();
    private final boolean enabled;
    private final String id;
    private final JSONObject properties;
    private final String trackingString;

    public FeatureFlag(String id, boolean z6, JSONObject properties, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.id = id;
        this.enabled = z6;
        this.properties = properties;
        this.trackingString = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating FeatureFlag Json.";
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(this.properties), this.trackingString);
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: getTrackingString$android_sdk_base_release, reason: from getter */
    public final String getTrackingString() {
        return this.trackingString;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put("properties", this.properties);
            jSONObject.put("fts", this.trackingString);
            return jSONObject;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: a4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$0;
                    forJsonPut$lambda$0 = FeatureFlag.forJsonPut$lambda$0();
                    return forJsonPut$lambda$0;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
