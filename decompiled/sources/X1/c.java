package X1;

import E1.J;
import E1.K;
import S1.l;
import android.util.Pair;
import c1.AbstractC1117K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f6049a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6051c;

    public c(long[] jArr, long[] jArr2, long j6) {
        this.f6049a = jArr;
        this.f6050b = jArr2;
        this.f6051c = j6 == -9223372036854775807L ? AbstractC1117K.J0(jArr2[jArr2.length - 1]) : j6;
    }

    public static c a(long j6, l lVar, long j7) {
        int length = lVar.f4682e.length;
        int i6 = length + 1;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        jArr[0] = j6;
        long j8 = 0;
        jArr2[0] = 0;
        for (int i7 = 1; i7 <= length; i7++) {
            int i8 = i7 - 1;
            j6 += lVar.f4680c + lVar.f4682e[i8];
            j8 += lVar.f4681d + lVar.f4683f[i8];
            jArr[i7] = j6;
            jArr2[i7] = j8;
        }
        return new c(jArr, jArr2, j7);
    }

    public static Pair c(long j6, long[] jArr, long[] jArr2) {
        int h6 = AbstractC1117K.h(jArr, j6, true, true);
        long j7 = jArr[h6];
        long j8 = jArr2[h6];
        int i6 = h6 + 1;
        if (i6 == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j8));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr[i6] == j7 ? 0.0d : (j6 - j7) / (r6 - j7)) * (jArr2[i6] - j8))) + j8));
    }

    @Override // X1.g
    public long b(long j6) {
        return AbstractC1117K.J0(((Long) c(j6, this.f6049a, this.f6050b).second).longValue());
    }

    @Override // X1.g
    public long e() {
        return -1L;
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        Pair c6 = c(AbstractC1117K.k1(AbstractC1117K.q(j6, 0L, this.f6051c)), this.f6050b, this.f6049a);
        return new J.a(new K(AbstractC1117K.J0(((Long) c6.first).longValue()), ((Long) c6.second).longValue()));
    }

    @Override // X1.g
    public int k() {
        return -2147483647;
    }

    @Override // E1.J
    public long l() {
        return this.f6051c;
    }
}
