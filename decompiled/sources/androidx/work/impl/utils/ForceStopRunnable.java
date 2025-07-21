package androidx.work.impl.utils;

import W2.k;
import X2.A;
import X2.E;
import a3.e;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import f3.r;
import f3.u;
import f3.v;
import g3.AbstractC1374f;
import g3.C1385q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f10359e = k.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f10360f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f10361a;

    /* renamed from: b, reason: collision with root package name */
    public final E f10362b;

    /* renamed from: c, reason: collision with root package name */
    public final C1385q f10363c;

    /* renamed from: d, reason: collision with root package name */
    public int f10364d = 0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10365a = k.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k.e().j(f10365a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, E e6) {
        this.f10361a = context.getApplicationContext();
        this.f10362b = e6;
        this.f10363c = e6.n();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i6) {
        return PendingIntent.getBroadcast(context, -1, c(context), i6);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d6 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f10360f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d6);
        }
    }

    public boolean a() {
        boolean i6 = e.i(this.f10361a, this.f10362b);
        WorkDatabase r6 = this.f10362b.r();
        v J6 = r6.J();
        r I6 = r6.I();
        r6.e();
        try {
            List<u> i7 = J6.i();
            boolean z6 = (i7 == null || i7.isEmpty()) ? false : true;
            if (z6) {
                for (u uVar : i7) {
                    J6.p(W2.u.ENQUEUED, uVar.f14117a);
                    J6.c(uVar.f14117a, -1L);
                }
            }
            I6.b();
            r6.B();
            r6.i();
            return z6 || i6;
        } catch (Throwable th) {
            r6.i();
            throw th;
        }
    }

    public void b() {
        boolean a6 = a();
        if (h()) {
            k.e().a(f10359e, "Rescheduling Workers.");
            this.f10362b.v();
            this.f10362b.n().e(false);
        } else if (e()) {
            k.e().a(f10359e, "Application was force-stopped, rescheduling.");
            this.f10362b.v();
            this.f10363c.d(System.currentTimeMillis());
        } else if (a6) {
            k.e().a(f10359e, "Found unfinished work, scheduling it.");
            X2.u.b(this.f10362b.k(), this.f10362b.r(), this.f10362b.p());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i6 = Build.VERSION.SDK_INT;
            PendingIntent d6 = d(this.f10361a, i6 >= 31 ? 570425344 : 536870912);
            if (i6 >= 30) {
                if (d6 != null) {
                    d6.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f10361a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a6 = this.f10363c.a();
                    for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                        ApplicationExitInfo a7 = AbstractC1374f.a(historicalProcessExitReasons.get(i7));
                        reason = a7.getReason();
                        if (reason == 10) {
                            timestamp = a7.getTimestamp();
                            if (timestamp >= a6) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d6 == null) {
                g(this.f10361a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e6) {
            e = e6;
            k.e().l(f10359e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e7) {
            e = e7;
            k.e().l(f10359e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a k6 = this.f10362b.k();
        if (TextUtils.isEmpty(k6.c())) {
            k.e().a(f10359e, "The default process name was not specified.");
            return true;
        }
        boolean b6 = g3.r.b(this.f10361a, k6);
        k.e().a(f10359e, "Is default app process = " + b6);
        return b6;
    }

    public boolean h() {
        return this.f10362b.n().b();
    }

    public void i(long j6) {
        try {
            Thread.sleep(j6);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i6;
        try {
            if (f()) {
                while (true) {
                    try {
                        A.d(this.f10361a);
                        k.e().a(f10359e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e6) {
                            i6 = this.f10364d + 1;
                            this.f10364d = i6;
                            if (i6 >= 3) {
                                k e7 = k.e();
                                String str = f10359e;
                                e7.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                                InterfaceC2343a e8 = this.f10362b.k().e();
                                if (e8 == null) {
                                    throw illegalStateException;
                                }
                                k.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                e8.accept(illegalStateException);
                            } else {
                                k.e().b(f10359e, "Retrying after " + (i6 * 300), e6);
                                i(((long) this.f10364d) * 300);
                            }
                        }
                        k.e().b(f10359e, "Retrying after " + (i6 * 300), e6);
                        i(((long) this.f10364d) * 300);
                    } catch (SQLiteException e9) {
                        k.e().c(f10359e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e9);
                        InterfaceC2343a e10 = this.f10362b.k().e();
                        if (e10 == null) {
                            throw illegalStateException2;
                        }
                        e10.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.f10362b.u();
        }
    }
}
