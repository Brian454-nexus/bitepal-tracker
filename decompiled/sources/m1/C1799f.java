package m1;

import A1.f;
import Z0.H;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c1.AbstractC1113G;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import g1.C1343l0;
import g1.N0;
import h1.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n1.f;
import w1.C2217b;
import x1.AbstractC2258b;
import x1.AbstractC2261e;
import z1.AbstractC2447c;
import z1.x;
import z6.D;

/* renamed from: m1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1799f {

    /* renamed from: a, reason: collision with root package name */
    public final h f17247a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1248f f17248b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1248f f17249c;

    /* renamed from: d, reason: collision with root package name */
    public final v f17250d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f17251e;

    /* renamed from: f, reason: collision with root package name */
    public final Z0.q[] f17252f;

    /* renamed from: g, reason: collision with root package name */
    public final n1.k f17253g;

    /* renamed from: h, reason: collision with root package name */
    public final H f17254h;

    /* renamed from: i, reason: collision with root package name */
    public final List f17255i;

    /* renamed from: k, reason: collision with root package name */
    public final v1 f17257k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17258l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17259m;

    /* renamed from: o, reason: collision with root package name */
    public IOException f17261o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f17262p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17263q;

    /* renamed from: r, reason: collision with root package name */
    public x f17264r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17266t;

    /* renamed from: u, reason: collision with root package name */
    public long f17267u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public final C1798e f17256j = new C1798e(4);

    /* renamed from: n, reason: collision with root package name */
    public byte[] f17260n = AbstractC1117K.f10565f;

    /* renamed from: s, reason: collision with root package name */
    public long f17265s = -9223372036854775807L;

    /* renamed from: m1.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends x1.k {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f17268l;

        public a(InterfaceC1248f interfaceC1248f, C1252j c1252j, Z0.q qVar, int i6, Object obj, byte[] bArr) {
            super(interfaceC1248f, c1252j, 3, qVar, i6, obj, bArr);
        }

        @Override // x1.k
        public void g(byte[] bArr, int i6) {
            this.f17268l = Arrays.copyOf(bArr, i6);
        }

        public byte[] j() {
            return this.f17268l;
        }
    }

    /* renamed from: m1.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC2261e f17269a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17270b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f17271c;

        public b() {
            a();
        }

        public void a() {
            this.f17269a = null;
            this.f17270b = false;
            this.f17271c = null;
        }
    }

    /* renamed from: m1.f$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends AbstractC2258b {

        /* renamed from: e, reason: collision with root package name */
        public final List f17272e;

        /* renamed from: f, reason: collision with root package name */
        public final long f17273f;

        /* renamed from: g, reason: collision with root package name */
        public final String f17274g;

        public c(String str, long j6, List list) {
            super(0L, list.size() - 1);
            this.f17274g = str;
            this.f17273f = j6;
            this.f17272e = list;
        }

        @Override // x1.n
        public long a() {
            c();
            return this.f17273f + ((f.e) this.f17272e.get((int) d())).f17525e;
        }

        @Override // x1.n
        public long b() {
            c();
            f.e eVar = (f.e) this.f17272e.get((int) d());
            return this.f17273f + eVar.f17525e + eVar.f17523c;
        }
    }

    /* renamed from: m1.f$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends AbstractC2447c {

        /* renamed from: h, reason: collision with root package name */
        public int f17275h;

        public d(H h6, int[] iArr) {
            super(h6, iArr);
            this.f17275h = c(h6.a(iArr[0]));
        }

        @Override // z1.x
        public void a(long j6, long j7, long j8, List list, x1.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f17275h, elapsedRealtime)) {
                for (int i6 = this.f21511b - 1; i6 >= 0; i6--) {
                    if (!b(i6, elapsedRealtime)) {
                        this.f17275h = i6;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // z1.x
        public int f() {
            return this.f17275h;
        }

        @Override // z1.x
        public int o() {
            return 0;
        }

        @Override // z1.x
        public Object r() {
            return null;
        }
    }

    /* renamed from: m1.f$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final f.e f17276a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17277b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17278c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f17279d;

        public e(f.e eVar, long j6, int i6) {
            this.f17276a = eVar;
            this.f17277b = j6;
            this.f17278c = i6;
            this.f17279d = (eVar instanceof f.b) && ((f.b) eVar).f17515m;
        }
    }

    public C1799f(h hVar, n1.k kVar, Uri[] uriArr, Z0.q[] qVarArr, g gVar, InterfaceC1266x interfaceC1266x, v vVar, long j6, List list, v1 v1Var, A1.e eVar) {
        this.f17247a = hVar;
        this.f17253g = kVar;
        this.f17251e = uriArr;
        this.f17252f = qVarArr;
        this.f17250d = vVar;
        this.f17258l = j6;
        this.f17255i = list;
        this.f17257k = v1Var;
        InterfaceC1248f a6 = gVar.a(1);
        this.f17248b = a6;
        if (interfaceC1266x != null) {
            a6.l(interfaceC1266x);
        }
        this.f17249c = gVar.a(3);
        this.f17254h = new H(qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < uriArr.length; i6++) {
            if ((qVarArr[i6].f6982f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        this.f17264r = new d(this.f17254h, C6.g.m(arrayList));
    }

    public static Uri e(n1.f fVar, f.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f17527g) == null) {
            return null;
        }
        return AbstractC1113G.f(fVar.f17558a, str);
    }

    public static e h(n1.f fVar, long j6, int i6) {
        int i7 = (int) (j6 - fVar.f17502k);
        if (i7 == fVar.f17509r.size()) {
            if (i6 == -1) {
                i6 = 0;
            }
            if (i6 < fVar.f17510s.size()) {
                return new e((f.e) fVar.f17510s.get(i6), j6, i6);
            }
            return null;
        }
        f.d dVar = (f.d) fVar.f17509r.get(i7);
        if (i6 == -1) {
            return new e(dVar, j6, -1);
        }
        if (i6 < dVar.f17520m.size()) {
            return new e((f.e) dVar.f17520m.get(i6), j6, i6);
        }
        int i8 = i7 + 1;
        if (i8 < fVar.f17509r.size()) {
            return new e((f.e) fVar.f17509r.get(i8), j6 + 1, -1);
        }
        if (fVar.f17510s.isEmpty()) {
            return null;
        }
        return new e((f.e) fVar.f17510s.get(0), j6 + 1, 0);
    }

    public static List j(n1.f fVar, long j6, int i6) {
        int i7 = (int) (j6 - fVar.f17502k);
        if (i7 < 0 || fVar.f17509r.size() < i7) {
            return z6.w.w();
        }
        ArrayList arrayList = new ArrayList();
        if (i7 < fVar.f17509r.size()) {
            if (i6 != -1) {
                f.d dVar = (f.d) fVar.f17509r.get(i7);
                if (i6 == 0) {
                    arrayList.add(dVar);
                } else if (i6 < dVar.f17520m.size()) {
                    List list = dVar.f17520m;
                    arrayList.addAll(list.subList(i6, list.size()));
                }
                i7++;
            }
            List list2 = fVar.f17509r;
            arrayList.addAll(list2.subList(i7, list2.size()));
            i6 = 0;
        }
        if (fVar.f17505n != -9223372036854775807L) {
            int i8 = i6 != -1 ? i6 : 0;
            if (i8 < fVar.f17510s.size()) {
                List list3 = fVar.f17510s;
                arrayList.addAll(list3.subList(i8, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public x1.n[] a(j jVar, long j6) {
        int b6 = jVar == null ? -1 : this.f17254h.b(jVar.f20433d);
        int length = this.f17264r.length();
        x1.n[] nVarArr = new x1.n[length];
        for (int i6 = 0; i6 < length; i6++) {
            int k6 = this.f17264r.k(i6);
            Uri uri = this.f17251e[k6];
            if (this.f17253g.a(uri)) {
                n1.f n6 = this.f17253g.n(uri, false);
                AbstractC1119a.e(n6);
                long e6 = n6.f17499h - this.f17253g.e();
                Pair g6 = g(jVar, k6 != b6, n6, e6, j6);
                nVarArr[i6] = new c(n6.f17558a, e6, j(n6, ((Long) g6.first).longValue(), ((Integer) g6.second).intValue()));
            } else {
                nVarArr[i6] = x1.n.f20482a;
            }
        }
        return nVarArr;
    }

    public final void b() {
        this.f17253g.c(this.f17251e[this.f17264r.m()]);
    }

    public long c(long j6, N0 n02) {
        int f6 = this.f17264r.f();
        Uri[] uriArr = this.f17251e;
        n1.f n6 = (f6 >= uriArr.length || f6 == -1) ? null : this.f17253g.n(uriArr[this.f17264r.m()], true);
        if (n6 == null || n6.f17509r.isEmpty() || !n6.f17560c) {
            return j6;
        }
        long e6 = n6.f17499h - this.f17253g.e();
        long j7 = j6 - e6;
        int f7 = AbstractC1117K.f(n6.f17509r, Long.valueOf(j7), true, true);
        long j8 = ((f.d) n6.f17509r.get(f7)).f17525e;
        return n02.a(j7, j8, f7 != n6.f17509r.size() - 1 ? ((f.d) n6.f17509r.get(f7 + 1)).f17525e : j8) + e6;
    }

    public int d(j jVar) {
        if (jVar.f17301o == -1) {
            return 1;
        }
        n1.f fVar = (n1.f) AbstractC1119a.e(this.f17253g.n(this.f17251e[this.f17254h.b(jVar.f20433d)], false));
        int i6 = (int) (jVar.f20481j - fVar.f17502k);
        if (i6 < 0) {
            return 1;
        }
        List list = i6 < fVar.f17509r.size() ? ((f.d) fVar.f17509r.get(i6)).f17520m : fVar.f17510s;
        if (jVar.f17301o >= list.size()) {
            return 2;
        }
        f.b bVar = (f.b) list.get(jVar.f17301o);
        if (bVar.f17515m) {
            return 0;
        }
        return AbstractC1117K.c(Uri.parse(AbstractC1113G.e(fVar.f17558a, bVar.f17521a)), jVar.f20431b.f13820a) ? 1 : 2;
    }

    public void f(C1343l0 c1343l0, long j6, List list, boolean z6, b bVar) {
        int i6;
        j jVar = list.isEmpty() ? null : (j) D.d(list);
        int b6 = jVar == null ? -1 : this.f17254h.b(jVar.f20433d);
        long j7 = c1343l0.f14722a;
        long j8 = j6 - j7;
        long u6 = u(j7);
        if (jVar != null && !this.f17263q) {
            long d6 = jVar.d();
            j8 = Math.max(0L, j8 - d6);
            if (u6 != -9223372036854775807L) {
                u6 = Math.max(0L, u6 - d6);
            }
        }
        this.f17264r.a(j7, j8, u6, list, a(jVar, j6));
        int m6 = this.f17264r.m();
        boolean z7 = b6 != m6;
        Uri uri = this.f17251e[m6];
        if (!this.f17253g.a(uri)) {
            bVar.f17271c = uri;
            this.f17266t &= uri.equals(this.f17262p);
            this.f17262p = uri;
            return;
        }
        n1.f n6 = this.f17253g.n(uri, true);
        AbstractC1119a.e(n6);
        this.f17263q = n6.f17560c;
        y(n6);
        long e6 = n6.f17499h - this.f17253g.e();
        Pair g6 = g(jVar, z7, n6, e6, j6);
        long longValue = ((Long) g6.first).longValue();
        int intValue = ((Integer) g6.second).intValue();
        int i7 = b6;
        if (longValue >= n6.f17502k || jVar == null || !z7) {
            i6 = i7;
        } else {
            uri = this.f17251e[i7];
            n6 = this.f17253g.n(uri, true);
            AbstractC1119a.e(n6);
            e6 = n6.f17499h - this.f17253g.e();
            Pair g7 = g(jVar, false, n6, e6, j6);
            longValue = ((Long) g7.first).longValue();
            intValue = ((Integer) g7.second).intValue();
            m6 = i7;
            i6 = m6;
        }
        int i8 = intValue;
        n1.f fVar = n6;
        Uri uri2 = uri;
        long j9 = e6;
        if (m6 != i6 && i6 != -1) {
            this.f17253g.c(this.f17251e[i6]);
        }
        if (longValue < fVar.f17502k) {
            this.f17261o = new C2217b();
            return;
        }
        e h6 = h(fVar, longValue, i8);
        if (h6 == null) {
            if (!fVar.f17506o) {
                bVar.f17271c = uri2;
                this.f17266t &= uri2.equals(this.f17262p);
                this.f17262p = uri2;
                return;
            } else {
                if (z6 || fVar.f17509r.isEmpty()) {
                    bVar.f17270b = true;
                    return;
                }
                h6 = new e((f.e) D.d(fVar.f17509r), (fVar.f17502k + fVar.f17509r.size()) - 1, -1);
            }
        }
        e eVar = h6;
        this.f17266t = false;
        this.f17262p = null;
        this.f17267u = SystemClock.elapsedRealtime();
        Uri e7 = e(fVar, eVar.f17276a.f17522b);
        AbstractC2261e n7 = n(e7, m6, true, null);
        bVar.f17269a = n7;
        if (n7 != null) {
            return;
        }
        Uri e8 = e(fVar, eVar.f17276a);
        AbstractC2261e n8 = n(e8, m6, false, null);
        bVar.f17269a = n8;
        if (n8 != null) {
            return;
        }
        boolean w6 = j.w(jVar, uri2, fVar, eVar, j9);
        if (w6 && eVar.f17279d) {
            return;
        }
        bVar.f17269a = j.j(this.f17247a, this.f17248b, this.f17252f[m6], j9, fVar, eVar, uri2, this.f17255i, this.f17264r.o(), this.f17264r.r(), this.f17259m, this.f17250d, this.f17258l, jVar, this.f17256j.a(e8), this.f17256j.a(e7), w6, this.f17257k, null);
    }

    public final Pair g(j jVar, boolean z6, n1.f fVar, long j6, long j7) {
        if (jVar != null && !z6) {
            if (!jVar.h()) {
                return new Pair(Long.valueOf(jVar.f20481j), Integer.valueOf(jVar.f17301o));
            }
            Long valueOf = Long.valueOf(jVar.f17301o == -1 ? jVar.g() : jVar.f20481j);
            int i6 = jVar.f17301o;
            return new Pair(valueOf, Integer.valueOf(i6 != -1 ? i6 + 1 : -1));
        }
        long j8 = fVar.f17512u + j6;
        if (jVar != null && !this.f17263q) {
            j7 = jVar.f20436g;
        }
        if (!fVar.f17506o && j7 >= j8) {
            return new Pair(Long.valueOf(fVar.f17502k + fVar.f17509r.size()), -1);
        }
        long j9 = j7 - j6;
        int i7 = 0;
        int f6 = AbstractC1117K.f(fVar.f17509r, Long.valueOf(j9), true, !this.f17253g.g() || jVar == null);
        long j10 = f6 + fVar.f17502k;
        if (f6 >= 0) {
            f.d dVar = (f.d) fVar.f17509r.get(f6);
            List list = j9 < dVar.f17525e + dVar.f17523c ? dVar.f17520m : fVar.f17510s;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                }
                f.b bVar = (f.b) list.get(i7);
                if (j9 >= bVar.f17525e + bVar.f17523c) {
                    i7++;
                } else if (bVar.f17514l) {
                    j10 += list == fVar.f17510s ? 1L : 0L;
                    r1 = i7;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(r1));
    }

    public int i(long j6, List list) {
        return (this.f17261o != null || this.f17264r.length() < 2) ? list.size() : this.f17264r.l(j6, list);
    }

    public H k() {
        return this.f17254h;
    }

    public x l() {
        return this.f17264r;
    }

    public boolean m() {
        return this.f17263q;
    }

    public final AbstractC2261e n(Uri uri, int i6, boolean z6, f.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] c6 = this.f17256j.c(uri);
        if (c6 != null) {
            this.f17256j.b(uri, c6);
            return null;
        }
        return new a(this.f17249c, new C1252j.b().i(uri).b(1).a(), this.f17252f[i6], this.f17264r.o(), this.f17264r.r(), this.f17260n);
    }

    public boolean o(AbstractC2261e abstractC2261e, long j6) {
        x xVar = this.f17264r;
        return xVar.p(xVar.u(this.f17254h.b(abstractC2261e.f20433d)), j6);
    }

    public void p() {
        IOException iOException = this.f17261o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f17262p;
        if (uri == null || !this.f17266t) {
            return;
        }
        this.f17253g.d(uri);
    }

    public boolean q(Uri uri) {
        return AbstractC1117K.s(this.f17251e, uri);
    }

    public void r(AbstractC2261e abstractC2261e) {
        if (abstractC2261e instanceof a) {
            a aVar = (a) abstractC2261e;
            this.f17260n = aVar.h();
            this.f17256j.b(aVar.f20431b.f13820a, (byte[]) AbstractC1119a.e(aVar.j()));
        }
    }

    public boolean s(Uri uri, long j6) {
        int u6;
        int i6 = 0;
        while (true) {
            Uri[] uriArr = this.f17251e;
            if (i6 >= uriArr.length) {
                i6 = -1;
                break;
            }
            if (uriArr[i6].equals(uri)) {
                break;
            }
            i6++;
        }
        if (i6 == -1 || (u6 = this.f17264r.u(i6)) == -1) {
            return true;
        }
        this.f17266t |= uri.equals(this.f17262p);
        return j6 == -9223372036854775807L || (this.f17264r.p(u6, j6) && this.f17253g.i(uri, j6));
    }

    public void t() {
        b();
        this.f17261o = null;
    }

    public final long u(long j6) {
        long j7 = this.f17265s;
        if (j7 != -9223372036854775807L) {
            return j7 - j6;
        }
        return -9223372036854775807L;
    }

    public void v(boolean z6) {
        this.f17259m = z6;
    }

    public void w(x xVar) {
        b();
        this.f17264r = xVar;
    }

    public boolean x(long j6, AbstractC2261e abstractC2261e, List list) {
        if (this.f17261o != null) {
            return false;
        }
        return this.f17264r.d(j6, abstractC2261e, list);
    }

    public final void y(n1.f fVar) {
        this.f17265s = fVar.f17506o ? -9223372036854775807L : fVar.e() - this.f17253g.e();
    }
}
