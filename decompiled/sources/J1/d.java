package J1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.O;
import E1.r;
import E1.u;
import E1.v;
import E1.w;
import E1.y;
import Z0.x;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements InterfaceC0314p {

    /* renamed from: o, reason: collision with root package name */
    public static final u f2850o = new u() { // from class: J1.c
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return d.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f2852b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2853c;

    /* renamed from: d, reason: collision with root package name */
    public final v.a f2854d;

    /* renamed from: e, reason: collision with root package name */
    public r f2855e;

    /* renamed from: f, reason: collision with root package name */
    public O f2856f;

    /* renamed from: g, reason: collision with root package name */
    public int f2857g;

    /* renamed from: h, reason: collision with root package name */
    public x f2858h;

    /* renamed from: i, reason: collision with root package name */
    public y f2859i;

    /* renamed from: j, reason: collision with root package name */
    public int f2860j;

    /* renamed from: k, reason: collision with root package name */
    public int f2861k;

    /* renamed from: l, reason: collision with root package name */
    public b f2862l;

    /* renamed from: m, reason: collision with root package name */
    public int f2863m;

    /* renamed from: n, reason: collision with root package name */
    public long f2864n;

    public d() {
        this(0);
    }

    public static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[]{new d()};
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        if (j6 == 0) {
            this.f2857g = 0;
        } else {
            b bVar = this.f2862l;
            if (bVar != null) {
                bVar.h(j7);
            }
        }
        this.f2864n = j7 != 0 ? -1L : 0L;
        this.f2863m = 0;
        this.f2852b.P(0);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f2855e = rVar;
        this.f2856f = rVar.a(0, 1);
        rVar.k();
    }

    public final long e(C1144z c1144z, boolean z6) {
        boolean z7;
        AbstractC1119a.e(this.f2859i);
        int f6 = c1144z.f();
        while (f6 <= c1144z.g() - 16) {
            c1144z.T(f6);
            if (v.d(c1144z, this.f2859i, this.f2861k, this.f2854d)) {
                c1144z.T(f6);
                return this.f2854d.f1081a;
            }
            f6++;
        }
        if (!z6) {
            c1144z.T(f6);
            return -1L;
        }
        while (f6 <= c1144z.g() - this.f2860j) {
            c1144z.T(f6);
            try {
                z7 = v.d(c1144z, this.f2859i, this.f2861k, this.f2854d);
            } catch (IndexOutOfBoundsException unused) {
                z7 = false;
            }
            if (c1144z.f() <= c1144z.g() ? z7 : false) {
                c1144z.T(f6);
                return this.f2854d.f1081a;
            }
            f6++;
        }
        c1144z.T(c1144z.g());
        return -1L;
    }

    public final void f(InterfaceC0315q interfaceC0315q) {
        this.f2861k = w.b(interfaceC0315q);
        ((r) AbstractC1117K.i(this.f2855e)).n(j(interfaceC0315q.getPosition(), interfaceC0315q.a()));
        this.f2857g = 5;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        int i7 = this.f2857g;
        if (i7 == 0) {
            n(interfaceC0315q);
            return 0;
        }
        if (i7 == 1) {
            k(interfaceC0315q);
            return 0;
        }
        if (i7 == 2) {
            p(interfaceC0315q);
            return 0;
        }
        if (i7 == 3) {
            o(interfaceC0315q);
            return 0;
        }
        if (i7 == 4) {
            f(interfaceC0315q);
            return 0;
        }
        if (i7 == 5) {
            return m(interfaceC0315q, i6);
        }
        throw new IllegalStateException();
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        w.c(interfaceC0315q, false);
        return w.a(interfaceC0315q);
    }

    public final J j(long j6, long j7) {
        AbstractC1119a.e(this.f2859i);
        y yVar = this.f2859i;
        if (yVar.f1095k != null) {
            return new E1.x(yVar, j6);
        }
        if (j7 == -1 || yVar.f1094j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f2861k, j6, j7);
        this.f2862l = bVar;
        return bVar.b();
    }

    public final void k(InterfaceC0315q interfaceC0315q) {
        byte[] bArr = this.f2851a;
        interfaceC0315q.s(bArr, 0, bArr.length);
        interfaceC0315q.o();
        this.f2857g = 2;
    }

    public final void l() {
        ((O) AbstractC1117K.i(this.f2856f)).f((this.f2864n * 1000000) / ((y) AbstractC1117K.i(this.f2859i)).f1089e, 1, this.f2863m, 0, null);
    }

    public final int m(InterfaceC0315q interfaceC0315q, I i6) {
        boolean z6;
        AbstractC1119a.e(this.f2856f);
        AbstractC1119a.e(this.f2859i);
        b bVar = this.f2862l;
        if (bVar != null && bVar.d()) {
            return this.f2862l.c(interfaceC0315q, i6);
        }
        if (this.f2864n == -1) {
            this.f2864n = v.i(interfaceC0315q, this.f2859i);
            return 0;
        }
        int g6 = this.f2852b.g();
        if (g6 < 32768) {
            int read = interfaceC0315q.read(this.f2852b.e(), g6, 32768 - g6);
            z6 = read == -1;
            if (!z6) {
                this.f2852b.S(g6 + read);
            } else if (this.f2852b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z6 = false;
        }
        int f6 = this.f2852b.f();
        int i7 = this.f2863m;
        int i8 = this.f2860j;
        if (i7 < i8) {
            C1144z c1144z = this.f2852b;
            c1144z.U(Math.min(i8 - i7, c1144z.a()));
        }
        long e6 = e(this.f2852b, z6);
        int f7 = this.f2852b.f() - f6;
        this.f2852b.T(f6);
        this.f2856f.a(this.f2852b, f7);
        this.f2863m += f7;
        if (e6 != -1) {
            l();
            this.f2863m = 0;
            this.f2864n = e6;
        }
        if (this.f2852b.a() < 16) {
            int a6 = this.f2852b.a();
            System.arraycopy(this.f2852b.e(), this.f2852b.f(), this.f2852b.e(), 0, a6);
            this.f2852b.T(0);
            this.f2852b.S(a6);
        }
        return 0;
    }

    public final void n(InterfaceC0315q interfaceC0315q) {
        this.f2858h = w.d(interfaceC0315q, !this.f2853c);
        this.f2857g = 1;
    }

    public final void o(InterfaceC0315q interfaceC0315q) {
        w.a aVar = new w.a(this.f2859i);
        boolean z6 = false;
        while (!z6) {
            z6 = w.e(interfaceC0315q, aVar);
            this.f2859i = (y) AbstractC1117K.i(aVar.f1082a);
        }
        AbstractC1119a.e(this.f2859i);
        this.f2860j = Math.max(this.f2859i.f1087c, 6);
        ((O) AbstractC1117K.i(this.f2856f)).e(this.f2859i.g(this.f2851a, this.f2858h));
        this.f2857g = 4;
    }

    public final void p(InterfaceC0315q interfaceC0315q) {
        w.i(interfaceC0315q);
        this.f2857g = 3;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }

    public d(int i6) {
        this.f2851a = new byte[42];
        this.f2852b = new C1144z(new byte[32768], 0);
        this.f2853c = (i6 & 1) != 0;
        this.f2854d = new v.a();
        this.f2857g = 0;
    }
}
