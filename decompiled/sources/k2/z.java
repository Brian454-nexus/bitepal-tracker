package k2;

import E1.AbstractC0303e;
import E1.InterfaceC0315q;
import c1.AbstractC1117K;
import c1.C1111E;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z extends AbstractC0303e {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements AbstractC0303e.f {

        /* renamed from: a, reason: collision with root package name */
        public final C1111E f16809a;

        /* renamed from: b, reason: collision with root package name */
        public final C1144z f16810b;

        public static void d(C1144z c1144z) {
            int k6;
            int g6 = c1144z.g();
            if (c1144z.a() < 10) {
                c1144z.T(g6);
                return;
            }
            c1144z.U(9);
            int G6 = c1144z.G() & 7;
            if (c1144z.a() < G6) {
                c1144z.T(g6);
                return;
            }
            c1144z.U(G6);
            if (c1144z.a() < 4) {
                c1144z.T(g6);
                return;
            }
            if (z.k(c1144z.e(), c1144z.f()) == 443) {
                c1144z.U(4);
                int M5 = c1144z.M();
                if (c1144z.a() < M5) {
                    c1144z.T(g6);
                    return;
                }
                c1144z.U(M5);
            }
            while (c1144z.a() >= 4 && (k6 = z.k(c1144z.e(), c1144z.f())) != 442 && k6 != 441 && (k6 >>> 8) == 1) {
                c1144z.U(4);
                if (c1144z.a() < 2) {
                    c1144z.T(g6);
                    return;
                }
                c1144z.T(Math.min(c1144z.g(), c1144z.f() + c1144z.M()));
            }
        }

        @Override // E1.AbstractC0303e.f
        public AbstractC0303e.C0023e a(InterfaceC0315q interfaceC0315q, long j6) {
            long position = interfaceC0315q.getPosition();
            int min = (int) Math.min(20000L, interfaceC0315q.a() - position);
            this.f16810b.P(min);
            interfaceC0315q.s(this.f16810b.e(), 0, min);
            return c(this.f16810b, j6, position);
        }

        @Override // E1.AbstractC0303e.f
        public void b() {
            this.f16810b.Q(AbstractC1117K.f10565f);
        }

        public final AbstractC0303e.C0023e c(C1144z c1144z, long j6, long j7) {
            int i6 = -1;
            int i7 = -1;
            long j8 = -9223372036854775807L;
            while (c1144z.a() >= 4) {
                if (z.k(c1144z.e(), c1144z.f()) != 442) {
                    c1144z.U(1);
                } else {
                    c1144z.U(4);
                    long l6 = C1663A.l(c1144z);
                    if (l6 != -9223372036854775807L) {
                        long b6 = this.f16809a.b(l6);
                        if (b6 > j6) {
                            return j8 == -9223372036854775807L ? AbstractC0303e.C0023e.d(b6, j7) : AbstractC0303e.C0023e.e(j7 + i7);
                        }
                        if (100000 + b6 > j6) {
                            return AbstractC0303e.C0023e.e(j7 + c1144z.f());
                        }
                        i7 = c1144z.f();
                        j8 = b6;
                    }
                    d(c1144z);
                    i6 = c1144z.f();
                }
            }
            return j8 != -9223372036854775807L ? AbstractC0303e.C0023e.f(j8, j7 + i6) : AbstractC0303e.C0023e.f1014d;
        }

        public b(C1111E c1111e) {
            this.f16809a = c1111e;
            this.f16810b = new C1144z();
        }
    }

    public z(C1111E c1111e, long j6, long j7) {
        super(new AbstractC0303e.b(), new b(c1111e), j6, 0L, j6 + 1, 0L, j7, 188L, 1000);
    }

    public static int k(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }
}
