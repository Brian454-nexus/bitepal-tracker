package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1rSDK implements AFe1jSDK<Map<String, Object>> {
    public static Map<String, Object> AFAdRevenueData(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
            }
            hashMap.remove("is_cache");
            return hashMap;
        } catch (JSONException e6) {
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", e6);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("string_response", str);
            return hashMap2;
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final /* synthetic */ Map<String, Object> getRevenue(String str) {
        return AFAdRevenueData(str);
    }
}
