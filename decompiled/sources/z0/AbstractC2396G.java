package z0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z0.G, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2396G {

    /* renamed from: z0.G$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: z0.G$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: z0.G$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i6, i7, i8);
        }

        public static int b(ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i6, i7, i8);
        }
    }

    public static int a(Resources resources, int i6, y0.i iVar, int i7) {
        int dimensionPixelSize;
        return i6 != -1 ? (i6 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i6)) < 0) ? i7 : dimensionPixelSize : ((Integer) iVar.get()).intValue();
    }

    public static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int c(Resources resources, int i6, int i7) {
        if (i6 == 4194304 && i7 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int d(Resources resources, int i6, int i7) {
        if (i6 == 4194304 && i7 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i6, i7, i8);
        }
        if (!i(i6, i7, i8)) {
            return IntCompanionObject.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int c6 = c(resources, i8, i7);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, c6, new y0.i() { // from class: z0.E
            @Override // y0.i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, IntCompanionObject.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i6, i7, i8);
        }
        if (!i(i6, i7, i8)) {
            return IntCompanionObject.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int d6 = d(resources, i8, i7);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d6, new y0.i() { // from class: z0.F
            @Override // y0.i
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, IntCompanionObject.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean i(int i6, int i7, int i8) {
        InputDevice device = InputDevice.getDevice(i6);
        return (device == null || device.getMotionRange(i7, i8) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int b6 = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return b6 != 0 && resources.getBoolean(b6);
    }
}
