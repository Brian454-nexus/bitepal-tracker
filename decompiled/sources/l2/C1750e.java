package l2;

import E1.J;
import E1.K;
import c1.AbstractC1117K;

/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1750e implements J {

    /* renamed from: a, reason: collision with root package name */
    public final C1748c f17072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17073b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17074c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17075d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17076e;

    public C1750e(C1748c c1748c, int i6, long j6, long j7) {
        this.f17072a = c1748c;
        this.f17073b = i6;
        this.f17074c = j6;
        long j8 = (j7 - j6) / c1748c.f17067e;
        this.f17075d = j8;
        this.f17076e = a(j8);
    }

    public final long a(long j6) {
        return AbstractC1117K.W0(j6 * this.f17073b, 1000000L, this.f17072a.f17065c);
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        long q6 = AbstractC1117K.q((this.f17072a.f17065c * j6) / (this.f17073b * 1000000), 0L, this.f17075d - 1);
        long j7 = this.f17074c + (this.f17072a.f17067e * q6);
        long a6 = a(q6);
        K k6 = new K(a6, j7);
        if (a6 >= j6 || q6 == this.f17075d - 1) {
            return new J.a(k6);
        }
        long j8 = q6 + 1;
        return new J.a(k6, new K(a(j8), this.f17074c + (this.f17072a.f17067e * j8)));
    }

    @Override // E1.J
    public long l() {
        return this.f17076e;
    }
}
