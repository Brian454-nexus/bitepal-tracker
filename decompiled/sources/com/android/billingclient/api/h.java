package com.android.billingclient.api;

import L3.AbstractC0543r0;
import L3.InterfaceC0517e;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzkg;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0517e f11930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f11931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, Handler handler, InterfaceC0517e interfaceC0517e) {
        super(handler);
        this.f11930a = interfaceC0517e;
        this.f11931b = bVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i6, Bundle bundle) {
        d.a c6 = d.c();
        c6.c(i6);
        if (i6 != 0) {
            if (bundle == null) {
                this.f11931b.L0(this.f11930a, m.f11961k, 73, null);
                return;
            } else {
                c6.b(zze.zzh(bundle, "BillingClient"));
                int i7 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.f11931b.W(AbstractC0543r0.c(i7 != 0 ? zzkg.zza(i7) : 23, 16, c6.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.f11930a.a(c6.a());
    }
}
