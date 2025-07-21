package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1aSDK;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1jSDK {
    public static String getMediationNetwork;
    public final AFd1rSDK AFAdRevenueData;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFb1rSDK.getRevenue);
        getMediationNetwork = sb.toString();
    }

    public AFg1jSDK(@NonNull Context context) {
        this.AFAdRevenueData = AFb1rSDK.getRevenue().getMonetizationNetwork(context);
    }

    public static void getMediationNetwork(String str) {
        AFd1kSDK monetizationNetwork = AFb1rSDK.getRevenue().getMonetizationNetwork();
        AFf1cSDK aFf1cSDK = new AFf1cSDK(str, monetizationNetwork);
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(new AFe1aSDK.AnonymousClass2(aFf1cSDK));
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFb1qSDK.c_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static boolean getRevenue(@NonNull AFd1rSDK aFd1rSDK) {
        return aFd1rSDK.getMediationNetwork("sentRegisterRequestToAF");
    }

    public final AFg1mSDK getMediationNetwork() {
        String string;
        String string2;
        String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork("afUninstallToken", (String) null);
        long mediationNetwork = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_received_time", 0L);
        boolean mediationNetwork2 = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued");
        this.AFAdRevenueData.getRevenue("afUninstallToken_queued", false);
        if (monetizationNetwork == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            monetizationNetwork = string2.split(com.amazon.a.a.o.b.f.f11248a)[r0.length - 1];
        }
        if (mediationNetwork == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(com.amazon.a.a.o.b.f.f11248a);
            if (split.length >= 2) {
                try {
                    mediationNetwork = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (monetizationNetwork != null) {
            return new AFg1mSDK(monetizationNetwork, mediationNetwork, mediationNetwork2);
        }
        return null;
    }
}
