package X1;

import E1.F;
import E1.J;
import E1.K;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6086b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6088d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6089e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6090f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f6091g;

    public j(long j6, int i6, long j7, int i7) {
        this(j6, i6, j7, i7, -1L, null);
    }

    public static j a(i iVar, long j6) {
        long[] jArr;
        long a6 = iVar.a();
        if (a6 == -9223372036854775807L) {
            return null;
        }
        long j7 = iVar.f6081c;
        if (j7 == -1 || (jArr = iVar.f6084f) == null) {
            F.a aVar = iVar.f6079a;
            return new j(j6, aVar.f905c, a6, aVar.f908f);
        }
        F.a aVar2 = iVar.f6079a;
        return new j(j6, aVar2.f905c, a6, aVar2.f908f, j7, jArr);
    }

    @Override // X1.g
    public long b(long j6) {
        long j7 = j6 - this.f6085a;
        if (!f() || j7 <= this.f6086b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC1119a.i(this.f6091g);
        double d6 = (j7 * 256.0d) / this.f6089e;
        int h6 = AbstractC1117K.h(jArr, (long) d6, true, true);
        long c6 = c(h6);
        long j8 = jArr[h6];
        int i6 = h6 + 1;
        long c7 = c(i6);
        return c6 + Math.round((j8 == (h6 == 99 ? 256L : jArr[i6]) ? 0.0d : (d6 - j8) / (r0 - j8)) * (c7 - c6));
    }

    public final long c(int i6) {
        return (this.f6087c * i6) / 100;
    }

    @Override // X1.g
    public long e() {
        return this.f6090f;
    }

    @Override // E1.J
    public boolean f() {
        return this.f6091g != null;
    }

    @Override // E1.J
    public J.a j(long j6) {
        if (!f()) {
            return new J.a(new K(0L, this.f6085a + this.f6086b));
        }
        long q6 = AbstractC1117K.q(j6, 0L, this.f6087c);
        double d6 = (q6 * 100.0d) / this.f6087c;
        double d7 = 0.0d;
        if (d6 > 0.0d) {
            if (d6 >= 100.0d) {
                d7 = 256.0d;
            } else {
                int i6 = (int) d6;
                double d8 = ((long[]) AbstractC1119a.i(this.f6091g))[i6];
                d7 = d8 + ((d6 - i6) * ((i6 == 99 ? 256.0d : r3[i6 + 1]) - d8));
            }
        }
        return new J.a(new K(q6, this.f6085a + AbstractC1117K.q(Math.round((d7 / 256.0d) * this.f6089e), this.f6086b, this.f6089e - 1)));
    }

    @Override // X1.g
    public int k() {
        return this.f6088d;
    }

    @Override // E1.J
    public long l() {
        return this.f6087c;
    }

    public j(long j6, int i6, long j7, int i7, long j8, long[] jArr) {
        this.f6085a = j6;
        this.f6086b = i6;
        this.f6087c = j7;
        this.f6088d = i7;
        this.f6089e = j8;
        this.f6091g = jArr;
        this.f6090f = j8 != -1 ? j6 + j8 : -1L;
    }
}
