package H2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final M f2036a;

    /* renamed from: b, reason: collision with root package name */
    public static final Property f2037b;

    /* renamed from: c, reason: collision with root package name */
    public static final Property f2038c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(A.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f6) {
            A.g(view, f6.floatValue());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC2393D.k(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC2393D.R(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2036a = new L();
        } else {
            f2036a = new K();
        }
        f2037b = new a(Float.class, "translationAlpha");
        f2038c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f2036a.a(view);
    }

    public static z b(View view) {
        return new y(view);
    }

    public static float c(View view) {
        return f2036a.b(view);
    }

    public static P d(View view) {
        return new O(view);
    }

    public static void e(View view) {
        f2036a.c(view);
    }

    public static void f(View view, int i6, int i7, int i8, int i9) {
        f2036a.d(view, i6, i7, i8, i9);
    }

    public static void g(View view, float f6) {
        f2036a.e(view, f6);
    }

    public static void h(View view, int i6) {
        f2036a.f(view, i6);
    }

    public static void i(View view, Matrix matrix) {
        f2036a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f2036a.h(view, matrix);
    }
}
