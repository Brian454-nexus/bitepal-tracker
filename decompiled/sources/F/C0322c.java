package F;

import I.InterfaceC0443n0;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0322c implements InterfaceC0443n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f1416a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1417b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1418c = true;

    public C0322c(ImageReader imageReader) {
        this.f1416a = imageReader;
    }

    public static /* synthetic */ void a(final C0322c c0322c, Executor executor, final InterfaceC0443n0.a aVar, ImageReader imageReader) {
        synchronized (c0322c.f1417b) {
            try {
                if (!c0322c.f1418c) {
                    executor.execute(new Runnable() { // from class: F.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0322c.g(C0322c.this, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void g(C0322c c0322c, InterfaceC0443n0.a aVar) {
        c0322c.getClass();
        aVar.a(c0322c);
    }

    @Override // I.InterfaceC0443n0
    public androidx.camera.core.d acquireLatestImage() {
        Image image;
        synchronized (this.f1417b) {
            try {
                image = this.f1416a.acquireLatestImage();
            } catch (RuntimeException e6) {
                if (!h(e6)) {
                    throw e6;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // I.InterfaceC0443n0
    public int b() {
        int imageFormat;
        synchronized (this.f1417b) {
            imageFormat = this.f1416a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // I.InterfaceC0443n0
    public void c() {
        synchronized (this.f1417b) {
            this.f1418c = true;
            this.f1416a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // I.InterfaceC0443n0
    public void close() {
        synchronized (this.f1417b) {
            this.f1416a.close();
        }
    }

    @Override // I.InterfaceC0443n0
    public void d(final InterfaceC0443n0.a aVar, final Executor executor) {
        synchronized (this.f1417b) {
            this.f1418c = false;
            this.f1416a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: F.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0322c.a(C0322c.this, executor, aVar, imageReader);
                }
            }, L.m.a());
        }
    }

    @Override // I.InterfaceC0443n0
    public int e() {
        int maxImages;
        synchronized (this.f1417b) {
            maxImages = this.f1416a.getMaxImages();
        }
        return maxImages;
    }

    @Override // I.InterfaceC0443n0
    public androidx.camera.core.d f() {
        Image image;
        synchronized (this.f1417b) {
            try {
                image = this.f1416a.acquireNextImage();
            } catch (RuntimeException e6) {
                if (!h(e6)) {
                    throw e6;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // I.InterfaceC0443n0
    public int getHeight() {
        int height;
        synchronized (this.f1417b) {
            height = this.f1416a.getHeight();
        }
        return height;
    }

    @Override // I.InterfaceC0443n0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f1417b) {
            surface = this.f1416a.getSurface();
        }
        return surface;
    }

    @Override // I.InterfaceC0443n0
    public int getWidth() {
        int width;
        synchronized (this.f1417b) {
            width = this.f1416a.getWidth();
        }
        return width;
    }

    public final boolean h(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
