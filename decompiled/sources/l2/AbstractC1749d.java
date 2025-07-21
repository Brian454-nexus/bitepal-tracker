package l2;

import E1.InterfaceC0315q;
import Z0.z;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1144z;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1749d {

    /* renamed from: l2.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17070a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17071b;

        public a(int i6, long j6) {
            this.f17070a = i6;
            this.f17071b = j6;
        }

        public static a a(InterfaceC0315q interfaceC0315q, C1144z c1144z) {
            interfaceC0315q.s(c1144z.e(), 0, 8);
            c1144z.T(0);
            return new a(c1144z.p(), c1144z.w());
        }
    }

    public static boolean a(InterfaceC0315q interfaceC0315q) {
        C1144z c1144z = new C1144z(8);
        int i6 = a.a(interfaceC0315q, c1144z).f17070a;
        if (i6 != 1380533830 && i6 != 1380333108) {
            return false;
        }
        interfaceC0315q.s(c1144z.e(), 0, 4);
        c1144z.T(0);
        int p6 = c1144z.p();
        if (p6 == 1463899717) {
            return true;
        }
        AbstractC1133o.c("WavHeaderReader", "Unsupported form type: " + p6);
        return false;
    }

    public static C1748c b(InterfaceC0315q interfaceC0315q) {
        byte[] bArr;
        C1144z c1144z = new C1144z(16);
        a d6 = d(1718449184, interfaceC0315q, c1144z);
        AbstractC1119a.g(d6.f17071b >= 16);
        interfaceC0315q.s(c1144z.e(), 0, 16);
        c1144z.T(0);
        int y6 = c1144z.y();
        int y7 = c1144z.y();
        int x6 = c1144z.x();
        int x7 = c1144z.x();
        int y8 = c1144z.y();
        int y9 = c1144z.y();
        int i6 = ((int) d6.f17071b) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            interfaceC0315q.s(bArr, 0, i6);
        } else {
            bArr = AbstractC1117K.f10565f;
        }
        byte[] bArr2 = bArr;
        interfaceC0315q.p((int) (interfaceC0315q.h() - interfaceC0315q.getPosition()));
        return new C1748c(y6, y7, x6, x7, y8, y9, bArr2);
    }

    public static long c(InterfaceC0315q interfaceC0315q) {
        C1144z c1144z = new C1144z(8);
        a a6 = a.a(interfaceC0315q, c1144z);
        if (a6.f17070a != 1685272116) {
            interfaceC0315q.o();
            return -1L;
        }
        interfaceC0315q.j(8);
        c1144z.T(0);
        interfaceC0315q.s(c1144z.e(), 0, 8);
        long u6 = c1144z.u();
        interfaceC0315q.p(((int) a6.f17071b) + 8);
        return u6;
    }

    public static a d(int i6, InterfaceC0315q interfaceC0315q, C1144z c1144z) {
        a a6 = a.a(interfaceC0315q, c1144z);
        while (a6.f17070a != i6) {
            AbstractC1133o.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a6.f17070a);
            long j6 = a6.f17071b;
            long j7 = 8 + j6;
            if (j6 % 2 != 0) {
                j7 = 9 + j6;
            }
            if (j7 > 2147483647L) {
                throw z.e("Chunk is too large (~2GB+) to skip; id: " + a6.f17070a);
            }
            interfaceC0315q.p((int) j7);
            a6 = a.a(interfaceC0315q, c1144z);
        }
        return a6;
    }

    public static Pair e(InterfaceC0315q interfaceC0315q) {
        interfaceC0315q.o();
        a d6 = d(1684108385, interfaceC0315q, new C1144z(8));
        interfaceC0315q.p(8);
        return Pair.create(Long.valueOf(interfaceC0315q.getPosition()), Long.valueOf(d6.f17071b));
    }
}
