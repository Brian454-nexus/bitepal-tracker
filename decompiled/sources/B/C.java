package B;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f243a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean d() {
        return "Google".equals(Build.MANUFACTURER) && f243a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
