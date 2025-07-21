package com.amazon.device.drm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.a.e.b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ResponseReceiver extends BroadcastReceiver {
    private static final String TAG = "ResponseReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            d.d().a(context, intent);
        } catch (Exception e6) {
            b.b(TAG, "Error in onReceive: " + e6);
        }
    }
}
