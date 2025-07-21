package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1tSDK {

    @Nullable
    public String AFAdRevenueData;
    public boolean areAllFieldsValid;

    @Nullable
    public AppsFlyerConsent component1;

    @Nullable
    public AFe1nSDK component3;

    @Nullable
    public AdvertisingIdData component4;

    @Nullable
    public String getCurrencyIso4217Code;

    @Nullable
    public AFc1cSDK getMediationNetwork;

    @Nullable
    public AFc1aSDK getMonetizationNetwork;

    @Nullable
    public String getRevenue;

    public final boolean getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }

    public final synchronized void getRevenue(@Nullable AFe1nSDK aFe1nSDK) {
        this.component3 = aFe1nSDK;
    }
}
