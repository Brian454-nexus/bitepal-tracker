package L3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.zzao;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class W extends zzao {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3247a;

    /* renamed from: b, reason: collision with root package name */
    public final ResultReceiver f3248b;

    public /* synthetic */ W(WeakReference weakReference, ResultReceiver resultReceiver, Z z6) {
        this.f3247a = weakReference;
        this.f3248b = resultReceiver;
    }

    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.f3248b;
        if (resultReceiver == null) {
            zze.zzl("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f3247a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f3248b.send(0, null);
            zze.zzl("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f3248b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e6) {
            this.f3248b.send(0, null);
            zze.zzm("BillingClient", "Exception caught while launching intent for in-app messaging.", e6);
        }
    }
}
