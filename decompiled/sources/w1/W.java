package w1;

import Z0.G;
import Z0.u;
import android.os.Looper;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.InterfaceC1248f;
import e1.InterfaceC1266x;
import h1.v1;
import l1.C1742l;
import w1.InterfaceC2212D;
import w1.P;
import w1.V;
import w1.W;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class W extends AbstractC2216a implements V.c {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1248f.a f19885h;

    /* renamed from: i, reason: collision with root package name */
    public final P.a f19886i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.u f19887j;

    /* renamed from: k, reason: collision with root package name */
    public final A1.k f19888k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19889l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19890m;

    /* renamed from: n, reason: collision with root package name */
    public long f19891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19892o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19893p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1266x f19894q;

    /* renamed from: r, reason: collision with root package name */
    public Z0.u f19895r;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC2237w {
        public a(Z0.G g6) {
            super(g6);
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            super.g(i6, bVar, z6);
            bVar.f6666f = true;
            return bVar;
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.c o(int i6, G.c cVar, long j6) {
            super.o(i6, cVar, j6);
            cVar.f6694k = true;
            return cVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements L {

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1248f.a f19897c;

        /* renamed from: d, reason: collision with root package name */
        public P.a f19898d;

        /* renamed from: e, reason: collision with root package name */
        public l1.w f19899e;

        /* renamed from: f, reason: collision with root package name */
        public A1.k f19900f;

        /* renamed from: g, reason: collision with root package name */
        public int f19901g;

        public b(InterfaceC1248f.a aVar, final E1.u uVar) {
            this(aVar, new P.a() { // from class: w1.X
                @Override // w1.P.a
                public final P a(v1 v1Var) {
                    return W.b.f(E1.u.this, v1Var);
                }
            });
        }

        public static /* synthetic */ P f(E1.u uVar, v1 v1Var) {
            return new C2219d(uVar);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public W d(Z0.u uVar) {
            AbstractC1119a.e(uVar.f7064b);
            return new W(uVar, this.f19897c, this.f19898d, this.f19899e.a(uVar), this.f19900f, this.f19901g, null);
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b e(l1.w wVar) {
            this.f19899e = (l1.w) AbstractC1119a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // w1.InterfaceC2212D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b c(A1.k kVar) {
            this.f19900f = (A1.k) AbstractC1119a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC1248f.a aVar, P.a aVar2) {
            this(aVar, aVar2, new C1742l(), new A1.j(), 1048576);
        }

        public b(InterfaceC1248f.a aVar, P.a aVar2, l1.w wVar, A1.k kVar, int i6) {
            this.f19897c = aVar;
            this.f19898d = aVar2;
            this.f19899e = wVar;
            this.f19900f = kVar;
            this.f19901g = i6;
        }
    }

    public /* synthetic */ W(Z0.u uVar, InterfaceC1248f.a aVar, P.a aVar2, l1.u uVar2, A1.k kVar, int i6, a aVar3) {
        this(uVar, aVar, aVar2, uVar2, kVar, i6);
    }

    private void G() {
        Z0.G e0Var = new e0(this.f19891n, this.f19892o, false, this.f19893p, null, g());
        if (this.f19890m) {
            e0Var = new a(e0Var);
        }
        D(e0Var);
    }

    @Override // w1.AbstractC2216a
    public void C(InterfaceC1266x interfaceC1266x) {
        this.f19894q = interfaceC1266x;
        this.f19887j.a((Looper) AbstractC1119a.e(Looper.myLooper()), A());
        this.f19887j.h();
        G();
    }

    @Override // w1.AbstractC2216a
    public void E() {
        this.f19887j.release();
    }

    public final u.h F() {
        return (u.h) AbstractC1119a.e(g().f7064b);
    }

    @Override // w1.InterfaceC2212D
    public InterfaceC2211C d(InterfaceC2212D.b bVar, A1.b bVar2, long j6) {
        InterfaceC1248f a6 = this.f19885h.a();
        InterfaceC1266x interfaceC1266x = this.f19894q;
        if (interfaceC1266x != null) {
            a6.l(interfaceC1266x);
        }
        u.h F6 = F();
        return new V(F6.f7156a, a6, this.f19886i.a(A()), this.f19887j, v(bVar), this.f19888k, x(bVar), this, bVar2, F6.f7160e, this.f19889l, AbstractC1117K.J0(F6.f7164i));
    }

    @Override // w1.V.c
    public void e(long j6, boolean z6, boolean z7) {
        if (j6 == -9223372036854775807L) {
            j6 = this.f19891n;
        }
        if (!this.f19890m && this.f19891n == j6 && this.f19892o == z6 && this.f19893p == z7) {
            return;
        }
        this.f19891n = j6;
        this.f19892o = z6;
        this.f19893p = z7;
        this.f19890m = false;
        G();
    }

    @Override // w1.InterfaceC2212D
    public synchronized Z0.u g() {
        return this.f19895r;
    }

    @Override // w1.InterfaceC2212D
    public void l() {
    }

    @Override // w1.InterfaceC2212D
    public void r(InterfaceC2211C interfaceC2211C) {
        ((V) interfaceC2211C).d0();
    }

    @Override // w1.InterfaceC2212D
    public synchronized void s(Z0.u uVar) {
        this.f19895r = uVar;
    }

    public W(Z0.u uVar, InterfaceC1248f.a aVar, P.a aVar2, l1.u uVar2, A1.k kVar, int i6) {
        this.f19895r = uVar;
        this.f19885h = aVar;
        this.f19886i = aVar2;
        this.f19887j = uVar2;
        this.f19888k = kVar;
        this.f19889l = i6;
        this.f19890m = true;
        this.f19891n = -9223372036854775807L;
    }
}
