package H2;

import android.os.Build;
import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K extends I {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2043g = true;

    @Override // H2.M
    public void f(View view, int i6) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i6);
        } else if (f2043g) {
            try {
                view.setTransitionVisibility(i6);
            } catch (NoSuchMethodError unused) {
                f2043g = false;
            }
        }
    }
}
