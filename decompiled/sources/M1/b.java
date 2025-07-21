package M1;

import E1.I;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import E1.r;
import Y1.m;
import Z0.q;
import Z0.x;
import b2.s;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements InterfaceC0314p {

    /* renamed from: b, reason: collision with root package name */
    public r f3380b;

    /* renamed from: c, reason: collision with root package name */
    public int f3381c;

    /* renamed from: d, reason: collision with root package name */
    public int f3382d;

    /* renamed from: e, reason: collision with root package name */
    public int f3383e;

    /* renamed from: g, reason: collision with root package name */
    public T1.a f3385g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0315q f3386h;

    /* renamed from: i, reason: collision with root package name */
    public d f3387i;

    /* renamed from: j, reason: collision with root package name */
    public m f3388j;

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f3379a = new C1144z(6);

    /* renamed from: f, reason: collision with root package name */
    public long f3384f = -1;

    public static T1.a f(String str, long j6) {
        c a6;
        if (j6 == -1 || (a6 = f.a(str)) == null) {
            return null;
        }
        return a6.a(j6);
    }

    private void m(InterfaceC0315q interfaceC0315q) {
        String A6;
        if (this.f3382d == 65505) {
            C1144z c1144z = new C1144z(this.f3383e);
            interfaceC0315q.readFully(c1144z.e(), 0, this.f3383e);
            if (this.f3385g == null && "http://ns.adobe.com/xap/1.0/".equals(c1144z.A()) && (A6 = c1144z.A()) != null) {
                T1.a f6 = f(A6, interfaceC0315q.a());
                this.f3385g = f6;
                if (f6 != null) {
                    this.f3384f = f6.f4895d;
                }
            }
        } else {
            interfaceC0315q.p(this.f3383e);
        }
        this.f3381c = 0;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        if (j6 == 0) {
            this.f3381c = 0;
            this.f3388j = null;
        } else if (this.f3381c == 5) {
            ((m) AbstractC1119a.e(this.f3388j)).a(j6, j7);
        }
    }

    public final void b(InterfaceC0315q interfaceC0315q) {
        this.f3379a.P(2);
        interfaceC0315q.s(this.f3379a.e(), 0, 2);
        interfaceC0315q.j(this.f3379a.M() - 2);
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f3380b = rVar;
    }

    public final void e() {
        ((r) AbstractC1119a.e(this.f3380b)).k();
        this.f3380b.n(new J.b(-9223372036854775807L));
        this.f3381c = 6;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        int i7 = this.f3381c;
        if (i7 == 0) {
            l(interfaceC0315q);
            return 0;
        }
        if (i7 == 1) {
            n(interfaceC0315q);
            return 0;
        }
        if (i7 == 2) {
            m(interfaceC0315q);
            return 0;
        }
        if (i7 == 4) {
            long position = interfaceC0315q.getPosition();
            long j6 = this.f3384f;
            if (position != j6) {
                i6.f910a = j6;
                return 1;
            }
            o(interfaceC0315q);
            return 0;
        }
        if (i7 != 5) {
            if (i7 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f3387i == null || interfaceC0315q != this.f3386h) {
            this.f3386h = interfaceC0315q;
            this.f3387i = new d(interfaceC0315q, this.f3384f);
        }
        int g6 = ((m) AbstractC1119a.e(this.f3388j)).g(this.f3387i, i6);
        if (g6 == 1) {
            i6.f910a += this.f3384f;
        }
        return g6;
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        if (k(interfaceC0315q) != 65496) {
            return false;
        }
        int k6 = k(interfaceC0315q);
        this.f3382d = k6;
        if (k6 == 65504) {
            b(interfaceC0315q);
            this.f3382d = k(interfaceC0315q);
        }
        if (this.f3382d != 65505) {
            return false;
        }
        interfaceC0315q.j(2);
        this.f3379a.P(6);
        interfaceC0315q.s(this.f3379a.e(), 0, 6);
        return this.f3379a.I() == 1165519206 && this.f3379a.M() == 0;
    }

    public final void j(T1.a aVar) {
        ((r) AbstractC1119a.e(this.f3380b)).a(1024, 4).e(new q.b().Q("image/jpeg").h0(new x(aVar)).K());
    }

    public final int k(InterfaceC0315q interfaceC0315q) {
        this.f3379a.P(2);
        interfaceC0315q.s(this.f3379a.e(), 0, 2);
        return this.f3379a.M();
    }

    public final void l(InterfaceC0315q interfaceC0315q) {
        this.f3379a.P(2);
        interfaceC0315q.readFully(this.f3379a.e(), 0, 2);
        int M5 = this.f3379a.M();
        this.f3382d = M5;
        if (M5 == 65498) {
            if (this.f3384f != -1) {
                this.f3381c = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((M5 < 65488 || M5 > 65497) && M5 != 65281) {
            this.f3381c = 1;
        }
    }

    public final void n(InterfaceC0315q interfaceC0315q) {
        this.f3379a.P(2);
        interfaceC0315q.readFully(this.f3379a.e(), 0, 2);
        this.f3383e = this.f3379a.M() - 2;
        this.f3381c = 2;
    }

    public final void o(InterfaceC0315q interfaceC0315q) {
        if (!interfaceC0315q.g(this.f3379a.e(), 0, 1, true)) {
            e();
            return;
        }
        interfaceC0315q.o();
        if (this.f3388j == null) {
            this.f3388j = new m(s.a.f10491a, 8);
        }
        d dVar = new d(interfaceC0315q, this.f3384f);
        this.f3387i = dVar;
        if (!this.f3388j.i(dVar)) {
            e();
        } else {
            this.f3388j.c(new e(this.f3384f, (r) AbstractC1119a.e(this.f3380b)));
            p();
        }
    }

    public final void p() {
        j((T1.a) AbstractC1119a.e(this.f3385g));
        this.f3381c = 5;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
        m mVar = this.f3388j;
        if (mVar != null) {
            mVar.release();
        }
    }
}
