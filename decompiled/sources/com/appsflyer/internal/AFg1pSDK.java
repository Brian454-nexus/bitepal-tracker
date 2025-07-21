package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1pSDK implements AFg1tSDK {

    @NotNull
    private final AFg1qSDK AFAdRevenueData;

    @NotNull
    private final AFd1tSDK getMediationNetwork;

    @NotNull
    private final AppsFlyerProperties getRevenue;

    public AFg1pSDK(@NotNull AFg1qSDK aFg1qSDK, @NotNull AFd1tSDK aFd1tSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFAdRevenueData = aFg1qSDK;
        this.getMediationNetwork = aFd1tSDK;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull AFf1zSDK aFf1zSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        AFg1oSDK currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code();
        AppsFlyerConsent appsFlyerConsent = this.getMediationNetwork.component1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (currencyIso4217Code != null) {
            boolean z6 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(currencyIso4217Code.AFAdRevenueData));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(currencyIso4217Code.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(currencyIso4217Code.getCurrencyIso4217Code));
            if (z6) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(currencyIso4217Code.getRevenue));
                linkedHashMap3.put("tcstring", currencyIso4217Code.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1zSDK != AFf1zSDK.CONVERSION || this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> currencyIso4217Code2 = AFb1rSDK.getCurrencyIso4217Code(map);
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        currencyIso4217Code2.put("api", MapsKt.mapOf(TuplesKt.to(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
