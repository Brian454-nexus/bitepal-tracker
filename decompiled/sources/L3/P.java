package L3;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zze;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class P extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0541q f3220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(com.android.billingclient.api.b bVar, Handler handler, InterfaceC0541q interfaceC0541q) {
        super(handler);
        this.f3220a = interfaceC0541q;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i6, Bundle bundle) {
        this.f3220a.a(zze.zzg(bundle, "BillingClient"));
    }
}
