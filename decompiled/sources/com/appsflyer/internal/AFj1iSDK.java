package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAFIntentWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n+ 2 MultiCatch.kt\ncom/appsflyer/internal/util/MultiCatchKt\n*L\n1#1,113:1\n16#2,7:114\n16#2,7:121\n*S KotlinDebug\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n*L\n84#1:114,7\n99#1:121,7\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFj1iSDK {

    @NotNull
    final Intent getMediationNetwork;

    public AFj1iSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t6, boolean z6) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        synchronized (this.getMediationNetwork) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                try {
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
                }
                if (!ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(th2.getClass()))) {
                    throw th2;
                }
                if (z6) {
                    obj3 = getCurrencyIso4217Code(function0, str, t6, false);
                } else {
                    AFLogger.afErrorLog(str, th2, false, false);
                    obj3 = t6;
                }
                obj2 = Result.constructor-impl(obj3);
                obj = obj2;
            }
            KClass[] kClassArr2 = {Reflection.getOrCreateKotlinClass(RuntimeException.class)};
            Throwable th4 = Result.exceptionOrNull-impl(obj);
            if (th4 != null) {
                try {
                } catch (Throwable th5) {
                    Result.Companion companion4 = Result.Companion;
                    obj4 = Result.constructor-impl(ResultKt.createFailure(th5));
                }
                if (!ArraysKt.contains(kClassArr2, Reflection.getOrCreateKotlinClass(th4.getClass()))) {
                    throw th4;
                }
                AFLogger.afErrorLog(str, th4, false, false);
                obj4 = Result.constructor-impl(t6);
                obj = (T) obj4;
            }
            ResultKt.throwOnFailure(obj);
        }
        return (T) obj;
    }

    @Nullable
    public final String AFAdRevenueData(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new Function0<String>() { // from class: com.appsflyer.internal.AFj1iSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1iSDK.this.getMediationNetwork.getStringExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final <T extends Parcelable> T J_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new Function0<T>() { // from class: com.appsflyer.internal.AFj1iSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: L_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1iSDK.this.getMediationNetwork.getParcelableExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent K_(@NotNull final String str, final long j6) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1iSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: M_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1iSDK.this.getMediationNetwork.putExtra(str, j6);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMediationNetwork(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1iSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1iSDK.this.getMediationNetwork.hasExtra(str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
