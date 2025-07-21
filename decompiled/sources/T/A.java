package T;

import I.InterfaceC0455u;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class A {
    public static A j(Bitmap bitmap, L.g gVar, Rect rect, int i6, Matrix matrix, InterfaceC0455u interfaceC0455u) {
        return new C0748c(bitmap, gVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i6, matrix, interfaceC0455u);
    }

    public static A k(androidx.camera.core.d dVar, L.g gVar, Rect rect, int i6, Matrix matrix, InterfaceC0455u interfaceC0455u) {
        return l(dVar, gVar, new Size(dVar.getWidth(), dVar.getHeight()), rect, i6, matrix, interfaceC0455u);
    }

    public static A l(androidx.camera.core.d dVar, L.g gVar, Size size, Rect rect, int i6, Matrix matrix, InterfaceC0455u interfaceC0455u) {
        if (dVar.g() == 256) {
            y0.g.g(gVar, "JPEG image must have Exif.");
        }
        return new C0748c(dVar, gVar, dVar.g(), size, rect, i6, matrix, interfaceC0455u);
    }

    public static A m(byte[] bArr, L.g gVar, int i6, Size size, Rect rect, int i7, Matrix matrix, InterfaceC0455u interfaceC0455u) {
        return new C0748c(bArr, gVar, i6, size, rect, i7, matrix, interfaceC0455u);
    }

    public abstract InterfaceC0455u a();

    public abstract Rect b();

    public abstract Object c();

    public abstract L.g d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return L.q.e(b(), h());
    }
}
