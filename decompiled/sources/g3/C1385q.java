package g3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import f3.C1294d;

/* renamed from: g3.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1385q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f14881a;

    public C1385q(WorkDatabase workDatabase) {
        this.f14881a = workDatabase;
    }

    public static void c(Context context, A2.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j7 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.h();
            try {
                gVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                gVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j7)});
                sharedPreferences.edit().clear().apply();
                gVar.B();
            } finally {
                gVar.M();
            }
        }
    }

    public long a() {
        Long a6 = this.f14881a.F().a("last_force_stop_ms");
        if (a6 != null) {
            return a6.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long a6 = this.f14881a.F().a("reschedule_needed");
        return a6 != null && a6.longValue() == 1;
    }

    public void d(long j6) {
        this.f14881a.F().b(new C1294d("last_force_stop_ms", Long.valueOf(j6)));
    }

    public void e(boolean z6) {
        this.f14881a.F().b(new C1294d("reschedule_needed", z6));
    }
}
