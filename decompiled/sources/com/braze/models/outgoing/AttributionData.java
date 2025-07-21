package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/braze/models/outgoing/AttributionData;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "network", "campaign", "adGroup", "creative", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "forJsonPut", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "Companion", "com/braze/models/outgoing/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AttributionData implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    public AttributionData(String str, String str2, String str3, String str4) {
        this.network = str;
        this.campaign = str2;
        this.adGroup = str3;
        this.creative = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0(JSONException jSONException) {
        return "Caught exception creating AttributionData Json. " + jSONException;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.network;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObject.put("source", this.network);
            }
            String str2 = this.campaign;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                jSONObject.put("campaign", this.campaign);
            }
            String str3 = this.adGroup;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                jSONObject.put("adgroup", this.adGroup);
            }
            String str4 = this.creative;
            if (str4 != null && !StringsKt.isBlank(str4)) {
                jSONObject.put("ad", this.creative);
                return jSONObject;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: e4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$0;
                    forJsonPut$lambda$0 = AttributionData.forJsonPut$lambda$0(e6);
                    return forJsonPut$lambda$0;
                }
            }, 4, (Object) null);
        }
        return jSONObject;
    }
}
