package t1;

import E1.AbstractC0300b;
import E1.O;
import E1.r;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import s1.C2047g;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2073c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18950a;

    /* renamed from: c, reason: collision with root package name */
    public O f18952c;

    /* renamed from: d, reason: collision with root package name */
    public int f18953d;

    /* renamed from: f, reason: collision with root package name */
    public long f18955f;

    /* renamed from: g, reason: collision with root package name */
    public long f18956g;

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f18951b = new C1143y();

    /* renamed from: e, reason: collision with root package name */
    public long f18954e = -9223372036854775807L;

    public C2073c(C2047g c2047g) {
        this.f18950a = c2047g;
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18954e = j6;
        this.f18956g = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        AbstractC1119a.g(this.f18954e == -9223372036854775807L);
        this.f18954e = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        int G6 = c1144z.G() & 3;
        int G7 = c1144z.G() & 255;
        long a6 = m.a(this.f18956g, j6, this.f18954e, this.f18950a.f18806b);
        if (G6 == 0) {
            e();
            if (G7 == 1) {
                i(c1144z, a6);
                return;
            } else {
                h(c1144z, G7, a6);
                return;
            }
        }
        if (G6 == 1 || G6 == 2) {
            e();
        } else if (G6 != 3) {
            throw new IllegalArgumentException(String.valueOf(G6));
        }
        g(c1144z, z6, G6, a6);
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 1);
        this.f18952c = a6;
        a6.e(this.f18950a.f18807c);
    }

    public final void e() {
        if (this.f18953d > 0) {
            f();
        }
    }

    public final void f() {
        ((O) AbstractC1117K.i(this.f18952c)).f(this.f18955f, 1, this.f18953d, 0, null);
        this.f18953d = 0;
    }

    public final void g(C1144z c1144z, boolean z6, int i6, long j6) {
        int a6 = c1144z.a();
        ((O) AbstractC1119a.e(this.f18952c)).a(c1144z, a6);
        this.f18953d += a6;
        this.f18955f = j6;
        if (z6 && i6 == 3) {
            f();
        }
    }

    public final void h(C1144z c1144z, int i6, long j6) {
        this.f18951b.n(c1144z.e());
        this.f18951b.s(2);
        long j7 = j6;
        for (int i7 = 0; i7 < i6; i7++) {
            AbstractC0300b.C0022b f6 = AbstractC0300b.f(this.f18951b);
            ((O) AbstractC1119a.e(this.f18952c)).a(c1144z, f6.f974e);
            ((O) AbstractC1117K.i(this.f18952c)).f(j7, 1, f6.f974e, 0, null);
            j7 += (f6.f975f / f6.f972c) * 1000000;
            this.f18951b.s(f6.f974e);
        }
    }

    public final void i(C1144z c1144z, long j6) {
        int a6 = c1144z.a();
        ((O) AbstractC1119a.e(this.f18952c)).a(c1144z, a6);
        ((O) AbstractC1117K.i(this.f18952c)).f(j6, 1, a6, 0, null);
    }
}
