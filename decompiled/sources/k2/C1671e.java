package k2;

import E1.AbstractC0301c;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import c1.C1144z;
import k2.K;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1671e implements InterfaceC0314p {

    /* renamed from: d, reason: collision with root package name */
    public static final E1.u f16517d = new E1.u() { // from class: k2.d
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return C1671e.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C1672f f16518a = new C1672f();

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16519b = new C1144z(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16520c;

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new C1671e()};
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f16520c = false;
        this.f16518a.b();
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f16518a.e(rVar, new K.d(0, 1));
        rVar.k();
        rVar.n(new J.b(-9223372036854775807L));
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        int read = interfaceC0315q.read(this.f16519b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f16519b.T(0);
        this.f16519b.S(read);
        if (!this.f16520c) {
            this.f16518a.d(0L, 4);
            this.f16520c = true;
        }
        this.f16518a.a(this.f16519b);
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
            interfaceC0315q.s(c1144z.e(), 0, 7);
            c1144z.T(0);
            int M5 = c1144z.M();
            if (M5 == 44096 || M5 == 44097) {
                i7++;
                if (i7 >= 4) {
                    return true;
                }
                int e6 = AbstractC0301c.e(c1144z.e(), M5);
                if (e6 == -1) {
                    return false;
                }
                interfaceC0315q.j(e6 - 7);
            } else {
                interfaceC0315q.o();
                i8++;
                if (i8 - i6 >= 8192) {
                    return false;
                }
                interfaceC0315q.j(i8);
                i7 = 0;
            }
        }
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
