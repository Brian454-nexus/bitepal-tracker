package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1vSDK {
    public static boolean getMonetizationNetwork(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int monetizationNetwork = AFc1vSDK.getMonetizationNetwork(str);
        int monetizationNetwork2 = AFc1vSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> revenue = AFe1zSDK.getRevenue(str2);
        return (monetizationNetwork2 == -1 || currencyIso4217Code != null) ? revenue != null ? ((Number) revenue.getFirst()).intValue() <= monetizationNetwork && monetizationNetwork <= ((Number) revenue.getSecond()).intValue() : currencyIso4217Code != null && ((Number) currencyIso4217Code.getFirst()).intValue() <= monetizationNetwork && monetizationNetwork <= ((Number) currencyIso4217Code.getSecond()).intValue() : monetizationNetwork2 == monetizationNetwork;
    }
}
