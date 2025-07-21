package e2;

import android.graphics.Bitmap;
import b1.C1076a;
import b2.C1081e;
import b2.s;
import c1.AbstractC1117K;
import c1.C1144z;
import c1.InterfaceC1125g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1268a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final C1144z f13915a = new C1144z();

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f13916b = new C1144z();

    /* renamed from: c, reason: collision with root package name */
    public final C0194a f13917c = new C0194a();

    /* renamed from: d, reason: collision with root package name */
    public Inflater f13918d;

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0194a {

        /* renamed from: a, reason: collision with root package name */
        public final C1144z f13919a = new C1144z();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13920b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        public boolean f13921c;

        /* renamed from: d, reason: collision with root package name */
        public int f13922d;

        /* renamed from: e, reason: collision with root package name */
        public int f13923e;

        /* renamed from: f, reason: collision with root package name */
        public int f13924f;

        /* renamed from: g, reason: collision with root package name */
        public int f13925g;

        /* renamed from: h, reason: collision with root package name */
        public int f13926h;

        /* renamed from: i, reason: collision with root package name */
        public int f13927i;

        public C1076a d() {
            int i6;
            if (this.f13922d == 0 || this.f13923e == 0 || this.f13926h == 0 || this.f13927i == 0 || this.f13919a.g() == 0 || this.f13919a.f() != this.f13919a.g() || !this.f13921c) {
                return null;
            }
            this.f13919a.T(0);
            int i7 = this.f13926h * this.f13927i;
            int[] iArr = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int G6 = this.f13919a.G();
                if (G6 != 0) {
                    i6 = i8 + 1;
                    iArr[i8] = this.f13920b[G6];
                } else {
                    int G7 = this.f13919a.G();
                    if (G7 != 0) {
                        i6 = ((G7 & 64) == 0 ? G7 & 63 : ((G7 & 63) << 8) | this.f13919a.G()) + i8;
                        Arrays.fill(iArr, i8, i6, (G7 & 128) == 0 ? this.f13920b[0] : this.f13920b[this.f13919a.G()]);
                    }
                }
                i8 = i6;
            }
            return new C1076a.b().f(Bitmap.createBitmap(iArr, this.f13926h, this.f13927i, Bitmap.Config.ARGB_8888)).k(this.f13924f / this.f13922d).l(0).h(this.f13925g / this.f13923e, 0).i(0).n(this.f13926h / this.f13922d).g(this.f13927i / this.f13923e).a();
        }

        public final void e(C1144z c1144z, int i6) {
            int J6;
            if (i6 < 4) {
                return;
            }
            c1144z.U(3);
            int i7 = i6 - 4;
            if ((c1144z.G() & 128) != 0) {
                if (i7 < 7 || (J6 = c1144z.J()) < 4) {
                    return;
                }
                this.f13926h = c1144z.M();
                this.f13927i = c1144z.M();
                this.f13919a.P(J6 - 4);
                i7 = i6 - 11;
            }
            int f6 = this.f13919a.f();
            int g6 = this.f13919a.g();
            if (f6 >= g6 || i7 <= 0) {
                return;
            }
            int min = Math.min(i7, g6 - f6);
            c1144z.l(this.f13919a.e(), f6, min);
            this.f13919a.T(f6 + min);
        }

        public final void f(C1144z c1144z, int i6) {
            if (i6 < 19) {
                return;
            }
            this.f13922d = c1144z.M();
            this.f13923e = c1144z.M();
            c1144z.U(11);
            this.f13924f = c1144z.M();
            this.f13925g = c1144z.M();
        }

        public final void g(C1144z c1144z, int i6) {
            if (i6 % 5 != 2) {
                return;
            }
            c1144z.U(2);
            Arrays.fill(this.f13920b, 0);
            int i7 = i6 / 5;
            for (int i8 = 0; i8 < i7; i8++) {
                int G6 = c1144z.G();
                int G7 = c1144z.G();
                int G8 = c1144z.G();
                int G9 = c1144z.G();
                double d6 = G7;
                double d7 = G8 - 128;
                double d8 = G9 - 128;
                this.f13920b[G6] = (AbstractC1117K.p((int) ((d6 - (0.34414d * d8)) - (d7 * 0.71414d)), 0, 255) << 8) | (c1144z.G() << 24) | (AbstractC1117K.p((int) ((1.402d * d7) + d6), 0, 255) << 16) | AbstractC1117K.p((int) (d6 + (d8 * 1.772d)), 0, 255);
            }
            this.f13921c = true;
        }

        public void h() {
            this.f13922d = 0;
            this.f13923e = 0;
            this.f13924f = 0;
            this.f13925g = 0;
            this.f13926h = 0;
            this.f13927i = 0;
            this.f13919a.P(0);
            this.f13921c = false;
        }
    }

    public static C1076a f(C1144z c1144z, C0194a c0194a) {
        int g6 = c1144z.g();
        int G6 = c1144z.G();
        int M5 = c1144z.M();
        int f6 = c1144z.f() + M5;
        C1076a c1076a = null;
        if (f6 > g6) {
            c1144z.T(g6);
            return null;
        }
        if (G6 != 128) {
            switch (G6) {
                case 20:
                    c0194a.g(c1144z, M5);
                    break;
                case 21:
                    c0194a.e(c1144z, M5);
                    break;
                case 22:
                    c0194a.f(c1144z, M5);
                    break;
            }
        } else {
            c1076a = c0194a.d();
            c0194a.h();
        }
        c1144z.T(f6);
        return c1076a;
    }

    @Override // b2.s
    public void c(byte[] bArr, int i6, int i7, s.b bVar, InterfaceC1125g interfaceC1125g) {
        this.f13915a.R(bArr, i7 + i6);
        this.f13915a.T(i6);
        e(this.f13915a);
        this.f13917c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f13915a.a() >= 3) {
            C1076a f6 = f(this.f13915a, this.f13917c);
            if (f6 != null) {
                arrayList.add(f6);
            }
        }
        interfaceC1125g.accept(new C1081e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // b2.s
    public int d() {
        return 2;
    }

    public final void e(C1144z c1144z) {
        if (c1144z.a() <= 0 || c1144z.j() != 120) {
            return;
        }
        if (this.f13918d == null) {
            this.f13918d = new Inflater();
        }
        if (AbstractC1117K.w0(c1144z, this.f13916b, this.f13918d)) {
            c1144z.R(this.f13916b.e(), this.f13916b.g());
        }
    }
}
