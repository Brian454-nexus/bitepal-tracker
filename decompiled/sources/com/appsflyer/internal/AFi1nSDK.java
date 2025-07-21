package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nNetworkDataCollectorApiPre21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApiPre21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApiPre21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1747#2,3:44\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollectorApiPre21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApiPre21\n*L\n36#1:44,3\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1nSDK extends AFi1rSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1nSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @NotNull
    public final String getCurrencyIso4217Code() {
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        if (connectivityManager != null) {
            if (AFi1rSDK.x_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1rSDK.x_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final boolean getRevenue() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            if (list != null) {
                if (!list.isEmpty()) {
                }
                return false;
            }
            for (NetworkInterface networkInterface : list) {
                if (networkInterface.isUp() && Intrinsics.areEqual(networkInterface.getName(), "tun0")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e6) {
            AFLogger.afErrorLog("Failed collecting ivc data", e6);
            return false;
        }
    }
}
