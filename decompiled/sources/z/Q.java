package z;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Q extends P {
    public Q(Context context) {
        super(context);
    }

    @Override // z.S, z.N.b
    public Set e() {
        try {
            return this.f21309a.getConcurrentCameraIds();
        } catch (CameraAccessException e6) {
            throw C2375g.e(e6);
        }
    }
}
