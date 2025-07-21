package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1gSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    @NotNull
    public final String AFAdRevenueData() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.constructor-impl((String) obj2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (String) (Result.isFailure-impl(obj) ? "" : obj);
    }
}
