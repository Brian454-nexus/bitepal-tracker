package k2;

import E1.O;
import Z0.C0836h;
import Z0.q;
import android.util.SparseArray;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1122d;
import c1.C1144z;
import d1.d;
import java.util.ArrayList;
import java.util.Arrays;
import k2.K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p implements InterfaceC1679m {

    /* renamed from: a, reason: collision with root package name */
    public final F f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16644b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16645c;

    /* renamed from: g, reason: collision with root package name */
    public long f16649g;

    /* renamed from: i, reason: collision with root package name */
    public String f16651i;

    /* renamed from: j, reason: collision with root package name */
    public O f16652j;

    /* renamed from: k, reason: collision with root package name */
    public b f16653k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16654l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16656n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f16650h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final w f16646d = new w(7, 128);

    /* renamed from: e, reason: collision with root package name */
    public final w f16647e = new w(8, 128);

    /* renamed from: f, reason: collision with root package name */
    public final w f16648f = new w(6, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f16655m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final C1144z f16657o = new C1144z();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f16658a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16659b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16660c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f16661d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f16662e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final d1.e f16663f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f16664g;

        /* renamed from: h, reason: collision with root package name */
        public int f16665h;

        /* renamed from: i, reason: collision with root package name */
        public int f16666i;

        /* renamed from: j, reason: collision with root package name */
        public long f16667j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16668k;

        /* renamed from: l, reason: collision with root package name */
        public long f16669l;

        /* renamed from: m, reason: collision with root package name */
        public a f16670m;

        /* renamed from: n, reason: collision with root package name */
        public a f16671n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f16672o;

        /* renamed from: p, reason: collision with root package name */
        public long f16673p;

        /* renamed from: q, reason: collision with root package name */
        public long f16674q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f16675r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f16676s;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f16677a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f16678b;

            /* renamed from: c, reason: collision with root package name */
            public d.c f16679c;

            /* renamed from: d, reason: collision with root package name */
            public int f16680d;

            /* renamed from: e, reason: collision with root package name */
            public int f16681e;

            /* renamed from: f, reason: collision with root package name */
            public int f16682f;

            /* renamed from: g, reason: collision with root package name */
            public int f16683g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f16684h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f16685i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f16686j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f16687k;

            /* renamed from: l, reason: collision with root package name */
            public int f16688l;

            /* renamed from: m, reason: collision with root package name */
            public int f16689m;

            /* renamed from: n, reason: collision with root package name */
            public int f16690n;

            /* renamed from: o, reason: collision with root package name */
            public int f16691o;

            /* renamed from: p, reason: collision with root package name */
            public int f16692p;

            public a() {
            }

            public void b() {
                this.f16678b = false;
                this.f16677a = false;
            }

            public final boolean c(a aVar) {
                int i6;
                int i7;
                int i8;
                boolean z6;
                if (!this.f16677a) {
                    return false;
                }
                if (!aVar.f16677a) {
                    return true;
                }
                d.c cVar = (d.c) AbstractC1119a.i(this.f16679c);
                d.c cVar2 = (d.c) AbstractC1119a.i(aVar.f16679c);
                return (this.f16682f == aVar.f16682f && this.f16683g == aVar.f16683g && this.f16684h == aVar.f16684h && (!this.f16685i || !aVar.f16685i || this.f16686j == aVar.f16686j) && (((i6 = this.f16680d) == (i7 = aVar.f16680d) || (i6 != 0 && i7 != 0)) && (((i8 = cVar.f13416n) != 0 || cVar2.f13416n != 0 || (this.f16689m == aVar.f16689m && this.f16690n == aVar.f16690n)) && ((i8 != 1 || cVar2.f13416n != 1 || (this.f16691o == aVar.f16691o && this.f16692p == aVar.f16692p)) && (z6 = this.f16687k) == aVar.f16687k && (!z6 || this.f16688l == aVar.f16688l))))) ? false : true;
            }

            public boolean d() {
                if (!this.f16678b) {
                    return false;
                }
                int i6 = this.f16681e;
                return i6 == 7 || i6 == 2;
            }

            public void e(d.c cVar, int i6, int i7, int i8, int i9, boolean z6, boolean z7, boolean z8, boolean z9, int i10, int i11, int i12, int i13, int i14) {
                this.f16679c = cVar;
                this.f16680d = i6;
                this.f16681e = i7;
                this.f16682f = i8;
                this.f16683g = i9;
                this.f16684h = z6;
                this.f16685i = z7;
                this.f16686j = z8;
                this.f16687k = z9;
                this.f16688l = i10;
                this.f16689m = i11;
                this.f16690n = i12;
                this.f16691o = i13;
                this.f16692p = i14;
                this.f16677a = true;
                this.f16678b = true;
            }

            public void f(int i6) {
                this.f16681e = i6;
                this.f16678b = true;
            }
        }

        public b(O o6, boolean z6, boolean z7) {
            this.f16658a = o6;
            this.f16659b = z6;
            this.f16660c = z7;
            this.f16670m = new a();
            this.f16671n = new a();
            byte[] bArr = new byte[128];
            this.f16664g = bArr;
            this.f16663f = new d1.e(bArr, 0, 0);
            h();
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k2.p.b.a(byte[], int, int):void");
        }

        public void b(long j6) {
            i();
            this.f16667j = j6;
            e(0);
            this.f16672o = false;
        }

        public boolean c(long j6, int i6, boolean z6) {
            if (this.f16666i == 9 || (this.f16660c && this.f16671n.c(this.f16670m))) {
                if (z6 && this.f16672o) {
                    e(i6 + ((int) (j6 - this.f16667j)));
                }
                this.f16673p = this.f16667j;
                this.f16674q = this.f16669l;
                this.f16675r = false;
                this.f16672o = true;
            }
            i();
            return this.f16675r;
        }

        public boolean d() {
            return this.f16660c;
        }

        public final void e(int i6) {
            long j6 = this.f16674q;
            if (j6 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f16675r;
            this.f16658a.f(j6, z6 ? 1 : 0, (int) (this.f16667j - this.f16673p), i6, null);
        }

        public void f(d.b bVar) {
            this.f16662e.append(bVar.f13400a, bVar);
        }

        public void g(d.c cVar) {
            this.f16661d.append(cVar.f13406d, cVar);
        }

        public void h() {
            this.f16668k = false;
            this.f16672o = false;
            this.f16671n.b();
        }

        public final void i() {
            boolean d6 = this.f16659b ? this.f16671n.d() : this.f16676s;
            boolean z6 = this.f16675r;
            int i6 = this.f16666i;
            boolean z7 = true;
            if (i6 != 5 && (!d6 || i6 != 1)) {
                z7 = false;
            }
            this.f16675r = z6 | z7;
        }

        public void j(long j6, int i6, long j7, boolean z6) {
            this.f16666i = i6;
            this.f16669l = j7;
            this.f16667j = j6;
            this.f16676s = z6;
            if (!this.f16659b || i6 != 1) {
                if (!this.f16660c) {
                    return;
                }
                if (i6 != 5 && i6 != 1 && i6 != 2) {
                    return;
                }
            }
            a aVar = this.f16670m;
            this.f16670m = this.f16671n;
            this.f16671n = aVar;
            aVar.b();
            this.f16665h = 0;
            this.f16668k = true;
        }
    }

    public p(F f6, boolean z6, boolean z7) {
        this.f16643a = f6;
        this.f16644b = z6;
        this.f16645c = z7;
    }

    private void f() {
        AbstractC1119a.i(this.f16652j);
        AbstractC1117K.i(this.f16653k);
    }

    @Override // k2.InterfaceC1679m
    public void a(C1144z c1144z) {
        f();
        int f6 = c1144z.f();
        int g6 = c1144z.g();
        byte[] e6 = c1144z.e();
        this.f16649g += c1144z.a();
        this.f16652j.a(c1144z, c1144z.a());
        while (true) {
            int c6 = d1.d.c(e6, f6, g6, this.f16650h);
            if (c6 == g6) {
                h(e6, f6, g6);
                return;
            }
            int f7 = d1.d.f(e6, c6);
            int i6 = c6 - f6;
            if (i6 > 0) {
                h(e6, f6, c6);
            }
            int i7 = g6 - c6;
            long j6 = this.f16649g - i7;
            g(j6, i7, i6 < 0 ? -i6 : 0, this.f16655m);
            i(j6, f7, this.f16655m);
            f6 = c6 + 3;
        }
    }

    @Override // k2.InterfaceC1679m
    public void b() {
        this.f16649g = 0L;
        this.f16656n = false;
        this.f16655m = -9223372036854775807L;
        d1.d.a(this.f16650h);
        this.f16646d.d();
        this.f16647e.d();
        this.f16648f.d();
        b bVar = this.f16653k;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // k2.InterfaceC1679m
    public void c(boolean z6) {
        f();
        if (z6) {
            this.f16653k.b(this.f16649g);
        }
    }

    @Override // k2.InterfaceC1679m
    public void d(long j6, int i6) {
        this.f16655m = j6;
        this.f16656n |= (i6 & 2) != 0;
    }

    @Override // k2.InterfaceC1679m
    public void e(E1.r rVar, K.d dVar) {
        dVar.a();
        this.f16651i = dVar.b();
        O a6 = rVar.a(dVar.c(), 2);
        this.f16652j = a6;
        this.f16653k = new b(a6, this.f16644b, this.f16645c);
        this.f16643a.b(rVar, dVar);
    }

    public final void g(long j6, int i6, int i7, long j7) {
        if (!this.f16654l || this.f16653k.d()) {
            this.f16646d.b(i7);
            this.f16647e.b(i7);
            if (this.f16654l) {
                if (this.f16646d.c()) {
                    w wVar = this.f16646d;
                    this.f16653k.g(d1.d.l(wVar.f16792d, 3, wVar.f16793e));
                    this.f16646d.d();
                } else if (this.f16647e.c()) {
                    w wVar2 = this.f16647e;
                    this.f16653k.f(d1.d.j(wVar2.f16792d, 3, wVar2.f16793e));
                    this.f16647e.d();
                }
            } else if (this.f16646d.c() && this.f16647e.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f16646d;
                arrayList.add(Arrays.copyOf(wVar3.f16792d, wVar3.f16793e));
                w wVar4 = this.f16647e;
                arrayList.add(Arrays.copyOf(wVar4.f16792d, wVar4.f16793e));
                w wVar5 = this.f16646d;
                d.c l6 = d1.d.l(wVar5.f16792d, 3, wVar5.f16793e);
                w wVar6 = this.f16647e;
                d.b j8 = d1.d.j(wVar6.f16792d, 3, wVar6.f16793e);
                this.f16652j.e(new q.b().a0(this.f16651i).o0("video/avc").O(AbstractC1122d.a(l6.f13403a, l6.f13404b, l6.f13405c)).v0(l6.f13408f).Y(l6.f13409g).P(new C0836h.b().d(l6.f13419q).c(l6.f13420r).e(l6.f13421s).g(l6.f13411i + 8).b(l6.f13412j + 8).a()).k0(l6.f13410h).b0(arrayList).g0(l6.f13422t).K());
                this.f16654l = true;
                this.f16653k.g(l6);
                this.f16653k.f(j8);
                this.f16646d.d();
                this.f16647e.d();
            }
        }
        if (this.f16648f.b(i7)) {
            w wVar7 = this.f16648f;
            this.f16657o.R(this.f16648f.f16792d, d1.d.r(wVar7.f16792d, wVar7.f16793e));
            this.f16657o.T(4);
            this.f16643a.a(j7, this.f16657o);
        }
        if (this.f16653k.c(j6, i6, this.f16654l)) {
            this.f16656n = false;
        }
    }

    public final void h(byte[] bArr, int i6, int i7) {
        if (!this.f16654l || this.f16653k.d()) {
            this.f16646d.a(bArr, i6, i7);
            this.f16647e.a(bArr, i6, i7);
        }
        this.f16648f.a(bArr, i6, i7);
        this.f16653k.a(bArr, i6, i7);
    }

    public final void i(long j6, int i6, long j7) {
        if (!this.f16654l || this.f16653k.d()) {
            this.f16646d.e(i6);
            this.f16647e.e(i6);
        }
        this.f16648f.e(i6);
        this.f16653k.j(j6, i6, j7, this.f16656n);
    }
}
