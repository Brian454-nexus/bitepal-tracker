package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1ySDK {

    @NonNull
    public final String AFAdRevenueData;
    public final AFi1wSDK component1;
    public final Throwable component2;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1ySDK(String str, @NonNull String str2, long j6, long j7, int i6, AFi1wSDK aFi1wSDK, String str3, Throwable th) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j6;
        this.getCurrencyIso4217Code = j7;
        this.getMonetizationNetwork = i6;
        this.component1 = aFi1wSDK;
        this.component4 = str3;
        this.component2 = th;
    }
}
