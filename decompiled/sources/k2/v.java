package k2;

import c1.AbstractC1119a;
import c1.C1143y;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16782a;

        /* renamed from: b, reason: collision with root package name */
        public long f16783b;

        /* renamed from: c, reason: collision with root package name */
        public int f16784c;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f16785a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16786b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16787c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f16788d;

        public c(int i6, int i7, int i8, byte[] bArr) {
            this.f16785a = i6;
            this.f16786b = i7;
            this.f16787c = i8;
            this.f16788d = bArr;
        }
    }

    public static int a(int i6) {
        if (i6 == 0) {
            return 768;
        }
        if (i6 == 1) {
            return 1024;
        }
        if (i6 == 2 || i6 == 3) {
            return 2048;
        }
        if (i6 == 4) {
            return ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        throw Z0.z.e("Unsupported coreSbrFrameLengthIndex " + i6);
    }

    public static double b(int i6) {
        switch (i6) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw Z0.z.e("Unsupported sampling rate " + i6);
        }
    }

    public static int c(int i6) {
        switch (i6) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw Z0.z.e("Unsupported sampling rate index " + i6);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int d(int i6) {
        if (i6 == 0 || i6 == 1) {
            return 0;
        }
        int i7 = 2;
        if (i6 != 2) {
            i7 = 3;
            if (i6 != 3) {
                if (i6 == 4) {
                    return 1;
                }
                throw Z0.z.e("Unsupported coreSbrFrameLengthIndex " + i6);
            }
        }
        return i7;
    }

    public static boolean e(int i6) {
        return (i6 & 16777215) == 12583333;
    }

    public static int f(C1143y c1143y) {
        if (!c1143y.g()) {
            return 0;
        }
        c1143y.r(2);
        return c1143y.h(13);
    }

    public static boolean g(C1143y c1143y, b bVar) {
        c1143y.d();
        int k6 = k(c1143y, 3, 8, 8);
        bVar.f16782a = k6;
        if (k6 == -1) {
            return false;
        }
        long l6 = l(c1143y, 2, 8, 32);
        bVar.f16783b = l6;
        if (l6 == -1) {
            return false;
        }
        if (l6 > 16) {
            throw Z0.z.e("Contains sub-stream with an invalid packet label " + bVar.f16783b);
        }
        if (l6 == 0) {
            int i6 = bVar.f16782a;
            if (i6 == 1) {
                throw Z0.z.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i6 == 2) {
                throw Z0.z.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i6 == 17) {
                throw Z0.z.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int k7 = k(c1143y, 11, 24, 24);
        bVar.f16784c = k7;
        return k7 != -1;
    }

    public static c h(C1143y c1143y) {
        int h6 = c1143y.h(8);
        int h7 = c1143y.h(5);
        int h8 = h7 == 31 ? c1143y.h(24) : c(h7);
        int h9 = c1143y.h(3);
        int a6 = a(h9);
        int d6 = d(h9);
        c1143y.r(2);
        p(c1143y);
        m(c1143y, j(c1143y), d6);
        byte[] bArr = null;
        if (c1143y.g()) {
            int k6 = k(c1143y, 2, 4, 8) + 1;
            for (int i6 = 0; i6 < k6; i6++) {
                int k7 = k(c1143y, 4, 8, 16);
                int k8 = k(c1143y, 4, 8, 16);
                if (k7 == 7) {
                    int h10 = c1143y.h(4) + 1;
                    c1143y.r(4);
                    byte[] bArr2 = new byte[h10];
                    for (int i7 = 0; i7 < h10; i7++) {
                        bArr2[i7] = (byte) c1143y.h(8);
                    }
                    bArr = bArr2;
                } else {
                    c1143y.r(k8 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b6 = b(h8);
        return new c(h6, (int) (h8 * b6), (int) (a6 * b6), bArr3);
    }

    public static boolean i(C1143y c1143y) {
        c1143y.r(3);
        boolean g6 = c1143y.g();
        if (g6) {
            c1143y.r(13);
        }
        return g6;
    }

    public static int j(C1143y c1143y) {
        int h6 = c1143y.h(5);
        int i6 = 0;
        for (int i7 = 0; i7 < h6 + 1; i7++) {
            int h7 = c1143y.h(3);
            i6 += k(c1143y, 5, 8, 16) + 1;
            if ((h7 == 0 || h7 == 2) && c1143y.g()) {
                p(c1143y);
            }
        }
        return i6;
    }

    public static int k(C1143y c1143y, int i6, int i7, int i8) {
        AbstractC1119a.a(Math.max(Math.max(i6, i7), i8) <= 31);
        int i9 = (1 << i6) - 1;
        int i10 = (1 << i7) - 1;
        B6.d.a(B6.d.a(i9, i10), 1 << i8);
        if (c1143y.b() < i6) {
            return -1;
        }
        int h6 = c1143y.h(i6);
        if (h6 != i9) {
            return h6;
        }
        if (c1143y.b() < i7) {
            return -1;
        }
        int h7 = c1143y.h(i7);
        int i11 = h6 + h7;
        if (h7 != i10) {
            return i11;
        }
        if (c1143y.b() < i8) {
            return -1;
        }
        return i11 + c1143y.h(i8);
    }

    public static long l(C1143y c1143y, int i6, int i7, int i8) {
        AbstractC1119a.a(Math.max(Math.max(i6, i7), i8) <= 63);
        long j6 = (1 << i6) - 1;
        long j7 = (1 << i7) - 1;
        B6.e.a(B6.e.a(j6, j7), 1 << i8);
        if (c1143y.b() < i6) {
            return -1L;
        }
        long j8 = c1143y.j(i6);
        if (j8 != j6) {
            return j8;
        }
        if (c1143y.b() < i7) {
            return -1L;
        }
        long j9 = c1143y.j(i7);
        long j10 = j8 + j9;
        if (j9 != j7) {
            return j10;
        }
        if (c1143y.b() < i8) {
            return -1L;
        }
        return j10 + c1143y.j(i8);
    }

    public static void m(C1143y c1143y, int i6, int i7) {
        int i8;
        int k6 = k(c1143y, 4, 8, 16) + 1;
        c1143y.q();
        for (int i9 = 0; i9 < k6; i9++) {
            int h6 = c1143y.h(2);
            if (h6 == 0) {
                i(c1143y);
                if (i7 > 0) {
                    o(c1143y);
                }
            } else if (h6 == 1) {
                if (i(c1143y)) {
                    c1143y.q();
                }
                if (i7 > 0) {
                    o(c1143y);
                    i8 = c1143y.h(2);
                } else {
                    i8 = 0;
                }
                if (i8 > 0) {
                    c1143y.r(6);
                    int h7 = c1143y.h(2);
                    c1143y.r(4);
                    if (c1143y.g()) {
                        c1143y.r(5);
                    }
                    if (i8 == 2 || i8 == 3) {
                        c1143y.r(6);
                    }
                    if (h7 == 2) {
                        c1143y.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i6 - 1) / Math.log(2.0d))) + 1;
                int h8 = c1143y.h(2);
                if (h8 > 0 && c1143y.g()) {
                    c1143y.r(floor);
                }
                if (c1143y.g()) {
                    c1143y.r(floor);
                }
                if (i7 == 0 && h8 == 0) {
                    c1143y.q();
                }
            } else if (h6 == 3) {
                k(c1143y, 4, 8, 16);
                int k7 = k(c1143y, 4, 8, 16);
                if (c1143y.g()) {
                    k(c1143y, 8, 16, 0);
                }
                c1143y.q();
                if (k7 > 0) {
                    c1143y.r(k7 * 8);
                }
            }
        }
    }

    public static void n(C1143y c1143y, int i6) {
        int h6;
        boolean g6 = c1143y.g();
        int i7 = g6 ? 1 : 5;
        int i8 = g6 ? 7 : 5;
        int i9 = g6 ? 8 : 6;
        int i10 = 0;
        while (i10 < i6) {
            if (c1143y.g()) {
                c1143y.r(7);
                h6 = 0;
            } else {
                if (c1143y.h(2) == 3 && c1143y.h(i8) * i7 != 0) {
                    c1143y.q();
                }
                h6 = c1143y.h(i9) * i7;
                if (h6 != 0 && h6 != 180) {
                    c1143y.q();
                }
                c1143y.q();
            }
            if (h6 != 0 && h6 != 180 && c1143y.g()) {
                i10++;
            }
            i10++;
        }
    }

    public static void o(C1143y c1143y) {
        c1143y.r(3);
        c1143y.r(8);
        boolean g6 = c1143y.g();
        boolean g7 = c1143y.g();
        if (g6) {
            c1143y.r(5);
        }
        if (g7) {
            c1143y.r(6);
        }
    }

    public static void p(C1143y c1143y) {
        int h6 = c1143y.h(2);
        if (h6 == 0) {
            c1143y.r(6);
            return;
        }
        int k6 = k(c1143y, 5, 8, 16) + 1;
        if (h6 == 1) {
            c1143y.r(k6 * 7);
        } else if (h6 == 2) {
            n(c1143y, k6);
        }
    }
}
