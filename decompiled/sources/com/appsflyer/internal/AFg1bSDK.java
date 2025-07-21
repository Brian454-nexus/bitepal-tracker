package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1bSDK extends AFf1oSDK<Map<String, Object>> {
    private static final List<String> component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFInAppEventParameterName;
    private final AFd1rSDK copy;
    private Map<String, Object> copydefault;
    private final AFe1qSDK equals;
    private final AFd1qSDK hashCode;
    private final AFh1oSDK toString;

    public AFg1bSDK(@NonNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.equals = aFd1kSDK.getCurrencyIso4217Code();
        this.copy = aFd1kSDK.getRevenue();
        this.toString = aFd1kSDK.component3();
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1cSDK AFAdRevenueData() {
        AFe1cSDK aFe1cSDK;
        AFe1cSDK aFe1cSDK2;
        if (this.component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFInAppEventParameterName = "'isStopTracking' enabled";
            throw new AFf1ySDK();
        }
        AFe1cSDK aFe1cSDK3 = AFe1cSDK.FAILURE;
        int i6 = 0;
        while (i6 <= 2) {
            boolean z6 = true;
            boolean z7 = i6 >= 2;
            this.toString.hashCode = System.currentTimeMillis();
            try {
                try {
                    aFe1cSDK = super.AFAdRevenueData();
                    ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z6 = false;
                        }
                        if (!responseNetwork.isSuccessful() && statusCode != 404) {
                            if (!z7) {
                                if (!z6) {
                                }
                            }
                            this.AFInAppEventParameterName = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1cSDK2 = AFe1cSDK.FAILURE;
                            return aFe1cSDK2;
                        }
                        Map<String, Object> map = (Map) responseNetwork.getBody();
                        int statusCode2 = responseNetwork.getStatusCode();
                        Boolean bool = (Boolean) map.get("iscache");
                        if (statusCode2 == 404) {
                            map.remove("error_reason");
                            map.remove("status_code");
                            map.put("af_status", "Organic");
                            map.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.copy.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.afDebugLog(sb.toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.copy.AFAdRevenueData("attributionId", new JSONObject(map).toString());
                        if (!this.copy.getMediationNetwork("sixtyDayConversionData")) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.copydefault = map;
                        aFe1cSDK2 = AFe1cSDK.SUCCESS;
                        return aFe1cSDK2;
                    }
                } catch (AFf1wSDK e6) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFInAppEventParameterName = "AppsFlyer dev key is missing";
                    throw e6;
                } catch (Exception e7) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e7.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e7, false, false);
                    aFe1cSDK = AFe1cSDK.FAILURE;
                    if (z7) {
                        this.AFInAppEventParameterName = e7.getMessage();
                        throw e7;
                    }
                }
                aFe1cSDK3 = aFe1cSDK;
                i6++;
            } finally {
                this.toString.getCurrencyIso4217Code(i6);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1cSDK3;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        Map<String, Object> map = this.copydefault;
        String str = this.AFInAppEventParameterName;
        if (map != null) {
            AFg1aSDK.AFAdRevenueData(map);
        } else if (str == null || str.isEmpty()) {
            AFg1aSDK.getRevenue("Unknown error");
        } else {
            AFg1aSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<Map<String, Object>> getMediationNetwork(@NonNull String str) {
        String str2;
        String monetizationNetwork = AFb1rSDK.getMonetizationNetwork(this.copy, this.hashCode.component4());
        if (monetizationNetwork != null && !monetizationNetwork.trim().isEmpty()) {
            if (!component3.contains(monetizationNetwork.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(monetizationNetwork);
                AFe1qSDK aFe1qSDK = this.equals;
                AFe1tSDK<Map<String, Object>> aFe1tSDK = (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK, str2, str}, -465858035, 465858035, System.identityHashCode(aFe1qSDK));
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(aFe1tSDK.getRevenue.getMediationNetwork);
                AFLogger.afInfoLog(sb.toString());
                return aFe1tSDK;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", monetizationNetwork));
        }
        str2 = "";
        AFe1qSDK aFe1qSDK2 = this.equals;
        AFe1tSDK<Map<String, Object>> aFe1tSDK2 = (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK2, str2, str}, -465858035, 465858035, System.identityHashCode(aFe1qSDK2));
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(aFe1tSDK2.getRevenue.getMediationNetwork);
        AFLogger.afInfoLog(sb2.toString());
        return aFe1tSDK2;
    }
}
