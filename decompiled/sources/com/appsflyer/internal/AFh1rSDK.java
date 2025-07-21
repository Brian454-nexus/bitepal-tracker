package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1rSDK extends AFh1uSDK {
    private final boolean getCurrencyIso4217Code;

    @NotNull
    private final AFd1kSDK getMonetizationNetwork;

    public AFh1rSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getMonetizationNetwork = aFd1kSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, boolean z6) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z6) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("D", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z9) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("E", getRevenue(str, aFh1vSDK));
        }
        if (z9) {
            this.getMonetizationNetwork.copydefault().getRevenue(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("F", getRevenue(str, aFh1vSDK));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, boolean z6) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z6) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("I", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, boolean z6) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z6) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("V", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, boolean z6) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z6) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("W", getRevenue(str, aFh1vSDK));
        }
    }
}
