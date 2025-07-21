package c0;

import I.F0;
import android.os.Build;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1100b implements F0 {
    public static boolean d() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return d();
    }
}
