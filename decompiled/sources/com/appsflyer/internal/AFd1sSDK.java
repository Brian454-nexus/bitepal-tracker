package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1sSDK implements AFd1rSDK {

    @NotNull
    private final Lazy AFAdRevenueData;

    @NotNull
    private final AFd1mSDK<SharedPreferences> getMonetizationNetwork;

    public AFd1sSDK(@NotNull AFd1mSDK<SharedPreferences> aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.getMonetizationNetwork = aFd1mSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFd1sSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: t_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFd1sSDK.this.getMonetizationNetwork.getCurrencyIso4217Code.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMediationNetwork(@Nullable String str) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getBoolean(str, false);
        } catch (ClassCastException e6) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e6, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(@Nullable String str, boolean z6) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putBoolean(str, z6).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    @Nullable
    public final String getMonetizationNetwork(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getString(str, str2);
        } catch (ClassCastException e6) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e6, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(@Nullable String str, int i6) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putInt(str, i6).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final long getMediationNetwork(@Nullable String str, long j6) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getLong(str, j6);
        } catch (ClassCastException e6) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e6, false, false, false, false, 120, null);
            return j6;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(@Nullable String str) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getMonetizationNetwork(@Nullable String str, long j6) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putLong(str, j6).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final int getMediationNetwork(@Nullable String str, int i6) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getInt(str, i6);
        } catch (ClassCastException e6) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e6, false, false, false, false, 120, null);
            return i6;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.AFAdRevenueData.getValue()).contains(str);
    }
}
