package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1fSDK implements AFg1gSDK {

    @NotNull
    private final AFg1dSDK getCurrencyIso4217Code;

    public AFg1fSDK(@NotNull AFg1dSDK aFg1dSDK) {
        Intrinsics.checkNotNullParameter(aFg1dSDK, "");
        this.getCurrencyIso4217Code = aFg1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean AFAdRevenueData(@NotNull AFg1hSDK aFg1hSDK) {
        Intrinsics.checkNotNullParameter(aFg1hSDK, "");
        if (aFg1hSDK.getGetRevenue()) {
            this.getCurrencyIso4217Code.AFAdRevenueData(aFg1hSDK);
        }
        return aFg1hSDK.getGetMediationNetwork();
    }
}
