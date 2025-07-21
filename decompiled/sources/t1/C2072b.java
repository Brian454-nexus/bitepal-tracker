package t1;

import E1.O;
import E1.r;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import s1.C2047g;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2072b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18941a;

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f18942b = new C1143y();

    /* renamed from: c, reason: collision with root package name */
    public final int f18943c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18945e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18946f;

    /* renamed from: g, reason: collision with root package name */
    public long f18947g;

    /* renamed from: h, reason: collision with root package name */
    public O f18948h;

    /* renamed from: i, reason: collision with root package name */
    public long f18949i;

    public C2072b(C2047g c2047g) {
        this.f18941a = c2047g;
        this.f18943c = c2047g.f18806b;
        String str = (String) AbstractC1119a.e((String) c2047g.f18808d.get("mode"));
        if (y6.c.a(str, "AAC-hbr")) {
            this.f18944d = 13;
            this.f18945e = 3;
        } else {
            if (!y6.c.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f18944d = 6;
            this.f18945e = 2;
        }
        this.f18946f = this.f18945e + this.f18944d;
    }

    public static void e(O o6, long j6, int i6) {
        o6.f(j6, 1, i6, 0, null);
    }

    @Override // t1.k
    public void a(long j6, long j7) {
        this.f18947g = j6;
        this.f18949i = j7;
    }

    @Override // t1.k
    public void b(long j6, int i6) {
        this.f18947g = j6;
    }

    @Override // t1.k
    public void c(C1144z c1144z, long j6, int i6, boolean z6) {
        AbstractC1119a.e(this.f18948h);
        short C6 = c1144z.C();
        int i7 = C6 / this.f18946f;
        long a6 = m.a(this.f18949i, j6, this.f18947g, this.f18943c);
        this.f18942b.m(c1144z);
        if (i7 == 1) {
            int h6 = this.f18942b.h(this.f18944d);
            this.f18942b.r(this.f18945e);
            this.f18948h.a(c1144z, c1144z.a());
            if (z6) {
                e(this.f18948h, a6, h6);
                return;
            }
            return;
        }
        c1144z.U((C6 + 7) / 8);
        for (int i8 = 0; i8 < i7; i8++) {
            int h7 = this.f18942b.h(this.f18944d);
            this.f18942b.r(this.f18945e);
            this.f18948h.a(c1144z, h7);
            e(this.f18948h, a6, h7);
            a6 += AbstractC1117K.W0(i7, 1000000L, this.f18943c);
        }
    }

    @Override // t1.k
    public void d(r rVar, int i6) {
        O a6 = rVar.a(i6, 1);
        this.f18948h = a6;
        a6.e(this.f18941a.f18807c);
    }
}
