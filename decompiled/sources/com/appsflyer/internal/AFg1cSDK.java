package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1cSDK extends AFe1eSDK<Void> {
    private final AFd1rSDK areAllFieldsValid;
    private final Throwable component3;
    private final AFe1kSDK<String> component4;

    public AFg1cSDK(AFf1fSDK aFf1fSDK, AFd1rSDK aFd1rSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1fSDK.component1();
        this.component4 = ((AFf1oSDK) aFf1fSDK).component4;
        this.areAllFieldsValid = aFd1rSDK;
    }

    private Map<String, Object> component4() {
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork("attributionId", (String) null);
        if (monetizationNetwork == null) {
            return null;
        }
        try {
            new AFe1rSDK();
            return AFe1rSDK.AFAdRevenueData(monetizationNetwork);
        } catch (JSONException e6) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e6.getMessage());
            AFLogger.afErrorLog(sb.toString(), e6);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @NonNull
    public final AFe1cSDK AFAdRevenueData() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.areAllFieldsValid.getMediationNetwork("appsFlyerCount", 0))));
        long mediationNetwork = this.areAllFieldsValid.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.areAllFieldsValid.getRevenue("sixtyDayConversionData", true);
            this.areAllFieldsValid.AFAdRevenueData("attributionId", (String) null);
            this.areAllFieldsValid.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> component4 = component4();
        if (component4 != null) {
            try {
                if (!component4.containsKey("is_first_launch")) {
                    component4.put("is_first_launch", Boolean.FALSE);
                }
                AFg1aSDK.AFAdRevenueData(component4);
            } catch (Exception e6) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e6.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e6);
            }
            return AFe1cSDK.SUCCESS;
        }
        try {
        } catch (Exception e7) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e7.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e7);
        }
        if (this.component3 != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.component3.getMessage());
            AFg1aSDK.getRevenue(sb3.toString());
            return AFe1cSDK.SUCCESS;
        }
        AFe1kSDK<String> aFe1kSDK = this.component4;
        if (aFe1kSDK != null && !aFe1kSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.component4.getStatusCode());
            AFg1aSDK.getRevenue(sb4.toString());
            return AFe1cSDK.SUCCESS;
        }
        return AFe1cSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1000L;
    }
}
