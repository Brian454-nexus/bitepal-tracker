package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1gSDK {

    @Nullable
    public final String AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1gSDK(long j6, long j7, @Nullable String str, @Nullable String str2) {
        this.getMonetizationNetwork = j6;
        this.getRevenue = j7;
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1gSDK)) {
            return false;
        }
        AFi1gSDK aFi1gSDK = (AFi1gSDK) obj;
        return this.getMonetizationNetwork == aFi1gSDK.getMonetizationNetwork && this.getRevenue == aFi1gSDK.getRevenue && Intrinsics.areEqual(this.AFAdRevenueData, aFi1gSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        int hashCode = ((Long.hashCode(this.getMonetizationNetwork) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getCurrencyIso4217Code + ")";
    }
}
