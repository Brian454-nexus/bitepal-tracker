package k2;

import E1.AbstractC0300b;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import c1.C1144z;
import k2.K;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1668b implements InterfaceC0314p {

    /* renamed from: d, reason: collision with root package name */
    public static final E1.u f16500d = new E1.u() { // from class: k2.a
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return C1668b.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C1669c f16501a = new C1669c();

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16502b = new C1144z(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16503c;

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new C1668b()};
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f16503c = false;
        this.f16501a.b();
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f16501a.e(rVar, new K.d(0, 1));
        rVar.k();
        rVar.n(new J.b(-9223372036854775807L));
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        int read = interfaceC0315q.read(this.f16502b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f16502b.T(0);
        this.f16502b.S(read);
        if (!this.f16503c) {
            this.f16501a.d(0L, 4);
            this.f16503c = true;
        }
        this.f16501a.a(this.f16502b);
        return 0;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        C1144z c1144z = new C1144z(10);
        int i6 = 0;
        while (true) {
            interfaceC0315q.s(c1144z.e(), 0, 10);
            c1144z.T(0);
            if (c1144z.J() != 4801587) {
                break;
            }
            c1144z.U(3);
            int F6 = c1144z.F();
            i6 += F6 + 10;
            interfaceC0315q.j(F6);
        }
        interfaceC0315q.o();
        interfaceC0315q.j(i6);
        int i7 = 0;
        int i8 = i6;
        while (true) {
            interfaceC0315q.s(c1144z.e(), 0, 6);
            c1144z.T(0);
            if (c1144z.M() != 2935) {
                interfaceC0315q.o();
                i8++;
                if (i8 - i6 >= 8192) {
                    return false;
                }
                interfaceC0315q.j(i8);
                i7 = 0;
            } else {
                i7++;
                if (i7 >= 4) {
                    return true;
                }
                int g6 = AbstractC0300b.g(c1144z.e());
                if (g6 == -1) {
                    return false;
                }
                interfaceC0315q.j(g6 - 6);
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
