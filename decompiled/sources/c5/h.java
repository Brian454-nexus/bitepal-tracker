package c5;

import T4.v;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f10758a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.b f10759b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f10760a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f10760a = animatedImageDrawable;
        }

        @Override // T4.v
        public void a() {
            this.f10760a.stop();
            this.f10760a.clearAnimationCallbacks();
        }

        @Override // T4.v
        public Class b() {
            return Drawable.class;
        }

        @Override // T4.v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f10760a;
        }

        @Override // T4.v
        public int f() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f10760a.getIntrinsicWidth();
            intrinsicHeight = this.f10760a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * n5.l.j(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements R4.j {

        /* renamed from: a, reason: collision with root package name */
        public final h f10761a;

        public b(h hVar) {
            this.f10761a = hVar;
        }

        @Override // R4.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(ByteBuffer byteBuffer, int i6, int i7, R4.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f10761a.b(createSource, i6, i7, hVar);
        }

        @Override // R4.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, R4.h hVar) {
            return this.f10761a.d(byteBuffer);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements R4.j {

        /* renamed from: a, reason: collision with root package name */
        public final h f10762a;

        public c(h hVar) {
            this.f10762a = hVar;
        }

        @Override // R4.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(InputStream inputStream, int i6, int i7, R4.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(n5.a.b(inputStream));
            return this.f10762a.b(createSource, i6, i7, hVar);
        }

        @Override // R4.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, R4.h hVar) {
            return this.f10762a.c(inputStream);
        }
    }

    public h(List list, U4.b bVar) {
        this.f10758a = list;
        this.f10759b = bVar;
    }

    public static R4.j a(List list, U4.b bVar) {
        return new b(new h(list, bVar));
    }

    public static R4.j f(List list, U4.b bVar) {
        return new c(new h(list, bVar));
    }

    public v b(ImageDecoder.Source source, int i6, int i7, R4.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new Z4.h(i6, i7, hVar));
        if (AbstractC1153b.a(decodeDrawable)) {
            return new a(AbstractC1154c.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f10758a, inputStream, this.f10759b));
    }

    public boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f10758a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
