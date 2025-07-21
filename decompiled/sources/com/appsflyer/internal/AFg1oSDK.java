package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1oSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1oSDK(int i6, int i7, int i8, int i9, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i6;
        this.getRevenue = i7;
        this.getMonetizationNetwork = i8;
        this.getCurrencyIso4217Code = i9;
        this.getMediationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1oSDK)) {
            return false;
        }
        AFg1oSDK aFg1oSDK = (AFg1oSDK) obj;
        return this.AFAdRevenueData == aFg1oSDK.AFAdRevenueData && this.getRevenue == aFg1oSDK.getRevenue && this.getMonetizationNetwork == aFg1oSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1oSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMediationNetwork, aFg1oSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.AFAdRevenueData) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.getMonetizationNetwork)) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.AFAdRevenueData + ", gdprApplies=" + this.getRevenue + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.getCurrencyIso4217Code + ", tcString=" + this.getMediationNetwork + ")";
    }
}
