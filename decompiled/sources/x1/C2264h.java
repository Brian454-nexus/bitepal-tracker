package x1;

import A1.l;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.t;
import l1.u;
import w1.C2239y;
import w1.K;
import w1.a0;
import w1.b0;
import w1.c0;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2264h implements b0, c0, l.b, l.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f20441a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20442b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f20443c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f20444d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2265i f20445e;

    /* renamed from: f, reason: collision with root package name */
    public final c0.a f20446f;

    /* renamed from: g, reason: collision with root package name */
    public final K.a f20447g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.k f20448h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.l f20449i;

    /* renamed from: j, reason: collision with root package name */
    public final C2263g f20450j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f20451k;

    /* renamed from: l, reason: collision with root package name */
    public final List f20452l;

    /* renamed from: m, reason: collision with root package name */
    public final a0 f20453m;

    /* renamed from: n, reason: collision with root package name */
    public final a0[] f20454n;

    /* renamed from: o, reason: collision with root package name */
    public final C2259c f20455o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC2261e f20456p;

    /* renamed from: q, reason: collision with root package name */
    public q f20457q;

    /* renamed from: r, reason: collision with root package name */
    public b f20458r;

    /* renamed from: s, reason: collision with root package name */
    public long f20459s;

    /* renamed from: t, reason: collision with root package name */
    public long f20460t;

    /* renamed from: u, reason: collision with root package name */
    public int f20461u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC2257a f20462v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20463w;

    /* renamed from: x1.h$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final C2264h f20464a;

        /* renamed from: b, reason: collision with root package name */
        public final a0 f20465b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20466c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20467d;

        public a(C2264h c2264h, a0 a0Var, int i6) {
            this.f20464a = c2264h;
            this.f20465b = a0Var;
            this.f20466c = i6;
        }

        private void b() {
            if (this.f20467d) {
                return;
            }
            C2264h.this.f20447g.h(C2264h.this.f20442b[this.f20466c], C2264h.this.f20443c[this.f20466c], 0, null, C2264h.this.f20460t);
            this.f20467d = true;
        }

        @Override // w1.b0
        public void a() {
        }

        @Override // w1.b0
        public boolean c() {
            return !C2264h.this.I() && this.f20465b.L(C2264h.this.f20463w);
        }

        public void d() {
            AbstractC1119a.g(C2264h.this.f20444d[this.f20466c]);
            C2264h.this.f20444d[this.f20466c] = false;
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            if (C2264h.this.I()) {
                return -3;
            }
            if (C2264h.this.f20462v != null && C2264h.this.f20462v.i(this.f20466c + 1) <= this.f20465b.D()) {
                return -3;
            }
            b();
            return this.f20465b.S(c1337i0, fVar, i6, C2264h.this.f20463w);
        }

        @Override // w1.b0
        public int n(long j6) {
            if (C2264h.this.I()) {
                return 0;
            }
            int F6 = this.f20465b.F(j6, C2264h.this.f20463w);
            if (C2264h.this.f20462v != null) {
                F6 = Math.min(F6, C2264h.this.f20462v.i(this.f20466c + 1) - this.f20465b.D());
            }
            this.f20465b.e0(F6);
            if (F6 > 0) {
                b();
            }
            return F6;
        }
    }

    /* renamed from: x1.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(C2264h c2264h);
    }

    public C2264h(int i6, int[] iArr, q[] qVarArr, InterfaceC2265i interfaceC2265i, c0.a aVar, A1.b bVar, long j6, u uVar, t.a aVar2, A1.k kVar, K.a aVar3) {
        this.f20441a = i6;
        int i7 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f20442b = iArr;
        this.f20443c = qVarArr == null ? new q[0] : qVarArr;
        this.f20445e = interfaceC2265i;
        this.f20446f = aVar;
        this.f20447g = aVar3;
        this.f20448h = kVar;
        this.f20449i = new A1.l("ChunkSampleStream");
        this.f20450j = new C2263g();
        ArrayList arrayList = new ArrayList();
        this.f20451k = arrayList;
        this.f20452l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f20454n = new a0[length];
        this.f20444d = new boolean[length];
        int i8 = length + 1;
        int[] iArr2 = new int[i8];
        a0[] a0VarArr = new a0[i8];
        a0 k6 = a0.k(bVar, uVar, aVar2);
        this.f20453m = k6;
        iArr2[0] = i6;
        a0VarArr[0] = k6;
        while (i7 < length) {
            a0 l6 = a0.l(bVar);
            this.f20454n[i7] = l6;
            int i9 = i7 + 1;
            a0VarArr[i9] = l6;
            iArr2[i9] = this.f20442b[i7];
            i7 = i9;
        }
        this.f20455o = new C2259c(iArr2, a0VarArr);
        this.f20459s = j6;
        this.f20460t = j6;
    }

    private void C(int i6) {
        AbstractC1119a.g(!this.f20449i.j());
        int size = this.f20451k.size();
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (!G(i6)) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 == -1) {
            return;
        }
        long j6 = F().f20437h;
        AbstractC2257a D6 = D(i6);
        if (this.f20451k.isEmpty()) {
            this.f20459s = this.f20460t;
        }
        this.f20463w = false;
        this.f20447g.w(this.f20441a, D6.f20436g, j6);
    }

    private boolean H(AbstractC2261e abstractC2261e) {
        return abstractC2261e instanceof AbstractC2257a;
    }

    private void R() {
        this.f20453m.V();
        for (a0 a0Var : this.f20454n) {
            a0Var.V();
        }
    }

    public final void B(int i6) {
        int min = Math.min(O(i6, 0), this.f20461u);
        if (min > 0) {
            AbstractC1117K.U0(this.f20451k, 0, min);
            this.f20461u -= min;
        }
    }

    public final AbstractC2257a D(int i6) {
        AbstractC2257a abstractC2257a = (AbstractC2257a) this.f20451k.get(i6);
        ArrayList arrayList = this.f20451k;
        AbstractC1117K.U0(arrayList, i6, arrayList.size());
        this.f20461u = Math.max(this.f20461u, this.f20451k.size());
        int i7 = 0;
        this.f20453m.u(abstractC2257a.i(0));
        while (true) {
            a0[] a0VarArr = this.f20454n;
            if (i7 >= a0VarArr.length) {
                return abstractC2257a;
            }
            a0 a0Var = a0VarArr[i7];
            i7++;
            a0Var.u(abstractC2257a.i(i7));
        }
    }

    public InterfaceC2265i E() {
        return this.f20445e;
    }

    public final AbstractC2257a F() {
        return (AbstractC2257a) this.f20451k.get(r0.size() - 1);
    }

    public final boolean G(int i6) {
        int D6;
        AbstractC2257a abstractC2257a = (AbstractC2257a) this.f20451k.get(i6);
        if (this.f20453m.D() > abstractC2257a.i(0)) {
            return true;
        }
        int i7 = 0;
        do {
            a0[] a0VarArr = this.f20454n;
            if (i7 >= a0VarArr.length) {
                return false;
            }
            D6 = a0VarArr[i7].D();
            i7++;
        } while (D6 <= abstractC2257a.i(i7));
        return true;
    }

    public boolean I() {
        return this.f20459s != -9223372036854775807L;
    }

    public final void J() {
        int O5 = O(this.f20453m.D(), this.f20461u - 1);
        while (true) {
            int i6 = this.f20461u;
            if (i6 > O5) {
                return;
            }
            this.f20461u = i6 + 1;
            K(i6);
        }
    }

    public final void K(int i6) {
        AbstractC2257a abstractC2257a = (AbstractC2257a) this.f20451k.get(i6);
        q qVar = abstractC2257a.f20433d;
        if (!qVar.equals(this.f20457q)) {
            this.f20447g.h(this.f20441a, qVar, abstractC2257a.f20434e, abstractC2257a.f20435f, abstractC2257a.f20436g);
        }
        this.f20457q = qVar;
    }

    @Override // A1.l.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC2261e abstractC2261e, long j6, long j7, boolean z6) {
        this.f20456p = null;
        this.f20462v = null;
        C2239y c2239y = new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, abstractC2261e.f(), abstractC2261e.e(), j6, j7, abstractC2261e.b());
        this.f20448h.b(abstractC2261e.f20430a);
        this.f20447g.k(c2239y, abstractC2261e.f20432c, this.f20441a, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        if (z6) {
            return;
        }
        if (I()) {
            R();
        } else if (H(abstractC2261e)) {
            D(this.f20451k.size() - 1);
            if (this.f20451k.isEmpty()) {
                this.f20459s = this.f20460t;
            }
        }
        this.f20446f.j(this);
    }

    @Override // A1.l.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void j(AbstractC2261e abstractC2261e, long j6, long j7) {
        this.f20456p = null;
        this.f20445e.i(abstractC2261e);
        C2239y c2239y = new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, abstractC2261e.f(), abstractC2261e.e(), j6, j7, abstractC2261e.b());
        this.f20448h.b(abstractC2261e.f20430a);
        this.f20447g.n(c2239y, abstractC2261e.f20432c, this.f20441a, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        this.f20446f.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    @Override // A1.l.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A1.l.c q(x1.AbstractC2261e r30, long r31, long r33, java.io.IOException r35, int r36) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C2264h.q(x1.e, long, long, java.io.IOException, int):A1.l$c");
    }

    public final int O(int i6, int i7) {
        do {
            i7++;
            if (i7 >= this.f20451k.size()) {
                return this.f20451k.size() - 1;
            }
        } while (((AbstractC2257a) this.f20451k.get(i7)).i(0) <= i6);
        return i7 - 1;
    }

    public void P() {
        Q(null);
    }

    public void Q(b bVar) {
        this.f20458r = bVar;
        this.f20453m.R();
        for (a0 a0Var : this.f20454n) {
            a0Var.R();
        }
        this.f20449i.m(this);
    }

    public void S(long j6) {
        AbstractC2257a abstractC2257a;
        this.f20460t = j6;
        if (I()) {
            this.f20459s = j6;
            return;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f20451k.size(); i7++) {
            abstractC2257a = (AbstractC2257a) this.f20451k.get(i7);
            long j7 = abstractC2257a.f20436g;
            if (j7 == j6 && abstractC2257a.f20401k == -9223372036854775807L) {
                break;
            } else {
                if (j7 > j6) {
                    break;
                }
            }
        }
        abstractC2257a = null;
        if (abstractC2257a != null ? this.f20453m.Y(abstractC2257a.i(0)) : this.f20453m.Z(j6, j6 < d())) {
            this.f20461u = O(this.f20453m.D(), 0);
            a0[] a0VarArr = this.f20454n;
            int length = a0VarArr.length;
            while (i6 < length) {
                a0VarArr[i6].Z(j6, true);
                i6++;
            }
            return;
        }
        this.f20459s = j6;
        this.f20463w = false;
        this.f20451k.clear();
        this.f20461u = 0;
        if (!this.f20449i.j()) {
            this.f20449i.g();
            R();
            return;
        }
        this.f20453m.r();
        a0[] a0VarArr2 = this.f20454n;
        int length2 = a0VarArr2.length;
        while (i6 < length2) {
            a0VarArr2[i6].r();
            i6++;
        }
        this.f20449i.f();
    }

    public a T(long j6, int i6) {
        for (int i7 = 0; i7 < this.f20454n.length; i7++) {
            if (this.f20442b[i7] == i6) {
                AbstractC1119a.g(!this.f20444d[i7]);
                this.f20444d[i7] = true;
                this.f20454n[i7].Z(j6, true);
                return new a(this, this.f20454n[i7], i7);
            }
        }
        throw new IllegalStateException();
    }

    @Override // w1.b0
    public void a() {
        this.f20449i.a();
        this.f20453m.N();
        if (this.f20449i.j()) {
            return;
        }
        this.f20445e.a();
    }

    @Override // w1.c0
    public boolean b(C1343l0 c1343l0) {
        List list;
        long j6;
        if (this.f20463w || this.f20449i.j() || this.f20449i.i()) {
            return false;
        }
        boolean I6 = I();
        if (I6) {
            list = Collections.EMPTY_LIST;
            j6 = this.f20459s;
        } else {
            list = this.f20452l;
            j6 = F().f20437h;
        }
        this.f20445e.d(c1343l0, j6, list, this.f20450j);
        C2263g c2263g = this.f20450j;
        boolean z6 = c2263g.f20440b;
        AbstractC2261e abstractC2261e = c2263g.f20439a;
        c2263g.a();
        if (z6) {
            this.f20459s = -9223372036854775807L;
            this.f20463w = true;
            return true;
        }
        if (abstractC2261e == null) {
            return false;
        }
        this.f20456p = abstractC2261e;
        if (H(abstractC2261e)) {
            AbstractC2257a abstractC2257a = (AbstractC2257a) abstractC2261e;
            if (I6) {
                long j7 = abstractC2257a.f20436g;
                long j8 = this.f20459s;
                if (j7 != j8) {
                    this.f20453m.b0(j8);
                    for (a0 a0Var : this.f20454n) {
                        a0Var.b0(this.f20459s);
                    }
                }
                this.f20459s = -9223372036854775807L;
            }
            abstractC2257a.k(this.f20455o);
            this.f20451k.add(abstractC2257a);
        } else if (abstractC2261e instanceof l) {
            ((l) abstractC2261e).g(this.f20455o);
        }
        this.f20447g.t(new C2239y(abstractC2261e.f20430a, abstractC2261e.f20431b, this.f20449i.n(abstractC2261e, this, this.f20448h.d(abstractC2261e.f20432c))), abstractC2261e.f20432c, this.f20441a, abstractC2261e.f20433d, abstractC2261e.f20434e, abstractC2261e.f20435f, abstractC2261e.f20436g, abstractC2261e.f20437h);
        return true;
    }

    @Override // w1.b0
    public boolean c() {
        return !I() && this.f20453m.L(this.f20463w);
    }

    @Override // w1.c0
    public long d() {
        if (I()) {
            return this.f20459s;
        }
        if (this.f20463w) {
            return Long.MIN_VALUE;
        }
        return F().f20437h;
    }

    @Override // w1.c0
    public boolean e() {
        return this.f20449i.j();
    }

    @Override // w1.c0
    public long f() {
        if (this.f20463w) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f20459s;
        }
        long j6 = this.f20460t;
        AbstractC2257a F6 = F();
        if (!F6.h()) {
            if (this.f20451k.size() > 1) {
                F6 = (AbstractC2257a) this.f20451k.get(r2.size() - 2);
            } else {
                F6 = null;
            }
        }
        if (F6 != null) {
            j6 = Math.max(j6, F6.f20437h);
        }
        return Math.max(j6, this.f20453m.A());
    }

    public long g(long j6, N0 n02) {
        return this.f20445e.g(j6, n02);
    }

    @Override // w1.c0
    public void h(long j6) {
        if (this.f20449i.i() || I()) {
            return;
        }
        if (!this.f20449i.j()) {
            int f6 = this.f20445e.f(j6, this.f20452l);
            if (f6 < this.f20451k.size()) {
                C(f6);
                return;
            }
            return;
        }
        AbstractC2261e abstractC2261e = (AbstractC2261e) AbstractC1119a.e(this.f20456p);
        if (!(H(abstractC2261e) && G(this.f20451k.size() - 1)) && this.f20445e.e(j6, abstractC2261e, this.f20452l)) {
            this.f20449i.f();
            if (H(abstractC2261e)) {
                this.f20462v = (AbstractC2257a) abstractC2261e;
            }
        }
    }

    @Override // A1.l.f
    public void i() {
        this.f20453m.T();
        for (a0 a0Var : this.f20454n) {
            a0Var.T();
        }
        this.f20445e.release();
        b bVar = this.f20458r;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // w1.b0
    public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
        if (I()) {
            return -3;
        }
        AbstractC2257a abstractC2257a = this.f20462v;
        if (abstractC2257a != null && abstractC2257a.i(0) <= this.f20453m.D()) {
            return -3;
        }
        J();
        return this.f20453m.S(c1337i0, fVar, i6, this.f20463w);
    }

    @Override // w1.b0
    public int n(long j6) {
        if (I()) {
            return 0;
        }
        int F6 = this.f20453m.F(j6, this.f20463w);
        AbstractC2257a abstractC2257a = this.f20462v;
        if (abstractC2257a != null) {
            F6 = Math.min(F6, abstractC2257a.i(0) - this.f20453m.D());
        }
        this.f20453m.e0(F6);
        J();
        return F6;
    }

    public void t(long j6, boolean z6) {
        if (I()) {
            return;
        }
        int y6 = this.f20453m.y();
        this.f20453m.q(j6, z6, true);
        int y7 = this.f20453m.y();
        if (y7 > y6) {
            long z7 = this.f20453m.z();
            int i6 = 0;
            while (true) {
                a0[] a0VarArr = this.f20454n;
                if (i6 >= a0VarArr.length) {
                    break;
                }
                a0VarArr[i6].q(z7, z6, this.f20444d[i6]);
                i6++;
            }
        }
        B(y7);
    }
}
