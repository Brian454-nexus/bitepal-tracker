package L;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f3083a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f3083a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix b(RectF rectF, RectF rectF2, int i6) {
        return c(rectF, rectF2, i6, false);
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i6, boolean z6) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f3083a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i6);
        if (z6) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(a(rectF2));
        return matrix;
    }

    public static Size d(Rect rect, int i6) {
        return l(i(rect), i6);
    }

    public static boolean e(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean f(int i6) {
        if (i6 == 90 || i6 == 270) {
            return true;
        }
        if (i6 == 0 || i6 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i6);
    }

    public static boolean g(Size size, Size size2) {
        return h(size, false, size2, false);
    }

    public static boolean h(Size size, boolean z6, Size size2, boolean z7) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z6) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z7) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static Size i(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String j(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static Size k(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size l(Size size, int i6) {
        y0.g.b(i6 % 90 == 0, "Invalid rotation degrees: " + i6);
        return f(r(i6)) ? k(size) : size;
    }

    public static Rect m(Size size) {
        return n(size, 0, 0);
    }

    public static Rect n(Size size, int i6, int i7) {
        return new Rect(i6, i7, size.getWidth() + i6, size.getHeight() + i7);
    }

    public static RectF o(Size size) {
        return p(size, 0, 0);
    }

    public static RectF p(Size size, int i6, int i7) {
        return new RectF(i6, i7, i6 + size.getWidth(), i7 + size.getHeight());
    }

    public static Matrix q(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int r(int i6) {
        return ((i6 % 360) + 360) % 360;
    }
}
