package p0;

import android.graphics.Color;
import q0.AbstractC1998a;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1888b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f18080a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f18081b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f18082c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f18083d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f7 = (f6 + 16.0f) / 116.0f;
        float f8 = f6 > 8.0f ? f7 * f7 * f7 : f6 / 903.2963f;
        float f9 = f7 * f7 * f7;
        boolean z6 = f9 > 0.008856452f;
        float f10 = z6 ? f9 : ((f7 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f9 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f18082c;
        return AbstractC1998a.a(f10 * fArr[0], f8 * fArr[1], f9 * fArr[2]);
    }

    public static float b(int i6) {
        return c(g(i6));
    }

    public static float c(float f6) {
        float f7 = f6 / 100.0f;
        return f7 <= 0.008856452f ? f7 * 903.2963f : (((float) Math.cbrt(f7)) * 116.0f) - 16.0f;
    }

    public static float d(float f6, float f7, float f8) {
        return f6 + ((f7 - f6) * f8);
    }

    public static float e(int i6) {
        float f6 = i6 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void f(int i6, float[] fArr) {
        float e6 = e(Color.red(i6));
        float e7 = e(Color.green(i6));
        float e8 = e(Color.blue(i6));
        float[][] fArr2 = f18083d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * e6) + (fArr3[1] * e7) + (fArr3[2] * e8);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * e6) + (fArr4[1] * e7) + (fArr4[2] * e8);
        float[] fArr5 = fArr2[2];
        fArr[2] = (e6 * fArr5[0]) + (e7 * fArr5[1]) + (e8 * fArr5[2]);
    }

    public static float g(int i6) {
        float e6 = e(Color.red(i6));
        float e7 = e(Color.green(i6));
        float e8 = e(Color.blue(i6));
        float[] fArr = f18083d[1];
        return (e6 * fArr[0]) + (e7 * fArr[1]) + (e8 * fArr[2]);
    }

    public static float h(float f6) {
        return (f6 > 8.0f ? (float) Math.pow((f6 + 16.0d) / 116.0d, 3.0d) : f6 / 903.2963f) * 100.0f;
    }
}
