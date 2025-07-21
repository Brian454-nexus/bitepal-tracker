package E1;

import E1.J;
import c1.AbstractC1117K;
import java.util.Arrays;

/* renamed from: E1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0305g implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1019b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f1020c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f1021d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f1022e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1023f;

    public C0305g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f1019b = iArr;
        this.f1020c = jArr;
        this.f1021d = jArr2;
        this.f1022e = jArr3;
        int length = iArr.length;
        this.f1018a = length;
        if (length > 0) {
            this.f1023f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f1023f = 0L;
        }
    }

    public int a(long j6) {
        return AbstractC1117K.h(this.f1022e, j6, true, true);
    }

    @Override // E1.J
    public boolean f() {
        return true;
    }

    @Override // E1.J
    public J.a j(long j6) {
        int a6 = a(j6);
        K k6 = new K(this.f1022e[a6], this.f1020c[a6]);
        if (k6.f916a >= j6 || a6 == this.f1018a - 1) {
            return new J.a(k6);
        }
        int i6 = a6 + 1;
        return new J.a(k6, new K(this.f1022e[i6], this.f1020c[i6]));
    }

    @Override // E1.J
    public long l() {
        return this.f1023f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f1018a + ", sizes=" + Arrays.toString(this.f1019b) + ", offsets=" + Arrays.toString(this.f1020c) + ", timeUs=" + Arrays.toString(this.f1022e) + ", durationsUs=" + Arrays.toString(this.f1021d) + ")";
    }
}
