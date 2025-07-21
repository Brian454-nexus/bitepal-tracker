package L3;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* renamed from: L3.r0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract /* synthetic */ class AbstractC0543r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3300a = 0;

    static {
        int i6 = InterfaceC0545s0.f3301a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i6 = zze.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjz b(int i6, int i7, com.android.billingclient.api.d dVar) {
        try {
            zzjx zzc = zzjz.zzc();
            zzke zzc2 = zzki.zzc();
            zzc2.zzn(dVar.b());
            zzc2.zzm(dVar.a());
            zzc2.zzo(i6);
            zzc.zza(zzc2);
            zzc.zzn(i7);
            return zzc.zzf();
        } catch (Exception e6) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }

    public static zzjz c(int i6, int i7, com.android.billingclient.api.d dVar, String str) {
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(dVar.b());
            zzc.zzm(dVar.a());
            zzc.zzo(i6);
            if (str != null) {
                zzc.zza(str);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(i7);
            return zzc2.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzkd d(int i6) {
        try {
            zzkb zzc = zzkd.zzc();
            zzc.zzn(i6);
            return zzc.zzf();
        } catch (Exception e6) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }
}
