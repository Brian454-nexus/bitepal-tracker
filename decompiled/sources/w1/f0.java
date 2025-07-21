package w1;

import A1.k;
import A1.l;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import e1.AbstractC1251i;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import w1.InterfaceC2211C;
import w1.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f0 implements InterfaceC2211C, l.b {

    /* renamed from: a, reason: collision with root package name */
    public final C1252j f20006a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1248f.a f20007b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1266x f20008c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.k f20009d;

    /* renamed from: e, reason: collision with root package name */
    public final K.a f20010e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f20011f;

    /* renamed from: h, reason: collision with root package name */
    public final long f20013h;

    /* renamed from: j, reason: collision with root package name */
    public final Z0.q f20015j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20016k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20017l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f20018m;

    /* renamed from: n, reason: collision with root package name */
    public int f20019n;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20012g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final A1.l f20014i = new A1.l("SingleSampleMediaPeriod");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public int f20020a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20021b;

        public b() {
        }

        @Override // w1.b0
        public void a() {
            f0 f0Var = f0.this;
            if (f0Var.f20016k) {
                return;
            }
            f0Var.f20014i.a();
        }

        public final void b() {
            if (this.f20021b) {
                return;
            }
            f0.this.f20010e.h(Z0.y.k(f0.this.f20015j.f6990n), f0.this.f20015j, 0, null, 0L);
            this.f20021b = true;
        }

        @Override // w1.b0
        public boolean c() {
            return f0.this.f20017l;
        }

        public void d() {
            if (this.f20020a == 2) {
                this.f20020a = 1;
            }
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            b();
            f0 f0Var = f0.this;
            boolean z6 = f0Var.f20017l;
            if (z6 && f0Var.f20018m == null) {
                this.f20020a = 2;
            }
            int i7 = this.f20020a;
            if (i7 == 2) {
                fVar.e(4);
                return -4;
            }
            if ((i6 & 2) != 0 || i7 == 0) {
                c1337i0.f14685b = f0Var.f20015j;
                this.f20020a = 1;
                return -5;
            }
            if (!z6) {
                return -3;
            }
            AbstractC1119a.e(f0Var.f20018m);
            fVar.e(1);
            fVar.f14007f = 0L;
            if ((i6 & 4) == 0) {
                fVar.o(f0.this.f20019n);
                ByteBuffer byteBuffer = fVar.f14005d;
                f0 f0Var2 = f0.this;
                byteBuffer.put(f0Var2.f20018m, 0, f0Var2.f20019n);
            }
            if ((i6 & 1) == 0) {
                this.f20020a = 2;
            }
            return -4;
        }

        @Override // w1.b0
        public int n(long j6) {
            b();
            if (j6 <= 0 || this.f20020a == 2) {
                return 0;
            }
            this.f20020a = 2;
            return 1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements l.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f20023a = C2239y.a();

        /* renamed from: b, reason: collision with root package name */
        public final C1252j f20024b;

        /* renamed from: c, reason: collision with root package name */
        public final C1265w f20025c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f20026d;

        public c(C1252j c1252j, InterfaceC1248f interfaceC1248f) {
            this.f20024b = c1252j;
            this.f20025c = new C1265w(interfaceC1248f);
        }

        @Override // A1.l.e
        public void a() {
            this.f20025c.v();
            try {
                this.f20025c.r(this.f20024b);
                int i6 = 0;
                while (i6 != -1) {
                    int f6 = (int) this.f20025c.f();
                    byte[] bArr = this.f20026d;
                    if (bArr == null) {
                        this.f20026d = new byte[1024];
                    } else if (f6 == bArr.length) {
                        this.f20026d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C1265w c1265w = this.f20025c;
                    byte[] bArr2 = this.f20026d;
                    i6 = c1265w.read(bArr2, f6, bArr2.length - f6);
                }
                AbstractC1251i.a(this.f20025c);
            } catch (Throwable th) {
                AbstractC1251i.a(this.f20025c);
                throw th;
            }
        }

        @Override // A1.l.e
        public void c() {
        }
    }

    public f0(C1252j c1252j, InterfaceC1248f.a aVar, InterfaceC1266x interfaceC1266x, Z0.q qVar, long j6, A1.k kVar, K.a aVar2, boolean z6) {
        this.f20006a = c1252j;
        this.f20007b = aVar;
        this.f20008c = interfaceC1266x;
        this.f20015j = qVar;
        this.f20013h = j6;
        this.f20009d = kVar;
        this.f20010e = aVar2;
        this.f20016k = z6;
        this.f20011f = new l0(new Z0.H(qVar));
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        if (this.f20017l || this.f20014i.j() || this.f20014i.i()) {
            return false;
        }
        InterfaceC1248f a6 = this.f20007b.a();
        InterfaceC1266x interfaceC1266x = this.f20008c;
        if (interfaceC1266x != null) {
            a6.l(interfaceC1266x);
        }
        c cVar = new c(this.f20006a, a6);
        this.f20010e.t(new C2239y(cVar.f20023a, this.f20006a, this.f20014i.n(cVar, this, this.f20009d.d(1))), 1, -1, this.f20015j, 0, null, 0L, this.f20013h);
        return true;
    }

    @Override // A1.l.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void u(c cVar, long j6, long j7, boolean z6) {
        C1265w c1265w = cVar.f20025c;
        C2239y c2239y = new C2239y(cVar.f20023a, cVar.f20024b, c1265w.t(), c1265w.u(), j6, j7, c1265w.f());
        this.f20009d.b(cVar.f20023a);
        this.f20010e.k(c2239y, 1, -1, null, 0, null, 0L, this.f20013h);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return (this.f20017l || this.f20014i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f20014i.j();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f20017l ? Long.MIN_VALUE : 0L;
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
    }

    @Override // A1.l.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void j(c cVar, long j6, long j7) {
        this.f20019n = (int) cVar.f20025c.f();
        this.f20018m = (byte[]) AbstractC1119a.e(cVar.f20026d);
        this.f20017l = true;
        C1265w c1265w = cVar.f20025c;
        C2239y c2239y = new C2239y(cVar.f20023a, cVar.f20024b, c1265w.t(), c1265w.u(), j6, j7, this.f20019n);
        this.f20009d.b(cVar.f20023a);
        this.f20010e.n(c2239y, 1, -1, this.f20015j, 0, null, 0L, this.f20013h);
    }

    @Override // A1.l.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l.c q(c cVar, long j6, long j7, IOException iOException, int i6) {
        l.c h6;
        C1265w c1265w = cVar.f20025c;
        C2239y c2239y = new C2239y(cVar.f20023a, cVar.f20024b, c1265w.t(), c1265w.u(), j6, j7, c1265w.f());
        long a6 = this.f20009d.a(new k.c(c2239y, new C2210B(1, -1, this.f20015j, 0, null, 0L, AbstractC1117K.k1(this.f20013h)), iOException, i6));
        boolean z6 = a6 == -9223372036854775807L || i6 >= this.f20009d.d(1);
        if (this.f20016k && z6) {
            AbstractC1133o.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f20017l = true;
            h6 = A1.l.f139f;
        } else {
            h6 = a6 != -9223372036854775807L ? A1.l.h(false, a6) : A1.l.f140g;
        }
        l.c cVar2 = h6;
        boolean c6 = cVar2.c();
        this.f20010e.p(c2239y, 1, -1, this.f20015j, 0, null, 0L, this.f20013h, iOException, !c6);
        if (!c6) {
            this.f20009d.b(cVar.f20023a);
        }
        return cVar2;
    }

    @Override // w1.InterfaceC2211C
    public void l() {
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        for (int i6 = 0; i6 < this.f20012g.size(); i6++) {
            ((b) this.f20012g.get(i6)).d();
        }
        return j6;
    }

    public void n() {
        this.f20014i.l();
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            b0 b0Var = b0VarArr[i6];
            if (b0Var != null && (xVarArr[i6] == null || !zArr[i6])) {
                this.f20012g.remove(b0Var);
                b0VarArr[i6] = null;
            }
            if (b0VarArr[i6] == null && xVarArr[i6] != null) {
                b bVar = new b();
                this.f20012g.add(bVar);
                b0VarArr[i6] = bVar;
                zArr2[i6] = true;
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        return -9223372036854775807L;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f20011f;
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        aVar.i(this);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
    }
}
