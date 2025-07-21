package B;

import I.F0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import z.C2362A;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0285b implements F0 {
    public static boolean d(C2362A c2362a) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
