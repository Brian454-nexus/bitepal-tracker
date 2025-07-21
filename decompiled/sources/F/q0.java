package F;

import F.q0;
import I.C0464y0;
import I.InterfaceC0439l0;
import I.InterfaceC0441m0;
import I.InterfaceC0462x0;
import I.L0;
import I.O0;
import I.Y0;
import I.Z0;
import U.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q0 extends I0 {

    /* renamed from: t, reason: collision with root package name */
    public static final b f1464t = new b();

    /* renamed from: u, reason: collision with root package name */
    public static final Executor f1465u = M.c.e();

    /* renamed from: m, reason: collision with root package name */
    public c f1466m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f1467n;

    /* renamed from: o, reason: collision with root package name */
    public L0.b f1468o;

    /* renamed from: p, reason: collision with root package name */
    public I.W f1469p;

    /* renamed from: q, reason: collision with root package name */
    public T.L f1470q;

    /* renamed from: r, reason: collision with root package name */
    public H0 f1471r;

    /* renamed from: s, reason: collision with root package name */
    public T.U f1472s;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Y0.a, InterfaceC0441m0.a {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f1473a;

        public a() {
            this(C0464y0.a0());
        }

        public static a f(I.P p6) {
            return new a(C0464y0.b0(p6));
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f1473a;
        }

        public q0 e() {
            I.E0 c6 = c();
            InterfaceC0441m0.u(c6);
            return new q0(c6);
        }

        @Override // I.Y0.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public I.E0 c() {
            return new I.E0(I.D0.Z(this.f1473a));
        }

        public a h(Z0.b bVar) {
            b().H(Y0.f2391A, bVar);
            return this;
        }

        public a i(U.c cVar) {
            b().H(InterfaceC0441m0.f2511p, cVar);
            return this;
        }

        public a j(int i6) {
            b().H(Y0.f2396v, Integer.valueOf(i6));
            return this;
        }

        public a k(int i6) {
            if (i6 == -1) {
                i6 = 0;
            }
            b().H(InterfaceC0441m0.f2503h, Integer.valueOf(i6));
            return this;
        }

        public a l(Class cls) {
            b().H(O.j.f3872D, cls);
            if (b().e(O.j.f3871C, null) == null) {
                m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a m(String str) {
            b().H(O.j.f3871C, str);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a a(Size size) {
            b().H(InterfaceC0441m0.f2507l, size);
            return this;
        }

        @Override // I.InterfaceC0441m0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a d(int i6) {
            b().H(InterfaceC0441m0.f2504i, Integer.valueOf(i6));
            b().H(InterfaceC0441m0.f2505j, Integer.valueOf(i6));
            return this;
        }

        public a(C0464y0 c0464y0) {
            this.f1473a = c0464y0;
            Class cls = (Class) c0464y0.e(O.j.f3872D, null);
            if (cls != null && !cls.equals(q0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            l(q0.class);
            c0464y0.H(InterfaceC0441m0.f2506k, 2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final U.c f1474a;

        /* renamed from: b, reason: collision with root package name */
        public static final I.E0 f1475b;

        static {
            U.c a6 = new c.a().d(U.a.f5148c).f(U.d.f5160c).a();
            f1474a = a6;
            f1475b = new a().j(2).k(0).i(a6).h(Z0.b.PREVIEW).c();
        }

        public I.E0 a() {
            return f1475b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a(H0 h02);
    }

    public q0(I.E0 e02) {
        super(e02);
        this.f1467n = f1465u;
    }

    public static /* synthetic */ void Z(q0 q0Var, String str, I.E0 e02, O0 o02, L0 l02, L0.f fVar) {
        if (q0Var.y(str)) {
            q0Var.V(q0Var.c0(str, e02, o02).o());
            q0Var.E();
        }
    }

    private void b0() {
        I.W w6 = this.f1469p;
        if (w6 != null) {
            w6.d();
            this.f1469p = null;
        }
        T.U u6 = this.f1472s;
        if (u6 != null) {
            u6.f();
            this.f1472s = null;
        }
        T.L l6 = this.f1470q;
        if (l6 != null) {
            l6.i();
            this.f1470q = null;
        }
        this.f1471r = null;
    }

    @Override // F.I0
    public Y0 J(I.D d6, Y0.a aVar) {
        aVar.b().H(InterfaceC0439l0.f2494f, 34);
        return aVar.c();
    }

    @Override // F.I0
    public O0 M(I.P p6) {
        this.f1468o.g(p6);
        V(this.f1468o.o());
        return e().f().d(p6).a();
    }

    @Override // F.I0
    public O0 N(O0 o02) {
        m0(i(), (I.E0) j(), o02);
        return o02;
    }

    @Override // F.I0
    public void O() {
        b0();
    }

    @Override // F.I0
    public void T(Rect rect) {
        super.T(rect);
        h0();
    }

    public final void a0(L0.b bVar, final String str, final I.E0 e02, final O0 o02) {
        if (this.f1466m != null) {
            bVar.m(this.f1469p, o02.b());
        }
        bVar.f(new L0.c() { // from class: F.p0
            @Override // I.L0.c
            public final void a(L0 l02, L0.f fVar) {
                q0.Z(q0.this, str, e02, o02, l02, fVar);
            }
        });
    }

    public final L0.b c0(String str, I.E0 e02, O0 o02) {
        L.p.a();
        I.E g6 = g();
        Objects.requireNonNull(g6);
        I.E e6 = g6;
        b0();
        y0.g.h(this.f1470q == null);
        Matrix s6 = s();
        boolean m6 = e6.m();
        Rect d02 = d0(o02.e());
        Objects.requireNonNull(d02);
        this.f1470q = new T.L(1, 34, o02, s6, m6, d02, q(e6, A(e6)), d(), l0(e6));
        l();
        this.f1470q.f(new Runnable() { // from class: F.n0
            @Override // java.lang.Runnable
            public final void run() {
                q0.this.E();
            }
        });
        H0 k6 = this.f1470q.k(e6);
        this.f1471r = k6;
        this.f1469p = k6.k();
        if (this.f1466m != null) {
            g0();
        }
        L0.b q6 = L0.b.q(e02, o02.e());
        q6.t(o02.c());
        if (o02.d() != null) {
            q6.g(o02.d());
        }
        a0(q6, str, e02, o02);
        return q6;
    }

    public final Rect d0(Size size) {
        if (x() != null) {
            return x();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public r0 e0() {
        return r();
    }

    public int f0() {
        return v();
    }

    public final void g0() {
        h0();
        final c cVar = (c) y0.g.f(this.f1466m);
        final H0 h02 = (H0) y0.g.f(this.f1471r);
        this.f1467n.execute(new Runnable() { // from class: F.o0
            @Override // java.lang.Runnable
            public final void run() {
                q0.c.this.a(h02);
            }
        });
    }

    public final void h0() {
        I.E g6 = g();
        T.L l6 = this.f1470q;
        if (g6 == null || l6 == null) {
            return;
        }
        l6.z(q(g6, A(g6)), d());
    }

    public void i0(c cVar) {
        j0(f1465u, cVar);
    }

    public void j0(Executor executor, c cVar) {
        L.p.a();
        if (cVar == null) {
            this.f1466m = null;
            D();
            return;
        }
        this.f1466m = cVar;
        this.f1467n = executor;
        if (f() != null) {
            m0(i(), (I.E0) j(), e());
            E();
        }
        C();
    }

    @Override // F.I0
    public Y0 k(boolean z6, Z0 z02) {
        b bVar = f1464t;
        I.P a6 = z02.a(bVar.a().G(), 1);
        if (z6) {
            a6 = I.P.Q(a6, bVar.a());
        }
        if (a6 == null) {
            return null;
        }
        return w(a6).c();
    }

    public void k0(int i6) {
        if (S(i6)) {
            h0();
        }
    }

    public final boolean l0(I.E e6) {
        return e6.m() && A(e6);
    }

    public final void m0(String str, I.E0 e02, O0 o02) {
        L0.b c02 = c0(str, e02, o02);
        this.f1468o = c02;
        V(c02.o());
    }

    @Override // F.I0
    public int q(I.E e6, boolean z6) {
        if (e6.m()) {
            return super.q(e6, z6);
        }
        return 0;
    }

    public String toString() {
        return "Preview:" + o();
    }

    @Override // F.I0
    public Set u() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // F.I0
    public Y0.a w(I.P p6) {
        return a.f(p6);
    }
}
