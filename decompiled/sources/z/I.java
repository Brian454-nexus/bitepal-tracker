package z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class I extends H {
    public I(CameraDevice cameraDevice) {
        super((CameraDevice) y0.g.f(cameraDevice), null);
    }

    @Override // z.H, z.C2363B.a
    public void a(A.o oVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) oVar.j();
        y0.g.f(sessionConfiguration);
        try {
            this.f21295a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }
}
