package c1;

import java.util.Arrays;

/* renamed from: c1.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1134p {

    /* renamed from: a, reason: collision with root package name */
    public int f10624a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f10625b;

    public C1134p() {
        this(32);
    }

    public void a(long j6) {
        int i6 = this.f10624a;
        long[] jArr = this.f10625b;
        if (i6 == jArr.length) {
            this.f10625b = Arrays.copyOf(jArr, i6 * 2);
        }
        long[] jArr2 = this.f10625b;
        int i7 = this.f10624a;
        this.f10624a = i7 + 1;
        jArr2[i7] = j6;
    }

    public long b(int i6) {
        if (i6 >= 0 && i6 < this.f10624a) {
            return this.f10625b[i6];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i6 + ", size is " + this.f10624a);
    }

    public int c() {
        return this.f10624a;
    }

    public C1134p(int i6) {
        this.f10625b = new long[i6];
    }
}
