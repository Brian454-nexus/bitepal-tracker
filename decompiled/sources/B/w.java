package B;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class w implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f265a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    public static boolean d(C2362A c2362a) {
        return f265a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
