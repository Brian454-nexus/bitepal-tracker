package y;

import F.AbstractC0335i0;
import I.AbstractC0419b0;
import I.W;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import l0.AbstractC1728c;
import y.InterfaceC2301f1;
import y.r1;
import z.C2363B;
import z.C2376h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l1 extends InterfaceC2301f1.a implements InterfaceC2301f1, r1.b {

    /* renamed from: b, reason: collision with root package name */
    public final B0 f21019b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21020c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f21021d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f21022e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2301f1.a f21023f;

    /* renamed from: g, reason: collision with root package name */
    public C2376h f21024g;

    /* renamed from: h, reason: collision with root package name */
    public D6.g f21025h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1728c.a f21026i;

    /* renamed from: j, reason: collision with root package name */
    public D6.g f21027j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21018a = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List f21028k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21029l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21030m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21031n = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {
        public a() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            l1.this.d();
            l1 l1Var = l1.this;
            l1Var.f21019b.j(l1Var);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            l1.this.A(cameraCaptureSession);
            l1 l1Var = l1.this;
            l1Var.n(l1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            l1.this.A(cameraCaptureSession);
            l1 l1Var = l1.this;
            l1Var.o(l1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            l1.this.A(cameraCaptureSession);
            l1 l1Var = l1.this;
            l1Var.p(l1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            AbstractC1728c.a aVar;
            try {
                l1.this.A(cameraCaptureSession);
                l1 l1Var = l1.this;
                l1Var.q(l1Var);
                synchronized (l1.this.f21018a) {
                    y0.g.g(l1.this.f21026i, "OpenCaptureSession completer should not null");
                    l1 l1Var2 = l1.this;
                    aVar = l1Var2.f21026i;
                    l1Var2.f21026i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (l1.this.f21018a) {
                    y0.g.g(l1.this.f21026i, "OpenCaptureSession completer should not null");
                    l1 l1Var3 = l1.this;
                    AbstractC1728c.a aVar2 = l1Var3.f21026i;
                    l1Var3.f21026i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            AbstractC1728c.a aVar;
            try {
                l1.this.A(cameraCaptureSession);
                l1 l1Var = l1.this;
                l1Var.r(l1Var);
                synchronized (l1.this.f21018a) {
                    y0.g.g(l1.this.f21026i, "OpenCaptureSession completer should not null");
                    l1 l1Var2 = l1.this;
                    aVar = l1Var2.f21026i;
                    l1Var2.f21026i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (l1.this.f21018a) {
                    y0.g.g(l1.this.f21026i, "OpenCaptureSession completer should not null");
                    l1 l1Var3 = l1.this;
                    AbstractC1728c.a aVar2 = l1Var3.f21026i;
                    l1Var3.f21026i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            l1.this.A(cameraCaptureSession);
            l1 l1Var = l1.this;
            l1Var.s(l1Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            l1.this.A(cameraCaptureSession);
            l1 l1Var = l1.this;
            l1Var.u(l1Var, surface);
        }
    }

    public l1(B0 b02, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f21019b = b02;
        this.f21020c = handler;
        this.f21021d = executor;
        this.f21022e = scheduledExecutorService;
    }

    public static /* synthetic */ void v(l1 l1Var, InterfaceC2301f1 interfaceC2301f1) {
        l1Var.f21019b.h(l1Var);
        l1Var.z(interfaceC2301f1);
        Objects.requireNonNull(l1Var.f21023f);
        l1Var.f21023f.p(interfaceC2301f1);
    }

    public static /* synthetic */ Object w(l1 l1Var, List list, C2363B c2363b, A.o oVar, AbstractC1728c.a aVar) {
        String str;
        synchronized (l1Var.f21018a) {
            l1Var.B(list);
            y0.g.i(l1Var.f21026i == null, "The openCaptureSessionCompleter can only set once!");
            l1Var.f21026i = aVar;
            c2363b.a(oVar);
            str = "openCaptureSession[session=" + l1Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void x(l1 l1Var, InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(l1Var.f21023f);
        l1Var.f21023f.z(interfaceC2301f1);
    }

    public static /* synthetic */ D6.g y(l1 l1Var, List list, List list2) {
        l1Var.getClass();
        AbstractC0335i0.a("SyncCaptureSessionBase", "[" + l1Var + "] getSurface...done");
        return list2.contains(null) ? N.f.f(new W.a("Surface closed", (I.W) list.get(list2.indexOf(null)))) : list2.isEmpty() ? N.f.f(new IllegalArgumentException("Unable to open capture session without surfaces")) : N.f.h(list2);
    }

    public void A(CameraCaptureSession cameraCaptureSession) {
        if (this.f21024g == null) {
            this.f21024g = C2376h.d(cameraCaptureSession, this.f21020c);
        }
    }

    public void B(List list) {
        synchronized (this.f21018a) {
            D();
            AbstractC0419b0.f(list);
            this.f21028k = list;
        }
    }

    public boolean C() {
        boolean z6;
        synchronized (this.f21018a) {
            z6 = this.f21025h != null;
        }
        return z6;
    }

    public void D() {
        synchronized (this.f21018a) {
            try {
                List list = this.f21028k;
                if (list != null) {
                    AbstractC0419b0.e(list);
                    this.f21028k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.r1.b
    public A.o a(int i6, List list, InterfaceC2301f1.a aVar) {
        this.f21023f = aVar;
        return new A.o(i6, list, b(), new b());
    }

    @Override // y.r1.b
    public Executor b() {
        return this.f21021d;
    }

    @Override // y.InterfaceC2301f1
    public InterfaceC2301f1.a c() {
        return this;
    }

    @Override // y.InterfaceC2301f1
    public void close() {
        y0.g.g(this.f21024g, "Need to call openCaptureSession before using this API.");
        this.f21019b.i(this);
        this.f21024g.c().close();
        b().execute(new Runnable() { // from class: y.g1
            @Override // java.lang.Runnable
            public final void run() {
                l1.this.z(r0);
            }
        });
    }

    @Override // y.InterfaceC2301f1
    public void d() {
        D();
    }

    @Override // y.InterfaceC2301f1
    public int e(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        y0.g.g(this.f21024g, "Need to call openCaptureSession before using this API.");
        return this.f21024g.a(list, b(), captureCallback);
    }

    @Override // y.InterfaceC2301f1
    public C2376h f() {
        y0.g.f(this.f21024g);
        return this.f21024g;
    }

    @Override // y.InterfaceC2301f1
    public void g() {
        y0.g.g(this.f21024g, "Need to call openCaptureSession before using this API.");
        this.f21024g.c().abortCaptures();
    }

    @Override // y.InterfaceC2301f1
    public CameraDevice h() {
        y0.g.f(this.f21024g);
        return this.f21024g.c().getDevice();
    }

    @Override // y.InterfaceC2301f1
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        y0.g.g(this.f21024g, "Need to call openCaptureSession before using this API.");
        return this.f21024g.b(captureRequest, b(), captureCallback);
    }

    @Override // y.r1.b
    public D6.g j(CameraDevice cameraDevice, final A.o oVar, final List list) {
        synchronized (this.f21018a) {
            try {
                if (this.f21030m) {
                    return N.f.f(new CancellationException("Opener is disabled"));
                }
                this.f21019b.l(this);
                final C2363B b6 = C2363B.b(cameraDevice, this.f21020c);
                D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.i1
                    @Override // l0.AbstractC1728c.InterfaceC0214c
                    public final Object a(AbstractC1728c.a aVar) {
                        return l1.w(l1.this, list, b6, oVar, aVar);
                    }
                });
                this.f21025h = a6;
                N.f.b(a6, new a(), M.c.b());
                return N.f.i(this.f21025h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.InterfaceC2301f1
    public void k() {
        y0.g.g(this.f21024g, "Need to call openCaptureSession before using this API.");
        this.f21024g.c().stopRepeating();
    }

    @Override // y.r1.b
    public D6.g l(final List list, long j6) {
        synchronized (this.f21018a) {
            try {
                if (this.f21030m) {
                    return N.f.f(new CancellationException("Opener is disabled"));
                }
                N.d f6 = N.d.a(AbstractC0419b0.g(list, false, j6, b(), this.f21022e)).f(new N.a() { // from class: y.j1
                    @Override // N.a
                    public final D6.g apply(Object obj) {
                        return l1.y(l1.this, list, (List) obj);
                    }
                }, b());
                this.f21027j = f6;
                return N.f.i(f6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.InterfaceC2301f1
    public D6.g m() {
        return N.f.h(null);
    }

    @Override // y.InterfaceC2301f1.a
    public void n(InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(this.f21023f);
        this.f21023f.n(interfaceC2301f1);
    }

    @Override // y.InterfaceC2301f1.a
    public void o(InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(this.f21023f);
        this.f21023f.o(interfaceC2301f1);
    }

    @Override // y.InterfaceC2301f1.a
    public void p(final InterfaceC2301f1 interfaceC2301f1) {
        D6.g gVar;
        synchronized (this.f21018a) {
            try {
                if (this.f21029l) {
                    gVar = null;
                } else {
                    this.f21029l = true;
                    y0.g.g(this.f21025h, "Need to call openCaptureSession before using this API.");
                    gVar = this.f21025h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        if (gVar != null) {
            gVar.c(new Runnable() { // from class: y.h1
                @Override // java.lang.Runnable
                public final void run() {
                    l1.v(l1.this, interfaceC2301f1);
                }
            }, M.c.b());
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void q(InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(this.f21023f);
        d();
        this.f21019b.j(this);
        this.f21023f.q(interfaceC2301f1);
    }

    @Override // y.InterfaceC2301f1.a
    public void r(InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(this.f21023f);
        this.f21019b.k(this);
        this.f21023f.r(interfaceC2301f1);
    }

    @Override // y.InterfaceC2301f1.a
    public void s(InterfaceC2301f1 interfaceC2301f1) {
        Objects.requireNonNull(this.f21023f);
        this.f21023f.s(interfaceC2301f1);
    }

    @Override // y.r1.b
    public boolean stop() {
        boolean z6;
        try {
            synchronized (this.f21018a) {
                try {
                    if (!this.f21030m) {
                        Future future = this.f21027j;
                        r1 = future != null ? future : null;
                        this.f21030m = true;
                    }
                    z6 = !C();
                } finally {
                }
            }
            return z6;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // y.InterfaceC2301f1.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void z(final InterfaceC2301f1 interfaceC2301f1) {
        D6.g gVar;
        synchronized (this.f21018a) {
            try {
                if (this.f21031n) {
                    gVar = null;
                } else {
                    this.f21031n = true;
                    y0.g.g(this.f21025h, "Need to call openCaptureSession before using this API.");
                    gVar = this.f21025h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gVar != null) {
            gVar.c(new Runnable() { // from class: y.k1
                @Override // java.lang.Runnable
                public final void run() {
                    l1.x(l1.this, interfaceC2301f1);
                }
            }, M.c.b());
        }
    }

    @Override // y.InterfaceC2301f1.a
    public void u(InterfaceC2301f1 interfaceC2301f1, Surface surface) {
        Objects.requireNonNull(this.f21023f);
        this.f21023f.u(interfaceC2301f1, surface);
    }
}
