package y0;

import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g {
    public static void a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static float c(float f6, String str) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f6)) {
            return f6;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int d(int i6, int i7, int i8, String str) {
        if (i6 < i7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        if (i6 <= i8) {
            return i6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    public static int e(int i6) {
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException();
    }

    public static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void h(boolean z6) {
        i(z6, null);
    }

    public static void i(boolean z6, String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }
}
