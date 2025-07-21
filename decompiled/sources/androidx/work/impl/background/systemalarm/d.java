package androidx.work.impl.background.systemalarm;

import W2.k;
import X2.E;
import X2.InterfaceC0821e;
import X2.r;
import X2.w;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import f3.m;
import g3.C1368C;
import i3.InterfaceC1511b;
import i3.InterfaceExecutorC1510a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements InterfaceC0821e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f10310k = k.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10311a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1511b f10312b;

    /* renamed from: c, reason: collision with root package name */
    public final C1368C f10313c;

    /* renamed from: d, reason: collision with root package name */
    public final r f10314d;

    /* renamed from: e, reason: collision with root package name */
    public final E f10315e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f10316f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10317g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f10318h;

    /* renamed from: i, reason: collision with root package name */
    public c f10319i;

    /* renamed from: j, reason: collision with root package name */
    public w f10320j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f10317g) {
                d dVar = d.this;
                dVar.f10318h = (Intent) dVar.f10317g.get(0);
            }
            Intent intent = d.this.f10318h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f10318h.getIntExtra("KEY_START_ID", 0);
                k e6 = k.e();
                String str = d.f10310k;
                e6.a(str, "Processing command " + d.this.f10318h + ", " + intExtra);
                PowerManager.WakeLock b6 = g3.w.b(d.this.f10311a, action + " (" + intExtra + ")");
                try {
                    k.e().a(str, "Acquiring operation wake lock (" + action + ") " + b6);
                    b6.acquire();
                    d dVar2 = d.this;
                    dVar2.f10316f.o(dVar2.f10318h, intExtra, dVar2);
                    k.e().a(str, "Releasing operation wake lock (" + action + ") " + b6);
                    b6.release();
                    d.this.f10312b.a().execute(new RunnableC0155d(d.this));
                } catch (Throwable th) {
                    try {
                        k e7 = k.e();
                        String str2 = d.f10310k;
                        e7.d(str2, "Unexpected error in onHandleIntent", th);
                        k.e().a(str2, "Releasing operation wake lock (" + action + ") " + b6);
                        b6.release();
                        d.this.f10312b.a().execute(new RunnableC0155d(d.this));
                    } catch (Throwable th2) {
                        k.e().a(d.f10310k, "Releasing operation wake lock (" + action + ") " + b6);
                        b6.release();
                        d.this.f10312b.a().execute(new RunnableC0155d(d.this));
                        throw th2;
                    }
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f10322a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f10323b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10324c;

        public b(d dVar, Intent intent, int i6) {
            this.f10322a = dVar;
            this.f10323b = intent;
            this.f10324c = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10322a.a(this.f10323b, this.f10324c);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class RunnableC0155d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f10325a;

        public RunnableC0155d(d dVar) {
            this.f10325a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10325a.d();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(Intent intent, int i6) {
        k e6 = k.e();
        String str = f10310k;
        e6.a(str, "Adding command " + intent + " (" + i6 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i6);
        synchronized (this.f10317g) {
            try {
                boolean isEmpty = this.f10317g.isEmpty();
                this.f10317g.add(intent);
                if (isEmpty) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // X2.InterfaceC0821e
    public void b(m mVar, boolean z6) {
        this.f10312b.a().execute(new b(this, androidx.work.impl.background.systemalarm.a.d(this.f10311a, mVar, z6), 0));
    }

    public final void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void d() {
        k e6 = k.e();
        String str = f10310k;
        e6.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f10317g) {
            try {
                if (this.f10318h != null) {
                    k.e().a(str, "Removing command " + this.f10318h);
                    if (!((Intent) this.f10317g.remove(0)).equals(this.f10318h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f10318h = null;
                }
                InterfaceExecutorC1510a b6 = this.f10312b.b();
                if (!this.f10316f.n() && this.f10317g.isEmpty() && !b6.c()) {
                    k.e().a(str, "No more commands & intents.");
                    c cVar = this.f10319i;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f10317g.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r e() {
        return this.f10314d;
    }

    public InterfaceC1511b f() {
        return this.f10312b;
    }

    public E g() {
        return this.f10315e;
    }

    public C1368C h() {
        return this.f10313c;
    }

    public final boolean i(String str) {
        c();
        synchronized (this.f10317g) {
            try {
                Iterator it = this.f10317g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        k.e().a(f10310k, "Destroying SystemAlarmDispatcher");
        this.f10314d.l(this);
        this.f10319i = null;
    }

    public final void k() {
        c();
        PowerManager.WakeLock b6 = g3.w.b(this.f10311a, "ProcessCommand");
        try {
            b6.acquire();
            this.f10315e.s().c(new a());
        } finally {
            b6.release();
        }
    }

    public void l(c cVar) {
        if (this.f10319i != null) {
            k.e().c(f10310k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f10319i = cVar;
        }
    }

    public d(Context context, r rVar, E e6) {
        Context applicationContext = context.getApplicationContext();
        this.f10311a = applicationContext;
        this.f10320j = new w();
        this.f10316f = new androidx.work.impl.background.systemalarm.a(applicationContext, this.f10320j);
        e6 = e6 == null ? E.m(context) : e6;
        this.f10315e = e6;
        this.f10313c = new C1368C(e6.k().k());
        rVar = rVar == null ? e6.o() : rVar;
        this.f10314d = rVar;
        this.f10312b = e6.s();
        rVar.g(this);
        this.f10317g = new ArrayList();
        this.f10318h = null;
    }
}
