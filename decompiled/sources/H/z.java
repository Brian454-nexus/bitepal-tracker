package H;

import F.Y;
import H.F;
import I.InterfaceC0455u;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class z implements T.z {
    public static T.A b(G g6, L.g gVar, androidx.camera.core.d dVar) {
        return T.A.k(dVar, gVar, g6.b(), g6.e(), g6.f(), d(dVar));
    }

    public static T.A c(G g6, L.g gVar, androidx.camera.core.d dVar) {
        Size size = new Size(dVar.getWidth(), dVar.getHeight());
        int e6 = g6.e() - gVar.s();
        Size e7 = e(e6, size);
        Matrix b6 = L.q.b(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, e7.getWidth(), e7.getHeight()), e6);
        return T.A.l(dVar, gVar, e7, f(g6.b(), b6), gVar.s(), g(g6.f(), b6), d(dVar));
    }

    public static InterfaceC0455u d(androidx.camera.core.d dVar) {
        return ((O.b) dVar.O()).d();
    }

    public static Size e(int i6, Size size) {
        return L.q.f(L.q.r(i6)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T.A apply(F.b bVar) {
        L.g j6;
        androidx.camera.core.d a6 = bVar.a();
        G b6 = bVar.b();
        if (a6.g() == 256) {
            try {
                j6 = L.g.j(a6);
                a6.j()[0].d().rewind();
            } catch (IOException e6) {
                throw new Y(1, "Failed to extract EXIF data.", e6);
            }
        } else {
            j6 = null;
        }
        if (!C0394s.f2023g.b(a6)) {
            return b(b6, j6, a6);
        }
        y0.g.g(j6, "JPEG image must have exif.");
        return c(b6, j6, a6);
    }
}
