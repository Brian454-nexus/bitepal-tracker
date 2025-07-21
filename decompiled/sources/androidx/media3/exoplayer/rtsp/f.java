package androidx.media3.exoplayer.rtsp;

import A1.l;
import E1.J;
import E1.O;
import E1.r;
import Z0.H;
import Z0.q;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.rtsp.a;
import androidx.media3.exoplayer.rtsp.b;
import androidx.media3.exoplayer.rtsp.d;
import androidx.media3.exoplayer.rtsp.f;
import androidx.media3.exoplayer.rtsp.g;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import kotlin.jvm.internal.LongCompanionObject;
import s1.C2054n;
import s1.u;
import s1.v;
import w1.InterfaceC2211C;
import w1.a0;
import w1.b0;
import w1.l0;
import z1.x;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements InterfaceC2211C {

    /* renamed from: a, reason: collision with root package name */
    public final A1.b f9348a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9349b = AbstractC1117K.A();

    /* renamed from: c, reason: collision with root package name */
    public final c f9350c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.rtsp.d f9351d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9352e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9353f;

    /* renamed from: g, reason: collision with root package name */
    public final d f9354g;

    /* renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0138a f9355h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2211C.a f9356i;

    /* renamed from: j, reason: collision with root package name */
    public w f9357j;

    /* renamed from: k, reason: collision with root package name */
    public IOException f9358k;

    /* renamed from: l, reason: collision with root package name */
    public RtspMediaSource.c f9359l;

    /* renamed from: m, reason: collision with root package name */
    public long f9360m;

    /* renamed from: n, reason: collision with root package name */
    public long f9361n;

    /* renamed from: o, reason: collision with root package name */
    public long f9362o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9363p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9364q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9365r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9366s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9367t;

    /* renamed from: u, reason: collision with root package name */
    public int f9368u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9369v;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        public final O f9370a;

        @Override // E1.r
        public O a(int i6, int i7) {
            return this.f9370a;
        }

        @Override // E1.r
        public void k() {
            Handler handler = f.this.f9349b;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: s1.k
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.rtsp.f.this.T();
                }
            });
        }

        @Override // E1.r
        public void n(J j6) {
        }

        public b(O o6) {
            this.f9370a = o6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements l.b, a0.d, d.f, d.e {
        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.d.f
        public void a(String str, Throwable th) {
            f.this.f9358k = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void b(long j6, w wVar) {
            ArrayList arrayList = new ArrayList(wVar.size());
            for (int i6 = 0; i6 < wVar.size(); i6++) {
                arrayList.add((String) AbstractC1119a.e(((v) wVar.get(i6)).f18842c.getPath()));
            }
            for (int i7 = 0; i7 < f.this.f9353f.size(); i7++) {
                if (!arrayList.contains(((e) f.this.f9353f.get(i7)).c().getPath())) {
                    f.this.f9354g.b();
                    if (f.this.S()) {
                        f.this.f9364q = true;
                        f.this.f9361n = -9223372036854775807L;
                        f.this.f9360m = -9223372036854775807L;
                        f.this.f9362o = -9223372036854775807L;
                    }
                }
            }
            for (int i8 = 0; i8 < wVar.size(); i8++) {
                v vVar = (v) wVar.get(i8);
                androidx.media3.exoplayer.rtsp.b Q5 = f.this.Q(vVar.f18842c);
                if (Q5 != null) {
                    Q5.g(vVar.f18840a);
                    Q5.f(vVar.f18841b);
                    if (f.this.S() && f.this.f9361n == f.this.f9360m) {
                        Q5.e(j6, vVar.f18840a);
                    }
                }
            }
            if (!f.this.S()) {
                if (f.this.f9362o == -9223372036854775807L || !f.this.f9369v) {
                    return;
                }
                f fVar = f.this;
                fVar.m(fVar.f9362o);
                f.this.f9362o = -9223372036854775807L;
                return;
            }
            if (f.this.f9361n == f.this.f9360m) {
                f.this.f9361n = -9223372036854775807L;
                f.this.f9360m = -9223372036854775807L;
            } else {
                f.this.f9361n = -9223372036854775807L;
                f fVar2 = f.this;
                fVar2.m(fVar2.f9360m);
            }
        }

        @Override // w1.a0.d
        public void c(q qVar) {
            Handler handler = f.this.f9349b;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: s1.l
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.rtsp.f.this.T();
                }
            });
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void d() {
            f.this.f9351d.V0(f.this.f9361n != -9223372036854775807L ? AbstractC1117K.k1(f.this.f9361n) : f.this.f9362o != -9223372036854775807L ? AbstractC1117K.k1(f.this.f9362o) : 0L);
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void e(RtspMediaSource.c cVar) {
            if (!(cVar instanceof RtspMediaSource.d) || f.this.f9369v) {
                f.this.f9359l = cVar;
            } else {
                f.this.X();
            }
        }

        @Override // androidx.media3.exoplayer.rtsp.d.f
        public void f(u uVar, w wVar) {
            for (int i6 = 0; i6 < wVar.size(); i6++) {
                C2054n c2054n = (C2054n) wVar.get(i6);
                f fVar = f.this;
                C0140f c0140f = new C0140f(c2054n, i6, fVar.f9355h);
                f.this.f9352e.add(c0140f);
                c0140f.k();
            }
            f.this.f9354g.a(uVar);
        }

        @Override // A1.l.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void u(androidx.media3.exoplayer.rtsp.b bVar, long j6, long j7, boolean z6) {
        }

        @Override // A1.l.b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void j(androidx.media3.exoplayer.rtsp.b bVar, long j6, long j7) {
            if (f.this.f() == 0) {
                if (f.this.f9369v) {
                    return;
                }
                f.this.X();
                return;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= f.this.f9352e.size()) {
                    break;
                }
                C0140f c0140f = (C0140f) f.this.f9352e.get(i6);
                if (c0140f.f9377a.f9374b == bVar) {
                    c0140f.c();
                    break;
                }
                i6++;
            }
            f.this.f9351d.T0();
        }

        @Override // A1.l.b
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public l.c q(androidx.media3.exoplayer.rtsp.b bVar, long j6, long j7, IOException iOException, int i6) {
            if (!f.this.f9366s) {
                f.this.f9358k = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                f.this.f9359l = new RtspMediaSource.c(bVar.f9301b.f18819b.toString(), iOException);
            } else if (f.i(f.this) < 3) {
                return A1.l.f137d;
            }
            return A1.l.f139f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void a(u uVar);

        void b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final C2054n f9373a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.rtsp.b f9374b;

        /* renamed from: c, reason: collision with root package name */
        public String f9375c;

        public e(C2054n c2054n, int i6, O o6, a.InterfaceC0138a interfaceC0138a) {
            this.f9373a = c2054n;
            this.f9374b = new androidx.media3.exoplayer.rtsp.b(i6, c2054n, new b.a() { // from class: s1.m
                @Override // androidx.media3.exoplayer.rtsp.b.a
                public final void a(String str, androidx.media3.exoplayer.rtsp.a aVar) {
                    f.e.a(f.e.this, str, aVar);
                }
            }, new b(o6), interfaceC0138a);
        }

        public static /* synthetic */ void a(e eVar, String str, androidx.media3.exoplayer.rtsp.a aVar) {
            eVar.f9375c = str;
            g.b i6 = aVar.i();
            if (i6 != null) {
                f.this.f9351d.O0(aVar.d(), i6);
                f.this.f9369v = true;
            }
            f.this.U();
        }

        public Uri c() {
            return this.f9374b.f9301b.f18819b;
        }

        public String d() {
            AbstractC1119a.i(this.f9375c);
            return this.f9375c;
        }

        public boolean e() {
            return this.f9375c != null;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$f, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0140f {

        /* renamed from: a, reason: collision with root package name */
        public final e f9377a;

        /* renamed from: b, reason: collision with root package name */
        public final A1.l f9378b;

        /* renamed from: c, reason: collision with root package name */
        public final a0 f9379c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9380d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9381e;

        public C0140f(C2054n c2054n, int i6, a.InterfaceC0138a interfaceC0138a) {
            this.f9378b = new A1.l("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i6);
            a0 l6 = a0.l(f.this.f9348a);
            this.f9379c = l6;
            this.f9377a = new e(c2054n, i6, l6, interfaceC0138a);
            l6.d0(f.this.f9350c);
        }

        public void c() {
            if (this.f9380d) {
                return;
            }
            this.f9377a.f9374b.c();
            this.f9380d = true;
            f.this.b0();
        }

        public long d() {
            return this.f9379c.A();
        }

        public boolean e() {
            return this.f9379c.L(this.f9380d);
        }

        public int f(C1337i0 c1337i0, f1.f fVar, int i6) {
            return this.f9379c.S(c1337i0, fVar, i6, this.f9380d);
        }

        public void g() {
            if (this.f9381e) {
                return;
            }
            this.f9378b.l();
            this.f9379c.T();
            this.f9381e = true;
        }

        public void h() {
            AbstractC1119a.g(this.f9380d);
            this.f9380d = false;
            f.this.b0();
            k();
        }

        public void i(long j6) {
            if (this.f9380d) {
                return;
            }
            this.f9377a.f9374b.d();
            this.f9379c.V();
            this.f9379c.b0(j6);
        }

        public int j(long j6) {
            int F6 = this.f9379c.F(j6, this.f9380d);
            this.f9379c.e0(F6);
            return F6;
        }

        public void k() {
            this.f9378b.n(this.f9377a.f9374b, f.this.f9350c, 0);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class g implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f9383a;

        public g(int i6) {
            this.f9383a = i6;
        }

        @Override // w1.b0
        public void a() {
            if (f.this.f9359l != null) {
                throw f.this.f9359l;
            }
        }

        @Override // w1.b0
        public boolean c() {
            return f.this.R(this.f9383a);
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            return f.this.V(this.f9383a, c1337i0, fVar, i6);
        }

        @Override // w1.b0
        public int n(long j6) {
            return f.this.Z(this.f9383a, j6);
        }
    }

    public f(A1.b bVar, a.InterfaceC0138a interfaceC0138a, Uri uri, d dVar, String str, SocketFactory socketFactory, boolean z6) {
        this.f9348a = bVar;
        this.f9355h = interfaceC0138a;
        this.f9354g = dVar;
        c cVar = new c();
        this.f9350c = cVar;
        this.f9351d = new androidx.media3.exoplayer.rtsp.d(cVar, cVar, str, uri, socketFactory, z6);
        this.f9352e = new ArrayList();
        this.f9353f = new ArrayList();
        this.f9361n = -9223372036854775807L;
        this.f9360m = -9223372036854775807L;
        this.f9362o = -9223372036854775807L;
    }

    public static w P(w wVar) {
        w.a aVar = new w.a();
        for (int i6 = 0; i6 < wVar.size(); i6++) {
            aVar.h(new H(Integer.toString(i6), (q) AbstractC1119a.e(((C0140f) wVar.get(i6)).f9379c.G())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f9365r || this.f9366s) {
            return;
        }
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            if (((C0140f) this.f9352e.get(i6)).f9379c.G() == null) {
                return;
            }
        }
        this.f9366s = true;
        this.f9357j = P(w.s(this.f9352e));
        ((InterfaceC2211C.a) AbstractC1119a.e(this.f9356i)).i(this);
    }

    private boolean a0() {
        return this.f9364q;
    }

    public static /* synthetic */ int i(f fVar) {
        int i6 = fVar.f9368u;
        fVar.f9368u = i6 + 1;
        return i6;
    }

    public final androidx.media3.exoplayer.rtsp.b Q(Uri uri) {
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            if (!((C0140f) this.f9352e.get(i6)).f9380d) {
                e eVar = ((C0140f) this.f9352e.get(i6)).f9377a;
                if (eVar.c().equals(uri)) {
                    return eVar.f9374b;
                }
            }
        }
        return null;
    }

    public boolean R(int i6) {
        return !a0() && ((C0140f) this.f9352e.get(i6)).e();
    }

    public final boolean S() {
        return this.f9361n != -9223372036854775807L;
    }

    public final void U() {
        boolean z6 = true;
        for (int i6 = 0; i6 < this.f9353f.size(); i6++) {
            z6 &= ((e) this.f9353f.get(i6)).e();
        }
        if (z6 && this.f9367t) {
            this.f9351d.S0(this.f9353f);
        }
    }

    public int V(int i6, C1337i0 c1337i0, f1.f fVar, int i7) {
        if (a0()) {
            return -3;
        }
        return ((C0140f) this.f9352e.get(i6)).f(c1337i0, fVar, i7);
    }

    public void W() {
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            ((C0140f) this.f9352e.get(i6)).g();
        }
        AbstractC1117K.m(this.f9351d);
        this.f9365r = true;
    }

    public final void X() {
        this.f9369v = true;
        this.f9351d.P0();
        a.InterfaceC0138a b6 = this.f9355h.b();
        if (b6 == null) {
            this.f9359l = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f9352e.size());
        ArrayList arrayList2 = new ArrayList(this.f9353f.size());
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            C0140f c0140f = (C0140f) this.f9352e.get(i6);
            if (c0140f.f9380d) {
                arrayList.add(c0140f);
            } else {
                C0140f c0140f2 = new C0140f(c0140f.f9377a.f9373a, i6, b6);
                arrayList.add(c0140f2);
                c0140f2.k();
                if (this.f9353f.contains(c0140f.f9377a)) {
                    arrayList2.add(c0140f2.f9377a);
                }
            }
        }
        w s6 = w.s(this.f9352e);
        this.f9352e.clear();
        this.f9352e.addAll(arrayList);
        this.f9353f.clear();
        this.f9353f.addAll(arrayList2);
        for (int i7 = 0; i7 < s6.size(); i7++) {
            ((C0140f) s6.get(i7)).c();
        }
    }

    public final boolean Y(long j6) {
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            if (!((C0140f) this.f9352e.get(i6)).f9379c.Z(j6, false)) {
                return false;
            }
        }
        return true;
    }

    public int Z(int i6, long j6) {
        if (a0()) {
            return -3;
        }
        return ((C0140f) this.f9352e.get(i6)).j(j6);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return e();
    }

    public final void b0() {
        this.f9363p = true;
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            this.f9363p &= ((C0140f) this.f9352e.get(i6)).f9380d;
        }
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return f();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        if (this.f9363p) {
            return false;
        }
        return this.f9351d.M0() == 2 || this.f9351d.M0() == 1;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        if (this.f9363p || this.f9352e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f9360m;
        if (j6 != -9223372036854775807L) {
            return j6;
        }
        boolean z6 = true;
        long j7 = LongCompanionObject.MAX_VALUE;
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            C0140f c0140f = (C0140f) this.f9352e.get(i6);
            if (!c0140f.f9380d) {
                j7 = Math.min(j7, c0140f.d());
                z6 = false;
            }
        }
        if (z6 || j7 == Long.MIN_VALUE) {
            return 0L;
        }
        return j7;
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
    }

    @Override // w1.InterfaceC2211C
    public void l() {
        IOException iOException = this.f9358k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        if (f() == 0 && !this.f9369v) {
            this.f9362o = j6;
            return j6;
        }
        t(j6, false);
        this.f9360m = j6;
        if (S()) {
            int M02 = this.f9351d.M0();
            if (M02 != 1) {
                if (M02 != 2) {
                    throw new IllegalStateException();
                }
                this.f9361n = j6;
                this.f9351d.Q0(j6);
                return j6;
            }
        } else if (!Y(j6)) {
            this.f9361n = j6;
            if (this.f9363p) {
                for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
                    ((C0140f) this.f9352e.get(i6)).h();
                }
                if (this.f9369v) {
                    this.f9351d.V0(AbstractC1117K.k1(j6));
                } else {
                    this.f9351d.Q0(j6);
                }
            } else {
                this.f9351d.Q0(j6);
            }
            for (int i7 = 0; i7 < this.f9352e.size(); i7++) {
                ((C0140f) this.f9352e.get(i7)).i(j6);
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long o(x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            if (b0VarArr[i6] != null && (xVarArr[i6] == null || !zArr[i6])) {
                b0VarArr[i6] = null;
            }
        }
        this.f9353f.clear();
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            x xVar = xVarArr[i7];
            if (xVar != null) {
                H e6 = xVar.e();
                int indexOf = ((w) AbstractC1119a.e(this.f9357j)).indexOf(e6);
                this.f9353f.add(((C0140f) AbstractC1119a.e((C0140f) this.f9352e.get(indexOf))).f9377a);
                if (this.f9357j.contains(e6) && b0VarArr[i7] == null) {
                    b0VarArr[i7] = new g(indexOf);
                    zArr2[i7] = true;
                }
            }
        }
        for (int i8 = 0; i8 < this.f9352e.size(); i8++) {
            C0140f c0140f = (C0140f) this.f9352e.get(i8);
            if (!this.f9353f.contains(c0140f.f9377a)) {
                c0140f.c();
            }
        }
        this.f9367t = true;
        if (j6 != 0) {
            this.f9360m = j6;
            this.f9361n = j6;
            this.f9362o = j6;
        }
        U();
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        if (!this.f9364q) {
            return -9223372036854775807L;
        }
        this.f9364q = false;
        return 0L;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        AbstractC1119a.g(this.f9366s);
        return new l0((H[]) ((w) AbstractC1119a.e(this.f9357j)).toArray(new H[0]));
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        this.f9356i = aVar;
        try {
            this.f9351d.U0();
        } catch (IOException e6) {
            this.f9358k = e6;
            AbstractC1117K.m(this.f9351d);
        }
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
        if (S()) {
            return;
        }
        for (int i6 = 0; i6 < this.f9352e.size(); i6++) {
            C0140f c0140f = (C0140f) this.f9352e.get(i6);
            if (!c0140f.f9380d) {
                c0140f.f9379c.q(j6, z6, true);
            }
        }
    }
}
