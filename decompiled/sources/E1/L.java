package E1;

import Z0.q;
import c1.AbstractC1119a;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class L implements InterfaceC0314p {

    /* renamed from: a, reason: collision with root package name */
    public final int f918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f920c;

    /* renamed from: d, reason: collision with root package name */
    public int f921d;

    /* renamed from: e, reason: collision with root package name */
    public int f922e;

    /* renamed from: f, reason: collision with root package name */
    public r f923f;

    /* renamed from: g, reason: collision with root package name */
    public O f924g;

    public L(int i6, int i7, String str) {
        this.f918a = i6;
        this.f919b = i7;
        this.f920c = str;
    }

    @Override // E1.InterfaceC0314p
    public void a(long j6, long j7) {
        if (j6 == 0 || this.f922e == 1) {
            this.f922e = 1;
            this.f921d = 0;
        }
    }

    public final void b(String str) {
        O a6 = this.f923f.a(1024, 4);
        this.f924g = a6;
        a6.e(new q.b().o0(str).K());
        this.f923f.k();
        this.f923f.n(new M(-9223372036854775807L));
        this.f922e = 1;
    }

    @Override // E1.InterfaceC0314p
    public void c(r rVar) {
        this.f923f = rVar;
        b(this.f920c);
    }

    public final void e(InterfaceC0315q interfaceC0315q) {
        int c6 = ((O) AbstractC1119a.e(this.f924g)).c(interfaceC0315q, 1024, true);
        if (c6 != -1) {
            this.f921d += c6;
            return;
        }
        this.f922e = 2;
        this.f924g.f(0L, 1, this.f921d, 0, null);
        this.f921d = 0;
    }

    @Override // E1.InterfaceC0314p
    public int g(InterfaceC0315q interfaceC0315q, I i6) {
        int i7 = this.f922e;
        if (i7 == 1) {
            e(interfaceC0315q);
            return 0;
        }
        if (i7 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // E1.InterfaceC0314p
    public boolean i(InterfaceC0315q interfaceC0315q) {
        AbstractC1119a.g((this.f918a == -1 || this.f919b == -1) ? false : true);
        C1144z c1144z = new C1144z(this.f919b);
        interfaceC0315q.s(c1144z.e(), 0, this.f919b);
        return c1144z.M() == this.f918a;
    }

    @Override // E1.InterfaceC0314p
    public void release() {
    }
}
