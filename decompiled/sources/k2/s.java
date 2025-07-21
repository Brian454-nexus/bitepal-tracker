package k2;

import E1.AbstractC0299a;
import E1.O;
import Z0.q;
import c1.AbstractC1119a;
import c1.C1143y;
import c1.C1144z;
import java.util.Collections;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final String f16726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16727b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16728c;

    /* renamed from: d, reason: collision with root package name */
    public final C1143y f16729d;

    /* renamed from: e, reason: collision with root package name */
    public O f16730e;

    /* renamed from: f, reason: collision with root package name */
    public String f16731f;

    /* renamed from: g, reason: collision with root package name */
    public Z0.q f16732g;

    /* renamed from: h, reason: collision with root package name */
    public int f16733h;

    /* renamed from: i, reason: collision with root package name */
    public int f16734i;

    /* renamed from: j, reason: collision with root package name */
    public int f16735j;

    /* renamed from: k, reason: collision with root package name */
    public int f16736k;

    /* renamed from: l, reason: collision with root package name */
    public long f16737l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16738m;

    /* renamed from: n, reason: collision with root package name */
    public int f16739n;

    /* renamed from: o, reason: collision with root package name */
    public int f16740o;

    /* renamed from: p, reason: collision with root package name */
    public int f16741p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16742q;

    /* renamed from: r, reason: collision with root package name */
    public long f16743r;

    /* renamed from: s, reason: collision with root package name */
    public int f16744s;

    /* renamed from: t, reason: collision with root package name */
    public long f16745t;

    /* renamed from: u, reason: collision with root package name */
    public int f16746u;

    /* renamed from: v, reason: collision with root package name */
    public String f16747v;

    public s(String str, int i6) {
        this.f16726a = str;
        this.f16727b = i6;
        C1144z c1144z = new C1144z(1024);
        this.f16728c = c1144z;
        this.f16729d = new C1143y(c1144z.e());
        this.f16737l = -9223372036854775807L;
    }

    public static long f(C1143y c1143y) {
        return c1143y.h((c1143y.h(2) + 1) * 8);
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16730e);
        while (c1144z.a() > 0) {
            int i6 = this.f16733h;
            if (i6 != 0) {
                if (i6 == 1) {
                    int G6 = c1144z.G();
                    if ((G6 & 224) == 224) {
                        this.f16736k = G6;
                        this.f16733h = 2;
                    } else if (G6 != 86) {
                        this.f16733h = 0;
                    }
                } else if (i6 == 2) {
                    int G7 = ((this.f16736k & (-225)) << 8) | c1144z.G();
                    this.f16735j = G7;
                    if (G7 > this.f16728c.e().length) {
                        m(this.f16735j);
                    }
                    this.f16734i = 0;
                    this.f16733h = 3;
                } else {
                    if (i6 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c1144z.a(), this.f16735j - this.f16734i);
                    c1144z.l(this.f16729d.f10640a, this.f16734i, min);
                    int i7 = this.f16734i + min;
                    this.f16734i = i7;
                    if (i7 == this.f16735j) {
                        this.f16729d.p(0);
                        g(this.f16729d);
                        this.f16733h = 0;
                    }
                }
            } else if (c1144z.G() == 86) {
                this.f16733h = 1;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16733h = 0;
        this.f16737l = -9223372036854775807L;
        this.f16738m = false;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16737l = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16730e = rVar.a(dVar.c(), 1);
        this.f16731f = dVar.b();
    }

    public final void g(C1143y c1143y) {
        if (!c1143y.g()) {
            this.f16738m = true;
            l(c1143y);
        } else if (!this.f16738m) {
            return;
        }
        if (this.f16739n != 0) {
            throw Z0.z.a(null, null);
        }
        if (this.f16740o != 0) {
            throw Z0.z.a(null, null);
        }
        k(c1143y, j(c1143y));
        if (this.f16742q) {
            c1143y.r((int) this.f16743r);
        }
    }

    public final int h(C1143y c1143y) {
        int b6 = c1143y.b();
        AbstractC0299a.b e6 = AbstractC0299a.e(c1143y, true);
        this.f16747v = e6.f963c;
        this.f16744s = e6.f961a;
        this.f16746u = e6.f962b;
        return b6 - c1143y.b();
    }

    public final void i(C1143y c1143y) {
        int h6 = c1143y.h(3);
        this.f16741p = h6;
        if (h6 == 0) {
            c1143y.r(8);
            return;
        }
        if (h6 == 1) {
            c1143y.r(9);
            return;
        }
        if (h6 == 3 || h6 == 4 || h6 == 5) {
            c1143y.r(6);
        } else {
            if (h6 != 6 && h6 != 7) {
                throw new IllegalStateException();
            }
            c1143y.r(1);
        }
    }

    public final int j(C1143y c1143y) {
        int h6;
        if (this.f16741p != 0) {
            throw Z0.z.a(null, null);
        }
        int i6 = 0;
        do {
            h6 = c1143y.h(8);
            i6 += h6;
        } while (h6 == 255);
        return i6;
    }

    public final void k(C1143y c1143y, int i6) {
        int e6 = c1143y.e();
        if ((e6 & 7) == 0) {
            this.f16728c.T(e6 >> 3);
        } else {
            c1143y.i(this.f16728c.e(), 0, i6 * 8);
            this.f16728c.T(0);
        }
        this.f16730e.a(this.f16728c, i6);
        AbstractC1119a.g(this.f16737l != -9223372036854775807L);
        this.f16730e.f(this.f16737l, 1, i6, 0, null);
        this.f16737l += this.f16745t;
    }

    public final void l(C1143y c1143y) {
        boolean g6;
        int h6 = c1143y.h(1);
        int h7 = h6 == 1 ? c1143y.h(1) : 0;
        this.f16739n = h7;
        if (h7 != 0) {
            throw Z0.z.a(null, null);
        }
        if (h6 == 1) {
            f(c1143y);
        }
        if (!c1143y.g()) {
            throw Z0.z.a(null, null);
        }
        this.f16740o = c1143y.h(6);
        int h8 = c1143y.h(4);
        int h9 = c1143y.h(3);
        if (h8 != 0 || h9 != 0) {
            throw Z0.z.a(null, null);
        }
        if (h6 == 0) {
            int e6 = c1143y.e();
            int h10 = h(c1143y);
            c1143y.p(e6);
            byte[] bArr = new byte[(h10 + 7) / 8];
            c1143y.i(bArr, 0, h10);
            Z0.q K5 = new q.b().a0(this.f16731f).o0("audio/mp4a-latm").O(this.f16747v).N(this.f16746u).p0(this.f16744s).b0(Collections.singletonList(bArr)).e0(this.f16726a).m0(this.f16727b).K();
            if (!K5.equals(this.f16732g)) {
                this.f16732g = K5;
                this.f16745t = 1024000000 / K5.f6967C;
                this.f16730e.e(K5);
            }
        } else {
            c1143y.r(((int) f(c1143y)) - h(c1143y));
        }
        i(c1143y);
        boolean g7 = c1143y.g();
        this.f16742q = g7;
        this.f16743r = 0L;
        if (g7) {
            if (h6 == 1) {
                this.f16743r = f(c1143y);
            }
            do {
                g6 = c1143y.g();
                this.f16743r = (this.f16743r << 8) + c1143y.h(8);
            } while (g6);
        }
        if (c1143y.g()) {
            c1143y.r(8);
        }
    }

    public final void m(int i6) {
        this.f16728c.P(i6);
        this.f16729d.n(this.f16728c.e());
    }
}
