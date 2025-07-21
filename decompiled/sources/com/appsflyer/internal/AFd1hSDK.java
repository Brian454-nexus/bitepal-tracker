package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFd1hSDK {
    boolean AFAdRevenueData();

    @Nullable
    String getCurrencyIso4217Code(@NotNull Throwable th, @NotNull String str);

    boolean getCurrencyIso4217Code(@NotNull String... strArr);

    int getMediationNetwork();

    @NotNull
    List<ExceptionInfo> getMonetizationNetwork();

    void getMonetizationNetwork(int i6, int i7);
}
