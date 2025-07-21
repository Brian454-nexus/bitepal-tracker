package k2;

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

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o implements InterfaceC1679m {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f16617l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final M f16618a;

    /* renamed from: b, reason: collision with root package name */
    public final C1144z f16619b;

    /* renamed from: e, reason: collision with root package name */
    public final w f16622e;

    /* renamed from: f, reason: collision with root package name */
    public b f16623f;

    /* renamed from: g, reason: collision with root package name */
    public long f16624g;

    /* renamed from: h, reason: collision with root package name */
    public String f16625h;

    /* renamed from: i, reason: collision with root package name */
    public O f16626i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16627j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f16620c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final a f16621d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    public long f16628k = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f16629f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f16630a;

        /* renamed from: b, reason: collision with root package name */
        public int f16631b;

        /* renamed from: c, reason: collision with root package name */
        public int f16632c;

        /* renamed from: d, reason: collision with root package name */
        public int f16633d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f16634e;

        public a(int i6) {
            this.f16634e = new byte[i6];
        }

        public void a(byte[] bArr, int i6, int i7) {
            if (this.f16630a) {
                int i8 = i7 - i6;
                byte[] bArr2 = this.f16634e;
                int length = bArr2.length;
                int i9 = this.f16632c;
                if (length < i9 + i8) {
                    this.f16634e = Arrays.copyOf(bArr2, (i9 + i8) * 2);
                }
                System.arraycopy(bArr, i6, this.f16634e, this.f16632c, i8);
                this.f16632c += i8;
            }
        }

        public boolean b(int i6, int i7) {
            int i8 = this.f16631b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i6 == 179 || i6 == 181) {
                                this.f16632c -= i7;
                                this.f16630a = false;
                                return true;
                            }
                        } else if ((i6 & 240) != 32) {
                            AbstractC1133o.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f16633d = this.f16632c;
                            this.f16631b = 4;
                        }
                    } else if (i6 > 31) {
                        AbstractC1133o.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f16631b = 3;
                    }
                } else if (i6 != 181) {
                    AbstractC1133o.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f16631b = 2;
                }
            } else if (i6 == 176) {
                this.f16631b = 1;
                this.f16630a = true;
            }
            byte[] bArr = f16629f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f16630a = false;
            this.f16632c = 0;
            this.f16631b = 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f16635a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16636b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16637c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16638d;

        /* renamed from: e, reason: collision with root package name */
        public int f16639e;

        /* renamed from: f, reason: collision with root package name */
        public int f16640f;

        /* renamed from: g, reason: collision with root package name */
        public long f16641g;

        /* renamed from: h, reason: collision with root package name */
        public long f16642h;

        public b(O o6) {
            this.f16635a = o6;
        }

        public void a(byte[] bArr, int i6, int i7) {
            if (this.f16637c) {
                int i8 = this.f16640f;
                int i9 = (i6 + 1) - i8;
                if (i9 >= i7) {
                    this.f16640f = i8 + (i7 - i6);
                } else {
                    this.f16638d = ((bArr[i9] & 192) >> 6) == 0;
                    this.f16637c = false;
                }
            }
        }

        public void b(long j6, int i6, boolean z6) {
            AbstractC1119a.g(this.f16642h != -9223372036854775807L);
            if (this.f16639e == 182 && z6 && this.f16636b) {
                this.f16635a.f(this.f16642h, this.f16638d ? 1 : 0, (int) (j6 - this.f16641g), i6, null);
            }
            if (this.f16639e != 179) {
                this.f16641g = j6;
            }
        }

        public void c(int i6, long j6) {
            this.f16639e = i6;
            this.f16638d = false;
            this.f16636b = i6 == 182 || i6 == 179;
            this.f16637c = i6 == 182;
            this.f16640f = 0;
            this.f16642h = j6;
        }

        public void d() {
            this.f16636b = false;
            this.f16637c = false;
            this.f16638d = false;
            this.f16639e = -1;
        }
    }

    public o(M m6) {
        this.f16618a = m6;
        if (m6 != null) {
            this.f16622e = new w(178, 128);
            this.f16619b = new C1144z();
        } else {
            this.f16622e = null;
            this.f16619b = null;
        }
    }

    public static Z0.q f(a aVar, int i6, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f16634e, aVar.f16632c);
        C1143y c1143y = new C1143y(copyOf);
        c1143y.s(i6);
        c1143y.s(4);
        c1143y.q();
        c1143y.r(8);
        if (c1143y.g()) {
            c1143y.r(4);
            c1143y.r(3);
        }
        int h6 = c1143y.h(4);
        float f6 = 1.0f;
        if (h6 == 15) {
            int h7 = c1143y.h(8);
            int h8 = c1143y.h(8);
            if (h8 == 0) {
                AbstractC1133o.h("H263Reader", "Invalid aspect ratio");
            } else {
                f6 = h7 / h8;
            }
        } else {
            float[] fArr = f16617l;
            if (h6 < fArr.length) {
                f6 = fArr[h6];
            } else {
                AbstractC1133o.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c1143y.g()) {
            c1143y.r(2);
            c1143y.r(1);
            if (c1143y.g()) {
                c1143y.r(15);
                c1143y.q();
                c1143y.r(15);
                c1143y.q();
                c1143y.r(15);
                c1143y.q();
                c1143y.r(3);
                c1143y.r(11);
                c1143y.q();
                c1143y.r(15);
                c1143y.q();
            }
        }
        if (c1143y.h(2) != 0) {
            AbstractC1133o.h("H263Reader", "Unhandled video object layer shape");
        }
        c1143y.q();
        int h9 = c1143y.h(16);
        c1143y.q();
        if (c1143y.g()) {
            if (h9 == 0) {
                AbstractC1133o.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i7 = 0;
                for (int i8 = h9 - 1; i8 > 0; i8 >>= 1) {
                    i7++;
                }
                c1143y.r(i7);
            }
        }
        c1143y.q();
        int h10 = c1143y.h(13);
        c1143y.q();
        int h11 = c1143y.h(13);
        c1143y.q();
        c1143y.q();
        return new q.b().a0(str).o0("video/mp4v-es").v0(h10).Y(h11).k0(f6).b0(Collections.singletonList(copyOf)).K();
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        AbstractC1119a.i(this.f16623f);
        AbstractC1119a.i(this.f16626i);
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        byte[] e6 = c1144z.e();
        this.f16624g += c1144z.a();
        this.f16626i.a(c1144z, c1144z.a());
        while (true) {
            int c6 = d1.d.c(e6, f6, g6, this.f16620c);
            if (c6 == g6) {
                break;
            }
            int i6 = c6 + 3;
            int i7 = c1144z.e()[i6] & 255;
            int i8 = c6 - f6;
            int i9 = 0;
            if (!this.f16627j) {
                if (i8 > 0) {
                    this.f16621d.a(e6, f6, c6);
                }
                if (this.f16621d.b(i7, i8 < 0 ? -i8 : 0)) {
                    O o6 = this.f16626i;
                    a aVar = this.f16621d;
                    o6.e(f(aVar, aVar.f16633d, (String) AbstractC1119a.e(this.f16625h)));
                    this.f16627j = true;
                }
            }
            this.f16623f.a(e6, f6, c6);
            w wVar = this.f16622e;
            if (wVar != null) {
                if (i8 > 0) {
                    wVar.a(e6, f6, c6);
                } else {
                    i9 = -i8;
                }
                if (this.f16622e.b(i9)) {
                    w wVar2 = this.f16622e;
                    ((C1144z) AbstractC1117K.i(this.f16619b)).R(this.f16622e.f16792d, d1.d.r(wVar2.f16792d, wVar2.f16793e));
                    ((M) AbstractC1117K.i(this.f16618a)).a(this.f16628k, this.f16619b);
                }
                if (i7 == 178 && c1144z.e()[c6 + 2] == 1) {
                    this.f16622e.e(i7);
                }
            }
            int i10 = g6 - c6;
            this.f16623f.b(this.f16624g - i10, i10, this.f16627j);
            this.f16623f.c(i7, this.f16628k);
            f6 = i6;
        }
        if (!this.f16627j) {
            this.f16621d.a(e6, f6, g6);
        }
        this.f16623f.a(e6, f6, g6);
        w wVar3 = this.f16622e;
        if (wVar3 != null) {
            wVar3.a(e6, f6, g6);
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        d1.d.a(this.f16620c);
        this.f16621d.c();
        b bVar = this.f16623f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f16622e;
        if (wVar != null) {
            wVar.d();
        }
        this.f16624g = 0L;
        this.f16628k = -9223372036854775807L;
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        AbstractC1119a.i(this.f16623f);
        if (z6) {
            this.f16623f.b(this.f16624g, 0, this.f16627j);
            this.f16623f.d();
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16628k = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16625h = dVar.b();
        O a6 = rVar.a(dVar.c(), 2);
        this.f16626i = a6;
        this.f16623f = new b(a6);
        M m6 = this.f16618a;
        if (m6 != null) {
            m6.b(rVar, dVar);
        }
    }
}
