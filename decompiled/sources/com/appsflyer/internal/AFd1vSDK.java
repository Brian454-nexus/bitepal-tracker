package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFd1vSDK {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AFa1zSDK {

        @Nullable
        public final String AFAdRevenueData;
        public final float getCurrencyIso4217Code;

        public AFa1zSDK(float f6, @Nullable String str) {
            this.getCurrencyIso4217Code = f6;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.compare(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) == 0 && Intrinsics.areEqual(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.getCurrencyIso4217Code) * 31;
            String str = this.AFAdRevenueData;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getCurrencyIso4217Code + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    @NotNull
    AFa1zSDK AFAdRevenueData(@NotNull Context context);
}
