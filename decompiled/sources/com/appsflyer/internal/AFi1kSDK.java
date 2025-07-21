package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFi1kSDK implements AFi1mSDK {

    @Nullable
    private String getMediationNetwork;

    private static String getRevenue(Activity activity) {
        Uri s_ = AFc1bSDK.s_(activity != null ? activity.getIntent() : null);
        String obj = s_ != null ? s_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getRevenue(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final void AFAdRevenueData(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = getRevenue(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    @NotNull
    public final String getCurrencyIso4217Code(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    @Nullable
    public final String getMediationNetwork(@Nullable Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        return (str == null || str.length() == 0) ? getRevenue(activity) : str;
    }

    private static boolean getRevenue(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }
}
