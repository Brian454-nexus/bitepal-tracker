package w1;

import E1.C0310l;
import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import E1.J;
import Z0.q;
import Z0.u;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import b2.C1084h;
import b2.s;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import e1.C1253k;
import e1.InterfaceC1248f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import w1.C2236v;
import w1.InterfaceC2212D;
import w1.W;
import w1.g0;
import w1.r;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r implements L {

    /* renamed from: c, reason: collision with root package name */
    public final a f20086c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1248f.a f20087d;

    /* renamed from: e, reason: collision with root package name */
    public s.a f20088e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2212D.a f20089f;

    /* renamed from: g, reason: collision with root package name */
    public A1.k f20090g;

    /* renamed from: h, reason: collision with root package name */
    public long f20091h;

    /* renamed from: i, reason: collision with root package name */
    public long f20092i;

    /* renamed from: j, reason: collision with root package name */
    public long f20093j;

    /* renamed from: k, reason: collision with root package name */
    public float f20094k;

    /* renamed from: l, reason: collision with root package name */
    public float f20095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20096m;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final E1.u f20097a;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1248f.a f20100d;

        /* renamed from: f, reason: collision with root package name */
        public s.a f20102f;

        /* renamed from: g, reason: collision with root package name */
        public l1.w f20103g;

        /* renamed from: h, reason: collision with root package name */
        public A1.k f20104h;

        /* renamed from: b, reason: collision with root package name */
        public final Map f20098b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map f20099c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public boolean f20101e = true;

        public a(E1.u uVar, s.a aVar) {
            this.f20097a = uVar;
            this.f20102f = aVar;
        }

        public static /* synthetic */ InterfaceC2212D.a c(a aVar, InterfaceC1248f.a aVar2) {
            aVar.getClass();
            return new W.b(aVar2, aVar.f20097a);
        }

        public InterfaceC2212D.a f(int i6) {
            InterfaceC2212D.a aVar = (InterfaceC2212D.a) this.f20099c.get(Integer.valueOf(i6));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC2212D.a aVar2 = (InterfaceC2212D.a) g(i6).get();
            l1.w wVar = this.f20103g;
            if (wVar != null) {
                aVar2.e(wVar);
            }
            A1.k kVar = this.f20104h;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            aVar2.a(this.f20102f);
            aVar2.b(this.f20101e);
            this.f20099c.put(Integer.valueOf(i6), aVar2);
            return aVar2;
        }

        public final y6.u g(int i6) {
            y6.u uVar;
            y6.u uVar2;
            y6.u uVar3 = (y6.u) this.f20098b.get(Integer.valueOf(i6));
            if (uVar3 != null) {
                return uVar3;
            }
            final InterfaceC1248f.a aVar = (InterfaceC1248f.a) AbstractC1119a.e(this.f20100d);
            if (i6 == 0) {
                int i7 = DashMediaSource.Factory.f9153k;
                final Class asSubclass = DashMediaSource.Factory.class.asSubclass(InterfaceC2212D.a.class);
                uVar = new y6.u() { // from class: w1.m
                    public final Object get() {
                        InterfaceC2212D.a m6;
                        m6 = r.m(asSubclass, aVar);
                        return m6;
                    }
                };
            } else if (i6 == 1) {
                int i8 = SsMediaSource.Factory.f9446j;
                final Class asSubclass2 = SsMediaSource.Factory.class.asSubclass(InterfaceC2212D.a.class);
                uVar = new y6.u() { // from class: w1.n
                    public final Object get() {
                        InterfaceC2212D.a m6;
                        m6 = r.m(asSubclass2, aVar);
                        return m6;
                    }
                };
            } else {
                if (i6 != 2) {
                    if (i6 == 3) {
                        int i9 = RtspMediaSource.Factory.f9292h;
                        final Class asSubclass3 = RtspMediaSource.Factory.class.asSubclass(InterfaceC2212D.a.class);
                        uVar2 = new y6.u() { // from class: w1.p
                            public final Object get() {
                                InterfaceC2212D.a l6;
                                l6 = r.l(asSubclass3);
                                return l6;
                            }
                        };
                    } else {
                        if (i6 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i6);
                        }
                        uVar2 = new y6.u() { // from class: w1.q
                            public final Object get() {
                                return r.a.c(r.a.this, aVar);
                            }
                        };
                    }
                    this.f20098b.put(Integer.valueOf(i6), uVar2);
                    return uVar2;
                }
                int i10 = HlsMediaSource.Factory.f9269o;
                final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(InterfaceC2212D.a.class);
                uVar = new y6.u() { // from class: w1.o
                    public final Object get() {
                        InterfaceC2212D.a m6;
                        m6 = r.m(asSubclass4, aVar);
                        return m6;
                    }
                };
            }
            uVar2 = uVar;
            this.f20098b.put(Integer.valueOf(i6), uVar2);
            return uVar2;
        }

        public void h(InterfaceC1248f.a aVar) {
            if (aVar != this.f20100d) {
                this.f20100d = aVar;
                this.f20098b.clear();
                this.f20099c.clear();
            }
        }

        public void i(l1.w wVar) {
            this.f20103g = wVar;
            Iterator it = this.f20099c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2212D.a) it.next()).e(wVar);
            }
        }

        public void j(int i6) {
            E1.u uVar = this.f20097a;
            if (uVar instanceof C0310l) {
                ((C0310l) uVar).l(i6);
            }
        }

        public void k(A1.k kVar) {
            this.f20104h = kVar;
            Iterator it = this.f20099c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2212D.a) it.next()).c(kVar);
            }
        }

        public void l(boolean z6) {
            this.f20101e = z6;
            this.f20097a.d(z6);
            Iterator it = this.f20099c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2212D.a) it.next()).b(z6);
            }
        }

        public void m(s.a aVar) {
            this.f20102f = aVar;
            this.f20097a.a(aVar);
            Iterator it = this.f20099c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2212D.a) it.next()).a(aVar);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC0314p {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f20105a;

        public b(Z0.q qVar) {
            this.f20105a = qVar;
        }

        @Override // E1.InterfaceC0314p
        public void a(long j6, long j7) {
        }

        @Override // E1.InterfaceC0314p
        public void c(E1.r rVar) {
            E1.O a6 = rVar.a(0, 3);
            rVar.n(new J.b(-9223372036854775807L));
            rVar.k();
            a6.e(this.f20105a.a().o0("text/x-unknown").O(this.f20105a.f6990n).K());
        }

        @Override // E1.InterfaceC0314p
        public int g(InterfaceC0315q interfaceC0315q, E1.I i6) {
            return interfaceC0315q.k(IntCompanionObject.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // E1.InterfaceC0314p
        public boolean i(InterfaceC0315q interfaceC0315q) {
            return true;
        }

        @Override // E1.InterfaceC0314p
        public void release() {
        }
    }

    public r(Context context) {
        this(new C1253k.a(context));
    }

    public static /* synthetic */ InterfaceC0314p[] f(r rVar, Z0.q qVar) {
        return new InterfaceC0314p[]{rVar.f20088e.b(qVar) ? new b2.o(rVar.f20088e.c(qVar), qVar) : new b(qVar)};
    }

    public static InterfaceC2212D j(Z0.u uVar, InterfaceC2212D interfaceC2212D) {
        u.d dVar = uVar.f7068f;
        if (dVar.f7093b == 0 && dVar.f7095d == Long.MIN_VALUE && !dVar.f7097f) {
            return interfaceC2212D;
        }
        u.d dVar2 = uVar.f7068f;
        return new C2221f(interfaceC2212D, dVar2.f7093b, dVar2.f7095d, !dVar2.f7098g, dVar2.f7096e, dVar2.f7097f);
    }

    public static InterfaceC2212D.a l(Class cls) {
        try {
            return (InterfaceC2212D.a) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static InterfaceC2212D.a m(Class cls, InterfaceC1248f.a aVar) {
        try {
            return (InterfaceC2212D.a) cls.getConstructor(InterfaceC1248f.a.class).newInstance(aVar);
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    @Override // w1.InterfaceC2212D.a
    public InterfaceC2212D d(Z0.u uVar) {
        AbstractC1119a.e(uVar.f7064b);
        String scheme = uVar.f7064b.f7156a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC2212D.a) AbstractC1119a.e(this.f20089f)).d(uVar);
        }
        if (Objects.equals(uVar.f7064b.f7157b, "application/x-image-uri")) {
            long J02 = AbstractC1117K.J0(uVar.f7064b.f7164i);
            android.support.v4.media.session.b.a(AbstractC1119a.e(null));
            return new C2236v.b(J02, null).d(uVar);
        }
        u.h hVar = uVar.f7064b;
        int v02 = AbstractC1117K.v0(hVar.f7156a, hVar.f7157b);
        if (uVar.f7064b.f7164i != -9223372036854775807L) {
            this.f20086c.j(1);
        }
        try {
            InterfaceC2212D.a f6 = this.f20086c.f(v02);
            u.g.a a6 = uVar.f7066d.a();
            if (uVar.f7066d.f7138a == -9223372036854775807L) {
                a6.k(this.f20091h);
            }
            if (uVar.f7066d.f7141d == -3.4028235E38f) {
                a6.j(this.f20094k);
            }
            if (uVar.f7066d.f7142e == -3.4028235E38f) {
                a6.h(this.f20095l);
            }
            if (uVar.f7066d.f7139b == -9223372036854775807L) {
                a6.i(this.f20092i);
            }
            if (uVar.f7066d.f7140c == -9223372036854775807L) {
                a6.g(this.f20093j);
            }
            u.g f7 = a6.f();
            if (!f7.equals(uVar.f7066d)) {
                uVar = uVar.a().b(f7).a();
            }
            InterfaceC2212D d6 = f6.d(uVar);
            z6.w wVar = ((u.h) AbstractC1117K.i(uVar.f7064b)).f7161f;
            if (!wVar.isEmpty()) {
                InterfaceC2212D[] interfaceC2212DArr = new InterfaceC2212D[wVar.size() + 1];
                interfaceC2212DArr[0] = d6;
                for (int i6 = 0; i6 < wVar.size(); i6++) {
                    if (this.f20096m) {
                        final Z0.q K5 = new q.b().o0(((u.k) wVar.get(i6)).f7176b).e0(((u.k) wVar.get(i6)).f7177c).q0(((u.k) wVar.get(i6)).f7178d).m0(((u.k) wVar.get(i6)).f7179e).c0(((u.k) wVar.get(i6)).f7180f).a0(((u.k) wVar.get(i6)).f7181g).K();
                        W.b bVar = new W.b(this.f20087d, new E1.u() { // from class: w1.l
                            @Override // E1.u
                            public final InterfaceC0314p[] c() {
                                return r.f(r.this, K5);
                            }
                        });
                        A1.k kVar = this.f20090g;
                        if (kVar != null) {
                            bVar.c(kVar);
                        }
                        interfaceC2212DArr[i6 + 1] = bVar.d(Z0.u.b(((u.k) wVar.get(i6)).f7175a.toString()));
                    } else {
                        g0.b bVar2 = new g0.b(this.f20087d);
                        A1.k kVar2 = this.f20090g;
                        if (kVar2 != null) {
                            bVar2.b(kVar2);
                        }
                        interfaceC2212DArr[i6 + 1] = bVar2.a((u.k) wVar.get(i6), -9223372036854775807L);
                    }
                }
                d6 = new O(interfaceC2212DArr);
            }
            return k(uVar, j(uVar, d6));
        } catch (ClassNotFoundException e6) {
            throw new IllegalStateException(e6);
        }
    }

    @Override // w1.InterfaceC2212D.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public r b(boolean z6) {
        this.f20096m = z6;
        this.f20086c.l(z6);
        return this;
    }

    public final InterfaceC2212D k(Z0.u uVar, InterfaceC2212D interfaceC2212D) {
        AbstractC1119a.e(uVar.f7064b);
        uVar.f7064b.getClass();
        return interfaceC2212D;
    }

    public r n(InterfaceC1248f.a aVar) {
        this.f20087d = aVar;
        this.f20086c.h(aVar);
        return this;
    }

    @Override // w1.InterfaceC2212D.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public r e(l1.w wVar) {
        this.f20086c.i((l1.w) AbstractC1119a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // w1.InterfaceC2212D.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public r c(A1.k kVar) {
        this.f20090g = (A1.k) AbstractC1119a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f20086c.k(kVar);
        return this;
    }

    @Override // w1.InterfaceC2212D.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public r a(s.a aVar) {
        this.f20088e = (s.a) AbstractC1119a.e(aVar);
        this.f20086c.m(aVar);
        return this;
    }

    public r(Context context, E1.u uVar) {
        this(new C1253k.a(context), uVar);
    }

    public r(InterfaceC1248f.a aVar) {
        this(aVar, new C0310l());
    }

    public r(InterfaceC1248f.a aVar, E1.u uVar) {
        this.f20087d = aVar;
        C1084h c1084h = new C1084h();
        this.f20088e = c1084h;
        a aVar2 = new a(uVar, c1084h);
        this.f20086c = aVar2;
        aVar2.h(aVar);
        this.f20091h = -9223372036854775807L;
        this.f20092i = -9223372036854775807L;
        this.f20093j = -9223372036854775807L;
        this.f20094k = -3.4028235E38f;
        this.f20095l = -3.4028235E38f;
        this.f20096m = true;
    }
}
