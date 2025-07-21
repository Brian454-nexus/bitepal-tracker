package H2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class L extends K {
    @Override // H2.D, H2.M
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // H2.I, H2.M
    public void d(View view, int i6, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i6, i7, i8, i9);
    }

    @Override // H2.D, H2.M
    public void e(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // H2.K, H2.M
    public void f(View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // H2.G, H2.M
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // H2.G, H2.M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
