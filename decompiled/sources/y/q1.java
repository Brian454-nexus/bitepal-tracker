package y;

import C.h;
import C.x;
import F.AbstractC0335i0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q1 extends l1 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f21053o;

    /* renamed from: p, reason: collision with root package name */
    public List f21054p;

    /* renamed from: q, reason: collision with root package name */
    public D6.g f21055q;

    /* renamed from: r, reason: collision with root package name */
    public final C.i f21056r;

    /* renamed from: s, reason: collision with root package name */
    public final C.x f21057s;

    /* renamed from: t, reason: collision with root package name */
    public final C.h f21058t;

    public q1(I.G0 g02, I.G0 g03, B0 b02, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(b02, executor, scheduledExecutorService, handler);
        this.f21053o = new Object();
        this.f21056r = new C.i(g02, g03);
        this.f21057s = new C.x(g02);
        this.f21058t = new C.h(g03);
    }

    public static /* synthetic */ void F(q1 q1Var) {
        q1Var.I("Session call super.close()");
        super.close();
    }

    public void I(String str) {
        AbstractC0335i0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // y.l1, y.InterfaceC2301f1
    public void close() {
        I("Session call close()");
        this.f21057s.d();
        this.f21057s.c().c(new Runnable() { // from class: y.o1
            @Override // java.lang.Runnable
            public final void run() {
                q1.F(q1.this);
            }
        }, b());
    }

    @Override // y.l1, y.InterfaceC2301f1
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f21057s.f(captureRequest, captureCallback, new x.c() { // from class: y.m1
            @Override // C.x.c
            public final int a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int i6;
                i6 = super/*y.l1*/.i(captureRequest2, captureCallback2);
                return i6;
            }
        });
    }

    @Override // y.l1, y.r1.b
    public D6.g j(CameraDevice cameraDevice, A.o oVar, List list) {
        D6.g i6;
        synchronized (this.f21053o) {
            D6.g e6 = this.f21057s.e(cameraDevice, oVar, list, this.f21019b.e(), new x.b() { // from class: y.p1
                @Override // C.x.b
                public final D6.g a(CameraDevice cameraDevice2, A.o oVar2, List list2) {
                    D6.g j6;
                    j6 = super/*y.l1*/.j(cameraDevice2, oVar2, list2);
                    return j6;
                }
            });
            this.f21055q = e6;
            i6 = N.f.i(e6);
        }
        return i6;
    }

    @Override // y.l1, y.r1.b
    public D6.g l(List list, long j6) {
        D6.g l6;
        synchronized (this.f21053o) {
            this.f21054p = list;
            l6 = super.l(list, j6);
        }
        return l6;
    }

    @Override // y.l1, y.InterfaceC2301f1
    public D6.g m() {
        return this.f21057s.c();
    }

    @Override // y.l1, y.InterfaceC2301f1.a
    public void p(InterfaceC2301f1 interfaceC2301f1) {
        synchronized (this.f21053o) {
            this.f21056r.a(this.f21054p);
        }
        I("onClosed()");
        super.p(interfaceC2301f1);
    }

    @Override // y.l1, y.InterfaceC2301f1.a
    public void r(InterfaceC2301f1 interfaceC2301f1) {
        I("Session onConfigured()");
        this.f21058t.c(interfaceC2301f1, this.f21019b.f(), this.f21019b.d(), new h.a() { // from class: y.n1
            @Override // C.h.a
            public final void a(InterfaceC2301f1 interfaceC2301f12) {
                super/*y.l1*/.r(interfaceC2301f12);
            }
        });
    }

    @Override // y.l1, y.r1.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f21053o) {
            try {
                if (C()) {
                    this.f21056r.a(this.f21054p);
                } else {
                    D6.g gVar = this.f21055q;
                    if (gVar != null) {
                        gVar.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return stop;
    }
}
