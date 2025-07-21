package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import z.C2376h;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2376h {

    /* renamed from: a, reason: collision with root package name */
    public final a f21323a;

    /* renamed from: z.h$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        CameraCaptureSession a();

        int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: z.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f21324a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f21325b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f21325b = executor;
            this.f21324a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j6) {
            this.f21325b.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2371c.a(C2376h.b.this.f21324a, cameraCaptureSession, captureRequest, surface, j6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f21325b.execute(new Runnable() { // from class: z.j
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f21325b.execute(new Runnable() { // from class: z.m
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f21325b.execute(new Runnable() { // from class: z.k
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i6) {
            this.f21325b.execute(new Runnable() { // from class: z.o
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureSequenceAborted(cameraCaptureSession, i6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i6, final long j6) {
            this.f21325b.execute(new Runnable() { // from class: z.l
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureSequenceCompleted(cameraCaptureSession, i6, j6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j6, final long j7) {
            this.f21325b.execute(new Runnable() { // from class: z.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.b.this.f21324a.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j7);
                }
            });
        }
    }

    /* renamed from: z.h$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f21326a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f21327b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f21327b = executor;
            this.f21326a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.p
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.c.this.f21326a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.s
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2372d.b(C2376h.c.this.f21326a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.q
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.c.this.f21326a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.v
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.c.this.f21326a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.t
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.c.this.f21326a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f21327b.execute(new Runnable() { // from class: z.u
                @Override // java.lang.Runnable
                public final void run() {
                    C2376h.c.this.f21326a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f21327b.execute(new Runnable() { // from class: z.r
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2370b.a(C2376h.c.this.f21326a, cameraCaptureSession, surface);
                }
            });
        }
    }

    public C2376h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21323a = new w(cameraCaptureSession);
        } else {
            this.f21323a = x.d(cameraCaptureSession, handler);
        }
    }

    public static C2376h d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C2376h(cameraCaptureSession, handler);
    }

    public int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f21323a.c(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f21323a.b(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f21323a.a();
    }
}
