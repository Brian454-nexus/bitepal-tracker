package a1;

import c1.AbstractC1119a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1002e {

    /* renamed from: a, reason: collision with root package name */
    public final int f7656a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7657b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7658c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7659d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7660e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7661f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7662g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7663h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f7664i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f7665j;

    /* renamed from: k, reason: collision with root package name */
    public int f7666k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f7667l;

    /* renamed from: m, reason: collision with root package name */
    public int f7668m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f7669n;

    /* renamed from: o, reason: collision with root package name */
    public int f7670o;

    /* renamed from: p, reason: collision with root package name */
    public int f7671p;

    /* renamed from: q, reason: collision with root package name */
    public int f7672q;

    /* renamed from: r, reason: collision with root package name */
    public int f7673r;

    /* renamed from: s, reason: collision with root package name */
    public int f7674s;

    /* renamed from: t, reason: collision with root package name */
    public int f7675t;

    /* renamed from: u, reason: collision with root package name */
    public int f7676u;

    /* renamed from: v, reason: collision with root package name */
    public int f7677v;

    public C1002e(int i6, int i7, float f6, float f7, int i8) {
        this.f7656a = i6;
        this.f7657b = i7;
        this.f7658c = f6;
        this.f7659d = f7;
        this.f7660e = i6 / i8;
        this.f7661f = i6 / 400;
        int i9 = i6 / 65;
        this.f7662g = i9;
        int i10 = i9 * 2;
        this.f7663h = i10;
        this.f7664i = new short[i10];
        this.f7665j = new short[i10 * i7];
        this.f7667l = new short[i10 * i7];
        this.f7669n = new short[i10 * i7];
    }

    public static void p(int i6, int i7, short[] sArr, int i8, short[] sArr2, int i9, short[] sArr3, int i10) {
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = (i8 * i7) + i11;
            int i13 = (i10 * i7) + i11;
            int i14 = (i9 * i7) + i11;
            for (int i15 = 0; i15 < i6; i15++) {
                sArr[i12] = (short) (((sArr2[i14] * (i6 - i15)) + (sArr3[i13] * i15)) / i6);
                i12 += i7;
                i14 += i7;
                i13 += i7;
            }
        }
    }

    public final void a(float f6, int i6) {
        int i7;
        int i8;
        if (this.f7668m == i6) {
            return;
        }
        int i9 = this.f7656a;
        int i10 = (int) (i9 / f6);
        while (true) {
            if (i10 <= 16384 && i9 <= 16384) {
                break;
            }
            i10 /= 2;
            i9 /= 2;
        }
        o(i6);
        int i11 = 0;
        while (true) {
            int i12 = this.f7670o;
            if (i11 >= i12 - 1) {
                u(i12 - 1);
                return;
            }
            while (true) {
                i7 = this.f7671p;
                int i13 = (i7 + 1) * i10;
                i8 = this.f7672q;
                if (i13 <= i8 * i9) {
                    break;
                }
                this.f7667l = f(this.f7667l, this.f7668m, 1);
                int i14 = 0;
                while (true) {
                    int i15 = this.f7657b;
                    if (i14 < i15) {
                        this.f7667l[(this.f7668m * i15) + i14] = n(this.f7669n, (i15 * i11) + i14, i9, i10);
                        i14++;
                    }
                }
                this.f7672q++;
                this.f7668m++;
            }
            int i16 = i7 + 1;
            this.f7671p = i16;
            if (i16 == i9) {
                this.f7671p = 0;
                AbstractC1119a.g(i8 == i10);
                this.f7672q = 0;
            }
            i11++;
        }
    }

    public final void b(float f6) {
        int w6;
        int i6 = this.f7666k;
        if (i6 < this.f7663h) {
            return;
        }
        int i7 = 0;
        do {
            if (this.f7673r > 0) {
                w6 = c(i7);
            } else {
                int g6 = g(this.f7665j, i7);
                w6 = ((double) f6) > 1.0d ? g6 + w(this.f7665j, i7, f6, g6) : m(this.f7665j, i7, f6, g6);
            }
            i7 += w6;
        } while (this.f7663h + i7 <= i6);
        v(i7);
    }

    public final int c(int i6) {
        int min = Math.min(this.f7663h, this.f7673r);
        d(this.f7665j, i6, min);
        this.f7673r -= min;
        return min;
    }

    public final void d(short[] sArr, int i6, int i7) {
        short[] f6 = f(this.f7667l, this.f7668m, i7);
        this.f7667l = f6;
        int i8 = this.f7657b;
        System.arraycopy(sArr, i6 * i8, f6, this.f7668m * i8, i8 * i7);
        this.f7668m += i7;
    }

    public final void e(short[] sArr, int i6, int i7) {
        int i8 = this.f7663h / i7;
        int i9 = this.f7657b;
        int i10 = i7 * i9;
        int i11 = i6 * i9;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 += sArr[(i12 * i10) + i11 + i14];
            }
            this.f7664i[i12] = (short) (i13 / i10);
        }
    }

    public final short[] f(short[] sArr, int i6, int i7) {
        int length = sArr.length;
        int i8 = this.f7657b;
        int i9 = length / i8;
        return i6 + i7 <= i9 ? sArr : Arrays.copyOf(sArr, (((i9 * 3) / 2) + i7) * i8);
    }

    public final int g(short[] sArr, int i6) {
        int i7;
        int i8 = this.f7656a;
        int i9 = i8 > 4000 ? i8 / 4000 : 1;
        if (this.f7657b == 1 && i9 == 1) {
            i7 = h(sArr, i6, this.f7661f, this.f7662g);
        } else {
            e(sArr, i6, i9);
            int h6 = h(this.f7664i, 0, this.f7661f / i9, this.f7662g / i9);
            if (i9 != 1) {
                int i10 = h6 * i9;
                int i11 = i9 * 4;
                int i12 = i10 - i11;
                int i13 = i10 + i11;
                int i14 = this.f7661f;
                if (i12 < i14) {
                    i12 = i14;
                }
                int i15 = this.f7662g;
                if (i13 > i15) {
                    i13 = i15;
                }
                if (this.f7657b == 1) {
                    i7 = h(sArr, i6, i12, i13);
                } else {
                    e(sArr, i6, 1);
                    i7 = h(this.f7664i, 0, i12, i13);
                }
            } else {
                i7 = h6;
            }
        }
        int i16 = q(this.f7676u, this.f7677v) ? this.f7674s : i7;
        this.f7675t = this.f7676u;
        this.f7674s = i7;
        return i16;
    }

    public final int h(short[] sArr, int i6, int i7, int i8) {
        int i9 = i6 * this.f7657b;
        int i10 = 255;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i7 <= i8) {
            int i14 = 0;
            for (int i15 = 0; i15 < i7; i15++) {
                i14 += Math.abs(sArr[i9 + i15] - sArr[(i9 + i7) + i15]);
            }
            if (i14 * i12 < i11 * i7) {
                i12 = i7;
                i11 = i14;
            }
            if (i14 * i10 > i13 * i7) {
                i10 = i7;
                i13 = i14;
            }
            i7++;
        }
        this.f7676u = i11 / i12;
        this.f7677v = i13 / i10;
        return i12;
    }

    public void i() {
        this.f7666k = 0;
        this.f7668m = 0;
        this.f7670o = 0;
        this.f7671p = 0;
        this.f7672q = 0;
        this.f7673r = 0;
        this.f7674s = 0;
        this.f7675t = 0;
        this.f7676u = 0;
        this.f7677v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f7657b, this.f7668m);
        shortBuffer.put(this.f7667l, 0, this.f7657b * min);
        int i6 = this.f7668m - min;
        this.f7668m = i6;
        short[] sArr = this.f7667l;
        int i7 = this.f7657b;
        System.arraycopy(sArr, min * i7, sArr, 0, i6 * i7);
    }

    public int k() {
        return this.f7668m * this.f7657b * 2;
    }

    public int l() {
        return this.f7666k * this.f7657b * 2;
    }

    public final int m(short[] sArr, int i6, float f6, int i7) {
        int i8;
        if (f6 < 0.5f) {
            i8 = (int) ((i7 * f6) / (1.0f - f6));
        } else {
            this.f7673r = (int) ((i7 * ((2.0f * f6) - 1.0f)) / (1.0f - f6));
            i8 = i7;
        }
        int i9 = i7 + i8;
        short[] f7 = f(this.f7667l, this.f7668m, i9);
        this.f7667l = f7;
        int i10 = this.f7657b;
        System.arraycopy(sArr, i6 * i10, f7, this.f7668m * i10, i10 * i7);
        p(i8, this.f7657b, this.f7667l, this.f7668m + i7, sArr, i6 + i7, sArr, i6);
        this.f7668m += i9;
        return i8;
    }

    public final short n(short[] sArr, int i6, int i7, int i8) {
        short s6 = sArr[i6];
        short s7 = sArr[i6 + this.f7657b];
        int i9 = this.f7672q * i7;
        int i10 = this.f7671p;
        int i11 = i10 * i8;
        int i12 = (i10 + 1) * i8;
        int i13 = i12 - i9;
        int i14 = i12 - i11;
        return (short) (((s6 * i13) + ((i14 - i13) * s7)) / i14);
    }

    public final void o(int i6) {
        int i7 = this.f7668m - i6;
        short[] f6 = f(this.f7669n, this.f7670o, i7);
        this.f7669n = f6;
        short[] sArr = this.f7667l;
        int i8 = this.f7657b;
        System.arraycopy(sArr, i6 * i8, f6, this.f7670o * i8, i8 * i7);
        this.f7668m = i6;
        this.f7670o += i7;
    }

    public final boolean q(int i6, int i7) {
        return i6 != 0 && this.f7674s != 0 && i7 <= i6 * 3 && i6 * 2 > this.f7675t * 3;
    }

    public final void r() {
        int i6 = this.f7668m;
        float f6 = this.f7658c;
        float f7 = this.f7659d;
        float f8 = f6 / f7;
        float f9 = this.f7660e * f7;
        double d6 = f8;
        if (d6 > 1.00001d || d6 < 0.99999d) {
            b(f8);
        } else {
            d(this.f7665j, 0, this.f7666k);
            this.f7666k = 0;
        }
        if (f9 != 1.0f) {
            a(f9, i6);
        }
    }

    public void s() {
        int i6;
        int i7 = this.f7666k;
        float f6 = this.f7658c;
        float f7 = this.f7659d;
        int i8 = this.f7668m + ((int) ((((i7 / (f6 / f7)) + this.f7670o) / (this.f7660e * f7)) + 0.5f));
        this.f7665j = f(this.f7665j, i7, (this.f7663h * 2) + i7);
        int i9 = 0;
        while (true) {
            i6 = this.f7663h;
            int i10 = this.f7657b;
            if (i9 >= i6 * 2 * i10) {
                break;
            }
            this.f7665j[(i10 * i7) + i9] = 0;
            i9++;
        }
        this.f7666k += i6 * 2;
        r();
        if (this.f7668m > i8) {
            this.f7668m = i8;
        }
        this.f7666k = 0;
        this.f7673r = 0;
        this.f7670o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i6 = this.f7657b;
        int i7 = remaining / i6;
        short[] f6 = f(this.f7665j, this.f7666k, i7);
        this.f7665j = f6;
        shortBuffer.get(f6, this.f7666k * this.f7657b, ((i6 * i7) * 2) / 2);
        this.f7666k += i7;
        r();
    }

    public final void u(int i6) {
        if (i6 == 0) {
            return;
        }
        short[] sArr = this.f7669n;
        int i7 = this.f7657b;
        System.arraycopy(sArr, i6 * i7, sArr, 0, (this.f7670o - i6) * i7);
        this.f7670o -= i6;
    }

    public final void v(int i6) {
        int i7 = this.f7666k - i6;
        short[] sArr = this.f7665j;
        int i8 = this.f7657b;
        System.arraycopy(sArr, i6 * i8, sArr, 0, i8 * i7);
        this.f7666k = i7;
    }

    public final int w(short[] sArr, int i6, float f6, int i7) {
        int i8;
        if (f6 >= 2.0f) {
            i8 = (int) (i7 / (f6 - 1.0f));
        } else {
            this.f7673r = (int) ((i7 * (2.0f - f6)) / (f6 - 1.0f));
            i8 = i7;
        }
        short[] f7 = f(this.f7667l, this.f7668m, i8);
        this.f7667l = f7;
        p(i8, this.f7657b, f7, this.f7668m, sArr, i6, sArr, i6 + i7);
        this.f7668m += i8;
        return i8;
    }
}
