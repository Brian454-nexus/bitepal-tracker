package n2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1815b {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(c(context), b());
    }

    public static int b() {
        return 0;
    }

    public static String c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
