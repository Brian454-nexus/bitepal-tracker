package n1;

import A1.k;
import A1.l;
import A1.n;
import Z0.z;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1261s;
import e1.InterfaceC1248f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import n1.C1813c;
import n1.f;
import n1.g;
import n1.i;
import n1.k;
import w1.C2210B;
import w1.C2239y;
import w1.K;
import z6.D;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1813c implements k, l.b {

    /* renamed from: p, reason: collision with root package name */
    public static final k.a f17462p = new k.a() { // from class: n1.b
        @Override // n1.k.a
        public final k a(m1.g gVar, A1.k kVar, j jVar) {
            return new C1813c(gVar, kVar, jVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final m1.g f17463a;

    /* renamed from: b, reason: collision with root package name */
    public final j f17464b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.k f17465c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f17466d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f17467e;

    /* renamed from: f, reason: collision with root package name */
    public final double f17468f;

    /* renamed from: g, reason: collision with root package name */
    public K.a f17469g;

    /* renamed from: h, reason: collision with root package name */
    public l f17470h;

    /* renamed from: i, reason: collision with root package name */
    public Handler f17471i;

    /* renamed from: j, reason: collision with root package name */
    public k.e f17472j;

    /* renamed from: k, reason: collision with root package name */
    public g f17473k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f17474l;

    /* renamed from: m, reason: collision with root package name */
    public f f17475m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17476n;

    /* renamed from: o, reason: collision with root package name */
    public long f17477o;

    /* renamed from: n1.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements k.b {
        public b() {
        }

        @Override // n1.k.b
        public void a() {
            C1813c.this.f17467e.remove(this);
        }

        @Override // n1.k.b
        public boolean c(Uri uri, k.c cVar, boolean z6) {
            C0221c c0221c;
            if (C1813c.this.f17475m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((g) AbstractC1117K.i(C1813c.this.f17473k)).f17539e;
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    C0221c c0221c2 = (C0221c) C1813c.this.f17466d.get(((g.b) list.get(i7)).f17552a);
                    if (c0221c2 != null && elapsedRealtime < c0221c2.f17486h) {
                        i6++;
                    }
                }
                k.b c6 = C1813c.this.f17465c.c(new k.a(1, 0, C1813c.this.f17473k.f17539e.size(), i6), cVar);
                if (c6 != null && c6.f131a == 2 && (c0221c = (C0221c) C1813c.this.f17466d.get(uri)) != null) {
                    c0221c.h(c6.f132b);
                }
            }
            return false;
        }
    }

    /* renamed from: n1.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0221c implements l.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17479a;

        /* renamed from: b, reason: collision with root package name */
        public final l f17480b = new l("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1248f f17481c;

        /* renamed from: d, reason: collision with root package name */
        public f f17482d;

        /* renamed from: e, reason: collision with root package name */
        public long f17483e;

        /* renamed from: f, reason: collision with root package name */
        public long f17484f;

        /* renamed from: g, reason: collision with root package name */
        public long f17485g;

        /* renamed from: h, reason: collision with root package name */
        public long f17486h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f17487i;

        /* renamed from: j, reason: collision with root package name */
        public IOException f17488j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f17489k;

        public C0221c(Uri uri) {
            this.f17479a = uri;
            this.f17481c = C1813c.this.f17463a.a(4);
        }

        public static /* synthetic */ void a(C0221c c0221c, Uri uri) {
            c0221c.f17487i = false;
            c0221c.o(uri);
        }

        public final boolean h(long j6) {
            this.f17486h = SystemClock.elapsedRealtime() + j6;
            return this.f17479a.equals(C1813c.this.f17474l) && !C1813c.this.N();
        }

        public final Uri i() {
            f fVar = this.f17482d;
            if (fVar != null) {
                f.C0222f c0222f = fVar.f17513v;
                if (c0222f.f17532a != -9223372036854775807L || c0222f.f17536e) {
                    Uri.Builder buildUpon = this.f17479a.buildUpon();
                    f fVar2 = this.f17482d;
                    if (fVar2.f17513v.f17536e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f17502k + fVar2.f17509r.size()));
                        f fVar3 = this.f17482d;
                        if (fVar3.f17505n != -9223372036854775807L) {
                            List list = fVar3.f17510s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.b) D.d(list)).f17515m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.C0222f c0222f2 = this.f17482d.f17513v;
                    if (c0222f2.f17532a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", c0222f2.f17533b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f17479a;
        }

        public f k() {
            return this.f17482d;
        }

        public boolean l() {
            return this.f17489k;
        }

        public boolean m() {
            int i6;
            if (this.f17482d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, AbstractC1117K.k1(this.f17482d.f17512u));
            f fVar = this.f17482d;
            return fVar.f17506o || (i6 = fVar.f17495d) == 2 || i6 == 1 || this.f17483e + max > elapsedRealtime;
        }

        public void n(boolean z6) {
            p(z6 ? i() : this.f17479a);
        }

        public final void o(Uri uri) {
            n nVar = new n(this.f17481c, uri, 4, C1813c.this.f17464b.a(C1813c.this.f17473k, this.f17482d));
            C1813c.this.f17469g.s(new C2239y(nVar.f157a, nVar.f158b, this.f17480b.n(nVar, this, C1813c.this.f17465c.d(nVar.f159c))), nVar.f159c);
        }

        public final void p(final Uri uri) {
            this.f17486h = 0L;
            if (this.f17487i || this.f17480b.j() || this.f17480b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f17485g) {
                o(uri);
            } else {
                this.f17487i = true;
                C1813c.this.f17471i.postDelayed(new Runnable() { // from class: n1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1813c.C0221c.a(C1813c.C0221c.this, uri);
                    }
                }, this.f17485g - elapsedRealtime);
            }
        }

        public void r() {
            this.f17480b.a();
            IOException iOException = this.f17488j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // A1.l.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void u(n nVar, long j6, long j7, boolean z6) {
            C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
            C1813c.this.f17465c.b(nVar.f157a);
            C1813c.this.f17469g.j(c2239y, 4);
        }

        @Override // A1.l.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void j(n nVar, long j6, long j7) {
            h hVar = (h) nVar.e();
            C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
            if (hVar instanceof f) {
                w((f) hVar, c2239y);
                C1813c.this.f17469g.m(c2239y, 4);
            } else {
                this.f17488j = z.c("Loaded playlist has unexpected type.", null);
                C1813c.this.f17469g.q(c2239y, 4, this.f17488j, true);
            }
            C1813c.this.f17465c.b(nVar.f157a);
        }

        @Override // A1.l.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public l.c q(n nVar, long j6, long j7, IOException iOException, int i6) {
            l.c cVar;
            C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
            boolean z6 = iOException instanceof i.a;
            if ((nVar.f().getQueryParameter("_HLS_msn") != null) || z6) {
                int i7 = iOException instanceof C1261s ? ((C1261s) iOException).f13888d : IntCompanionObject.MAX_VALUE;
                if (z6 || i7 == 400 || i7 == 503) {
                    this.f17485g = SystemClock.elapsedRealtime();
                    n(false);
                    ((K.a) AbstractC1117K.i(C1813c.this.f17469g)).q(c2239y, nVar.f159c, iOException, true);
                    return l.f139f;
                }
            }
            k.c cVar2 = new k.c(c2239y, new C2210B(nVar.f159c), iOException, i6);
            if (C1813c.this.P(this.f17479a, cVar2, false)) {
                long a6 = C1813c.this.f17465c.a(cVar2);
                cVar = a6 != -9223372036854775807L ? l.h(false, a6) : l.f140g;
            } else {
                cVar = l.f139f;
            }
            boolean c6 = cVar.c();
            C1813c.this.f17469g.q(c2239y, nVar.f159c, iOException, !c6);
            if (!c6) {
                C1813c.this.f17465c.b(nVar.f157a);
            }
            return cVar;
        }

        public final void w(f fVar, C2239y c2239y) {
            boolean z6;
            f fVar2 = this.f17482d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f17483e = elapsedRealtime;
            f H6 = C1813c.this.H(fVar2, fVar);
            this.f17482d = H6;
            IOException iOException = null;
            if (H6 != fVar2) {
                this.f17488j = null;
                this.f17484f = elapsedRealtime;
                C1813c.this.T(this.f17479a, H6);
            } else if (!H6.f17506o) {
                if (fVar.f17502k + fVar.f17509r.size() < this.f17482d.f17502k) {
                    iOException = new k.c(this.f17479a);
                    z6 = true;
                } else {
                    z6 = false;
                    if (elapsedRealtime - this.f17484f > AbstractC1117K.k1(r13.f17504m) * C1813c.this.f17468f) {
                        iOException = new k.d(this.f17479a);
                    }
                }
                if (iOException != null) {
                    this.f17488j = iOException;
                    C1813c.this.P(this.f17479a, new k.c(c2239y, new C2210B(4), iOException, 1), z6);
                }
            }
            f fVar3 = this.f17482d;
            this.f17485g = (elapsedRealtime + AbstractC1117K.k1(!fVar3.f17513v.f17536e ? fVar3 != fVar2 ? fVar3.f17504m : fVar3.f17504m / 2 : 0L)) - c2239y.f20130f;
            if (this.f17482d.f17506o) {
                return;
            }
            if (this.f17479a.equals(C1813c.this.f17474l) || this.f17489k) {
                p(i());
            }
        }

        public void x() {
            this.f17480b.l();
        }

        public void y(boolean z6) {
            this.f17489k = z6;
        }
    }

    public C1813c(m1.g gVar, A1.k kVar, j jVar) {
        this(gVar, kVar, jVar, 3.5d);
    }

    public static f.d G(f fVar, f fVar2) {
        int i6 = (int) (fVar2.f17502k - fVar.f17502k);
        List list = fVar.f17509r;
        if (i6 < list.size()) {
            return (f.d) list.get(i6);
        }
        return null;
    }

    public final void F(List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Uri uri = (Uri) list.get(i6);
            this.f17466d.put(uri, new C0221c(uri));
        }
    }

    public final f H(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f17506o ? fVar.d() : fVar : fVar2.c(J(fVar, fVar2), I(fVar, fVar2));
    }

    public final int I(f fVar, f fVar2) {
        f.d G6;
        if (fVar2.f17500i) {
            return fVar2.f17501j;
        }
        f fVar3 = this.f17475m;
        return (fVar == null || (G6 = G(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.f17501j : 0 : (fVar.f17501j + G6.f17524d) - ((f.d) fVar2.f17509r.get(0)).f17524d;
    }

    public final long J(f fVar, f fVar2) {
        if (fVar2.f17507p) {
            return fVar2.f17499h;
        }
        f fVar3 = this.f17475m;
        long j6 = fVar3 != null ? fVar3.f17499h : 0L;
        if (fVar != null) {
            int size = fVar.f17509r.size();
            f.d G6 = G(fVar, fVar2);
            if (G6 != null) {
                return fVar.f17499h + G6.f17525e;
            }
            if (size == fVar2.f17502k - fVar.f17502k) {
                return fVar.e();
            }
        }
        return j6;
    }

    public final Uri K(Uri uri) {
        f.c cVar;
        f fVar = this.f17475m;
        if (fVar == null || !fVar.f17513v.f17536e || (cVar = (f.c) fVar.f17511t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f17517b));
        int i6 = cVar.f17518c;
        if (i6 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i6));
        }
        return buildUpon.build();
    }

    public final boolean L(Uri uri) {
        List list = this.f17473k.f17539e;
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (uri.equals(((g.b) list.get(i6)).f17552a)) {
                return true;
            }
        }
        return false;
    }

    public final void M(Uri uri) {
        C0221c c0221c = (C0221c) this.f17466d.get(uri);
        f k6 = c0221c.k();
        if (c0221c.l()) {
            return;
        }
        c0221c.y(true);
        if (k6 == null || k6.f17506o) {
            return;
        }
        c0221c.n(true);
    }

    public final boolean N() {
        List list = this.f17473k.f17539e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i6 = 0; i6 < size; i6++) {
            C0221c c0221c = (C0221c) AbstractC1119a.e((C0221c) this.f17466d.get(((g.b) list.get(i6)).f17552a));
            if (elapsedRealtime > c0221c.f17486h) {
                Uri uri = c0221c.f17479a;
                this.f17474l = uri;
                c0221c.p(K(uri));
                return true;
            }
        }
        return false;
    }

    public final void O(Uri uri) {
        if (uri.equals(this.f17474l) || !L(uri)) {
            return;
        }
        f fVar = this.f17475m;
        if (fVar == null || !fVar.f17506o) {
            this.f17474l = uri;
            C0221c c0221c = (C0221c) this.f17466d.get(uri);
            f fVar2 = c0221c.f17482d;
            if (fVar2 == null || !fVar2.f17506o) {
                c0221c.p(K(uri));
            } else {
                this.f17475m = fVar2;
                this.f17472j.k(fVar2);
            }
        }
    }

    public final boolean P(Uri uri, k.c cVar, boolean z6) {
        Iterator it = this.f17467e.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= !((k.b) it.next()).c(uri, cVar, z6);
        }
        return z7;
    }

    @Override // A1.l.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void u(n nVar, long j6, long j7, boolean z6) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f17465c.b(nVar.f157a);
        this.f17469g.j(c2239y, 4);
    }

    @Override // A1.l.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void j(n nVar, long j6, long j7) {
        h hVar = (h) nVar.e();
        boolean z6 = hVar instanceof f;
        g e6 = z6 ? g.e(hVar.f17558a) : (g) hVar;
        this.f17473k = e6;
        this.f17474l = ((g.b) e6.f17539e.get(0)).f17552a;
        this.f17467e.add(new b());
        F(e6.f17538d);
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        C0221c c0221c = (C0221c) this.f17466d.get(this.f17474l);
        if (z6) {
            c0221c.w((f) hVar, c2239y);
        } else {
            c0221c.n(false);
        }
        this.f17465c.b(nVar.f157a);
        this.f17469g.m(c2239y, 4);
    }

    @Override // A1.l.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public l.c q(n nVar, long j6, long j7, IOException iOException, int i6) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        long a6 = this.f17465c.a(new k.c(c2239y, new C2210B(nVar.f159c), iOException, i6));
        boolean z6 = a6 == -9223372036854775807L;
        this.f17469g.q(c2239y, nVar.f159c, iOException, z6);
        if (z6) {
            this.f17465c.b(nVar.f157a);
        }
        return z6 ? l.f140g : l.h(false, a6);
    }

    public final void T(Uri uri, f fVar) {
        if (uri.equals(this.f17474l)) {
            if (this.f17475m == null) {
                this.f17476n = !fVar.f17506o;
                this.f17477o = fVar.f17499h;
            }
            this.f17475m = fVar;
            this.f17472j.k(fVar);
        }
        Iterator it = this.f17467e.iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).a();
        }
    }

    @Override // n1.k
    public boolean a(Uri uri) {
        return ((C0221c) this.f17466d.get(uri)).m();
    }

    @Override // n1.k
    public void b(k.b bVar) {
        this.f17467e.remove(bVar);
    }

    @Override // n1.k
    public void c(Uri uri) {
        C0221c c0221c = (C0221c) this.f17466d.get(uri);
        if (c0221c != null) {
            c0221c.y(false);
        }
    }

    @Override // n1.k
    public void d(Uri uri) {
        ((C0221c) this.f17466d.get(uri)).r();
    }

    @Override // n1.k
    public long e() {
        return this.f17477o;
    }

    @Override // n1.k
    public void f(Uri uri, K.a aVar, k.e eVar) {
        this.f17471i = AbstractC1117K.A();
        this.f17469g = aVar;
        this.f17472j = eVar;
        n nVar = new n(this.f17463a.a(4), uri, 4, this.f17464b.b());
        AbstractC1119a.g(this.f17470h == null);
        l lVar = new l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f17470h = lVar;
        aVar.s(new C2239y(nVar.f157a, nVar.f158b, lVar.n(nVar, this, this.f17465c.d(nVar.f159c))), nVar.f159c);
    }

    @Override // n1.k
    public boolean g() {
        return this.f17476n;
    }

    @Override // n1.k
    public g h() {
        return this.f17473k;
    }

    @Override // n1.k
    public boolean i(Uri uri, long j6) {
        if (((C0221c) this.f17466d.get(uri)) != null) {
            return !r2.h(j6);
        }
        return false;
    }

    @Override // n1.k
    public void k(k.b bVar) {
        AbstractC1119a.e(bVar);
        this.f17467e.add(bVar);
    }

    @Override // n1.k
    public void l() {
        l lVar = this.f17470h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = this.f17474l;
        if (uri != null) {
            d(uri);
        }
    }

    @Override // n1.k
    public void m(Uri uri) {
        ((C0221c) this.f17466d.get(uri)).n(true);
    }

    @Override // n1.k
    public f n(Uri uri, boolean z6) {
        f k6 = ((C0221c) this.f17466d.get(uri)).k();
        if (k6 != null && z6) {
            O(uri);
            M(uri);
        }
        return k6;
    }

    @Override // n1.k
    public void stop() {
        this.f17474l = null;
        this.f17475m = null;
        this.f17473k = null;
        this.f17477o = -9223372036854775807L;
        this.f17470h.l();
        this.f17470h = null;
        Iterator it = this.f17466d.values().iterator();
        while (it.hasNext()) {
            ((C0221c) it.next()).x();
        }
        this.f17471i.removeCallbacksAndMessages(null);
        this.f17471i = null;
        this.f17466d.clear();
    }

    public C1813c(m1.g gVar, A1.k kVar, j jVar, double d6) {
        this.f17463a = gVar;
        this.f17464b = jVar;
        this.f17465c = kVar;
        this.f17468f = d6;
        this.f17467e = new CopyOnWriteArrayList();
        this.f17466d = new HashMap();
        this.f17477o = -9223372036854775807L;
    }
}
