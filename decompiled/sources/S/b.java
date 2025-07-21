package S;

import F.AbstractC0335i0;
import L.i;
import L.j;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.d;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC0078a f4632a;

        /* renamed from: S.b$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum EnumC0078a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str, EnumC0078a enumC0078a) {
            super(str);
            this.f4632a = enumC0078a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i6;
        if (!e(rational)) {
            AbstractC0335i0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f6 = width;
        float f7 = height;
        float f8 = f6 / f7;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i7 = 0;
        if (rational.floatValue() > f8) {
            int round = Math.round((f6 / numerator) * denominator);
            i6 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f7 / denominator) * numerator);
            int i8 = (width - round2) / 2;
            width = round2;
            i6 = 0;
            i7 = i8;
        }
        return new Rect(i7, i6, width + i7, height + i6);
    }

    public static ByteBuffer b(Bitmap bitmap) {
        g.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.h(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static Rational c(int i6, Rational rational) {
        return (i6 == 90 || i6 == 270) ? d(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational d(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean e(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static byte[] f(androidx.camera.core.d dVar, Rect rect, int i6, int i7) {
        if (dVar.g() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.g());
        }
        YuvImage yuvImage = new YuvImage(g(dVar), 17, dVar.getWidth(), dVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.b(dVar, i7));
        if (rect == null) {
            rect = new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i6, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0078a.ENCODE_FAILED);
    }

    public static byte[] g(androidx.camera.core.d dVar) {
        d.a aVar = dVar.j()[0];
        d.a aVar2 = dVar.j()[1];
        d.a aVar3 = dVar.j()[2];
        ByteBuffer d6 = aVar.d();
        ByteBuffer d7 = aVar2.d();
        ByteBuffer d8 = aVar3.d();
        d6.rewind();
        d7.rewind();
        d8.rewind();
        int remaining = d6.remaining();
        byte[] bArr = new byte[((dVar.getWidth() * dVar.getHeight()) / 2) + remaining];
        int i6 = 0;
        for (int i7 = 0; i7 < dVar.getHeight(); i7++) {
            d6.get(bArr, i6, dVar.getWidth());
            i6 += dVar.getWidth();
            d6.position(Math.min(remaining, (d6.position() - dVar.getWidth()) + aVar.a()));
        }
        int height = dVar.getHeight() / 2;
        int width = dVar.getWidth() / 2;
        int a6 = aVar3.a();
        int a7 = aVar2.a();
        int b6 = aVar3.b();
        int b7 = aVar2.b();
        byte[] bArr2 = new byte[a6];
        byte[] bArr3 = new byte[a7];
        for (int i8 = 0; i8 < height; i8++) {
            d8.get(bArr2, 0, Math.min(a6, d8.remaining()));
            d7.get(bArr3, 0, Math.min(a7, d7.remaining()));
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < width; i11++) {
                int i12 = i6 + 1;
                bArr[i6] = bArr2[i9];
                i6 += 2;
                bArr[i12] = bArr3[i10];
                i9 += b6;
                i10 += b7;
            }
        }
        return bArr;
    }
}
