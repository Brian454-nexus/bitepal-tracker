package X1;

import E1.F;
import E1.J;
import E1.K;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f6074a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6076c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6078e;

    public h(long[] jArr, long[] jArr2, long j6, long j7, int i6) {
        this.f6074a = jArr;
        this.f6075b = jArr2;
        this.f6076c = j6;
        this.f6077d = j7;
        this.f6078e = i6;
    }

    public static h a(long j6, long j7, F.a aVar, C1144z c1144z) {
        int G6;
        C1144z c1144z2 = c1144z;
        c1144z2.U(10);
        int p6 = c1144z2.p();
        h hVar = null;
        if (p6 <= 0) {
            return null;
        }
        int i6 = aVar.f906d;
        long W02 = AbstractC1117K.W0(p6, (i6 >= 32000 ? 1152 : 576) * 1000000, i6);
        int M5 = c1144z2.M();
        int M6 = c1144z2.M();
        int M7 = c1144z2.M();
        c1144z2.U(2);
        long j8 = j7 + aVar.f905c;
        long[] jArr = new long[M5];
        long[] jArr2 = new long[M5];
        int i7 = 0;
        long j9 = j7;
        while (i7 < M5) {
            h hVar2 = hVar;
            int i8 = M6;
            long j10 = j8;
            jArr[i7] = (i7 * W02) / M5;
            jArr2[i7] = Math.max(j9, j10);
            if (M7 == 1) {
                G6 = c1144z2.G();
            } else if (M7 == 2) {
                G6 = c1144z2.M();
            } else if (M7 == 3) {
                G6 = c1144z2.J();
            } else {
                if (M7 != 4) {
                    return hVar2;
                }
                G6 = c1144z2.K();
            }
            j9 += G6 * i8;
            i7++;
            c1144z2 = c1144z;
            j8 = j10;
            M6 = i8;
            hVar = hVar2;
            M5 = M5;
        }
        if (j6 != -1 && j6 != j9) {
            AbstractC1133o.h("VbriSeeker", "VBRI data size mismatch: " + j6 + ", " + j9);
        }
        return new h(jArr, jArr2, W02, j9, aVar.f908f);
    }

    @Override // X1.g
    public long b(long j6) {
        return this.f6074a[AbstractC1117K.h(this.f6075b, j6, true, true)];
    }

    @Override // X1.g
    public long e() {
        return this.f6077d;
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        int h6 = AbstractC1117K.h(this.f6074a, j6, true, true);
        K k6 = new K(this.f6074a[h6], this.f6075b[h6]);
        if (k6.f916a >= j6 || h6 == this.f6074a.length - 1) {
            return new J.a(k6);
        }
        int i6 = h6 + 1;
        return new J.a(k6, new K(this.f6074a[i6], this.f6075b[i6]));
    }

    @Override // X1.g
    public int k() {
        return this.f6078e;
    }

    @Override // E1.J
    public long l() {
        return this.f6076c;
    }
}
