package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1mSDK<T> {

    @NotNull
    public final Function0<T> getCurrencyIso4217Code;

    /* JADX WARN: Multi-variable type inference failed */
    public AFd1mSDK(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getCurrencyIso4217Code = function0;
    }
}
