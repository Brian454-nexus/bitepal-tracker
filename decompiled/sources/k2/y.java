package k2;

import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1111E;
import c1.C1143y;
import c1.C1144z;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y implements K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1679m f16797a;

    /* renamed from: b, reason: collision with root package name */
    public final C1143y f16798b = new C1143y(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f16799c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16800d;

    /* renamed from: e, reason: collision with root package name */
    public C1111E f16801e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16803g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16804h;

    /* renamed from: i, reason: collision with root package name */
    public int f16805i;

    /* renamed from: j, reason: collision with root package name */
    public int f16806j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16807k;

    /* renamed from: l, reason: collision with root package name */
    public long f16808l;

    public y(InterfaceC1679m interfaceC1679m) {
        this.f16797a = interfaceC1679m;
    }

    @Override // k2.K
    public void a(C1144z c1144z, int i6) {
        AbstractC1119a.i(this.f16801e);
        if ((i6 & 1) != 0) {
            int i7 = this.f16799c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AbstractC1133o.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f16806j != -1) {
                        AbstractC1133o.h("PesReader", "Unexpected start indicator: expected " + this.f16806j + " more bytes");
                    }
                    this.f16797a.c(c1144z.g() == 0);
                }
            }
            h(1);
        }
        while (c1144z.a() > 0) {
            int i8 = this.f16799c;
            if (i8 == 0) {
                c1144z.U(c1144z.a());
            } else if (i8 != 1) {
                if (i8 == 2) {
                    if (e(c1144z, this.f16798b.f10640a, Math.min(10, this.f16805i)) && e(c1144z, null, this.f16805i)) {
                        g();
                        i6 |= this.f16807k ? 4 : 0;
                        this.f16797a.d(this.f16808l, i6);
                        h(3);
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    int a6 = c1144z.a();
                    int i9 = this.f16806j;
                    int i10 = i9 == -1 ? 0 : a6 - i9;
                    if (i10 > 0) {
                        a6 -= i10;
                        c1144z.S(c1144z.f() + a6);
                    }
                    this.f16797a.a(c1144z);
                    int i11 = this.f16806j;
                    if (i11 != -1) {
                        int i12 = i11 - a6;
                        this.f16806j = i12;
                        if (i12 == 0) {
                            this.f16797a.c(false);
                            h(1);
                        }
                    }
                }
            } else if (e(c1144z, this.f16798b.f10640a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // k2.K
    public void b() {
        this.f16799c = 0;
        this.f16800d = 0;
        this.f16804h = false;
        this.f16797a.b();
    }

    @Override // k2.K
    public void c(C1111E c1111e, E1.r rVar, K.d dVar) {
        this.f16801e = c1111e;
        this.f16797a.e(rVar, dVar);
    }

    public boolean d(boolean z6) {
        if (this.f16799c == 3 && this.f16806j == -1) {
            return (z6 && (this.f16797a instanceof n)) ? false : true;
        }
        return false;
    }

    public final boolean e(C1144z c1144z, byte[] bArr, int i6) {
        int min = Math.min(c1144z.a(), i6 - this.f16800d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1144z.U(min);
        } else {
            c1144z.l(bArr, this.f16800d, min);
        }
        int i7 = this.f16800d + min;
        this.f16800d = i7;
        return i7 == i6;
    }

    public final boolean f() {
        this.f16798b.p(0);
        int h6 = this.f16798b.h(24);
        if (h6 != 1) {
            AbstractC1133o.h("PesReader", "Unexpected start code prefix: " + h6);
            this.f16806j = -1;
            return false;
        }
        this.f16798b.r(8);
        int h7 = this.f16798b.h(16);
        this.f16798b.r(5);
        this.f16807k = this.f16798b.g();
        this.f16798b.r(2);
        this.f16802f = this.f16798b.g();
        this.f16803g = this.f16798b.g();
        this.f16798b.r(6);
        int h8 = this.f16798b.h(8);
        this.f16805i = h8;
        if (h7 == 0) {
            this.f16806j = -1;
        } else {
            int i6 = (h7 - 3) - h8;
            this.f16806j = i6;
            if (i6 < 0) {
                AbstractC1133o.h("PesReader", "Found negative packet payload size: " + this.f16806j);
                this.f16806j = -1;
            }
        }
        return true;
    }

    public final void g() {
        this.f16798b.p(0);
        this.f16808l = -9223372036854775807L;
        if (this.f16802f) {
            this.f16798b.r(4);
            this.f16798b.r(1);
            this.f16798b.r(1);
            long h6 = (this.f16798b.h(3) << 30) | (this.f16798b.h(15) << 15) | this.f16798b.h(15);
            this.f16798b.r(1);
            if (!this.f16804h && this.f16803g) {
                this.f16798b.r(4);
                this.f16798b.r(1);
                this.f16798b.r(1);
                this.f16798b.r(1);
                this.f16801e.b((this.f16798b.h(3) << 30) | (this.f16798b.h(15) << 15) | this.f16798b.h(15));
                this.f16804h = true;
            }
            this.f16808l = this.f16801e.b(h6);
        }
    }

    public final void h(int i6) {
        this.f16799c = i6;
        this.f16800d = 0;
    }
}
