package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1wSDK implements AFh1xSDK {

    @Nullable
    private AFh1tSDK AFAdRevenueData;

    @Nullable
    private AFh1ySDK getMediationNetwork;

    @Nullable
    private AFh1rSDK getMonetizationNetwork;

    @NotNull
    private final AFd1kSDK getRevenue;

    public AFh1wSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void AFAdRevenueData() {
        AFh1ySDK aFh1ySDK = this.getMediationNetwork;
        if (aFh1ySDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1uSDK.v$default(aFLogger, AFh1vSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1ySDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void component1() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1ySDK();
        }
        AFh1ySDK aFh1ySDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFh1ySDK);
        aFLogger.registerClient(aFh1ySDK);
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void getCurrencyIso4217Code() {
        AFh1rSDK aFh1rSDK = this.getMonetizationNetwork;
        if (aFh1rSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1uSDK.v$default(aFLogger, AFh1vSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1rSDK);
            this.getMonetizationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMonetizationNetwork == null) {
            this.getMonetizationNetwork = new AFh1rSDK(this.getRevenue);
        }
        AFh1rSDK aFh1rSDK = this.getMonetizationNetwork;
        Intrinsics.checkNotNull(aFh1rSDK);
        aFLogger.registerClient(aFh1rSDK);
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void getMonetizationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFh1tSDK(this.getRevenue);
        }
        AFh1tSDK aFh1tSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFh1tSDK);
        aFLogger.registerClient(aFh1tSDK);
    }

    @Override // com.appsflyer.internal.AFh1xSDK
    public final void getRevenue() {
        AFh1tSDK aFh1tSDK = this.AFAdRevenueData;
        if (aFh1tSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1uSDK.v$default(aFLogger, AFh1vSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1tSDK);
            this.AFAdRevenueData = null;
        }
    }
}
