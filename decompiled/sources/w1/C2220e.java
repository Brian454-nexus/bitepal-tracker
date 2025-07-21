package w1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import kotlin.jvm.internal.LongCompanionObject;
import w1.C2221f;
import w1.InterfaceC2211C;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2220e implements InterfaceC2211C, InterfaceC2211C.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2211C f19965a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2211C.a f19966b;

    /* renamed from: c, reason: collision with root package name */
    public a[] f19967c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public long f19968d;

    /* renamed from: e, reason: collision with root package name */
    public long f19969e;

    /* renamed from: f, reason: collision with root package name */
    public long f19970f;

    /* renamed from: g, reason: collision with root package name */
    public C2221f.b f19971g;

    /* renamed from: w1.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f19972a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19973b;

        public a(b0 b0Var) {
            this.f19972a = b0Var;
        }

        @Override // w1.b0
        public void a() {
            this.f19972a.a();
        }

        public void b() {
            this.f19973b = false;
        }

        @Override // w1.b0
        public boolean c() {
            return !C2220e.this.n() && this.f19972a.c();
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            if (C2220e.this.n()) {
                return -3;
            }
            if (this.f19973b) {
                fVar.m(4);
                return -4;
            }
            long f6 = C2220e.this.f();
            int k6 = this.f19972a.k(c1337i0, fVar, i6);
            if (k6 == -5) {
                Z0.q qVar = (Z0.q) AbstractC1119a.e(c1337i0.f14685b);
                int i7 = qVar.f6969E;
                if (i7 != 0 || qVar.f6970F != 0) {
                    C2220e c2220e = C2220e.this;
                    if (c2220e.f19969e != 0) {
                        i7 = 0;
                    }
                    c1337i0.f14685b = qVar.a().V(i7).W(c2220e.f19970f == Long.MIN_VALUE ? qVar.f6970F : 0).K();
                }
                return -5;
            }
            long j6 = C2220e.this.f19970f;
            if (j6 == Long.MIN_VALUE || ((k6 != -4 || fVar.f14007f < j6) && !(k6 == -3 && f6 == Long.MIN_VALUE && !fVar.f14006e))) {
                return k6;
            }
            fVar.f();
            fVar.m(4);
            this.f19973b = true;
            return -4;
        }

        @Override // w1.b0
        public int n(long j6) {
            if (C2220e.this.n()) {
                return -3;
            }
            return this.f19972a.n(j6);
        }
    }

    public C2220e(InterfaceC2211C interfaceC2211C, boolean z6, long j6, long j7) {
        this.f19965a = interfaceC2211C;
        this.f19968d = z6 ? j6 : -9223372036854775807L;
        this.f19969e = j6;
        this.f19970f = j7;
    }

    public static boolean v(long j6, z1.x[] xVarArr) {
        if (j6 != 0) {
            for (z1.x xVar : xVarArr) {
                if (xVar != null) {
                    Z0.q n6 = xVar.n();
                    if (!Z0.y.a(n6.f6990n, n6.f6986j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final N0 a(long j6, N0 n02) {
        long q6 = AbstractC1117K.q(n02.f14390a, 0L, j6 - this.f19969e);
        long j7 = n02.f14391b;
        long j8 = this.f19970f;
        long q7 = AbstractC1117K.q(j7, 0L, j8 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j8 - j6);
        return (q6 == n02.f14390a && q7 == n02.f14391b) ? n02 : new N0(q6, q7);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return this.f19965a.b(c1343l0);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        long d6 = this.f19965a.d();
        if (d6 != Long.MIN_VALUE) {
            long j6 = this.f19970f;
            if (j6 == Long.MIN_VALUE || d6 < j6) {
                return d6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f19965a.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        long f6 = this.f19965a.f();
        if (f6 != Long.MIN_VALUE) {
            long j6 = this.f19970f;
            if (j6 == Long.MIN_VALUE || f6 < j6) {
                return f6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        long j7 = this.f19969e;
        if (j6 == j7) {
            return j7;
        }
        return this.f19965a.g(j6, a(j6, n02));
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f19965a.h(j6);
    }

    @Override // w1.InterfaceC2211C.a
    public void i(InterfaceC2211C interfaceC2211C) {
        if (this.f19971g != null) {
            return;
        }
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f19966b)).i(this);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        C2221f.b bVar = this.f19971g;
        if (bVar != null) {
            throw bVar;
        }
        this.f19965a.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // w1.InterfaceC2211C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f19968d = r0
            w1.e$a[] r0 = r5.f19967c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            w1.C r0 = r5.f19965a
            long r0 = r0.m(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f19969e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f19970f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            c1.AbstractC1119a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2220e.m(long):long");
    }

    public boolean n() {
        return this.f19968d != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r10 > r13) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    @Override // w1.InterfaceC2211C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o(z1.x[] r10, boolean[] r11, w1.b0[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            w1.e$a[] r0 = new w1.C2220e.a[r0]
            r9.f19967c = r0
            int r0 = r12.length
            w1.b0[] r4 = new w1.b0[r0]
            r0 = 0
            r1 = r0
        La:
            int r2 = r12.length
            r8 = 0
            if (r1 >= r2) goto L1f
            w1.e$a[] r2 = r9.f19967c
            r3 = r12[r1]
            w1.e$a r3 = (w1.C2220e.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1a
            w1.b0 r8 = r3.f19972a
        L1a:
            r4[r1] = r8
            int r1 = r1 + 1
            goto La
        L1f:
            w1.C r1 = r9.f19965a
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            long r10 = r1.o(r2, r3, r4, r5, r6)
            boolean r13 = r9.n()
            if (r13 == 0) goto L3d
            long r13 = r9.f19969e
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 != 0) goto L3d
            boolean r13 = v(r13, r2)
            if (r13 == 0) goto L3d
            r13 = r10
            goto L42
        L3d:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L42:
            r9.f19968d = r13
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L5d
            long r13 = r9.f19969e
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 < 0) goto L5b
            long r13 = r9.f19970f
            r1 = -9223372036854775808
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 == 0) goto L5d
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 > 0) goto L5b
            goto L5d
        L5b:
            r13 = r0
            goto L5e
        L5d:
            r13 = 1
        L5e:
            c1.AbstractC1119a.g(r13)
        L61:
            int r13 = r12.length
            if (r0 >= r13) goto L87
            r13 = r4[r0]
            if (r13 != 0) goto L6d
            w1.e$a[] r13 = r9.f19967c
            r13[r0] = r8
            goto L7e
        L6d:
            w1.e$a[] r14 = r9.f19967c
            r15 = r14[r0]
            if (r15 == 0) goto L77
            w1.b0 r15 = r15.f19972a
            if (r15 == r13) goto L7e
        L77:
            w1.e$a r15 = new w1.e$a
            r15.<init>(r13)
            r14[r0] = r15
        L7e:
            w1.e$a[] r13 = r9.f19967c
            r13 = r13[r0]
            r12[r0] = r13
            int r0 = r0 + 1
            goto L61
        L87:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2220e.o(z1.x[], boolean[], w1.b0[], boolean[], long):long");
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        if (n()) {
            long j6 = this.f19968d;
            this.f19968d = -9223372036854775807L;
            long p6 = p();
            return p6 != -9223372036854775807L ? p6 : j6;
        }
        long p7 = this.f19965a.p();
        if (p7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC1119a.g(p7 >= this.f19969e);
        long j7 = this.f19970f;
        AbstractC1119a.g(j7 == Long.MIN_VALUE || p7 <= j7);
        return p7;
    }

    @Override // w1.c0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f19966b)).j(this);
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f19965a.r();
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f19966b = aVar;
        this.f19965a.s(this, j6);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        this.f19965a.t(j6, z6);
    }

    public void u(C2221f.b bVar) {
        this.f19971g = bVar;
    }

    public void w(long j6, long j7) {
        this.f19969e = j6;
        this.f19970f = j7;
    }
}
