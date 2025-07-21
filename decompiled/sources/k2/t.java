package k2;

import E1.F;
import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.C1144z;
import k2.K;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16748a;

    /* renamed from: b, reason: collision with root package name */
    public final F.a f16749b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16751d;

    /* renamed from: e, reason: collision with root package name */
    public O f16752e;

    /* renamed from: f, reason: collision with root package name */
    public String f16753f;

    /* renamed from: g, reason: collision with root package name */
    public int f16754g;

    /* renamed from: h, reason: collision with root package name */
    public int f16755h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16756i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16757j;

    /* renamed from: k, reason: collision with root package name */
    public long f16758k;

    /* renamed from: l, reason: collision with root package name */
    public int f16759l;

    /* renamed from: m, reason: collision with root package name */
    public long f16760m;

    public t() {
        this(null, 0);
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16752e);
        while (c1144z.a() > 0) {
            int i6 = this.f16754g;
            if (i6 == 0) {
                f(c1144z);
            } else if (i6 == 1) {
                h(c1144z);
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException();
                }
                g(c1144z);
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16754g = 0;
        this.f16755h = 0;
        this.f16757j = false;
        this.f16760m = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16760m = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16753f = dVar.b();
        this.f16752e = rVar.a(dVar.c(), 1);
    }

    public final void f(C1144z c1144z) {
        byte[] e6 = c1144z.e();
        int g6 = c1144z.g();
        for (int f6 = c1144z.f(); f6 < g6; f6++) {
            byte b6 = e6[f6];
            boolean z6 = (b6 & 255) == 255;
            boolean z7 = this.f16757j && (b6 & 224) == 224;
            this.f16757j = z6;
            if (z7) {
                c1144z.T(f6 + 1);
                this.f16757j = false;
                this.f16748a.e()[1] = e6[f6];
                this.f16755h = 2;
                this.f16754g = 1;
                return;
            }
        }
        c1144z.T(g6);
    }

    public final void g(C1144z c1144z) {
        int min = Math.min(c1144z.a(), this.f16759l - this.f16755h);
        this.f16752e.a(c1144z, min);
        int i6 = this.f16755h + min;
        this.f16755h = i6;
        if (i6 < this.f16759l) {
            return;
        }
        AbstractC1119a.g(this.f16760m != -9223372036854775807L);
        this.f16752e.f(this.f16760m, 1, this.f16759l, 0, null);
        this.f16760m += this.f16758k;
        this.f16755h = 0;
        this.f16754g = 0;
    }

    public final void h(C1144z c1144z) {
        int min = Math.min(c1144z.a(), 4 - this.f16755h);
        c1144z.l(this.f16748a.e(), this.f16755h, min);
        int i6 = this.f16755h + min;
        this.f16755h = i6;
        if (i6 < 4) {
            return;
        }
        this.f16748a.T(0);
        if (!this.f16749b.a(this.f16748a.p())) {
            this.f16755h = 0;
            this.f16754g = 1;
            return;
        }
        this.f16759l = this.f16749b.f905c;
        if (!this.f16756i) {
            this.f16758k = (r8.f909g * 1000000) / r8.f906d;
            this.f16752e.e(new q.b().a0(this.f16753f).o0(this.f16749b.f904b).f0(ConstantsKt.DEFAULT_BLOCK_SIZE).N(this.f16749b.f907e).p0(this.f16749b.f906d).e0(this.f16750c).m0(this.f16751d).K());
            this.f16756i = true;
        }
        this.f16748a.T(0);
        this.f16752e.a(this.f16748a, 4);
        this.f16754g = 2;
    }

    public t(String str, int i6) {
        this.f16754g = 0;
        C1144z c1144z = new C1144z(4);
        this.f16748a = c1144z;
        c1144z.e()[0] = -1;
        this.f16749b = new F.a();
        this.f16760m = -9223372036854775807L;
        this.f16750c = str;
        this.f16751d = i6;
    }
}
