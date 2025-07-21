package q0;

import android.graphics.Color;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1998a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18607a = new ThreadLocal();

    public static int a(double d6, double d7, double d8) {
        double d9 = (((3.2406d * d6) + ((-1.5372d) * d7)) + ((-0.4986d) * d8)) / 100.0d;
        double d10 = ((((-0.9689d) * d6) + (1.8758d * d7)) + (0.0415d * d8)) / 100.0d;
        double d11 = (((0.0557d * d6) + ((-0.204d) * d7)) + (1.057d * d8)) / 100.0d;
        return Color.rgb(e((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255));
    }

    public static int b(int i6, int i7) {
        return 255 - (((255 - i7) * (255 - i6)) / 255);
    }

    public static int c(int i6, int i7) {
        int alpha = Color.alpha(i7);
        int alpha2 = Color.alpha(i6);
        int b6 = b(alpha2, alpha);
        return Color.argb(b6, d(Color.red(i6), alpha2, Color.red(i7), alpha, b6), d(Color.green(i6), alpha2, Color.green(i7), alpha, b6), d(Color.blue(i6), alpha2, Color.blue(i7), alpha, b6));
    }

    public static int d(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((i6 * 255) * i7) + ((i8 * i9) * (255 - i7))) / (i10 * 255);
    }

    public static int e(int i6, int i7, int i8) {
        return i6 < i7 ? i7 : Math.min(i6, i8);
    }

    public static int f(int i6, int i7) {
        if (i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & 16777215) | (i7 << 24);
    }
}
