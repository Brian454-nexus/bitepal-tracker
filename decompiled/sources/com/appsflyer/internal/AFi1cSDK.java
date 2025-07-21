package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AFi1cSDK extends AFj1sSDK {
    private AFd1qSDK getCurrencyIso4217Code;

    public AFi1cSDK(String str, String str2, AFd1qSDK aFd1qSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getCurrencyIso4217Code = aFd1qSDK;
    }

    public final boolean getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getRevenue.getMediationNetwork("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
