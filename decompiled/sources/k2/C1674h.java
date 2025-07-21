package k2;

import E1.C0306h;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import java.io.EOFException;
import k2.K;

/* renamed from: k2.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1674h implements InterfaceC0314p {

    /* renamed from: m, reason: collision with root package name */
    public static final E1.u f16535m = new E1.u() { // from class: k2.g
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return C1674h.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f16536a;

    /* renamed from: b, reason: collision with root package name */
    public final C1675i f16537b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16538c;

    /* renamed from: d, reason: collision with root package name */
    public final C1144z f16539d;

    /* renamed from: e, reason: collision with root package name */
    public final C1143y f16540e;

    /* renamed from: f, reason: collision with root package name */
    public E1.r f16541f;

    /* renamed from: g, reason: collision with root package name */
    public long f16542g;

    /* renamed from: h, reason: collision with root package name */
    public long f16543h;

    /* renamed from: i, reason: collision with root package name */
    public int f16544i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16545j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16546k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16547l;

    public C1674h() {
        this(0);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new C1674h()};
    }

    private static int f(int i6, long j6) {
        return (int) ((i6 * 8000000) / j6);
    }

    private E1.J j(long j6, boolean z6) {
        return new C0306h(j6, this.f16543h, f(this.f16544i, this.f16537b.k()), this.f16544i, z6);
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        this.f16546k = false;
        this.f16537b.b();
        this.f16542g = j7;
    }

    @Override // E1.InterfaceC0314p
    public void c(E1.r rVar) {
        this.f16541f = rVar;
        this.f16537b.e(rVar, new K.d(0, 1));
        rVar.k();
    }

    public final void e(InterfaceC0315q interfaceC0315q) {
        if (this.f16545j) {
            return;
        }
        this.f16544i = -1;
        interfaceC0315q.o();
        long j6 = 0;
        if (interfaceC0315q.getPosition() == 0) {
            l(interfaceC0315q);
        }
        int i6 = 0;
        int i7 = 0;
        while (interfaceC0315q.g(this.f16539d.e(), 0, 2, true)) {
            try {
                this.f16539d.T(0);
                if (!C1675i.m(this.f16539d.M())) {
                    break;
                }
                if (!interfaceC0315q.g(this.f16539d.e(), 0, 4, true)) {
                    break;
                }
                this.f16540e.p(14);
                int h6 = this.f16540e.h(13);
                if (h6 <= 6) {
                    this.f16545j = true;
                    throw Z0.z.a("Malformed ADTS stream", null);
                }
                j6 += h6;
                i7++;
                if (i7 != 1000 && interfaceC0315q.q(h6 - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i6 = i7;
        interfaceC0315q.o();
        if (i6 > 0) {
            this.f16544i = (int) (j6 / i6);
        } else {
            this.f16544i = -1;
        }
        this.f16545j = true;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
        AbstractC1119a.i(this.f16541f);
        long a6 = interfaceC0315q.a();
        int i7 = this.f16536a;
        if ((i7 & 2) != 0 || ((i7 & 1) != 0 && a6 != -1)) {
            e(interfaceC0315q);
        }
        int read = interfaceC0315q.read(this.f16538c.e(), 0, 2048);
        boolean z6 = read == -1;
        k(a6, z6);
        if (z6) {
            return -1;
        }
        this.f16538c.T(0);
        this.f16538c.S(read);
        if (!this.f16546k) {
            this.f16537b.d(this.f16542g, 4);
            this.f16546k = true;
        }
        this.f16537b.a(this.f16538c);
        return 0;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        int l6 = l(interfaceC0315q);
        int i6 = l6;
        int i7 = 0;
        int i8 = 0;
        do {
            interfaceC0315q.s(this.f16539d.e(), 0, 2);
            this.f16539d.T(0);
            if (C1675i.m(this.f16539d.M())) {
                i7++;
                if (i7 >= 4 && i8 > 188) {
                    return true;
                }
                interfaceC0315q.s(this.f16539d.e(), 0, 4);
                this.f16540e.p(14);
                int h6 = this.f16540e.h(13);
                if (h6 <= 6) {
                    i6++;
                    interfaceC0315q.o();
                    interfaceC0315q.j(i6);
                } else {
                    interfaceC0315q.j(h6 - 6);
                    i8 += h6;
                }
            } else {
                i6++;
                interfaceC0315q.o();
                interfaceC0315q.j(i6);
            }
            i7 = 0;
            i8 = 0;
        } while (i6 - l6 < 8192);
        return false;
    }

    public final void k(long j6, boolean z6) {
        if (this.f16547l) {
            return;
        }
        boolean z7 = (this.f16536a & 1) != 0 && this.f16544i > 0;
        if (z7 && this.f16537b.k() == -9223372036854775807L && !z6) {
            return;
        }
        if (!z7 || this.f16537b.k() == -9223372036854775807L) {
            this.f16541f.n(new J.b(-9223372036854775807L));
        } else {
            this.f16541f.n(j(j6, (this.f16536a & 2) != 0));
        }
        this.f16547l = true;
    }

    public final int l(InterfaceC0315q interfaceC0315q) {
        int i6 = 0;
        while (true) {
            interfaceC0315q.s(this.f16539d.e(), 0, 10);
            this.f16539d.T(0);
            if (this.f16539d.J() != 4801587) {
                break;
            }
            this.f16539d.U(3);
            int F6 = this.f16539d.F();
            i6 += F6 + 10;
            interfaceC0315q.j(F6);
        }
        interfaceC0315q.o();
        interfaceC0315q.j(i6);
        if (this.f16543h == -1) {
            this.f16543h = i6;
        }
        return i6;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public C1674h(int i6) {
        this.f16536a = (i6 & 2) != 0 ? i6 | 1 : i6;
        this.f16537b = new C1675i(true);
        this.f16538c = new C1144z(2048);
        this.f16544i = -1;
        this.f16543h = -1L;
        C1144z c1144z = new C1144z(10);
        this.f16539d = c1144z;
        this.f16540e = new C1143y(c1144z.e());
    }
}
