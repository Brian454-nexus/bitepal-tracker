package k2;

import E1.InterfaceC0315q;
import c1.AbstractC1117K;
import c1.C1111E;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final int f16447a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16450d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16451e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16452f;

    /* renamed from: b, reason: collision with root package name */
    public final C1111E f16448b = new C1111E(0);

    /* renamed from: g, reason: collision with root package name */
    public long f16453g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f16454h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f16455i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16449c = new C1144z();

    public H(int i6) {
        this.f16447a = i6;
    }

    public final int a(InterfaceC0315q interfaceC0315q) {
        this.f16449c.Q(AbstractC1117K.f10565f);
        this.f16450d = true;
        interfaceC0315q.o();
        return 0;
    }

    public long b() {
        return this.f16455i;
    }

    public C1111E c() {
        return this.f16448b;
    }

    public boolean d() {
        return this.f16450d;
    }

    public int e(InterfaceC0315q interfaceC0315q, E1.I i6, int i7) {
        if (i7 <= 0) {
            return a(interfaceC0315q);
        }
        if (!this.f16452f) {
            return h(interfaceC0315q, i6, i7);
        }
        if (this.f16454h == -9223372036854775807L) {
            return a(interfaceC0315q);
        }
        if (!this.f16451e) {
            return f(interfaceC0315q, i6, i7);
        }
        long j6 = this.f16453g;
        if (j6 == -9223372036854775807L) {
            return a(interfaceC0315q);
        }
        this.f16455i = this.f16448b.c(this.f16454h) - this.f16448b.b(j6);
        return a(interfaceC0315q);
    }

    public final int f(InterfaceC0315q interfaceC0315q, E1.I i6, int i7) {
        int min = (int) Math.min(this.f16447a, interfaceC0315q.a());
        long j6 = 0;
        if (interfaceC0315q.getPosition() != j6) {
            i6.f910a = j6;
            return 1;
        }
        this.f16449c.P(min);
        interfaceC0315q.o();
        interfaceC0315q.s(this.f16449c.e(), 0, min);
        this.f16453g = g(this.f16449c, i7);
        this.f16451e = true;
        return 0;
    }

    public final long g(C1144z c1144z, int i6) {
        int g6 = c1144z.g();
        for (int f6 = c1144z.f(); f6 < g6; f6++) {
            if (c1144z.e()[f6] == 71) {
                long c6 = L.c(c1144z, f6, i6);
                if (c6 != -9223372036854775807L) {
                    return c6;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(InterfaceC0315q interfaceC0315q, E1.I i6, int i7) {
        long a6 = interfaceC0315q.a();
        int min = (int) Math.min(this.f16447a, a6);
        long j6 = a6 - min;
        if (interfaceC0315q.getPosition() != j6) {
            i6.f910a = j6;
            return 1;
        }
        this.f16449c.P(min);
        interfaceC0315q.o();
        interfaceC0315q.s(this.f16449c.e(), 0, min);
        this.f16454h = i(this.f16449c, i7);
        this.f16452f = true;
        return 0;
    }

    public final long i(C1144z c1144z, int i6) {
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        for (int i7 = g6 - 188; i7 >= f6; i7--) {
            if (L.b(c1144z.e(), f6, g6, i7)) {
                long c6 = L.c(c1144z, i7, i6);
                if (c6 != -9223372036854775807L) {
                    return c6;
                }
            }
        }
        return -9223372036854775807L;
    }
}
