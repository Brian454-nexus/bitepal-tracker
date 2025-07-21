package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFk1wSDK {
    public String getMediationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1wSDK(@NonNull Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
