package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFb1cSDK {
    void AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String str2);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(@NotNull String str, int i6, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String... strArr);

    void getMonetizationNetwork();

    void getRevenue();

    void getRevenue(@NotNull Throwable th);

    void k_(@Nullable String str, @Nullable PackageManager packageManager);
}
