package H;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* renamed from: H.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0385i implements T.z {

    /* renamed from: H.i$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a c(T.A a6, int i6) {
            return new C0377a(a6, i6);
        }

        public abstract int a();

        public abstract T.A b();
    }

    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T.A apply(a aVar) {
        T.A b6 = aVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b6.c()).compress(Bitmap.CompressFormat.JPEG, aVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        L.g d6 = b6.d();
        Objects.requireNonNull(d6);
        return T.A.m(byteArray, d6, 256, b6.h(), b6.b(), b6.f(), b6.g(), b6.a());
    }
}
