package com.appsflyer.internal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1hSDK extends AFa1oSDK {
    public final AFf1zSDK equals;

    @Deprecated
    public AFh1hSDK() {
        this.equals = null;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        AFf1zSDK aFf1zSDK = this.equals;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }

    public AFh1hSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.getMonetizationNetwork = str2;
        AFAdRevenueData(bArr);
        this.equals = aFf1zSDK;
    }
}
