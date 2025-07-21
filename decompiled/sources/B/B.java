package B;

import I.F0;
import android.hardware.camera2.CameraCharacteristics;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class B implements F0 {
    public static boolean d(C2362A c2362a) {
        Integer num = (Integer) c2362a.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
