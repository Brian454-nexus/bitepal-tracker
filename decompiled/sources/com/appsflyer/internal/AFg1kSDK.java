package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFg1kSDK {
    @Nullable
    Long AFAdRevenueData();

    void AFAdRevenueData(@NotNull AFa1oSDK aFa1oSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull AFa1oSDK aFa1oSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i6, int i7);

    void getMediationNetwork(@NotNull AFa1oSDK aFa1oSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull AFa1oSDK aFa1oSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map);
}
