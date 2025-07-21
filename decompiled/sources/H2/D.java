package H2;

import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class D extends M {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2039c = true;

    @Override // H2.M
    public void a(View view) {
    }

    @Override // H2.M
    public float b(View view) {
        float transitionAlpha;
        if (f2039c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f2039c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // H2.M
    public void c(View view) {
    }

    @Override // H2.M
    public void e(View view, float f6) {
        if (f2039c) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f2039c = false;
            }
        }
        view.setAlpha(f6);
    }
}
