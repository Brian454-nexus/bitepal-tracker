package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import l.AbstractC1725a;
import r0.AbstractC2019a;
import r0.InterfaceC2020b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f18588a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18589b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f18590c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public static Class f18591d;

    static {
        try {
            f18591d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC2020b) {
                return a(((InterfaceC2020b) drawable).a());
            }
            if (drawable instanceof AbstractC1725a) {
                return a(((AbstractC1725a) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    public static void b(Drawable drawable) {
    }

    public static Rect c(Drawable drawable) {
        char c6;
        Insets opticalInsets;
        int i6;
        int i7;
        int i8;
        int i9;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i6 = opticalInsets.left;
            rect.left = i6;
            i7 = opticalInsets.right;
            rect.right = i7;
            i8 = opticalInsets.top;
            rect.top = i8;
            i9 = opticalInsets.bottom;
            rect.bottom = i9;
            return rect;
        }
        if (f18591d != null) {
            try {
                Drawable i10 = AbstractC2019a.i(drawable);
                Object invoke = i10.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(i10, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f18591d.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c6 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c6 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c6 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c6 = 2;
                                    break;
                                }
                                break;
                        }
                        c6 = 65535;
                        if (c6 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c6 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c6 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c6 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f18590c;
    }

    public static PorterDuff.Mode d(int i6, PorterDuff.Mode mode) {
        if (i6 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
