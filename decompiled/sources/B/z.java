package B;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z implements Q.i {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f268a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    public static boolean d(C2362A c2362a) {
        return f268a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
