package k2;

import E1.AbstractC0301c;
import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import k2.K;

/* renamed from: k2.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1672f implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final C1143y f16521a;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16524d;

    /* renamed from: e, reason: collision with root package name */
    public String f16525e;

    /* renamed from: f, reason: collision with root package name */
    public O f16526f;

    /* renamed from: g, reason: collision with root package name */
    public int f16527g;

    /* renamed from: h, reason: collision with root package name */
    public int f16528h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16529i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16530j;

    /* renamed from: k, reason: collision with root package name */
    public long f16531k;

    /* renamed from: l, reason: collision with root package name */
    public Z0.q f16532l;

    /* renamed from: m, reason: collision with root package name */
    public int f16533m;

    /* renamed from: n, reason: collision with root package name */
    public long f16534n;

    public C1672f() {
        this(null, 0);
    }

    private boolean f(C1144z c1144z, byte[] bArr, int i6) {
        int min = Math.min(c1144z.a(), i6 - this.f16528h);
        c1144z.l(bArr, this.f16528h, min);
        int i7 = this.f16528h + min;
        this.f16528h = i7;
        return i7 == i6;
    }

    private void g() {
        this.f16521a.p(0);
        AbstractC0301c.b d6 = AbstractC0301c.d(this.f16521a);
        Z0.q qVar = this.f16532l;
        if (qVar == null || d6.f980c != qVar.f6966B || d6.f979b != qVar.f6967C || !"audio/ac4".equals(qVar.f6990n)) {
            Z0.q K5 = new q.b().a0(this.f16525e).o0("audio/ac4").N(d6.f980c).p0(d6.f979b).e0(this.f16523c).m0(this.f16524d).K();
            this.f16532l = K5;
            this.f16526f.e(K5);
        }
        this.f16533m = d6.f981d;
        this.f16531k = (d6.f982e * 1000000) / this.f16532l.f6967C;
    }

    private boolean h(C1144z c1144z) {
        int G6;
        while (true) {
            if (c1144z.a() <= 0) {
                return false;
            }
            if (this.f16529i) {
                G6 = c1144z.G();
                this.f16529i = G6 == 172;
                if (G6 == 64 || G6 == 65) {
                    break;
                }
            } else {
                this.f16529i = c1144z.G() == 172;
            }
        }
        this.f16530j = G6 == 65;
        return true;
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16526f);
        while (c1144z.a() > 0) {
            int i6 = this.f16527g;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int min = Math.min(c1144z.a(), this.f16533m - this.f16528h);
                        this.f16526f.a(c1144z, min);
                        int i7 = this.f16528h + min;
                        this.f16528h = i7;
                        if (i7 == this.f16533m) {
                            AbstractC1119a.g(this.f16534n != -9223372036854775807L);
                            this.f16526f.f(this.f16534n, 1, this.f16533m, 0, null);
                            this.f16534n += this.f16531k;
                            this.f16527g = 0;
                        }
                    }
                } else if (f(c1144z, this.f16522b.e(), 16)) {
                    g();
                    this.f16522b.T(0);
                    this.f16526f.a(this.f16522b, 16);
                    this.f16527g = 2;
                }
            } else if (h(c1144z)) {
                this.f16527g = 1;
                this.f16522b.e()[0] = -84;
                this.f16522b.e()[1] = (byte) (this.f16530j ? 65 : 64);
                this.f16528h = 2;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16527g = 0;
        this.f16528h = 0;
        this.f16529i = false;
        this.f16530j = false;
        this.f16534n = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16534n = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16525e = dVar.b();
        this.f16526f = rVar.a(dVar.c(), 1);
    }

    public C1672f(String str, int i6) {
        C1143y c1143y = new C1143y(new byte[16]);
        this.f16521a = c1143y;
        this.f16522b = new C1144z(c1143y.f10640a);
        this.f16527g = 0;
        this.f16528h = 0;
        this.f16529i = false;
        this.f16530j = false;
        this.f16534n = -9223372036854775807L;
        this.f16523c = str;
        this.f16524d = i6;
    }
}
