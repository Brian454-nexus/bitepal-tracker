package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1dSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final int getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFh1dSDK(String str, int i6, int i7, long j6) {
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = i6;
        this.getMonetizationNetwork = i7;
        this.AFAdRevenueData = j6;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1dSDK.class == obj.getClass()) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) obj;
            if (this.getMediationNetwork == aFh1dSDK.getMediationNetwork && this.getMonetizationNetwork == aFh1dSDK.getMonetizationNetwork && this.AFAdRevenueData == aFh1dSDK.AFAdRevenueData && (str = this.getCurrencyIso4217Code) != null && str.equals(aFh1dSDK.getCurrencyIso4217Code)) {
                return true;
            }
        }
        return false;
    }

    public final String getRevenue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getCurrencyIso4217Code);
            jSONObject.put("min", this.getMediationNetwork);
            jSONObject.put("expire", this.getMonetizationNetwork);
            jSONObject.put("ttl", this.AFAdRevenueData);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getMediationNetwork) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.AFAdRevenueData);
    }
}
