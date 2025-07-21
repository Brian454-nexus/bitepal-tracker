package g1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.InterfaceC1121c;
import g1.K0;
import h1.v1;
import kotlin.jvm.internal.LongCompanionObject;
import w1.InterfaceC2212D;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1328e implements J0, K0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f14535b;

    /* renamed from: d, reason: collision with root package name */
    public L0 f14537d;

    /* renamed from: e, reason: collision with root package name */
    public int f14538e;

    /* renamed from: f, reason: collision with root package name */
    public v1 f14539f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1121c f14540g;

    /* renamed from: h, reason: collision with root package name */
    public int f14541h;

    /* renamed from: i, reason: collision with root package name */
    public w1.b0 f14542i;

    /* renamed from: j, reason: collision with root package name */
    public Z0.q[] f14543j;

    /* renamed from: k, reason: collision with root package name */
    public long f14544k;

    /* renamed from: l, reason: collision with root package name */
    public long f14545l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14547n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14548o;

    /* renamed from: q, reason: collision with root package name */
    public K0.a f14550q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14534a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final C1337i0 f14536c = new C1337i0();

    /* renamed from: m, reason: collision with root package name */
    public long f14546m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public Z0.G f14549p = Z0.G.f6652a;

    public AbstractC1328e(int i6) {
        this.f14535b = i6;
    }

    @Override // g1.K0
    public int G() {
        return 0;
    }

    @Override // g1.H0.b
    public void H(int i6, Object obj) {
    }

    @Override // g1.K0
    public final void I(K0.a aVar) {
        synchronized (this.f14534a) {
            this.f14550q = aVar;
        }
    }

    @Override // g1.J0
    public final void J(int i6, v1 v1Var, InterfaceC1121c interfaceC1121c) {
        this.f14538e = i6;
        this.f14539f = v1Var;
        this.f14540g = interfaceC1121c;
        g0();
    }

    @Override // g1.J0
    public final void K() {
        ((w1.b0) AbstractC1119a.e(this.f14542i)).a();
    }

    @Override // g1.J0
    public final long L() {
        return this.f14546m;
    }

    @Override // g1.J0
    public final void O(long j6) {
        q0(j6, false);
    }

    @Override // g1.J0
    public final boolean P() {
        return this.f14547n;
    }

    @Override // g1.J0
    public final void Q(L0 l02, Z0.q[] qVarArr, w1.b0 b0Var, long j6, boolean z6, boolean z7, long j7, long j8, InterfaceC2212D.b bVar) {
        AbstractC1119a.g(this.f14541h == 0);
        this.f14537d = l02;
        this.f14541h = 1;
        f0(z6, z7);
        t(qVarArr, b0Var, j7, j8, bVar);
        q0(j7, z6);
    }

    @Override // g1.J0
    public InterfaceC1345m0 R() {
        return null;
    }

    @Override // g1.J0
    public final void S(Z0.G g6) {
        if (AbstractC1117K.c(this.f14549p, g6)) {
            return;
        }
        this.f14549p = g6;
        o0(g6);
    }

    public final C1342l U(Throwable th, Z0.q qVar, int i6) {
        return V(th, qVar, false, i6);
    }

    public final C1342l V(Throwable th, Z0.q qVar, boolean z6, int i6) {
        int i7;
        if (qVar != null && !this.f14548o) {
            this.f14548o = true;
            try {
                i7 = K0.T(b(qVar));
            } catch (C1342l unused) {
            } finally {
                this.f14548o = false;
            }
            return C1342l.b(th, getName(), Z(), qVar, i7, z6, i6);
        }
        i7 = 4;
        return C1342l.b(th, getName(), Z(), qVar, i7, z6, i6);
    }

    public final InterfaceC1121c W() {
        return (InterfaceC1121c) AbstractC1119a.e(this.f14540g);
    }

    public final L0 X() {
        return (L0) AbstractC1119a.e(this.f14537d);
    }

    public final C1337i0 Y() {
        this.f14536c.a();
        return this.f14536c;
    }

    public final int Z() {
        return this.f14538e;
    }

    @Override // g1.J0
    public final void a() {
        AbstractC1119a.g(this.f14541h == 0);
        this.f14536c.a();
        k0();
    }

    public final long a0() {
        return this.f14545l;
    }

    public final v1 b0() {
        return (v1) AbstractC1119a.e(this.f14539f);
    }

    public final Z0.q[] c0() {
        return (Z0.q[]) AbstractC1119a.e(this.f14543j);
    }

    public final boolean d0() {
        return p() ? this.f14547n : ((w1.b0) AbstractC1119a.e(this.f14542i)).c();
    }

    public abstract void e0();

    @Override // g1.J0
    public final int f() {
        return this.f14541h;
    }

    public void f0(boolean z6, boolean z7) {
    }

    public void g0() {
    }

    public abstract void h0(long j6, boolean z6);

    public void i0() {
    }

    @Override // g1.J0
    public final void j() {
        AbstractC1119a.g(this.f14541h == 1);
        this.f14536c.a();
        this.f14541h = 0;
        this.f14542i = null;
        this.f14543j = null;
        this.f14547n = false;
        e0();
    }

    public final void j0() {
        K0.a aVar;
        synchronized (this.f14534a) {
            aVar = this.f14550q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // g1.J0
    public final w1.b0 k() {
        return this.f14542i;
    }

    public void k0() {
    }

    @Override // g1.J0, g1.K0
    public final int l() {
        return this.f14535b;
    }

    public void l0() {
    }

    public void m0() {
    }

    @Override // g1.K0
    public final void n() {
        synchronized (this.f14534a) {
            this.f14550q = null;
        }
    }

    public void n0(Z0.q[] qVarArr, long j6, long j7, InterfaceC2212D.b bVar) {
    }

    public void o0(Z0.G g6) {
    }

    @Override // g1.J0
    public final boolean p() {
        return this.f14546m == Long.MIN_VALUE;
    }

    public final int p0(C1337i0 c1337i0, f1.f fVar, int i6) {
        int k6 = ((w1.b0) AbstractC1119a.e(this.f14542i)).k(c1337i0, fVar, i6);
        if (k6 != -4) {
            if (k6 == -5) {
                Z0.q qVar = (Z0.q) AbstractC1119a.e(c1337i0.f14685b);
                if (qVar.f6995s != LongCompanionObject.MAX_VALUE) {
                    c1337i0.f14685b = qVar.a().s0(qVar.f6995s + this.f14544k).K();
                }
            }
            return k6;
        }
        if (fVar.i()) {
            this.f14546m = Long.MIN_VALUE;
            return this.f14547n ? -4 : -3;
        }
        long j6 = fVar.f14007f + this.f14544k;
        fVar.f14007f = j6;
        this.f14546m = Math.max(this.f14546m, j6);
        return k6;
    }

    public final void q0(long j6, boolean z6) {
        this.f14547n = false;
        this.f14545l = j6;
        this.f14546m = j6;
        h0(j6, z6);
    }

    public int r0(long j6) {
        return ((w1.b0) AbstractC1119a.e(this.f14542i)).n(j6 - this.f14544k);
    }

    @Override // g1.J0
    public final void release() {
        AbstractC1119a.g(this.f14541h == 0);
        i0();
    }

    @Override // g1.J0
    public final void start() {
        AbstractC1119a.g(this.f14541h == 1);
        this.f14541h = 2;
        l0();
    }

    @Override // g1.J0
    public final void stop() {
        AbstractC1119a.g(this.f14541h == 2);
        this.f14541h = 1;
        m0();
    }

    @Override // g1.J0
    public final void t(Z0.q[] qVarArr, w1.b0 b0Var, long j6, long j7, InterfaceC2212D.b bVar) {
        AbstractC1119a.g(!this.f14547n);
        this.f14542i = b0Var;
        if (this.f14546m == Long.MIN_VALUE) {
            this.f14546m = j6;
        }
        this.f14543j = qVarArr;
        this.f14544k = j7;
        n0(qVarArr, j6, j7, bVar);
    }

    @Override // g1.J0
    public final void u() {
        this.f14547n = true;
    }

    @Override // g1.J0
    public final K0 z() {
        return this;
    }
}
