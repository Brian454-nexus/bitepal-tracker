package H2;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2195a = true;

    public static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z6) {
        if (f2195a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f2195a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else {
            b(viewGroup, z6);
        }
    }
}
