package a5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface v {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f7792a;

        /* renamed from: b, reason: collision with root package name */
        public final List f7793b;

        /* renamed from: c, reason: collision with root package name */
        public final U4.b f7794c;

        public a(ByteBuffer byteBuffer, List list, U4.b bVar) {
            this.f7792a = byteBuffer;
            this.f7793b = list;
            this.f7794c = bVar;
        }

        @Override // a5.v
        public int a() {
            return com.bumptech.glide.load.a.c(this.f7793b, n5.a.d(this.f7792a), this.f7794c);
        }

        @Override // a5.v
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // a5.v
        public void c() {
        }

        @Override // a5.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f7793b, n5.a.d(this.f7792a));
        }

        public final InputStream e() {
            return n5.a.g(n5.a.d(this.f7792a));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f7795a;

        /* renamed from: b, reason: collision with root package name */
        public final U4.b f7796b;

        /* renamed from: c, reason: collision with root package name */
        public final List f7797c;

        public b(InputStream inputStream, List list, U4.b bVar) {
            this.f7796b = (U4.b) n5.k.d(bVar);
            this.f7797c = (List) n5.k.d(list);
            this.f7795a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // a5.v
        public int a() {
            return com.bumptech.glide.load.a.b(this.f7797c, this.f7795a.a(), this.f7796b);
        }

        @Override // a5.v
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f7795a.a(), null, options);
        }

        @Override // a5.v
        public void c() {
            this.f7795a.c();
        }

        @Override // a5.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f7797c, this.f7795a.a(), this.f7796b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements v {

        /* renamed from: a, reason: collision with root package name */
        public final U4.b f7798a;

        /* renamed from: b, reason: collision with root package name */
        public final List f7799b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f7800c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, U4.b bVar) {
            this.f7798a = (U4.b) n5.k.d(bVar);
            this.f7799b = (List) n5.k.d(list);
            this.f7800c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // a5.v
        public int a() {
            return com.bumptech.glide.load.a.a(this.f7799b, this.f7800c, this.f7798a);
        }

        @Override // a5.v
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f7800c.a().getFileDescriptor(), null, options);
        }

        @Override // a5.v
        public void c() {
        }

        @Override // a5.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f7799b, this.f7800c, this.f7798a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
