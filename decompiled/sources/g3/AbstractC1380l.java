package g3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import f3.C1294d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1380l {
    public static final void c(Context context, A2.g sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i6 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i7 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.h();
            try {
                sqLiteDatabase.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i6)});
                sqLiteDatabase.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i7)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.B();
            } finally {
                sqLiteDatabase.M();
            }
        }
    }

    public static final int d(WorkDatabase workDatabase, String str) {
        Long a6 = workDatabase.F().a(str);
        int longValue = a6 != null ? (int) a6.longValue() : 0;
        e(workDatabase, str, longValue != Integer.MAX_VALUE ? longValue + 1 : 0);
        return longValue;
    }

    public static final void e(WorkDatabase workDatabase, String str, int i6) {
        workDatabase.F().b(new C1294d(str, Long.valueOf(i6)));
    }
}
