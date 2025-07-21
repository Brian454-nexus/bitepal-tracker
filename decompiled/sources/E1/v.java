package E1;

import c1.AbstractC1117K;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class v {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1081a;
    }

    public static boolean a(C1144z c1144z, y yVar, int i6) {
        int j6 = j(c1144z, i6);
        return j6 != -1 && j6 <= yVar.f1086b;
    }

    public static boolean b(C1144z c1144z, int i6) {
        return c1144z.G() == AbstractC1117K.y(c1144z.e(), i6, c1144z.f() - 1, 0);
    }

    public static boolean c(C1144z c1144z, y yVar, boolean z6, a aVar) {
        try {
            long N5 = c1144z.N();
            if (!z6) {
                N5 *= yVar.f1086b;
            }
            aVar.f1081a = N5;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(C1144z c1144z, y yVar, int i6, a aVar) {
        int f6 = c1144z.f();
        long I6 = c1144z.I();
        long j6 = I6 >>> 16;
        if (j6 != i6) {
            return false;
        }
        return g((int) ((I6 >> 4) & 15), yVar) && f((int) ((I6 >> 1) & 7), yVar) && !(((I6 & 1) > 1L ? 1 : ((I6 & 1) == 1L ? 0 : -1)) == 0) && c(c1144z, yVar, ((j6 & 1) > 1L ? 1 : ((j6 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(c1144z, yVar, (int) ((I6 >> 12) & 15)) && e(c1144z, yVar, (int) ((I6 >> 8) & 15)) && b(c1144z, f6);
    }

    public static boolean e(C1144z c1144z, y yVar, int i6) {
        int i7 = yVar.f1089e;
        if (i6 == 0) {
            return true;
        }
        if (i6 <= 11) {
            return i6 == yVar.f1090f;
        }
        if (i6 == 12) {
            return c1144z.G() * 1000 == i7;
        }
        if (i6 <= 14) {
            int M5 = c1144z.M();
            if (i6 == 14) {
                M5 *= 10;
            }
            if (M5 == i7) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int i6, y yVar) {
        return i6 == 0 || i6 == yVar.f1093i;
    }

    public static boolean g(int i6, y yVar) {
        return i6 <= 7 ? i6 == yVar.f1091g - 1 : i6 <= 10 && yVar.f1091g == 2;
    }

    public static boolean h(InterfaceC0315q interfaceC0315q, y yVar, int i6, a aVar) {
        long h6 = interfaceC0315q.h();
        byte[] bArr = new byte[2];
        interfaceC0315q.s(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i6) {
            interfaceC0315q.o();
            interfaceC0315q.j((int) (h6 - interfaceC0315q.getPosition()));
            return false;
        }
        C1144z c1144z = new C1144z(16);
        System.arraycopy(bArr, 0, c1144z.e(), 0, 2);
        c1144z.S(AbstractC0316s.c(interfaceC0315q, c1144z.e(), 2, 14));
        interfaceC0315q.o();
        interfaceC0315q.j((int) (h6 - interfaceC0315q.getPosition()));
        return d(c1144z, yVar, i6, aVar);
    }

    public static long i(InterfaceC0315q interfaceC0315q, y yVar) {
        interfaceC0315q.o();
        interfaceC0315q.j(1);
        byte[] bArr = new byte[1];
        interfaceC0315q.s(bArr, 0, 1);
        boolean z6 = (bArr[0] & 1) == 1;
        interfaceC0315q.j(2);
        int i6 = z6 ? 7 : 6;
        C1144z c1144z = new C1144z(i6);
        c1144z.S(AbstractC0316s.c(interfaceC0315q, c1144z.e(), 0, i6));
        interfaceC0315q.o();
        a aVar = new a();
        if (c(c1144z, yVar, z6, aVar)) {
            return aVar.f1081a;
        }
        throw Z0.z.a(null, null);
    }

    public static int j(C1144z c1144z, int i6) {
        switch (i6) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i6 - 2);
            case 6:
                return c1144z.G() + 1;
            case 7:
                return c1144z.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i6 - 8);
            default:
                return -1;
        }
    }
}
