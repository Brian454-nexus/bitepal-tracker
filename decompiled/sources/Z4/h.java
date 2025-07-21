package Z4;

import a5.o;
import a5.p;
import a5.u;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final u f7512a = u.b();

    /* renamed from: b, reason: collision with root package name */
    public final int f7513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7514c;

    /* renamed from: d, reason: collision with root package name */
    public final R4.b f7515d;

    /* renamed from: e, reason: collision with root package name */
    public final o f7516e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7517f;

    /* renamed from: g, reason: collision with root package name */
    public final R4.i f7518g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public h(int i6, int i7, R4.h hVar) {
        this.f7513b = i6;
        this.f7514c = i7;
        this.f7515d = (R4.b) hVar.c(p.f7766f);
        this.f7516e = (o) hVar.c(o.f7761h);
        R4.g gVar = p.f7770j;
        this.f7517f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f7518g = (R4.i) hVar.c(p.f7767g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        if (this.f7512a.f(this.f7513b, this.f7514c, this.f7517f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f7515d == R4.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i6 = this.f7513b;
        if (i6 == Integer.MIN_VALUE) {
            i6 = size.getWidth();
        }
        int i7 = this.f7514c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = size.getHeight();
        }
        float b6 = this.f7516e.b(size.getWidth(), size.getHeight(), i6, i7);
        int round = Math.round(size.getWidth() * b6);
        int round2 = Math.round(size.getHeight() * b6);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b6);
        }
        imageDecoder.setTargetSize(round, round2);
        R4.i iVar = this.f7518g;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (iVar == R4.i.DISPLAY_P3) {
                colorSpace = imageInfo.getColorSpace();
                if (colorSpace != null) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2.isWideGamut()) {
                        named = ColorSpace.Named.DISPLAY_P3;
                        imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                    }
                }
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
