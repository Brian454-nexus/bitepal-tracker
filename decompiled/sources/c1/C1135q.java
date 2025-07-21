package c1;

import java.util.NoSuchElementException;

/* renamed from: c1.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1135q {

    /* renamed from: a, reason: collision with root package name */
    public int f10626a;

    /* renamed from: b, reason: collision with root package name */
    public int f10627b;

    /* renamed from: c, reason: collision with root package name */
    public int f10628c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f10629d;

    /* renamed from: e, reason: collision with root package name */
    public int f10630e;

    public C1135q() {
        this(16);
    }

    public void a() {
        this.f10626a = 0;
        this.f10627b = -1;
        this.f10628c = 0;
    }

    public long b() {
        if (this.f10628c != 0) {
            return this.f10629d[this.f10626a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.f10628c == 0;
    }

    public long d() {
        int i6 = this.f10628c;
        if (i6 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f10629d;
        int i7 = this.f10626a;
        long j6 = jArr[i7];
        this.f10626a = this.f10630e & (i7 + 1);
        this.f10628c = i6 - 1;
        return j6;
    }

    public C1135q(int i6) {
        AbstractC1119a.a(i6 >= 0 && i6 <= 1073741824);
        i6 = i6 == 0 ? 1 : i6;
        i6 = Integer.bitCount(i6) != 1 ? Integer.highestOneBit(i6 - 1) << 1 : i6;
        this.f10626a = 0;
        this.f10627b = -1;
        this.f10628c = 0;
        long[] jArr = new long[i6];
        this.f10629d = jArr;
        this.f10630e = jArr.length - 1;
    }
}
