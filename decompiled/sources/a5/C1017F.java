package a5;

import R4.g;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a5.F, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1017F implements R4.j {

    /* renamed from: d, reason: collision with root package name */
    public static final R4.g f7724d = R4.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final R4.g f7725e = R4.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    public static final f f7726f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final List f7727g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e f7728a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.d f7729b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7730c;

    /* renamed from: a5.F$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f7731a = ByteBuffer.allocate(8);

        @Override // R4.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l6, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7731a) {
                this.f7731a.position(0);
                messageDigest.update(this.f7731a.putLong(l6.longValue()).array());
            }
        }
    }

    /* renamed from: a5.F$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f7732a = ByteBuffer.allocate(4);

        @Override // R4.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f7732a) {
                this.f7732a.position(0);
                messageDigest.update(this.f7732a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: a5.F$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements e {
        public c() {
        }

        @Override // a5.C1017F.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // a5.C1017F.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: a5.F$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements e {

        /* renamed from: a5.F$d$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f7733a;

            public a(ByteBuffer byteBuffer) {
                this.f7733a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f7733a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j6, byte[] bArr, int i6, int i7) {
                if (j6 >= this.f7733a.limit()) {
                    return -1;
                }
                this.f7733a.position((int) j6);
                int min = Math.min(i7, this.f7733a.remaining());
                this.f7733a.get(bArr, i6, min);
                return min;
            }
        }

        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // a5.C1017F.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // a5.C1017F.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    /* renamed from: a5.F$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: a5.F$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: a5.F$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g implements e {
        @Override // a5.C1017F.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // a5.C1017F.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: a5.F$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public C1017F(U4.d dVar, e eVar) {
        this(dVar, eVar, f7726f);
    }

    public static R4.j c(U4.d dVar) {
        return new C1017F(dVar, new c(null));
    }

    public static R4.j d(U4.d dVar) {
        return new C1017F(dVar, new d());
    }

    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6) {
        return mediaMetadataRetriever.getFrameAtTime(j6, i6);
    }

    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6, int i7, int i8, o oVar) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b6 = oVar.b(parseInt, parseInt2, i7, i8);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j6, i6, Math.round(parseInt * b6), Math.round(b6 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i6 = Build.VERSION.SDK_INT;
        return i6 >= 30 && i6 < 33;
    }

    public static boolean k() {
        Iterator it = f7727g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static R4.j m(U4.d dVar) {
        return new C1017F(dVar, new g());
    }

    @Override // R4.j
    public T4.v a(Object obj, int i6, int i7, R4.h hVar) {
        long longValue = ((Long) hVar.c(f7724d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f7725e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) hVar.c(o.f7761h);
        if (oVar == null) {
            oVar = o.f7760g;
        }
        o oVar2 = oVar;
        MediaMetadataRetriever a6 = this.f7730c.a();
        try {
            this.f7728a.b(a6, obj);
            try {
                Bitmap f6 = f(obj, a6, longValue, num.intValue(), i6, i7, oVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    a6.release();
                } else {
                    a6.release();
                }
                return a5.g.e(f6, this.f7729b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    a6.release();
                    throw th2;
                }
                a6.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // R4.j
    public boolean b(Object obj, R4.h hVar) {
        return true;
    }

    public final Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6, int i7, int i8, o oVar) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap h6 = (Build.VERSION.SDK_INT < 27 || i7 == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || oVar == o.f7759f) ? null : h(mediaMetadataRetriever, j6, i6, i7, i8, oVar);
        if (h6 == null) {
            h6 = g(mediaMetadataRetriever, j6, i6);
        }
        Bitmap e6 = e(mediaMetadataRetriever, h6);
        if (e6 != null) {
            return e6;
        }
        throw new h();
    }

    public final boolean l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f7728a.a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i6 = 0; i6 < trackCount; i6++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i6).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public C1017F(U4.d dVar, e eVar, f fVar) {
        this.f7729b = dVar;
        this.f7728a = eVar;
        this.f7730c = fVar;
    }
}
