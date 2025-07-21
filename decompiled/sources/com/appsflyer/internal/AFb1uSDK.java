package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFb1uSDK {
    @Nullable
    String AFAdRevenueData(@NotNull AFb1kSDK aFb1kSDK);

    boolean AFAdRevenueData(@Nullable String str);

    void getCurrencyIso4217Code();

    @NotNull
    List<AFb1kSDK> getMediationNetwork();

    void getMonetizationNetwork();
}
