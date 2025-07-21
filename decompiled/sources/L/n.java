package L;

import android.opengl.Matrix;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f3082a = new float[16];

    public static void a(float[] fArr, float f6, float f7) {
        Matrix.translateM(fArr, 0, -f6, -f7, 0.0f);
    }

    public static void b(float[] fArr, float f6, float f7) {
        Matrix.translateM(fArr, 0, f6, f7, 0.0f);
    }

    public static void c(float[] fArr, float f6, float f7, float f8) {
        b(fArr, f7, f8);
        Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
        a(fArr, f7, f8);
    }

    public static void d(float[] fArr, float f6) {
        b(fArr, 0.0f, f6);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, 0.0f, f6);
    }
}
