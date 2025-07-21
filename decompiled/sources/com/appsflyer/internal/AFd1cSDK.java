package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1cSDK implements AFd1bSDK {

    @NotNull
    private final AFd1hSDK getMediationNetwork;

    public AFd1cSDK(@NotNull AFd1hSDK aFd1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        this.getMediationNetwork = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void getMediationNetwork(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1aSDK(bArr, map, 2000).AFAdRevenueData()) {
            this.getMediationNetwork.AFAdRevenueData();
        }
    }
}
