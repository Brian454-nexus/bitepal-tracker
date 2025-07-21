package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFg1uSDK {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface AFa1vSDK {
        void AFAdRevenueData(@NonNull String str, @NonNull String str2);

        void getCurrencyIso4217Code(String str, Exception exc);
    }

    public final boolean getMediationNetwork(long j6, @NonNull Context context, @NonNull final AFa1vSDK aFa1vSDK) {
        try {
            AppsFlyerLVL.checkLicense(j6, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1uSDK.4
                public final void onLvlFailure(Exception exc) {
                    aFa1vSDK.getCurrencyIso4217Code("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1vSDK.AFAdRevenueData(str, str2);
                    } else if (str2 == null) {
                        aFa1vSDK.getCurrencyIso4217Code("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1vSDK.getCurrencyIso4217Code("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
