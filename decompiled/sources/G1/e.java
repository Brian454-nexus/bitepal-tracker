package G1;

import E1.InterfaceC0315q;
import E1.J;
import E1.K;
import E1.O;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final O f1748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1750c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1751d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1752e;

    /* renamed from: f, reason: collision with root package name */
    public int f1753f;

    /* renamed from: g, reason: collision with root package name */
    public int f1754g;

    /* renamed from: h, reason: collision with root package name */
    public int f1755h;

    /* renamed from: i, reason: collision with root package name */
    public int f1756i;

    /* renamed from: j, reason: collision with root package name */
    public int f1757j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f1758k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f1759l;

    public e(int i6, int i7, long j6, int i8, O o6) {
        boolean z6 = true;
        if (i7 != 1 && i7 != 2) {
            z6 = false;
        }
        AbstractC1119a.a(z6);
        this.f1751d = j6;
        this.f1752e = i8;
        this.f1748a = o6;
        this.f1749b = d(i6, i7 == 2 ? 1667497984 : 1651965952);
        this.f1750c = i7 == 2 ? d(i6, 1650720768) : -1;
        this.f1758k = new long[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.f1759l = new int[ConstantsKt.MINIMUM_BLOCK_SIZE];
    }

    public static int d(int i6, int i7) {
        return (((i6 % 10) + 48) << 8) | ((i6 / 10) + 48) | i7;
    }

    public void a() {
        this.f1755h++;
    }

    public void b(long j6) {
        if (this.f1757j == this.f1759l.length) {
            long[] jArr = this.f1758k;
            this.f1758k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f1759l;
            this.f1759l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f1758k;
        int i6 = this.f1757j;
        jArr2[i6] = j6;
        this.f1759l[i6] = this.f1756i;
        this.f1757j = i6 + 1;
    }

    public void c() {
        this.f1758k = Arrays.copyOf(this.f1758k, this.f1757j);
        this.f1759l = Arrays.copyOf(this.f1759l, this.f1757j);
    }

    public final long e(int i6) {
        return (this.f1751d * i6) / this.f1752e;
    }

    public long f() {
        return e(this.f1755h);
    }

    public long g() {
        return e(1);
    }

    public final K h(int i6) {
        return new K(this.f1759l[i6] * g(), this.f1758k[i6]);
    }

    public J.a i(long j6) {
        int g6 = (int) (j6 / g());
        int g7 = AbstractC1117K.g(this.f1759l, g6, true, true);
        if (this.f1759l[g7] == g6) {
            return new J.a(h(g7));
        }
        K h6 = h(g7);
        int i6 = g7 + 1;
        return i6 < this.f1758k.length ? new J.a(h6, h(i6)) : new J.a(h6);
    }

    public boolean j(int i6) {
        return this.f1749b == i6 || this.f1750c == i6;
    }

    public void k() {
        this.f1756i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f1759l, this.f1755h) >= 0;
    }

    public boolean m(InterfaceC0315q interfaceC0315q) {
        int i6 = this.f1754g;
        int c6 = i6 - this.f1748a.c(interfaceC0315q, i6, false);
        this.f1754g = c6;
        boolean z6 = c6 == 0;
        if (z6) {
            if (this.f1753f > 0) {
                this.f1748a.f(f(), l() ? 1 : 0, this.f1753f, 0, null);
            }
            a();
        }
        return z6;
    }

    public void n(int i6) {
        this.f1753f = i6;
        this.f1754g = i6;
    }

    public void o(long j6) {
        if (this.f1757j == 0) {
            this.f1755h = 0;
        } else {
            this.f1755h = this.f1759l[AbstractC1117K.h(this.f1758k, j6, true, true)];
        }
    }
}
