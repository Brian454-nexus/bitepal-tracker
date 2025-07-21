package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFc1bSDK {
    public static Uri s_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1iSDK aFj1iSDK = new AFj1iSDK(intent);
        Uri uri = (Uri) aFj1iSDK.J_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String AFAdRevenueData = aFj1iSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
        if (AFAdRevenueData != null) {
            return Uri.parse(AFAdRevenueData);
        }
        return null;
    }
}
