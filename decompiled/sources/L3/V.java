package L3;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzah;
import com.google.android.gms.internal.play_billing.zze;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class V extends zzah {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0515d f3242a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0545s0 f3243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3244c;

    public /* synthetic */ V(InterfaceC0515d interfaceC0515d, InterfaceC0545s0 interfaceC0545s0, int i6, Z z6) {
        this.f3242a = interfaceC0515d;
        this.f3243b = interfaceC0545s0;
        this.f3244c = i6;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            InterfaceC0545s0 interfaceC0545s0 = this.f3243b;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.m.f11961k;
            interfaceC0545s0.e(AbstractC0543r0.b(67, 14, dVar), this.f3244c);
            this.f3242a.a(dVar);
            return;
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        com.android.billingclient.api.d a6 = com.android.billingclient.api.m.a(zzb, zze.zzh(bundle, "BillingClient"));
        if (zzb != 0) {
            zze.zzl("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + zzb);
            this.f3243b.e(AbstractC0543r0.b(23, 14, a6), this.f3244c);
        }
        this.f3242a.a(a6);
    }
}
