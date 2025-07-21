package y;

import I.AbstractC0442n;
import I.C0444o;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: y.s0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2328s0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0442n f21071a;

    public C2328s0(AbstractC0442n abstractC0442n) {
        if (abstractC0442n == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f21071a = abstractC0442n;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        I.S0 b6;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            y0.g.b(tag instanceof I.S0, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            b6 = (I.S0) tag;
        } else {
            b6 = I.S0.b();
        }
        this.f21071a.b(new C2302g(b6, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f21071a.c(new C0444o(C0444o.a.ERROR));
    }
}
