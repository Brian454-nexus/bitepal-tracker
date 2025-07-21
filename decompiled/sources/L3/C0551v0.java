package L3;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

/* renamed from: L3.v0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0551v0 implements InterfaceC0545s0 {

    /* renamed from: b, reason: collision with root package name */
    public zzku f3302b;

    /* renamed from: c, reason: collision with root package name */
    public final C0555x0 f3303c;

    public C0551v0(Context context, zzku zzkuVar) {
        this.f3303c = new C0555x0(context);
        this.f3302b = zzkuVar;
    }

    @Override // L3.InterfaceC0545s0
    public final void a(zzkl zzklVar) {
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f3302b);
            zzc.zzn(zzklVar);
            this.f3303c.a(zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void b(zzlu zzluVar) {
        if (zzluVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f3302b);
            zzc.zzq(zzluVar);
            this.f3303c.a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void c(zzlq zzlqVar) {
        try {
            C0555x0 c0555x0 = this.f3303c;
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f3302b);
            zzc.zzp(zzlqVar);
            c0555x0.a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void d(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f3302b);
            zzc.zza(zzjzVar);
            this.f3303c.a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void e(zzjz zzjzVar, int i6) {
        try {
            zzks zzn = this.f3302b.zzn();
            zzn.zza(i6);
            this.f3302b = zzn.zzf();
            d(zzjzVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void f(zzkd zzkdVar, int i6) {
        try {
            zzks zzn = this.f3302b.zzn();
            zzn.zza(i6);
            this.f3302b = zzn.zzf();
            g(zzkdVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // L3.InterfaceC0545s0
    public final void g(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.f3302b);
            zzc.zzm(zzkdVar);
            this.f3303c.a((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }
}
