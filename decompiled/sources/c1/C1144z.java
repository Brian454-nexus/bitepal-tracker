package c1;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: c1.z, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1144z {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f10644d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f10645e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final z6.A f10646f = z6.A.B(y6.e.a, y6.e.c, y6.e.f, y6.e.d, y6.e.e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10647a;

    /* renamed from: b, reason: collision with root package name */
    public int f10648b;

    /* renamed from: c, reason: collision with root package name */
    public int f10649c;

    public C1144z() {
        this.f10647a = AbstractC1117K.f10565f;
    }

    public String A() {
        return n((char) 0);
    }

    public String B(int i6) {
        if (i6 == 0) {
            return "";
        }
        int i7 = this.f10648b;
        int i8 = (i7 + i6) - 1;
        String J6 = AbstractC1117K.J(this.f10647a, i7, (i8 >= this.f10649c || this.f10647a[i8] != 0) ? i6 : i6 - 1);
        this.f10648b += i6;
        return J6;
    }

    public short C() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = (bArr[i6] & 255) << 8;
        this.f10648b = i6 + 2;
        return (short) ((bArr[i7] & 255) | i8);
    }

    public String D(int i6) {
        return E(i6, y6.e.c);
    }

    public String E(int i6, Charset charset) {
        String str = new String(this.f10647a, this.f10648b, i6, charset);
        this.f10648b += i6;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        this.f10648b = i6 + 1;
        return bArr[i6] & 255;
    }

    public int H() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = (bArr[i6] & 255) << 8;
        this.f10648b = i6 + 2;
        int i9 = (bArr[i7] & 255) | i8;
        this.f10648b = i6 + 4;
        return i9;
    }

    public long I() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        this.f10648b = i6 + 1;
        this.f10648b = i6 + 2;
        this.f10648b = i6 + 3;
        long j6 = ((bArr[i6] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f10648b = i6 + 4;
        return (bArr[r4] & 255) | j6;
    }

    public int J() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = (bArr[i6] & 255) << 16;
        int i9 = i6 + 2;
        this.f10648b = i9;
        int i10 = ((bArr[i7] & 255) << 8) | i8;
        this.f10648b = i6 + 3;
        return (bArr[i9] & 255) | i10;
    }

    public int K() {
        int p6 = p();
        if (p6 >= 0) {
            return p6;
        }
        throw new IllegalStateException("Top bit not zero: " + p6);
    }

    public long L() {
        long z6 = z();
        if (z6 >= 0) {
            return z6;
        }
        throw new IllegalStateException("Top bit not zero: " + z6);
    }

    public int M() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = (bArr[i6] & 255) << 8;
        this.f10648b = i6 + 2;
        return (bArr[i7] & 255) | i8;
    }

    public long N() {
        int i6;
        int i7;
        long j6 = this.f10647a[this.f10648b];
        int i8 = 7;
        while (true) {
            if (i8 < 0) {
                break;
            }
            if (((1 << i8) & j6) != 0) {
                i8--;
            } else if (i8 < 6) {
                j6 &= r6 - 1;
                i7 = 7 - i8;
            } else if (i8 == 7) {
                i7 = 1;
            }
        }
        i7 = 0;
        if (i7 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j6);
        }
        for (i6 = 1; i6 < i7; i6++) {
            if ((this.f10647a[this.f10648b + i6] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j6);
            }
            j6 = (j6 << 6) | (r3 & 63);
        }
        this.f10648b += i7;
        return j6;
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.f10647a;
            int i6 = this.f10648b;
            if (bArr[i6] == -17 && bArr[i6 + 1] == -69 && bArr[i6 + 2] == -65) {
                this.f10648b = i6 + 3;
                return y6.e.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f10647a;
        int i7 = this.f10648b;
        byte b6 = bArr2[i7];
        if (b6 == -2 && bArr2[i7 + 1] == -1) {
            this.f10648b = i7 + 2;
            return y6.e.d;
        }
        if (b6 != -1 || bArr2[i7 + 1] != -2) {
            return null;
        }
        this.f10648b = i7 + 2;
        return y6.e.e;
    }

    public void P(int i6) {
        R(b() < i6 ? new byte[i6] : this.f10647a, i6);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i6) {
        this.f10647a = bArr;
        this.f10649c = i6;
        this.f10648b = 0;
    }

    public void S(int i6) {
        AbstractC1119a.a(i6 >= 0 && i6 <= this.f10647a.length);
        this.f10649c = i6;
    }

    public void T(int i6) {
        AbstractC1119a.a(i6 >= 0 && i6 <= this.f10649c);
        this.f10648b = i6;
    }

    public void U(int i6) {
        T(this.f10648b + i6);
    }

    public final void V(Charset charset) {
        if (m(charset, f10644d) == '\r') {
            m(charset, f10645e);
        }
    }

    public int a() {
        return this.f10649c - this.f10648b;
    }

    public int b() {
        return this.f10647a.length;
    }

    public void c(int i6) {
        if (i6 > b()) {
            this.f10647a = Arrays.copyOf(this.f10647a, i6);
        }
    }

    public final int d(Charset charset) {
        int i6;
        if (charset.equals(y6.e.c) || charset.equals(y6.e.a)) {
            i6 = 1;
        } else {
            if (!charset.equals(y6.e.f) && !charset.equals(y6.e.e) && !charset.equals(y6.e.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i6 = 2;
        }
        int i7 = this.f10648b;
        while (true) {
            int i8 = this.f10649c;
            if (i7 >= i8 - (i6 - 1)) {
                return i8;
            }
            if ((charset.equals(y6.e.c) || charset.equals(y6.e.a)) && AbstractC1117K.D0(this.f10647a[i7])) {
                break;
            }
            if (charset.equals(y6.e.f) || charset.equals(y6.e.d)) {
                byte[] bArr = this.f10647a;
                if (bArr[i7] == 0 && AbstractC1117K.D0(bArr[i7 + 1])) {
                    break;
                }
            }
            if (charset.equals(y6.e.e)) {
                byte[] bArr2 = this.f10647a;
                if (bArr2[i7 + 1] == 0 && AbstractC1117K.D0(bArr2[i7])) {
                    break;
                }
            }
            i7 += i6;
        }
        return i7;
    }

    public byte[] e() {
        return this.f10647a;
    }

    public int f() {
        return this.f10648b;
    }

    public int g() {
        return this.f10649c;
    }

    public char h(Charset charset) {
        AbstractC1119a.b(f10646f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public final int i(Charset charset) {
        byte a6;
        char c6;
        int i6 = 1;
        if ((charset.equals(y6.e.c) || charset.equals(y6.e.a)) && a() >= 1) {
            a6 = (byte) C6.c.a(C6.j.b(this.f10647a[this.f10648b]));
        } else {
            if ((charset.equals(y6.e.f) || charset.equals(y6.e.d)) && a() >= 2) {
                byte[] bArr = this.f10647a;
                int i7 = this.f10648b;
                c6 = C6.c.c(bArr[i7], bArr[i7 + 1]);
            } else {
                if (!charset.equals(y6.e.e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f10647a;
                int i8 = this.f10648b;
                c6 = C6.c.c(bArr2[i8 + 1], bArr2[i8]);
            }
            a6 = (byte) c6;
            i6 = 2;
        }
        return (C6.c.a(a6) << 16) + i6;
    }

    public int j() {
        return this.f10647a[this.f10648b] & 255;
    }

    public void k(C1143y c1143y, int i6) {
        l(c1143y.f10640a, 0, i6);
        c1143y.p(0);
    }

    public void l(byte[] bArr, int i6, int i7) {
        System.arraycopy(this.f10647a, this.f10648b, bArr, i6, i7);
        this.f10648b += i7;
    }

    public final char m(Charset charset, char[] cArr) {
        int i6 = i(charset);
        if (i6 == 0) {
            return (char) 0;
        }
        char c6 = (char) (i6 >> 16);
        if (!C6.c.b(cArr, c6)) {
            return (char) 0;
        }
        this.f10648b += i6 & 65535;
        return c6;
    }

    public String n(char c6) {
        if (a() == 0) {
            return null;
        }
        int i6 = this.f10648b;
        while (i6 < this.f10649c && this.f10647a[i6] != c6) {
            i6++;
        }
        byte[] bArr = this.f10647a;
        int i7 = this.f10648b;
        String J6 = AbstractC1117K.J(bArr, i7, i6 - i7);
        this.f10648b = i6;
        if (i6 < this.f10649c) {
            this.f10648b = i6 + 1;
        }
        return J6;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = (bArr[i6] & 255) << 24;
        int i9 = i6 + 2;
        this.f10648b = i9;
        int i10 = ((bArr[i7] & 255) << 16) | i8;
        int i11 = i6 + 3;
        this.f10648b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 8);
        this.f10648b = i6 + 4;
        return (bArr[i11] & 255) | i12;
    }

    public int q() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = ((bArr[i6] & 255) << 24) >> 8;
        int i9 = i6 + 2;
        this.f10648b = i9;
        int i10 = ((bArr[i7] & 255) << 8) | i8;
        this.f10648b = i6 + 3;
        return (bArr[i9] & 255) | i10;
    }

    public String r() {
        return s(y6.e.c);
    }

    public String s(Charset charset) {
        AbstractC1119a.b(f10646f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(y6.e.a)) {
            O();
        }
        String E6 = E(d(charset) - this.f10648b, charset);
        if (this.f10648b == this.f10649c) {
            return E6;
        }
        V(charset);
        return E6;
    }

    public int t() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = bArr[i6] & 255;
        int i9 = i6 + 2;
        this.f10648b = i9;
        int i10 = ((bArr[i7] & 255) << 8) | i8;
        int i11 = i6 + 3;
        this.f10648b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f10648b = i6 + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    public long u() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        this.f10648b = i6 + 1;
        this.f10648b = i6 + 2;
        this.f10648b = i6 + 3;
        long j6 = (bArr[i6] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f10648b = i6 + 4;
        long j7 = j6 | ((bArr[r8] & 255) << 24);
        this.f10648b = i6 + 5;
        long j8 = j7 | ((bArr[r7] & 255) << 32);
        this.f10648b = i6 + 6;
        long j9 = j8 | ((bArr[r8] & 255) << 40);
        this.f10648b = i6 + 7;
        long j10 = j9 | ((bArr[r7] & 255) << 48);
        this.f10648b = i6 + 8;
        return ((bArr[r8] & 255) << 56) | j10;
    }

    public short v() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = bArr[i6] & 255;
        this.f10648b = i6 + 2;
        return (short) (((bArr[i7] & 255) << 8) | i8);
    }

    public long w() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        this.f10648b = i6 + 1;
        this.f10648b = i6 + 2;
        this.f10648b = i6 + 3;
        long j6 = (bArr[i6] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f10648b = i6 + 4;
        return ((bArr[r4] & 255) << 24) | j6;
    }

    public int x() {
        int t6 = t();
        if (t6 >= 0) {
            return t6;
        }
        throw new IllegalStateException("Top bit not zero: " + t6);
    }

    public int y() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        int i7 = i6 + 1;
        this.f10648b = i7;
        int i8 = bArr[i6] & 255;
        this.f10648b = i6 + 2;
        return ((bArr[i7] & 255) << 8) | i8;
    }

    public long z() {
        byte[] bArr = this.f10647a;
        int i6 = this.f10648b;
        this.f10648b = i6 + 1;
        this.f10648b = i6 + 2;
        this.f10648b = i6 + 3;
        long j6 = ((bArr[i6] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f10648b = i6 + 4;
        long j7 = j6 | ((bArr[r4] & 255) << 32);
        this.f10648b = i6 + 5;
        long j8 = j7 | ((bArr[r7] & 255) << 24);
        this.f10648b = i6 + 6;
        long j9 = j8 | ((bArr[r4] & 255) << 16);
        this.f10648b = i6 + 7;
        long j10 = j9 | ((bArr[r7] & 255) << 8);
        this.f10648b = i6 + 8;
        return (bArr[r4] & 255) | j10;
    }

    public C1144z(int i6) {
        this.f10647a = new byte[i6];
        this.f10649c = i6;
    }

    public C1144z(byte[] bArr) {
        this.f10647a = bArr;
        this.f10649c = bArr.length;
    }

    public C1144z(byte[] bArr, int i6) {
        this.f10647a = bArr;
        this.f10649c = i6;
    }
}
