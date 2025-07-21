package L3;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;

/* renamed from: L3.x0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0555x0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3308a;

    /* renamed from: b, reason: collision with root package name */
    public u5.i f3309b;

    public C0555x0(Context context) {
        try {
            x5.u.f(context);
            this.f3309b = x5.u.c().g(v5.a.f19662g).a("PLAY_BILLING_LIBRARY", zzlk.class, u5.c.b("proto"), new u5.h() { // from class: L3.w0
                @Override // u5.h
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            this.f3308a = true;
        }
    }

    public final void a(zzlk zzlkVar) {
        if (this.f3308a) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f3309b.a(u5.d.f(zzlkVar));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }
}
