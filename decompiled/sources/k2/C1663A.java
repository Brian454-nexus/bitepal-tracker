package k2;

import E1.InterfaceC0315q;
import c1.AbstractC1117K;
import c1.C1111E;
import c1.C1144z;

/* renamed from: k2.A, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1663A {

    /* renamed from: c, reason: collision with root package name */
    public boolean f16409c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16410d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16411e;

    /* renamed from: a, reason: collision with root package name */
    public final C1111E f16407a = new C1111E(0);

    /* renamed from: f, reason: collision with root package name */
    public long f16412f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f16413g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f16414h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16408b = new C1144z();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(C1144z c1144z) {
        int f6 = c1144z.f();
        if (c1144z.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1144z.l(bArr, 0, 9);
        c1144z.T(f6);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b6 = bArr[0];
        long j6 = (((b6 & 56) >> 3) << 30) | ((b6 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b7 = bArr[2];
        return j6 | (((b7 & 248) >> 3) << 15) | ((b7 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int b(InterfaceC0315q interfaceC0315q) {
        this.f16408b.Q(AbstractC1117K.f10565f);
        this.f16409c = true;
        interfaceC0315q.o();
        return 0;
    }

    public long c() {
        return this.f16414h;
    }

    public C1111E d() {
        return this.f16407a;
    }

    public boolean e() {
        return this.f16409c;
    }

    public final int f(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }

    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        if (!this.f16411e) {
            return j(interfaceC0315q, i6);
        }
        if (this.f16413g == -9223372036854775807L) {
            return b(interfaceC0315q);
        }
        if (!this.f16410d) {
            return h(interfaceC0315q, i6);
        }
        long j6 = this.f16412f;
        if (j6 == -9223372036854775807L) {
            return b(interfaceC0315q);
        }
        this.f16414h = this.f16407a.c(this.f16413g) - this.f16407a.b(j6);
        return b(interfaceC0315q);
    }

    public final int h(InterfaceC0315q interfaceC0315q, E1.I i6) {
        int min = (int) Math.min(20000L, interfaceC0315q.a());
        long j6 = 0;
        if (interfaceC0315q.getPosition() != j6) {
            i6.f910a = j6;
            return 1;
        }
        this.f16408b.P(min);
        interfaceC0315q.o();
        interfaceC0315q.s(this.f16408b.e(), 0, min);
        this.f16412f = i(this.f16408b);
        this.f16410d = true;
        return 0;
    }

    public final long i(C1144z c1144z) {
        int g6 = c1144z.g();
        for (int f6 = c1144z.f(); f6 < g6 - 3; f6++) {
            if (f(c1144z.e(), f6) == 442) {
                c1144z.T(f6 + 4);
                long l6 = l(c1144z);
                if (l6 != -9223372036854775807L) {
                    return l6;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(InterfaceC0315q interfaceC0315q, E1.I i6) {
        long a6 = interfaceC0315q.a();
        int min = (int) Math.min(20000L, a6);
        long j6 = a6 - min;
        if (interfaceC0315q.getPosition() != j6) {
            i6.f910a = j6;
            return 1;
        }
        this.f16408b.P(min);
        interfaceC0315q.o();
        interfaceC0315q.s(this.f16408b.e(), 0, min);
        this.f16413g = k(this.f16408b);
        this.f16411e = true;
        return 0;
    }

    public final long k(C1144z c1144z) {
        int f6 = c1144z.f();
        for (int g6 = c1144z.g() - 4; g6 >= f6; g6--) {
            if (f(c1144z.e(), g6) == 442) {
                c1144z.T(g6 + 4);
                long l6 = l(c1144z);
                if (l6 != -9223372036854775807L) {
                    return l6;
                }
            }
        }
        return -9223372036854775807L;
    }
}
