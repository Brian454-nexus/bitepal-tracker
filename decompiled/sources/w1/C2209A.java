package w1;

import Z0.C0829a;
import Z0.G;
import c1.AbstractC1117K;
import w1.InterfaceC2212D;

/* renamed from: w1.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2209A extends n0 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f19733m;

    /* renamed from: n, reason: collision with root package name */
    public final G.c f19734n;

    /* renamed from: o, reason: collision with root package name */
    public final G.b f19735o;

    /* renamed from: p, reason: collision with root package name */
    public a f19736p;

    /* renamed from: q, reason: collision with root package name */
    public C2240z f19737q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19738r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19739s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19740t;

    /* renamed from: w1.A$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC2237w {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f19741h = new Object();

        /* renamed from: f, reason: collision with root package name */
        public final Object f19742f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f19743g;

        public a(Z0.G g6, Object obj, Object obj2) {
            super(g6);
            this.f19742f = obj;
            this.f19743g = obj2;
        }

        public static a u(Z0.u uVar) {
            return new a(new b(uVar), G.c.f6674q, f19741h);
        }

        public static a v(Z0.G g6, Object obj, Object obj2) {
            return new a(g6, obj, obj2);
        }

        @Override // w1.AbstractC2237w, Z0.G
        public int b(Object obj) {
            Object obj2;
            Z0.G g6 = this.f20118e;
            if (f19741h.equals(obj) && (obj2 = this.f19743g) != null) {
                obj = obj2;
            }
            return g6.b(obj);
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            this.f20118e.g(i6, bVar, z6);
            if (AbstractC1117K.c(bVar.f6662b, this.f19743g) && z6) {
                bVar.f6662b = f19741h;
            }
            return bVar;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public Object m(int i6) {
            Object m6 = this.f20118e.m(i6);
            return AbstractC1117K.c(m6, this.f19743g) ? f19741h : m6;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            this.f20118e.o(i6, cVar, j6);
            if (AbstractC1117K.c(cVar.f6684a, this.f19742f)) {
                cVar.f6684a = G.c.f6674q;
            }
            return cVar;
        }

        public a t(Z0.G g6) {
            return new a(g6, this.f19742f, this.f19743g);
        }
    }

    /* renamed from: w1.A$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Z0.G {

        /* renamed from: e, reason: collision with root package name */
        public final Z0.u f19744e;

        public b(Z0.u uVar) {
            this.f19744e = uVar;
        }

        @Override // Z0.G
        public int b(Object obj) {
            return obj == a.f19741h ? 0 : -1;
        }

        @Override // Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            bVar.t(z6 ? 0 : null, z6 ? a.f19741h : null, 0, -9223372036854775807L, 0L, C0829a.f6828g, true);
            return bVar;
        }

        @Override // Z0.G
        public int i() {
            return 1;
        }

        @Override // Z0.G
        public Object m(int i6) {
            return a.f19741h;
        }

        @Override // Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            cVar.g(G.c.f6674q, this.f19744e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f6694k = true;
            return cVar;
        }

        @Override // Z0.G
        public int p() {
            return 1;
        }
    }

    public C2209A(InterfaceC2212D interfaceC2212D, boolean z6) {
        super(interfaceC2212D);
        this.f19733m = z6 && interfaceC2212D.m();
        this.f19734n = new G.c();
        this.f19735o = new G.b();
        Z0.G o6 = interfaceC2212D.o();
        if (o6 == null) {
            this.f19736p = a.u(interfaceC2212D.g());
        } else {
            this.f19736p = a.v(o6, null, null);
            this.f19740t = true;
        }
    }

    @Override // w1.AbstractC2223h, w1.AbstractC2216a
    public void E() {
        this.f19739s = false;
        this.f19738r = false;
        super.E();
    }

    @Override // w1.n0
    public InterfaceC2212D.b M(InterfaceC2212D.b bVar) {
        return bVar.a(W(bVar.f19753a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // w1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(Z0.G r15) {
        /*
            r14 = this;
            boolean r0 = r14.f19739s
            if (r0 == 0) goto L19
            w1.A$a r0 = r14.f19736p
            w1.A$a r15 = r0.t(r15)
            r14.f19736p = r15
            w1.z r15 = r14.f19737q
            if (r15 == 0) goto Lb1
            long r0 = r15.n()
            r14.Z(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.f19740t
            if (r0 == 0) goto L2a
            w1.A$a r0 = r14.f19736p
            w1.A$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = Z0.G.c.f6674q
            java.lang.Object r1 = w1.C2209A.a.f19741h
            w1.A$a r15 = w1.C2209A.a.v(r15, r0, r1)
        L32:
            r14.f19736p = r15
            goto Lb1
        L36:
            Z0.G$c r0 = r14.f19734n
            r1 = 0
            r15.n(r1, r0)
            Z0.G$c r0 = r14.f19734n
            long r2 = r0.c()
            Z0.G$c r0 = r14.f19734n
            java.lang.Object r0 = r0.f6684a
            w1.z r4 = r14.f19737q
            if (r4 == 0) goto L74
            long r4 = r4.q()
            w1.A$a r6 = r14.f19736p
            w1.z r7 = r14.f19737q
            w1.D$b r7 = r7.f20132a
            java.lang.Object r7 = r7.f19753a
            Z0.G$b r8 = r14.f19735o
            r6.h(r7, r8)
            Z0.G$b r6 = r14.f19735o
            long r6 = r6.n()
            long r6 = r6 + r4
            w1.A$a r4 = r14.f19736p
            Z0.G$c r5 = r14.f19734n
            Z0.G$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            Z0.G$c r9 = r14.f19734n
            Z0.G$b r10 = r14.f19735o
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            boolean r15 = r14.f19740t
            if (r15 == 0) goto L94
            w1.A$a r15 = r14.f19736p
            w1.A$a r15 = r15.t(r8)
            goto L98
        L94:
            w1.A$a r15 = w1.C2209A.a.v(r8, r0, r1)
        L98:
            r14.f19736p = r15
            w1.z r15 = r14.f19737q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.Z(r2)
            if (r0 == 0) goto Lb1
            w1.D$b r15 = r15.f20132a
            java.lang.Object r0 = r15.f19753a
            java.lang.Object r0 = r14.X(r0)
            w1.D$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.f19740t = r0
            r14.f19739s = r0
            w1.A$a r0 = r14.f19736p
            r14.D(r0)
            if (r15 == 0) goto Lc9
            w1.z r0 = r14.f19737q
            java.lang.Object r0 = c1.AbstractC1119a.e(r0)
            w1.z r0 = (w1.C2240z) r0
            r0.a(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2209A.R(Z0.G):void");
    }

    @Override // w1.n0
    public void U() {
        if (this.f19733m) {
            return;
        }
        this.f19738r = true;
        T();
    }

    @Override // w1.InterfaceC2212D
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public C2240z d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        C2240z c2240z = new C2240z(bVar, bVar2, j6);
        c2240z.y(this.f20080k);
        if (this.f19739s) {
            c2240z.a(bVar.a(X(bVar.f19753a)));
            return c2240z;
        }
        this.f19737q = c2240z;
        if (!this.f19738r) {
            this.f19738r = true;
            T();
        }
        return c2240z;
    }

    public final Object W(Object obj) {
        return (this.f19736p.f19743g == null || !this.f19736p.f19743g.equals(obj)) ? obj : a.f19741h;
    }

    public final Object X(Object obj) {
        return (this.f19736p.f19743g == null || !obj.equals(a.f19741h)) ? obj : this.f19736p.f19743g;
    }

    public Z0.G Y() {
        return this.f19736p;
    }

    public final boolean Z(long j6) {
        C2240z c2240z = this.f19737q;
        int b6 = this.f19736p.b(c2240z.f20132a.f19753a);
        if (b6 == -1) {
            return false;
        }
        long j7 = this.f19736p.f(b6, this.f19735o).f6664d;
        if (j7 != -9223372036854775807L && j6 >= j7) {
            j6 = Math.max(0L, j7 - 1);
        }
        c2240z.w(j6);
        return true;
    }

    @Override // w1.AbstractC2223h, w1.InterfaceC2212D
    public void l() {
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((C2240z) interfaceC2211C).x();
        if (interfaceC2211C == this.f19737q) {
            this.f19737q = null;
        }
    }

    @Override // w1.n0, w1.InterfaceC2212D
    public void s(Z0.u uVar) {
        if (this.f19740t) {
            this.f19736p = this.f19736p.t(new j0(this.f19736p.f20118e, uVar));
        } else {
            this.f19736p = a.u(uVar);
        }
        this.f20080k.s(uVar);
    }
}
