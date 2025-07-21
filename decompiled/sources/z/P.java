package z;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class P extends O {
    public P(Context context) {
        super(context);
    }

    @Override // z.O, z.S, z.N.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f21309a.getCameraCharacteristics(str);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }

    @Override // z.O, z.S, z.N.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f21309a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }
}
