package k2;

import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class L {
    public static int a(byte[] bArr, int i6, int i7) {
        while (i6 < i7 && bArr[i6] != 71) {
            i6++;
        }
        return i6;
    }

    public static boolean b(byte[] bArr, int i6, int i7, int i8) {
        int i9 = 0;
        for (int i10 = -4; i10 <= 4; i10++) {
            int i11 = (i10 * 188) + i8;
            if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                i9 = 0;
            } else {
                i9++;
                if (i9 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(C1144z c1144z, int i6, int i7) {
        c1144z.T(i6);
        if (c1144z.a() < 5) {
            return -9223372036854775807L;
        }
        int p6 = c1144z.p();
        if ((8388608 & p6) != 0 || ((2096896 & p6) >> 8) != i7 || (p6 & 32) == 0 || c1144z.G() < 7 || c1144z.a() < 7 || (c1144z.G() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c1144z.l(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
