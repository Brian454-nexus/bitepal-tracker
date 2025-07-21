package com.braze.models;

import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\b\u0007\u0018\u0000 #2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001$B9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u000b\u0010\u0014R$\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/braze/models/Banner;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "trackingId", "placementId", "html", "", "isControl", "", "expirationTimestampSeconds", "isTestSend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJZ)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/Banner;", "deepcopy", "isExpired", "()Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTrackingId", "getPlacementId", "getHtml", "Z", "J", "getExpirationTimestampSeconds", "()J", "userId", "getUserId", "setUserId", "(Ljava/lang/String;)V", "Companion", "com/braze/models/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Banner implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final String trackingId;
    private String userId;

    public Banner(String trackingId, String placementId, String html, boolean z6, long j6, boolean z7) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(html, "html");
        this.trackingId = trackingId;
        this.placementId = placementId;
        this.html = html;
        this.isControl = z6;
        this.expirationTimestampSeconds = j6;
        this.isTestSend = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend);
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: isControl, reason: from getter */
    public final boolean getIsControl() {
        return this.isControl;
    }

    public final boolean isExpired() {
        long j6 = this.expirationTimestampSeconds;
        return j6 != -1 && j6 < DateTimeUtils.nowInSeconds();
    }

    /* renamed from: isTestSend, reason: from getter */
    public final boolean getIsTestSend() {
        return this.isTestSend;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return StringsKt.trimIndent("\n            Banner{\n            trackingId='" + this.trackingId + "'\n            placementId='" + this.placementId + "'\n            html='" + this.html + "'\n            isControl=" + this.isControl + "\n            expirationTimestampSeconds=" + this.expirationTimestampSeconds + "\n            isTestSend=" + this.isTestSend + "\n            }\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put("placement_id", this.placementId);
            jSONObject2.put("html", this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put("expires_at", this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            jSONObject.put("banner", jSONObject2);
            return jSONObject;
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: a4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$0;
                    forJsonPut$lambda$0 = Banner.forJsonPut$lambda$0();
                    return forJsonPut$lambda$0;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
