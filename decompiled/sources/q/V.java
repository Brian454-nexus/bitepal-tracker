package q;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static Method f18511a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f18511a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f18511a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f18511a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e6) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
            }
        }
    }

    public static boolean b(View view) {
        return AbstractC2393D.p(view) == 1;
    }
}
