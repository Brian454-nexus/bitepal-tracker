package com.appsflyer.internal.connector.purcahse;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1v implements Application.ActivityLifecycleCallbacks {
    private boolean InAppPurchaseEvent;

    @NotNull
    private final ScheduledExecutorService getOneTimePurchaseOfferDetails;

    @NotNull
    private final AFPurchaseConnectorA1y getPackageName;
    private long getQuantity;
    private boolean toJsonMap;

    public AFPurchaseConnectorA1v(@NotNull AFPurchaseConnectorA1y aFPurchaseConnectorA1y, @NotNull ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(aFPurchaseConnectorA1y, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.getPackageName = aFPurchaseConnectorA1y;
        this.getOneTimePurchaseOfferDetails = scheduledExecutorService;
        this.getQuantity = 500L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getQuantity(AFPurchaseConnectorA1v aFPurchaseConnectorA1v) {
        Intrinsics.checkNotNullParameter(aFPurchaseConnectorA1v, "");
        if (aFPurchaseConnectorA1v.InAppPurchaseEvent && aFPurchaseConnectorA1v.toJsonMap) {
            aFPurchaseConnectorA1v.InAppPurchaseEvent = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.toJsonMap = true;
        try {
            this.getOneTimePurchaseOfferDetails.schedule(new Runnable() { // from class: com.appsflyer.internal.connector.purcahse.b
                @Override // java.lang.Runnable
                public final void run() {
                    AFPurchaseConnectorA1v.getQuantity(AFPurchaseConnectorA1v.this);
                }
            }, this.getQuantity, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.InAppPurchaseEvent) {
            try {
                this.getPackageName.toJsonMap();
            } catch (Exception e6) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e6, true);
            }
        }
        this.toJsonMap = false;
        this.InAppPurchaseEvent = true;
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
