package T;

import F.H0;
import I.O0;
import I.W;
import T.L;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class L {

    /* renamed from: a */
    public final int f4753a;

    /* renamed from: b */
    public final Matrix f4754b;

    /* renamed from: c */
    public final boolean f4755c;

    /* renamed from: d */
    public final Rect f4756d;

    /* renamed from: e */
    public final boolean f4757e;

    /* renamed from: f */
    public final int f4758f;

    /* renamed from: g */
    public final O0 f4759g;

    /* renamed from: h */
    public int f4760h;

    /* renamed from: i */
    public int f4761i;

    /* renamed from: j */
    public O f4762j;

    /* renamed from: l */
    public H0 f4764l;

    /* renamed from: m */
    public a f4765m;

    /* renamed from: k */
    public boolean f4763k = false;

    /* renamed from: n */
    public final Set f4766n = new HashSet();

    /* renamed from: o */
    public boolean f4767o = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends W {

        /* renamed from: o */
        public final D6.g f4768o;

        /* renamed from: p */
        public AbstractC1728c.a f4769p;

        /* renamed from: q */
        public W f4770q;

        public a(Size size, int i6) {
            super(size, i6);
            this.f4768o = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: T.J
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return L.a.q(L.a.this, aVar);
                }
            });
        }

        public static /* synthetic */ Object q(a aVar, AbstractC1728c.a aVar2) {
            aVar.f4769p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // I.W
        public D6.g o() {
            return this.f4768o;
        }

        public boolean r() {
            L.p.a();
            return this.f4770q == null && !m();
        }

        public boolean s(final W w6, Runnable runnable) {
            L.p.a();
            y0.g.f(w6);
            W w7 = this.f4770q;
            if (w7 == w6) {
                return false;
            }
            y0.g.i(w7 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            y0.g.b(h().equals(w6.h()), "The provider's size must match the parent");
            y0.g.b(i() == w6.i(), "The provider's format must match the parent");
            y0.g.i(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f4770q = w6;
            N.f.j(w6.j(), this.f4769p);
            w6.l();
            k().c(new Runnable() { // from class: T.K
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.e();
                }
            }, M.c.b());
            w6.f().c(runnable, M.c.e());
            return true;
        }
    }

    public L(int i6, int i7, O0 o02, Matrix matrix, boolean z6, Rect rect, int i8, int i9, boolean z7) {
        this.f4758f = i6;
        this.f4753a = i7;
        this.f4759g = o02;
        this.f4754b = matrix;
        this.f4755c = z6;
        this.f4756d = rect;
        this.f4761i = i8;
        this.f4760h = i9;
        this.f4757e = z7;
        this.f4765m = new a(o02.e(), i7);
    }

    public static /* synthetic */ D6.g a(L l6, final a aVar, int i6, Size size, Rect rect, int i7, boolean z6, I.E e6, Surface surface) {
        l6.getClass();
        y0.g.f(surface);
        try {
            aVar.l();
            O o6 = new O(surface, l6.u(), i6, l6.f4759g.e(), size, rect, i7, z6, e6, l6.f4754b);
            o6.P().c(new Runnable() { // from class: T.I
                @Override // java.lang.Runnable
                public final void run() {
                    L.a.this.e();
                }
            }, M.c.b());
            l6.f4762j = o6;
            return N.f.h(o6);
        } catch (W.a e7) {
            return N.f.f(e7);
        }
    }

    public static /* synthetic */ void b(L l6) {
        l6.getClass();
        M.c.e().execute(new Runnable() { // from class: T.G
            @Override // java.lang.Runnable
            public final void run() {
                L.c(L.this);
            }
        });
    }

    public static /* synthetic */ void c(L l6) {
        if (l6.f4767o) {
            return;
        }
        l6.w();
    }

    public static /* synthetic */ void d(L l6, int i6, int i7) {
        boolean z6;
        boolean z7 = true;
        if (l6.f4761i != i6) {
            l6.f4761i = i6;
            z6 = true;
        } else {
            z6 = false;
        }
        if (l6.f4760h != i7) {
            l6.f4760h = i7;
        } else {
            z7 = z6;
        }
        if (z7) {
            l6.x();
        }
    }

    public void f(Runnable runnable) {
        L.p.a();
        h();
        this.f4766n.add(runnable);
    }

    public final void g() {
        y0.g.i(!this.f4763k, "Consumer can only be linked once.");
        this.f4763k = true;
    }

    public final void h() {
        y0.g.i(!this.f4767o, "Edge is already closed.");
    }

    public final void i() {
        L.p.a();
        m();
        this.f4767o = true;
    }

    public D6.g j(final Size size, final int i6, final Rect rect, final int i7, final boolean z6, final I.E e6) {
        L.p.a();
        h();
        g();
        final a aVar = this.f4765m;
        return N.f.o(aVar.j(), new N.a() { // from class: T.H
            @Override // N.a
            public final D6.g apply(Object obj) {
                return L.a(L.this, aVar, i6, size, rect, i7, z6, e6, (Surface) obj);
            }
        }, M.c.e());
    }

    public H0 k(I.E e6) {
        L.p.a();
        h();
        H0 h02 = new H0(this.f4759g.e(), e6, this.f4759g.b(), this.f4759g.c(), new Runnable() { // from class: T.C
            @Override // java.lang.Runnable
            public final void run() {
                L.b(L.this);
            }
        });
        try {
            final W k6 = h02.k();
            if (this.f4765m.s(k6, new D(this))) {
                D6.g k7 = this.f4765m.k();
                Objects.requireNonNull(k6);
                k7.c(new Runnable() { // from class: T.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        W.this.d();
                    }
                }, M.c.b());
            }
            this.f4764l = h02;
            x();
            return h02;
        } catch (W.a e7) {
            throw new AssertionError("Surface is somehow already closed", e7);
        } catch (RuntimeException e8) {
            h02.t();
            throw e8;
        }
    }

    public final void l() {
        L.p.a();
        h();
        m();
    }

    public final void m() {
        L.p.a();
        this.f4765m.d();
        O o6 = this.f4762j;
        if (o6 != null) {
            o6.R();
            this.f4762j = null;
        }
    }

    public Rect n() {
        return this.f4756d;
    }

    public W o() {
        L.p.a();
        h();
        g();
        return this.f4765m;
    }

    public int p() {
        return this.f4753a;
    }

    public boolean q() {
        return this.f4757e;
    }

    public int r() {
        return this.f4761i;
    }

    public Matrix s() {
        return this.f4754b;
    }

    public O0 t() {
        return this.f4759g;
    }

    public int u() {
        return this.f4758f;
    }

    public boolean v() {
        return this.f4755c;
    }

    public void w() {
        L.p.a();
        h();
        if (this.f4765m.r()) {
            return;
        }
        m();
        this.f4763k = false;
        this.f4765m = new a(this.f4759g.e(), this.f4753a);
        Iterator it = this.f4766n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void x() {
        L.p.a();
        H0 h02 = this.f4764l;
        if (h02 != null) {
            h02.s(H0.h.g(this.f4756d, this.f4761i, this.f4760h, v(), this.f4754b, this.f4757e));
        }
    }

    public void y(W w6) {
        L.p.a();
        h();
        this.f4765m.s(w6, new D(this));
    }

    public void z(final int i6, final int i7) {
        L.p.d(new Runnable() { // from class: T.F
            @Override // java.lang.Runnable
            public final void run() {
                L.d(L.this, i6, i7);
            }
        });
    }
}
