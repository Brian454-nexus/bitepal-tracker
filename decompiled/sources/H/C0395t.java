package H;

import F.Y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* renamed from: H.t, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0395t implements T.z {
    @Override // T.z
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T.A apply(T.A a6) {
        Rect b6 = a6.b();
        Bitmap b7 = b((byte[]) a6.c(), b6);
        L.g d6 = a6.d();
        Objects.requireNonNull(d6);
        return T.A.j(b7, d6, new Rect(0, 0, b7.getWidth(), b7.getHeight()), a6.f(), L.q.q(a6.g(), b6), a6.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e6) {
            throw new Y(1, "Failed to decode JPEG.", e6);
        }
    }
}
