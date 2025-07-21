package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1qSDK {

    @NotNull
    public final Context getCurrencyIso4217Code;

    @Nullable
    public AFi1rSDK getMediationNetwork;

    public AFi1qSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getCurrencyIso4217Code = context;
    }
}
