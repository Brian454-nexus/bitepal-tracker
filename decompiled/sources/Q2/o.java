package Q2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z0.C2400K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final o f4495b = new o();

    /* renamed from: c, reason: collision with root package name */
    public static final String f4496c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f4497d;

    static {
        String simpleName = o.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f4496c = simpleName;
        f4497d = CollectionsKt.arrayListOf(new Integer[]{Integer.valueOf(C2400K.l.g()), Integer.valueOf(C2400K.l.f()), Integer.valueOf(C2400K.l.a()), Integer.valueOf(C2400K.l.c()), Integer.valueOf(C2400K.l.i()), Integer.valueOf(C2400K.l.e()), Integer.valueOf(C2400K.l.j()), Integer.valueOf(C2400K.l.b())});
    }

    @Override // Q2.l
    public k a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return e(activity);
    }

    public k c(Activity activity) {
        C2400K a6;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i6 = Build.VERSION.SDK_INT;
        Rect a7 = i6 >= 30 ? U2.g.f5206a.a(activity) : i6 >= 29 ? h(activity) : i6 >= 28 ? g(activity) : f(activity);
        if (i6 >= 30) {
            a6 = i(activity);
        } else {
            a6 = new C2400K.a().a();
            Intrinsics.checkNotNullExpressionValue(a6, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new N2.b(a7), a6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return U2.g.f5206a.c(context);
        }
        Context a6 = U2.b.f5205a.a(context);
        if (a6 instanceof Activity) {
            return c((Activity) context);
        }
        if (!(a6 instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "wm.defaultDisplay");
        Point l6 = l(defaultDisplay);
        return new k(new Rect(0, 0, l6.x, l6.y), null, 2, 0 == true ? 1 : 0);
    }

    public k e(Context context) {
        Rect rect;
        C2400K a6;
        Intrinsics.checkNotNullParameter(context, "context");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            rect = U2.g.f5206a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display display = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "display");
            Point l6 = l(display);
            rect = new Rect(0, 0, l6.x, l6.y);
        }
        if (i6 >= 30) {
            a6 = i(context);
        } else {
            a6 = new C2400K.a().a();
            Intrinsics.checkNotNullExpressionValue(a6, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new N2.b(rect), a6);
    }

    public final Rect f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!U2.a.f5204a.a(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point l6 = l(defaultDisplay);
            int k6 = k(activity);
            int i6 = rect.bottom;
            if (i6 + k6 == l6.y) {
                rect.bottom = i6 + k6;
                return rect;
            }
            int i7 = rect.right;
            if (i7 + k6 == l6.x) {
                rect.right = i7 + k6;
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        DisplayCutout j6;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (U2.a.f5204a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e6) {
            Log.w(f4496c, e6);
            m(activity, rect);
        } catch (NoSuchFieldException e7) {
            Log.w(f4496c, e7);
            m(activity, rect);
        } catch (NoSuchMethodException e8) {
            Log.w(f4496c, e8);
            m(activity, rect);
        } catch (InvocationTargetException e9) {
            Log.w(f4496c, e9);
            m(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        U2.h hVar = U2.h.f5207a;
        Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
        hVar.a(currentDisplay, point);
        U2.a aVar = U2.a.f5204a;
        if (!aVar.a(activity)) {
            int k6 = k(activity);
            int i6 = rect.bottom;
            if (i6 + k6 == point.y) {
                rect.bottom = i6 + k6;
            } else {
                int i7 = rect.right;
                if (i7 + k6 == point.x) {
                    rect.right = i7 + k6;
                } else if (rect.left == k6) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (j6 = j(currentDisplay)) != null) {
            int i8 = rect.left;
            U2.m mVar = U2.m.f5208a;
            if (i8 == mVar.b(j6)) {
                rect.left = 0;
            }
            if (point.x - rect.right == mVar.c(j6)) {
                rect.right += mVar.c(j6);
            }
            if (rect.top == mVar.d(j6)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == mVar.a(j6)) {
                rect.bottom += mVar.a(j6);
            }
        }
        return rect;
    }

    public final Rect h(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException e6) {
            Log.w(f4496c, e6);
            return g(activity);
        } catch (NoSuchFieldException e7) {
            Log.w(f4496c, e7);
            return g(activity);
        } catch (NoSuchMethodException e8) {
            Log.w(f4496c, e8);
            return g(activity);
        } catch (InvocationTargetException e9) {
            Log.w(f4496c, e9);
            return g(activity);
        }
    }

    public final C2400K i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return U2.g.f5206a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (m.a(obj)) {
                return n.a(obj);
            }
            return null;
        } catch (ClassNotFoundException e6) {
            Log.w(f4496c, e6);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w(f4496c, e7);
            return null;
        } catch (InstantiationException e8) {
            Log.w(f4496c, e8);
            return null;
        } catch (NoSuchFieldException e9) {
            Log.w(f4496c, e9);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.w(f4496c, e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.w(f4496c, e11);
            return null;
        }
    }

    public final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point l(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        U2.h.f5207a.a(display, point);
        return point;
    }

    public final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
