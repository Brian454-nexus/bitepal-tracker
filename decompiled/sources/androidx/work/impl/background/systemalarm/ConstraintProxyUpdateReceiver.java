package androidx.work.impl.background.systemalarm;

import W2.k;
import X2.E;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import g3.AbstractC1384p;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10278a = k.i("ConstrntProxyUpdtRecvr");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f10279a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10280b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f10281c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f10279a = intent;
            this.f10280b = context;
            this.f10281c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f10279a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f10279a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f10279a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f10279a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k.e().a(ConstraintProxyUpdateReceiver.f10278a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                AbstractC1384p.a(this.f10280b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                AbstractC1384p.a(this.f10280b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                AbstractC1384p.a(this.f10280b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                AbstractC1384p.a(this.f10280b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f10281c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            E.m(context).s().c(new a(intent, context, goAsync()));
            return;
        }
        k.e().a(f10278a, "Ignoring unknown action " + action);
    }
}
