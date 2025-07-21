package X1;

import E1.F;
import c1.AbstractC1117K;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final F.a f6079a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6080b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6083e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f6084f;

    public i(F.a aVar, long j6, long j7, long[] jArr, int i6, int i7) {
        this.f6079a = new F.a(aVar);
        this.f6080b = j6;
        this.f6081c = j7;
        this.f6084f = jArr;
        this.f6082d = i6;
        this.f6083e = i7;
    }

    public static i b(F.a aVar, C1144z c1144z) {
        long[] jArr;
        int i6;
        int i7;
        int p6 = c1144z.p();
        int K5 = (p6 & 1) != 0 ? c1144z.K() : -1;
        long I6 = (p6 & 2) != 0 ? c1144z.I() : -1L;
        if ((p6 & 4) == 4) {
            jArr = new long[100];
            for (int i8 = 0; i8 < 100; i8++) {
                jArr[i8] = c1144z.G();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((p6 & 8) != 0) {
            c1144z.U(4);
        }
        if (c1144z.a() >= 24) {
            c1144z.U(21);
            int J6 = c1144z.J();
            i7 = J6 & 4095;
            i6 = (16773120 & J6) >> 12;
        } else {
            i6 = -1;
            i7 = -1;
        }
        return new i(aVar, K5, I6, jArr2, i6, i7);
    }

    public long a() {
        long j6 = this.f6080b;
        if (j6 == -1 || j6 == 0) {
            return -9223372036854775807L;
        }
        return AbstractC1117K.V0((j6 * r2.f909g) - 1, this.f6079a.f906d);
    }
}
