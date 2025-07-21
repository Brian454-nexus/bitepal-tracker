package k2;

import E1.AbstractC0299a;
import E1.C0311m;
import E1.O;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1143y;
import c1.C1144z;
import java.util.Arrays;
import java.util.Collections;
import k2.K;
import kotlin.io.ConstantsKt;

/* renamed from: k2.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1675i implements InterfaceC1679m {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f16548w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16549a;

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f16550b;

    /* renamed from: c, reason: collision with root package name */
    public final C1144z f16551c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16553e;

    /* renamed from: f, reason: collision with root package name */
    public String f16554f;

    /* renamed from: g, reason: collision with root package name */
    public O f16555g;

    /* renamed from: h, reason: collision with root package name */
    public O f16556h;

    /* renamed from: i, reason: collision with root package name */
    public int f16557i;

    /* renamed from: j, reason: collision with root package name */
    public int f16558j;

    /* renamed from: k, reason: collision with root package name */
    public int f16559k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16560l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16561m;

    /* renamed from: n, reason: collision with root package name */
    public int f16562n;

    /* renamed from: o, reason: collision with root package name */
    public int f16563o;

    /* renamed from: p, reason: collision with root package name */
    public int f16564p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16565q;

    /* renamed from: r, reason: collision with root package name */
    public long f16566r;

    /* renamed from: s, reason: collision with root package name */
    public int f16567s;

    /* renamed from: t, reason: collision with root package name */
    public long f16568t;

    /* renamed from: u, reason: collision with root package name */
    public O f16569u;

    /* renamed from: v, reason: collision with root package name */
    public long f16570v;

    public C1675i(boolean z6) {
        this(z6, null, 0);
    }

    private boolean i(C1144z c1144z, byte[] bArr, int i6) {
        int min = Math.min(c1144z.a(), i6 - this.f16558j);
        c1144z.l(bArr, this.f16558j, min);
        int i7 = this.f16558j + min;
        this.f16558j = i7;
        return i7 == i6;
    }

    public static boolean m(int i6) {
        return (i6 & 65526) == 65520;
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        f();
        while (c1144z.a() > 0) {
            int i6 = this.f16557i;
            if (i6 == 0) {
                j(c1144z);
            } else if (i6 == 1) {
                g(c1144z);
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (i(c1144z, this.f16550b.f10640a, this.f16560l ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i6 != 4) {
                        throw new IllegalStateException();
                    }
                    p(c1144z);
                }
            } else if (i(c1144z, this.f16551c.e(), 10)) {
                o();
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16568t = -9223372036854775807L;
        q();
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16568t = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16554f = dVar.b();
        O a6 = rVar.a(dVar.c(), 1);
        this.f16555g = a6;
        this.f16569u = a6;
        if (!this.f16549a) {
            this.f16556h = new C0311m();
            return;
        }
        dVar.a();
        O a7 = rVar.a(dVar.c(), 5);
        this.f16556h = a7;
        a7.e(new q.b().a0(dVar.b()).o0("application/id3").K());
    }

    public final void f() {
        AbstractC1119a.e(this.f16555g);
        AbstractC1117K.i(this.f16569u);
        AbstractC1117K.i(this.f16556h);
    }

    public final void g(C1144z c1144z) {
        if (c1144z.a() == 0) {
            return;
        }
        this.f16550b.f10640a[0] = c1144z.e()[c1144z.f()];
        this.f16550b.p(2);
        int h6 = this.f16550b.h(4);
        int i6 = this.f16563o;
        if (i6 != -1 && h6 != i6) {
            q();
            return;
        }
        if (!this.f16561m) {
            this.f16561m = true;
            this.f16562n = this.f16564p;
            this.f16563o = h6;
        }
        t();
    }

    public final boolean h(C1144z c1144z, int i6) {
        c1144z.T(i6 + 1);
        if (!w(c1144z, this.f16550b.f10640a, 1)) {
            return false;
        }
        this.f16550b.p(4);
        int h6 = this.f16550b.h(1);
        int i7 = this.f16562n;
        if (i7 != -1 && h6 != i7) {
            return false;
        }
        if (this.f16563o != -1) {
            if (!w(c1144z, this.f16550b.f10640a, 1)) {
                return true;
            }
            this.f16550b.p(2);
            if (this.f16550b.h(4) != this.f16563o) {
                return false;
            }
            c1144z.T(i6 + 2);
        }
        if (!w(c1144z, this.f16550b.f10640a, 4)) {
            return true;
        }
        this.f16550b.p(14);
        int h7 = this.f16550b.h(13);
        if (h7 < 7) {
            return false;
        }
        byte[] e6 = c1144z.e();
        int g6 = c1144z.g();
        int i8 = i6 + h7;
        if (i8 >= g6) {
            return true;
        }
        byte b6 = e6[i8];
        if (b6 == -1) {
            int i9 = i8 + 1;
            if (i9 == g6) {
                return true;
            }
            return l((byte) -1, e6[i9]) && ((e6[i9] & 8) >> 3) == h6;
        }
        if (b6 != 73) {
            return false;
        }
        int i10 = i8 + 1;
        if (i10 == g6) {
            return true;
        }
        if (e6[i10] != 68) {
            return false;
        }
        int i11 = i8 + 2;
        return i11 == g6 || e6[i11] == 51;
    }

    public final void j(C1144z c1144z) {
        byte[] e6 = c1144z.e();
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        while (f6 < g6) {
            int i6 = f6 + 1;
            byte b6 = e6[f6];
            int i7 = b6 & 255;
            if (this.f16559k == 512 && l((byte) -1, (byte) i7) && (this.f16561m || h(c1144z, f6 - 1))) {
                this.f16564p = (b6 & 8) >> 3;
                this.f16560l = (b6 & 1) == 0;
                if (this.f16561m) {
                    t();
                } else {
                    r();
                }
                c1144z.T(i6);
                return;
            }
            int i8 = this.f16559k;
            int i9 = i7 | i8;
            if (i9 == 329) {
                this.f16559k = 768;
            } else if (i9 == 511) {
                this.f16559k = ConstantsKt.MINIMUM_BLOCK_SIZE;
            } else if (i9 == 836) {
                this.f16559k = 1024;
            } else if (i9 == 1075) {
                u();
                c1144z.T(i6);
                return;
            } else if (i8 != 256) {
                this.f16559k = 256;
            }
            f6 = i6;
        }
        c1144z.T(f6);
    }

    public long k() {
        return this.f16566r;
    }

    public final boolean l(byte b6, byte b7) {
        return m(((b6 & 255) << 8) | (b7 & 255));
    }

    public final void n() {
        this.f16550b.p(0);
        if (this.f16565q) {
            this.f16550b.r(10);
        } else {
            int i6 = 2;
            int h6 = this.f16550b.h(2) + 1;
            if (h6 != 2) {
                AbstractC1133o.h("AdtsReader", "Detected audio object type: " + h6 + ", but assuming AAC LC.");
            } else {
                i6 = h6;
            }
            this.f16550b.r(5);
            byte[] b6 = AbstractC0299a.b(i6, this.f16563o, this.f16550b.h(3));
            AbstractC0299a.b f6 = AbstractC0299a.f(b6);
            Z0.q K5 = new q.b().a0(this.f16554f).o0("audio/mp4a-latm").O(f6.f963c).N(f6.f962b).p0(f6.f961a).b0(Collections.singletonList(b6)).e0(this.f16552d).m0(this.f16553e).K();
            this.f16566r = 1024000000 / K5.f6967C;
            this.f16555g.e(K5);
            this.f16565q = true;
        }
        this.f16550b.r(4);
        int h7 = this.f16550b.h(13);
        int i7 = h7 - 7;
        if (this.f16560l) {
            i7 = h7 - 9;
        }
        v(this.f16555g, this.f16566r, 0, i7);
    }

    public final void o() {
        this.f16556h.a(this.f16551c, 10);
        this.f16551c.T(6);
        v(this.f16556h, 0L, 10, this.f16551c.F() + 10);
    }

    public final void p(C1144z c1144z) {
        int min = Math.min(c1144z.a(), this.f16567s - this.f16558j);
        this.f16569u.a(c1144z, min);
        int i6 = this.f16558j + min;
        this.f16558j = i6;
        if (i6 == this.f16567s) {
            AbstractC1119a.g(this.f16568t != -9223372036854775807L);
            this.f16569u.f(this.f16568t, 1, this.f16567s, 0, null);
            this.f16568t += this.f16570v;
            s();
        }
    }

    public final void q() {
        this.f16561m = false;
        s();
    }

    public final void r() {
        this.f16557i = 1;
        this.f16558j = 0;
    }

    public final void s() {
        this.f16557i = 0;
        this.f16558j = 0;
        this.f16559k = 256;
    }

    public final void t() {
        this.f16557i = 3;
        this.f16558j = 0;
    }

    public final void u() {
        this.f16557i = 2;
        this.f16558j = f16548w.length;
        this.f16567s = 0;
        this.f16551c.T(0);
    }

    public final void v(O o6, long j6, int i6, int i7) {
        this.f16557i = 4;
        this.f16558j = i6;
        this.f16569u = o6;
        this.f16570v = j6;
        this.f16567s = i7;
    }

    public final boolean w(C1144z c1144z, byte[] bArr, int i6) {
        if (c1144z.a() < i6) {
            return false;
        }
        c1144z.l(bArr, 0, i6);
        return true;
    }

    public C1675i(boolean z6, String str, int i6) {
        this.f16550b = new C1143y(new byte[7]);
        this.f16551c = new C1144z(Arrays.copyOf(f16548w, 10));
        s();
        this.f16562n = -1;
        this.f16563o = -1;
        this.f16566r = -9223372036854775807L;
        this.f16568t = -9223372036854775807L;
        this.f16549a = z6;
        this.f16552d = str;
        this.f16553e = i6;
    }
}
