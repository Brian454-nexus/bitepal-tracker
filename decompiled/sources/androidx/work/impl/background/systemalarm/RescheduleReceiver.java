package androidx.work.impl.background.systemalarm;

import W2.k;
import X2.E;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10283a = k.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        k.e().a(f10283a, "Received intent " + intent);
        try {
            E.m(context).w(goAsync());
        } catch (IllegalStateException e6) {
            k.e().d(f10283a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }
}
