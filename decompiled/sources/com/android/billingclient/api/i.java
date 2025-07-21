package com.android.billingclient.api;

import L3.InterfaceC0525i;
import L3.InterfaceC0545s0;
import L3.Z;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlu;
import java.util.concurrent.Callable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0525i f11932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f11933b;

    public /* synthetic */ i(b bVar, InterfaceC0525i interfaceC0525i, Z z6) {
        this.f11933b = bVar;
        this.f11932a = interfaceC0525i;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.i.a():java.lang.Object");
    }

    public final /* synthetic */ void b() {
        b.P(this.f11933b, 0);
        d dVar = m.f11964n;
        b.D0(this.f11933b, 24, 6, dVar);
        c(dVar);
    }

    public final void c(d dVar) {
        synchronized (b.e1(this.f11933b)) {
            try {
                if (b.Q(this.f11933b) == 3) {
                    return;
                }
                this.f11932a.onBillingSetupFinished(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if (b.A0(this.f11933b)) {
                InterfaceC0545s0 X02 = b.X0(this.f11933b);
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(122);
                zzc.zza(zzc2);
                X02.d((zzjz) zzc.zzf());
            } else {
                b.X0(this.f11933b).a(zzkl.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (b.e1(this.f11933b)) {
            if (b.Q(this.f11933b) != 3 && b.Q(this.f11933b) != 0) {
                b.P(this.f11933b, 0);
                b.o0(this.f11933b);
                this.f11932a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized (b.e1(this.f11933b)) {
            try {
                if (b.Q(this.f11933b) == 3) {
                    return;
                }
                b.L(this.f11933b, zzam.zzu(iBinder));
                b bVar = this.f11933b;
                if (b.t(bVar, new Callable() { // from class: L3.Q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        com.android.billingclient.api.i.this.a();
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: L3.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.android.billingclient.api.i.this.b();
                    }
                }, b.T0(bVar)) == null) {
                    b bVar2 = this.f11933b;
                    d Z02 = b.Z0(bVar2);
                    b.D0(bVar2, 25, 6, Z02);
                    c(Z02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (b.A0(this.f11933b)) {
                InterfaceC0545s0 X02 = b.X0(this.f11933b);
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(121);
                zzc.zza(zzc2);
                X02.d((zzjz) zzc.zzf());
            } else {
                b.X0(this.f11933b).b(zzlu.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (b.e1(this.f11933b)) {
            try {
                if (b.Q(this.f11933b) == 3) {
                    return;
                }
                b.P(this.f11933b, 0);
                this.f11932a.onBillingServiceDisconnected();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
