package B;

import I.F0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f261a = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C2362A c2362a) {
        return f261a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
