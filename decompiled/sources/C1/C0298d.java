package C1;

import C1.C;
import C1.C0298d;
import C1.q;
import Z0.C0836h;
import Z0.D;
import Z0.InterfaceC0839k;
import Z0.InterfaceC0842n;
import Z0.K;
import Z0.L;
import Z0.M;
import Z0.N;
import Z0.q;
import Z0.r;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.C1107A;
import c1.InterfaceC1121c;
import c1.InterfaceC1129k;
import g1.C1342l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: C1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0298d implements D, M {

    /* renamed from: n, reason: collision with root package name */
    public static final Executor f468n = new Executor() { // from class: C1.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0298d.d(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Context f469a;

    /* renamed from: b, reason: collision with root package name */
    public final h f470b;

    /* renamed from: c, reason: collision with root package name */
    public final n f471c;

    /* renamed from: d, reason: collision with root package name */
    public final q f472d;

    /* renamed from: e, reason: collision with root package name */
    public final D.a f473e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1121c f474f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f475g;

    /* renamed from: h, reason: collision with root package name */
    public Z0.q f476h;

    /* renamed from: i, reason: collision with root package name */
    public m f477i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1129k f478j;

    /* renamed from: k, reason: collision with root package name */
    public Pair f479k;

    /* renamed from: l, reason: collision with root package name */
    public int f480l;

    /* renamed from: m, reason: collision with root package name */
    public int f481m;

    /* renamed from: C1.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f482a;

        /* renamed from: b, reason: collision with root package name */
        public final n f483b;

        /* renamed from: c, reason: collision with root package name */
        public L.a f484c;

        /* renamed from: d, reason: collision with root package name */
        public D.a f485d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC1121c f486e = InterfaceC1121c.f10577a;

        /* renamed from: f, reason: collision with root package name */
        public boolean f487f;

        public b(Context context, n nVar) {
            this.f482a = context.getApplicationContext();
            this.f483b = nVar;
        }

        public C0298d e() {
            AbstractC1119a.g(!this.f487f);
            if (this.f485d == null) {
                if (this.f484c == null) {
                    this.f484c = new e();
                }
                this.f485d = new f(this.f484c);
            }
            C0298d c0298d = new C0298d(this);
            this.f487f = true;
            return c0298d;
        }

        public b f(InterfaceC1121c interfaceC1121c) {
            this.f486e = interfaceC1121c;
            return this;
        }
    }

    /* renamed from: C1.d$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements q.a {
        public c() {
        }

        @Override // C1.q.a
        public void a(N n6) {
            C0298d.this.f476h = new q.b().v0(n6.f6824a).Y(n6.f6825b).o0("video/raw").K();
            Iterator it = C0298d.this.f475g.iterator();
            while (it.hasNext()) {
                ((InterfaceC0016d) it.next()).e(C0298d.this, n6);
            }
        }

        @Override // C1.q.a
        public void b(long j6, long j7, long j8, boolean z6) {
            if (z6 && C0298d.this.f479k != null) {
                Iterator it = C0298d.this.f475g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0016d) it.next()).a(C0298d.this);
                }
            }
            if (C0298d.this.f477i != null) {
                C0298d.this.f477i.g(j7, C0298d.this.f474f.c(), C0298d.this.f476h == null ? new q.b().K() : C0298d.this.f476h, null);
            }
            C0298d.q(C0298d.this);
            android.support.v4.media.session.b.a(AbstractC1119a.i(null));
            throw null;
        }

        @Override // C1.q.a
        public void c() {
            Iterator it = C0298d.this.f475g.iterator();
            while (it.hasNext()) {
                ((InterfaceC0016d) it.next()).b(C0298d.this);
            }
            C0298d.q(C0298d.this);
            android.support.v4.media.session.b.a(AbstractC1119a.i(null));
            throw null;
        }
    }

    /* renamed from: C1.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0016d {
        void a(C0298d c0298d);

        void b(C0298d c0298d);

        void e(C0298d c0298d, N n6);
    }

    /* renamed from: C1.d$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements L.a {

        /* renamed from: a, reason: collision with root package name */
        public static final y6.u f489a = y6.v.a(new y6.u() { // from class: C1.e
            public final Object get() {
                return C0298d.e.a();
            }
        });

        public e() {
        }

        public static /* synthetic */ L.a a() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (L.a) AbstractC1119a.e(cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    /* renamed from: C1.d$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f implements D.a {

        /* renamed from: a, reason: collision with root package name */
        public final L.a f490a;

        public f(L.a aVar) {
            this.f490a = aVar;
        }

        @Override // Z0.D.a
        public Z0.D a(Context context, C0836h c0836h, InterfaceC0839k interfaceC0839k, M m6, Executor executor, List list, long j6) {
            try {
                ((D.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(L.a.class).newInstance(this.f490a)).a(context, c0836h, interfaceC0839k, m6, executor, list, j6);
                return null;
            } catch (Exception e6) {
                throw K.a(e6);
            }
        }
    }

    /* renamed from: C1.d$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static Constructor f491a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f492b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f493c;

        public static InterfaceC0842n a(float f6) {
            try {
                b();
                Object newInstance = f491a.newInstance(new Object[0]);
                f492b.invoke(newInstance, Float.valueOf(f6));
                android.support.v4.media.session.b.a(AbstractC1119a.e(f493c.invoke(newInstance, new Object[0])));
                return null;
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }

        public static void b() {
            if (f491a == null || f492b == null || f493c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f491a = cls.getConstructor(new Class[0]);
                f492b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f493c = cls.getMethod("build", new Class[0]);
            }
        }
    }

    /* renamed from: C1.d$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class h implements C, InterfaceC0016d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f494a;

        /* renamed from: b, reason: collision with root package name */
        public final int f495b;

        /* renamed from: d, reason: collision with root package name */
        public Z0.q f497d;

        /* renamed from: e, reason: collision with root package name */
        public int f498e;

        /* renamed from: f, reason: collision with root package name */
        public long f499f;

        /* renamed from: g, reason: collision with root package name */
        public long f500g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f501h;

        /* renamed from: k, reason: collision with root package name */
        public boolean f504k;

        /* renamed from: l, reason: collision with root package name */
        public long f505l;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f496c = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public long f502i = -9223372036854775807L;

        /* renamed from: j, reason: collision with root package name */
        public long f503j = -9223372036854775807L;

        /* renamed from: m, reason: collision with root package name */
        public C.a f506m = C.a.f464a;

        /* renamed from: n, reason: collision with root package name */
        public Executor f507n = C0298d.f468n;

        public h(Context context) {
            this.f494a = context;
            this.f495b = AbstractC1117K.d0(context);
        }

        public static /* synthetic */ void A(h hVar, C.a aVar, N n6) {
            hVar.getClass();
            aVar.a(hVar, n6);
        }

        public static /* synthetic */ void f(h hVar, C.a aVar) {
            hVar.getClass();
            aVar.c((C) AbstractC1119a.i(hVar));
        }

        public static /* synthetic */ void g(h hVar, C.a aVar) {
            hVar.getClass();
            aVar.b(hVar);
        }

        public final void B() {
            if (this.f497d == null) {
                return;
            }
            new ArrayList().addAll(this.f496c);
            Z0.q qVar = (Z0.q) AbstractC1119a.e(this.f497d);
            android.support.v4.media.session.b.a(AbstractC1119a.i(null));
            new r.b(C0298d.y(qVar.f6965A), qVar.f6996t, qVar.f6997u).b(qVar.f7000x).a();
            throw null;
        }

        public void C(List list) {
            this.f496c.clear();
            this.f496c.addAll(list);
        }

        @Override // C1.C0298d.InterfaceC0016d
        public void a(C0298d c0298d) {
            final C.a aVar = this.f506m;
            this.f507n.execute(new Runnable() { // from class: C1.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0298d.h.g(C0298d.h.this, aVar);
                }
            });
        }

        @Override // C1.C0298d.InterfaceC0016d
        public void b(C0298d c0298d) {
            final C.a aVar = this.f506m;
            this.f507n.execute(new Runnable() { // from class: C1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0298d.h.f(C0298d.h.this, aVar);
                }
            });
        }

        @Override // C1.C
        public boolean c() {
            return isInitialized() && C0298d.this.C();
        }

        @Override // C1.C
        public boolean d() {
            if (!isInitialized()) {
                return false;
            }
            long j6 = this.f502i;
            return j6 != -9223372036854775807L && C0298d.this.z(j6);
        }

        @Override // C1.C0298d.InterfaceC0016d
        public void e(C0298d c0298d, final N n6) {
            final C.a aVar = this.f506m;
            this.f507n.execute(new Runnable() { // from class: C1.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0298d.h.A(C0298d.h.this, aVar, n6);
                }
            });
        }

        @Override // C1.C
        public void h() {
            C0298d.this.f471c.a();
        }

        @Override // C1.C
        public void i(long j6, long j7) {
            try {
                C0298d.this.F(j6, j7);
            } catch (C1342l e6) {
                Z0.q qVar = this.f497d;
                if (qVar == null) {
                    qVar = new q.b().K();
                }
                throw new C.b(e6, qVar);
            }
        }

        @Override // C1.C
        public boolean isInitialized() {
            return false;
        }

        @Override // C1.C
        public Surface j() {
            AbstractC1119a.g(isInitialized());
            android.support.v4.media.session.b.a(AbstractC1119a.i(null));
            throw null;
        }

        @Override // C1.C
        public void k() {
            C0298d.this.f471c.k();
        }

        @Override // C1.C
        public void l(Surface surface, C1107A c1107a) {
            C0298d.this.G(surface, c1107a);
        }

        @Override // C1.C
        public void m(int i6, Z0.q qVar) {
            int i7;
            AbstractC1119a.g(isInitialized());
            if (i6 != 1 && i6 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i6);
            }
            C0298d.this.f471c.p(qVar.f6998v);
            if (i6 == 1 && AbstractC1117K.f10560a < 21 && (i7 = qVar.f6999w) != -1 && i7 != 0) {
                g.a(i7);
            }
            this.f498e = i6;
            this.f497d = qVar;
            if (this.f504k) {
                AbstractC1119a.g(this.f503j != -9223372036854775807L);
                this.f505l = this.f503j;
            } else {
                B();
                this.f504k = true;
                this.f505l = -9223372036854775807L;
            }
        }

        @Override // C1.C
        public void n(C.a aVar, Executor executor) {
            this.f506m = aVar;
            this.f507n = executor;
        }

        @Override // C1.C
        public void o(Z0.q qVar) {
            AbstractC1119a.g(!isInitialized());
            C0298d.t(C0298d.this, qVar);
        }

        @Override // C1.C
        public void p() {
            C0298d.this.f471c.g();
        }

        @Override // C1.C
        public void q(float f6) {
            C0298d.this.H(f6);
        }

        @Override // C1.C
        public void r() {
            C0298d.this.v();
        }

        @Override // C1.C
        public void release() {
            C0298d.this.E();
        }

        @Override // C1.C
        public long s(long j6, boolean z6) {
            AbstractC1119a.g(isInitialized());
            AbstractC1119a.g(this.f495b != -1);
            long j7 = this.f505l;
            if (j7 != -9223372036854775807L) {
                if (!C0298d.this.z(j7)) {
                    return -9223372036854775807L;
                }
                B();
                this.f505l = -9223372036854775807L;
            }
            android.support.v4.media.session.b.a(AbstractC1119a.i(null));
            throw null;
        }

        @Override // C1.C
        public void t(boolean z6) {
            if (isInitialized()) {
                throw null;
            }
            this.f504k = false;
            this.f502i = -9223372036854775807L;
            this.f503j = -9223372036854775807L;
            C0298d.this.w();
            if (z6) {
                C0298d.this.f471c.m();
            }
        }

        @Override // C1.C
        public void u() {
            C0298d.this.f471c.l();
        }

        @Override // C1.C
        public void v(List list) {
            if (this.f496c.equals(list)) {
                return;
            }
            C(list);
            B();
        }

        @Override // C1.C
        public void w(long j6, long j7) {
            this.f501h |= (this.f499f == j6 && this.f500g == j7) ? false : true;
            this.f499f = j6;
            this.f500g = j7;
        }

        @Override // C1.C
        public boolean x() {
            return AbstractC1117K.C0(this.f494a);
        }

        @Override // C1.C
        public void y(m mVar) {
            C0298d.this.I(mVar);
        }

        @Override // C1.C
        public void z(boolean z6) {
            C0298d.this.f471c.h(z6);
        }
    }

    public static /* synthetic */ void d(Runnable runnable) {
    }

    public static /* synthetic */ Z0.D q(C0298d c0298d) {
        c0298d.getClass();
        return null;
    }

    public static /* synthetic */ L t(C0298d c0298d, Z0.q qVar) {
        c0298d.A(qVar);
        return null;
    }

    public static C0836h y(C0836h c0836h) {
        return (c0836h == null || !c0836h.g()) ? C0836h.f6884h : c0836h;
    }

    public final L A(Z0.q qVar) {
        AbstractC1119a.g(this.f481m == 0);
        C0836h y6 = y(qVar.f6965A);
        if (y6.f6894c == 7 && AbstractC1117K.f10560a < 34) {
            y6 = y6.a().e(6).a();
        }
        C0836h c0836h = y6;
        final InterfaceC1129k e6 = this.f474f.e((Looper) AbstractC1119a.i(Looper.myLooper()), null);
        this.f478j = e6;
        try {
            D.a aVar = this.f473e;
            Context context = this.f469a;
            InterfaceC0839k interfaceC0839k = InterfaceC0839k.f6905a;
            Objects.requireNonNull(e6);
            try {
                aVar.a(context, c0836h, interfaceC0839k, this, new Executor() { // from class: C1.a
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        InterfaceC1129k.this.c(runnable);
                    }
                }, z6.w.w(), 0L);
                Pair pair = this.f479k;
                if (pair == null) {
                    throw null;
                }
                Surface surface = (Surface) pair.first;
                C1107A c1107a = (C1107A) pair.second;
                D(surface, c1107a.b(), c1107a.a());
                throw null;
            } catch (K e7) {
                e = e7;
                throw new C.b(e, qVar);
            }
        } catch (K e8) {
            e = e8;
        }
    }

    public final boolean B() {
        return this.f481m == 1;
    }

    public final boolean C() {
        return this.f480l == 0 && this.f472d.e();
    }

    public final void D(Surface surface, int i6, int i7) {
    }

    public void E() {
        if (this.f481m == 2) {
            return;
        }
        InterfaceC1129k interfaceC1129k = this.f478j;
        if (interfaceC1129k != null) {
            interfaceC1129k.j(null);
        }
        this.f479k = null;
        this.f481m = 2;
    }

    public void F(long j6, long j7) {
        if (this.f480l == 0) {
            this.f472d.h(j6, j7);
        }
    }

    public void G(Surface surface, C1107A c1107a) {
        Pair pair = this.f479k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C1107A) this.f479k.second).equals(c1107a)) {
            return;
        }
        this.f479k = Pair.create(surface, c1107a);
        D(surface, c1107a.b(), c1107a.a());
    }

    public final void H(float f6) {
        this.f472d.j(f6);
    }

    public final void I(m mVar) {
        this.f477i = mVar;
    }

    @Override // C1.D
    public n a() {
        return this.f471c;
    }

    @Override // C1.D
    public C b() {
        return this.f470b;
    }

    public void u(InterfaceC0016d interfaceC0016d) {
        this.f475g.add(interfaceC0016d);
    }

    public void v() {
        C1107A c1107a = C1107A.f10543c;
        D(null, c1107a.b(), c1107a.a());
        this.f479k = null;
    }

    public final void w() {
        if (B()) {
            this.f480l++;
            this.f472d.b();
            ((InterfaceC1129k) AbstractC1119a.i(this.f478j)).c(new Runnable() { // from class: C1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0298d.this.x();
                }
            });
        }
    }

    public final void x() {
        int i6 = this.f480l - 1;
        this.f480l = i6;
        if (i6 > 0) {
            return;
        }
        if (i6 < 0) {
            throw new IllegalStateException(String.valueOf(this.f480l));
        }
        this.f472d.b();
    }

    public final boolean z(long j6) {
        return this.f480l == 0 && this.f472d.d(j6);
    }

    public C0298d(b bVar) {
        Context context = bVar.f482a;
        this.f469a = context;
        h hVar = new h(context);
        this.f470b = hVar;
        InterfaceC1121c interfaceC1121c = bVar.f486e;
        this.f474f = interfaceC1121c;
        n nVar = bVar.f483b;
        this.f471c = nVar;
        nVar.o(interfaceC1121c);
        this.f472d = new q(new c(), nVar);
        this.f473e = (D.a) AbstractC1119a.i(bVar.f485d);
        this.f475g = new CopyOnWriteArraySet();
        this.f481m = 0;
        u(hVar);
    }
}
