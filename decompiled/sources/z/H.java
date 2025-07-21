package z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import z.C2376h;
import z.J;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class H extends AbstractC2368G {
    public H(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static H e(CameraDevice cameraDevice, Handler handler) {
        return new H(cameraDevice, new J.a(handler));
    }

    @Override // z.C2363B.a
    public void a(A.o oVar) {
        J.c(this.f21295a, oVar);
        C2376h.c cVar = new C2376h.c(oVar.a(), oVar.e());
        List c6 = oVar.c();
        Handler handler = ((J.a) y0.g.f((J.a) this.f21296b)).f21297a;
        A.h b6 = oVar.b();
        try {
            if (b6 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b6.a();
                y0.g.f(inputConfiguration);
                this.f21295a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, A.o.h(c6), cVar, handler);
            } else if (oVar.d() == 1) {
                this.f21295a.createConstrainedHighSpeedCaptureSession(J.d(c6), cVar, handler);
            } else {
                this.f21295a.createCaptureSessionByOutputConfigurations(A.o.h(c6), cVar, handler);
            }
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }
}
