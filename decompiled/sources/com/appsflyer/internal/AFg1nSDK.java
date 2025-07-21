package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1nSDK implements AFg1qSDK {

    @NotNull
    private final Context getMediationNetwork;

    @NotNull
    private final AppsFlyerProperties getRevenue;

    public AFg1nSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getMediationNetwork = context;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    @Nullable
    public final AFg1oSDK getCurrencyIso4217Code() {
        String string;
        if (!Boolean.parseBoolean(this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getMediationNetwork);
            int i6 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i7 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i8 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i9 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i6 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1oSDK(i8, i6, i7, i9, str);
        } catch (Exception e6) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.DMA, "TCF data collection exception", e6, false, false, false, false, 120, null);
            return null;
        }
    }
}
