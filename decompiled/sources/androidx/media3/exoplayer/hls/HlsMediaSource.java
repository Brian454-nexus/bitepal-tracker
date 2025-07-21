package androidx.media3.exoplayer.hls;

import A1.b;
import Z0.u;
import Z0.v;
import android.os.Looper;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import java.util.List;
import l1.C1742l;
import l1.u;
import l1.w;
import m1.C1796c;
import m1.g;
import m1.h;
import m1.i;
import m1.m;
import n1.C1811a;
import n1.C1813c;
import n1.e;
import n1.f;
import n1.j;
import n1.k;
import w1.AbstractC2216a;
import w1.C2226k;
import w1.InterfaceC2211C;
import w1.InterfaceC2212D;
import w1.InterfaceC2225j;
import w1.K;
import w1.L;
import w1.e0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class HlsMediaSource extends AbstractC2216a implements k.e {

    /* renamed from: h, reason: collision with root package name */
    public final h f9255h;

    /* renamed from: i, reason: collision with root package name */
    public final g f9256i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2225j f9257j;

    /* renamed from: k, reason: collision with root package name */
    public final u f9258k;

    /* renamed from: l, reason: collision with root package name */
    public final A1.k f9259l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9260m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9261n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9262o;

    /* renamed from: p, reason: collision with root package name */
    public final k f9263p;

    /* renamed from: q, reason: collision with root package name */
    public final long f9264q;

    /* renamed from: r, reason: collision with root package name */
    public final long f9265r;

    /* renamed from: s, reason: collision with root package name */
    public u.g f9266s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1266x f9267t;

    /* renamed from: u, reason: collision with root package name */
    public Z0.u f9268u;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Factory implements L {

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int f9269o = 0;

        /* renamed from: c, reason: collision with root package name */
        public final g f9270c;

        /* renamed from: d, reason: collision with root package name */
        public h f9271d;

        /* renamed from: e, reason: collision with root package name */
        public j f9272e;

        /* renamed from: f, reason: collision with root package name */
        public k.a f9273f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC2225j f9274g;

        /* renamed from: h, reason: collision with root package name */
        public w f9275h;

        /* renamed from: i, reason: collision with root package name */
        public A1.k f9276i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9277j;

        /* renamed from: k, reason: collision with root package name */
        public int f9278k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f9279l;

        /* renamed from: m, reason: collision with root package name */
        public long f9280m;

        /* renamed from: n, reason: collision with root package name */
        public long f9281n;

        public Factory(InterfaceC1248f.a aVar) {
            this(new C1796c(aVar));
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource d(Z0.u uVar) {
            AbstractC1119a.e(uVar.f7064b);
            j jVar = this.f9272e;
            List list = uVar.f7064b.f7159d;
            if (!list.isEmpty()) {
                jVar = new e(jVar, list);
            }
            g gVar = this.f9270c;
            h hVar = this.f9271d;
            InterfaceC2225j interfaceC2225j = this.f9274g;
            l1.u a6 = this.f9275h.a(uVar);
            A1.k kVar = this.f9276i;
            return new HlsMediaSource(uVar, gVar, hVar, interfaceC2225j, null, a6, kVar, this.f9273f.a(this.f9270c, kVar, jVar), this.f9280m, this.f9277j, this.f9278k, this.f9279l, this.f9281n);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z6) {
            this.f9271d.b(z6);
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory e(w wVar) {
            this.f9275h = (w) AbstractC1119a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(A1.k kVar) {
            this.f9276i = (A1.k) AbstractC1119a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f9271d.a((s.a) AbstractC1119a.e(aVar));
            return this;
        }

        public Factory(g gVar) {
            this.f9270c = (g) AbstractC1119a.e(gVar);
            this.f9275h = new C1742l();
            this.f9272e = new C1811a();
            this.f9273f = C1813c.f17462p;
            this.f9271d = h.f17280a;
            this.f9276i = new A1.j();
            this.f9274g = new C2226k();
            this.f9278k = 1;
            this.f9280m = -9223372036854775807L;
            this.f9277j = true;
            b(true);
        }
    }

    static {
        v.a("media3.exoplayer.hls");
    }

    public static f.b H(List list, long j6) {
        f.b bVar = null;
        for (int i6 = 0; i6 < list.size(); i6++) {
            f.b bVar2 = (f.b) list.get(i6);
            long j7 = bVar2.f17525e;
            if (j7 > j6 || !bVar2.f17514l) {
                if (j7 > j6) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public static f.d I(List list, long j6) {
        return (f.d) list.get(AbstractC1117K.f(list, Long.valueOf(j6), true, true));
    }

    public static long L(f fVar, long j6) {
        long j7;
        f.C0222f c0222f = fVar.f17513v;
        long j8 = fVar.f17496e;
        if (j8 != -9223372036854775807L) {
            j7 = fVar.f17512u - j8;
        } else {
            long j9 = c0222f.f17535d;
            if (j9 == -9223372036854775807L || fVar.f17505n == -9223372036854775807L) {
                long j10 = c0222f.f17534c;
                j7 = j10 != -9223372036854775807L ? j10 : fVar.f17504m * 3;
            } else {
                j7 = j9;
            }
        }
        return j7 + j6;
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f9267t = interfaceC1266x;
        this.f9258k.a((Looper) AbstractC1119a.e(Looper.myLooper()), A());
        this.f9258k.h();
        this.f9263p.f(((u.h) AbstractC1119a.e(g().f7064b)).f7156a, x(null), this);
    }

    @Override // w1.AbstractC2216a
    public void E() {
        this.f9263p.stop();
        this.f9258k.release();
    }

    public final e0 F(f fVar, long j6, long j7, i iVar) {
        long e6 = fVar.f17499h - this.f9263p.e();
        long j8 = fVar.f17506o ? e6 + fVar.f17512u : -9223372036854775807L;
        long J6 = J(fVar);
        long j9 = this.f9266s.f7138a;
        M(fVar, AbstractC1117K.q(j9 != -9223372036854775807L ? AbstractC1117K.J0(j9) : L(fVar, J6), J6, fVar.f17512u + J6));
        return new e0(j6, j7, -9223372036854775807L, j8, fVar.f17512u, e6, K(fVar, J6), true, !fVar.f17506o, fVar.f17495d == 2 && fVar.f17497f, iVar, g(), this.f9266s);
    }

    public final e0 G(f fVar, long j6, long j7, i iVar) {
        long j8;
        if (fVar.f17496e == -9223372036854775807L || fVar.f17509r.isEmpty()) {
            j8 = 0;
        } else {
            if (!fVar.f17498g) {
                long j9 = fVar.f17496e;
                if (j9 != fVar.f17512u) {
                    j8 = I(fVar.f17509r, j9).f17525e;
                }
            }
            j8 = fVar.f17496e;
        }
        long j10 = j8;
        long j11 = fVar.f17512u;
        return new e0(j6, j7, -9223372036854775807L, j11, j11, 0L, j10, true, false, true, iVar, g(), null);
    }

    public final long J(f fVar) {
        if (fVar.f17507p) {
            return AbstractC1117K.J0(AbstractC1117K.f0(this.f9264q)) - fVar.e();
        }
        return 0L;
    }

    public final long K(f fVar, long j6) {
        long j7 = fVar.f17496e;
        if (j7 == -9223372036854775807L) {
            j7 = (fVar.f17512u + j6) - AbstractC1117K.J0(this.f9266s.f7138a);
        }
        if (fVar.f17498g) {
            return j7;
        }
        f.b H6 = H(fVar.f17510s, j7);
        if (H6 != null) {
            return H6.f17525e;
        }
        if (fVar.f17509r.isEmpty()) {
            return 0L;
        }
        f.d I6 = I(fVar.f17509r, j7);
        f.b H7 = H(I6.f17520m, j7);
        return H7 != null ? H7.f17525e : I6.f17525e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(n1.f r5, long r6) {
        /*
            r4 = this;
            Z0.u r0 = r4.g()
            Z0.u$g r0 = r0.f7066d
            float r1 = r0.f7141d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f7142e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            n1.f$f r5 = r5.f17513v
            long r0 = r5.f17534c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f17535d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            Z0.u$g$a r0 = new Z0.u$g$a
            r0.<init>()
            long r6 = c1.AbstractC1117K.k1(r6)
            Z0.u$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            Z0.u$g r0 = r4.f9266s
            float r0 = r0.f7141d
        L42:
            Z0.u$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            Z0.u$g r5 = r4.f9266s
            float r7 = r5.f7142e
        L4d:
            Z0.u$g$a r5 = r6.h(r7)
            Z0.u$g r5 = r5.f()
            r4.f9266s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.M(n1.f, long):void");
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, b bVar2, long j6) {
        K.a x6 = x(bVar);
        return new m(this.f9255h, this.f9263p, this.f9256i, this.f9267t, null, this.f9258k, v(bVar), this.f9259l, x6, bVar2, this.f9257j, this.f9260m, this.f9261n, this.f9262o, A(), this.f9265r);
    }

    @Override // w1.InterfaceC2212D
    public synchronized Z0.u g() {
        return this.f9268u;
    }

    @Override // n1.k.e
    public void k(f fVar) {
        long k12 = fVar.f17507p ? AbstractC1117K.k1(fVar.f17499h) : -9223372036854775807L;
        int i6 = fVar.f17495d;
        long j6 = (i6 == 2 || i6 == 1) ? k12 : -9223372036854775807L;
        i iVar = new i((n1.g) AbstractC1119a.e(this.f9263p.h()), fVar);
        D(this.f9263p.g() ? F(fVar, j6, k12, iVar) : G(fVar, j6, k12, iVar));
    }

    @Override // w1.InterfaceC2212D
    public void l() {
        this.f9263p.l();
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((m) interfaceC2211C).C();
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(Z0.u uVar) {
        this.f9268u = uVar;
    }

    public HlsMediaSource(Z0.u uVar, g gVar, h hVar, InterfaceC2225j interfaceC2225j, A1.e eVar, l1.u uVar2, A1.k kVar, k kVar2, long j6, boolean z6, int i6, boolean z7, long j7) {
        this.f9268u = uVar;
        this.f9266s = uVar.f7066d;
        this.f9256i = gVar;
        this.f9255h = hVar;
        this.f9257j = interfaceC2225j;
        this.f9258k = uVar2;
        this.f9259l = kVar;
        this.f9263p = kVar2;
        this.f9264q = j6;
        this.f9260m = z6;
        this.f9261n = i6;
        this.f9262o = z7;
        this.f9265r = j7;
    }
}
