package Q;

import I.F0;
import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f4409a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    public static boolean e() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f4409a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int d() {
        return 1;
    }
}
