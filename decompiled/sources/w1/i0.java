package w1;

import c1.AbstractC1119a;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import w1.InterfaceC2211C;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i0 implements InterfaceC2211C, InterfaceC2211C.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2211C f20060a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20061b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2211C.a f20062c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f20063a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20064b;

        public a(b0 b0Var, long j6) {
            this.f20063a = b0Var;
            this.f20064b = j6;
        }

        @Override // w1.b0
        public void a() {
            this.f20063a.a();
        }

        public b0 b() {
            return this.f20063a;
        }

        @Override // w1.b0
        public boolean c() {
            return this.f20063a.c();
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            int k6 = this.f20063a.k(c1337i0, fVar, i6);
            if (k6 == -4) {
                fVar.f14007f += this.f20064b;
            }
            return k6;
        }

        @Override // w1.b0
        public int n(long j6) {
            return this.f20063a.n(j6 - this.f20064b);
        }
    }

    public i0(InterfaceC2211C interfaceC2211C, long j6) {
        this.f20060a = interfaceC2211C;
        this.f20061b = j6;
    }

    public InterfaceC2211C a() {
        return this.f20060a;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return this.f20060a.b(c1343l0.a().f(c1343l0.f14722a - this.f20061b).d());
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        long d6 = this.f20060a.d();
        if (d6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d6 + this.f20061b;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return this.f20060a.e();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        long f6 = this.f20060a.f();
        if (f6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f6 + this.f20061b;
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        return this.f20060a.g(j6 - this.f20061b, n02) + this.f20061b;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
        this.f20060a.h(j6 - this.f20061b);
    }

    @Override // w1.InterfaceC2211C.a
    public void i(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f20062c)).i(this);
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        this.f20060a.l();
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        return this.f20060a.m(j6 - this.f20061b) + this.f20061b;
    }

    @Override // w1.c0.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC2211C interfaceC2211C) {
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f20062c)).j(this);
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        b0[] b0VarArr2 = new b0[b0VarArr.length];
        int i6 = 0;
        while (true) {
            b0 b0Var = null;
            if (i6 >= b0VarArr.length) {
                break;
            }
            a aVar = (a) b0VarArr[i6];
            if (aVar != null) {
                b0Var = aVar.b();
            }
            b0VarArr2[i6] = b0Var;
            i6++;
        }
        long o6 = this.f20060a.o(xVarArr, zArr, b0VarArr2, zArr2, j6 - this.f20061b);
        for (int i7 = 0; i7 < b0VarArr.length; i7++) {
            b0 b0Var2 = b0VarArr2[i7];
            if (b0Var2 == null) {
                b0VarArr[i7] = null;
            } else {
                b0 b0Var3 = b0VarArr[i7];
                if (b0Var3 == null || ((a) b0Var3).b() != b0Var2) {
                    b0VarArr[i7] = new a(b0Var2, this.f20061b);
                }
            }
        }
        return o6 + this.f20061b;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        long p6 = this.f20060a.p();
        if (p6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p6 + this.f20061b;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f20060a.r();
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f20062c = aVar;
        this.f20060a.s(this, j6 - this.f20061b);
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        this.f20060a.t(j6 - this.f20061b, z6);
    }
}
