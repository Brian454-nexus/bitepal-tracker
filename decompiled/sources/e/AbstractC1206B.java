package e;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1206B {
    public static final void a(View view, y onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(z.f13590b, onBackPressedDispatcherOwner);
    }
}
