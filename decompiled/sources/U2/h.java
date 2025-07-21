package U2;

import android.graphics.Point;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f5207a = new h();

    public final void a(Display display, Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}
