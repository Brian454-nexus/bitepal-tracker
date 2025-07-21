package H2;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static Field f2044a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2045b;

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i6, int i7, int i8, int i9);

    public abstract void e(View view, float f6);

    public void f(View view, int i6) {
        if (!f2045b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2044a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2045b = true;
        }
        Field field = f2044a;
        if (field != null) {
            try {
                f2044a.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
