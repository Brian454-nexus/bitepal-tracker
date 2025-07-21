package com.appsflyer.internal;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1iSDK extends AFa1oSDK {
    @Override // com.appsflyer.internal.AFa1oSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1oSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return this.component1 == 1 ? AFf1zSDK.CONVERSION : AFf1zSDK.LAUNCH;
    }
}
