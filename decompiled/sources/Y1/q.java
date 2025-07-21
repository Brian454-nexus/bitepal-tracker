package Y1;

import Z0.x;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {
    public static int a(int i6, C1144z c1144z, int i7) {
        if (i6 == 12) {
            return 240;
        }
        if (i6 == 13) {
            return 120;
        }
        if (i6 == 21 && c1144z.a() >= 8 && c1144z.f() + 8 <= i7) {
            int p6 = c1144z.p();
            int p7 = c1144z.p();
            if (p6 >= 12 && p7 == 1936877170) {
                return c1144z.H();
            }
        }
        return -2147483647;
    }

    public static x b(C1144z c1144z, int i6) {
        c1144z.U(12);
        while (c1144z.f() < i6) {
            int f6 = c1144z.f();
            int p6 = c1144z.p();
            if (c1144z.p() == 1935766900) {
                if (p6 < 16) {
                    return null;
                }
                c1144z.U(4);
                int i7 = -1;
                int i8 = 0;
                for (int i9 = 0; i9 < 2; i9++) {
                    int G6 = c1144z.G();
                    int G7 = c1144z.G();
                    if (G6 == 0) {
                        i7 = G7;
                    } else if (G6 == 1) {
                        i8 = G7;
                    }
                }
                int a6 = a(i7, c1144z, i6);
                if (a6 == -2147483647) {
                    return null;
                }
                return new x(new T1.d(a6, i8));
            }
            c1144z.T(f6 + p6);
        }
        return null;
    }
}
