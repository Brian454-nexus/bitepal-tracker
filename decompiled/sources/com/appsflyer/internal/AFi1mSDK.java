package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFi1mSDK {
    void AFAdRevenueData(@NotNull Activity activity);

    @NotNull
    String getCurrencyIso4217Code(@Nullable Activity activity);

    @Nullable
    String getMediationNetwork(@Nullable Activity activity);
}
