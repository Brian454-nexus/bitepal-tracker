package g1;

import Z0.G;
import android.util.Pair;
import c1.AbstractC1119a;
import c1.InterfaceC1129k;
import g1.C1347n0;
import g1.InterfaceC1344m;
import h1.InterfaceC1400a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import z6.w;

/* renamed from: g1.q0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1353q0 {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1400a f14797c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1129k f14798d;

    /* renamed from: e, reason: collision with root package name */
    public final C1347n0.a f14799e;

    /* renamed from: f, reason: collision with root package name */
    public long f14800f;

    /* renamed from: g, reason: collision with root package name */
    public int f14801g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14802h;

    /* renamed from: i, reason: collision with root package name */
    public C1347n0 f14803i;

    /* renamed from: j, reason: collision with root package name */
    public C1347n0 f14804j;

    /* renamed from: k, reason: collision with root package name */
    public C1347n0 f14805k;

    /* renamed from: l, reason: collision with root package name */
    public int f14806l;

    /* renamed from: m, reason: collision with root package name */
    public Object f14807m;

    /* renamed from: n, reason: collision with root package name */
    public long f14808n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1344m.c f14809o;

    /* renamed from: a, reason: collision with root package name */
    public final G.b f14795a = new G.b();

    /* renamed from: b, reason: collision with root package name */
    public final G.c f14796b = new G.c();

    /* renamed from: p, reason: collision with root package name */
    public List f14810p = new ArrayList();

    public C1353q0(InterfaceC1400a interfaceC1400a, InterfaceC1129k interfaceC1129k, C1347n0.a aVar, InterfaceC1344m.c cVar) {
        this.f14797c = interfaceC1400a;
        this.f14798d = interfaceC1129k;
        this.f14799e = aVar;
        this.f14809o = cVar;
    }

    public static boolean C(G.b bVar) {
        int c6 = bVar.c();
        if (c6 != 0 && ((c6 != 1 || !bVar.q(0)) && bVar.r(bVar.o()))) {
            long j6 = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f6664d == 0) {
                    return true;
                }
                int i6 = c6 - (bVar.q(c6 + (-1)) ? 2 : 1);
                for (int i7 = 0; i7 <= i6; i7++) {
                    j6 += bVar.i(i7);
                }
                if (bVar.f6664d <= j6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static InterfaceC2212D.b J(Z0.G g6, Object obj, long j6, long j7, G.c cVar, G.b bVar) {
        g6.h(obj, bVar);
        g6.n(bVar.f6663c, cVar);
        for (int b6 = g6.b(obj); C(bVar) && b6 <= cVar.f6698o; b6++) {
            g6.g(b6, bVar, true);
            obj = AbstractC1119a.e(bVar.f6662b);
        }
        g6.h(obj, bVar);
        int e6 = bVar.e(j6);
        return e6 == -1 ? new InterfaceC2212D.b(obj, j7, bVar.d(j6)) : new InterfaceC2212D.b(obj, e6, bVar.k(e6), j7);
    }

    public static boolean d(long j6, long j7) {
        return j6 == -9223372036854775807L || j6 == j7;
    }

    public final boolean A(Z0.G g6, InterfaceC2212D.b bVar) {
        if (y(bVar)) {
            return g6.n(g6.h(bVar.f19753a, this.f14795a).f6663c, this.f14796b).f6698o == g6.b(bVar.f19753a);
        }
        return false;
    }

    public boolean B(InterfaceC2211C interfaceC2211C) {
        C1347n0 c1347n0 = this.f14805k;
        return c1347n0 != null && c1347n0.f14765a == interfaceC2211C;
    }

    public final void D() {
        final w.a o6 = z6.w.o();
        for (C1347n0 c1347n0 = this.f14803i; c1347n0 != null; c1347n0 = c1347n0.k()) {
            o6.h(c1347n0.f14770f.f14781a);
        }
        C1347n0 c1347n02 = this.f14804j;
        final InterfaceC2212D.b bVar = c1347n02 == null ? null : c1347n02.f14770f.f14781a;
        this.f14798d.c(new Runnable() { // from class: g1.p0
            @Override // java.lang.Runnable
            public final void run() {
                C1353q0.this.f14797c.c0(o6.k(), bVar);
            }
        });
    }

    public void E(long j6) {
        C1347n0 c1347n0 = this.f14805k;
        if (c1347n0 != null) {
            c1347n0.u(j6);
        }
    }

    public final void F(List list) {
        for (int i6 = 0; i6 < this.f14810p.size(); i6++) {
            ((C1347n0) this.f14810p.get(i6)).v();
        }
        this.f14810p = list;
    }

    public void G() {
        if (this.f14810p.isEmpty()) {
            return;
        }
        F(new ArrayList());
    }

    public boolean H(C1347n0 c1347n0) {
        AbstractC1119a.i(c1347n0);
        boolean z6 = false;
        if (c1347n0.equals(this.f14805k)) {
            return false;
        }
        this.f14805k = c1347n0;
        while (c1347n0.k() != null) {
            c1347n0 = (C1347n0) AbstractC1119a.e(c1347n0.k());
            if (c1347n0 == this.f14804j) {
                this.f14804j = this.f14803i;
                z6 = true;
            }
            c1347n0.v();
            this.f14806l--;
        }
        ((C1347n0) AbstractC1119a.e(this.f14805k)).y(null);
        D();
        return z6;
    }

    public final C1347n0 I(C1349o0 c1349o0) {
        for (int i6 = 0; i6 < this.f14810p.size(); i6++) {
            if (((C1347n0) this.f14810p.get(i6)).d(c1349o0)) {
                return (C1347n0) this.f14810p.remove(i6);
            }
        }
        return null;
    }

    public InterfaceC2212D.b K(Z0.G g6, Object obj, long j6) {
        long L5 = L(g6, obj);
        g6.h(obj, this.f14795a);
        g6.n(this.f14795a.f6663c, this.f14796b);
        boolean z6 = false;
        for (int b6 = g6.b(obj); b6 >= this.f14796b.f6697n; b6--) {
            g6.g(b6, this.f14795a, true);
            boolean z7 = this.f14795a.c() > 0;
            z6 |= z7;
            G.b bVar = this.f14795a;
            if (bVar.e(bVar.f6664d) != -1) {
                obj = AbstractC1119a.e(this.f14795a.f6662b);
            }
            if (z6 && (!z7 || this.f14795a.f6664d != 0)) {
                break;
            }
        }
        return J(g6, obj, j6, L5, this.f14796b, this.f14795a);
    }

    public final long L(Z0.G g6, Object obj) {
        int b6;
        int i6 = g6.h(obj, this.f14795a).f6663c;
        Object obj2 = this.f14807m;
        if (obj2 != null && (b6 = g6.b(obj2)) != -1 && g6.f(b6, this.f14795a).f6663c == i6) {
            return this.f14808n;
        }
        for (C1347n0 c1347n0 = this.f14803i; c1347n0 != null; c1347n0 = c1347n0.k()) {
            if (c1347n0.f14766b.equals(obj)) {
                return c1347n0.f14770f.f14781a.f19756d;
            }
        }
        for (C1347n0 c1347n02 = this.f14803i; c1347n02 != null; c1347n02 = c1347n02.k()) {
            int b7 = g6.b(c1347n02.f14766b);
            if (b7 != -1 && g6.f(b7, this.f14795a).f6663c == i6) {
                return c1347n02.f14770f.f14781a.f19756d;
            }
        }
        long M5 = M(obj);
        if (M5 != -1) {
            return M5;
        }
        long j6 = this.f14800f;
        this.f14800f = 1 + j6;
        if (this.f14803i == null) {
            this.f14807m = obj;
            this.f14808n = j6;
        }
        return j6;
    }

    public final long M(Object obj) {
        for (int i6 = 0; i6 < this.f14810p.size(); i6++) {
            C1347n0 c1347n0 = (C1347n0) this.f14810p.get(i6);
            if (c1347n0.f14766b.equals(obj)) {
                return c1347n0.f14770f.f14781a.f19756d;
            }
        }
        return -1L;
    }

    public boolean N() {
        C1347n0 c1347n0 = this.f14805k;
        if (c1347n0 != null) {
            return !c1347n0.f14770f.f14789i && c1347n0.s() && this.f14805k.f14770f.f14785e != -9223372036854775807L && this.f14806l < 100;
        }
        return true;
    }

    public final boolean O(Z0.G g6) {
        Z0.G g7;
        C1347n0 c1347n0 = this.f14803i;
        if (c1347n0 == null) {
            return true;
        }
        int b6 = g6.b(c1347n0.f14766b);
        while (true) {
            g7 = g6;
            b6 = g7.d(b6, this.f14795a, this.f14796b, this.f14801g, this.f14802h);
            while (((C1347n0) AbstractC1119a.e(c1347n0)).k() != null && !c1347n0.f14770f.f14787g) {
                c1347n0 = c1347n0.k();
            }
            C1347n0 k6 = c1347n0.k();
            if (b6 == -1 || k6 == null || g7.b(k6.f14766b) != b6) {
                break;
            }
            c1347n0 = k6;
            g6 = g7;
        }
        boolean H6 = H(c1347n0);
        c1347n0.f14770f = v(g7, c1347n0.f14770f);
        return !H6;
    }

    public void P(Z0.G g6, InterfaceC1344m.c cVar) {
        this.f14809o = cVar;
        x(g6);
    }

    public boolean Q(Z0.G g6, long j6, long j7) {
        C1349o0 c1349o0;
        C1347n0 c1347n0 = this.f14803i;
        C1347n0 c1347n02 = null;
        while (c1347n0 != null) {
            C1349o0 c1349o02 = c1347n0.f14770f;
            if (c1347n02 != null) {
                C1349o0 k6 = k(g6, c1347n02, j6);
                if (k6 != null && e(c1349o02, k6)) {
                    c1349o0 = k6;
                }
                return !H(c1347n02);
            }
            c1349o0 = v(g6, c1349o02);
            c1347n0.f14770f = c1349o0.a(c1349o02.f14783c);
            if (!d(c1349o02.f14785e, c1349o0.f14785e)) {
                c1347n0.C();
                long j8 = c1349o0.f14785e;
                return (H(c1347n0) || (c1347n0 == this.f14804j && !c1347n0.f14770f.f14786f && ((j7 > Long.MIN_VALUE ? 1 : (j7 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j7 > ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : c1347n0.B(j8)) ? 1 : (j7 == ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : c1347n0.B(j8)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c1347n02 = c1347n0;
            c1347n0 = c1347n0.k();
        }
        return true;
    }

    public boolean R(Z0.G g6, int i6) {
        this.f14801g = i6;
        return O(g6);
    }

    public boolean S(Z0.G g6, boolean z6) {
        this.f14802h = z6;
        return O(g6);
    }

    public C1347n0 b() {
        C1347n0 c1347n0 = this.f14803i;
        if (c1347n0 == null) {
            return null;
        }
        if (c1347n0 == this.f14804j) {
            this.f14804j = c1347n0.k();
        }
        this.f14803i.v();
        int i6 = this.f14806l - 1;
        this.f14806l = i6;
        if (i6 == 0) {
            this.f14805k = null;
            C1347n0 c1347n02 = this.f14803i;
            this.f14807m = c1347n02.f14766b;
            this.f14808n = c1347n02.f14770f.f14781a.f19756d;
        }
        this.f14803i = this.f14803i.k();
        D();
        return this.f14803i;
    }

    public C1347n0 c() {
        this.f14804j = ((C1347n0) AbstractC1119a.i(this.f14804j)).k();
        D();
        return (C1347n0) AbstractC1119a.i(this.f14804j);
    }

    public final boolean e(C1349o0 c1349o0, C1349o0 c1349o02) {
        return c1349o0.f14782b == c1349o02.f14782b && c1349o0.f14781a.equals(c1349o02.f14781a);
    }

    public void f() {
        if (this.f14806l == 0) {
            return;
        }
        C1347n0 c1347n0 = (C1347n0) AbstractC1119a.i(this.f14803i);
        this.f14807m = c1347n0.f14766b;
        this.f14808n = c1347n0.f14770f.f14781a.f19756d;
        while (c1347n0 != null) {
            c1347n0.v();
            c1347n0 = c1347n0.k();
        }
        this.f14803i = null;
        this.f14805k = null;
        this.f14804j = null;
        this.f14806l = 0;
        D();
    }

    public C1347n0 g(C1349o0 c1349o0) {
        C1347n0 c1347n0 = this.f14805k;
        long m6 = c1347n0 == null ? 1000000000000L : (c1347n0.m() + this.f14805k.f14770f.f14785e) - c1349o0.f14782b;
        C1347n0 I6 = I(c1349o0);
        if (I6 == null) {
            I6 = this.f14799e.a(c1349o0, m6);
        } else {
            I6.f14770f = c1349o0;
            I6.z(m6);
        }
        C1347n0 c1347n02 = this.f14805k;
        if (c1347n02 != null) {
            c1347n02.y(I6);
        } else {
            this.f14803i = I6;
            this.f14804j = I6;
        }
        this.f14807m = null;
        this.f14805k = I6;
        this.f14806l++;
        D();
        return I6;
    }

    public final Pair h(Z0.G g6, Object obj, long j6) {
        int e6 = g6.e(g6.h(obj, this.f14795a).f6663c, this.f14801g, this.f14802h);
        if (e6 != -1) {
            return g6.k(this.f14796b, this.f14795a, e6, -9223372036854775807L, j6);
        }
        return null;
    }

    public final C1349o0 i(G0 g02) {
        return n(g02.f14328a, g02.f14329b, g02.f14330c, g02.f14346s);
    }

    public final C1349o0 j(Z0.G g6, C1347n0 c1347n0, long j6) {
        Object obj;
        long j7;
        C1349o0 c1349o0 = c1347n0.f14770f;
        int d6 = g6.d(g6.b(c1349o0.f14781a.f19753a), this.f14795a, this.f14796b, this.f14801g, this.f14802h);
        if (d6 == -1) {
            return null;
        }
        int i6 = g6.g(d6, this.f14795a, true).f6663c;
        Object e6 = AbstractC1119a.e(this.f14795a.f6662b);
        long j8 = c1349o0.f14781a.f19756d;
        long j9 = 0;
        if (g6.n(i6, this.f14796b).f6697n == d6) {
            Pair k6 = g6.k(this.f14796b, this.f14795a, i6, -9223372036854775807L, Math.max(0L, j6));
            if (k6 == null) {
                return null;
            }
            Object obj2 = k6.first;
            long longValue = ((Long) k6.second).longValue();
            C1347n0 k7 = c1347n0.k();
            if (k7 == null || !k7.f14766b.equals(obj2)) {
                long M5 = M(obj2);
                if (M5 == -1) {
                    M5 = this.f14800f;
                    this.f14800f = 1 + M5;
                }
                j8 = M5;
            } else {
                j8 = k7.f14770f.f14781a.f19756d;
            }
            obj = obj2;
            j7 = longValue;
            j9 = -9223372036854775807L;
        } else {
            obj = e6;
            j7 = 0;
        }
        InterfaceC2212D.b J6 = J(g6, obj, j7, j8, this.f14796b, this.f14795a);
        if (j9 != -9223372036854775807L && c1349o0.f14783c != -9223372036854775807L) {
            boolean w6 = w(c1349o0.f14781a.f19753a, g6);
            if (J6.b() && w6) {
                j9 = c1349o0.f14783c;
            } else if (w6) {
                j7 = c1349o0.f14783c;
            }
        }
        return n(g6, J6, j9, j7);
    }

    public final C1349o0 k(Z0.G g6, C1347n0 c1347n0, long j6) {
        C1349o0 c1349o0 = c1347n0.f14770f;
        long m6 = (c1347n0.m() + c1349o0.f14785e) - j6;
        return c1349o0.f14787g ? j(g6, c1347n0, m6) : l(g6, c1347n0, m6);
    }

    public final C1349o0 l(Z0.G g6, C1347n0 c1347n0, long j6) {
        C1349o0 c1349o0 = c1347n0.f14770f;
        InterfaceC2212D.b bVar = c1349o0.f14781a;
        g6.h(bVar.f19753a, this.f14795a);
        if (!bVar.b()) {
            int i6 = bVar.f19757e;
            if (i6 != -1 && this.f14795a.q(i6)) {
                return j(g6, c1347n0, j6);
            }
            int k6 = this.f14795a.k(bVar.f19757e);
            boolean z6 = this.f14795a.r(bVar.f19757e) && this.f14795a.h(bVar.f19757e, k6) == 3;
            if (k6 == this.f14795a.a(bVar.f19757e) || z6) {
                return p(g6, bVar.f19753a, r(g6, bVar.f19753a, bVar.f19757e), c1349o0.f14785e, bVar.f19756d);
            }
            return o(g6, bVar.f19753a, bVar.f19757e, k6, c1349o0.f14785e, bVar.f19756d);
        }
        int i7 = bVar.f19754b;
        int a6 = this.f14795a.a(i7);
        if (a6 == -1) {
            return null;
        }
        int l6 = this.f14795a.l(i7, bVar.f19755c);
        if (l6 < a6) {
            return o(g6, bVar.f19753a, i7, l6, c1349o0.f14783c, bVar.f19756d);
        }
        long j7 = c1349o0.f14783c;
        if (j7 == -9223372036854775807L) {
            G.c cVar = this.f14796b;
            G.b bVar2 = this.f14795a;
            Pair k7 = g6.k(cVar, bVar2, bVar2.f6663c, -9223372036854775807L, Math.max(0L, j6));
            if (k7 == null) {
                return null;
            }
            j7 = ((Long) k7.second).longValue();
        }
        return p(g6, bVar.f19753a, Math.max(r(g6, bVar.f19753a, bVar.f19754b), j7), c1349o0.f14783c, bVar.f19756d);
    }

    public C1347n0 m() {
        return this.f14805k;
    }

    public final C1349o0 n(Z0.G g6, InterfaceC2212D.b bVar, long j6, long j7) {
        g6.h(bVar.f19753a, this.f14795a);
        return bVar.b() ? o(g6, bVar.f19753a, bVar.f19754b, bVar.f19755c, j6, bVar.f19756d) : p(g6, bVar.f19753a, j7, j6, bVar.f19756d);
    }

    public final C1349o0 o(Z0.G g6, Object obj, int i6, int i7, long j6, long j7) {
        InterfaceC2212D.b bVar = new InterfaceC2212D.b(obj, i6, i7, j7);
        long b6 = g6.h(bVar.f19753a, this.f14795a).b(bVar.f19754b, bVar.f19755c);
        long g7 = i7 == this.f14795a.k(i6) ? this.f14795a.g() : 0L;
        boolean r6 = this.f14795a.r(bVar.f19754b);
        if (b6 != -9223372036854775807L && g7 >= b6) {
            g7 = Math.max(0L, b6 - 1);
        }
        return new C1349o0(bVar, g7, j6, -9223372036854775807L, b6, r6, false, false, false);
    }

    public final C1349o0 p(Z0.G g6, Object obj, long j6, long j7, long j8) {
        boolean z6;
        long j9;
        long j10;
        long j11;
        long j12 = j6;
        g6.h(obj, this.f14795a);
        int d6 = this.f14795a.d(j12);
        boolean z7 = d6 != -1 && this.f14795a.q(d6);
        if (d6 == -1) {
            if (this.f14795a.c() > 0) {
                G.b bVar = this.f14795a;
                if (bVar.r(bVar.o())) {
                    z6 = true;
                }
            }
            z6 = false;
        } else {
            if (this.f14795a.r(d6)) {
                long f6 = this.f14795a.f(d6);
                G.b bVar2 = this.f14795a;
                if (f6 == bVar2.f6664d && bVar2.p(d6)) {
                    z6 = true;
                    d6 = -1;
                }
            }
            z6 = false;
        }
        InterfaceC2212D.b bVar3 = new InterfaceC2212D.b(obj, j8, d6);
        boolean y6 = y(bVar3);
        boolean A6 = A(g6, bVar3);
        boolean z8 = z(g6, bVar3, y6);
        boolean z9 = (d6 == -1 || !this.f14795a.r(d6) || z7) ? false : true;
        if (d6 != -1 && !z7) {
            j10 = this.f14795a.f(d6);
        } else {
            if (!z6) {
                j9 = -9223372036854775807L;
                j11 = (j9 != -9223372036854775807L || j9 == Long.MIN_VALUE) ? this.f14795a.f6664d : j9;
                if (j11 != -9223372036854775807L && j12 >= j11) {
                    j12 = Math.max(0L, j11 - ((z8 && z6) ? 0 : 1));
                }
                return new C1349o0(bVar3, j12, j7, j9, j11, z9, y6, A6, z8);
            }
            j10 = this.f14795a.f6664d;
        }
        j9 = j10;
        if (j9 != -9223372036854775807L) {
        }
        if (j11 != -9223372036854775807L) {
            j12 = Math.max(0L, j11 - ((z8 && z6) ? 0 : 1));
        }
        return new C1349o0(bVar3, j12, j7, j9, j11, z9, y6, A6, z8);
    }

    public final C1349o0 q(Z0.G g6, Object obj, long j6, long j7) {
        InterfaceC2212D.b J6 = J(g6, obj, j6, j7, this.f14796b, this.f14795a);
        return J6.b() ? o(g6, J6.f19753a, J6.f19754b, J6.f19755c, j6, J6.f19756d) : p(g6, J6.f19753a, j6, -9223372036854775807L, J6.f19756d);
    }

    public final long r(Z0.G g6, Object obj, int i6) {
        g6.h(obj, this.f14795a);
        long f6 = this.f14795a.f(i6);
        return f6 == Long.MIN_VALUE ? this.f14795a.f6664d : f6 + this.f14795a.i(i6);
    }

    public C1349o0 s(long j6, G0 g02) {
        C1347n0 c1347n0 = this.f14805k;
        return c1347n0 == null ? i(g02) : k(g02.f14328a, c1347n0, j6);
    }

    public C1347n0 t() {
        return this.f14803i;
    }

    public C1347n0 u() {
        return this.f14804j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g1.C1349o0 v(Z0.G r16, g1.C1349o0 r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            w1.D$b r3 = r2.f14781a
            boolean r12 = r15.y(r3)
            boolean r13 = r15.A(r1, r3)
            boolean r14 = r15.z(r1, r3, r12)
            w1.D$b r4 = r2.f14781a
            java.lang.Object r4 = r4.f19753a
            Z0.G$b r5 = r15.f14795a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L33
            int r1 = r3.f19757e
            if (r1 != r6) goto L2c
            goto L33
        L2c:
            Z0.G$b r7 = r15.f14795a
            long r7 = r7.f(r1)
            goto L34
        L33:
            r7 = r4
        L34:
            boolean r1 = r3.b()
            if (r1 == 0) goto L46
            Z0.G$b r1 = r15.f14795a
            int r4 = r3.f19754b
            int r5 = r3.f19755c
            long r4 = r1.b(r4, r5)
        L44:
            r9 = r4
            goto L5a
        L46:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L53
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L51
            goto L53
        L51:
            r9 = r7
            goto L5a
        L53:
            Z0.G$b r1 = r15.f14795a
            long r4 = r1.j()
            goto L44
        L5a:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6a
            Z0.G$b r1 = r15.f14795a
            int r4 = r3.f19754b
            boolean r1 = r1.r(r4)
        L68:
            r11 = r1
            goto L7a
        L6a:
            int r1 = r3.f19757e
            if (r1 == r6) goto L78
            Z0.G$b r4 = r15.f14795a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L78
            r1 = 1
            goto L68
        L78:
            r1 = 0
            goto L68
        L7a:
            g1.o0 r1 = new g1.o0
            r5 = r3
            long r3 = r2.f14782b
            r16 = r1
            long r0 = r2.f14783c
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1353q0.v(Z0.G, g1.o0):g1.o0");
    }

    public final boolean w(Object obj, Z0.G g6) {
        int c6 = g6.h(obj, this.f14795a).c();
        int o6 = this.f14795a.o();
        if (c6 <= 0 || !this.f14795a.r(o6)) {
            return false;
        }
        return c6 > 1 || this.f14795a.f(o6) != Long.MIN_VALUE;
    }

    public void x(Z0.G g6) {
        C1347n0 c1347n0;
        if (this.f14809o.f14763a == -9223372036854775807L || (c1347n0 = this.f14805k) == null) {
            G();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair h6 = h(g6, c1347n0.f14770f.f14781a.f19753a, 0L);
        if (h6 != null && !g6.n(g6.h(h6.first, this.f14795a).f6663c, this.f14796b).f()) {
            long M5 = M(h6.first);
            if (M5 == -1) {
                M5 = this.f14800f;
                this.f14800f = 1 + M5;
            }
            C1349o0 q6 = q(g6, h6.first, ((Long) h6.second).longValue(), M5);
            C1347n0 I6 = I(q6);
            if (I6 == null) {
                I6 = this.f14799e.a(q6, (c1347n0.m() + c1347n0.f14770f.f14785e) - q6.f14782b);
            }
            arrayList.add(I6);
        }
        F(arrayList);
    }

    public final boolean y(InterfaceC2212D.b bVar) {
        return !bVar.b() && bVar.f19757e == -1;
    }

    public final boolean z(Z0.G g6, InterfaceC2212D.b bVar, boolean z6) {
        int b6 = g6.b(bVar.f19753a);
        return !g6.n(g6.f(b6, this.f14795a).f6663c, this.f14796b).f6692i && g6.r(b6, this.f14795a, this.f14796b, this.f14801g, this.f14802h) && z6;
    }
}
