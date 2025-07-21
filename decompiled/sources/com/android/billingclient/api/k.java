package com.android.billingclient.api;

import L3.AbstractC0543r0;
import L3.C0527j;
import L3.InterfaceC0529k;
import L3.InterfaceC0545s0;
import L3.Z;
import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.zzad;
import com.google.android.gms.internal.play_billing.zze;
import org.json.JSONException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k extends zzad {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0529k f11936a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0545s0 f11937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11938c;

    public /* synthetic */ k(InterfaceC0529k interfaceC0529k, InterfaceC0545s0 interfaceC0545s0, int i6, Z z6) {
        this.f11936a = interfaceC0529k;
        this.f11937b = interfaceC0545s0;
        this.f11938c = i6;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            InterfaceC0545s0 interfaceC0545s0 = this.f11937b;
            d dVar = m.f11961k;
            interfaceC0545s0.e(AbstractC0543r0.b(63, 13, dVar), this.f11938c);
            this.f11936a.a(dVar, null);
            return;
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        String zzh = zze.zzh(bundle, "BillingClient");
        d.a c6 = d.c();
        c6.c(zzb);
        c6.b(zzh);
        if (zzb != 0) {
            zze.zzl("BillingClient", "getBillingConfig() failed. Response code: " + zzb);
            d a6 = c6.a();
            this.f11937b.e(AbstractC0543r0.b(23, 13, a6), this.f11938c);
            this.f11936a.a(a6, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            zze.zzl("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            c6.c(6);
            d a7 = c6.a();
            this.f11937b.e(AbstractC0543r0.b(64, 13, a7), this.f11938c);
            this.f11936a.a(a7, null);
            return;
        }
        try {
            this.f11936a.a(c6.a(), new C0527j(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e6) {
            zze.zzm("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e6);
            InterfaceC0545s0 interfaceC0545s02 = this.f11937b;
            d dVar2 = m.f11961k;
            interfaceC0545s02.e(AbstractC0543r0.b(65, 13, dVar2), this.f11938c);
            this.f11936a.a(dVar2, null);
        }
    }
}
