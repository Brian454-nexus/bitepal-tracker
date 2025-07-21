package G2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f1764a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1765b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f1766c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1767d;

    public static void a(String str, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(j(str), i6);
        } else {
            b(j(str), i6);
        }
    }

    public static void b(String str, int i6) {
        try {
            if (f1766c == null) {
                f1766c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f1766c.invoke(null, Long.valueOf(f1764a), str, Integer.valueOf(i6));
        } catch (Exception e6) {
            g("asyncTraceBegin", e6);
        }
    }

    public static void c(String str) {
        b.a(j(str));
    }

    public static void d(String str, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(j(str), i6);
        } else {
            e(j(str), i6);
        }
    }

    public static void e(String str, int i6) {
        try {
            if (f1767d == null) {
                f1767d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f1767d.invoke(null, Long.valueOf(f1764a), str, Integer.valueOf(i6));
        } catch (Exception e6) {
            g("asyncTraceEnd", e6);
        }
    }

    public static void f() {
        b.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    public static boolean i() {
        try {
            if (f1765b == null) {
                f1764a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1765b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1765b.invoke(null, Long.valueOf(f1764a))).booleanValue();
        } catch (Exception e6) {
            g("isTagEnabled", e6);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
