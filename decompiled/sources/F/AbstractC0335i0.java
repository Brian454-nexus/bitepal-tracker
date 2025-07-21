package F;

import android.util.Log;

/* renamed from: F.i0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0335i0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f1435a = 3;

    public static void a(String str, String str2) {
        String k6 = k(str);
        if (h(k6, 3)) {
            Log.d(k6, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String k6 = k(str);
        if (h(k6, 3)) {
            Log.d(k6, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String k6 = k(str);
        if (h(k6, 6)) {
            Log.e(k6, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String k6 = k(str);
        if (h(k6, 6)) {
            Log.e(k6, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String k6 = k(str);
        if (h(k6, 4)) {
            Log.i(k6, str2);
        }
    }

    public static boolean f(String str) {
        return h(k(str), 3);
    }

    public static boolean g(String str) {
        return h(k(str), 4);
    }

    public static boolean h(String str, int i6) {
        return f1435a <= i6 || Log.isLoggable(str, i6);
    }

    public static void i() {
        f1435a = 3;
    }

    public static void j(int i6) {
        f1435a = i6;
    }

    public static String k(String str) {
        return str;
    }

    public static void l(String str, String str2) {
        String k6 = k(str);
        if (h(k6, 5)) {
            Log.w(k6, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String k6 = k(str);
        if (h(k6, 5)) {
            Log.w(k6, str2, th);
        }
    }
}
