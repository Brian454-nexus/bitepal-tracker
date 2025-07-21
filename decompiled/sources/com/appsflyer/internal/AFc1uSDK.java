package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1uSDK {
    public static JSONObject AFAdRevenueData(String str) {
        JSONObject monetizationNetwork = AFa1mSDK.getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            try {
                if (monetizationNetwork.has("ol_id")) {
                    String optString = monetizationNetwork.optString("ol_scheme", null);
                    String optString2 = monetizationNetwork.optString("ol_domain", null);
                    String optString3 = monetizationNetwork.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return monetizationNetwork;
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFb1rSDK.getRevenue().getMonetizationNetwork().copydefault().getMediationNetwork();
                AFb1rSDK.getRevenue().getMonetizationNetwork().copydefault().AFAdRevenueData();
            }
        }
        return monetizationNetwork;
    }
}
