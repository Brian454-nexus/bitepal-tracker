package E1;

import E1.y;
import c1.C1143y;
import c1.C1144z;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class w {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f1082a;

        public a(y yVar) {
            this.f1082a = yVar;
        }
    }

    public static boolean a(InterfaceC0315q interfaceC0315q) {
        C1144z c1144z = new C1144z(4);
        interfaceC0315q.s(c1144z.e(), 0, 4);
        return c1144z.I() == 1716281667;
    }

    public static int b(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.o();
        C1144z c1144z = new C1144z(2);
        interfaceC0315q.s(c1144z.e(), 0, 2);
        int M5 = c1144z.M();
        if ((M5 >> 2) == 16382) {
            interfaceC0315q.o();
            return M5;
        }
        interfaceC0315q.o();
        throw Z0.z.a("First frame does not start with sync code.", null);
    }

    public static Z0.x c(InterfaceC0315q interfaceC0315q, boolean z6) {
        Z0.x a6 = new D().a(interfaceC0315q, z6 ? null : S1.h.f4669b);
        if (a6 == null || a6.f() == 0) {
            return null;
        }
        return a6;
    }

    public static Z0.x d(InterfaceC0315q interfaceC0315q, boolean z6) {
        interfaceC0315q.o();
        long h6 = interfaceC0315q.h();
        Z0.x c6 = c(interfaceC0315q, z6);
        interfaceC0315q.p((int) (interfaceC0315q.h() - h6));
        return c6;
    }

    public static boolean e(InterfaceC0315q interfaceC0315q, a aVar) {
        interfaceC0315q.o();
        C1143y c1143y = new C1143y(new byte[4]);
        interfaceC0315q.s(c1143y.f10640a, 0, 4);
        boolean g6 = c1143y.g();
        int h6 = c1143y.h(7);
        int h7 = c1143y.h(24) + 4;
        if (h6 == 0) {
            aVar.f1082a = h(interfaceC0315q);
            return g6;
        }
        y yVar = aVar.f1082a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (h6 == 3) {
            aVar.f1082a = yVar.b(f(interfaceC0315q, h7));
            return g6;
        }
        if (h6 == 4) {
            aVar.f1082a = yVar.c(j(interfaceC0315q, h7));
            return g6;
        }
        if (h6 != 6) {
            interfaceC0315q.p(h7);
            return g6;
        }
        C1144z c1144z = new C1144z(h7);
        interfaceC0315q.readFully(c1144z.e(), 0, h7);
        c1144z.U(4);
        aVar.f1082a = yVar.a(z6.w.y(Q1.a.a(c1144z)));
        return g6;
    }

    public static y.a f(InterfaceC0315q interfaceC0315q, int i6) {
        C1144z c1144z = new C1144z(i6);
        interfaceC0315q.readFully(c1144z.e(), 0, i6);
        return g(c1144z);
    }

    public static y.a g(C1144z c1144z) {
        c1144z.U(1);
        int J6 = c1144z.J();
        long f6 = c1144z.f() + J6;
        int i6 = J6 / 18;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            long z6 = c1144z.z();
            if (z6 == -1) {
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                break;
            }
            jArr[i7] = z6;
            jArr2[i7] = c1144z.z();
            c1144z.U(2);
            i7++;
        }
        c1144z.U((int) (f6 - c1144z.f()));
        return new y.a(jArr, jArr2);
    }

    public static y h(InterfaceC0315q interfaceC0315q) {
        byte[] bArr = new byte[38];
        interfaceC0315q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC0315q interfaceC0315q) {
        C1144z c1144z = new C1144z(4);
        interfaceC0315q.readFully(c1144z.e(), 0, 4);
        if (c1144z.I() != 1716281667) {
            throw Z0.z.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(InterfaceC0315q interfaceC0315q, int i6) {
        C1144z c1144z = new C1144z(i6);
        interfaceC0315q.readFully(c1144z.e(), 0, i6);
        c1144z.U(4);
        return Arrays.asList(S.k(c1144z, false, false).f943b);
    }
}
