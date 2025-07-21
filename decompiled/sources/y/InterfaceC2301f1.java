package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;
import z.C2376h;

/* renamed from: y.f1, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC2301f1 {

    /* renamed from: y.f1$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public void n(InterfaceC2301f1 interfaceC2301f1) {
        }

        public void o(InterfaceC2301f1 interfaceC2301f1) {
        }

        public void p(InterfaceC2301f1 interfaceC2301f1) {
        }

        public abstract void q(InterfaceC2301f1 interfaceC2301f1);

        public abstract void r(InterfaceC2301f1 interfaceC2301f1);

        public abstract void s(InterfaceC2301f1 interfaceC2301f1);

        public abstract void t(InterfaceC2301f1 interfaceC2301f1);

        public void u(InterfaceC2301f1 interfaceC2301f1, Surface surface) {
        }
    }

    a c();

    void close();

    void d();

    int e(List list, CameraCaptureSession.CaptureCallback captureCallback);

    C2376h f();

    void g();

    CameraDevice h();

    int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void k();

    D6.g m();
}
