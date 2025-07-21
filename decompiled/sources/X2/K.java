package X2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import e3.InterfaceC1269a;
import f3.InterfaceC1292b;
import g3.AbstractC1384p;
import g3.C1366A;
import g3.C1367B;
import h3.C1461c;
import i3.InterfaceC1511b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f6130s = W2.k.i("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f6131a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6132b;

    /* renamed from: c, reason: collision with root package name */
    public List f6133c;

    /* renamed from: d, reason: collision with root package name */
    public WorkerParameters.a f6134d;

    /* renamed from: e, reason: collision with root package name */
    public f3.u f6135e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.c f6136f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1511b f6137g;

    /* renamed from: i, reason: collision with root package name */
    public androidx.work.a f6139i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1269a f6140j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f6141k;

    /* renamed from: l, reason: collision with root package name */
    public f3.v f6142l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1292b f6143m;

    /* renamed from: n, reason: collision with root package name */
    public List f6144n;

    /* renamed from: o, reason: collision with root package name */
    public String f6145o;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f6148r;

    /* renamed from: h, reason: collision with root package name */
    public c.a f6138h = c.a.a();

    /* renamed from: p, reason: collision with root package name */
    public C1461c f6146p = C1461c.t();

    /* renamed from: q, reason: collision with root package name */
    public final C1461c f6147q = C1461c.t();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D6.g f6149a;

        public a(D6.g gVar) {
            this.f6149a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f6147q.isCancelled()) {
                return;
            }
            try {
                this.f6149a.get();
                W2.k.e().a(K.f6130s, "Starting work for " + K.this.f6135e.f14119c);
                K k6 = K.this;
                k6.f6147q.r(k6.f6136f.n());
            } catch (Throwable th) {
                K.this.f6147q.q(th);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6151a;

        public b(String str) {
            this.f6151a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) K.this.f6147q.get();
                    if (aVar == null) {
                        W2.k.e().c(K.f6130s, K.this.f6135e.f14119c + " returned a null result. Treating it as a failure.");
                    } else {
                        W2.k.e().a(K.f6130s, K.this.f6135e.f14119c + " returned a " + aVar + ".");
                        K.this.f6138h = aVar;
                    }
                    K.this.i();
                } catch (InterruptedException e6) {
                    e = e6;
                    W2.k.e().d(K.f6130s, this.f6151a + " failed because it threw an exception/error", e);
                    K.this.i();
                } catch (CancellationException e7) {
                    W2.k.e().g(K.f6130s, this.f6151a + " was cancelled", e7);
                    K.this.i();
                } catch (ExecutionException e8) {
                    e = e8;
                    W2.k.e().d(K.f6130s, this.f6151a + " failed because it threw an exception/error", e);
                    K.this.i();
                }
            } catch (Throwable th) {
                K.this.i();
                throw th;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Context f6153a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.work.c f6154b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1269a f6155c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1511b f6156d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.work.a f6157e;

        /* renamed from: f, reason: collision with root package name */
        public WorkDatabase f6158f;

        /* renamed from: g, reason: collision with root package name */
        public f3.u f6159g;

        /* renamed from: h, reason: collision with root package name */
        public List f6160h;

        /* renamed from: i, reason: collision with root package name */
        public final List f6161i;

        /* renamed from: j, reason: collision with root package name */
        public WorkerParameters.a f6162j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, InterfaceC1511b interfaceC1511b, InterfaceC1269a interfaceC1269a, WorkDatabase workDatabase, f3.u uVar, List list) {
            this.f6153a = context.getApplicationContext();
            this.f6156d = interfaceC1511b;
            this.f6155c = interfaceC1269a;
            this.f6157e = aVar;
            this.f6158f = workDatabase;
            this.f6159g = uVar;
            this.f6161i = list;
        }

        public K b() {
            return new K(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f6162j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f6160h = list;
            return this;
        }
    }

    public K(c cVar) {
        this.f6131a = cVar.f6153a;
        this.f6137g = cVar.f6156d;
        this.f6140j = cVar.f6155c;
        f3.u uVar = cVar.f6159g;
        this.f6135e = uVar;
        this.f6132b = uVar.f14117a;
        this.f6133c = cVar.f6160h;
        this.f6134d = cVar.f6162j;
        this.f6136f = cVar.f6154b;
        this.f6139i = cVar.f6157e;
        WorkDatabase workDatabase = cVar.f6158f;
        this.f6141k = workDatabase;
        this.f6142l = workDatabase.J();
        this.f6143m = this.f6141k.E();
        this.f6144n = cVar.f6161i;
    }

    public static /* synthetic */ void a(K k6, D6.g gVar) {
        if (k6.f6147q.isCancelled()) {
            gVar.cancel(true);
        }
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f6132b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public D6.g c() {
        return this.f6146p;
    }

    public f3.m d() {
        return f3.x.a(this.f6135e);
    }

    public f3.u e() {
        return this.f6135e;
    }

    public final void f(c.a aVar) {
        if (aVar instanceof c.a.C0154c) {
            W2.k.e().f(f6130s, "Worker result SUCCESS for " + this.f6145o);
            if (this.f6135e.j()) {
                k();
                return;
            } else {
                p();
                return;
            }
        }
        if (aVar instanceof c.a.b) {
            W2.k.e().f(f6130s, "Worker result RETRY for " + this.f6145o);
            j();
            return;
        }
        W2.k.e().f(f6130s, "Worker result FAILURE for " + this.f6145o);
        if (this.f6135e.j()) {
            k();
        } else {
            o();
        }
    }

    public void g() {
        this.f6148r = true;
        q();
        this.f6147q.cancel(true);
        if (this.f6136f != null && this.f6147q.isCancelled()) {
            this.f6136f.o();
            return;
        }
        W2.k.e().a(f6130s, "WorkSpec " + this.f6135e + " is already done. Not interrupting.");
    }

    public final void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f6142l.m(str2) != W2.u.CANCELLED) {
                this.f6142l.p(W2.u.FAILED, str2);
            }
            linkedList.addAll(this.f6143m.b(str2));
        }
    }

    public void i() {
        if (!q()) {
            this.f6141k.e();
            try {
                W2.u m6 = this.f6142l.m(this.f6132b);
                this.f6141k.I().a(this.f6132b);
                if (m6 == null) {
                    l(false);
                } else if (m6 == W2.u.RUNNING) {
                    f(this.f6138h);
                } else if (!m6.b()) {
                    j();
                }
                this.f6141k.B();
                this.f6141k.i();
            } catch (Throwable th) {
                this.f6141k.i();
                throw th;
            }
        }
        List list = this.f6133c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).e(this.f6132b);
            }
            u.b(this.f6139i, this.f6141k, this.f6133c);
        }
    }

    public final void j() {
        this.f6141k.e();
        try {
            this.f6142l.p(W2.u.ENQUEUED, this.f6132b);
            this.f6142l.q(this.f6132b, System.currentTimeMillis());
            this.f6142l.c(this.f6132b, -1L);
            this.f6141k.B();
        } finally {
            this.f6141k.i();
            l(true);
        }
    }

    public final void k() {
        this.f6141k.e();
        try {
            this.f6142l.q(this.f6132b, System.currentTimeMillis());
            this.f6142l.p(W2.u.ENQUEUED, this.f6132b);
            this.f6142l.o(this.f6132b);
            this.f6142l.b(this.f6132b);
            this.f6142l.c(this.f6132b, -1L);
            this.f6141k.B();
        } finally {
            this.f6141k.i();
            l(false);
        }
    }

    public final void l(boolean z6) {
        this.f6141k.e();
        try {
            if (!this.f6141k.J().j()) {
                AbstractC1384p.a(this.f6131a, RescheduleReceiver.class, false);
            }
            if (z6) {
                this.f6142l.p(W2.u.ENQUEUED, this.f6132b);
                this.f6142l.c(this.f6132b, -1L);
            }
            if (this.f6135e != null && this.f6136f != null && this.f6140j.d(this.f6132b)) {
                this.f6140j.c(this.f6132b);
            }
            this.f6141k.B();
            this.f6141k.i();
            this.f6146p.p(Boolean.valueOf(z6));
        } catch (Throwable th) {
            this.f6141k.i();
            throw th;
        }
    }

    public final void m() {
        W2.u m6 = this.f6142l.m(this.f6132b);
        if (m6 == W2.u.RUNNING) {
            W2.k.e().a(f6130s, "Status for " + this.f6132b + " is RUNNING; not doing any work and rescheduling for later execution");
            l(true);
            return;
        }
        W2.k.e().a(f6130s, "Status for " + this.f6132b + " is " + m6 + " ; not doing any work");
        l(false);
    }

    public final void n() {
        androidx.work.b b6;
        if (q()) {
            return;
        }
        this.f6141k.e();
        try {
            f3.u uVar = this.f6135e;
            if (uVar.f14118b != W2.u.ENQUEUED) {
                m();
                this.f6141k.B();
                W2.k.e().a(f6130s, this.f6135e.f14119c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((uVar.j() || this.f6135e.i()) && System.currentTimeMillis() < this.f6135e.c()) {
                W2.k.e().a(f6130s, String.format("Delaying execution for %s because it is being executed before schedule.", this.f6135e.f14119c));
                l(true);
                this.f6141k.B();
                return;
            }
            this.f6141k.B();
            this.f6141k.i();
            if (this.f6135e.j()) {
                b6 = this.f6135e.f14121e;
            } else {
                W2.h b7 = this.f6139i.f().b(this.f6135e.f14120d);
                if (b7 == null) {
                    W2.k.e().c(f6130s, "Could not create Input Merger " + this.f6135e.f14120d);
                    o();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f6135e.f14121e);
                arrayList.addAll(this.f6142l.r(this.f6132b));
                b6 = b7.b(arrayList);
            }
            androidx.work.b bVar = b6;
            UUID fromString = UUID.fromString(this.f6132b);
            List list = this.f6144n;
            WorkerParameters.a aVar = this.f6134d;
            f3.u uVar2 = this.f6135e;
            WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, uVar2.f14127k, uVar2.f(), this.f6139i.d(), this.f6137g, this.f6139i.n(), new C1367B(this.f6141k, this.f6137g), new C1366A(this.f6141k, this.f6140j, this.f6137g));
            if (this.f6136f == null) {
                this.f6136f = this.f6139i.n().b(this.f6131a, this.f6135e.f14119c, workerParameters);
            }
            androidx.work.c cVar = this.f6136f;
            if (cVar == null) {
                W2.k.e().c(f6130s, "Could not create Worker " + this.f6135e.f14119c);
                o();
                return;
            }
            if (cVar.k()) {
                W2.k.e().c(f6130s, "Received an already-used Worker " + this.f6135e.f14119c + "; Worker Factory should return new instances");
                o();
                return;
            }
            this.f6136f.m();
            if (!r()) {
                m();
                return;
            }
            if (q()) {
                return;
            }
            g3.z zVar = new g3.z(this.f6131a, this.f6135e, this.f6136f, workerParameters.b(), this.f6137g);
            this.f6137g.a().execute(zVar);
            final D6.g b8 = zVar.b();
            this.f6147q.c(new Runnable() { // from class: X2.J
                @Override // java.lang.Runnable
                public final void run() {
                    K.a(K.this, b8);
                }
            }, new g3.v());
            b8.c(new a(b8), this.f6137g.a());
            this.f6147q.c(new b(this.f6145o), this.f6137g.b());
        } finally {
            this.f6141k.i();
        }
    }

    public void o() {
        this.f6141k.e();
        try {
            h(this.f6132b);
            this.f6142l.h(this.f6132b, ((c.a.C0153a) this.f6138h).e());
            this.f6141k.B();
        } finally {
            this.f6141k.i();
            l(false);
        }
    }

    public final void p() {
        this.f6141k.e();
        try {
            this.f6142l.p(W2.u.SUCCEEDED, this.f6132b);
            this.f6142l.h(this.f6132b, ((c.a.C0154c) this.f6138h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f6143m.b(this.f6132b)) {
                if (this.f6142l.m(str) == W2.u.BLOCKED && this.f6143m.c(str)) {
                    W2.k.e().f(f6130s, "Setting status to enqueued for " + str);
                    this.f6142l.p(W2.u.ENQUEUED, str);
                    this.f6142l.q(str, currentTimeMillis);
                }
            }
            this.f6141k.B();
            this.f6141k.i();
            l(false);
        } catch (Throwable th) {
            this.f6141k.i();
            l(false);
            throw th;
        }
    }

    public final boolean q() {
        if (!this.f6148r) {
            return false;
        }
        W2.k.e().a(f6130s, "Work interrupted for " + this.f6145o);
        if (this.f6142l.m(this.f6132b) == null) {
            l(false);
        } else {
            l(!r0.b());
        }
        return true;
    }

    public final boolean r() {
        boolean z6;
        this.f6141k.e();
        try {
            if (this.f6142l.m(this.f6132b) == W2.u.ENQUEUED) {
                this.f6142l.p(W2.u.RUNNING, this.f6132b);
                this.f6142l.s(this.f6132b);
                z6 = true;
            } else {
                z6 = false;
            }
            this.f6141k.B();
            this.f6141k.i();
            return z6;
        } catch (Throwable th) {
            this.f6141k.i();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6145o = b(this.f6144n);
        n();
    }
}
