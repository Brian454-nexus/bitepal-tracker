package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1pSDK {

    @NotNull
    public final String AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    public AFi1pSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMonetizationNetwork = z6;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork;
    }
}
