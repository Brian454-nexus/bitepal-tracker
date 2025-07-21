package B;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class v implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f264a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean d() {
        return f264a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
