package E1;

import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;

/* renamed from: E1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0304f {
    public static void a(long j6, C1144z c1144z, O[] oArr) {
        while (true) {
            if (c1144z.a() <= 1) {
                return;
            }
            int c6 = c(c1144z);
            int c7 = c(c1144z);
            int f6 = c1144z.f() + c7;
            if (c7 == -1 || c7 > c1144z.a()) {
                AbstractC1133o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f6 = c1144z.g();
            } else if (c6 == 4 && c7 >= 8) {
                int G6 = c1144z.G();
                int M5 = c1144z.M();
                int p6 = M5 == 49 ? c1144z.p() : 0;
                int G7 = c1144z.G();
                if (M5 == 47) {
                    c1144z.U(1);
                }
                boolean z6 = G6 == 181 && (M5 == 49 || M5 == 47) && G7 == 3;
                if (M5 == 49) {
                    z6 &= p6 == 1195456820;
                }
                if (z6) {
                    b(j6, c1144z, oArr);
                }
            }
            c1144z.T(f6);
        }
    }

    public static void b(long j6, C1144z c1144z, O[] oArr) {
        int G6 = c1144z.G();
        if ((G6 & 64) != 0) {
            c1144z.U(1);
            int i6 = (G6 & 31) * 3;
            int f6 = c1144z.f();
            for (O o6 : oArr) {
                c1144z.T(f6);
                o6.a(c1144z, i6);
                AbstractC1119a.g(j6 != -9223372036854775807L);
                o6.f(j6, 1, i6, 0, null);
            }
        }
    }

    public static int c(C1144z c1144z) {
        int i6 = 0;
        while (c1144z.a() != 0) {
            int G6 = c1144z.G();
            i6 += G6;
            if (G6 != 255) {
                return i6;
            }
        }
        return -1;
    }
}
