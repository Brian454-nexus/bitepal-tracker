package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1jSDK implements AFe1jSDK<DdlResponse> {
    @Override // com.appsflyer.internal.AFe1jSDK
    public final /* synthetic */ DdlResponse getRevenue(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str == null || str.length() == 0) {
            return new DdlResponse(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("found", false);
        boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLink = DeepLink.getRevenue(optJSONObject);
            deepLink.getMediationNetwork.put("is_deferred", true);
        }
        return new DdlResponse(optBoolean2, deepLink);
    }
}
