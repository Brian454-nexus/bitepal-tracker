package com.appsflyer.internal;

import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFh1zSDK {
    public static boolean getRevenue(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
