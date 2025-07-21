package c0;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f10541a = new HashSet(Arrays.asList("HWELE", "HW-02L", "HWVOG", "HWYAL", "HWLYA", "HWCOL", "HWPAR"));

    /* renamed from: b, reason: collision with root package name */
    public static final Set f10542b = new HashSet(Arrays.asList("ELS-AN00", "ELS-TN00", "ELS-NX9", "ELS-N04"));

    public static boolean d() {
        if (!"Huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        Set set = f10541a;
        String str = Build.DEVICE;
        Locale locale = Locale.US;
        return set.contains(str.toUpperCase(locale)) || f10542b.contains(Build.MODEL.toUpperCase(locale));
    }
}
