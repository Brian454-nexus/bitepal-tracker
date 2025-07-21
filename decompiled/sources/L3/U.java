package L3;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzx;
import org.json.JSONException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class U extends zzx {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0521g f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0545s0 f3238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3239c;

    public /* synthetic */ U(InterfaceC0521g interfaceC0521g, InterfaceC0545s0 interfaceC0545s0, int i6, Z z6) {
        this.f3237a = interfaceC0521g;
        this.f3238b = interfaceC0545s0;
        this.f3239c = i6;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            InterfaceC0545s0 interfaceC0545s0 = this.f3238b;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.m.f11961k;
            interfaceC0545s0.e(AbstractC0543r0.b(71, 15, dVar), this.f3239c);
            this.f3237a.a(dVar, null);
            return;
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        com.android.billingclient.api.d a6 = com.android.billingclient.api.m.a(zzb, zze.zzh(bundle, "BillingClient"));
        if (zzb != 0) {
            zze.zzl("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + zzb);
            this.f3238b.e(AbstractC0543r0.b(23, 15, a6), this.f3239c);
            this.f3237a.a(a6, null);
            return;
        }
        try {
            this.f3237a.a(a6, new C0519f(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e6) {
            zze.zzm("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e6);
            InterfaceC0545s0 interfaceC0545s02 = this.f3238b;
            com.android.billingclient.api.d dVar2 = com.android.billingclient.api.m.f11961k;
            interfaceC0545s02.e(AbstractC0543r0.b(72, 15, dVar2), this.f3239c);
            this.f3237a.a(dVar2, null);
        }
    }
}
