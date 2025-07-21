package k2;

import E1.AbstractC0300b;
import E1.O;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import k2.K;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1669c implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final C1143y f16504a;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16507d;

    /* renamed from: e, reason: collision with root package name */
    public String f16508e;

    /* renamed from: f, reason: collision with root package name */
    public O f16509f;

    /* renamed from: g, reason: collision with root package name */
    public int f16510g;

    /* renamed from: h, reason: collision with root package name */
    public int f16511h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16512i;

    /* renamed from: j, reason: collision with root package name */
    public long f16513j;

    /* renamed from: k, reason: collision with root package name */
    public Z0.q f16514k;

    /* renamed from: l, reason: collision with root package name */
    public int f16515l;

    /* renamed from: m, reason: collision with root package name */
    public long f16516m;

    public C1669c() {
        this(null, 0);
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16509f);
        while (c1144z.a() > 0) {
            int i6 = this.f16510g;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int min = Math.min(c1144z.a(), this.f16515l - this.f16511h);
                        this.f16509f.a(c1144z, min);
                        int i7 = this.f16511h + min;
                        this.f16511h = i7;
                        if (i7 == this.f16515l) {
                            AbstractC1119a.g(this.f16516m != -9223372036854775807L);
                            this.f16509f.f(this.f16516m, 1, this.f16515l, 0, null);
                            this.f16516m += this.f16513j;
                            this.f16510g = 0;
                        }
                    }
                } else if (f(c1144z, this.f16505b.e(), 128)) {
                    g();
                    this.f16505b.T(0);
                    this.f16509f.a(this.f16505b, 128);
                    this.f16510g = 2;
                }
            } else if (h(c1144z)) {
                this.f16510g = 1;
                this.f16505b.e()[0] = 11;
                this.f16505b.e()[1] = 119;
                this.f16511h = 2;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16510g = 0;
        this.f16511h = 0;
        this.f16512i = false;
        this.f16516m = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16516m = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16508e = dVar.b();
        this.f16509f = rVar.a(dVar.c(), 1);
    }

    public final boolean f(C1144z c1144z, byte[] bArr, int i6) {
        int min = Math.min(c1144z.a(), i6 - this.f16511h);
        c1144z.l(bArr, this.f16511h, min);
        int i7 = this.f16511h + min;
        this.f16511h = i7;
        return i7 == i6;
    }

    public final void g() {
        this.f16504a.p(0);
        AbstractC0300b.C0022b f6 = AbstractC0300b.f(this.f16504a);
        Z0.q qVar = this.f16514k;
        if (qVar == null || f6.f973d != qVar.f6966B || f6.f972c != qVar.f6967C || !AbstractC1117K.c(f6.f970a, qVar.f6990n)) {
            q.b j02 = new q.b().a0(this.f16508e).o0(f6.f970a).N(f6.f973d).p0(f6.f972c).e0(this.f16506c).m0(this.f16507d).j0(f6.f976g);
            if ("audio/ac3".equals(f6.f970a)) {
                j02.M(f6.f976g);
            }
            Z0.q K5 = j02.K();
            this.f16514k = K5;
            this.f16509f.e(K5);
        }
        this.f16515l = f6.f974e;
        this.f16513j = (f6.f975f * 1000000) / this.f16514k.f6967C;
    }

    public final boolean h(C1144z c1144z) {
        while (true) {
            if (c1144z.a() <= 0) {
                return false;
            }
            if (this.f16512i) {
                int G6 = c1144z.G();
                if (G6 == 119) {
                    this.f16512i = false;
                    return true;
                }
                this.f16512i = G6 == 11;
            } else {
                this.f16512i = c1144z.G() == 11;
            }
        }
    }

    public C1669c(String str, int i6) {
        C1143y c1143y = new C1143y(new byte[128]);
        this.f16504a = c1143y;
        this.f16505b = new C1144z(c1143y.f10640a);
        this.f16510g = 0;
        this.f16516m = -9223372036854775807L;
        this.f16506c = str;
        this.f16507d = i6;
    }
}
