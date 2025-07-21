package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1rSDK {

    @Nullable
    private final PackageManager AFAdRevenueData;

    @NotNull
    private final Map<String, Object> getMonetizationNetwork;

    @NotNull
    private final String getRevenue;

    public AFg1rSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.getMonetizationNetwork = new LinkedHashMap();
        Context context = aFd1nSDK.AFAdRevenueData;
        this.AFAdRevenueData = context != null ? context.getPackageManager() : null;
        String packageName = aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.getRevenue = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> getRevenue() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getMonetizationNetwork
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
            android.content.pm.PackageManager r0 = r5.AFAdRevenueData     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.lang.String r1 = r5.getRevenue     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.getMonetizationNetwork     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = "installer_package"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r0 = move-exception
            java.lang.String r1 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L6b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getMonetizationNetwork
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r5.getRevenue
            android.content.pm.PackageManager r3 = r5.AFAdRevenueData
            if (r3 == 0) goto L66
            android.content.pm.InstallSourceInfo r2 = com.appsflyer.internal.v.a(r3, r2)
            if (r2 == 0) goto L66
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r3 = com.appsflyer.internal.w.a(r2)
            if (r3 == 0) goto L50
            java.lang.String r4 = "initiating_package"
            r1.put(r4, r3)
        L50:
            java.lang.String r3 = com.appsflyer.internal.x.a(r2)
            if (r3 == 0) goto L5b
            java.lang.String r4 = "installing_package"
            r1.put(r4, r3)
        L5b:
            java.lang.String r2 = com.appsflyer.internal.y.a(r2)
            if (r2 == 0) goto L66
            java.lang.String r3 = "originating_package"
            r1.put(r3, r2)
        L66:
            java.lang.String r2 = "install_source_info"
            r0.put(r2, r1)
        L6b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getMonetizationNetwork
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.getRevenue():java.util.Map");
    }
}
