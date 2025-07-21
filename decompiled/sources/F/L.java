package F;

import F.L;
import I.C0435j0;
import I.C0445o0;
import I.C0464y0;
import I.InterfaceC0439l0;
import I.InterfaceC0441m0;
import I.InterfaceC0462x0;
import I.L0;
import I.O0;
import I.P;
import I.Y0;
import I.Z0;
import U.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class L extends I0 {

    /* renamed from: r, reason: collision with root package name */
    public static final d f1315r = new d();

    /* renamed from: s, reason: collision with root package name */
    public static final Boolean f1316s = null;

    /* renamed from: m, reason: collision with root package name */
    public final O f1317m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1318n;

    /* renamed from: o, reason: collision with root package name */
    public a f1319o;

    /* renamed from: p, reason: collision with root package name */
    public L0.b f1320p;

    /* renamed from: q, reason: collision with root package name */
    public I.W f1321q;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        default Size a() {
            return null;
        }

        void b(androidx.camera.core.d dVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public @interface b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements InterfaceC0441m0.a, Y0.a {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f1322a;

        public c() {
            this(C0464y0.a0());
        }

        public static c f(I.P p6) {
            return new c(C0464y0.b0(p6));
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f1322a;
        }

        public L e() {
            C0435j0 c6 = c();
            InterfaceC0441m0.u(c6);
            return new L(c6);
        }

        @Override // I.Y0.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0435j0 c() {
            return new C0435j0(I.D0.Z(this.f1322a));
        }

        public c h(Z0.b bVar) {
            b().H(Y0.f2391A, bVar);
            return this;
        }

        public c i(Size size) {
            b().H(InterfaceC0441m0.f2508m, size);
            return this;
        }

        public c j(C c6) {
            if (!Objects.equals(C.f1236d, c6)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            b().H(InterfaceC0439l0.f2495g, c6);
            return this;
        }

        public c k(U.c cVar) {
            b().H(InterfaceC0441m0.f2511p, cVar);
            return this;
        }

        public c l(int i6) {
            b().H(Y0.f2396v, Integer.valueOf(i6));
            return this;
        }

        public c m(int i6) {
            if (i6 == -1) {
                i6 = 0;
            }
            b().H(InterfaceC0441m0.f2503h, Integer.valueOf(i6));
            return this;
        }

        public c n(Class cls) {
            b().H(O.j.f3872D, cls);
            if (b().e(O.j.f3871C, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c o(String str) {
            b().H(O.j.f3871C, str);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public c a(Size size) {
            b().H(InterfaceC0441m0.f2507l, size);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public c d(int i6) {
            b().H(InterfaceC0441m0.f2504i, Integer.valueOf(i6));
            return this;
        }

        public c(C0464y0 c0464y0) {
            this.f1322a = c0464y0;
            Class cls = (Class) c0464y0.e(O.j.f3872D, null);
            if (cls != null && !cls.equals(L.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            n(L.class);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Size f1323a;

        /* renamed from: b, reason: collision with root package name */
        public static final C f1324b;

        /* renamed from: c, reason: collision with root package name */
        public static final U.c f1325c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0435j0 f1326d;

        static {
            Size size = new Size(640, 480);
            f1323a = size;
            C c6 = C.f1236d;
            f1324b = c6;
            U.c a6 = new c.a().d(U.a.f5148c).f(new U.d(S.d.f4639c, 1)).a();
            f1325c = a6;
            f1326d = new c().i(size).l(1).m(0).k(a6).h(Z0.b.IMAGE_ANALYSIS).j(c6).c();
        }

        public C0435j0 a() {
            return f1326d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public @interface e {
    }

    public L(C0435j0 c0435j0) {
        super(c0435j0);
        this.f1318n = new Object();
        if (((C0435j0) j()).X(0) == 1) {
            this.f1317m = new P();
        } else {
            this.f1317m = new androidx.camera.core.c(c0435j0.U(M.c.c()));
        }
        this.f1317m.r(i0());
        this.f1317m.s(k0());
    }

    public static /* synthetic */ void Y(androidx.camera.core.f fVar, androidx.camera.core.f fVar2) {
        fVar.i();
        if (fVar2 != null) {
            fVar2.i();
        }
    }

    public static /* synthetic */ void a0(L l6, String str, C0435j0 c0435j0, O0 o02, L0 l02, L0.f fVar) {
        l6.d0();
        l6.f1317m.g();
        if (l6.y(str)) {
            l6.V(l6.e0(str, c0435j0, o02).o());
            l6.E();
        }
    }

    public static /* synthetic */ List b0(Size size, List list, int i6) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // F.I0
    public void H() {
        this.f1317m.f();
    }

    @Override // F.I0
    public Y0 J(I.D d6, Y0.a aVar) {
        final Size a6;
        Boolean h02 = h0();
        boolean a7 = d6.l().a(Q.h.class);
        O o6 = this.f1317m;
        if (h02 != null) {
            a7 = h02.booleanValue();
        }
        o6.q(a7);
        synchronized (this.f1318n) {
            try {
                a aVar2 = this.f1319o;
                a6 = aVar2 != null ? aVar2.a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a6 == null) {
            return aVar.c();
        }
        if (d6.j(((Integer) aVar.b().e(InterfaceC0441m0.f2504i, 0)).intValue()) % 180 == 90) {
            a6 = new Size(a6.getHeight(), a6.getWidth());
        }
        Y0 c6 = aVar.c();
        P.a aVar3 = InterfaceC0441m0.f2507l;
        if (!c6.h(aVar3)) {
            aVar.b().H(aVar3, a6);
        }
        Y0 c7 = aVar.c();
        P.a aVar4 = InterfaceC0441m0.f2511p;
        if (c7.h(aVar4)) {
            U.c cVar = (U.c) c().e(aVar4, null);
            c.a aVar5 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar5.f(new U.d(a6, 1));
            }
            if (cVar == null) {
                aVar5.e(new U.b() { // from class: F.I
                    @Override // U.b
                    public final List a(List list, int i6) {
                        return L.b0(a6, list, i6);
                    }
                });
            }
            aVar.b().H(aVar4, aVar5.a());
        }
        return aVar.c();
    }

    @Override // F.I0
    public O0 M(I.P p6) {
        this.f1320p.g(p6);
        V(this.f1320p.o());
        return e().f().d(p6).a();
    }

    @Override // F.I0
    public O0 N(O0 o02) {
        L0.b e02 = e0(i(), (C0435j0) j(), o02);
        this.f1320p = e02;
        V(e02.o());
        return o02;
    }

    @Override // F.I0
    public void O() {
        d0();
        this.f1317m.j();
    }

    @Override // F.I0
    public void R(Matrix matrix) {
        super.R(matrix);
        this.f1317m.v(matrix);
    }

    @Override // F.I0
    public void T(Rect rect) {
        super.T(rect);
        this.f1317m.w(rect);
    }

    public void c0() {
        synchronized (this.f1318n) {
            try {
                this.f1317m.p(null, null);
                if (this.f1319o != null) {
                    D();
                }
                this.f1319o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d0() {
        L.p.a();
        I.W w6 = this.f1321q;
        if (w6 != null) {
            w6.d();
            this.f1321q = null;
        }
    }

    public L0.b e0(final String str, final C0435j0 c0435j0, final O0 o02) {
        L.p.a();
        Size e6 = o02.e();
        Executor executor = (Executor) y0.g.f(c0435j0.U(M.c.c()));
        boolean z6 = true;
        int g02 = f0() == 1 ? g0() : 4;
        c0435j0.Z();
        final androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0329f0.a(e6.getWidth(), e6.getHeight(), m(), g02));
        boolean j02 = g() != null ? j0(g()) : false;
        int height = j02 ? e6.getHeight() : e6.getWidth();
        int width = j02 ? e6.getWidth() : e6.getHeight();
        int i6 = i0() == 2 ? 1 : 35;
        boolean z7 = m() == 35 && i0() == 2;
        if (m() != 35 || ((g() == null || p(g()) == 0) && !Boolean.TRUE.equals(h0()))) {
            z6 = false;
        }
        final androidx.camera.core.f fVar2 = (z7 || z6) ? new androidx.camera.core.f(AbstractC0329f0.a(height, width, i6, fVar.e())) : null;
        if (fVar2 != null) {
            this.f1317m.t(fVar2);
        }
        n0();
        fVar.d(this.f1317m, executor);
        L0.b q6 = L0.b.q(c0435j0, o02.e());
        if (o02.d() != null) {
            q6.g(o02.d());
        }
        I.W w6 = this.f1321q;
        if (w6 != null) {
            w6.d();
        }
        C0445o0 c0445o0 = new C0445o0(fVar.getSurface(), e6, m());
        this.f1321q = c0445o0;
        c0445o0.k().c(new Runnable() { // from class: F.J
            @Override // java.lang.Runnable
            public final void run() {
                L.Y(androidx.camera.core.f.this, fVar2);
            }
        }, M.c.e());
        q6.t(o02.c());
        q6.m(this.f1321q, o02.b());
        q6.f(new L0.c() { // from class: F.K
            @Override // I.L0.c
            public final void a(L0 l02, L0.f fVar3) {
                L.a0(L.this, str, c0435j0, o02, l02, fVar3);
            }
        });
        return q6;
    }

    public int f0() {
        return ((C0435j0) j()).X(0);
    }

    public int g0() {
        return ((C0435j0) j()).Y(6);
    }

    public Boolean h0() {
        return ((C0435j0) j()).a0(f1316s);
    }

    public int i0() {
        return ((C0435j0) j()).b0(1);
    }

    public final boolean j0(I.E e6) {
        return k0() && p(e6) % 180 != 0;
    }

    @Override // F.I0
    public Y0 k(boolean z6, Z0 z02) {
        d dVar = f1315r;
        I.P a6 = z02.a(dVar.a().G(), 1);
        if (z6) {
            a6 = I.P.Q(a6, dVar.a());
        }
        if (a6 == null) {
            return null;
        }
        return w(a6).c();
    }

    public boolean k0() {
        return ((C0435j0) j()).c0(Boolean.FALSE).booleanValue();
    }

    public void l0(Executor executor, final a aVar) {
        synchronized (this.f1318n) {
            try {
                this.f1317m.p(executor, new a() { // from class: F.H
                    @Override // F.L.a
                    public final void b(androidx.camera.core.d dVar) {
                        L.a.this.b(dVar);
                    }
                });
                if (this.f1319o == null) {
                    C();
                }
                this.f1319o = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m0(int i6) {
        if (S(i6)) {
            n0();
        }
    }

    public final void n0() {
        I.E g6 = g();
        if (g6 != null) {
            this.f1317m.u(p(g6));
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    @Override // F.I0
    public Y0.a w(I.P p6) {
        return c.f(p6);
    }
}
