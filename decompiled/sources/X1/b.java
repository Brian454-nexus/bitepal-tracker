package X1;

import E1.J;
import E1.K;
import c1.AbstractC1117K;
import c1.C1134p;
import java.math.RoundingMode;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6044a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134p f6045b;

    /* renamed from: c, reason: collision with root package name */
    public final C1134p f6046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6047d;

    /* renamed from: e, reason: collision with root package name */
    public long f6048e;

    public b(long j6, long j7, long j8) {
        this.f6048e = j6;
        this.f6044a = j8;
        C1134p c1134p = new C1134p();
        this.f6045b = c1134p;
        C1134p c1134p2 = new C1134p();
        this.f6046c = c1134p2;
        c1134p.a(0L);
        c1134p2.a(j7);
        int i6 = -2147483647;
        if (j6 == -9223372036854775807L) {
            this.f6047d = -2147483647;
            return;
        }
        long Z02 = AbstractC1117K.Z0(j7 - j8, 8L, j6, RoundingMode.HALF_UP);
        if (Z02 > 0 && Z02 <= 2147483647L) {
            i6 = (int) Z02;
        }
        this.f6047d = i6;
    }

    public boolean a(long j6) {
        C1134p c1134p = this.f6045b;
        return j6 - c1134p.b(c1134p.c() - 1) < 100000;
    }

    @Override // X1.g
    public long b(long j6) {
        return this.f6045b.b(AbstractC1117K.e(this.f6046c, j6, true, true));
    }

    public void c(long j6, long j7) {
        if (a(j6)) {
            return;
        }
        this.f6045b.a(j6);
        this.f6046c.a(j7);
    }

    public void d(long j6) {
        this.f6048e = j6;
    }

    @Override // X1.g
    public long e() {
        return this.f6044a;
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        int e6 = AbstractC1117K.e(this.f6045b, j6, true, true);
        K k6 = new K(this.f6045b.b(e6), this.f6046c.b(e6));
        if (k6.f916a == j6 || e6 == this.f6045b.c() - 1) {
            return new J.a(k6);
        }
        int i6 = e6 + 1;
        return new J.a(k6, new K(this.f6045b.b(i6), this.f6046c.b(i6)));
    }

    @Override // X1.g
    public int k() {
        return this.f6047d;
    }

    @Override // E1.J
    public long l() {
        return this.f6048e;
    }
}
