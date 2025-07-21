package a5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: a5.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1023f implements R4.j {

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f7742a = new U4.e();

    @Override // R4.j
    public /* bridge */ /* synthetic */ T4.v a(Object obj, int i6, int i7, R4.h hVar) {
        return c(AbstractC1021d.a(obj), i6, i7, hVar);
    }

    @Override // R4.j
    public /* bridge */ /* synthetic */ boolean b(Object obj, R4.h hVar) {
        return d(AbstractC1021d.a(obj), hVar);
    }

    public T4.v c(ImageDecoder.Source source, int i6, int i7, R4.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new Z4.h(i6, i7, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i6 + "x" + i7 + "]");
        }
        return new g(decodeBitmap, this.f7742a);
    }

    public boolean d(ImageDecoder.Source source, R4.h hVar) {
        return true;
    }
}
