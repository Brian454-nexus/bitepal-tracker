package B;

import I.F0;
import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f259a = new HashSet();

    static {
        d("sprd", "lemp");
        d("sprd", "DM20C");
    }

    public static void d(String str, String str2) {
        Set set = f259a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean e() {
        Set set = f259a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
