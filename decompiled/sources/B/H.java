package B;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class H implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f245a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi 6 pro");

    public static boolean d() {
        return f245a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
