package a5;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7749a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7750b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f7751a;

        public a(ByteBuffer byteBuffer) {
            this.f7751a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // a5.n.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // a5.n.c
        public int b(byte[] bArr, int i6) {
            int min = Math.min(i6, this.f7751a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7751a.get(bArr, 0, min);
            return min;
        }

        @Override // a5.n.c
        public short c() {
            if (this.f7751a.remaining() >= 1) {
                return (short) (this.f7751a.get() & 255);
            }
            throw new c.a();
        }

        @Override // a5.n.c
        public long skip(long j6) {
            int min = (int) Math.min(this.f7751a.remaining(), j6);
            ByteBuffer byteBuffer = this.f7751a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f7752a;

        public b(byte[] bArr, int i6) {
            this.f7752a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i6);
        }

        public short a(int i6) {
            if (c(i6, 2)) {
                return this.f7752a.getShort(i6);
            }
            return (short) -1;
        }

        public int b(int i6) {
            if (c(i6, 4)) {
                return this.f7752a.getInt(i6);
            }
            return -1;
        }

        public final boolean c(int i6, int i7) {
            return this.f7752a.remaining() - i6 >= i7;
        }

        public int d() {
            return this.f7752a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f7752a.order(byteOrder);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i6);

        short c();

        long skip(long j6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f7753a;

        public d(InputStream inputStream) {
            this.f7753a = inputStream;
        }

        @Override // a5.n.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // a5.n.c
        public int b(byte[] bArr, int i6) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6 && (i8 = this.f7753a.read(bArr, i7, i6 - i7)) != -1) {
                i7 += i8;
            }
            if (i7 == 0 && i8 == -1) {
                throw new c.a();
            }
            return i7;
        }

        @Override // a5.n.c
        public short c() {
            int read = this.f7753a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // a5.n.c
        public long skip(long j6) {
            if (j6 < 0) {
                return 0L;
            }
            long j7 = j6;
            while (j7 > 0) {
                long skip = this.f7753a.skip(j7);
                if (skip <= 0) {
                    if (this.f7753a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j7 -= skip;
            }
            return j6 - j7;
        }
    }

    public static int e(int i6, int i7) {
        return i6 + 2 + (i7 * 12);
    }

    public static boolean h(int i6) {
        return (i6 & 65496) == 65496 || i6 == 19789 || i6 == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        short a6 = bVar.a(6);
        if (a6 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a6 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a6));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b6 = bVar.b(10) + 6;
        short a7 = bVar.a(b6);
        for (int i6 = 0; i6 < a7; i6++) {
            int e6 = e(b6, i6);
            short a8 = bVar.a(e6);
            if (a8 == 274) {
                short a9 = bVar.a(e6 + 2);
                if (a9 >= 1 && a9 <= 12) {
                    int b7 = bVar.b(e6 + 4);
                    if (b7 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i6 + " tagType=" + ((int) a8) + " formatCode=" + ((int) a9) + " componentCount=" + b7);
                        }
                        int i7 = b7 + f7750b[a9];
                        if (i7 <= 4) {
                            int i8 = e6 + 8;
                            if (i8 >= 0 && i8 <= bVar.d()) {
                                if (i7 >= 0 && i7 + i8 <= bVar.d()) {
                                    return bVar.a(i8);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a8));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i8 + " tagType=" + ((int) a8));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a9));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a9));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) n5.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, U4.b bVar) {
        return f(new a((ByteBuffer) n5.k.d(byteBuffer)), (U4.b) n5.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new d((InputStream) n5.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, U4.b bVar) {
        return f(new d((InputStream) n5.k.d(inputStream)), (U4.b) n5.k.d(bVar));
    }

    public final int f(c cVar, U4.b bVar) {
        try {
            int a6 = cVar.a();
            if (!h(a6)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a6);
                }
                return -1;
            }
            int j6 = j(cVar);
            if (j6 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.d(j6, byte[].class);
            try {
                return l(cVar, bArr, j6);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType g(c cVar) {
        try {
            int a6 = cVar.a();
            if (a6 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c6 = (a6 << 8) | cVar.c();
            if (c6 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c7 = (c6 << 8) | cVar.c();
            if (c7 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c7 != 1380533830) {
                return m(cVar, c7);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a7 = (cVar.a() << 16) | cVar.a();
            if ((a7 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i6 = a7 & 255;
            if (i6 == 88) {
                cVar.skip(4L);
                short c8 = cVar.c();
                return (c8 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c8 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i6 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean i(byte[] bArr, int i6) {
        boolean z6 = bArr != null && i6 > f7749a.length;
        if (z6) {
            int i7 = 0;
            while (true) {
                byte[] bArr2 = f7749a;
                if (i7 >= bArr2.length) {
                    break;
                }
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
        return z6;
    }

    public final int j(c cVar) {
        short c6;
        int a6;
        long j6;
        long skip;
        do {
            short c7 = cVar.c();
            if (c7 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c7));
                }
                return -1;
            }
            c6 = cVar.c();
            if (c6 == 218) {
                return -1;
            }
            if (c6 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a6 = cVar.a() - 2;
            if (c6 == 225) {
                return a6;
            }
            j6 = a6;
            skip = cVar.skip(j6);
        } while (skip == j6);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c6) + ", wanted to skip: " + a6 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int l(c cVar, byte[] bArr, int i6) {
        int b6 = cVar.b(bArr, i6);
        if (b6 == i6) {
            if (i(bArr, i6)) {
                return k(new b(bArr, i6));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i6 + ", actually read: " + b6);
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType m(c cVar, int i6) {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a6 = (cVar.a() << 16) | cVar.a();
        if (a6 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i7 = 0;
        boolean z6 = a6 == 1635150182;
        cVar.skip(4L);
        int i8 = i6 - 16;
        if (i8 % 4 == 0) {
            while (i7 < 5 && i8 > 0) {
                int a7 = (cVar.a() << 16) | cVar.a();
                if (a7 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a7 == 1635150182) {
                    z6 = true;
                }
                i7++;
                i8 -= 4;
            }
        }
        return z6 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
