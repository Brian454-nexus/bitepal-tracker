package Z1;

import E1.AbstractC0316s;
import E1.InterfaceC0315q;
import Z0.z;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f7320a;

    /* renamed from: b, reason: collision with root package name */
    public int f7321b;

    /* renamed from: c, reason: collision with root package name */
    public long f7322c;

    /* renamed from: d, reason: collision with root package name */
    public long f7323d;

    /* renamed from: e, reason: collision with root package name */
    public long f7324e;

    /* renamed from: f, reason: collision with root package name */
    public long f7325f;

    /* renamed from: g, reason: collision with root package name */
    public int f7326g;

    /* renamed from: h, reason: collision with root package name */
    public int f7327h;

    /* renamed from: i, reason: collision with root package name */
    public int f7328i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f7329j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    public final C1144z f7330k = new C1144z(255);

    public boolean a(InterfaceC0315q interfaceC0315q, boolean z6) {
        b();
        this.f7330k.P(27);
        if (!AbstractC0316s.b(interfaceC0315q, this.f7330k.e(), 0, 27, z6) || this.f7330k.I() != 1332176723) {
            return false;
        }
        int G6 = this.f7330k.G();
        this.f7320a = G6;
        if (G6 != 0) {
            if (z6) {
                return false;
            }
            throw z.e("unsupported bit stream revision");
        }
        this.f7321b = this.f7330k.G();
        this.f7322c = this.f7330k.u();
        this.f7323d = this.f7330k.w();
        this.f7324e = this.f7330k.w();
        this.f7325f = this.f7330k.w();
        int G7 = this.f7330k.G();
        this.f7326g = G7;
        this.f7327h = G7 + 27;
        this.f7330k.P(G7);
        if (!AbstractC0316s.b(interfaceC0315q, this.f7330k.e(), 0, this.f7326g, z6)) {
            return false;
        }
        for (int i6 = 0; i6 < this.f7326g; i6++) {
            this.f7329j[i6] = this.f7330k.G();
            this.f7328i += this.f7329j[i6];
        }
        return true;
    }

    public void b() {
        this.f7320a = 0;
        this.f7321b = 0;
        this.f7322c = 0L;
        this.f7323d = 0L;
        this.f7324e = 0L;
        this.f7325f = 0L;
        this.f7326g = 0;
        this.f7327h = 0;
        this.f7328i = 0;
    }

    public boolean c(InterfaceC0315q interfaceC0315q) {
        return d(interfaceC0315q, -1L);
    }

    public boolean d(InterfaceC0315q interfaceC0315q, long j6) {
        AbstractC1119a.a(interfaceC0315q.getPosition() == interfaceC0315q.h());
        this.f7330k.P(4);
        while (true) {
            if ((j6 == -1 || interfaceC0315q.getPosition() + 4 < j6) && AbstractC0316s.b(interfaceC0315q, this.f7330k.e(), 0, 4, true)) {
                this.f7330k.T(0);
                if (this.f7330k.I() == 1332176723) {
                    interfaceC0315q.o();
                    return true;
                }
                interfaceC0315q.p(1);
            }
        }
        do {
            if (j6 != -1 && interfaceC0315q.getPosition() >= j6) {
                break;
            }
        } while (interfaceC0315q.k(1) != -1);
        return false;
    }
}
