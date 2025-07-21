package L3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;

/* renamed from: L3.m0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ServiceConnectionC0534m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.l f3295a;

    public /* synthetic */ ServiceConnectionC0534m0(com.android.billingclient.api.l lVar, AbstractC0536n0 abstractC0536n0) {
        this.f3295a = lVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        com.android.billingclient.api.l.H1(this.f3295a, zzau.zzc(iBinder));
        com.android.billingclient.api.l.I1(this.f3295a, 2);
        com.android.billingclient.api.l.v1(this.f3295a, 26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        com.android.billingclient.api.l.H1(this.f3295a, null);
        com.android.billingclient.api.l.I1(this.f3295a, 0);
    }
}
