package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1mSDK {

    @Nullable
    public final Intent getCurrencyIso4217Code;

    @Nullable
    public final String getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFh1mSDK(@NotNull Activity activity, @NotNull AFi1mSDK aFi1mSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        this.getCurrencyIso4217Code = activity.getIntent();
        this.getRevenue = aFi1mSDK.getCurrencyIso4217Code(activity);
        this.getMonetizationNetwork = aFi1mSDK.getMediationNetwork(activity);
    }
}
