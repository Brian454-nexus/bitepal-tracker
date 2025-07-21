package k2;

import E1.AbstractC0313o;
import E1.O;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1144z;
import java.util.concurrent.atomic.AtomicInteger;
import k2.K;

/* renamed from: k2.k, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1677k implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f16573a;

    /* renamed from: c, reason: collision with root package name */
    public final String f16575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16576d;

    /* renamed from: e, reason: collision with root package name */
    public String f16577e;

    /* renamed from: f, reason: collision with root package name */
    public O f16578f;

    /* renamed from: h, reason: collision with root package name */
    public int f16580h;

    /* renamed from: i, reason: collision with root package name */
    public int f16581i;

    /* renamed from: j, reason: collision with root package name */
    public long f16582j;

    /* renamed from: k, reason: collision with root package name */
    public Z0.q f16583k;

    /* renamed from: l, reason: collision with root package name */
    public int f16584l;

    /* renamed from: m, reason: collision with root package name */
    public int f16585m;

    /* renamed from: g, reason: collision with root package name */
    public int f16579g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f16588p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16574b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f16586n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f16587o = -1;

    public C1677k(String str, int i6, int i7) {
        this.f16573a = new C1144z(new byte[i7]);
        this.f16575c = str;
        this.f16576d = i6;
    }

    private boolean f(C1144z c1144z, byte[] bArr, int i6) {
        int min = Math.min(c1144z.a(), i6 - this.f16580h);
        c1144z.l(bArr, this.f16580h, min);
        int i7 = this.f16580h + min;
        this.f16580h = i7;
        return i7 == i6;
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16578f);
        while (c1144z.a() > 0) {
            switch (this.f16579g) {
                case 0:
                    if (!j(c1144z)) {
                        break;
                    } else {
                        int i6 = this.f16585m;
                        if (i6 != 3 && i6 != 4) {
                            if (i6 != 1) {
                                this.f16579g = 2;
                                break;
                            } else {
                                this.f16579g = 1;
                                break;
                            }
                        } else {
                            this.f16579g = 4;
                            break;
                        }
                    }
                case 1:
                    if (!f(c1144z, this.f16573a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f16573a.T(0);
                        this.f16578f.a(this.f16573a, 18);
                        this.f16579g = 6;
                        break;
                    }
                case 2:
                    if (!f(c1144z, this.f16573a.e(), 7)) {
                        break;
                    } else {
                        this.f16586n = AbstractC0313o.j(this.f16573a.e());
                        this.f16579g = 3;
                        break;
                    }
                case 3:
                    if (!f(c1144z, this.f16573a.e(), this.f16586n)) {
                        break;
                    } else {
                        h();
                        this.f16573a.T(0);
                        this.f16578f.a(this.f16573a, this.f16586n);
                        this.f16579g = 6;
                        break;
                    }
                case 4:
                    if (!f(c1144z, this.f16573a.e(), 6)) {
                        break;
                    } else {
                        int l6 = AbstractC0313o.l(this.f16573a.e());
                        this.f16587o = l6;
                        int i7 = this.f16580h;
                        if (i7 > l6) {
                            int i8 = i7 - l6;
                            this.f16580h = i7 - i8;
                            c1144z.T(c1144z.f() - i8);
                        }
                        this.f16579g = 5;
                        break;
                    }
                case 5:
                    if (!f(c1144z, this.f16573a.e(), this.f16587o)) {
                        break;
                    } else {
                        i();
                        this.f16573a.T(0);
                        this.f16578f.a(this.f16573a, this.f16587o);
                        this.f16579g = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(c1144z.a(), this.f16584l - this.f16580h);
                    this.f16578f.a(c1144z, min);
                    int i9 = this.f16580h + min;
                    this.f16580h = i9;
                    if (i9 == this.f16584l) {
                        AbstractC1119a.g(this.f16588p != -9223372036854775807L);
                        this.f16578f.f(this.f16588p, this.f16585m == 4 ? 0 : 1, this.f16584l, 0, null);
                        this.f16588p += this.f16582j;
                        this.f16579g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16579g = 0;
        this.f16580h = 0;
        this.f16581i = 0;
        this.f16588p = -9223372036854775807L;
        this.f16574b.set(0);
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16588p = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16577e = dVar.b();
        this.f16578f = rVar.a(dVar.c(), 1);
    }

    public final void g() {
        byte[] e6 = this.f16573a.e();
        if (this.f16583k == null) {
            Z0.q h6 = AbstractC0313o.h(e6, this.f16577e, this.f16575c, this.f16576d, null);
            this.f16583k = h6;
            this.f16578f.e(h6);
        }
        this.f16584l = AbstractC0313o.b(e6);
        this.f16582j = C6.g.d(AbstractC1117K.V0(AbstractC0313o.g(e6), this.f16583k.f6967C));
    }

    public final void h() {
        AbstractC0313o.b i6 = AbstractC0313o.i(this.f16573a.e());
        k(i6);
        this.f16584l = i6.f1076d;
        long j6 = i6.f1077e;
        if (j6 == -9223372036854775807L) {
            j6 = 0;
        }
        this.f16582j = j6;
    }

    public final void i() {
        AbstractC0313o.b k6 = AbstractC0313o.k(this.f16573a.e(), this.f16574b);
        if (this.f16585m == 3) {
            k(k6);
        }
        this.f16584l = k6.f1076d;
        long j6 = k6.f1077e;
        if (j6 == -9223372036854775807L) {
            j6 = 0;
        }
        this.f16582j = j6;
    }

    public final boolean j(C1144z c1144z) {
        while (c1144z.a() > 0) {
            int i6 = this.f16581i << 8;
            this.f16581i = i6;
            int G6 = i6 | c1144z.G();
            this.f16581i = G6;
            int c6 = AbstractC0313o.c(G6);
            this.f16585m = c6;
            if (c6 != 0) {
                byte[] e6 = this.f16573a.e();
                int i7 = this.f16581i;
                e6[0] = (byte) ((i7 >> 24) & 255);
                e6[1] = (byte) ((i7 >> 16) & 255);
                e6[2] = (byte) ((i7 >> 8) & 255);
                e6[3] = (byte) (i7 & 255);
                this.f16580h = 4;
                this.f16581i = 0;
                return true;
            }
        }
        return false;
    }

    public final void k(AbstractC0313o.b bVar) {
        int i6;
        int i7 = bVar.f1074b;
        if (i7 == -2147483647 || (i6 = bVar.f1075c) == -1) {
            return;
        }
        Z0.q qVar = this.f16583k;
        if (qVar != null && i6 == qVar.f6966B && i7 == qVar.f6967C && AbstractC1117K.c(bVar.f1073a, qVar.f6990n)) {
            return;
        }
        Z0.q qVar2 = this.f16583k;
        Z0.q K5 = (qVar2 == null ? new q.b() : qVar2.a()).a0(this.f16577e).o0(bVar.f1073a).N(bVar.f1075c).p0(bVar.f1074b).e0(this.f16575c).m0(this.f16576d).K();
        this.f16583k = K5;
        this.f16578f.e(K5);
    }
}
