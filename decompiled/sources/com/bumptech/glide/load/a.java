package com.bumptech.glide.load;

import a5.z;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0184a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f13245a;

        public C0184a(InputStream inputStream) {
            this.f13245a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f13245a);
            } finally {
                this.f13245a.reset();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f13246a;

        public b(ByteBuffer byteBuffer) {
            this.f13246a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f13246a);
            } finally {
                n5.a.d(this.f13246a);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f13247a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U4.b f13248b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, U4.b bVar) {
            this.f13247a = parcelFileDescriptorRewinder;
            this.f13248b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            z zVar = null;
            try {
                z zVar2 = new z(new FileInputStream(this.f13247a.a().getFileDescriptor()), this.f13248b);
                try {
                    ImageHeaderParser.ImageType c6 = imageHeaderParser.c(zVar2);
                    zVar2.D();
                    this.f13247a.a();
                    return c6;
                } catch (Throwable th) {
                    th = th;
                    zVar = zVar2;
                    if (zVar != null) {
                        zVar.D();
                    }
                    this.f13247a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f13249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U4.b f13250b;

        public d(ByteBuffer byteBuffer, U4.b bVar) {
            this.f13249a = byteBuffer;
            this.f13250b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f13249a, this.f13250b);
            } finally {
                n5.a.d(this.f13249a);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f13251a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U4.b f13252b;

        public e(InputStream inputStream, U4.b bVar) {
            this.f13251a = inputStream;
            this.f13252b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f13251a, this.f13252b);
            } finally {
                this.f13251a.reset();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f13253a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U4.b f13254b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, U4.b bVar) {
            this.f13253a = parcelFileDescriptorRewinder;
            this.f13254b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            z zVar = null;
            try {
                z zVar2 = new z(new FileInputStream(this.f13253a.a().getFileDescriptor()), this.f13254b);
                try {
                    int d6 = imageHeaderParser.d(zVar2, this.f13254b);
                    zVar2.D();
                    this.f13253a.a();
                    return d6;
                } catch (Throwable th) {
                    th = th;
                    zVar = zVar2;
                    if (zVar != null) {
                        zVar.D();
                    }
                    this.f13253a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, U4.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, U4.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, U4.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    public static int d(List list, g gVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int a6 = gVar.a((ImageHeaderParser) list.get(i6));
            if (a6 != -1) {
                return a6;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, U4.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, U4.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0184a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ImageHeaderParser.ImageType a6 = hVar.a((ImageHeaderParser) list.get(i6));
            if (a6 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a6;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
