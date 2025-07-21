package B;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.C2362A;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0289f implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f249a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    public static boolean d(C2362A c2362a) {
        return f249a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c2362a.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
