package T4;

import T4.h;
import T4.p;
import V4.a;
import V4.h;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o5.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f5023i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final s f5024a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5025b;

    /* renamed from: c, reason: collision with root package name */
    public final V4.h f5026c;

    /* renamed from: d, reason: collision with root package name */
    public final b f5027d;

    /* renamed from: e, reason: collision with root package name */
    public final y f5028e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5029f;

    /* renamed from: g, reason: collision with root package name */
    public final a f5030g;

    /* renamed from: h, reason: collision with root package name */
    public final T4.a f5031h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final h.e f5032a;

        /* renamed from: b, reason: collision with root package name */
        public final y0.d f5033b = o5.a.d(150, new C0087a());

        /* renamed from: c, reason: collision with root package name */
        public int f5034c;

        /* renamed from: T4.k$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0087a implements a.d {
            public C0087a() {
            }

            @Override // o5.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h a() {
                a aVar = a.this;
                return new h(aVar.f5032a, aVar.f5033b);
            }
        }

        public a(h.e eVar) {
            this.f5032a = eVar;
        }

        public h a(com.bumptech.glide.d dVar, Object obj, n nVar, R4.f fVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z6, boolean z7, boolean z8, R4.h hVar, h.b bVar) {
            h hVar2 = (h) n5.k.d((h) this.f5033b.b());
            int i8 = this.f5034c;
            this.f5034c = i8 + 1;
            return hVar2.n(dVar, obj, nVar, fVar, i6, i7, cls, cls2, gVar, jVar, map, z6, z7, z8, hVar, bVar, i8);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final W4.a f5036a;

        /* renamed from: b, reason: collision with root package name */
        public final W4.a f5037b;

        /* renamed from: c, reason: collision with root package name */
        public final W4.a f5038c;

        /* renamed from: d, reason: collision with root package name */
        public final W4.a f5039d;

        /* renamed from: e, reason: collision with root package name */
        public final m f5040e;

        /* renamed from: f, reason: collision with root package name */
        public final p.a f5041f;

        /* renamed from: g, reason: collision with root package name */
        public final y0.d f5042g = o5.a.d(150, new a());

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements a.d {
            public a() {
            }

            @Override // o5.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l a() {
                b bVar = b.this;
                return new l(bVar.f5036a, bVar.f5037b, bVar.f5038c, bVar.f5039d, bVar.f5040e, bVar.f5041f, bVar.f5042g);
            }
        }

        public b(W4.a aVar, W4.a aVar2, W4.a aVar3, W4.a aVar4, m mVar, p.a aVar5) {
            this.f5036a = aVar;
            this.f5037b = aVar2;
            this.f5038c = aVar3;
            this.f5039d = aVar4;
            this.f5040e = mVar;
            this.f5041f = aVar5;
        }

        public l a(R4.f fVar, boolean z6, boolean z7, boolean z8, boolean z9) {
            return ((l) n5.k.d((l) this.f5042g.b())).l(fVar, z6, z7, z8, z9);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0093a f5044a;

        /* renamed from: b, reason: collision with root package name */
        public volatile V4.a f5045b;

        public c(a.InterfaceC0093a interfaceC0093a) {
            this.f5044a = interfaceC0093a;
        }

        @Override // T4.h.e
        public V4.a a() {
            if (this.f5045b == null) {
                synchronized (this) {
                    try {
                        if (this.f5045b == null) {
                            this.f5045b = this.f5044a.build();
                        }
                        if (this.f5045b == null) {
                            this.f5045b = new V4.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f5045b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final l f5046a;

        /* renamed from: b, reason: collision with root package name */
        public final j5.i f5047b;

        public d(j5.i iVar, l lVar) {
            this.f5047b = iVar;
            this.f5046a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f5046a.r(this.f5047b);
            }
        }
    }

    public k(V4.h hVar, a.InterfaceC0093a interfaceC0093a, W4.a aVar, W4.a aVar2, W4.a aVar3, W4.a aVar4, boolean z6) {
        this(hVar, interfaceC0093a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z6);
    }

    public static void j(String str, long j6, R4.f fVar) {
        Log.v("Engine", str + " in " + n5.g.a(j6) + "ms, key: " + fVar);
    }

    @Override // T4.m
    public synchronized void a(l lVar, R4.f fVar) {
        this.f5024a.d(fVar, lVar);
    }

    @Override // V4.h.a
    public void b(v vVar) {
        this.f5028e.a(vVar, true);
    }

    @Override // T4.m
    public synchronized void c(l lVar, R4.f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.e()) {
                    this.f5031h.a(fVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5024a.d(fVar, lVar);
    }

    @Override // T4.p.a
    public void d(R4.f fVar, p pVar) {
        this.f5031h.d(fVar);
        if (pVar.e()) {
            this.f5026c.c(fVar, pVar);
        } else {
            this.f5028e.a(pVar, false);
        }
    }

    public final p e(R4.f fVar) {
        v d6 = this.f5026c.d(fVar);
        if (d6 == null) {
            return null;
        }
        return d6 instanceof p ? (p) d6 : new p(d6, true, true, fVar, this);
    }

    public d f(com.bumptech.glide.d dVar, Object obj, R4.f fVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z6, boolean z7, R4.h hVar, boolean z8, boolean z9, boolean z10, boolean z11, j5.i iVar, Executor executor) {
        long b6 = f5023i ? n5.g.b() : 0L;
        n a6 = this.f5025b.a(obj, fVar, i6, i7, map, cls, cls2, hVar);
        synchronized (this) {
            try {
                p i8 = i(a6, z8, b6);
                if (i8 == null) {
                    return l(dVar, obj, fVar, i6, i7, cls, cls2, gVar, jVar, map, z6, z7, hVar, z8, z9, z10, z11, iVar, executor, a6, b6);
                }
                iVar.b(i8, R4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p g(R4.f fVar) {
        p e6 = this.f5031h.e(fVar);
        if (e6 != null) {
            e6.c();
        }
        return e6;
    }

    public final p h(R4.f fVar) {
        p e6 = e(fVar);
        if (e6 != null) {
            e6.c();
            this.f5031h.a(fVar, e6);
        }
        return e6;
    }

    public final p i(n nVar, boolean z6, long j6) {
        if (!z6) {
            return null;
        }
        p g6 = g(nVar);
        if (g6 != null) {
            if (f5023i) {
                j("Loaded resource from active resources", j6, nVar);
            }
            return g6;
        }
        p h6 = h(nVar);
        if (h6 == null) {
            return null;
        }
        if (f5023i) {
            j("Loaded resource from cache", j6, nVar);
        }
        return h6;
    }

    public void k(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).g();
    }

    public final d l(com.bumptech.glide.d dVar, Object obj, R4.f fVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z6, boolean z7, R4.h hVar, boolean z8, boolean z9, boolean z10, boolean z11, j5.i iVar, Executor executor, n nVar, long j6) {
        l a6 = this.f5024a.a(nVar, z11);
        if (a6 != null) {
            a6.a(iVar, executor);
            if (f5023i) {
                j("Added to existing load", j6, nVar);
            }
            return new d(iVar, a6);
        }
        l a7 = this.f5027d.a(nVar, z8, z9, z10, z11);
        h a8 = this.f5030g.a(dVar, obj, nVar, fVar, i6, i7, cls, cls2, gVar, jVar, map, z6, z7, z11, hVar, a7);
        this.f5024a.c(nVar, a7);
        a7.a(iVar, executor);
        a7.s(a8);
        if (f5023i) {
            j("Started new load", j6, nVar);
        }
        return new d(iVar, a7);
    }

    public k(V4.h hVar, a.InterfaceC0093a interfaceC0093a, W4.a aVar, W4.a aVar2, W4.a aVar3, W4.a aVar4, s sVar, o oVar, T4.a aVar5, b bVar, a aVar6, y yVar, boolean z6) {
        this.f5026c = hVar;
        c cVar = new c(interfaceC0093a);
        this.f5029f = cVar;
        T4.a aVar7 = aVar5 == null ? new T4.a(z6) : aVar5;
        this.f5031h = aVar7;
        aVar7.f(this);
        this.f5025b = oVar == null ? new o() : oVar;
        this.f5024a = sVar == null ? new s() : sVar;
        this.f5027d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f5030g = aVar6 == null ? new a(cVar) : aVar6;
        this.f5028e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}
