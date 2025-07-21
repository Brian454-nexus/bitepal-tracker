package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1wSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1xSDK implements AFd1wSDK {

    @Nullable
    private AFd1uSDK AFAdRevenueData;

    @NotNull
    private final AFc1kSDK getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFi1mSDK getMonetizationNetwork;

    @NotNull
    private final Executor getRevenue;

    public AFd1xSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1mSDK aFi1mSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        this.getRevenue = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getMonetizationNetwork = aFi1mSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void AFAdRevenueData() {
        AFd1wSDK.AFa1tSDK aFa1tSDK;
        AFd1uSDK aFd1uSDK = this.AFAdRevenueData;
        if (aFd1uSDK == null || (aFa1tSDK = aFd1uSDK.getRevenue) == null) {
            return;
        }
        aFa1tSDK.getRevenue();
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean getMediationNetwork() {
        return this.AFAdRevenueData != null;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getRevenue(@NotNull Context context, @NotNull AFd1wSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFd1uSDK aFd1uSDK = new AFd1uSDK(this.getRevenue, this.getMediationNetwork, this.getCurrencyIso4217Code, this.getMonetizationNetwork, aFa1tSDK);
        this.AFAdRevenueData = aFd1uSDK;
        if (context instanceof Activity) {
            aFd1uSDK.onActivityResumed((Activity) context);
        }
        Application f_ = AFb1qSDK.f_(context);
        if (f_ != null) {
            f_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }
}
