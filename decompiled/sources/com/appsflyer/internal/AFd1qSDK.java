package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1qSDK {
    private static String getMediationNetwork = "331";
    public final AFd1tSDK AFAdRevenueData;
    private final Executor component2;
    private Bundle component4 = null;
    public String getCurrencyIso4217Code = "";
    public final AFd1nSDK getMonetizationNetwork;
    public final AFd1rSDK getRevenue;

    public AFd1qSDK(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK, AFd1tSDK aFd1tSDK, Executor executor) {
        this.getMonetizationNetwork = aFd1nSDK;
        this.getRevenue = aFd1rSDK;
        this.AFAdRevenueData = aFd1tSDK;
        this.component2 = executor;
    }

    public static String AFAdRevenueData() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String areAllFieldsValid() {
        StringBuilder sb = new StringBuilder("version: 6.15.2 (build ");
        sb.append(getMediationNetwork);
        sb.append(")");
        return sb.toString();
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String getMediationNetwork() {
        return UUID.randomUUID().toString();
    }

    public static boolean getMonetizationNetwork(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e6) {
            AFLogger.INSTANCE.e(AFh1vSDK.PUBLIC_API, "Could not check if app is pre installed", e6);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    @NonNull
    public static String getRevenue() {
        return "6.15.2";
    }

    public final boolean component1() {
        return !this.AFAdRevenueData.getMonetizationNetwork();
    }

    public final String component4() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getRevenue("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean AFAdRevenueData(String str, boolean z6) {
        String revenue = getRevenue(str);
        return revenue != null ? Boolean.parseBoolean(revenue) : z6;
    }

    public final String getRevenue(String str) {
        Object obj;
        try {
            if (this.component4 == null) {
                this.component4 = ((PackageItemInfo) this.getMonetizationNetwork.AFAdRevenueData.getPackageManager().getApplicationInfo(this.getMonetizationNetwork.AFAdRevenueData.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component4;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final String AFAdRevenueData(Context context) {
        try {
            return new AFb1mSDK(context, this.component2).getMediationNetwork();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }

    public final String getMonetizationNetwork() {
        AdvertisingIdData advertisingIdData = this.AFAdRevenueData.component4;
        AFb1tSDK aFb1tSDK = advertisingIdData != null ? new AFb1tSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
        if (aFb1tSDK != null) {
            return aFb1tSDK.getRevenue;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    public final String AFAdRevenueData(String str) {
        try {
            int identifier = this.getMonetizationNetwork.AFAdRevenueData.getResources().getIdentifier(str, "string", this.getMonetizationNetwork.AFAdRevenueData.getPackageName());
            if (identifier != 0) {
                return this.getMonetizationNetwork.AFAdRevenueData.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e6) {
            StringBuilder sb = new StringBuilder("Could not load string resource!");
            sb.append(e6.getMessage());
            AFLogger.afErrorLog(sb.toString(), e6);
            return null;
        }
    }
}
