package k2;

import E1.O;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import k2.K;
import k2.v;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements InterfaceC1679m {

    /* renamed from: e, reason: collision with root package name */
    public String f16765e;

    /* renamed from: f, reason: collision with root package name */
    public O f16766f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16769i;

    /* renamed from: k, reason: collision with root package name */
    public int f16771k;

    /* renamed from: l, reason: collision with root package name */
    public int f16772l;

    /* renamed from: n, reason: collision with root package name */
    public int f16774n;

    /* renamed from: o, reason: collision with root package name */
    public int f16775o;

    /* renamed from: s, reason: collision with root package name */
    public int f16779s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16781u;

    /* renamed from: d, reason: collision with root package name */
    public int f16764d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16761a = new C1144z(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f16762b = new C1143y();

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16763c = new C1144z();

    /* renamed from: p, reason: collision with root package name */
    public v.b f16776p = new v.b();

    /* renamed from: q, reason: collision with root package name */
    public int f16777q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f16778r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f16780t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16770j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16773m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f16767g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f16768h = -9.223372036854776E18d;

    private boolean k(C1144z c1144z) {
        int i6 = this.f16771k;
        if ((i6 & 2) == 0) {
            c1144z.T(c1144z.g());
            return false;
        }
        if ((i6 & 4) != 0) {
            return true;
        }
        while (c1144z.a() > 0) {
            int i7 = this.f16772l << 8;
            this.f16772l = i7;
            int G6 = i7 | c1144z.G();
            this.f16772l = G6;
            if (v.e(G6)) {
                c1144z.T(c1144z.f() - 3);
                this.f16772l = 0;
                return true;
            }
        }
        return false;
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16766f);
        while (c1144z.a() > 0) {
            int i6 = this.f16764d;
            if (i6 != 0) {
                if (i6 == 1) {
                    f(c1144z, this.f16761a, false);
                    if (this.f16761a.a() != 0) {
                        this.f16773m = false;
                    } else if (i()) {
                        this.f16761a.T(0);
                        O o6 = this.f16766f;
                        C1144z c1144z2 = this.f16761a;
                        o6.a(c1144z2, c1144z2.g());
                        this.f16761a.P(2);
                        this.f16763c.P(this.f16776p.f16784c);
                        this.f16773m = true;
                        this.f16764d = 2;
                    } else if (this.f16761a.g() < 15) {
                        C1144z c1144z3 = this.f16761a;
                        c1144z3.S(c1144z3.g() + 1);
                        this.f16773m = false;
                    }
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f16776p.f16782a)) {
                        f(c1144z, this.f16763c, true);
                    }
                    l(c1144z);
                    int i7 = this.f16774n;
                    v.b bVar = this.f16776p;
                    if (i7 == bVar.f16784c) {
                        int i8 = bVar.f16782a;
                        if (i8 == 1) {
                            h(new C1143y(this.f16763c.e()));
                        } else if (i8 == 17) {
                            this.f16779s = v.f(new C1143y(this.f16763c.e()));
                        } else if (i8 == 2) {
                            g();
                        }
                        this.f16764d = 1;
                    }
                }
            } else if (k(c1144z)) {
                this.f16764d = 1;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16764d = 0;
        this.f16772l = 0;
        this.f16761a.P(2);
        this.f16774n = 0;
        this.f16775o = 0;
        this.f16777q = -2147483647;
        this.f16778r = -1;
        this.f16779s = 0;
        this.f16780t = -1L;
        this.f16781u = false;
        this.f16769i = false;
        this.f16773m = true;
        this.f16770j = true;
        this.f16767g = -9.223372036854776E18d;
        this.f16768h = -9.223372036854776E18d;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16771k = i6;
        if (!this.f16770j && (this.f16775o != 0 || !this.f16773m)) {
            this.f16769i = true;
        }
        if (j6 != -9223372036854775807L) {
            if (this.f16769i) {
                this.f16768h = j6;
            } else {
                this.f16767g = j6;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16765e = dVar.b();
        this.f16766f = rVar.a(dVar.c(), 1);
    }

    public final void f(C1144z c1144z, C1144z c1144z2, boolean z6) {
        int f6 = c1144z.f();
        int min = Math.min(c1144z.a(), c1144z2.a());
        c1144z.l(c1144z2.e(), c1144z2.f(), min);
        c1144z2.U(min);
        if (z6) {
            c1144z.T(f6);
        }
    }

    public final void g() {
        int i6;
        if (this.f16781u) {
            this.f16770j = false;
            i6 = 1;
        } else {
            i6 = 0;
        }
        double d6 = ((this.f16778r - this.f16779s) * 1000000.0d) / this.f16777q;
        long round = Math.round(this.f16767g);
        if (this.f16769i) {
            this.f16769i = false;
            this.f16767g = this.f16768h;
        } else {
            this.f16767g += d6;
        }
        this.f16766f.f(round, i6, this.f16775o, 0, null);
        this.f16781u = false;
        this.f16779s = 0;
        this.f16775o = 0;
    }

    public final void h(C1143y c1143y) {
        v.c h6 = v.h(c1143y);
        this.f16777q = h6.f16786b;
        this.f16778r = h6.f16787c;
        long j6 = this.f16780t;
        long j7 = this.f16776p.f16783b;
        if (j6 != j7) {
            this.f16780t = j7;
            String str = "mhm1";
            if (h6.f16785a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(h6.f16785a));
            }
            byte[] bArr = h6.f16788d;
            this.f16766f.e(new q.b().a0(this.f16765e).o0("audio/mhm1").p0(this.f16777q).O(str).b0((bArr == null || bArr.length <= 0) ? null : z6.w.z(AbstractC1117K.f10565f, bArr)).K());
        }
        this.f16781u = true;
    }

    public final boolean i() {
        int g6 = this.f16761a.g();
        this.f16762b.o(this.f16761a.e(), g6);
        boolean g7 = v.g(this.f16762b, this.f16776p);
        if (g7) {
            this.f16774n = 0;
            this.f16775o += this.f16776p.f16784c + g6;
        }
        return g7;
    }

    public final boolean j(int i6) {
        return i6 == 1 || i6 == 17;
    }

    public final void l(C1144z c1144z) {
        int min = Math.min(c1144z.a(), this.f16776p.f16784c - this.f16774n);
        this.f16766f.a(c1144z, min);
        this.f16774n += min;
    }
}
