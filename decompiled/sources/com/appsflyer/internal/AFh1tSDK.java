package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nExcManagerClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n+ 2 StringExtensions.kt\ncom/appsflyer/StringExtensionsKt\n*L\n1#1,26:1\n36#2:27\n*S KotlinDebug\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n*L\n21#1:27\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1tSDK extends AFh1uSDK {

    @NotNull
    private final AFd1kSDK getRevenue;

    public AFh1tSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z8) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.getRevenue.afErrorLog().getRevenue(th, withTag$SDK_prodRelease(str, aFh1vSDK));
        }
    }
}
