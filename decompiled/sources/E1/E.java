package E1;

import E1.J;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class E implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f892a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f893b;

    /* renamed from: c, reason: collision with root package name */
    public final long f894c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f895d;

    public E(long[] jArr, long[] jArr2, long j6) {
        AbstractC1119a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z6 = length > 0;
        this.f895d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f892a = jArr;
            this.f893b = jArr2;
        } else {
            int i6 = length + 1;
            long[] jArr3 = new long[i6];
            this.f892a = jArr3;
            long[] jArr4 = new long[i6];
            this.f893b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f894c = j6;
    }

    @Override // E1.J
    public boolean f() {
        return this.f895d;
    }

    @Override // E1.J
    public J.a j(long j6) {
        if (!this.f895d) {
            return new J.a(K.f915c);
        }
        int h6 = AbstractC1117K.h(this.f893b, j6, true, true);
        K k6 = new K(this.f893b[h6], this.f892a[h6]);
        if (k6.f916a == j6 || h6 == this.f893b.length - 1) {
            return new J.a(k6);
        }
        int i6 = h6 + 1;
        return new J.a(k6, new K(this.f893b[i6], this.f892a[i6]));
    }

    @Override // E1.J
    public long l() {
        return this.f894c;
    }
}
