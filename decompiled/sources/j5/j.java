package j5;

import T4.k;
import T4.q;
import T4.v;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import n5.l;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements d, k5.g, i {

    /* renamed from: E, reason: collision with root package name */
    public static final boolean f16254E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public int f16255A;

    /* renamed from: B, reason: collision with root package name */
    public int f16256B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16257C;

    /* renamed from: D, reason: collision with root package name */
    public RuntimeException f16258D;

    /* renamed from: a, reason: collision with root package name */
    public int f16259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16260b;

    /* renamed from: c, reason: collision with root package name */
    public final o5.c f16261c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16262d;

    /* renamed from: e, reason: collision with root package name */
    public final g f16263e;

    /* renamed from: f, reason: collision with root package name */
    public final e f16264f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f16265g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.d f16266h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16267i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f16268j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1652a f16269k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16270l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16271m;

    /* renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.g f16272n;

    /* renamed from: o, reason: collision with root package name */
    public final k5.h f16273o;

    /* renamed from: p, reason: collision with root package name */
    public final List f16274p;

    /* renamed from: q, reason: collision with root package name */
    public final l5.c f16275q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f16276r;

    /* renamed from: s, reason: collision with root package name */
    public v f16277s;

    /* renamed from: t, reason: collision with root package name */
    public k.d f16278t;

    /* renamed from: u, reason: collision with root package name */
    public long f16279u;

    /* renamed from: v, reason: collision with root package name */
    public volatile T4.k f16280v;

    /* renamed from: w, reason: collision with root package name */
    public a f16281w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f16282x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f16283y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f16284z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public j(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, AbstractC1652a abstractC1652a, int i6, int i7, com.bumptech.glide.g gVar, k5.h hVar, g gVar2, List list, e eVar, T4.k kVar, l5.c cVar, Executor executor) {
        this.f16260b = f16254E ? String.valueOf(super.hashCode()) : null;
        this.f16261c = o5.c.a();
        this.f16262d = obj;
        this.f16265g = context;
        this.f16266h = dVar;
        this.f16267i = obj2;
        this.f16268j = cls;
        this.f16269k = abstractC1652a;
        this.f16270l = i6;
        this.f16271m = i7;
        this.f16272n = gVar;
        this.f16273o = hVar;
        this.f16263e = gVar2;
        this.f16274p = list;
        this.f16264f = eVar;
        this.f16280v = kVar;
        this.f16275q = cVar;
        this.f16276r = executor;
        this.f16281w = a.PENDING;
        if (this.f16258D == null && dVar.g().a(c.C0183c.class)) {
            this.f16258D = new RuntimeException("Glide request origin trace");
        }
    }

    public static int w(int i6, float f6) {
        return i6 == Integer.MIN_VALUE ? i6 : Math.round(f6 * i6);
    }

    public static j z(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, AbstractC1652a abstractC1652a, int i6, int i7, com.bumptech.glide.g gVar, k5.h hVar, g gVar2, List list, e eVar, T4.k kVar, l5.c cVar, Executor executor) {
        return new j(context, dVar, obj, obj2, cls, abstractC1652a, i6, i7, gVar, hVar, gVar2, list, eVar, kVar, cVar, executor);
    }

    public final void A(q qVar, int i6) {
        boolean z6;
        this.f16261c.c();
        synchronized (this.f16262d) {
            try {
                qVar.k(this.f16258D);
                int h6 = this.f16266h.h();
                if (h6 <= i6) {
                    Log.w("Glide", "Load failed for [" + this.f16267i + "] with dimensions [" + this.f16255A + "x" + this.f16256B + "]", qVar);
                    if (h6 <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f16278t = null;
                this.f16281w = a.FAILED;
                x();
                boolean z7 = true;
                this.f16257C = true;
                try {
                    List list = this.f16274p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        z6 = false;
                        while (it.hasNext()) {
                            z6 |= ((g) it.next()).b(qVar, this.f16267i, this.f16273o, t());
                        }
                    } else {
                        z6 = false;
                    }
                    g gVar = this.f16263e;
                    if (gVar == null || !gVar.b(qVar, this.f16267i, this.f16273o, t())) {
                        z7 = false;
                    }
                    if (!(z6 | z7)) {
                        C();
                    }
                    this.f16257C = false;
                    o5.b.f("GlideRequest", this.f16259a);
                } catch (Throwable th) {
                    this.f16257C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(v vVar, Object obj, R4.a aVar, boolean z6) {
        boolean z7;
        boolean t6 = t();
        this.f16281w = a.COMPLETE;
        this.f16277s = vVar;
        if (this.f16266h.h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f16267i + " with size [" + this.f16255A + "x" + this.f16256B + "] in " + n5.g.a(this.f16279u) + " ms");
        }
        y();
        boolean z8 = true;
        this.f16257C = true;
        try {
            List list = this.f16274p;
            if (list != null) {
                Iterator it = list.iterator();
                z7 = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    R4.a aVar2 = aVar;
                    z7 |= ((g) it.next()).g(obj2, this.f16267i, this.f16273o, aVar2, t6);
                    obj = obj2;
                    aVar = aVar2;
                }
            } else {
                z7 = false;
            }
            Object obj3 = obj;
            R4.a aVar3 = aVar;
            g gVar = this.f16263e;
            if (gVar == null || !gVar.g(obj3, this.f16267i, this.f16273o, aVar3, t6)) {
                z8 = false;
            }
            if (!(z8 | z7)) {
                this.f16273o.d(obj3, this.f16275q.a(aVar3, t6));
            }
            this.f16257C = false;
            o5.b.f("GlideRequest", this.f16259a);
        } catch (Throwable th) {
            this.f16257C = false;
            throw th;
        }
    }

    public final void C() {
        if (m()) {
            Drawable r6 = this.f16267i == null ? r() : null;
            if (r6 == null) {
                r6 = q();
            }
            if (r6 == null) {
                r6 = s();
            }
            this.f16273o.h(r6);
        }
    }

    @Override // j5.d
    public boolean a() {
        boolean z6;
        synchronized (this.f16262d) {
            z6 = this.f16281w == a.COMPLETE;
        }
        return z6;
    }

    @Override // j5.i
    public void b(v vVar, R4.a aVar, boolean z6) {
        this.f16261c.c();
        v vVar2 = null;
        try {
            synchronized (this.f16262d) {
                try {
                    this.f16278t = null;
                    if (vVar == null) {
                        d(new q("Expected to receive a Resource<R> with an object of " + this.f16268j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f16268j.isAssignableFrom(obj.getClass())) {
                            if (n()) {
                                B(vVar, obj, aVar, z6);
                                return;
                            }
                            this.f16277s = null;
                            this.f16281w = a.COMPLETE;
                            o5.b.f("GlideRequest", this.f16259a);
                            this.f16280v.k(vVar);
                        }
                        this.f16277s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f16268j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        d(new q(sb.toString()));
                        this.f16280v.k(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f16280v.k(vVar2);
            }
            throw th3;
        }
    }

    @Override // j5.d
    public void c() {
        synchronized (this.f16262d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.d
    public void clear() {
        synchronized (this.f16262d) {
            try {
                i();
                this.f16261c.c();
                a aVar = this.f16281w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                v vVar = this.f16277s;
                if (vVar != null) {
                    this.f16277s = null;
                } else {
                    vVar = null;
                }
                if (k()) {
                    this.f16273o.m(s());
                }
                o5.b.f("GlideRequest", this.f16259a);
                this.f16281w = aVar2;
                if (vVar != null) {
                    this.f16280v.k(vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j5.i
    public void d(q qVar) {
        A(qVar, 5);
    }

    @Override // j5.d
    public boolean e(d dVar) {
        int i6;
        int i7;
        Object obj;
        Class cls;
        AbstractC1652a abstractC1652a;
        com.bumptech.glide.g gVar;
        int size;
        int i8;
        int i9;
        Object obj2;
        Class cls2;
        AbstractC1652a abstractC1652a2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.f16262d) {
            try {
                i6 = this.f16270l;
                i7 = this.f16271m;
                obj = this.f16267i;
                cls = this.f16268j;
                abstractC1652a = this.f16269k;
                gVar = this.f16272n;
                List list = this.f16274p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.f16262d) {
            try {
                i8 = jVar.f16270l;
                i9 = jVar.f16271m;
                obj2 = jVar.f16267i;
                cls2 = jVar.f16268j;
                abstractC1652a2 = jVar.f16269k;
                gVar2 = jVar.f16272n;
                List list2 = jVar.f16274p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i6 == i8 && i7 == i9 && l.d(obj, obj2) && cls.equals(cls2) && l.c(abstractC1652a, abstractC1652a2) && gVar == gVar2 && size == size2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.g
    public void f(int i6, int i7) {
        j jVar = this;
        jVar.f16261c.c();
        Object obj = jVar.f16262d;
        synchronized (obj) {
            try {
                try {
                    boolean z6 = f16254E;
                    if (z6) {
                        jVar.v("Got onSizeReady in " + n5.g.a(jVar.f16279u));
                    }
                    if (jVar.f16281w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        jVar.f16281w = aVar;
                        float v6 = jVar.f16269k.v();
                        jVar.f16255A = w(i6, v6);
                        jVar.f16256B = w(i7, v6);
                        if (z6) {
                            jVar.v("finished setup for calling load in " + n5.g.a(jVar.f16279u));
                        }
                        try {
                            T4.k kVar = jVar.f16280v;
                            com.bumptech.glide.d dVar = jVar.f16266h;
                            try {
                                Object obj2 = jVar.f16267i;
                                R4.f u6 = jVar.f16269k.u();
                                try {
                                    int i8 = jVar.f16255A;
                                    int i9 = jVar.f16256B;
                                    Class t6 = jVar.f16269k.t();
                                    Class cls = jVar.f16268j;
                                    try {
                                        com.bumptech.glide.g gVar = jVar.f16272n;
                                        T4.j h6 = jVar.f16269k.h();
                                        Map x6 = jVar.f16269k.x();
                                        boolean I6 = jVar.f16269k.I();
                                        boolean E6 = jVar.f16269k.E();
                                        R4.h n6 = jVar.f16269k.n();
                                        boolean C6 = jVar.f16269k.C();
                                        boolean z7 = jVar.f16269k.z();
                                        boolean y6 = jVar.f16269k.y();
                                        boolean m6 = jVar.f16269k.m();
                                        Executor executor = jVar.f16276r;
                                        jVar = obj;
                                        try {
                                            jVar.f16278t = kVar.f(dVar, obj2, u6, i8, i9, t6, cls, gVar, h6, x6, I6, E6, n6, C6, z7, y6, m6, jVar, executor);
                                            if (jVar.f16281w != aVar) {
                                                jVar.f16278t = null;
                                            }
                                            if (z6) {
                                                jVar.v("finished onSizeReady in " + n5.g.a(jVar.f16279u));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        jVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    jVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                jVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            jVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    jVar = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // j5.d
    public boolean g() {
        boolean z6;
        synchronized (this.f16262d) {
            z6 = this.f16281w == a.CLEARED;
        }
        return z6;
    }

    @Override // j5.i
    public Object h() {
        this.f16261c.c();
        return this.f16262d;
    }

    public final void i() {
        if (this.f16257C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // j5.d
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f16262d) {
            try {
                a aVar = this.f16281w;
                z6 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z6;
    }

    @Override // j5.d
    public void j() {
        synchronized (this.f16262d) {
            try {
                i();
                this.f16261c.c();
                this.f16279u = n5.g.b();
                Object obj = this.f16267i;
                if (obj == null) {
                    if (l.u(this.f16270l, this.f16271m)) {
                        this.f16255A = this.f16270l;
                        this.f16256B = this.f16271m;
                    }
                    A(new q("Received null model"), r() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f16281w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f16277s, R4.a.MEMORY_CACHE, false);
                    return;
                }
                p(obj);
                this.f16259a = o5.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f16281w = aVar3;
                if (l.u(this.f16270l, this.f16271m)) {
                    f(this.f16270l, this.f16271m);
                } else {
                    this.f16273o.n(this);
                }
                a aVar4 = this.f16281w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                    this.f16273o.k(s());
                }
                if (f16254E) {
                    v("finished run method in " + n5.g.a(this.f16279u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        e eVar = this.f16264f;
        return eVar == null || eVar.h(this);
    }

    @Override // j5.d
    public boolean l() {
        boolean z6;
        synchronized (this.f16262d) {
            z6 = this.f16281w == a.COMPLETE;
        }
        return z6;
    }

    public final boolean m() {
        e eVar = this.f16264f;
        return eVar == null || eVar.f(this);
    }

    public final boolean n() {
        e eVar = this.f16264f;
        return eVar == null || eVar.i(this);
    }

    public final void o() {
        i();
        this.f16261c.c();
        this.f16273o.e(this);
        k.d dVar = this.f16278t;
        if (dVar != null) {
            dVar.a();
            this.f16278t = null;
        }
    }

    public final void p(Object obj) {
        List<g> list = this.f16274p;
        if (list == null) {
            return;
        }
        for (g gVar : list) {
        }
    }

    public final Drawable q() {
        if (this.f16282x == null) {
            Drawable j6 = this.f16269k.j();
            this.f16282x = j6;
            if (j6 == null && this.f16269k.i() > 0) {
                this.f16282x = u(this.f16269k.i());
            }
        }
        return this.f16282x;
    }

    public final Drawable r() {
        if (this.f16284z == null) {
            Drawable k6 = this.f16269k.k();
            this.f16284z = k6;
            if (k6 == null && this.f16269k.l() > 0) {
                this.f16284z = u(this.f16269k.l());
            }
        }
        return this.f16284z;
    }

    public final Drawable s() {
        if (this.f16283y == null) {
            Drawable q6 = this.f16269k.q();
            this.f16283y = q6;
            if (q6 == null && this.f16269k.r() > 0) {
                this.f16283y = u(this.f16269k.r());
            }
        }
        return this.f16283y;
    }

    public final boolean t() {
        e eVar = this.f16264f;
        return eVar == null || !eVar.d().a();
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f16262d) {
            obj = this.f16267i;
            cls = this.f16268j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    public final Drawable u(int i6) {
        return c5.i.a(this.f16265g, i6, this.f16269k.w() != null ? this.f16269k.w() : this.f16265g.getTheme());
    }

    public final void v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f16260b);
    }

    public final void x() {
        e eVar = this.f16264f;
        if (eVar != null) {
            eVar.k(this);
        }
    }

    public final void y() {
        e eVar = this.f16264f;
        if (eVar != null) {
            eVar.b(this);
        }
    }
}
