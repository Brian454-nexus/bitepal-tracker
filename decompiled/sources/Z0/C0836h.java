package Z0;

import c1.AbstractC1117K;
import java.util.Arrays;

/* renamed from: Z0.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0836h {

    /* renamed from: h, reason: collision with root package name */
    public static final C0836h f6884h = new b().d(1).c(2).e(3).a();

    /* renamed from: i, reason: collision with root package name */
    public static final C0836h f6885i = new b().d(1).c(1).e(2).a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f6886j = AbstractC1117K.x0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f6887k = AbstractC1117K.x0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f6888l = AbstractC1117K.x0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f6889m = AbstractC1117K.x0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f6890n = AbstractC1117K.x0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f6891o = AbstractC1117K.x0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f6892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6894c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6895d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6897f;

    /* renamed from: g, reason: collision with root package name */
    public int f6898g;

    /* renamed from: Z0.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f6899a;

        /* renamed from: b, reason: collision with root package name */
        public int f6900b;

        /* renamed from: c, reason: collision with root package name */
        public int f6901c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f6902d;

        /* renamed from: e, reason: collision with root package name */
        public int f6903e;

        /* renamed from: f, reason: collision with root package name */
        public int f6904f;

        public C0836h a() {
            return new C0836h(this.f6899a, this.f6900b, this.f6901c, this.f6902d, this.f6903e, this.f6904f);
        }

        public b b(int i6) {
            this.f6904f = i6;
            return this;
        }

        public b c(int i6) {
            this.f6900b = i6;
            return this;
        }

        public b d(int i6) {
            this.f6899a = i6;
            return this;
        }

        public b e(int i6) {
            this.f6901c = i6;
            return this;
        }

        public b f(byte[] bArr) {
            this.f6902d = bArr;
            return this;
        }

        public b g(int i6) {
            this.f6903e = i6;
            return this;
        }

        public b() {
            this.f6899a = -1;
            this.f6900b = -1;
            this.f6901c = -1;
            this.f6903e = -1;
            this.f6904f = -1;
        }

        public b(C0836h c0836h) {
            this.f6899a = c0836h.f6892a;
            this.f6900b = c0836h.f6893b;
            this.f6901c = c0836h.f6894c;
            this.f6902d = c0836h.f6895d;
            this.f6903e = c0836h.f6896e;
            this.f6904f = c0836h.f6897f;
        }
    }

    public static String b(int i6) {
        if (i6 == -1) {
            return "NA";
        }
        return i6 + "bit Chroma";
    }

    public static String c(int i6) {
        if (i6 == -1) {
            return "Unset color range";
        }
        if (i6 == 1) {
            return "Full range";
        }
        if (i6 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i6;
    }

    public static String d(int i6) {
        if (i6 == -1) {
            return "Unset color space";
        }
        if (i6 == 6) {
            return "BT2020";
        }
        if (i6 == 1) {
            return "BT709";
        }
        if (i6 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i6;
    }

    public static String e(int i6) {
        if (i6 == -1) {
            return "Unset color transfer";
        }
        if (i6 == 10) {
            return "Gamma 2.2";
        }
        if (i6 == 1) {
            return "Linear";
        }
        if (i6 == 2) {
            return "sRGB";
        }
        if (i6 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i6 == 6) {
            return "ST2084 PQ";
        }
        if (i6 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i6;
    }

    public static boolean h(C0836h c0836h) {
        if (c0836h == null) {
            return true;
        }
        int i6 = c0836h.f6892a;
        if (i6 != -1 && i6 != 1 && i6 != 2) {
            return false;
        }
        int i7 = c0836h.f6893b;
        if (i7 != -1 && i7 != 2) {
            return false;
        }
        int i8 = c0836h.f6894c;
        if ((i8 != -1 && i8 != 3) || c0836h.f6895d != null) {
            return false;
        }
        int i9 = c0836h.f6897f;
        if (i9 != -1 && i9 != 8) {
            return false;
        }
        int i10 = c0836h.f6896e;
        return i10 == -1 || i10 == 8;
    }

    public static int j(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 != 9) {
            return (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i6) {
        if (i6 == 1) {
            return 3;
        }
        if (i6 == 4) {
            return 10;
        }
        if (i6 == 13) {
            return 2;
        }
        if (i6 == 16) {
            return 6;
        }
        if (i6 != 18) {
            return (i6 == 6 || i6 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String l(int i6) {
        if (i6 == -1) {
            return "NA";
        }
        return i6 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0836h.class == obj.getClass()) {
            C0836h c0836h = (C0836h) obj;
            if (this.f6892a == c0836h.f6892a && this.f6893b == c0836h.f6893b && this.f6894c == c0836h.f6894c && Arrays.equals(this.f6895d, c0836h.f6895d) && this.f6896e == c0836h.f6896e && this.f6897f == c0836h.f6897f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f6896e == -1 || this.f6897f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f6892a == -1 || this.f6893b == -1 || this.f6894c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f6898g == 0) {
            this.f6898g = ((((((((((527 + this.f6892a) * 31) + this.f6893b) * 31) + this.f6894c) * 31) + Arrays.hashCode(this.f6895d)) * 31) + this.f6896e) * 31) + this.f6897f;
        }
        return this.f6898g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String H6 = g() ? AbstractC1117K.H("%s/%s/%s", d(this.f6892a), c(this.f6893b), e(this.f6894c)) : "NA/NA/NA";
        if (f()) {
            str = this.f6896e + "/" + this.f6897f;
        } else {
            str = "NA/NA";
        }
        return H6 + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.f6892a));
        sb.append(", ");
        sb.append(c(this.f6893b));
        sb.append(", ");
        sb.append(e(this.f6894c));
        sb.append(", ");
        sb.append(this.f6895d != null);
        sb.append(", ");
        sb.append(l(this.f6896e));
        sb.append(", ");
        sb.append(b(this.f6897f));
        sb.append(")");
        return sb.toString();
    }

    public C0836h(int i6, int i7, int i8, byte[] bArr, int i9, int i10) {
        this.f6892a = i6;
        this.f6893b = i7;
        this.f6894c = i8;
        this.f6895d = bArr;
        this.f6896e = i9;
        this.f6897f = i10;
    }
}
