package V;

import F.I0;
import F.X;
import F.q0;
import I.A;
import I.AbstractC0442n;
import I.D;
import I.E;
import I.InterfaceC0441m0;
import I.InterfaceC0455u;
import I.InterfaceC0462x0;
import I.L0;
import I.W;
import I.Y0;
import I.Z0;
import L.p;
import L.q;
import T.L;
import T.U;
import V.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements E {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5277a;

    /* renamed from: d, reason: collision with root package name */
    public final Z0 f5280d;

    /* renamed from: e, reason: collision with root package name */
    public final E f5281e;

    /* renamed from: g, reason: collision with root package name */
    public final i f5283g;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5278b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f5279c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0442n f5282f = q();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0442n {
        public a() {
        }

        @Override // I.AbstractC0442n
        public void b(InterfaceC0455u interfaceC0455u) {
            super.b(interfaceC0455u);
            Iterator it = g.this.f5277a.iterator();
            while (it.hasNext()) {
                g.G(interfaceC0455u, ((I0) it.next()).t());
            }
        }
    }

    public g(E e6, Set set, Z0 z02, d.a aVar) {
        this.f5281e = e6;
        this.f5280d = z02;
        this.f5277a = set;
        this.f5283g = new i(e6.e(), aVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f5279c.put((I0) it.next(), Boolean.FALSE);
        }
    }

    public static void G(InterfaceC0455u interfaceC0455u, L0 l02) {
        Iterator it = l02.g().iterator();
        while (it.hasNext()) {
            ((AbstractC0442n) it.next()).b(new h(l02.h().h(), interfaceC0455u));
        }
    }

    public static int s(I0 i02) {
        return i02 instanceof X ? 256 : 34;
    }

    public static W u(I0 i02) {
        List k6 = i02 instanceof X ? i02.t().k() : i02.t().h().g();
        y0.g.h(k6.size() <= 1);
        if (k6.size() == 1) {
            return (W) k6.get(0);
        }
        return null;
    }

    public static int v(I0 i02) {
        if (i02 instanceof q0) {
            return 1;
        }
        return i02 instanceof X ? 4 : 2;
    }

    public static int y(Set set) {
        Iterator it = set.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 = Math.max(i6, ((Y0) it.next()).z());
        }
        return i6;
    }

    public final L A(I0 i02) {
        L l6 = (L) this.f5278b.get(i02);
        Objects.requireNonNull(l6);
        return l6;
    }

    public final boolean B(I0 i02) {
        Boolean bool = (Boolean) this.f5279c.get(i02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public void C(InterfaceC0462x0 interfaceC0462x0) {
        HashSet hashSet = new HashSet();
        for (I0 i02 : this.f5277a) {
            hashSet.add(i02.B(this.f5281e.n(), null, i02.k(true, this.f5280d)));
        }
        interfaceC0462x0.H(InterfaceC0441m0.f2512q, V.a.a(new ArrayList(this.f5281e.n().m(34)), q.i(this.f5281e.e().f()), hashSet));
        interfaceC0462x0.H(Y0.f2396v, Integer.valueOf(y(hashSet)));
    }

    public void D() {
        Iterator it = this.f5277a.iterator();
        while (it.hasNext()) {
            ((I0) it.next()).K();
        }
    }

    public void E() {
        Iterator it = this.f5277a.iterator();
        while (it.hasNext()) {
            ((I0) it.next()).L();
        }
    }

    public void F() {
        p.a();
        Iterator it = this.f5277a.iterator();
        while (it.hasNext()) {
            f((I0) it.next());
        }
    }

    public void H(Map map) {
        this.f5278b.clear();
        this.f5278b.putAll(map);
        for (Map.Entry entry : this.f5278b.entrySet()) {
            I0 i02 = (I0) entry.getKey();
            L l6 = (L) entry.getValue();
            i02.T(l6.n());
            i02.R(l6.s());
            i02.W(l6.t());
            i02.F();
        }
    }

    public void I() {
        Iterator it = this.f5277a.iterator();
        while (it.hasNext()) {
            ((I0) it.next()).U(this);
        }
    }

    @Override // F.I0.d
    public void c(I0 i02) {
        p.a();
        if (B(i02)) {
            return;
        }
        this.f5279c.put(i02, Boolean.TRUE);
        W u6 = u(i02);
        if (u6 != null) {
            r(A(i02), u6, i02.t());
        }
    }

    @Override // I.E
    public A e() {
        return this.f5283g;
    }

    @Override // F.I0.d
    public void f(I0 i02) {
        W u6;
        p.a();
        L A6 = A(i02);
        A6.w();
        if (B(i02) && (u6 = u(i02)) != null) {
            r(A6, u6, i02.t());
        }
    }

    @Override // F.I0.d
    public void i(I0 i02) {
        p.a();
        if (B(i02)) {
            L A6 = A(i02);
            W u6 = u(i02);
            if (u6 != null) {
                r(A6, u6, i02.t());
            } else {
                A6.l();
            }
        }
    }

    @Override // I.E
    public void j(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // I.E
    public void k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // F.I0.d
    public void l(I0 i02) {
        p.a();
        if (B(i02)) {
            this.f5279c.put(i02, Boolean.FALSE);
            A(i02).l();
        }
    }

    @Override // I.E
    public boolean m() {
        return false;
    }

    @Override // I.E
    public D n() {
        return this.f5281e.n();
    }

    public void p() {
        for (I0 i02 : this.f5277a) {
            i02.b(this, null, i02.k(true, this.f5280d));
        }
    }

    public AbstractC0442n q() {
        return new a();
    }

    public final void r(L l6, W w6, L0 l02) {
        l6.w();
        try {
            l6.y(w6);
        } catch (W.a unused) {
            Iterator it = l02.c().iterator();
            while (it.hasNext()) {
                ((L0.c) it.next()).a(l02, L0.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public final int t(I0 i02) {
        if (i02 instanceof q0) {
            return this.f5281e.b().j(((q0) i02).f0());
        }
        return 0;
    }

    public Set w() {
        return this.f5277a;
    }

    public Map x(L l6) {
        HashMap hashMap = new HashMap();
        for (I0 i02 : this.f5277a) {
            int t6 = t(i02);
            hashMap.put(i02, U.d.h(v(i02), s(i02), l6.n(), q.d(l6.n(), t6), t6, i02.A(this)));
        }
        return hashMap;
    }

    public AbstractC0442n z() {
        return this.f5282f;
    }
}
