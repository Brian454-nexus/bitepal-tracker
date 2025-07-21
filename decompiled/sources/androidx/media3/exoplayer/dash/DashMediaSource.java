package androidx.media3.exoplayer.dash;

import A1.j;
import A1.k;
import A1.l;
import A1.m;
import A1.n;
import B1.a;
import Z0.G;
import Z0.u;
import Z0.v;
import Z0.z;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import j$.util.DesugarTimeZone;
import j1.C1641b;
import j1.C1642c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.C1657a;
import k1.C1659c;
import k1.C1660d;
import k1.o;
import kotlin.jvm.internal.LongCompanionObject;
import l1.C1742l;
import l1.w;
import r1.C2022b;
import w1.AbstractC2216a;
import w1.C2210B;
import w1.C2226k;
import w1.C2239y;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import w1.InterfaceC2225j;
import w1.K;
import w1.L;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DashMediaSource extends AbstractC2216a {

    /* renamed from: A, reason: collision with root package name */
    public l f9118A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1266x f9119B;

    /* renamed from: C, reason: collision with root package name */
    public IOException f9120C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f9121D;

    /* renamed from: E, reason: collision with root package name */
    public u.g f9122E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f9123F;

    /* renamed from: G, reason: collision with root package name */
    public Uri f9124G;

    /* renamed from: H, reason: collision with root package name */
    public C1659c f9125H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9126I;

    /* renamed from: J, reason: collision with root package name */
    public long f9127J;

    /* renamed from: K, reason: collision with root package name */
    public long f9128K;

    /* renamed from: L, reason: collision with root package name */
    public long f9129L;

    /* renamed from: M, reason: collision with root package name */
    public int f9130M;

    /* renamed from: V, reason: collision with root package name */
    public long f9131V;

    /* renamed from: W, reason: collision with root package name */
    public int f9132W;

    /* renamed from: X, reason: collision with root package name */
    public u f9133X;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9134h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1248f.a f9135i;

    /* renamed from: j, reason: collision with root package name */
    public final a.InterfaceC0136a f9136j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2225j f9137k;

    /* renamed from: l, reason: collision with root package name */
    public final l1.u f9138l;

    /* renamed from: m, reason: collision with root package name */
    public final k f9139m;

    /* renamed from: n, reason: collision with root package name */
    public final C1641b f9140n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9141o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9142p;

    /* renamed from: q, reason: collision with root package name */
    public final K.a f9143q;

    /* renamed from: r, reason: collision with root package name */
    public final n.a f9144r;

    /* renamed from: s, reason: collision with root package name */
    public final e f9145s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9146t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f9147u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f9148v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f9149w;

    /* renamed from: x, reason: collision with root package name */
    public final d.b f9150x;

    /* renamed from: y, reason: collision with root package name */
    public final m f9151y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1248f f9152z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Factory implements L {

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f9153k = 0;

        /* renamed from: c, reason: collision with root package name */
        public final a.InterfaceC0136a f9154c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC1248f.a f9155d;

        /* renamed from: e, reason: collision with root package name */
        public w f9156e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC2225j f9157f;

        /* renamed from: g, reason: collision with root package name */
        public k f9158g;

        /* renamed from: h, reason: collision with root package name */
        public long f9159h;

        /* renamed from: i, reason: collision with root package name */
        public long f9160i;

        /* renamed from: j, reason: collision with root package name */
        public n.a f9161j;

        public Factory(InterfaceC1248f.a aVar) {
            this(new c.a(aVar), aVar);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public DashMediaSource d(u uVar) {
            AbstractC1119a.e(uVar.f7064b);
            n.a aVar = this.f9161j;
            if (aVar == null) {
                aVar = new C1660d();
            }
            List list = uVar.f7064b.f7159d;
            return new DashMediaSource(uVar, null, this.f9155d, !list.isEmpty() ? new C2022b(aVar, list) : aVar, this.f9154c, this.f9157f, null, this.f9156e.a(uVar), this.f9158g, this.f9159h, this.f9160i, null);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z6) {
            this.f9154c.b(z6);
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory e(w wVar) {
            this.f9156e = (w) AbstractC1119a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(k kVar) {
            this.f9158g = (k) AbstractC1119a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f9154c.a((s.a) AbstractC1119a.e(aVar));
            return this;
        }

        public Factory(a.InterfaceC0136a interfaceC0136a, InterfaceC1248f.a aVar) {
            this.f9154c = (a.InterfaceC0136a) AbstractC1119a.e(interfaceC0136a);
            this.f9155d = aVar;
            this.f9156e = new C1742l();
            this.f9158g = new j();
            this.f9159h = 30000L;
            this.f9160i = 5000000L;
            this.f9157f = new C2226k();
            b(true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // B1.a.b
        public void a(IOException iOException) {
            DashMediaSource.this.Z(iOException);
        }

        @Override // B1.a.b
        public void b() {
            DashMediaSource.this.a0(B1.a.h());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends G {

        /* renamed from: e, reason: collision with root package name */
        public final long f9163e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9164f;

        /* renamed from: g, reason: collision with root package name */
        public final long f9165g;

        /* renamed from: h, reason: collision with root package name */
        public final int f9166h;

        /* renamed from: i, reason: collision with root package name */
        public final long f9167i;

        /* renamed from: j, reason: collision with root package name */
        public final long f9168j;

        /* renamed from: k, reason: collision with root package name */
        public final long f9169k;

        /* renamed from: l, reason: collision with root package name */
        public final C1659c f9170l;

        /* renamed from: m, reason: collision with root package name */
        public final u f9171m;

        /* renamed from: n, reason: collision with root package name */
        public final u.g f9172n;

        public b(long j6, long j7, long j8, int i6, long j9, long j10, long j11, C1659c c1659c, u uVar, u.g gVar) {
            AbstractC1119a.g(c1659c.f16319d == (gVar != null));
            this.f9163e = j6;
            this.f9164f = j7;
            this.f9165g = j8;
            this.f9166h = i6;
            this.f9167i = j9;
            this.f9168j = j10;
            this.f9169k = j11;
            this.f9170l = c1659c;
            this.f9171m = uVar;
            this.f9172n = gVar;
        }

        public static boolean t(C1659c c1659c) {
            return c1659c.f16319d && c1659c.f16320e != -9223372036854775807L && c1659c.f16317b == -9223372036854775807L;
        }

        @Override // Z0.G
        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f9166h) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        @Override // Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            AbstractC1119a.c(i6, 0, i());
            return bVar.s(z6 ? this.f9170l.d(i6).f16351a : null, z6 ? Integer.valueOf(this.f9166h + i6) : null, 0, this.f9170l.g(i6), AbstractC1117K.J0(this.f9170l.d(i6).f16352b - this.f9170l.d(0).f16352b) - this.f9167i);
        }

        @Override // Z0.G
        public int i() {
            return this.f9170l.e();
        }

        @Override // Z0.G
        public Object m(int i6) {
            AbstractC1119a.c(i6, 0, i());
            return Integer.valueOf(this.f9166h + i6);
        }

        @Override // Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            AbstractC1119a.c(i6, 0, 1);
            long s6 = s(j6);
            Object obj = G.c.f6674q;
            u uVar = this.f9171m;
            C1659c c1659c = this.f9170l;
            return cVar.g(obj, uVar, c1659c, this.f9163e, this.f9164f, this.f9165g, true, t(c1659c), this.f9172n, s6, this.f9168j, 0, i() - 1, this.f9167i);
        }

        @Override // Z0.G
        public int p() {
            return 1;
        }

        public final long s(long j6) {
            j1.g l6;
            long j7 = this.f9169k;
            if (!t(this.f9170l)) {
                return j7;
            }
            if (j6 > 0) {
                j7 += j6;
                if (j7 > this.f9168j) {
                    return -9223372036854775807L;
                }
            }
            long j8 = this.f9167i + j7;
            long g6 = this.f9170l.g(0);
            int i6 = 0;
            while (i6 < this.f9170l.e() - 1 && j8 >= g6) {
                j8 -= g6;
                i6++;
                g6 = this.f9170l.g(i6);
            }
            k1.g d6 = this.f9170l.d(i6);
            int a6 = d6.a(2);
            return (a6 == -1 || (l6 = ((k1.j) ((C1657a) d6.f16353c.get(a6)).f16308c.get(0)).l()) == null || l6.i(g6) == 0) ? j7 : (j7 + l6.b(l6.f(j8, g6))) - j8;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements d.b {
        public c() {
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void a() {
            DashMediaSource.this.T();
        }

        @Override // androidx.media3.exoplayer.dash.d.b
        public void b(long j6) {
            DashMediaSource.this.S(j6);
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements n.a {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f9174a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // A1.n.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, y6.e.c)).readLine();
            try {
                Matcher matcher = f9174a.matcher(readLine);
                if (!matcher.matches()) {
                    throw z.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j6 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j6 * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e6) {
                throw z.c(null, e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e implements l.b {
        public e() {
        }

        @Override // A1.l.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void u(n nVar, long j6, long j7, boolean z6) {
            DashMediaSource.this.U(nVar, j6, j7);
        }

        @Override // A1.l.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(n nVar, long j6, long j7) {
            DashMediaSource.this.V(nVar, j6, j7);
        }

        @Override // A1.l.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l.c q(n nVar, long j6, long j7, IOException iOException, int i6) {
            return DashMediaSource.this.W(nVar, j6, j7, iOException, i6);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f implements m {
        public f() {
        }

        @Override // A1.m
        public void a() {
            DashMediaSource.this.f9118A.a();
            b();
        }

        public final void b() {
            if (DashMediaSource.this.f9120C != null) {
                throw DashMediaSource.this.f9120C;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class g implements l.b {
        public g() {
        }

        @Override // A1.l.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void u(n nVar, long j6, long j7, boolean z6) {
            DashMediaSource.this.U(nVar, j6, j7);
        }

        @Override // A1.l.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(n nVar, long j6, long j7) {
            DashMediaSource.this.X(nVar, j6, j7);
        }

        @Override // A1.l.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l.c q(n nVar, long j6, long j7, IOException iOException, int i6) {
            return DashMediaSource.this.Y(nVar, j6, j7, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h implements n.a {
        public h() {
        }

        @Override // A1.n.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(AbstractC1117K.Q0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        v.a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(u uVar, C1659c c1659c, InterfaceC1248f.a aVar, n.a aVar2, a.InterfaceC0136a interfaceC0136a, InterfaceC2225j interfaceC2225j, A1.e eVar, l1.u uVar2, k kVar, long j6, long j7, a aVar3) {
        this(uVar, c1659c, aVar, aVar2, interfaceC0136a, interfaceC2225j, eVar, uVar2, kVar, j6, j7);
    }

    public static long L(k1.g gVar, long j6, long j7) {
        long J02 = AbstractC1117K.J0(gVar.f16352b);
        boolean P5 = P(gVar);
        long j8 = LongCompanionObject.MAX_VALUE;
        for (int i6 = 0; i6 < gVar.f16353c.size(); i6++) {
            C1657a c1657a = (C1657a) gVar.f16353c.get(i6);
            List list = c1657a.f16308c;
            int i7 = c1657a.f16307b;
            boolean z6 = (i7 == 1 || i7 == 2) ? false : true;
            if ((!P5 || !z6) && !list.isEmpty()) {
                j1.g l6 = ((k1.j) list.get(0)).l();
                if (l6 == null) {
                    return J02 + j6;
                }
                long j9 = l6.j(j6, j7);
                if (j9 == 0) {
                    return J02;
                }
                long c6 = (l6.c(j6, j7) + j9) - 1;
                j8 = Math.min(j8, l6.a(c6, j6) + l6.b(c6) + J02);
            }
        }
        return j8;
    }

    public static long M(k1.g gVar, long j6, long j7) {
        long J02 = AbstractC1117K.J0(gVar.f16352b);
        boolean P5 = P(gVar);
        long j8 = J02;
        for (int i6 = 0; i6 < gVar.f16353c.size(); i6++) {
            C1657a c1657a = (C1657a) gVar.f16353c.get(i6);
            List list = c1657a.f16308c;
            int i7 = c1657a.f16307b;
            boolean z6 = (i7 == 1 || i7 == 2) ? false : true;
            if ((!P5 || !z6) && !list.isEmpty()) {
                j1.g l6 = ((k1.j) list.get(0)).l();
                if (l6 == null || l6.j(j6, j7) == 0) {
                    return J02;
                }
                j8 = Math.max(j8, l6.b(l6.c(j6, j7)) + J02);
            }
        }
        return j8;
    }

    public static long N(C1659c c1659c, long j6) {
        j1.g l6;
        int e6 = c1659c.e() - 1;
        k1.g d6 = c1659c.d(e6);
        long J02 = AbstractC1117K.J0(d6.f16352b);
        long g6 = c1659c.g(e6);
        long J03 = AbstractC1117K.J0(j6);
        long J04 = AbstractC1117K.J0(c1659c.f16316a);
        long J05 = AbstractC1117K.J0(5000L);
        for (int i6 = 0; i6 < d6.f16353c.size(); i6++) {
            List list = ((C1657a) d6.f16353c.get(i6)).f16308c;
            if (!list.isEmpty() && (l6 = ((k1.j) list.get(0)).l()) != null) {
                long d7 = ((J04 + J02) + l6.d(g6, J03)) - J03;
                if (d7 < J05 - 100000 || (d7 > J05 && d7 < J05 + 100000)) {
                    J05 = d7;
                }
            }
        }
        return B6.e.b(J05, 1000L, RoundingMode.CEILING);
    }

    public static boolean P(k1.g gVar) {
        for (int i6 = 0; i6 < gVar.f16353c.size(); i6++) {
            int i7 = ((C1657a) gVar.f16353c.get(i6)).f16307b;
            if (i7 == 1 || i7 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(k1.g gVar) {
        for (int i6 = 0; i6 < gVar.f16353c.size(); i6++) {
            j1.g l6 = ((k1.j) ((C1657a) gVar.f16353c.get(i6)).f16308c.get(0)).l();
            if (l6 == null || l6.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Uri uri;
        this.f9121D.removeCallbacks(this.f9148v);
        if (this.f9118A.i()) {
            return;
        }
        if (this.f9118A.j()) {
            this.f9126I = true;
            return;
        }
        synchronized (this.f9146t) {
            uri = this.f9123F;
        }
        this.f9126I = false;
        g0(new n(this.f9152z, uri, 4, this.f9144r), this.f9145s, this.f9139m.d(4));
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f9119B = interfaceC1266x;
        this.f9138l.a(Looper.myLooper(), A());
        this.f9138l.h();
        if (this.f9134h) {
            b0(false);
            return;
        }
        this.f9152z = this.f9135i.a();
        this.f9118A = new l("DashMediaSource");
        this.f9121D = AbstractC1117K.A();
        h0();
    }

    @Override // w1.AbstractC2216a
    public void E() {
        this.f9126I = false;
        this.f9152z = null;
        l lVar = this.f9118A;
        if (lVar != null) {
            lVar.l();
            this.f9118A = null;
        }
        this.f9127J = 0L;
        this.f9128K = 0L;
        this.f9123F = this.f9124G;
        this.f9120C = null;
        Handler handler = this.f9121D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9121D = null;
        }
        this.f9129L = -9223372036854775807L;
        this.f9130M = 0;
        this.f9131V = -9223372036854775807L;
        this.f9147u.clear();
        this.f9140n.i();
        this.f9138l.release();
    }

    public final long O() {
        return Math.min((this.f9130M - 1) * 1000, 5000);
    }

    public final void R() {
        B1.a.j(this.f9118A, new a());
    }

    public void S(long j6) {
        long j7 = this.f9131V;
        if (j7 == -9223372036854775807L || j7 < j6) {
            this.f9131V = j6;
        }
    }

    public void T() {
        this.f9121D.removeCallbacks(this.f9149w);
        h0();
    }

    public void U(n nVar, long j6, long j7) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f9139m.b(nVar.f157a);
        this.f9143q.j(c2239y, nVar.f159c);
    }

    public void V(n nVar, long j6, long j7) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f9139m.b(nVar.f157a);
        this.f9143q.m(c2239y, nVar.f159c);
        C1659c c1659c = (C1659c) nVar.e();
        C1659c c1659c2 = this.f9125H;
        int e6 = c1659c2 == null ? 0 : c1659c2.e();
        long j8 = c1659c.d(0).f16352b;
        int i6 = 0;
        while (i6 < e6 && this.f9125H.d(i6).f16352b < j8) {
            i6++;
        }
        if (c1659c.f16319d) {
            if (e6 - i6 > c1659c.e()) {
                AbstractC1133o.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j9 = this.f9131V;
                if (j9 == -9223372036854775807L || c1659c.f16323h * 1000 > j9) {
                    this.f9130M = 0;
                } else {
                    AbstractC1133o.h("DashMediaSource", "Loaded stale dynamic manifest: " + c1659c.f16323h + ", " + this.f9131V);
                }
            }
            int i7 = this.f9130M;
            this.f9130M = i7 + 1;
            if (i7 < this.f9139m.d(nVar.f159c)) {
                f0(O());
                return;
            } else {
                this.f9120C = new C1642c();
                return;
            }
        }
        this.f9125H = c1659c;
        this.f9126I = c1659c.f16319d & this.f9126I;
        this.f9127J = j6 - j7;
        this.f9128K = j6;
        this.f9132W += i6;
        synchronized (this.f9146t) {
            try {
                if (nVar.f158b.f13820a == this.f9123F) {
                    Uri uri = this.f9125H.f16326k;
                    if (uri == null) {
                        uri = nVar.f();
                    }
                    this.f9123F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1659c c1659c3 = this.f9125H;
        if (!c1659c3.f16319d || this.f9129L != -9223372036854775807L) {
            b0(true);
            return;
        }
        o oVar = c1659c3.f16324i;
        if (oVar != null) {
            c0(oVar);
        } else {
            R();
        }
    }

    public l.c W(n nVar, long j6, long j7, IOException iOException, int i6) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        long a6 = this.f9139m.a(new k.c(c2239y, new C2210B(nVar.f159c), iOException, i6));
        l.c h6 = a6 == -9223372036854775807L ? l.f140g : l.h(false, a6);
        boolean c6 = h6.c();
        this.f9143q.q(c2239y, nVar.f159c, iOException, !c6);
        if (!c6) {
            this.f9139m.b(nVar.f157a);
        }
        return h6;
    }

    public void X(n nVar, long j6, long j7) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f9139m.b(nVar.f157a);
        this.f9143q.m(c2239y, nVar.f159c);
        a0(((Long) nVar.e()).longValue() - j6);
    }

    public l.c Y(n nVar, long j6, long j7, IOException iOException) {
        this.f9143q.q(new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b()), nVar.f159c, iOException, true);
        this.f9139m.b(nVar.f157a);
        Z(iOException);
        return l.f139f;
    }

    public final void Z(IOException iOException) {
        AbstractC1133o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f9129L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        b0(true);
    }

    public final void a0(long j6) {
        this.f9129L = j6;
        b0(true);
    }

    public final void b0(boolean z6) {
        long j6;
        long j7;
        long j8;
        for (int i6 = 0; i6 < this.f9147u.size(); i6++) {
            int keyAt = this.f9147u.keyAt(i6);
            if (keyAt >= this.f9132W) {
                ((androidx.media3.exoplayer.dash.b) this.f9147u.valueAt(i6)).O(this.f9125H, keyAt - this.f9132W);
            }
        }
        k1.g d6 = this.f9125H.d(0);
        int e6 = this.f9125H.e() - 1;
        k1.g d7 = this.f9125H.d(e6);
        long g6 = this.f9125H.g(e6);
        long J02 = AbstractC1117K.J0(AbstractC1117K.f0(this.f9129L));
        long M5 = M(d6, this.f9125H.g(0), J02);
        long L5 = L(d7, g6, J02);
        boolean z7 = this.f9125H.f16319d && !Q(d7);
        if (z7) {
            long j9 = this.f9125H.f16321f;
            if (j9 != -9223372036854775807L) {
                M5 = Math.max(M5, L5 - AbstractC1117K.J0(j9));
            }
        }
        long j10 = L5 - M5;
        C1659c c1659c = this.f9125H;
        if (c1659c.f16319d) {
            AbstractC1119a.g(c1659c.f16316a != -9223372036854775807L);
            long J03 = (J02 - AbstractC1117K.J0(this.f9125H.f16316a)) - M5;
            i0(J03, j10);
            long k12 = this.f9125H.f16316a + AbstractC1117K.k1(M5);
            long J04 = J03 - AbstractC1117K.J0(this.f9122E.f7138a);
            j6 = 0;
            long min = Math.min(this.f9142p, j10 / 2);
            j7 = k12;
            j8 = J04 < min ? min : J04;
        } else {
            j6 = 0;
            j7 = -9223372036854775807L;
            j8 = 0;
        }
        long J05 = M5 - AbstractC1117K.J0(d6.f16352b);
        C1659c c1659c2 = this.f9125H;
        D(new b(c1659c2.f16316a, j7, this.f9129L, this.f9132W, J05, j10, j8, c1659c2, g(), this.f9125H.f16319d ? this.f9122E : null));
        if (this.f9134h) {
            return;
        }
        this.f9121D.removeCallbacks(this.f9149w);
        if (z7) {
            this.f9121D.postDelayed(this.f9149w, N(this.f9125H, AbstractC1117K.f0(this.f9129L)));
        }
        if (this.f9126I) {
            h0();
            return;
        }
        if (z6) {
            C1659c c1659c3 = this.f9125H;
            if (c1659c3.f16319d) {
                long j11 = c1659c3.f16320e;
                if (j11 != -9223372036854775807L) {
                    if (j11 == j6) {
                        j11 = 5000;
                    }
                    f0(Math.max(j6, (this.f9127J + j11) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void c0(o oVar) {
        String str = oVar.f16405a;
        if (AbstractC1117K.c(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC1117K.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            d0(oVar);
            return;
        }
        if (AbstractC1117K.c(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC1117K.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            e0(oVar, new d());
            return;
        }
        if (AbstractC1117K.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC1117K.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            e0(oVar, new h(null));
        } else if (AbstractC1117K.c(str, "urn:mpeg:dash:utc:ntp:2014") || AbstractC1117K.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            R();
        } else {
            Z(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        int intValue = ((Integer) bVar.f19753a).intValue() - this.f9132W;
        K.a x6 = x(bVar);
        androidx.media3.exoplayer.dash.b bVar3 = new androidx.media3.exoplayer.dash.b(this.f9132W + intValue, this.f9125H, this.f9140n, intValue, this.f9136j, this.f9119B, null, this.f9138l, v(bVar), this.f9139m, x6, this.f9129L, this.f9151y, bVar2, this.f9137k, this.f9150x, A());
        this.f9147u.put(bVar3.f9180a, bVar3);
        return bVar3;
    }

    public final void d0(o oVar) {
        try {
            a0(AbstractC1117K.Q0(oVar.f16406b) - this.f9128K);
        } catch (z e6) {
            Z(e6);
        }
    }

    public final void e0(o oVar, n.a aVar) {
        g0(new n(this.f9152z, Uri.parse(oVar.f16406b), 5, aVar), new g(this, null), 1);
    }

    public final void f0(long j6) {
        this.f9121D.postDelayed(this.f9148v, j6);
    }

    @Override // w1.InterfaceC2212D
    public synchronized u g() {
        return this.f9133X;
    }

    public final void g0(n nVar, l.b bVar, int i6) {
        this.f9143q.s(new C2239y(nVar.f157a, nVar.f158b, this.f9118A.n(nVar, bVar, i6)), nVar.f159c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.i0(long, long):void");
    }

    @Override // w1.InterfaceC2212D
    public void l() {
        this.f9151y.a();
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) interfaceC2211C;
        bVar.K();
        this.f9147u.remove(bVar.f9180a);
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(u uVar) {
        this.f9133X = uVar;
    }

    public DashMediaSource(u uVar, C1659c c1659c, InterfaceC1248f.a aVar, n.a aVar2, a.InterfaceC0136a interfaceC0136a, InterfaceC2225j interfaceC2225j, A1.e eVar, l1.u uVar2, k kVar, long j6, long j7) {
        this.f9133X = uVar;
        this.f9122E = uVar.f7066d;
        this.f9123F = ((u.h) AbstractC1119a.e(uVar.f7064b)).f7156a;
        this.f9124G = uVar.f7064b.f7156a;
        this.f9125H = c1659c;
        this.f9135i = aVar;
        this.f9144r = aVar2;
        this.f9136j = interfaceC0136a;
        this.f9138l = uVar2;
        this.f9139m = kVar;
        this.f9141o = j6;
        this.f9142p = j7;
        this.f9137k = interfaceC2225j;
        this.f9140n = new C1641b();
        boolean z6 = c1659c != null;
        this.f9134h = z6;
        a aVar3 = null;
        this.f9143q = x(null);
        this.f9146t = new Object();
        this.f9147u = new SparseArray();
        this.f9150x = new c(this, aVar3);
        this.f9131V = -9223372036854775807L;
        this.f9129L = -9223372036854775807L;
        if (z6) {
            AbstractC1119a.g(true ^ c1659c.f16319d);
            this.f9145s = null;
            this.f9148v = null;
            this.f9149w = null;
            this.f9151y = new m.a();
            return;
        }
        this.f9145s = new e(this, aVar3);
        this.f9151y = new f();
        this.f9148v = new Runnable() { // from class: j1.e
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.h0();
            }
        };
        this.f9149w = new Runnable() { // from class: j1.f
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.b0(false);
            }
        };
    }
}
