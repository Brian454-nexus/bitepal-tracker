package U2;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0.C2400K;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5206a = new g();

    public final Rect a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    @NotNull
    public final C2400K b(@NotNull Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        Intrinsics.checkNotNullParameter(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        C2400K n6 = C2400K.n(windowInsets);
        Intrinsics.checkNotNullExpressionValue(n6, "toWindowInsetsCompat(platformInsets)");
        return n6;
    }

    public final Q2.k c(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        C2400K n6 = C2400K.n(windowInsets);
        Intrinsics.checkNotNullExpressionValue(n6, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
        return new Q2.k(bounds, n6);
    }

    public final Rect d(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}
