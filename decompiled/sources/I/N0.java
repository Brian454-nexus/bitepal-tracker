package I;

import I.B0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class N0 implements B0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f2313b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2312a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f2314c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2315d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2316e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f2317f = new CopyOnWriteArraySet();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a b(Throwable th) {
            return new C0434j(th);
        }

        public abstract Throwable a();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f2318h = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final Executor f2319a;

        /* renamed from: b, reason: collision with root package name */
        public final B0.a f2320b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference f2322d;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f2321c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        public Object f2323e = f2318h;

        /* renamed from: f, reason: collision with root package name */
        public int f2324f = -1;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2325g = false;

        public b(AtomicReference atomicReference, Executor executor, B0.a aVar) {
            this.f2322d = atomicReference;
            this.f2319a = executor;
            this.f2320b = aVar;
        }

        public void a() {
            this.f2321c.set(false);
        }

        public void b(int i6) {
            synchronized (this) {
                try {
                    if (this.f2321c.get()) {
                        if (i6 <= this.f2324f) {
                            return;
                        }
                        this.f2324f = i6;
                        if (this.f2325g) {
                            return;
                        }
                        this.f2325g = true;
                        try {
                            this.f2319a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f2325g = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f2321c.get()) {
                        this.f2325g = false;
                        return;
                    }
                    Object obj = this.f2322d.get();
                    int i6 = this.f2324f;
                    while (true) {
                        if (!Objects.equals(this.f2323e, obj)) {
                            this.f2323e = obj;
                            if (obj instanceof a) {
                                this.f2320b.onError(((a) obj).a());
                            } else {
                                this.f2320b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i6 == this.f2324f || !this.f2321c.get()) {
                                    break;
                                }
                                obj = this.f2322d.get();
                                i6 = this.f2324f;
                            } finally {
                            }
                        }
                    }
                    this.f2325g = false;
                } finally {
                }
            }
        }
    }

    public N0(Object obj, boolean z6) {
        if (!z6) {
            this.f2313b = new AtomicReference(obj);
        } else {
            y0.g.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f2313b = new AtomicReference(a.b((Throwable) obj));
        }
    }

    @Override // I.B0
    public void b(Executor executor, B0.a aVar) {
        b bVar;
        synchronized (this.f2312a) {
            c(aVar);
            bVar = new b(this.f2313b, executor, aVar);
            this.f2316e.put(aVar, bVar);
            this.f2317f.add(bVar);
        }
        bVar.b(0);
    }

    public final void c(B0.a aVar) {
        b bVar = (b) this.f2316e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f2317f.remove(bVar);
        }
    }

    @Override // I.B0
    public D6.g d() {
        Object obj = this.f2313b.get();
        return obj instanceof a ? N.f.f(((a) obj).a()) : N.f.h(obj);
    }

    @Override // I.B0
    public void e(B0.a aVar) {
        synchronized (this.f2312a) {
            c(aVar);
        }
    }

    public void f(Object obj) {
        g(obj);
    }

    public final void g(Object obj) {
        Iterator it;
        int i6;
        synchronized (this.f2312a) {
            try {
                if (Objects.equals(this.f2313b.getAndSet(obj), obj)) {
                    return;
                }
                int i7 = this.f2314c + 1;
                this.f2314c = i7;
                if (this.f2315d) {
                    return;
                }
                this.f2315d = true;
                Iterator it2 = this.f2317f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((b) it2.next()).b(i7);
                    } else {
                        synchronized (this.f2312a) {
                            try {
                                if (this.f2314c == i7) {
                                    this.f2315d = false;
                                    return;
                                } else {
                                    it = this.f2317f.iterator();
                                    i6 = this.f2314c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i7 = i6;
                    }
                }
            } finally {
            }
        }
    }
}
