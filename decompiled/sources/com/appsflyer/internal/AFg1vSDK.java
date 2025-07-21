package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1vSDK {
    public long getCurrencyIso4217Code;
    public final AFd1rSDK getMediationNetwork;
    public long getMonetizationNetwork;
    public AFi1vSDK AFAdRevenueData = null;
    public AFi1vSDK getRevenue = getCurrencyIso4217Code();

    public AFg1vSDK(AFd1rSDK aFd1rSDK) {
        this.getMediationNetwork = aFd1rSDK;
        this.getCurrencyIso4217Code = aFd1rSDK.getMediationNetwork("af_rc_timestamp", 0L);
        this.getMonetizationNetwork = aFd1rSDK.getMediationNetwork("af_rc_max_age", 0L);
    }

    private AFi1vSDK getCurrencyIso4217Code() {
        String monetizationNetwork = this.getMediationNetwork.getMonetizationNetwork("af_remote_config", (String) null);
        if (monetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFh1vSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFi1vSDK(new String(Base64.decode(monetizationNetwork, 2), Charset.defaultCharset()));
        } catch (Exception e6) {
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e6, true);
            return null;
        }
    }
}
