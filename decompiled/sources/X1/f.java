package X1;

import E1.B;
import E1.C0311m;
import E1.D;
import E1.F;
import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.O;
import E1.r;
import E1.u;
import S1.h;
import S1.l;
import S1.n;
import X1.g;
import Z0.q;
import Z0.x;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;
import java.io.EOFException;
import java.math.RoundingMode;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements InterfaceC0314p {

    /* renamed from: u, reason: collision with root package name */
    public static final u f6052u = new u() { // from class: X1.d
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return f.b();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public static final h.a f6053v = new h.a() { // from class: X1.e
        @Override // S1.h.a
        public final boolean a(int i6, int i7, int i8, int i9, int i10) {
            return f.e(i6, i7, i8, i9, i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f6054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6055b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f6056c;

    /* renamed from: d, reason: collision with root package name */
    public final F.a f6057d;

    /* renamed from: e, reason: collision with root package name */
    public final B f6058e;

    /* renamed from: f, reason: collision with root package name */
    public final D f6059f;

    /* renamed from: g, reason: collision with root package name */
    public final O f6060g;

    /* renamed from: h, reason: collision with root package name */
    public r f6061h;

    /* renamed from: i, reason: collision with root package name */
    public O f6062i;

    /* renamed from: j, reason: collision with root package name */
    public O f6063j;

    /* renamed from: k, reason: collision with root package name */
    public int f6064k;

    /* renamed from: l, reason: collision with root package name */
    public x f6065l;

    /* renamed from: m, reason: collision with root package name */
    public long f6066m;

    /* renamed from: n, reason: collision with root package name */
    public long f6067n;

    /* renamed from: o, reason: collision with root package name */
    public long f6068o;

    /* renamed from: p, reason: collision with root package name */
    public int f6069p;

    /* renamed from: q, reason: collision with root package name */
    public g f6070q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6071r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6072s;

    /* renamed from: t, reason: collision with root package name */
    public long f6073t;

    public f() {
        this(0);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new f()};
    }

    public static /* synthetic */ boolean e(int i6, int i7, int i8, int i9, int i10) {
        if (i7 == 67 && i8 == 79 && i9 == 77 && (i10 == 77 || i6 == 2)) {
            return true;
        }
        if (i7 == 77 && i8 == 76 && i9 == 76) {
            return i10 == 84 || i6 == 2;
        }
        return false;
    }

    private void f() {
        AbstractC1119a.i(this.f6062i);
        AbstractC1117K.i(this.f6061h);
    }

    public static long o(x xVar) {
        if (xVar == null) {
            return -9223372036854775807L;
        }
        int f6 = xVar.f();
        for (int i6 = 0; i6 < f6; i6++) {
            x.b e6 = xVar.e(i6);
            if (e6 instanceof n) {
                n nVar = (n) e6;
                if (nVar.f4674a.equals("TLEN")) {
                    return AbstractC1117K.J0(Long.parseLong((String) nVar.f4688d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int p(C1144z c1144z, int i6) {
        if (c1144z.g() >= i6 + 4) {
            c1144z.T(i6);
            int p6 = c1144z.p();
            if (p6 == 1483304551 || p6 == 1231971951) {
                return p6;
            }
        }
        if (c1144z.g() < 40) {
            return 0;
        }
        c1144z.T(36);
        return c1144z.p() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean q(int i6, long j6) {
        return ((long) (i6 & (-128000))) == (j6 & (-128000));
    }

    public static c r(x xVar, long j6) {
        if (xVar == null) {
            return null;
        }
        int f6 = xVar.f();
        for (int i6 = 0; i6 < f6; i6++) {
            x.b e6 = xVar.e(i6);
            if (e6 instanceof l) {
                return c.a(j6, (l) e6, o(xVar));
            }
        }
        return null;
    }

    private int v(InterfaceC0315q interfaceC0315q) {
        if (this.f6069p == 0) {
            interfaceC0315q.o();
            if (t(interfaceC0315q)) {
                return -1;
            }
            this.f6056c.T(0);
            int p6 = this.f6056c.p();
            if (!q(p6, this.f6064k) || F.j(p6) == -1) {
                interfaceC0315q.p(1);
                this.f6064k = 0;
                return 0;
            }
            this.f6057d.a(p6);
            if (this.f6066m == -9223372036854775807L) {
                this.f6066m = this.f6070q.b(interfaceC0315q.getPosition());
                if (this.f6055b != -9223372036854775807L) {
                    this.f6066m += this.f6055b - this.f6070q.b(0L);
                }
            }
            this.f6069p = this.f6057d.f905c;
            g gVar = this.f6070q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(k(this.f6067n + r0.f909g), interfaceC0315q.getPosition() + this.f6057d.f905c);
                if (this.f6072s && bVar.a(this.f6073t)) {
                    this.f6072s = false;
                    this.f6063j = this.f6062i;
                }
            }
        }
        int c6 = this.f6063j.c(interfaceC0315q, this.f6069p, true);
        if (c6 == -1) {
            return -1;
        }
        int i6 = this.f6069p - c6;
        this.f6069p = i6;
        if (i6 > 0) {
            return 0;
        }
        this.f6063j.f(k(this.f6067n), 1, this.f6057d.f905c, 0, null);
        this.f6067n += this.f6057d.f909g;
        this.f6069p = 0;
        return 0;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f6064k = 0;
        this.f6066m = -9223372036854775807L;
        this.f6067n = 0L;
        this.f6069p = 0;
        this.f6073t = j7;
        g gVar = this.f6070q;
        if (!(gVar instanceof b) || ((b) gVar).a(j7)) {
            return;
        }
        this.f6072s = true;
        this.f6063j = this.f6060g;
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f6061h = rVar;
        O a6 = rVar.a(0, 1);
        this.f6062i = a6;
        this.f6063j = a6;
        this.f6061h.k();
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        f();
        int u6 = u(interfaceC0315q);
        if (u6 == -1 && (this.f6070q instanceof b)) {
            long k6 = k(this.f6067n);
            if (this.f6070q.l() != k6) {
                ((b) this.f6070q).d(k6);
                this.f6061h.n(this.f6070q);
            }
        }
        return u6;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        return w(interfaceC0315q, true);
    }

    public final g j(InterfaceC0315q interfaceC0315q) {
        long o6;
        long j6;
        g s6 = s(interfaceC0315q);
        c r6 = r(this.f6065l, interfaceC0315q.getPosition());
        if (this.f6071r) {
            return new g.a();
        }
        if ((this.f6054a & 4) != 0) {
            if (r6 != null) {
                o6 = r6.l();
                j6 = r6.e();
            } else if (s6 != null) {
                o6 = s6.l();
                j6 = s6.e();
            } else {
                o6 = o(this.f6065l);
                j6 = -1;
            }
            s6 = new b(o6, interfaceC0315q.getPosition(), j6);
        } else if (r6 != null) {
            s6 = r6;
        } else if (s6 == null) {
            s6 = null;
        }
        if (s6 == null || !(s6.f() || (this.f6054a & 1) == 0)) {
            return n(interfaceC0315q, (this.f6054a & 2) != 0);
        }
        return s6;
    }

    public final long k(long j6) {
        return this.f6066m + ((j6 * 1000000) / this.f6057d.f906d);
    }

    public void l() {
        this.f6071r = true;
    }

    public final g m(long j6, i iVar, long j7) {
        long j8;
        long j9;
        long a6 = iVar.a();
        if (a6 == -9223372036854775807L) {
            return null;
        }
        long j10 = iVar.f6081c;
        if (j10 != -1) {
            long j11 = j6 + j10;
            j8 = j10 - iVar.f6079a.f905c;
            j9 = j11;
        } else {
            if (j7 == -1) {
                return null;
            }
            j8 = (j7 - j6) - iVar.f6079a.f905c;
            j9 = j7;
        }
        long j12 = j8;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j9, j6 + iVar.f6079a.f905c, C6.g.d(AbstractC1117K.Z0(j12, 8000000L, a6, roundingMode)), C6.g.d(B6.e.b(j12, iVar.f6080b, roundingMode)), false);
    }

    public final g n(InterfaceC0315q interfaceC0315q, boolean z6) {
        interfaceC0315q.s(this.f6056c.e(), 0, 4);
        this.f6056c.T(0);
        this.f6057d.a(this.f6056c.p());
        return new a(interfaceC0315q.a(), interfaceC0315q.getPosition(), this.f6057d, z6);
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public final g s(InterfaceC0315q interfaceC0315q) {
        int i6;
        int i7;
        C1144z c1144z = new C1144z(this.f6057d.f905c);
        interfaceC0315q.s(c1144z.e(), 0, this.f6057d.f905c);
        F.a aVar = this.f6057d;
        int i8 = 21;
        if ((aVar.f903a & 1) != 0) {
            if (aVar.f907e != 1) {
                i8 = 36;
            }
        } else if (aVar.f907e == 1) {
            i8 = 13;
        }
        int p6 = p(c1144z, i8);
        if (p6 != 1231971951) {
            if (p6 == 1447187017) {
                h a6 = h.a(interfaceC0315q.a(), interfaceC0315q.getPosition(), this.f6057d, c1144z);
                interfaceC0315q.p(this.f6057d.f905c);
                return a6;
            }
            if (p6 != 1483304551) {
                interfaceC0315q.o();
                return null;
            }
        }
        i b6 = i.b(this.f6057d, c1144z);
        if (!this.f6058e.a() && (i6 = b6.f6082d) != -1 && (i7 = b6.f6083e) != -1) {
            B b7 = this.f6058e;
            b7.f877a = i6;
            b7.f878b = i7;
        }
        long position = interfaceC0315q.getPosition();
        if (interfaceC0315q.a() != -1 && b6.f6081c != -1 && interfaceC0315q.a() != b6.f6081c + position) {
            AbstractC1133o.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC0315q.a() + ") and Xing frame (" + (b6.f6081c + position) + "), using Xing value.");
        }
        interfaceC0315q.p(this.f6057d.f905c);
        return p6 == 1483304551 ? j.a(b6, position) : m(position, b6, interfaceC0315q.a());
    }

    public final boolean t(InterfaceC0315q interfaceC0315q) {
        g gVar = this.f6070q;
        if (gVar != null) {
            long e6 = gVar.e();
            if (e6 != -1 && interfaceC0315q.h() > e6 - 4) {
                return true;
            }
        }
        try {
            return !interfaceC0315q.g(this.f6056c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int u(InterfaceC0315q interfaceC0315q) {
        if (this.f6064k == 0) {
            try {
                w(interfaceC0315q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f6070q == null) {
            g j6 = j(interfaceC0315q);
            this.f6070q = j6;
            this.f6061h.n(j6);
            q.b h02 = new q.b().o0(this.f6057d.f904b).f0(ConstantsKt.DEFAULT_BLOCK_SIZE).N(this.f6057d.f907e).p0(this.f6057d.f906d).V(this.f6058e.f877a).W(this.f6058e.f878b).h0((this.f6054a & 8) != 0 ? null : this.f6065l);
            if (this.f6070q.k() != -2147483647) {
                h02.M(this.f6070q.k());
            }
            this.f6063j.e(h02.K());
            this.f6068o = interfaceC0315q.getPosition();
        } else if (this.f6068o != 0) {
            long position = interfaceC0315q.getPosition();
            long j7 = this.f6068o;
            if (position < j7) {
                interfaceC0315q.p((int) (j7 - position));
            }
        }
        return v(interfaceC0315q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.p(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.f6064k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(E1.InterfaceC0315q r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.o()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.f6054a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            S1.h$a r1 = X1.f.f6053v
        L21:
            E1.D r4 = r11.f6059f
            Z0.x r1 = r4.a(r12, r1)
            r11.f6065l = r1
            if (r1 == 0) goto L30
            E1.B r4 = r11.f6058e
            r4.c(r1)
        L30:
            long r4 = r12.h()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.p(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.t(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            c1.z r7 = r11.f6056c
            r7.T(r3)
            c1.z r7 = r11.f6056c
            int r7 = r7.p()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = q(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = E1.F.j(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            Z0.z r12 = Z0.z.a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.o()
            int r5 = r1 + r4
            r12.j(r5)
            goto L88
        L85:
            r12.p(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            E1.F$a r4 = r11.f6057d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.p(r1)
            goto La4
        La1:
            r12.o()
        La4:
            r11.f6064k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.j(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.f.w(E1.q, boolean):boolean");
    }

    public f(int i6) {
        this(i6, -9223372036854775807L);
    }

    public f(int i6, long j6) {
        this.f6054a = (i6 & 2) != 0 ? i6 | 1 : i6;
        this.f6055b = j6;
        this.f6056c = new C1144z(10);
        this.f6057d = new F.a();
        this.f6058e = new B();
        this.f6066m = -9223372036854775807L;
        this.f6059f = new D();
        C0311m c0311m = new C0311m();
        this.f6060g = c0311m;
        this.f6063j = c0311m;
    }
}
