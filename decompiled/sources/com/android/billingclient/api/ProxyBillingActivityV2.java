package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import e.AbstractActivityC1216j;
import g.C1310a;
import g.g;
import h.C1397i;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC1216j {

    /* renamed from: a, reason: collision with root package name */
    public g.c f11811a;

    /* renamed from: b, reason: collision with root package name */
    public g.c f11812b;

    /* renamed from: c, reason: collision with root package name */
    public ResultReceiver f11813c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f11814d;

    @Override // e.AbstractActivityC1216j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11811a = registerForActivityResult(new C1397i(), new g.b() { // from class: L3.C0
            @Override // g.b
            public final void a(Object obj) {
                ProxyBillingActivityV2.this.q((C1310a) obj);
            }
        });
        this.f11812b = registerForActivityResult(new C1397i(), new g.b() { // from class: L3.D0
            @Override // g.b
            public final void a(Object obj) {
                ProxyBillingActivityV2.this.r((C1310a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f11813c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f11814d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f11813c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f11811a.a(new g.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f11814d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f11812b.a(new g.a(pendingIntent2).a());
        }
    }

    @Override // e.AbstractActivityC1216j, androidx.core.app.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f11813c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f11814d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void q(C1310a c1310a) {
        Intent a6 = c1310a.a();
        int b6 = zze.zzf(a6, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f11813c;
        if (resultReceiver != null) {
            resultReceiver.send(b6, a6 == null ? null : a6.getExtras());
        }
        if (c1310a.c() != -1 || b6 != 0) {
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + c1310a.c() + " and billing's responseCode: " + b6);
        }
        finish();
    }

    public final void r(C1310a c1310a) {
        Intent a6 = c1310a.a();
        int b6 = zze.zzf(a6, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f11814d;
        if (resultReceiver != null) {
            resultReceiver.send(b6, a6 == null ? null : a6.getExtras());
        }
        if (c1310a.c() != -1 || b6 != 0) {
            zze.zzl("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(c1310a.c()), Integer.valueOf(b6)));
        }
        finish();
    }
}
