package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1wSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1uSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AFi1mSDK AFAdRevenueData;
    private boolean component2;
    private boolean component3;

    @NotNull
    private final Executor getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFc1kSDK getMonetizationNetwork;

    @NotNull
    final AFd1wSDK.AFa1tSDK getRevenue;

    public AFd1uSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1mSDK aFi1mSDK, @NotNull AFd1wSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.getCurrencyIso4217Code = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getMonetizationNetwork = aFc1kSDK;
        this.AFAdRevenueData = aFi1mSDK;
        this.getRevenue = aFa1tSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        if (aFd1uSDK.component2 && aFd1uSDK.component3) {
            aFd1uSDK.component2 = false;
            try {
                aFd1uSDK.getRevenue.getRevenue();
            } catch (Exception e6) {
                AFLogger.afErrorLog("Listener threw exception! ", e6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(final AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1uSDK.getMediationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(AFd1uSDK.this);
                }
            };
            AFd1wSDK.Companion companion = AFd1wSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1wSDK.Companion.getCurrencyIso4217Code(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1uSDK aFd1uSDK, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (!aFd1uSDK.component2) {
            try {
                aFd1uSDK.getRevenue.getMonetizationNetwork(aFh1mSDK);
            } catch (Exception e6) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e6, true);
            }
        }
        aFd1uSDK.component3 = false;
        aFd1uSDK.component2 = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1kSDK aFc1kSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1kSDK.getRevenue) {
            aFc1kSDK.getRevenue = intent;
        }
        this.AFAdRevenueData.AFAdRevenueData(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMonetizationNetwork(AFd1uSDK.this);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1mSDK aFh1mSDK = new AFh1mSDK(activity, this.AFAdRevenueData);
        this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getRevenue(AFd1uSDK.this, aFh1mSDK);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
