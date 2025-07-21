package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFk1wSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class CrossPromotionHelper {
    private static String getCurrencyIso4217Code = "https://%simpression.%s";

    private static void getMediationNetwork(@NonNull String str, @NonNull Context context, AFk1wSDK aFk1wSDK) {
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        revenue.AFAdRevenueData(context);
        AFd1kSDK monetizationNetwork = revenue.getMonetizationNetwork();
        AFf1uSDK aFf1uSDK = new AFf1uSDK(monetizationNetwork, str, aFk1wSDK);
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1uSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c6;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c6 = 1;
                }
                c6 = 65535;
            } else {
                if (key.equals("app")) {
                    c6 = 0;
                }
                c6 = 65535;
            }
            if (c6 == 0) {
                AFj1fSDK.getCurrencyIso4217Code = value;
            } else if (c6 == 1) {
                getCurrencyIso4217Code = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator mediationNetwork = getMediationNetwork(context, str, str2, map, String.format(AFj1fSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1vSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1vSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        getMediationNetwork(mediationNetwork.generateLink(), context, new AFk1wSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1vSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1vSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            getMediationNetwork(getMediationNetwork(context, str, str2, map, String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName())).generateLink(), context, null);
        }
    }

    @NonNull
    private static LinkGenerator getMediationNetwork(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.getMediationNetwork = str3;
        linkGenerator.AFAdRevenueData = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }
}
