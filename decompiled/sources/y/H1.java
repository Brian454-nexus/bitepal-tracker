package y;

import android.hardware.camera2.CameraCharacteristics;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class H1 {
    public static boolean a(C2362A c2362a, int i6) {
        int[] iArr = (int[]) c2362a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
        }
        return false;
    }
}
