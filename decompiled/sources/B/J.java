package B;

import android.os.Build;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class J implements Q.h {
    public static boolean d() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g(C2362A c2362a) {
        return d() || e() || f();
    }
}
