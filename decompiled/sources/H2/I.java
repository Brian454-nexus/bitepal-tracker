package H2;

import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class I extends G {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2042f = true;

    @Override // H2.M
    public void d(View view, int i6, int i7, int i8, int i9) {
        if (f2042f) {
            try {
                view.setLeftTopRightBottom(i6, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f2042f = false;
            }
        }
    }
}
