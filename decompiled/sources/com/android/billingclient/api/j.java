package com.android.billingclient.api;

import L3.Z;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j extends zzab {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11934a;

    /* renamed from: b, reason: collision with root package name */
    public final ResultReceiver f11935b;

    public /* synthetic */ j(WeakReference weakReference, ResultReceiver resultReceiver, Z z6) {
        this.f11934a = weakReference;
        this.f11935b = resultReceiver;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            this.f11935b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zze.zzl("BillingClient", "Response bundle doesn't contain a response code");
            this.f11935b.send(6, bundle);
            return;
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        if (zzb != 0) {
            zze.zzl("BillingClient", "Unable to launch intent for alternative billing only dialog" + zzb);
            this.f11935b.send(zzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            zze.zzk("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f11935b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f11934a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f11935b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e6) {
            zze.zzm("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e6);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e6.getClass().getName(), zzbf.zzb(e6.getMessage())));
            this.f11935b.send(6, bundle2);
        }
    }
}
