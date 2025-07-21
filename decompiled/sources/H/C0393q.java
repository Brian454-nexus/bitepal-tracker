package H;

import F.Y;
import I.G0;
import S.b;
import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: H.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0393q implements T.z {

    /* renamed from: a, reason: collision with root package name */
    public final R.d f2022a;

    /* renamed from: H.q$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a c(T.A a6, int i6) {
            return new C0380d(a6, i6);
        }

        public abstract int a();

        public abstract T.A b();
    }

    public C0393q(G0 g02) {
        this.f2022a = new R.d(g02);
    }

    public static L.g b(byte[] bArr) {
        try {
            return L.g.k(new ByteArrayInputStream(bArr));
        } catch (IOException e6) {
            throw new Y(0, "Failed to extract Exif from YUV-generated JPEG", e6);
        }
    }

    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T.A apply(a aVar) {
        T.A d6;
        try {
            int e6 = aVar.b().e();
            if (e6 == 35) {
                d6 = d(aVar);
            } else {
                if (e6 != 256) {
                    throw new IllegalArgumentException("Unexpected format: " + e6);
                }
                d6 = c(aVar);
            }
            return d6;
        } finally {
            ((androidx.camera.core.d) aVar.b().c()).close();
        }
    }

    public final T.A c(a aVar) {
        T.A b6 = aVar.b();
        byte[] a6 = this.f2022a.a((androidx.camera.core.d) b6.c());
        L.g d6 = b6.d();
        Objects.requireNonNull(d6);
        return T.A.m(a6, d6, 256, b6.h(), b6.b(), b6.f(), b6.g(), b6.a());
    }

    public final T.A d(a aVar) {
        T.A b6 = aVar.b();
        androidx.camera.core.d dVar = (androidx.camera.core.d) b6.c();
        Rect b7 = b6.b();
        try {
            byte[] f6 = S.b.f(dVar, b7, aVar.a(), b6.f());
            return T.A.m(f6, b(f6), 256, new Size(b7.width(), b7.height()), new Rect(0, 0, b7.width(), b7.height()), b6.f(), L.q.q(b6.g(), b7), b6.a());
        } catch (b.a e6) {
            throw new Y(1, "Failed to encode the image to JPEG.", e6);
        }
    }
}
