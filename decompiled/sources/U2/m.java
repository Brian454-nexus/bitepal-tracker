package U2;

import android.view.DisplayCutout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5208a = new m();

    public final int a(DisplayCutout displayCutout) {
        int safeInsetBottom;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int b(DisplayCutout displayCutout) {
        int safeInsetLeft;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int c(DisplayCutout displayCutout) {
        int safeInsetRight;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int d(DisplayCutout displayCutout) {
        int safeInsetTop;
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
