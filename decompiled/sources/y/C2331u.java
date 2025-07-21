package y;

import E.j;
import F.AbstractC0335i0;
import F.InterfaceC0341m;
import I.A;
import I.AbstractC0442n;
import I.C0444o;
import I.InterfaceC0455u;
import I.L0;
import I.N;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import l0.AbstractC1728c;
import x.C2253a;
import y.C2331u;
import z.C2362A;

/* renamed from: y.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2331u implements I.A {

    /* renamed from: b, reason: collision with root package name */
    public final b f21077b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21078c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21079d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final C2362A f21080e;

    /* renamed from: f, reason: collision with root package name */
    public final A.c f21081f;

    /* renamed from: g, reason: collision with root package name */
    public final L0.b f21082g;

    /* renamed from: h, reason: collision with root package name */
    public final U0 f21083h;

    /* renamed from: i, reason: collision with root package name */
    public final A1 f21084i;

    /* renamed from: j, reason: collision with root package name */
    public final x1 f21085j;

    /* renamed from: k, reason: collision with root package name */
    public final I0 f21086k;

    /* renamed from: l, reason: collision with root package name */
    public C1 f21087l;

    /* renamed from: m, reason: collision with root package name */
    public final E.g f21088m;

    /* renamed from: n, reason: collision with root package name */
    public final U f21089n;

    /* renamed from: o, reason: collision with root package name */
    public int f21090o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f21091p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f21092q;

    /* renamed from: r, reason: collision with root package name */
    public final C.a f21093r;

    /* renamed from: s, reason: collision with root package name */
    public final C.b f21094s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicLong f21095t;

    /* renamed from: u, reason: collision with root package name */
    public volatile D6.g f21096u;

    /* renamed from: v, reason: collision with root package name */
    public int f21097v;

    /* renamed from: w, reason: collision with root package name */
    public long f21098w;

    /* renamed from: x, reason: collision with root package name */
    public final a f21099x;

    /* renamed from: y.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends AbstractC0442n {

        /* renamed from: a, reason: collision with root package name */
        public Set f21100a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public Map f21101b = new ArrayMap();

        @Override // I.AbstractC0442n
        public void a() {
            for (final AbstractC0442n abstractC0442n : this.f21100a) {
                try {
                    ((Executor) this.f21101b.get(abstractC0442n)).execute(new Runnable() { // from class: y.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0442n.this.a();
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    AbstractC0335i0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e6);
                }
            }
        }

        @Override // I.AbstractC0442n
        public void b(final InterfaceC0455u interfaceC0455u) {
            for (final AbstractC0442n abstractC0442n : this.f21100a) {
                try {
                    ((Executor) this.f21101b.get(abstractC0442n)).execute(new Runnable() { // from class: y.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0442n.this.b(interfaceC0455u);
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    AbstractC0335i0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e6);
                }
            }
        }

        @Override // I.AbstractC0442n
        public void c(final C0444o c0444o) {
            for (final AbstractC0442n abstractC0442n : this.f21100a) {
                try {
                    ((Executor) this.f21101b.get(abstractC0442n)).execute(new Runnable() { // from class: y.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0442n.this.c(c0444o);
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    AbstractC0335i0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e6);
                }
            }
        }

        public void g(Executor executor, AbstractC0442n abstractC0442n) {
            this.f21100a.add(abstractC0442n);
            this.f21101b.put(abstractC0442n, executor);
        }
    }

    /* renamed from: y.u$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Set f21102a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final Executor f21103b;

        public b(Executor executor) {
            this.f21103b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f21102a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f21102a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f21102a.add(cVar);
        }

        public void c(c cVar) {
            this.f21102a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f21103b.execute(new Runnable() { // from class: y.v
                @Override // java.lang.Runnable
                public final void run() {
                    C2331u.b.a(C2331u.b.this, totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: y.u$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C2331u(C2362A c2362a, ScheduledExecutorService scheduledExecutorService, Executor executor, A.c cVar, I.G0 g02) {
        L0.b bVar = new L0.b();
        this.f21082g = bVar;
        this.f21090o = 0;
        this.f21091p = false;
        this.f21092q = 2;
        this.f21095t = new AtomicLong(0L);
        this.f21096u = N.f.h(null);
        this.f21097v = 1;
        this.f21098w = 0L;
        a aVar = new a();
        this.f21099x = aVar;
        this.f21080e = c2362a;
        this.f21081f = cVar;
        this.f21078c = executor;
        b bVar2 = new b(executor);
        this.f21077b = bVar2;
        bVar.w(this.f21097v);
        bVar.j(C2330t0.d(bVar2));
        bVar.j(aVar);
        this.f21086k = new I0(this, c2362a, executor);
        this.f21083h = new U0(this, scheduledExecutorService, executor, g02);
        this.f21084i = new A1(this, c2362a, executor);
        this.f21085j = new x1(this, c2362a, executor);
        this.f21087l = new G1(c2362a);
        this.f21093r = new C.a(g02);
        this.f21094s = new C.b(g02);
        this.f21088m = new E.g(this, executor);
        this.f21089n = new U(this, c2362a, g02, executor);
        executor.execute(new Runnable() { // from class: y.m
            @Override // java.lang.Runnable
            public final void run() {
                r0.w(C2331u.this.f21088m.m());
            }
        });
    }

    public static boolean U(TotalCaptureResult totalCaptureResult, long j6) {
        Long l6;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof I.S0) && (l6 = (Long) ((I.S0) tag).d("CameraControlSessionUpdateId")) != null && l6.longValue() >= j6;
    }

    public static /* synthetic */ Object n(C2331u c2331u, final long j6, final AbstractC1728c.a aVar) {
        c2331u.getClass();
        c2331u.w(new c() { // from class: y.q
            @Override // y.C2331u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C2331u.r(j6, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j6;
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ boolean r(long j6, AbstractC1728c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!U(totalCaptureResult, j6)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ Object t(final C2331u c2331u, final AbstractC1728c.a aVar) {
        c2331u.f21078c.execute(new Runnable() { // from class: y.n
            @Override // java.lang.Runnable
            public final void run() {
                N.f.j(r0.g0(C2331u.this.f0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public E.g A() {
        return this.f21088m;
    }

    public Rect B() {
        return this.f21084i.e();
    }

    public I0 C() {
        return this.f21086k;
    }

    public int D() {
        return this.f21092q;
    }

    public U0 E() {
        return this.f21083h;
    }

    public int F() {
        Integer num = (Integer) this.f21080e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int G() {
        Integer num = (Integer) this.f21080e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int H() {
        Integer num = (Integer) this.f21080e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public I.L0 I() {
        this.f21082g.w(this.f21097v);
        this.f21082g.u(J());
        Object a02 = this.f21088m.l().a0(null);
        if (a02 != null && (a02 instanceof Integer)) {
            this.f21082g.n("Camera2CameraControl", a02);
        }
        this.f21082g.n("CameraControlSessionUpdateId", Long.valueOf(this.f21098w));
        return this.f21082g.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070 A[LOOP:0: B:6:0x006a->B:8:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I.P J() {
        /*
            r7 = this;
            x.a$a r0 = new x.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.d(r1, r3)
            y.U0 r1 = r7.f21083h
            r1.k(r0)
            C.a r1 = r7.f21093r
            r1.a(r0)
            y.A1 r1 = r7.f21084i
            r1.c(r0)
            boolean r1 = r7.f21091p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.d(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f21092q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            C.b r1 = r7.f21094s
            int r1 = r1.a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.K(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.d(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.M(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.d(r1, r2)
            y.I0 r1 = r7.f21086k
            r1.h(r0)
            E.g r1 = r7.f21088m
            x.a r1 = r1.l()
            java.util.Set r2 = r1.c()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            I.P$a r3 = (I.P.a) r3
            I.x0 r4 = r0.b()
            I.P$c r5 = I.P.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.b(r3)
            r4.x(r3, r5, r6)
            goto L6a
        L84:
            x.a r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2331u.J():I.P");
    }

    public int K(int i6) {
        int[] iArr = (int[]) this.f21080e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return T(i6, iArr) ? i6 : T(1, iArr) ? 1 : 0;
    }

    public int L(int i6) {
        int[] iArr = (int[]) this.f21080e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (T(i6, iArr)) {
            return i6;
        }
        if (T(4, iArr)) {
            return 4;
        }
        return T(1, iArr) ? 1 : 0;
    }

    public final int M(int i6) {
        int[] iArr = (int[]) this.f21080e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return T(i6, iArr) ? i6 : T(1, iArr) ? 1 : 0;
    }

    public x1 N() {
        return this.f21085j;
    }

    public int O() {
        int i6;
        synchronized (this.f21079d) {
            i6 = this.f21090o;
        }
        return i6;
    }

    public A1 P() {
        return this.f21084i;
    }

    public C1 Q() {
        return this.f21087l;
    }

    public void R() {
        synchronized (this.f21079d) {
            this.f21090o++;
        }
    }

    public final boolean S() {
        return O() > 0;
    }

    public final boolean T(int i6, int[] iArr) {
        for (int i7 : iArr) {
            if (i6 == i7) {
                return true;
            }
        }
        return false;
    }

    public boolean V() {
        return this.f21091p;
    }

    public void W(c cVar) {
        this.f21077b.c(cVar);
    }

    public void X() {
        a0(1);
    }

    public void Y(boolean z6) {
        this.f21083h.E(z6);
        this.f21084i.j(z6);
        this.f21085j.g(z6);
        this.f21086k.g(z6);
        this.f21088m.n(z6);
    }

    public void Z(Rational rational) {
        this.f21083h.F(rational);
    }

    @Override // I.A
    public void a(L0.b bVar) {
        this.f21087l.a(bVar);
    }

    public void a0(int i6) {
        this.f21097v = i6;
        this.f21083h.G(i6);
        this.f21089n.d(this.f21097v);
    }

    public void b0(boolean z6) {
        this.f21087l.e(z6);
    }

    @Override // I.A
    public D6.g c(final List list, final int i6, final int i7) {
        if (S()) {
            final int D6 = D();
            return N.d.a(N.f.i(this.f21096u)).f(new N.a() { // from class: y.h
                @Override // N.a
                public final D6.g apply(Object obj) {
                    D6.g e6;
                    e6 = C2331u.this.f21089n.e(list, i6, D6, i7);
                    return e6;
                }
            }, this.f21078c);
        }
        AbstractC0335i0.l("Camera2CameraControlImp", "Camera is not active.");
        return N.f.f(new InterfaceC0341m.a("Camera is not active."));
    }

    public void c0(List list) {
        this.f21081f.b(list);
    }

    @Override // F.InterfaceC0341m
    public D6.g d() {
        return !S() ? N.f.f(new InterfaceC0341m.a("Camera is not active.")) : N.f.i(this.f21083h.m());
    }

    public void d0() {
        this.f21078c.execute(new Runnable() { // from class: y.p
            @Override // java.lang.Runnable
            public final void run() {
                C2331u.this.f0();
            }
        });
    }

    @Override // F.InterfaceC0341m
    public D6.g e(float f6) {
        return !S() ? N.f.f(new InterfaceC0341m.a("Camera is not active.")) : N.f.i(this.f21084i.k(f6));
    }

    public D6.g e0() {
        return N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.k
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C2331u.t(C2331u.this, aVar);
            }
        }));
    }

    @Override // I.A
    public Rect f() {
        return (Rect) y0.g.f((Rect) this.f21080e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public long f0() {
        this.f21098w = this.f21095t.getAndIncrement();
        this.f21081f.a();
        return this.f21098w;
    }

    @Override // I.A
    public void g(int i6) {
        if (!S()) {
            AbstractC0335i0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f21092q = i6;
        C1 c12 = this.f21087l;
        boolean z6 = true;
        if (this.f21092q != 1 && this.f21092q != 0) {
            z6 = false;
        }
        c12.d(z6);
        this.f21096u = e0();
    }

    public final D6.g g0(final long j6) {
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.o
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C2331u.n(C2331u.this, j6, aVar);
            }
        });
    }

    @Override // F.InterfaceC0341m
    public D6.g h(boolean z6) {
        return !S() ? N.f.f(new InterfaceC0341m.a("Camera is not active.")) : N.f.i(this.f21085j.d(z6));
    }

    @Override // I.A
    public I.P i() {
        return this.f21088m.l();
    }

    @Override // F.InterfaceC0341m
    public D6.g j(int i6) {
        return !S() ? N.f.f(new InterfaceC0341m.a("Camera is not active.")) : this.f21086k.i(i6);
    }

    @Override // I.A
    public void k() {
        this.f21088m.i().c(new Runnable() { // from class: y.l
            @Override // java.lang.Runnable
            public final void run() {
                C2331u.s();
            }
        }, M.c.b());
    }

    @Override // F.InterfaceC0341m
    public D6.g l(F.F f6) {
        return !S() ? N.f.f(new InterfaceC0341m.a("Camera is not active.")) : N.f.i(this.f21083h.I(f6));
    }

    @Override // I.A
    public void m(I.P p6) {
        this.f21088m.g(j.a.f(p6).d()).c(new Runnable() { // from class: y.j
            @Override // java.lang.Runnable
            public final void run() {
                C2331u.q();
            }
        }, M.c.b());
    }

    public void w(c cVar) {
        this.f21077b.b(cVar);
    }

    public void x(final Executor executor, final AbstractC0442n abstractC0442n) {
        this.f21078c.execute(new Runnable() { // from class: y.i
            @Override // java.lang.Runnable
            public final void run() {
                C2331u.this.f21099x.g(executor, abstractC0442n);
            }
        });
    }

    public void y() {
        synchronized (this.f21079d) {
            try {
                int i6 = this.f21090o;
                if (i6 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f21090o = i6 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(boolean z6) {
        this.f21091p = z6;
        if (!z6) {
            N.a aVar = new N.a();
            aVar.s(this.f21097v);
            aVar.t(true);
            C2253a.C0269a c0269a = new C2253a.C0269a();
            c0269a.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(K(1)));
            c0269a.d(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c0269a.a());
            c0(Collections.singletonList(aVar.h()));
        }
        f0();
    }
}
