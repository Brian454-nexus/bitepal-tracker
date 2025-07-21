package B;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f267a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    public static boolean d() {
        return i() || h();
    }

    public static boolean e() {
        return f() && d();
    }

    public static boolean f() {
        return f267a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean g() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && i();
    }

    public static boolean h() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    public static boolean i() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    public static boolean j() {
        return g() || e();
    }
}
