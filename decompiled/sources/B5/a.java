package B5;

import android.util.Log;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {
    public static void a(String str, String str2, Object obj) {
        String d6 = d(str);
        if (Log.isLoggable(d6, 3)) {
            Log.d(d6, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String d6 = d(str);
        if (Log.isLoggable(d6, 3)) {
            Log.d(d6, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String d6 = d(str);
        if (Log.isLoggable(d6, 6)) {
            Log.e(d6, str2, th);
        }
    }

    public static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String d6 = d(str);
        if (Log.isLoggable(d6, 4)) {
            Log.i(d6, String.format(str2, obj));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String d6 = d(str);
        if (Log.isLoggable(d6, 5)) {
            Log.w(d6, String.format(str2, obj));
        }
    }
}
