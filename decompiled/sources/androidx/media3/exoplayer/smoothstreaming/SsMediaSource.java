package androidx.media3.exoplayer.smoothstreaming;

import A1.e;
import A1.j;
import A1.k;
import A1.l;
import A1.m;
import A1.n;
import Z0.u;
import Z0.v;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.a;
import androidx.media3.exoplayer.smoothstreaming.b;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import l1.C1742l;
import l1.u;
import l1.w;
import r1.C2022b;
import v1.C2161a;
import w1.AbstractC2216a;
import w1.C2210B;
import w1.C2226k;
import w1.C2239y;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import w1.InterfaceC2225j;
import w1.K;
import w1.L;
import w1.e0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SsMediaSource extends AbstractC2216a implements l.b {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9427h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f9428i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1248f.a f9429j;

    /* renamed from: k, reason: collision with root package name */
    public final b.a f9430k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2225j f9431l;

    /* renamed from: m, reason: collision with root package name */
    public final u f9432m;

    /* renamed from: n, reason: collision with root package name */
    public final k f9433n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9434o;

    /* renamed from: p, reason: collision with root package name */
    public final K.a f9435p;

    /* renamed from: q, reason: collision with root package name */
    public final n.a f9436q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9437r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1248f f9438s;

    /* renamed from: t, reason: collision with root package name */
    public l f9439t;

    /* renamed from: u, reason: collision with root package name */
    public m f9440u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1266x f9441v;

    /* renamed from: w, reason: collision with root package name */
    public long f9442w;

    /* renamed from: x, reason: collision with root package name */
    public C2161a f9443x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f9444y;

    /* renamed from: z, reason: collision with root package name */
    public Z0.u f9445z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Factory implements L {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f9446j = 0;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f9447c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC1248f.a f9448d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC2225j f9449e;

        /* renamed from: f, reason: collision with root package name */
        public w f9450f;

        /* renamed from: g, reason: collision with root package name */
        public k f9451g;

        /* renamed from: h, reason: collision with root package name */
        public long f9452h;

        /* renamed from: i, reason: collision with root package name */
        public n.a f9453i;

        public Factory(InterfaceC1248f.a aVar) {
            this(new a.C0142a(aVar), aVar);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SsMediaSource d(Z0.u uVar) {
            AbstractC1119a.e(uVar.f7064b);
            n.a aVar = this.f9453i;
            if (aVar == null) {
                aVar = new v1.b();
            }
            List list = uVar.f7064b.f7159d;
            return new SsMediaSource(uVar, null, this.f9448d, !list.isEmpty() ? new C2022b(aVar, list) : aVar, this.f9447c, this.f9449e, null, this.f9450f.a(uVar), this.f9451g, this.f9452h);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z6) {
            this.f9447c.b(z6);
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory e(w wVar) {
            this.f9450f = (w) AbstractC1119a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(k kVar) {
            this.f9451g = (k) AbstractC1119a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f9447c.a((s.a) AbstractC1119a.e(aVar));
            return this;
        }

        public Factory(b.a aVar, InterfaceC1248f.a aVar2) {
            this.f9447c = (b.a) AbstractC1119a.e(aVar);
            this.f9448d = aVar2;
            this.f9450f = new C1742l();
            this.f9451g = new j();
            this.f9452h = 30000L;
            this.f9449e = new C2226k();
            b(true);
        }
    }

    static {
        v.a("media3.exoplayer.smoothstreaming");
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f9441v = interfaceC1266x;
        this.f9432m.a(Looper.myLooper(), A());
        this.f9432m.h();
        if (this.f9427h) {
            this.f9440u = new m.a();
            J();
            return;
        }
        this.f9438s = this.f9429j.a();
        l lVar = new l("SsMediaSource");
        this.f9439t = lVar;
        this.f9440u = lVar;
        this.f9444y = AbstractC1117K.A();
        L();
    }

    @Override // w1.AbstractC2216a
    public void E() {
        this.f9443x = this.f9427h ? this.f9443x : null;
        this.f9438s = null;
        this.f9442w = 0L;
        l lVar = this.f9439t;
        if (lVar != null) {
            lVar.l();
            this.f9439t = null;
        }
        Handler handler = this.f9444y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9444y = null;
        }
        this.f9432m.release();
    }

    @Override // A1.l.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void u(n nVar, long j6, long j7, boolean z6) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f9433n.b(nVar.f157a);
        this.f9435p.j(c2239y, nVar.f159c);
    }

    @Override // A1.l.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void j(n nVar, long j6, long j7) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        this.f9433n.b(nVar.f157a);
        this.f9435p.m(c2239y, nVar.f159c);
        this.f9443x = (C2161a) nVar.e();
        this.f9442w = j6 - j7;
        J();
        K();
    }

    @Override // A1.l.b
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public l.c q(n nVar, long j6, long j7, IOException iOException, int i6) {
        C2239y c2239y = new C2239y(nVar.f157a, nVar.f158b, nVar.f(), nVar.d(), j6, j7, nVar.b());
        long a6 = this.f9433n.a(new k.c(c2239y, new C2210B(nVar.f159c), iOException, i6));
        l.c h6 = a6 == -9223372036854775807L ? l.f140g : l.h(false, a6);
        boolean c6 = h6.c();
        this.f9435p.q(c2239y, nVar.f159c, iOException, !c6);
        if (!c6) {
            this.f9433n.b(nVar.f157a);
        }
        return h6;
    }

    public final void J() {
        e0 e0Var;
        for (int i6 = 0; i6 < this.f9437r.size(); i6++) {
            ((c) this.f9437r.get(i6)).x(this.f9443x);
        }
        long j6 = Long.MIN_VALUE;
        long j7 = Long.MAX_VALUE;
        for (C2161a.b bVar : this.f9443x.f19301f) {
            if (bVar.f19317k > 0) {
                j7 = Math.min(j7, bVar.e(0));
                j6 = Math.max(j6, bVar.e(bVar.f19317k - 1) + bVar.c(bVar.f19317k - 1));
            }
        }
        if (j7 == LongCompanionObject.MAX_VALUE) {
            long j8 = this.f9443x.f19299d ? -9223372036854775807L : 0L;
            C2161a c2161a = this.f9443x;
            boolean z6 = c2161a.f19299d;
            e0Var = new e0(j8, 0L, 0L, 0L, true, z6, z6, c2161a, g());
        } else {
            C2161a c2161a2 = this.f9443x;
            if (c2161a2.f19299d) {
                long j9 = c2161a2.f19303h;
                if (j9 != -9223372036854775807L && j9 > 0) {
                    j7 = Math.max(j7, j6 - j9);
                }
                long j10 = j7;
                long j11 = j6 - j10;
                long J02 = j11 - AbstractC1117K.J0(this.f9434o);
                if (J02 < 5000000) {
                    J02 = Math.min(5000000L, j11 / 2);
                }
                e0Var = new e0(-9223372036854775807L, j11, j10, J02, true, true, true, this.f9443x, g());
            } else {
                long j12 = c2161a2.f19302g;
                if (j12 == -9223372036854775807L) {
                    j12 = j6 - j7;
                }
                long j13 = j12;
                e0Var = new e0(j7 + j13, j13, j7, 0L, true, false, false, this.f9443x, g());
            }
        }
        D(e0Var);
    }

    public final void K() {
        if (this.f9443x.f19299d) {
            this.f9444y.postDelayed(new Runnable() { // from class: u1.b
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.L();
                }
            }, Math.max(0L, (this.f9442w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void L() {
        if (this.f9439t.i()) {
            return;
        }
        n nVar = new n(this.f9438s, this.f9428i, 4, this.f9436q);
        this.f9435p.s(new C2239y(nVar.f157a, nVar.f158b, this.f9439t.n(nVar, this, this.f9433n.d(nVar.f159c))), nVar.f159c);
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        K.a x6 = x(bVar);
        c cVar = new c(this.f9443x, this.f9430k, this.f9441v, this.f9431l, null, this.f9432m, v(bVar), this.f9433n, x6, this.f9440u, bVar2);
        this.f9437r.add(cVar);
        return cVar;
    }

    @Override // w1.InterfaceC2212D
    public synchronized Z0.u g() {
        return this.f9445z;
    }

    @Override // w1.InterfaceC2212D
    public void l() {
        this.f9440u.a();
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((c) interfaceC2211C).w();
        this.f9437r.remove(interfaceC2211C);
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(Z0.u uVar) {
        this.f9445z = uVar;
    }

    public SsMediaSource(Z0.u uVar, C2161a c2161a, InterfaceC1248f.a aVar, n.a aVar2, b.a aVar3, InterfaceC2225j interfaceC2225j, e eVar, u uVar2, k kVar, long j6) {
        AbstractC1119a.g(c2161a == null || !c2161a.f19299d);
        this.f9445z = uVar;
        u.h hVar = (u.h) AbstractC1119a.e(uVar.f7064b);
        this.f9443x = c2161a;
        this.f9428i = hVar.f7156a.equals(Uri.EMPTY) ? null : AbstractC1117K.G(hVar.f7156a);
        this.f9429j = aVar;
        this.f9436q = aVar2;
        this.f9430k = aVar3;
        this.f9431l = interfaceC2225j;
        this.f9432m = uVar2;
        this.f9433n = kVar;
        this.f9434o = j6;
        this.f9435p = x(null);
        this.f9427h = c2161a != null;
        this.f9437r = new ArrayList();
    }
}
