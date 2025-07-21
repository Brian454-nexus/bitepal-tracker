package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1aSDK extends AFh1gSDK {
    public AFh1aSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFa1oSDK getRevenue(String str) {
        return super.getRevenue(AFa1oSDK.AFAdRevenueData(str));
    }
}
