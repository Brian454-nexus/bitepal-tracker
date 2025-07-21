package B;

import I.F0;
import android.os.Build;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K implements F0 {
    public static boolean d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936");
    }

    public static boolean e() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8");
    }

    public static boolean f() {
        return d() || e();
    }
}
