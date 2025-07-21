package Q;

import I.F0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4413a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean d() {
        return f4413a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
