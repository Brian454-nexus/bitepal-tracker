package androidx.work.impl.foreground;

import W2.k;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractServiceC1063o;
import androidx.work.impl.foreground.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SystemForegroundService extends AbstractServiceC1063o implements a.b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f10331f = k.i("SystemFgService");

    /* renamed from: g, reason: collision with root package name */
    public static SystemForegroundService f10332g = null;

    /* renamed from: b, reason: collision with root package name */
    public Handler f10333b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10334c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.work.impl.foreground.a f10335d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f10336e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10337a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f10338b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10339c;

        public a(int i6, Notification notification, int i7) {
            this.f10337a = i6;
            this.f10338b = notification;
            this.f10339c = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                e.a(SystemForegroundService.this, this.f10337a, this.f10338b, this.f10339c);
            } else if (i6 >= 29) {
                d.a(SystemForegroundService.this, this.f10337a, this.f10338b, this.f10339c);
            } else {
                SystemForegroundService.this.startForeground(this.f10337a, this.f10338b);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10341a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f10342b;

        public b(int i6, Notification notification) {
            this.f10341a = i6;
            this.f10342b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f10336e.notify(this.f10341a, this.f10342b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10344a;

        public c(int i6) {
            this.f10344a = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f10336e.cancel(this.f10344a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static void a(Service service, int i6, Notification notification, int i7) {
            service.startForeground(i6, notification, i7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {
        public static void a(Service service, int i6, Notification notification, int i7) {
            try {
                service.startForeground(i6, notification, i7);
            } catch (ForegroundServiceStartNotAllowedException e6) {
                k.e().l(SystemForegroundService.f10331f, "Unable to start foreground service", e6);
            }
        }
    }

    private void f() {
        this.f10333b = new Handler(Looper.getMainLooper());
        this.f10336e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f10335d = aVar;
        aVar.n(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i6, int i7, Notification notification) {
        this.f10333b.post(new a(i6, notification, i7));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i6, Notification notification) {
        this.f10333b.post(new b(i6, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i6) {
        this.f10333b.post(new c(i6));
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public void onCreate() {
        super.onCreate();
        f10332g = this;
        f();
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f10335d.l();
    }

    @Override // androidx.lifecycle.AbstractServiceC1063o, android.app.Service
    public int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        if (this.f10334c) {
            k.e().f(f10331f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f10335d.l();
            f();
            this.f10334c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f10335d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f10334c = true;
        k.e().a(f10331f, "All commands completed.");
        stopForeground(true);
        f10332g = null;
        stopSelf();
    }
}
