package K1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.r;
import E1.u;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements InterfaceC0314p {

    /* renamed from: q, reason: collision with root package name */
    public static final u f2965q = new u() { // from class: K1.b
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return c.b();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public r f2971f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2973h;

    /* renamed from: i, reason: collision with root package name */
    public long f2974i;

    /* renamed from: j, reason: collision with root package name */
    public int f2975j;

    /* renamed from: k, reason: collision with root package name */
    public int f2976k;

    /* renamed from: l, reason: collision with root package name */
    public int f2977l;

    /* renamed from: m, reason: collision with root package name */
    public long f2978m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2979n;

    /* renamed from: o, reason: collision with root package name */
    public a f2980o;

    /* renamed from: p, reason: collision with root package name */
    public f f2981p;

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f2966a = new C1144z(4);

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f2967b = new C1144z(9);

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f2968c = new C1144z(11);

    /* renamed from: d, reason: collision with root package name */
    public final C1144z f2969d = new C1144z();

    /* renamed from: e, reason: collision with root package name */
    public final d f2970e = new d();

    /* renamed from: g, reason: collision with root package name */
    public int f2972g = 1;

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new c()};
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        if (j6 == 0) {
            this.f2972g = 1;
            this.f2973h = false;
        } else {
            this.f2972g = 3;
        }
        this.f2975j = 0;
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f2971f = rVar;
    }

    public final void e() {
        if (this.f2979n) {
            return;
        }
        this.f2971f.n(new J.b(-9223372036854775807L));
        this.f2979n = true;
    }

    public final long f() {
        if (this.f2973h) {
            return this.f2974i + this.f2978m;
        }
        if (this.f2970e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f2978m;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        AbstractC1119a.i(this.f2971f);
        while (true) {
            int i7 = this.f2972g;
            if (i7 != 1) {
                if (i7 == 2) {
                    n(interfaceC0315q);
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC0315q)) {
                        return 0;
                    }
                } else if (!m(interfaceC0315q)) {
                    return -1;
                }
            } else if (!k(interfaceC0315q)) {
                return -1;
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.s(this.f2966a.e(), 0, 3);
        this.f2966a.T(0);
        if (this.f2966a.J() != 4607062) {
            return false;
        }
        interfaceC0315q.s(this.f2966a.e(), 0, 2);
        this.f2966a.T(0);
        if ((this.f2966a.M() & 250) != 0) {
            return false;
        }
        interfaceC0315q.s(this.f2966a.e(), 0, 4);
        this.f2966a.T(0);
        int p6 = this.f2966a.p();
        interfaceC0315q.o();
        interfaceC0315q.j(p6);
        interfaceC0315q.s(this.f2966a.e(), 0, 4);
        this.f2966a.T(0);
        return this.f2966a.p() == 0;
    }

    public final C1144z j(InterfaceC0315q interfaceC0315q) {
        if (this.f2977l > this.f2969d.b()) {
            C1144z c1144z = this.f2969d;
            c1144z.R(new byte[Math.max(c1144z.b() * 2, this.f2977l)], 0);
        } else {
            this.f2969d.T(0);
        }
        this.f2969d.S(this.f2977l);
        interfaceC0315q.readFully(this.f2969d.e(), 0, this.f2977l);
        return this.f2969d;
    }

    public final boolean k(InterfaceC0315q interfaceC0315q) {
        if (!interfaceC0315q.c(this.f2967b.e(), 0, 9, true)) {
            return false;
        }
        this.f2967b.T(0);
        this.f2967b.U(4);
        int G6 = this.f2967b.G();
        boolean z6 = (G6 & 4) != 0;
        boolean z7 = (G6 & 1) != 0;
        if (z6 && this.f2980o == null) {
            this.f2980o = new a(this.f2971f.a(8, 1));
        }
        if (z7 && this.f2981p == null) {
            this.f2981p = new f(this.f2971f.a(9, 2));
        }
        this.f2971f.k();
        this.f2975j = this.f2967b.p() - 5;
        this.f2972g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(E1.InterfaceC0315q r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f2976k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            K1.a r3 = r9.f2980o
            if (r3 == 0) goto L23
            r9.e()
            K1.a r2 = r9.f2980o
            c1.z r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            K1.f r3 = r9.f2981p
            if (r3 == 0) goto L39
            r9.e()
            K1.f r2 = r9.f2981p
            c1.z r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f2979n
            if (r2 != 0) goto L6e
            K1.d r2 = r9.f2970e
            c1.z r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            K1.d r0 = r9.f2970e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            E1.r r2 = r9.f2971f
            E1.E r3 = new E1.E
            K1.d r7 = r9.f2970e
            long[] r7 = r7.e()
            K1.d r8 = r9.f2970e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.n(r3)
            r9.f2979n = r6
            goto L21
        L6e:
            int r0 = r9.f2977l
            r10.p(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f2973h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f2973h = r6
            K1.d r10 = r9.f2970e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f2978m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f2974i = r1
        L8f:
            r10 = 4
            r9.f2975j = r10
            r10 = 2
            r9.f2972g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.c.l(E1.q):boolean");
    }

    public final boolean m(InterfaceC0315q interfaceC0315q) {
        if (!interfaceC0315q.c(this.f2968c.e(), 0, 11, true)) {
            return false;
        }
        this.f2968c.T(0);
        this.f2976k = this.f2968c.G();
        this.f2977l = this.f2968c.J();
        this.f2978m = this.f2968c.J();
        this.f2978m = ((this.f2968c.G() << 24) | this.f2978m) * 1000;
        this.f2968c.U(3);
        this.f2972g = 4;
        return true;
    }

    public final void n(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.p(this.f2975j);
        this.f2975j = 0;
        this.f2972g = 3;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
