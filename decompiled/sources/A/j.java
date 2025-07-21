package A;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j extends n {
    public j(Object obj) {
        super(obj);
    }

    @Override // A.i.a
    public abstract Object g();

    @Override // A.i.a
    public Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }
}
