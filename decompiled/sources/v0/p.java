package v0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static long f19291a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f19292b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f19293c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f19294d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f19295e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f19291a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f19292b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f19293c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f19294d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f19295e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e6) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e6);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
