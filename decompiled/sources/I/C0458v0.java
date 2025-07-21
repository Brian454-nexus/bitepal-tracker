package I;

import I.B0;
import I.C0458v0;
import android.os.SystemClock;
import androidx.lifecycle.C1067t;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.AbstractC1728c;

/* renamed from: I.v0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0458v0 implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1067t f2559a = new C1067t();

    /* renamed from: b, reason: collision with root package name */
    public final Map f2560b = new HashMap();

    /* renamed from: I.v0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements androidx.lifecycle.u {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f2561a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        public final B0.a f2562b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f2563c;

        public a(Executor executor, B0.a aVar) {
            this.f2563c = executor;
            this.f2562b = aVar;
        }

        public static /* synthetic */ void b(a aVar, b bVar) {
            if (aVar.f2561a.get()) {
                if (bVar.a()) {
                    aVar.f2562b.a(bVar.d());
                } else {
                    y0.g.f(bVar.c());
                    aVar.f2562b.onError(bVar.c());
                }
            }
        }

        public void c() {
            this.f2561a.set(false);
        }

        @Override // androidx.lifecycle.u
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(final b bVar) {
            this.f2563c.execute(new Runnable() { // from class: I.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C0458v0.a.b(C0458v0.a.this, bVar);
                }
            });
        }
    }

    /* renamed from: I.v0$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2564a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f2565b;

        public b(Object obj, Throwable th) {
            this.f2564a = obj;
            this.f2565b = th;
        }

        public static b b(Object obj) {
            return new b(obj, null);
        }

        public boolean a() {
            return this.f2565b == null;
        }

        public Throwable c() {
            return this.f2565b;
        }

        public Object d() {
            if (a()) {
                return this.f2564a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f2564a;
            } else {
                str = "Error: " + this.f2565b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    public static /* synthetic */ Object c(final C0458v0 c0458v0, final AbstractC1728c.a aVar) {
        c0458v0.getClass();
        M.c.e().execute(new Runnable() { // from class: I.t0
            @Override // java.lang.Runnable
            public final void run() {
                C0458v0.g(C0458v0.this, aVar);
            }
        });
        return c0458v0 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void g(C0458v0 c0458v0, AbstractC1728c.a aVar) {
        b bVar = (b) c0458v0.f2559a.f();
        if (bVar == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (bVar.a()) {
            aVar.c(bVar.d());
        } else {
            y0.g.f(bVar.c());
            aVar.f(bVar.c());
        }
    }

    public static /* synthetic */ void h(C0458v0 c0458v0, a aVar, a aVar2) {
        if (aVar != null) {
            c0458v0.f2559a.n(aVar);
        }
        c0458v0.f2559a.j(aVar2);
    }

    @Override // I.B0
    public void b(Executor executor, B0.a aVar) {
        synchronized (this.f2560b) {
            try {
                final a aVar2 = (a) this.f2560b.get(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                }
                final a aVar3 = new a(executor, aVar);
                this.f2560b.put(aVar, aVar3);
                M.c.e().execute(new Runnable() { // from class: I.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0458v0.h(C0458v0.this, aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.B0
    public D6.g d() {
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: I.q0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C0458v0.c(C0458v0.this, aVar);
            }
        });
    }

    @Override // I.B0
    public void e(B0.a aVar) {
        synchronized (this.f2560b) {
            try {
                final a aVar2 = (a) this.f2560b.remove(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                    M.c.e().execute(new Runnable() { // from class: I.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0458v0.this.f2559a.n(aVar2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(Object obj) {
        this.f2559a.m(b.b(obj));
    }
}
