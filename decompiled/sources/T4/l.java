package T4;

import T4.h;
import T4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o5.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements h.b, a.f {

    /* renamed from: z, reason: collision with root package name */
    public static final c f5049z = new c();

    /* renamed from: a, reason: collision with root package name */
    public final e f5050a;

    /* renamed from: b, reason: collision with root package name */
    public final o5.c f5051b;

    /* renamed from: c, reason: collision with root package name */
    public final p.a f5052c;

    /* renamed from: d, reason: collision with root package name */
    public final y0.d f5053d;

    /* renamed from: e, reason: collision with root package name */
    public final c f5054e;

    /* renamed from: f, reason: collision with root package name */
    public final m f5055f;

    /* renamed from: g, reason: collision with root package name */
    public final W4.a f5056g;

    /* renamed from: h, reason: collision with root package name */
    public final W4.a f5057h;

    /* renamed from: i, reason: collision with root package name */
    public final W4.a f5058i;

    /* renamed from: j, reason: collision with root package name */
    public final W4.a f5059j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f5060k;

    /* renamed from: l, reason: collision with root package name */
    public R4.f f5061l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5062m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5063n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5064o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5065p;

    /* renamed from: q, reason: collision with root package name */
    public v f5066q;

    /* renamed from: r, reason: collision with root package name */
    public R4.a f5067r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5068s;

    /* renamed from: t, reason: collision with root package name */
    public q f5069t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5070u;

    /* renamed from: v, reason: collision with root package name */
    public p f5071v;

    /* renamed from: w, reason: collision with root package name */
    public h f5072w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f5073x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5074y;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final j5.i f5075a;

        public a(j5.i iVar) {
            this.f5075a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5075a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f5050a.b(this.f5075a)) {
                            l.this.c(this.f5075a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final j5.i f5077a;

        public b(j5.i iVar) {
            this.f5077a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5077a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f5050a.b(this.f5077a)) {
                            l.this.f5071v.c();
                            l.this.f(this.f5077a);
                            l.this.r(this.f5077a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public p a(v vVar, boolean z6, R4.f fVar, p.a aVar) {
            return new p(vVar, z6, true, fVar, aVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final j5.i f5079a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f5080b;

        public d(j5.i iVar, Executor executor) {
            this.f5079a = iVar;
            this.f5080b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f5079a.equals(((d) obj).f5079a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5079a.hashCode();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        public final List f5081a;

        public e() {
            this(new ArrayList(2));
        }

        public static d h(j5.i iVar) {
            return new d(iVar, n5.e.a());
        }

        public void a(j5.i iVar, Executor executor) {
            this.f5081a.add(new d(iVar, executor));
        }

        public boolean b(j5.i iVar) {
            return this.f5081a.contains(h(iVar));
        }

        public e c() {
            return new e(new ArrayList(this.f5081a));
        }

        public void clear() {
            this.f5081a.clear();
        }

        public void i(j5.i iVar) {
            this.f5081a.remove(h(iVar));
        }

        public boolean isEmpty() {
            return this.f5081a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f5081a.iterator();
        }

        public int size() {
            return this.f5081a.size();
        }

        public e(List list) {
            this.f5081a = list;
        }
    }

    public l(W4.a aVar, W4.a aVar2, W4.a aVar3, W4.a aVar4, m mVar, p.a aVar5, y0.d dVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, dVar, f5049z);
    }

    private synchronized void q() {
        if (this.f5061l == null) {
            throw new IllegalArgumentException();
        }
        this.f5050a.clear();
        this.f5061l = null;
        this.f5071v = null;
        this.f5066q = null;
        this.f5070u = false;
        this.f5073x = false;
        this.f5068s = false;
        this.f5074y = false;
        this.f5072w.w(false);
        this.f5072w = null;
        this.f5069t = null;
        this.f5067r = null;
        this.f5053d.a(this);
    }

    public synchronized void a(j5.i iVar, Executor executor) {
        try {
            this.f5051b.c();
            this.f5050a.a(iVar, executor);
            if (this.f5068s) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f5070u) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                n5.k.a(!this.f5073x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // T4.h.b
    public void b(v vVar, R4.a aVar, boolean z6) {
        synchronized (this) {
            this.f5066q = vVar;
            this.f5067r = aVar;
            this.f5074y = z6;
        }
        o();
    }

    public void c(j5.i iVar) {
        try {
            iVar.d(this.f5069t);
        } catch (Throwable th) {
            throw new T4.b(th);
        }
    }

    @Override // T4.h.b
    public void d(q qVar) {
        synchronized (this) {
            this.f5069t = qVar;
        }
        n();
    }

    @Override // T4.h.b
    public void e(h hVar) {
        j().execute(hVar);
    }

    public void f(j5.i iVar) {
        try {
            iVar.b(this.f5071v, this.f5067r, this.f5074y);
        } catch (Throwable th) {
            throw new T4.b(th);
        }
    }

    @Override // o5.a.f
    public o5.c g() {
        return this.f5051b;
    }

    public void h() {
        if (m()) {
            return;
        }
        this.f5073x = true;
        this.f5072w.b();
        this.f5055f.a(this, this.f5061l);
    }

    public void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f5051b.c();
                n5.k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f5060k.decrementAndGet();
                n5.k.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f5071v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    public final W4.a j() {
        return this.f5063n ? this.f5058i : this.f5064o ? this.f5059j : this.f5057h;
    }

    public synchronized void k(int i6) {
        p pVar;
        n5.k.a(m(), "Not yet complete!");
        if (this.f5060k.getAndAdd(i6) == 0 && (pVar = this.f5071v) != null) {
            pVar.c();
        }
    }

    public synchronized l l(R4.f fVar, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f5061l = fVar;
        this.f5062m = z6;
        this.f5063n = z7;
        this.f5064o = z8;
        this.f5065p = z9;
        return this;
    }

    public final boolean m() {
        return this.f5070u || this.f5068s || this.f5073x;
    }

    public void n() {
        synchronized (this) {
            try {
                this.f5051b.c();
                if (this.f5073x) {
                    q();
                    return;
                }
                if (this.f5050a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f5070u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f5070u = true;
                R4.f fVar = this.f5061l;
                e c6 = this.f5050a.c();
                k(c6.size() + 1);
                this.f5055f.c(this, fVar, null);
                Iterator it = c6.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f5080b.execute(new a(dVar.f5079a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        synchronized (this) {
            try {
                this.f5051b.c();
                if (this.f5073x) {
                    this.f5066q.a();
                    q();
                    return;
                }
                if (this.f5050a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f5068s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f5071v = this.f5054e.a(this.f5066q, this.f5062m, this.f5061l, this.f5052c);
                this.f5068s = true;
                e c6 = this.f5050a.c();
                k(c6.size() + 1);
                this.f5055f.c(this, this.f5061l, this.f5071v);
                Iterator it = c6.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f5080b.execute(new b(dVar.f5079a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean p() {
        return this.f5065p;
    }

    public synchronized void r(j5.i iVar) {
        try {
            this.f5051b.c();
            this.f5050a.i(iVar);
            if (this.f5050a.isEmpty()) {
                h();
                if (!this.f5068s) {
                    if (this.f5070u) {
                    }
                }
                if (this.f5060k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f5072w = hVar;
            (hVar.D() ? this.f5056g : j()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public l(W4.a aVar, W4.a aVar2, W4.a aVar3, W4.a aVar4, m mVar, p.a aVar5, y0.d dVar, c cVar) {
        this.f5050a = new e();
        this.f5051b = o5.c.a();
        this.f5060k = new AtomicInteger();
        this.f5056g = aVar;
        this.f5057h = aVar2;
        this.f5058i = aVar3;
        this.f5059j = aVar4;
        this.f5055f = mVar;
        this.f5052c = aVar5;
        this.f5053d = dVar;
        this.f5054e = cVar;
    }
}
