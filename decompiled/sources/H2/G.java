package H2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class G extends D {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2040d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2041e = true;

    @Override // H2.M
    public void g(View view, Matrix matrix) {
        if (f2040d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2040d = false;
            }
        }
    }

    @Override // H2.M
    public void h(View view, Matrix matrix) {
        if (f2041e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2041e = false;
            }
        }
    }
}
