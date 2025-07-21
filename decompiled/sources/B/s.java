package B;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f260a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320");

    public static boolean d() {
        Iterator it = f260a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(C2362A c2362a) {
        return d() && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
