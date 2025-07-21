package c1;

import android.text.TextUtils;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1119a {
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

    public static int c(int i6, int i7, int i8) {
        if (i6 < i7 || i6 >= i8) {
            throw new IndexOutOfBoundsException();
        }
        return i6;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object f(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void g(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static Object j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
