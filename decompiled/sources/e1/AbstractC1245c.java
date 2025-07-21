package e1;

import Z0.z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayInputStream;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1245c {
    public static Bitmap a(byte[] bArr, int i6, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i6, options);
        if (decodeByteArray == null) {
            throw z.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            N0.a aVar = new N0.a(byteArrayInputStream);
            byteArrayInputStream.close();
            int s6 = aVar.s();
            if (s6 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(s6);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }
}
