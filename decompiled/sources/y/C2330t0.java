package y;

import I.AbstractC0442n;
import android.hardware.camera2.CameraCaptureSession;

/* renamed from: y.t0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2330t0 extends AbstractC0442n {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f21075a;

    public C2330t0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f21075a = captureCallback;
    }

    public static C2330t0 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C2330t0(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback e() {
        return this.f21075a;
    }
}
