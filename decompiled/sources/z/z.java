package z;

import android.hardware.camera2.CameraCharacteristics;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class z implements C2362A.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f21375a;

    public z(CameraCharacteristics cameraCharacteristics) {
        this.f21375a = cameraCharacteristics;
    }

    @Override // z.C2362A.a
    public Object a(CameraCharacteristics.Key key) {
        return this.f21375a.get(key);
    }
}
