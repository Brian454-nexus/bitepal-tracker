package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static AlarmManager.AlarmClockInfo a(long j6, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j6, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static void a(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i6, j6, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i6, j6, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, long j6, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        a.b(alarmManager, a.a(j6, pendingIntent), pendingIntent2);
    }

    public static void b(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
        b.a(alarmManager, i6, j6, pendingIntent);
    }

    public static void c(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
        alarmManager.setExact(i6, j6, pendingIntent);
    }

    public static void d(AlarmManager alarmManager, int i6, long j6, PendingIntent pendingIntent) {
        b.b(alarmManager, i6, j6, pendingIntent);
    }
}
