package L3;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* renamed from: L3.j0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0528j0 implements zzej {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f3285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.l f3287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3288d;

    public C0528j0(com.android.billingclient.api.l lVar, int i6, Consumer consumer, Runnable runnable) {
        this.f3288d = i6;
        this.f3285a = consumer;
        this.f3286b = runnable;
        this.f3287c = lVar;
    }

    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f3287c.D1(114, 28, com.android.billingclient.api.m.f11950G);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f3287c.D1(107, 28, com.android.billingclient.api.m.f11950G);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f3286b.run();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean A12;
        com.android.billingclient.api.d B12;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        com.android.billingclient.api.l lVar = this.f3287c;
        A12 = com.android.billingclient.api.l.A1(intValue);
        if (!A12) {
            this.f3286b.run();
        } else {
            B12 = lVar.B1(this.f3288d, num.intValue());
            this.f3285a.accept(B12);
        }
    }
}
