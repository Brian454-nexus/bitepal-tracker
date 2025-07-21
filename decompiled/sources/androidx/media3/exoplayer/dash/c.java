package androidx.media3.exoplayer.dash;

import A1.e;
import A1.f;
import A1.k;
import A1.m;
import E1.C0305g;
import Z0.q;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import b2.s;
import c1.AbstractC1113G;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.C1261s;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import h1.v1;
import j1.C1641b;
import j1.g;
import j1.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k1.C1657a;
import k1.C1658b;
import k1.C1659c;
import k1.i;
import k1.j;
import w1.C2217b;
import x1.AbstractC2258b;
import x1.AbstractC2261e;
import x1.C2260d;
import x1.C2263g;
import x1.C2266j;
import x1.InterfaceC2262f;
import x1.l;
import x1.n;
import x1.o;
import z1.x;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements androidx.media3.exoplayer.dash.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f9212a;

    /* renamed from: b, reason: collision with root package name */
    public final C1641b f9213b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f9214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9215d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1248f f9216e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9218g;

    /* renamed from: h, reason: collision with root package name */
    public final d.c f9219h;

    /* renamed from: i, reason: collision with root package name */
    public final b[] f9220i;

    /* renamed from: j, reason: collision with root package name */
    public x f9221j;

    /* renamed from: k, reason: collision with root package name */
    public C1659c f9222k;

    /* renamed from: l, reason: collision with root package name */
    public int f9223l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f9224m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9225n;

    /* renamed from: o, reason: collision with root package name */
    public long f9226o = -9223372036854775807L;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements a.InterfaceC0136a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1248f.a f9227a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9228b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2262f.a f9229c;

        public a(InterfaceC1248f.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0136a
        public q c(q qVar) {
            return this.f9229c.c(qVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0136a
        public androidx.media3.exoplayer.dash.a d(m mVar, C1659c c1659c, C1641b c1641b, int i6, int[] iArr, x xVar, int i7, long j6, boolean z6, List list, d.c cVar, InterfaceC1266x interfaceC1266x, v1 v1Var, e eVar) {
            InterfaceC1248f a6 = this.f9227a.a();
            if (interfaceC1266x != null) {
                a6.l(interfaceC1266x);
            }
            return new c(this.f9229c, mVar, c1659c, c1641b, i6, iArr, xVar, i7, a6, j6, this.f9228b, z6, list, cVar, v1Var, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0136a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(boolean z6) {
            this.f9229c.b(z6);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0136a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(s.a aVar) {
            this.f9229c.a(aVar);
            return this;
        }

        public a(InterfaceC1248f.a aVar, int i6) {
            this(C2260d.f20410j, aVar, i6);
        }

        public a(InterfaceC2262f.a aVar, InterfaceC1248f.a aVar2, int i6) {
            this.f9229c = aVar;
            this.f9227a = aVar2;
            this.f9228b = i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2262f f9230a;

        /* renamed from: b, reason: collision with root package name */
        public final j f9231b;

        /* renamed from: c, reason: collision with root package name */
        public final C1658b f9232c;

        /* renamed from: d, reason: collision with root package name */
        public final g f9233d;

        /* renamed from: e, reason: collision with root package name */
        public final long f9234e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9235f;

        public b(long j6, j jVar, C1658b c1658b, InterfaceC2262f interfaceC2262f, long j7, g gVar) {
            this.f9234e = j6;
            this.f9231b = jVar;
            this.f9232c = c1658b;
            this.f9235f = j7;
            this.f9230a = interfaceC2262f;
            this.f9233d = gVar;
        }

        public b b(long j6, j jVar) {
            long f6;
            long f7;
            g l6 = this.f9231b.l();
            g l7 = jVar.l();
            if (l6 == null) {
                return new b(j6, jVar, this.f9232c, this.f9230a, this.f9235f, l6);
            }
            if (!l6.g()) {
                return new b(j6, jVar, this.f9232c, this.f9230a, this.f9235f, l7);
            }
            long i6 = l6.i(j6);
            if (i6 == 0) {
                return new b(j6, jVar, this.f9232c, this.f9230a, this.f9235f, l7);
            }
            AbstractC1119a.i(l7);
            long h6 = l6.h();
            long b6 = l6.b(h6);
            long j7 = i6 + h6;
            long j8 = j7 - 1;
            long b7 = l6.b(j8) + l6.a(j8, j6);
            long h7 = l7.h();
            long b8 = l7.b(h7);
            long j9 = this.f9235f;
            if (b7 == b8) {
                f6 = j7 - h7;
            } else {
                if (b7 < b8) {
                    throw new C2217b();
                }
                if (b8 < b6) {
                    f7 = j9 - (l7.f(b6, j6) - h6);
                    return new b(j6, jVar, this.f9232c, this.f9230a, f7, l7);
                }
                f6 = l6.f(b8, j6) - h7;
            }
            f7 = j9 + f6;
            return new b(j6, jVar, this.f9232c, this.f9230a, f7, l7);
        }

        public b c(g gVar) {
            return new b(this.f9234e, this.f9231b, this.f9232c, this.f9230a, this.f9235f, gVar);
        }

        public b d(C1658b c1658b) {
            return new b(this.f9234e, this.f9231b, c1658b, this.f9230a, this.f9235f, this.f9233d);
        }

        public long e(long j6) {
            return ((g) AbstractC1119a.i(this.f9233d)).c(this.f9234e, j6) + this.f9235f;
        }

        public long f() {
            return ((g) AbstractC1119a.i(this.f9233d)).h() + this.f9235f;
        }

        public long g(long j6) {
            return (e(j6) + ((g) AbstractC1119a.i(this.f9233d)).j(this.f9234e, j6)) - 1;
        }

        public long h() {
            return ((g) AbstractC1119a.i(this.f9233d)).i(this.f9234e);
        }

        public long i(long j6) {
            return k(j6) + ((g) AbstractC1119a.i(this.f9233d)).a(j6 - this.f9235f, this.f9234e);
        }

        public long j(long j6) {
            return ((g) AbstractC1119a.i(this.f9233d)).f(j6, this.f9234e) + this.f9235f;
        }

        public long k(long j6) {
            return ((g) AbstractC1119a.i(this.f9233d)).b(j6 - this.f9235f);
        }

        public i l(long j6) {
            return ((g) AbstractC1119a.i(this.f9233d)).e(j6 - this.f9235f);
        }

        public boolean m(long j6, long j7) {
            return ((g) AbstractC1119a.i(this.f9233d)).g() || j7 == -9223372036854775807L || i(j6) <= j7;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0137c extends AbstractC2258b {

        /* renamed from: e, reason: collision with root package name */
        public final b f9236e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9237f;

        public C0137c(b bVar, long j6, long j7, long j8) {
            super(j6, j7);
            this.f9236e = bVar;
            this.f9237f = j8;
        }

        @Override // x1.n
        public long a() {
            c();
            return this.f9236e.k(d());
        }

        @Override // x1.n
        public long b() {
            c();
            return this.f9236e.i(d());
        }
    }

    public c(InterfaceC2262f.a aVar, m mVar, C1659c c1659c, C1641b c1641b, int i6, int[] iArr, x xVar, int i7, InterfaceC1248f interfaceC1248f, long j6, int i8, boolean z6, List list, d.c cVar, v1 v1Var, e eVar) {
        this.f9212a = mVar;
        this.f9222k = c1659c;
        this.f9213b = c1641b;
        this.f9214c = iArr;
        this.f9221j = xVar;
        int i9 = i7;
        this.f9215d = i9;
        this.f9216e = interfaceC1248f;
        this.f9223l = i6;
        this.f9217f = j6;
        this.f9218g = i8;
        d.c cVar2 = cVar;
        this.f9219h = cVar2;
        long g6 = c1659c.g(i6);
        ArrayList o6 = o();
        this.f9220i = new b[xVar.length()];
        int i10 = 0;
        while (i10 < this.f9220i.length) {
            j jVar = (j) o6.get(xVar.k(i10));
            C1658b j7 = c1641b.j(jVar.f16367c);
            b[] bVarArr = this.f9220i;
            C1658b c1658b = j7 == null ? (C1658b) jVar.f16367c.get(0) : j7;
            InterfaceC2262f d6 = aVar.d(i9, jVar.f16366b, z6, list, cVar2, v1Var);
            long j8 = g6;
            int i11 = i10;
            bVarArr[i11] = new b(j8, jVar, c1658b, d6, 0L, jVar.l());
            i10 = i11 + 1;
            i9 = i7;
            g6 = j8;
            cVar2 = cVar;
        }
    }

    @Override // x1.InterfaceC2265i
    public void a() {
        IOException iOException = this.f9224m;
        if (iOException != null) {
            throw iOException;
        }
        this.f9212a.a();
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void b(x xVar) {
        this.f9221j = xVar;
    }

    @Override // x1.InterfaceC2265i
    public void d(C1343l0 c1343l0, long j6, List list, C2263g c2263g) {
        boolean z6;
        n[] nVarArr;
        long j7;
        int i6;
        int i7;
        c cVar;
        x1.m mVar;
        c cVar2 = this;
        if (cVar2.f9224m != null) {
            return;
        }
        long j8 = c1343l0.f14722a;
        long j9 = j6 - j8;
        long J02 = AbstractC1117K.J0(cVar2.f9222k.f16316a) + AbstractC1117K.J0(cVar2.f9222k.d(cVar2.f9223l).f16352b) + j6;
        d.c cVar3 = cVar2.f9219h;
        if (cVar3 == null || !cVar3.h(J02)) {
            long J03 = AbstractC1117K.J0(AbstractC1117K.f0(cVar2.f9217f));
            long n6 = cVar2.n(J03);
            boolean z7 = true;
            x1.m mVar2 = list.isEmpty() ? null : (x1.m) list.get(list.size() - 1);
            int length = cVar2.f9221j.length();
            n[] nVarArr2 = new n[length];
            int i8 = 0;
            while (i8 < length) {
                b bVar = cVar2.f9220i[i8];
                if (bVar.f9233d == null) {
                    nVarArr2[i8] = n.f20482a;
                    cVar = cVar2;
                    mVar = mVar2;
                    z6 = z7;
                    nVarArr = nVarArr2;
                    j7 = j9;
                    i7 = length;
                    i6 = i8;
                } else {
                    n[] nVarArr3 = nVarArr2;
                    long e6 = bVar.e(J03);
                    z6 = z7;
                    nVarArr = nVarArr3;
                    x1.m mVar3 = mVar2;
                    long g6 = bVar.g(J03);
                    j7 = j9;
                    i6 = i8;
                    i7 = length;
                    long p6 = cVar2.p(bVar, mVar3, j6, e6, g6);
                    cVar = cVar2;
                    mVar = mVar3;
                    if (p6 < e6) {
                        nVarArr[i6] = n.f20482a;
                    } else {
                        nVarArr[i6] = new C0137c(cVar.s(i6), p6, g6, n6);
                    }
                }
                i8 = i6 + 1;
                cVar2 = cVar;
                length = i7;
                mVar2 = mVar;
                nVarArr2 = nVarArr;
                z7 = z6;
                j9 = j7;
            }
            c cVar4 = cVar2;
            x1.m mVar4 = mVar2;
            boolean z8 = z7;
            cVar4.f9221j.a(j8, j9, cVar4.l(J03, j8), list, nVarArr2);
            int f6 = cVar4.f9221j.f();
            cVar4.f9226o = SystemClock.elapsedRealtime();
            b s6 = cVar4.s(f6);
            InterfaceC2262f interfaceC2262f = s6.f9230a;
            if (interfaceC2262f != null) {
                j jVar = s6.f9231b;
                i n7 = interfaceC2262f.c() == null ? jVar.n() : null;
                i m6 = s6.f9233d == null ? jVar.m() : null;
                if (n7 != null || m6 != null) {
                    c2263g.f20439a = cVar4.q(s6, cVar4.f9216e, cVar4.f9221j.n(), cVar4.f9221j.o(), cVar4.f9221j.r(), n7, m6, null);
                    return;
                }
            }
            long j10 = s6.f9234e;
            C1659c c1659c = cVar4.f9222k;
            boolean z9 = (c1659c.f16319d && cVar4.f9223l == c1659c.e() + (-1)) ? z8 : false;
            boolean z10 = (z9 && j10 == -9223372036854775807L) ? false : z8;
            if (s6.h() == 0) {
                c2263g.f20440b = z10;
                return;
            }
            long e7 = s6.e(J03);
            long g7 = s6.g(J03);
            if (z9) {
                long i9 = s6.i(g7);
                z10 &= i9 + (i9 - s6.k(g7)) >= j10 ? z8 : false;
            }
            boolean z11 = z10;
            long p7 = cVar4.p(s6, mVar4, j6, e7, g7);
            if (p7 < e7) {
                cVar4.f9224m = new C2217b();
                return;
            }
            if (p7 > g7 || (cVar4.f9225n && p7 >= g7)) {
                c2263g.f20440b = z11;
                return;
            }
            if (z11 && s6.k(p7) >= j10) {
                c2263g.f20440b = z8;
                return;
            }
            int min = (int) Math.min(cVar4.f9218g, (g7 - p7) + 1);
            if (j10 != -9223372036854775807L) {
                while (min > 1 && s6.k((min + p7) - 1) >= j10) {
                    min--;
                }
            }
            c2263g.f20439a = cVar4.r(s6, cVar4.f9216e, cVar4.f9215d, cVar4.f9221j.n(), cVar4.f9221j.o(), cVar4.f9221j.r(), p7, min, list.isEmpty() ? j6 : -9223372036854775807L, n6, null);
        }
    }

    @Override // x1.InterfaceC2265i
    public boolean e(long j6, AbstractC2261e abstractC2261e, List list) {
        if (this.f9224m != null) {
            return false;
        }
        return this.f9221j.d(j6, abstractC2261e, list);
    }

    @Override // x1.InterfaceC2265i
    public int f(long j6, List list) {
        return (this.f9224m != null || this.f9221j.length() < 2) ? list.size() : this.f9221j.l(j6, list);
    }

    @Override // x1.InterfaceC2265i
    public long g(long j6, N0 n02) {
        long j7 = j6;
        b[] bVarArr = this.f9220i;
        int length = bVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            b bVar = bVarArr[i6];
            if (bVar.f9233d != null) {
                long h6 = bVar.h();
                if (h6 != 0) {
                    long j8 = bVar.j(j7);
                    long k6 = bVar.k(j8);
                    return n02.a(j7, k6, (k6 >= j7 || (h6 != -1 && j8 >= (bVar.f() + h6) - 1)) ? k6 : bVar.k(j8 + 1));
                }
            }
            i6++;
            j7 = j6;
        }
        return j6;
    }

    @Override // x1.InterfaceC2265i
    public boolean h(AbstractC2261e abstractC2261e, boolean z6, k.c cVar, k kVar) {
        k.b c6;
        if (!z6) {
            return false;
        }
        d.c cVar2 = this.f9219h;
        if (cVar2 != null && cVar2.j(abstractC2261e)) {
            return true;
        }
        if (!this.f9222k.f16319d && (abstractC2261e instanceof x1.m)) {
            IOException iOException = cVar.f135c;
            if ((iOException instanceof C1261s) && ((C1261s) iOException).f13888d == 404) {
                b bVar = this.f9220i[this.f9221j.c(abstractC2261e.f20433d)];
                long h6 = bVar.h();
                if (h6 != -1 && h6 != 0) {
                    if (((x1.m) abstractC2261e).g() > (bVar.f() + h6) - 1) {
                        this.f9225n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f9220i[this.f9221j.c(abstractC2261e.f20433d)];
        C1658b j6 = this.f9213b.j(bVar2.f9231b.f16367c);
        if (j6 != null && !bVar2.f9232c.equals(j6)) {
            return true;
        }
        k.a k6 = k(this.f9221j, bVar2.f9231b.f16367c);
        if ((k6.a(2) || k6.a(1)) && (c6 = kVar.c(k6, cVar)) != null && k6.a(c6.f131a)) {
            int i6 = c6.f131a;
            if (i6 == 2) {
                x xVar = this.f9221j;
                return xVar.p(xVar.c(abstractC2261e.f20433d), c6.f132b);
            }
            if (i6 == 1) {
                this.f9213b.e(bVar2.f9232c, c6.f132b);
                return true;
            }
        }
        return false;
    }

    @Override // x1.InterfaceC2265i
    public void i(AbstractC2261e abstractC2261e) {
        C0305g e6;
        if (abstractC2261e instanceof l) {
            int c6 = this.f9221j.c(((l) abstractC2261e).f20433d);
            b bVar = this.f9220i[c6];
            if (bVar.f9233d == null && (e6 = ((InterfaceC2262f) AbstractC1119a.i(bVar.f9230a)).e()) != null) {
                this.f9220i[c6] = bVar.c(new j1.i(e6, bVar.f9231b.f16368d));
            }
        }
        d.c cVar = this.f9219h;
        if (cVar != null) {
            cVar.i(abstractC2261e);
        }
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void j(C1659c c1659c, int i6) {
        try {
            this.f9222k = c1659c;
            this.f9223l = i6;
            long g6 = c1659c.g(i6);
            ArrayList o6 = o();
            for (int i7 = 0; i7 < this.f9220i.length; i7++) {
                j jVar = (j) o6.get(this.f9221j.k(i7));
                b[] bVarArr = this.f9220i;
                bVarArr[i7] = bVarArr[i7].b(g6, jVar);
            }
        } catch (C2217b e6) {
            this.f9224m = e6;
        }
    }

    public final k.a k(x xVar, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = xVar.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (xVar.b(i7, elapsedRealtime)) {
                i6++;
            }
        }
        int f6 = C1641b.f(list);
        return new k.a(f6, f6 - this.f9213b.g(list), length, i6);
    }

    public final long l(long j6, long j7) {
        if (!this.f9222k.f16319d || this.f9220i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j6), this.f9220i[0].i(this.f9220i[0].g(j6))) - j7);
    }

    public final Pair m(long j6, i iVar, b bVar) {
        long j7 = j6 + 1;
        if (j7 >= bVar.h()) {
            return null;
        }
        i l6 = bVar.l(j7);
        String a6 = AbstractC1113G.a(iVar.b(bVar.f9232c.f16312a), l6.b(bVar.f9232c.f16312a));
        String str = l6.f16361a + "-";
        if (l6.f16362b != -1) {
            str = str + (l6.f16361a + l6.f16362b);
        }
        return new Pair(a6, str);
    }

    public final long n(long j6) {
        C1659c c1659c = this.f9222k;
        long j7 = c1659c.f16316a;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j6 - AbstractC1117K.J0(j7 + c1659c.d(this.f9223l).f16352b);
    }

    public final ArrayList o() {
        List list = this.f9222k.d(this.f9223l).f16353c;
        ArrayList arrayList = new ArrayList();
        for (int i6 : this.f9214c) {
            arrayList.addAll(((C1657a) list.get(i6)).f16308c);
        }
        return arrayList;
    }

    public final long p(b bVar, x1.m mVar, long j6, long j7, long j8) {
        return mVar != null ? mVar.g() : AbstractC1117K.q(bVar.j(j6), j7, j8);
    }

    public AbstractC2261e q(b bVar, InterfaceC1248f interfaceC1248f, q qVar, int i6, Object obj, i iVar, i iVar2, f.a aVar) {
        i iVar3 = iVar;
        j jVar = bVar.f9231b;
        if (iVar3 != null) {
            i a6 = iVar3.a(iVar2, bVar.f9232c.f16312a);
            if (a6 != null) {
                iVar3 = a6;
            }
        } else {
            iVar3 = (i) AbstractC1119a.e(iVar2);
        }
        return new l(interfaceC1248f, h.a(jVar, bVar.f9232c.f16312a, iVar3, 0, y.j()), qVar, i6, obj, bVar.f9230a);
    }

    public AbstractC2261e r(b bVar, InterfaceC1248f interfaceC1248f, int i6, q qVar, int i7, Object obj, long j6, int i8, long j7, long j8, f.a aVar) {
        j jVar = bVar.f9231b;
        long k6 = bVar.k(j6);
        i l6 = bVar.l(j6);
        if (bVar.f9230a == null) {
            int i9 = 8;
            long i10 = bVar.i(j6);
            if (bVar.m(j6, j8)) {
                i9 = 0;
            }
            return new o(interfaceC1248f, h.a(jVar, bVar.f9232c.f16312a, l6, i9, y.j()), qVar, i7, obj, k6, i10, j6, i6, qVar);
        }
        int i11 = 8;
        int i12 = 1;
        int i13 = 1;
        while (i12 < i8) {
            i a6 = l6.a(bVar.l(j6 + i12), bVar.f9232c.f16312a);
            if (a6 == null) {
                break;
            }
            i13++;
            i12++;
            l6 = a6;
        }
        long j9 = (j6 + i13) - 1;
        int i14 = i13;
        long i15 = bVar.i(j9);
        long j10 = bVar.f9234e;
        if (j10 == -9223372036854775807L || j10 > i15) {
            j10 = -9223372036854775807L;
        }
        if (bVar.m(j9, j8)) {
            i11 = 0;
        }
        C1252j a7 = h.a(jVar, bVar.f9232c.f16312a, l6, i11, y.j());
        long j11 = -jVar.f16368d;
        if (Z0.y.p(qVar.f6990n)) {
            j11 += k6;
        }
        return new C2266j(interfaceC1248f, a7, qVar, i7, obj, k6, i15, j7, j10, j6, i14, j11, bVar.f9230a);
    }

    @Override // x1.InterfaceC2265i
    public void release() {
        for (b bVar : this.f9220i) {
            InterfaceC2262f interfaceC2262f = bVar.f9230a;
            if (interfaceC2262f != null) {
                interfaceC2262f.release();
            }
        }
    }

    public final b s(int i6) {
        b bVar = this.f9220i[i6];
        C1658b j6 = this.f9213b.j(bVar.f9231b.f16367c);
        if (j6 == null || j6.equals(bVar.f9232c)) {
            return bVar;
        }
        b d6 = bVar.d(j6);
        this.f9220i[i6] = d6;
        return d6;
    }
}
