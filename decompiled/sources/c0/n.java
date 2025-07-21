package c0;

import I.F0;
import android.os.Build;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n implements F0 {
    public static boolean d() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return e() || d();
    }
}
