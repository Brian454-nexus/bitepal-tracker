package Z2;

import W2.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f3.i;
import f3.j;
import f3.l;
import f3.m;
import g3.C1379k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7359a = k.i("Alarms");

    /* renamed from: Z2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0117a {
        public static void a(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
            alarmManager.setExact(i6, j6, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j G6 = workDatabase.G();
        i e6 = G6.e(mVar);
        if (e6 != null) {
            b(context, mVar, e6.f14092c);
            k.e().a(f7359a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            G6.b(mVar);
        }
    }

    public static void b(Context context, m mVar, int i6) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i6, androidx.work.impl.background.systemalarm.a.c(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        k.e().a(f7359a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i6 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j6) {
        j G6 = workDatabase.G();
        i e6 = G6.e(mVar);
        if (e6 != null) {
            b(context, mVar, e6.f14092c);
            d(context, mVar, e6.f14092c, j6);
        } else {
            int c6 = new C1379k(workDatabase).c();
            G6.c(l.a(mVar, c6));
            d(context, mVar, c6, j6);
        }
    }

    public static void d(Context context, m mVar, int i6, long j6) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i6, androidx.work.impl.background.systemalarm.a.c(context, mVar), 201326592);
        if (alarmManager != null) {
            C0117a.a(alarmManager, 0, j6, service);
        }
    }
}
