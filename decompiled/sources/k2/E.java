package k2;

import c1.AbstractC1117K;
import c1.C1111E;
import c1.C1144z;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class E implements K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1666D f16435a;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16436b = new C1144z(32);

    /* renamed from: c, reason: collision with root package name */
    public int f16437c;

    /* renamed from: d, reason: collision with root package name */
    public int f16438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16440f;

    public E(InterfaceC1666D interfaceC1666D) {
        this.f16435a = interfaceC1666D;
    }

    @Override // k2.K
    public void a(C1144z c1144z, int i6) {
        boolean z6 = (i6 & 1) != 0;
        int f6 = z6 ? c1144z.f() + c1144z.G() : -1;
        if (this.f16440f) {
            if (!z6) {
                return;
            }
            this.f16440f = false;
            c1144z.T(f6);
            this.f16438d = 0;
        }
        while (c1144z.a() > 0) {
            int i7 = this.f16438d;
            if (i7 < 3) {
                if (i7 == 0) {
                    int G6 = c1144z.G();
                    c1144z.T(c1144z.f() - 1);
                    if (G6 == 255) {
                        this.f16440f = true;
                        return;
                    }
                }
                int min = Math.min(c1144z.a(), 3 - this.f16438d);
                c1144z.l(this.f16436b.e(), this.f16438d, min);
                int i8 = this.f16438d + min;
                this.f16438d = i8;
                if (i8 == 3) {
                    this.f16436b.T(0);
                    this.f16436b.S(3);
                    this.f16436b.U(1);
                    int G7 = this.f16436b.G();
                    int G8 = this.f16436b.G();
                    this.f16439e = (G7 & 128) != 0;
                    this.f16437c = (((G7 & 15) << 8) | G8) + 3;
                    int b6 = this.f16436b.b();
                    int i9 = this.f16437c;
                    if (b6 < i9) {
                        this.f16436b.c(Math.min(4098, Math.max(i9, this.f16436b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c1144z.a(), this.f16437c - this.f16438d);
                c1144z.l(this.f16436b.e(), this.f16438d, min2);
                int i10 = this.f16438d + min2;
                this.f16438d = i10;
                int i11 = this.f16437c;
                if (i10 != i11) {
                    continue;
                } else {
                    if (!this.f16439e) {
                        this.f16436b.S(i11);
                    } else {
                        if (AbstractC1117K.x(this.f16436b.e(), 0, this.f16437c, -1) != 0) {
                            this.f16440f = true;
                            return;
                        }
                        this.f16436b.S(this.f16437c - 4);
                    }
                    this.f16436b.T(0);
                    this.f16435a.a(this.f16436b);
                    this.f16438d = 0;
                }
            }
        }
    }

    @Override // k2.K
    public void b() {
        this.f16440f = true;
    }

    @Override // k2.K
    public void c(C1111E c1111e, E1.r rVar, K.d dVar) {
        this.f16435a.c(c1111e, rVar, dVar);
        this.f16440f = true;
    }
}
