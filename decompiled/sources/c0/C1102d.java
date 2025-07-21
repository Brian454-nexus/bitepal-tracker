package c0;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1102d implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f10534a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* renamed from: b, reason: collision with root package name */
    public static final Set f10535b = new HashSet(Arrays.asList("sm4350", "sm6375"));

    /* renamed from: c, reason: collision with root package name */
    public static final Set f10536c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean d() {
        return f10536c.contains(Build.MODEL.toLowerCase());
    }

    public static boolean e() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f10534a.contains(Build.HARDWARE.toLowerCase());
    }

    public static boolean f() {
        return g() || e() || d();
    }

    public static boolean g() {
        String str;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Set set = f10535b;
        str = Build.SOC_MODEL;
        return set.contains(str.toLowerCase());
    }
}
