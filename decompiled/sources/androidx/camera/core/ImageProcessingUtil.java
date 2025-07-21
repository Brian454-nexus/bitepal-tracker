package androidx.camera.core;

import F.AbstractC0335i0;
import F.v0;
import I.InterfaceC0443n0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.b;
import java.nio.ByteBuffer;
import java.util.Locale;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    public static int f8360a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static /* synthetic */ void b(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static boolean c(d dVar) {
        if (!k(dVar)) {
            AbstractC0335i0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(dVar) != a.ERROR_CONVERSION) {
            return true;
        }
        AbstractC0335i0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    public static a d(d dVar) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int a6 = dVar.j()[0].a();
        int a7 = dVar.j()[1].a();
        int a8 = dVar.j()[2].a();
        int b6 = dVar.j()[0].b();
        int b7 = dVar.j()[1].b();
        return nativeShiftPixel(dVar.j()[0].d(), a6, dVar.j()[1].d(), a7, dVar.j()[2].d(), a8, b6, b7, width, height, b6, b7, b7) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static d e(InterfaceC0443n0 interfaceC0443n0, byte[] bArr) {
        g.a(interfaceC0443n0.b() == 256);
        g.f(bArr);
        Surface surface = interfaceC0443n0.getSurface();
        g.f(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC0335i0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
        if (acquireLatestImage == null) {
            AbstractC0335i0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static d f(final d dVar, InterfaceC0443n0 interfaceC0443n0, ByteBuffer byteBuffer, int i6, boolean z6) {
        if (!k(dVar)) {
            AbstractC0335i0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!j(i6)) {
            AbstractC0335i0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (g(dVar, interfaceC0443n0.getSurface(), byteBuffer, i6, z6) == a.ERROR_CONVERSION) {
            AbstractC0335i0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            AbstractC0335i0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f8360a)));
            f8360a++;
        }
        final d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
        if (acquireLatestImage == null) {
            AbstractC0335i0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        v0 v0Var = new v0(acquireLatestImage);
        v0Var.a(new b.a() { // from class: F.a0
            @Override // androidx.camera.core.b.a
            public final void a(androidx.camera.core.d dVar2) {
                ImageProcessingUtil.b(androidx.camera.core.d.this, dVar, dVar2);
            }
        });
        return v0Var;
    }

    public static a g(d dVar, Surface surface, ByteBuffer byteBuffer, int i6, boolean z6) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int a6 = dVar.j()[0].a();
        int a7 = dVar.j()[1].a();
        int a8 = dVar.j()[2].a();
        int b6 = dVar.j()[0].b();
        int b7 = dVar.j()[1].b();
        return nativeConvertAndroid420ToABGR(dVar.j()[0].d(), a6, dVar.j()[1].d(), a7, dVar.j()[2].d(), a8, b6, b7, surface, byteBuffer, width, height, z6 ? b6 : 0, z6 ? b7 : 0, z6 ? b7 : 0, i6) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void h(Bitmap bitmap, ByteBuffer byteBuffer, int i6) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i6, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i6) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i6, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean j(int i6) {
        return i6 == 0 || i6 == 90 || i6 == 180 || i6 == 270;
    }

    public static boolean k(d dVar) {
        return dVar.g() == 35 && dVar.j().length == 3;
    }

    public static d l(d dVar, InterfaceC0443n0 interfaceC0443n0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i6) {
        final d dVar2;
        a aVar;
        if (!k(dVar)) {
            AbstractC0335i0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!j(i6)) {
            AbstractC0335i0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar2 = a.ERROR_CONVERSION;
        if (i6 > 0) {
            dVar2 = dVar;
            aVar = m(dVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i6);
        } else {
            dVar2 = dVar;
            aVar = aVar2;
        }
        if (aVar == aVar2) {
            AbstractC0335i0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final d acquireLatestImage = interfaceC0443n0.acquireLatestImage();
        if (acquireLatestImage == null) {
            AbstractC0335i0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        v0 v0Var = new v0(acquireLatestImage);
        v0Var.a(new b.a() { // from class: F.b0
            @Override // androidx.camera.core.b.a
            public final void a(androidx.camera.core.d dVar3) {
                ImageProcessingUtil.a(androidx.camera.core.d.this, dVar2, dVar3);
            }
        });
        return v0Var;
    }

    public static a m(d dVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i6) {
        int width = dVar.getWidth();
        int height = dVar.getHeight();
        int a6 = dVar.j()[0].a();
        int a7 = dVar.j()[1].a();
        int a8 = dVar.j()[2].a();
        int b6 = dVar.j()[1].b();
        Image b7 = P.a.b(imageWriter);
        if (b7 != null && nativeRotateYUV(dVar.j()[0].d(), a6, dVar.j()[1].d(), a7, dVar.j()[2].d(), a8, b6, b7.getPlanes()[0].getBuffer(), b7.getPlanes()[0].getRowStride(), b7.getPlanes()[0].getPixelStride(), b7.getPlanes()[1].getBuffer(), b7.getPlanes()[1].getRowStride(), b7.getPlanes()[1].getPixelStride(), b7.getPlanes()[2].getBuffer(), b7.getPlanes()[2].getRowStride(), b7.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i6) == 0) {
            P.a.d(imageWriter, b7);
            return a.SUCCESS;
        }
        return a.ERROR_CONVERSION;
    }

    public static boolean n(Surface surface, byte[] bArr) {
        g.f(bArr);
        g.f(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        AbstractC0335i0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i6, @NonNull ByteBuffer byteBuffer2, int i7, @NonNull ByteBuffer byteBuffer3, int i8, int i9, int i10, Surface surface, ByteBuffer byteBuffer4, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i6, int i7, int i8, int i9, boolean z6);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i6, @NonNull ByteBuffer byteBuffer2, int i7, @NonNull ByteBuffer byteBuffer3, int i8, int i9, @NonNull ByteBuffer byteBuffer4, int i10, int i11, @NonNull ByteBuffer byteBuffer5, int i12, int i13, @NonNull ByteBuffer byteBuffer6, int i14, int i15, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i16, int i17, int i18);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i6, @NonNull ByteBuffer byteBuffer2, int i7, @NonNull ByteBuffer byteBuffer3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
