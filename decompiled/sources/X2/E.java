package X2;

import W2.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import g3.AbstractRunnableC1370b;
import g3.C1385q;
import i3.InterfaceC1511b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class E extends W2.v {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6096k = W2.k.i("WorkManagerImpl");

    /* renamed from: l, reason: collision with root package name */
    public static E f6097l = null;

    /* renamed from: m, reason: collision with root package name */
    public static E f6098m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final Object f6099n = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Context f6100a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.work.a f6101b;

    /* renamed from: c, reason: collision with root package name */
    public WorkDatabase f6102c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1511b f6103d;

    /* renamed from: e, reason: collision with root package name */
    public List f6104e;

    /* renamed from: f, reason: collision with root package name */
    public r f6105f;

    /* renamed from: g, reason: collision with root package name */
    public C1385q f6106g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6107h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f6108i;

    /* renamed from: j, reason: collision with root package name */
    public final d3.n f6109j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public E(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b) {
        this(context, aVar, interfaceC1511b, context.getResources().getBoolean(W2.r.f5592a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (X2.E.f6098m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        X2.E.f6098m = new X2.E(r4, r5, new i3.C1512c(r5.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        X2.E.f6097l = X2.E.f6098m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = X2.E.f6099n
            monitor-enter(r0)
            X2.E r1 = X2.E.f6097l     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            X2.E r2 = X2.E.f6098m     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            X2.E r1 = X2.E.f6098m     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            X2.E r1 = new X2.E     // Catch: java.lang.Throwable -> L14
            i3.c r2 = new i3.c     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.m()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            X2.E.f6098m = r1     // Catch: java.lang.Throwable -> L14
        L30:
            X2.E r4 = X2.E.f6098m     // Catch: java.lang.Throwable -> L14
            X2.E.f6097l = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.E.f(android.content.Context, androidx.work.a):void");
    }

    public static E l() {
        synchronized (f6099n) {
            try {
                E e6 = f6097l;
                if (e6 != null) {
                    return e6;
                }
                return f6098m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static E m(Context context) {
        E l6;
        synchronized (f6099n) {
            try {
                l6 = l();
                if (l6 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l6;
    }

    public void A(v vVar) {
        this.f6103d.c(new g3.u(this, vVar, false));
    }

    @Override // W2.v
    public W2.n a(String str) {
        AbstractRunnableC1370b c6 = AbstractRunnableC1370b.c(str, this, true);
        this.f6103d.c(c6);
        return c6.d();
    }

    @Override // W2.v
    public W2.n c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    @Override // W2.v
    public W2.n d(String str, W2.d dVar, W2.p pVar) {
        return dVar == W2.d.UPDATE ? I.c(this, str, pVar) : i(str, dVar, pVar).a();
    }

    public W2.n g(UUID uuid) {
        AbstractRunnableC1370b b6 = AbstractRunnableC1370b.b(uuid, this);
        this.f6103d.c(b6);
        return b6.d();
    }

    public List h(Context context, androidx.work.a aVar, d3.n nVar) {
        return Arrays.asList(u.a(context, this), new Y2.b(context, aVar, nVar, this));
    }

    public x i(String str, W2.d dVar, W2.p pVar) {
        return new x(this, str, dVar == W2.d.KEEP ? W2.e.KEEP : W2.e.REPLACE, Collections.singletonList(pVar));
    }

    public Context j() {
        return this.f6100a;
    }

    public androidx.work.a k() {
        return this.f6101b;
    }

    public C1385q n() {
        return this.f6106g;
    }

    public r o() {
        return this.f6105f;
    }

    public List p() {
        return this.f6104e;
    }

    public d3.n q() {
        return this.f6109j;
    }

    public WorkDatabase r() {
        return this.f6102c;
    }

    public InterfaceC1511b s() {
        return this.f6103d;
    }

    public final void t(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6100a = applicationContext;
        this.f6101b = aVar;
        this.f6103d = interfaceC1511b;
        this.f6102c = workDatabase;
        this.f6104e = list;
        this.f6105f = rVar;
        this.f6106g = new C1385q(workDatabase);
        this.f6107h = false;
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f6103d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void u() {
        synchronized (f6099n) {
            try {
                this.f6107h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f6108i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f6108i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        a3.e.b(j());
        r().J().u();
        u.b(k(), r(), p());
    }

    public void w(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f6099n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f6108i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f6108i = pendingResult;
                if (this.f6107h) {
                    pendingResult.finish();
                    this.f6108i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(v vVar) {
        y(vVar, null);
    }

    public void y(v vVar, WorkerParameters.a aVar) {
        this.f6103d.c(new g3.t(this, vVar, aVar));
    }

    public void z(f3.m mVar) {
        this.f6103d.c(new g3.u(this, new v(mVar), true));
    }

    public E(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b, boolean z6) {
        this(context, aVar, interfaceC1511b, WorkDatabase.D(context.getApplicationContext(), interfaceC1511b.b(), z6));
    }

    public E(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        W2.k.h(new k.a(aVar.j()));
        d3.n nVar = new d3.n(applicationContext, interfaceC1511b);
        this.f6109j = nVar;
        List h6 = h(applicationContext, aVar, nVar);
        t(context, aVar, interfaceC1511b, workDatabase, h6, new r(context, aVar, interfaceC1511b, workDatabase, h6));
    }
}
