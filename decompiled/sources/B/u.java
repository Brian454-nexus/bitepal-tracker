package B;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class u implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f262a = Arrays.asList("itel w6004");

    /* renamed from: b, reason: collision with root package name */
    public static final List f263b = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(C2362A c2362a) {
        List list = f263b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f262a.contains(str.toLowerCase(locale));
    }
}
