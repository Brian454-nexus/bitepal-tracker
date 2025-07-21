package a5;

import a5.o;
import a5.v;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final R4.g f7766f = R4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", R4.b.f4611c);

    /* renamed from: g, reason: collision with root package name */
    public static final R4.g f7767g = R4.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final R4.g f7768h = o.f7761h;

    /* renamed from: i, reason: collision with root package name */
    public static final R4.g f7769i;

    /* renamed from: j, reason: collision with root package name */
    public static final R4.g f7770j;

    /* renamed from: k, reason: collision with root package name */
    public static final Set f7771k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f7772l;

    /* renamed from: m, reason: collision with root package name */
    public static final Set f7773m;

    /* renamed from: n, reason: collision with root package name */
    public static final Queue f7774n;

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f7775a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7776b;

    /* renamed from: c, reason: collision with root package name */
    public final U4.b f7777c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7778d;

    /* renamed from: e, reason: collision with root package name */
    public final u f7779e = u.b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {
        @Override // a5.p.b
        public void a() {
        }

        @Override // a5.p.b
        public void b(U4.d dVar, Bitmap bitmap) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();

        void b(U4.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f7769i = R4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f7770j = R4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f7771k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f7772l = new a();
        f7773m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f7774n = n5.l.g(0);
    }

    public p(List list, DisplayMetrics displayMetrics, U4.d dVar, U4.b bVar) {
        this.f7778d = list;
        this.f7776b = (DisplayMetrics) n5.k.d(displayMetrics);
        this.f7775a = (U4.d) n5.k.d(dVar);
        this.f7777c = (U4.b) n5.k.d(bVar);
    }

    public static int a(double d6) {
        return x((d6 / (r1 / r0)) * x(l(d6) * d6));
    }

    public static void c(ImageHeaderParser.ImageType imageType, v vVar, b bVar, U4.d dVar, o oVar, int i6, int i7, int i8, int i9, int i10, BitmapFactory.Options options) {
        int i11;
        int i12;
        int i13;
        int floor;
        int floor2;
        if (i7 <= 0 || i8 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i9 + "x" + i10 + "]");
                return;
            }
            return;
        }
        if (r(i6)) {
            i12 = i7;
            i11 = i8;
        } else {
            i11 = i7;
            i12 = i8;
        }
        float b6 = oVar.b(i11, i12, i9, i10);
        if (b6 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b6 + " from: " + oVar + ", source: [" + i7 + "x" + i8 + "], target: [" + i9 + "x" + i10 + "]");
        }
        o.g a6 = oVar.a(i11, i12, i9, i10);
        if (a6 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f6 = i11;
        float f7 = i12;
        int i14 = i11;
        int i15 = i12;
        int x6 = i14 / x(b6 * f6);
        int x7 = i15 / x(b6 * f7);
        o.g gVar = o.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a6 == gVar ? Math.max(x6, x7) : Math.min(x6, x7)));
        if (a6 == gVar && max < 1.0f / b6) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            i13 = 0;
            floor = (int) Math.ceil(f6 / min);
            floor2 = (int) Math.ceil(f7 / min);
            int i16 = max / 8;
            if (i16 > 0) {
                floor /= i16;
                floor2 /= i16;
            }
        } else {
            i13 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f8 = max;
                floor = (int) Math.floor(f6 / f8);
                floor2 = (int) Math.floor(f7 / f8);
            } else if (imageType.isWebp()) {
                float f9 = max;
                floor = Math.round(f6 / f9);
                floor2 = Math.round(f7 / f9);
            } else if (i14 % max == 0 && i15 % max == 0) {
                floor = i14 / max;
                floor2 = i15 / max;
            } else {
                int[] m6 = m(vVar, options, bVar, dVar);
                floor = m6[0];
                floor2 = m6[1];
            }
        }
        double b7 = oVar.b(floor, floor2, i9, i10);
        options.inTargetDensity = a(b7);
        options.inDensity = l(b7);
        if (s(options)) {
            options.inScaled = true;
        } else {
            int i17 = i13;
            options.inTargetDensity = i17;
            options.inDensity = i17;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i7 + "x" + i8 + "], degreesToRotate: " + i6 + ", target: [" + i9 + "x" + i10 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b6 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b7 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(a5.v r5, android.graphics.BitmapFactory.Options r6, a5.p.b r7, U4.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = a5.AbstractC1014C.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = a5.AbstractC1014C.f()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.c(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = a5.AbstractC1014C.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.p.i(a5.v, android.graphics.BitmapFactory$Options, a5.p$b, U4.d):android.graphics.Bitmap");
    }

    public static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (p.class) {
            Queue queue = f7774n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    public static int l(double d6) {
        if (d6 > 1.0d) {
            d6 = 1.0d / d6;
        }
        return (int) Math.round(d6 * 2.147483647E9d);
    }

    public static int[] m(v vVar, BitmapFactory.Options options, b bVar, U4.d dVar) {
        options.inJustDecodeBounds = true;
        i(vVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i6) {
        return i6 == 90 || i6 == 270;
    }

    public static boolean s(BitmapFactory.Options options) {
        int i6;
        int i7 = options.inTargetDensity;
        return i7 > 0 && (i6 = options.inDensity) > 0 && i7 != i6;
    }

    public static void t(int i6, int i7, String str, BitmapFactory.Options options, Bitmap bitmap, int i8, int i9, long j6) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i6 + "x" + i7 + "] " + str + " with inBitmap " + n(options) + " for [" + i8 + "x" + i9 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + n5.g.a(j6));
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i6, int i7, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i6 + ", outHeight: " + i7 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f7774n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d6) {
        return (int) (d6 + 0.5d);
    }

    public static void y(BitmapFactory.Options options, U4.d dVar, int i6, int i7) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = dVar.e(i6, i7, config);
    }

    public final void b(v vVar, R4.b bVar, boolean z6, boolean z7, BitmapFactory.Options options, int i6, int i7) {
        boolean z8;
        if (this.f7779e.g(i6, i7, options, z6, z7)) {
            return;
        }
        if (bVar == R4.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z8 = vVar.d().hasAlpha();
        } catch (IOException e6) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e6);
            }
            z8 = false;
        }
        Bitmap.Config config = z8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    public final T4.v d(v vVar, int i6, int i7, R4.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f7777c.d(65536, byte[].class);
        BitmapFactory.Options k6 = k();
        k6.inTempStorage = bArr;
        R4.b bVar2 = (R4.b) hVar.c(f7766f);
        R4.i iVar = (R4.i) hVar.c(f7767g);
        o oVar = (o) hVar.c(o.f7761h);
        boolean booleanValue = ((Boolean) hVar.c(f7769i)).booleanValue();
        R4.g gVar = f7770j;
        try {
            return g.e(h(vVar, k6, oVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i6, i7, booleanValue, bVar), this.f7775a);
        } finally {
            v(k6);
            this.f7777c.put(bArr);
        }
    }

    public T4.v e(ParcelFileDescriptor parcelFileDescriptor, int i6, int i7, R4.h hVar) {
        return d(new v.c(parcelFileDescriptor, this.f7778d, this.f7777c), i6, i7, hVar, f7772l);
    }

    public T4.v f(InputStream inputStream, int i6, int i7, R4.h hVar, b bVar) {
        return d(new v.b(inputStream, this.f7778d, this.f7777c), i6, i7, hVar, bVar);
    }

    public T4.v g(ByteBuffer byteBuffer, int i6, int i7, R4.h hVar) {
        return d(new v.a(byteBuffer, this.f7778d, this.f7777c), i6, i7, hVar, f7772l);
    }

    public final Bitmap h(v vVar, BitmapFactory.Options options, o oVar, R4.b bVar, R4.i iVar, boolean z6, int i6, int i7, boolean z7, b bVar2) {
        int i8;
        String str;
        ColorSpace colorSpace;
        int i9;
        long b6 = n5.g.b();
        int[] m6 = m(vVar, options, bVar2, this.f7775a);
        int i10 = m6[0];
        int i11 = m6[1];
        String str2 = options.outMimeType;
        boolean z8 = (i10 == -1 || i11 == -1) ? false : z6;
        int a6 = vVar.a();
        int g6 = AbstractC1014C.g(a6);
        boolean j6 = AbstractC1014C.j(a6);
        int i12 = i6;
        if (i12 != Integer.MIN_VALUE) {
            i8 = i7;
        } else if (r(g6)) {
            i8 = i7;
            i12 = i11;
        } else {
            i8 = i7;
            i12 = i10;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = r(g6) ? i10 : i11;
        }
        ImageHeaderParser.ImageType d6 = vVar.d();
        c(d6, vVar, bVar2, this.f7775a, oVar, g6, i10, i11, i12, i8, options);
        int i13 = i12;
        int i14 = i8;
        b(vVar, bVar, z8, j6, options, i13, i14);
        int i15 = Build.VERSION.SDK_INT;
        if (z(d6)) {
            if (i10 < 0 || i11 < 0 || !z7) {
                float f6 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i16 = options.inSampleSize;
                float f7 = i16;
                int ceil = (int) Math.ceil(i10 / f7);
                int ceil2 = (int) Math.ceil(i11 / f7);
                int round = Math.round(ceil * f6);
                int round2 = Math.round(ceil2 * f6);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round);
                    sb.append("x");
                    sb.append(round2);
                    i9 = round;
                    sb.append("] for source [");
                    sb.append(i10);
                    sb.append("x");
                    sb.append(i11);
                    sb.append("], sampleSize: ");
                    sb.append(i16);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f6);
                    Log.v(str, sb.toString());
                } else {
                    i9 = round;
                }
                i13 = i9;
                i14 = round2;
            } else {
                str = "Downsampler";
            }
            if (i13 > 0 && i14 > 0) {
                y(options, this.f7775a, i13, i14);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i15 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == R4.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i17 = i(vVar, options, bVar2, this.f7775a);
        bVar2.b(this.f7775a, i17);
        if (Log.isLoggable(str, 2)) {
            t(i10, i11, str2, options, i17, i6, i7, b6);
        }
        if (i17 == null) {
            return null;
        }
        i17.setDensity(this.f7776b.densityDpi);
        Bitmap k6 = AbstractC1014C.k(this.f7775a, i17, a6);
        if (!i17.equals(k6)) {
            this.f7775a.c(i17);
        }
        return k6;
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
