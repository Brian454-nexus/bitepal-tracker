package E1;

import c1.AbstractC1133o;
import c1.C1143y;

/* renamed from: E1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0299a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f959a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f960b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: E1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f961a;

        /* renamed from: b, reason: collision with root package name */
        public final int f962b;

        /* renamed from: c, reason: collision with root package name */
        public final String f963c;

        public b(int i6, int i7, String str) {
            this.f961a = i6;
            this.f962b = i7;
            this.f963c = str;
        }
    }

    public static byte[] a(int i6, int i7) {
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int[] iArr = f959a;
            if (i10 >= iArr.length) {
                break;
            }
            if (i6 == iArr[i10]) {
                i9 = i10;
            }
            i10++;
        }
        int i11 = -1;
        while (true) {
            int[] iArr2 = f960b;
            if (i8 >= iArr2.length) {
                break;
            }
            if (i7 == iArr2[i8]) {
                i11 = i8;
            }
            i8++;
        }
        if (i6 != -1 && i11 != -1) {
            return b(2, i9, i11);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i6 + ", " + i7);
    }

    public static byte[] b(int i6, int i7, int i8) {
        return new byte[]{(byte) (((i6 << 3) & 248) | ((i7 >> 1) & 7)), (byte) (((i7 << 7) & 128) | ((i8 << 3) & 120))};
    }

    public static int c(C1143y c1143y) {
        int h6 = c1143y.h(5);
        return h6 == 31 ? c1143y.h(6) + 32 : h6;
    }

    public static int d(C1143y c1143y) {
        int h6 = c1143y.h(4);
        if (h6 == 15) {
            if (c1143y.b() >= 24) {
                return c1143y.h(24);
            }
            throw Z0.z.a("AAC header insufficient data", null);
        }
        if (h6 < 13) {
            return f959a[h6];
        }
        throw Z0.z.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(C1143y c1143y, boolean z6) {
        int c6 = c(c1143y);
        int d6 = d(c1143y);
        int h6 = c1143y.h(4);
        String str = "mp4a.40." + c6;
        if (c6 == 5 || c6 == 29) {
            d6 = d(c1143y);
            c6 = c(c1143y);
            if (c6 == 22) {
                h6 = c1143y.h(4);
            }
        }
        if (z6) {
            if (c6 != 1 && c6 != 2 && c6 != 3 && c6 != 4 && c6 != 6 && c6 != 7 && c6 != 17) {
                switch (c6) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw Z0.z.e("Unsupported audio object type: " + c6);
                }
            }
            g(c1143y, c6, h6);
            switch (c6) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h7 = c1143y.h(2);
                    if (h7 == 2 || h7 == 3) {
                        throw Z0.z.e("Unsupported epConfig: " + h7);
                    }
            }
        }
        int i6 = f960b[h6];
        if (i6 != -1) {
            return new b(d6, i6, str);
        }
        throw Z0.z.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new C1143y(bArr), false);
    }

    public static void g(C1143y c1143y, int i6, int i7) {
        if (c1143y.g()) {
            AbstractC1133o.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c1143y.g()) {
            c1143y.r(14);
        }
        boolean g6 = c1143y.g();
        if (i7 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i6 == 6 || i6 == 20) {
            c1143y.r(3);
        }
        if (g6) {
            if (i6 == 22) {
                c1143y.r(16);
            }
            if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                c1143y.r(3);
            }
            c1143y.r(1);
        }
    }
}
