package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface AFd1eSDK {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z6);
    }

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFa1vSDK aFa1vSDK);

    void getMonetizationNetwork();

    void getRevenue(@NonNull Throwable th, @NonNull String str);
}
