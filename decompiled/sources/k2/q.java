package k2;

import E1.O;
import Z0.C0836h;
import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1122d;
import c1.C1144z;
import d1.d;
import java.util.Collections;
import k2.K;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final F f16693a;

    /* renamed from: b, reason: collision with root package name */
    public String f16694b;

    /* renamed from: c, reason: collision with root package name */
    public O f16695c;

    /* renamed from: d, reason: collision with root package name */
    public a f16696d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16697e;

    /* renamed from: l, reason: collision with root package name */
    public long f16704l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16698f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f16699g = new w(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final w f16700h = new w(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w f16701i = new w(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w f16702j = new w(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w f16703k = new w(40, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f16705m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C1144z f16706n = new C1144z();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final O f16707a;

        /* renamed from: b, reason: collision with root package name */
        public long f16708b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16709c;

        /* renamed from: d, reason: collision with root package name */
        public int f16710d;

        /* renamed from: e, reason: collision with root package name */
        public long f16711e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16712f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16713g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16714h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f16715i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f16716j;

        /* renamed from: k, reason: collision with root package name */
        public long f16717k;

        /* renamed from: l, reason: collision with root package name */
        public long f16718l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f16719m;

        public a(O o6) {
            this.f16707a = o6;
        }

        public static boolean c(int i6) {
            return (32 <= i6 && i6 <= 35) || i6 == 39;
        }

        public static boolean d(int i6) {
            return i6 < 32 || i6 == 40;
        }

        public void a(long j6) {
            this.f16719m = this.f16709c;
            e((int) (j6 - this.f16708b));
            this.f16717k = this.f16708b;
            this.f16708b = j6;
            e(0);
            this.f16715i = false;
        }

        public void b(long j6, int i6, boolean z6) {
            if (this.f16716j && this.f16713g) {
                this.f16719m = this.f16709c;
                this.f16716j = false;
            } else if (this.f16714h || this.f16713g) {
                if (z6 && this.f16715i) {
                    e(i6 + ((int) (j6 - this.f16708b)));
                }
                this.f16717k = this.f16708b;
                this.f16718l = this.f16711e;
                this.f16719m = this.f16709c;
                this.f16715i = true;
            }
        }

        public final void e(int i6) {
            long j6 = this.f16718l;
            if (j6 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f16719m;
            this.f16707a.f(j6, z6 ? 1 : 0, (int) (this.f16708b - this.f16717k), i6, null);
        }

        public void f(byte[] bArr, int i6, int i7) {
            if (this.f16712f) {
                int i8 = this.f16710d;
                int i9 = (i6 + 2) - i8;
                if (i9 >= i7) {
                    this.f16710d = i8 + (i7 - i6);
                } else {
                    this.f16713g = (bArr[i9] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.f16712f = false;
                }
            }
        }

        public void g() {
            this.f16712f = false;
            this.f16713g = false;
            this.f16714h = false;
            this.f16715i = false;
            this.f16716j = false;
        }

        public void h(long j6, int i6, int i7, long j7, boolean z6) {
            this.f16713g = false;
            this.f16714h = false;
            this.f16711e = j7;
            this.f16710d = 0;
            this.f16708b = j6;
            if (!d(i7)) {
                if (this.f16715i && !this.f16716j) {
                    if (z6) {
                        e(i6);
                    }
                    this.f16715i = false;
                }
                if (c(i7)) {
                    this.f16714h = !this.f16716j;
                    this.f16716j = true;
                }
            }
            boolean z7 = i7 >= 16 && i7 <= 21;
            this.f16709c = z7;
            this.f16712f = z7 || i7 <= 9;
        }
    }

    public q(F f6) {
        this.f16693a = f6;
    }

    private void f() {
        AbstractC1119a.i(this.f16695c);
        AbstractC1117K.i(this.f16696d);
    }

    private void g(long j6, int i6, int i7, long j7) {
        this.f16696d.b(j6, i6, this.f16697e);
        if (!this.f16697e) {
            this.f16699g.b(i7);
            this.f16700h.b(i7);
            this.f16701i.b(i7);
            if (this.f16699g.c() && this.f16700h.c() && this.f16701i.c()) {
                this.f16695c.e(i(this.f16694b, this.f16699g, this.f16700h, this.f16701i));
                this.f16697e = true;
            }
        }
        if (this.f16702j.b(i7)) {
            w wVar = this.f16702j;
            this.f16706n.R(this.f16702j.f16792d, d1.d.r(wVar.f16792d, wVar.f16793e));
            this.f16706n.U(5);
            this.f16693a.a(j7, this.f16706n);
        }
        if (this.f16703k.b(i7)) {
            w wVar2 = this.f16703k;
            this.f16706n.R(this.f16703k.f16792d, d1.d.r(wVar2.f16792d, wVar2.f16793e));
            this.f16706n.U(5);
            this.f16693a.a(j7, this.f16706n);
        }
    }

    private void h(byte[] bArr, int i6, int i7) {
        this.f16696d.f(bArr, i6, i7);
        if (!this.f16697e) {
            this.f16699g.a(bArr, i6, i7);
            this.f16700h.a(bArr, i6, i7);
            this.f16701i.a(bArr, i6, i7);
        }
        this.f16702j.a(bArr, i6, i7);
        this.f16703k.a(bArr, i6, i7);
    }

    public static Z0.q i(String str, w wVar, w wVar2, w wVar3) {
        int i6 = wVar.f16793e;
        byte[] bArr = new byte[wVar2.f16793e + i6 + wVar3.f16793e];
        System.arraycopy(wVar.f16792d, 0, bArr, 0, i6);
        System.arraycopy(wVar2.f16792d, 0, bArr, wVar.f16793e, wVar2.f16793e);
        System.arraycopy(wVar3.f16792d, 0, bArr, wVar.f16793e + wVar2.f16793e, wVar3.f16793e);
        d.a h6 = d1.d.h(wVar2.f16792d, 3, wVar2.f16793e);
        return new q.b().a0(str).o0("video/hevc").O(AbstractC1122d.c(h6.f13383a, h6.f13384b, h6.f13385c, h6.f13386d, h6.f13390h, h6.f13391i)).v0(h6.f13393k).Y(h6.f13394l).P(new C0836h.b().d(h6.f13397o).c(h6.f13398p).e(h6.f13399q).g(h6.f13388f + 8).b(h6.f13389g + 8).a()).k0(h6.f13395m).g0(h6.f13396n).b0(Collections.singletonList(bArr)).K();
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        f();
        while (c1144z.a() > 0) {
            int f6 = c1144z.f();
            int g6 = c1144z.g();
            byte[] e6 = c1144z.e();
            this.f16704l += c1144z.a();
            this.f16695c.a(c1144z, c1144z.a());
            while (f6 < g6) {
                int c6 = d1.d.c(e6, f6, g6, this.f16698f);
                if (c6 == g6) {
                    h(e6, f6, g6);
                    return;
                }
                int e7 = d1.d.e(e6, c6);
                int i6 = c6 - f6;
                if (i6 > 0) {
                    h(e6, f6, c6);
                }
                int i7 = g6 - c6;
                long j6 = this.f16704l - i7;
                g(j6, i7, i6 < 0 ? -i6 : 0, this.f16705m);
                j(j6, i7, e7, this.f16705m);
                f6 = c6 + 3;
            }
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16704l = 0L;
        this.f16705m = -9223372036854775807L;
        d1.d.a(this.f16698f);
        this.f16699g.d();
        this.f16700h.d();
        this.f16701i.d();
        this.f16702j.d();
        this.f16703k.d();
        a aVar = this.f16696d;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        f();
        if (z6) {
            this.f16696d.a(this.f16704l);
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16705m = j6;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16694b = dVar.b();
        O a6 = rVar.a(dVar.c(), 2);
        this.f16695c = a6;
        this.f16696d = new a(a6);
        this.f16693a.b(rVar, dVar);
    }

    public final void j(long j6, int i6, int i7, long j7) {
        this.f16696d.h(j6, i6, i7, j7, this.f16697e);
        if (!this.f16697e) {
            this.f16699g.e(i7);
            this.f16700h.e(i7);
            this.f16701i.e(i7);
        }
        this.f16702j.e(i7);
        this.f16703k.e(i7);
    }
}
