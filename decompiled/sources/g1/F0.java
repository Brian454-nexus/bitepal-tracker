package g1;

import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.InterfaceC1129k;
import e1.InterfaceC1266x;
import h1.InterfaceC1400a;
import h1.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w1.C2209A;
import w1.C2210B;
import w1.C2239y;
import w1.C2240z;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import w1.d0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f14304a;

    /* renamed from: e, reason: collision with root package name */
    public final d f14308e;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1400a f14311h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1129k f14312i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14314k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1266x f14315l;

    /* renamed from: j, reason: collision with root package name */
    public w1.d0 f14313j = new d0.a(0);

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f14306c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f14307d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List f14305b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f14309f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Set f14310g = new HashSet();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a implements w1.K, l1.t {

        /* renamed from: a, reason: collision with root package name */
        public final c f14316a;

        public a(c cVar) {
            this.f14316a = cVar;
        }

        @Override // l1.t
        public void F(int i6, InterfaceC2212D.b bVar, final int i7) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.F(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, i7);
                    }
                });
            }
        }

        @Override // l1.t
        public void H(int i6, InterfaceC2212D.b bVar, final Exception exc) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.H(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, exc);
                    }
                });
            }
        }

        public final Pair I(int i6, InterfaceC2212D.b bVar) {
            InterfaceC2212D.b bVar2 = null;
            if (bVar != null) {
                InterfaceC2212D.b n6 = F0.n(this.f14316a, bVar);
                if (n6 == null) {
                    return null;
                }
                bVar2 = n6;
            }
            return Pair.create(Integer.valueOf(F0.s(this.f14316a, i6)), bVar2);
        }

        @Override // w1.K
        public void N(int i6, InterfaceC2212D.b bVar, final C2239y c2239y, final C2210B c2210b, final IOException iOException, final boolean z6) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.N(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, c2239y, c2210b, iOException, z6);
                    }
                });
            }
        }

        @Override // l1.t
        public void P(int i6, InterfaceC2212D.b bVar) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.P(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second);
                    }
                });
            }
        }

        @Override // w1.K
        public void R(int i6, InterfaceC2212D.b bVar, final C2239y c2239y, final C2210B c2210b) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.R(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, c2239y, c2210b);
                    }
                });
            }
        }

        @Override // w1.K
        public void U(int i6, InterfaceC2212D.b bVar, final C2210B c2210b) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.U(((Integer) r1.first).intValue(), (InterfaceC2212D.b) AbstractC1119a.e((InterfaceC2212D.b) I6.second), c2210b);
                    }
                });
            }
        }

        @Override // w1.K
        public void V(int i6, InterfaceC2212D.b bVar, final C2210B c2210b) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.V(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, c2210b);
                    }
                });
            }
        }

        @Override // w1.K
        public void W(int i6, InterfaceC2212D.b bVar, final C2239y c2239y, final C2210B c2210b) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.W(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, c2239y, c2210b);
                    }
                });
            }
        }

        @Override // l1.t
        public void Z(int i6, InterfaceC2212D.b bVar) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.Z(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second);
                    }
                });
            }
        }

        @Override // w1.K
        public void e0(int i6, InterfaceC2212D.b bVar, final C2239y c2239y, final C2210B c2210b) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.e0(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second, c2239y, c2210b);
                    }
                });
            }
        }

        @Override // l1.t
        public void g0(int i6, InterfaceC2212D.b bVar) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.g0(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second);
                    }
                });
            }
        }

        @Override // l1.t
        public void o0(int i6, InterfaceC2212D.b bVar) {
            final Pair I6 = I(i6, bVar);
            if (I6 != null) {
                F0.this.f14312i.c(new Runnable() { // from class: g1.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        F0.this.f14311h.o0(((Integer) r1.first).intValue(), (InterfaceC2212D.b) I6.second);
                    }
                });
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2212D f14318a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2212D.c f14319b;

        /* renamed from: c, reason: collision with root package name */
        public final a f14320c;

        public b(InterfaceC2212D interfaceC2212D, InterfaceC2212D.c cVar, a aVar) {
            this.f14318a = interfaceC2212D;
            this.f14319b = cVar;
            this.f14320c = aVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements InterfaceC1354r0 {

        /* renamed from: a, reason: collision with root package name */
        public final C2209A f14321a;

        /* renamed from: d, reason: collision with root package name */
        public int f14324d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14325e;

        /* renamed from: c, reason: collision with root package name */
        public final List f14323c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f14322b = new Object();

        public c(InterfaceC2212D interfaceC2212D, boolean z6) {
            this.f14321a = new C2209A(interfaceC2212D, z6);
        }

        @Override // g1.InterfaceC1354r0
        public Object a() {
            return this.f14322b;
        }

        @Override // g1.InterfaceC1354r0
        public Z0.G b() {
            return this.f14321a.Y();
        }

        public void c(int i6) {
            this.f14324d = i6;
            this.f14325e = false;
            this.f14323c.clear();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void d();
    }

    public F0(d dVar, InterfaceC1400a interfaceC1400a, InterfaceC1129k interfaceC1129k, v1 v1Var) {
        this.f14304a = v1Var;
        this.f14308e = dVar;
        this.f14311h = interfaceC1400a;
        this.f14312i = interfaceC1129k;
    }

    public static Object m(Object obj) {
        return AbstractC1320a.v(obj);
    }

    public static InterfaceC2212D.b n(c cVar, InterfaceC2212D.b bVar) {
        for (int i6 = 0; i6 < cVar.f14323c.size(); i6++) {
            if (((InterfaceC2212D.b) cVar.f14323c.get(i6)).f19756d == bVar.f19756d) {
                return bVar.a(p(cVar, bVar.f19753a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return AbstractC1320a.w(obj);
    }

    public static Object p(c cVar, Object obj) {
        return AbstractC1320a.y(cVar.f14322b, obj);
    }

    public static int s(c cVar, int i6) {
        return i6 + cVar.f14324d;
    }

    public final void A(int i6, int i7) {
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            c cVar = (c) this.f14305b.remove(i8);
            this.f14307d.remove(cVar.f14322b);
            g(i8, -cVar.f14321a.Y().p());
            cVar.f14325e = true;
            if (this.f14314k) {
                u(cVar);
            }
        }
    }

    public Z0.G B(List list, w1.d0 d0Var) {
        A(0, this.f14305b.size());
        return f(this.f14305b.size(), list, d0Var);
    }

    public Z0.G C(w1.d0 d0Var) {
        int r6 = r();
        if (d0Var.a() != r6) {
            d0Var = d0Var.h().f(0, r6);
        }
        this.f14313j = d0Var;
        return i();
    }

    public Z0.G D(int i6, int i7, List list) {
        AbstractC1119a.a(i6 >= 0 && i6 <= i7 && i7 <= r());
        AbstractC1119a.a(list.size() == i7 - i6);
        for (int i8 = i6; i8 < i7; i8++) {
            ((c) this.f14305b.get(i8)).f14321a.s((Z0.u) list.get(i8 - i6));
        }
        return i();
    }

    public Z0.G f(int i6, List list, w1.d0 d0Var) {
        if (!list.isEmpty()) {
            this.f14313j = d0Var;
            for (int i7 = i6; i7 < list.size() + i6; i7++) {
                c cVar = (c) list.get(i7 - i6);
                if (i7 > 0) {
                    c cVar2 = (c) this.f14305b.get(i7 - 1);
                    cVar.c(cVar2.f14324d + cVar2.f14321a.Y().p());
                } else {
                    cVar.c(0);
                }
                g(i7, cVar.f14321a.Y().p());
                this.f14305b.add(i7, cVar);
                this.f14307d.put(cVar.f14322b, cVar);
                if (this.f14314k) {
                    w(cVar);
                    if (this.f14306c.isEmpty()) {
                        this.f14310g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i6, int i7) {
        while (i6 < this.f14305b.size()) {
            ((c) this.f14305b.get(i6)).f14324d += i7;
            i6++;
        }
    }

    public InterfaceC2211C h(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        Object o6 = o(bVar.f19753a);
        InterfaceC2212D.b a6 = bVar.a(m(bVar.f19753a));
        c cVar = (c) AbstractC1119a.e((c) this.f14307d.get(o6));
        l(cVar);
        cVar.f14323c.add(a6);
        C2240z d6 = cVar.f14321a.d(a6, bVar2, j6);
        this.f14306c.put(d6, cVar);
        k();
        return d6;
    }

    public Z0.G i() {
        if (this.f14305b.isEmpty()) {
            return Z0.G.f6652a;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f14305b.size(); i7++) {
            c cVar = (c) this.f14305b.get(i7);
            cVar.f14324d = i6;
            i6 += cVar.f14321a.Y().p();
        }
        return new I0(this.f14305b, this.f14313j);
    }

    public final void j(c cVar) {
        b bVar = (b) this.f14309f.get(cVar);
        if (bVar != null) {
            bVar.f14318a.b(bVar.f14319b);
        }
    }

    public final void k() {
        Iterator it = this.f14310g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f14323c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f14310g.add(cVar);
        b bVar = (b) this.f14309f.get(cVar);
        if (bVar != null) {
            bVar.f14318a.h(bVar.f14319b);
        }
    }

    public w1.d0 q() {
        return this.f14313j;
    }

    public int r() {
        return this.f14305b.size();
    }

    public boolean t() {
        return this.f14314k;
    }

    public final void u(c cVar) {
        if (cVar.f14325e && cVar.f14323c.isEmpty()) {
            b bVar = (b) AbstractC1119a.e((b) this.f14309f.remove(cVar));
            bVar.f14318a.i(bVar.f14319b);
            bVar.f14318a.f(bVar.f14320c);
            bVar.f14318a.n(bVar.f14320c);
            this.f14310g.remove(cVar);
        }
    }

    public void v(InterfaceC1266x interfaceC1266x) {
        AbstractC1119a.g(!this.f14314k);
        this.f14315l = interfaceC1266x;
        for (int i6 = 0; i6 < this.f14305b.size(); i6++) {
            c cVar = (c) this.f14305b.get(i6);
            w(cVar);
            this.f14310g.add(cVar);
        }
        this.f14314k = true;
    }

    public final void w(c cVar) {
        C2209A c2209a = cVar.f14321a;
        InterfaceC2212D.c cVar2 = new InterfaceC2212D.c() { // from class: g1.s0
            @Override // w1.InterfaceC2212D.c
            public final void a(InterfaceC2212D interfaceC2212D, Z0.G g6) {
                F0.this.f14308e.d();
            }
        };
        a aVar = new a(cVar);
        this.f14309f.put(cVar, new b(c2209a, cVar2, aVar));
        c2209a.c(AbstractC1117K.C(), aVar);
        c2209a.p(AbstractC1117K.C(), aVar);
        c2209a.a(cVar2, this.f14315l, this.f14304a);
    }

    public void x() {
        for (b bVar : this.f14309f.values()) {
            try {
                bVar.f14318a.i(bVar.f14319b);
            } catch (RuntimeException e6) {
                AbstractC1133o.d("MediaSourceList", "Failed to release child source.", e6);
            }
            bVar.f14318a.f(bVar.f14320c);
            bVar.f14318a.n(bVar.f14320c);
        }
        this.f14309f.clear();
        this.f14310g.clear();
        this.f14314k = false;
    }

    public void y(InterfaceC2211C interfaceC2211C) {
        c cVar = (c) AbstractC1119a.e((c) this.f14306c.remove(interfaceC2211C));
        cVar.f14321a.r(interfaceC2211C);
        cVar.f14323c.remove(((C2240z) interfaceC2211C).f20132a);
        if (!this.f14306c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public Z0.G z(int i6, int i7, w1.d0 d0Var) {
        AbstractC1119a.a(i6 >= 0 && i6 <= i7 && i7 <= r());
        this.f14313j = d0Var;
        A(i6, i7);
        return i();
    }
}
