package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import z.C2376h;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class x implements C2376h.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f21372a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21373b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f21374a;

        public a(Handler handler) {
            this.f21374a = handler;
        }
    }

    public x(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f21372a = (CameraCaptureSession) y0.g.f(cameraCaptureSession);
        this.f21373b = obj;
    }

    public static C2376h.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x(cameraCaptureSession, new a(handler));
    }

    @Override // z.C2376h.a
    public CameraCaptureSession a() {
        return this.f21372a;
    }

    @Override // z.C2376h.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f21372a.setRepeatingRequest(captureRequest, new C2376h.b(executor, captureCallback), ((a) this.f21373b).f21374a);
    }

    @Override // z.C2376h.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f21372a.captureBurst(list, new C2376h.b(executor, captureCallback), ((a) this.f21373b).f21374a);
    }
}
