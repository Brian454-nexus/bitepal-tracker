package B;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class x implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f266a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    public static boolean d(C2362A c2362a) {
        return f266a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
