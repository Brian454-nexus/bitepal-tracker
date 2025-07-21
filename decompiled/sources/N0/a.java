package N0;

import N0.b;
import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: U, reason: collision with root package name */
    public static SimpleDateFormat f3500U;

    /* renamed from: V, reason: collision with root package name */
    public static SimpleDateFormat f3501V;

    /* renamed from: Z, reason: collision with root package name */
    public static final e[] f3505Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final e[] f3506a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final e[] f3507b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final e[] f3508c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final e[] f3509d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final e f3510e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final e[] f3511f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final e[] f3512g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final e[] f3513h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final e[] f3514i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final e[][] f3515j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final e[] f3516k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final HashMap[] f3517l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final HashMap[] f3518m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final HashSet f3519n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final HashMap f3520o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final Charset f3521p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final byte[] f3522q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final byte[] f3523r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f3524s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f3525t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f3526u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f3528v0;

    /* renamed from: a, reason: collision with root package name */
    public String f3533a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f3534b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f3535c;

    /* renamed from: d, reason: collision with root package name */
    public int f3536d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3537e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap[] f3538f;

    /* renamed from: g, reason: collision with root package name */
    public Set f3539g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f3540h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3541i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3542j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3543k;

    /* renamed from: l, reason: collision with root package name */
    public int f3544l;

    /* renamed from: m, reason: collision with root package name */
    public int f3545m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f3546n;

    /* renamed from: o, reason: collision with root package name */
    public int f3547o;

    /* renamed from: p, reason: collision with root package name */
    public int f3548p;

    /* renamed from: q, reason: collision with root package name */
    public int f3549q;

    /* renamed from: r, reason: collision with root package name */
    public int f3550r;

    /* renamed from: s, reason: collision with root package name */
    public int f3551s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3552t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3553u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f3527v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    public static final List f3529w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    public static final List f3530x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3531y = {8, 8, 8};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f3532z = {4};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f3480A = {8};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f3481B = {-1, -40, -1};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f3482C = {102, 116, 121, 112};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f3483D = {109, 105, 102, 49};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f3484E = {104, 101, 105, 99};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f3485F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f3486G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f3487H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f3488I = {101, 88, 73, 102};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f3489J = {73, 72, 68, 82};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f3490K = {73, 69, 78, 68};

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f3491L = {82, 73, 70, 70};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f3492M = {87, 69, 66, 80};

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f3493N = {69, 88, 73, 70};

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f3494O = {-99, 1, 42};

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f3495P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f3496Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f3497R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    public static final byte[] f3498S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T, reason: collision with root package name */
    public static final byte[] f3499T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W, reason: collision with root package name */
    public static final String[] f3502W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X, reason: collision with root package name */
    public static final int[] f3503X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y, reason: collision with root package name */
    public static final byte[] f3504Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: N0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0061a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        public long f3554a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f3555b;

        public C0061a(g gVar) {
            this.f3555b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j6, byte[] bArr, int i6, int i7) {
            if (i7 == 0) {
                return 0;
            }
            if (j6 < 0) {
                return -1;
            }
            try {
                long j7 = this.f3554a;
                if (j7 != j6) {
                    if (j7 >= 0 && j6 >= j7 + this.f3555b.available()) {
                        return -1;
                    }
                    this.f3555b.R(j6);
                    this.f3554a = j6;
                }
                if (i7 > this.f3555b.available()) {
                    i7 = this.f3555b.available();
                }
                int read = this.f3555b.read(bArr, i6, i7);
                if (read >= 0) {
                    this.f3554a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3554a = -1L;
            return -1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f3562a;

        /* renamed from: b, reason: collision with root package name */
        public ByteOrder f3563b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f3562a = outputStream;
            this.f3563b = byteOrder;
        }

        public void D(int i6) {
            ByteOrder byteOrder = this.f3563b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3562a.write(i6 & 255);
                this.f3562a.write((i6 >>> 8) & 255);
                this.f3562a.write((i6 >>> 16) & 255);
                this.f3562a.write((i6 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3562a.write((i6 >>> 24) & 255);
                this.f3562a.write((i6 >>> 16) & 255);
                this.f3562a.write((i6 >>> 8) & 255);
                this.f3562a.write(i6 & 255);
            }
        }

        public void I(short s6) {
            ByteOrder byteOrder = this.f3563b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3562a.write(s6 & 255);
                this.f3562a.write((s6 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3562a.write((s6 >>> 8) & 255);
                this.f3562a.write(s6 & 255);
            }
        }

        public void P(long j6) {
            if (j6 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            D((int) j6);
        }

        public void R(int i6) {
            if (i6 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            I((short) i6);
        }

        public void a(ByteOrder byteOrder) {
            this.f3563b = byteOrder;
        }

        public void c(int i6) {
            this.f3562a.write(i6);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f3562a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i6, int i7) {
            this.f3562a.write(bArr, i6, i7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f3564a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3565b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3566c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f3567d;

        public d(int i6, int i7, byte[] bArr) {
            this(i6, i7, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f3521p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d6 : dArr) {
                wrap.putDouble(d6);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i6 : iArr) {
                wrap.putInt(i6);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f3572a);
                wrap.putInt((int) fVar.f3573b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f3521p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j6, ByteOrder byteOrder) {
            return g(new long[]{j6}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j6 : jArr) {
                wrap.putInt((int) j6);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f3572a);
                wrap.putInt((int) fVar.f3573b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i6, ByteOrder byteOrder) {
            return k(new int[]{i6}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f3503X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i6 : iArr) {
                wrap.putShort((short) i6);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o6 instanceof String) {
                return Double.parseDouble((String) o6);
            }
            if (o6 instanceof long[]) {
                if (((long[]) o6).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o6 instanceof int[]) {
                if (((int[]) o6).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o6 instanceof double[]) {
                double[] dArr = (double[]) o6;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o6 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o6;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o6 instanceof String) {
                return Integer.parseInt((String) o6);
            }
            if (o6 instanceof long[]) {
                long[] jArr = (long[]) o6;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o6 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o6;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                return null;
            }
            if (o6 instanceof String) {
                return (String) o6;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            if (o6 instanceof long[]) {
                long[] jArr = (long[]) o6;
                while (i6 < jArr.length) {
                    sb.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f11248a);
                    }
                }
                return sb.toString();
            }
            if (o6 instanceof int[]) {
                int[] iArr = (int[]) o6;
                while (i6 < iArr.length) {
                    sb.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f11248a);
                    }
                }
                return sb.toString();
            }
            if (o6 instanceof double[]) {
                double[] dArr = (double[]) o6;
                while (i6 < dArr.length) {
                    sb.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f11248a);
                    }
                }
                return sb.toString();
            }
            if (!(o6 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o6;
            while (i6 < fVarArr.length) {
                sb.append(fVarArr[i6].f3572a);
                sb.append('/');
                sb.append(fVarArr[i6].f3573b);
                i6++;
                if (i6 != fVarArr.length) {
                    sb.append(com.amazon.a.a.o.b.f.f11248a);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:178:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:181:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o(java.nio.ByteOrder r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: N0.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.f3503X[this.f3564a] * this.f3565b;
        }

        public String toString() {
            return "(" + a.f3502W[this.f3564a] + ", data length:" + this.f3567d.length + ")";
        }

        public d(int i6, int i7, long j6, byte[] bArr) {
            this.f3564a = i6;
            this.f3565b = i7;
            this.f3566c = j6;
            this.f3567d = bArr;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f3572a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3573b;

        public f(double d6) {
            this((long) (d6 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f3572a / this.f3573b;
        }

        public String toString() {
            return this.f3572a + "/" + this.f3573b;
        }

        public f(long j6, long j7) {
            if (j7 == 0) {
                this.f3572a = 0L;
                this.f3573b = 1L;
            } else {
                this.f3572a = j6;
                this.f3573b = j7;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f3505Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f3506a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f3507b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f3508c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f3509d0 = eVarArr5;
        f3510e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f3511f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f3512g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f3513h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f3514i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f3515j0 = eVarArr10;
        f3516k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f3517l0 = new HashMap[eVarArr10.length];
        f3518m0 = new HashMap[eVarArr10.length];
        f3519n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3520o0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f3521p0 = forName;
        f3522q0 = "Exif\u0000\u0000".getBytes(forName);
        f3523r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f3500U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f3501V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            e[][] eVarArr11 = f3515j0;
            if (i6 >= eVarArr11.length) {
                HashMap hashMap = f3520o0;
                e[] eVarArr12 = f3516k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f3568a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f3568a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f3568a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f3568a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f3568a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f3568a), 8);
                f3524s0 = Pattern.compile(".*[1-9].*");
                f3525t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f3526u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f3528v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f3517l0[i6] = new HashMap();
            f3518m0[i6] = new HashMap();
            for (e eVar : eVarArr11[i6]) {
                f3517l0[i6].put(Integer.valueOf(eVar.f3568a), eVar);
                f3518m0[i6].put(eVar.f3569b, eVar);
            }
            i6++;
        }
    }

    public a(String str) {
        e[][] eVarArr = f3515j0;
        this.f3538f = new HashMap[eVarArr.length];
        this.f3539g = new HashSet(eVarArr.length);
        this.f3540h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            B(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static boolean C(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f3522q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = f3522q0;
            if (i6 >= bArr3.length) {
                return true;
            }
            if (bArr2[i6] != bArr3[i6]) {
                return false;
            }
            i6++;
        }
    }

    public static boolean E(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = f3481B;
            if (i6 >= bArr2.length) {
                return true;
            }
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
            i6++;
        }
    }

    public static boolean J(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f3527v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean L(int i6) {
        return i6 == 4 || i6 == 13 || i6 == 14;
    }

    public static double c(String str, String str2) {
        try {
            String[] split = str.split(com.amazon.a.a.o.b.f.f11248a, -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean g0(int i6) {
        return (i6 == 4 || i6 == 9 || i6 == 13 || i6 == 14) ? false : true;
    }

    public static Pair y(String str) {
        if (str.contains(com.amazon.a.a.o.b.f.f11248a)) {
            String[] split = str.split(com.amazon.a.a.o.b.f.f11248a, -1);
            Pair y6 = y(split[0]);
            if (((Integer) y6.first).intValue() == 2) {
                return y6;
            }
            for (int i6 = 1; i6 < split.length; i6++) {
                Pair y7 = y(split[i6]);
                int intValue = (((Integer) y7.first).equals(y6.first) || ((Integer) y7.second).equals(y6.first)) ? ((Integer) y6.first).intValue() : -1;
                int intValue2 = (((Integer) y6.second).intValue() == -1 || !(((Integer) y7.first).equals(y6.second) || ((Integer) y7.second).equals(y6.second))) ? -1 : ((Integer) y6.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    y6 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    y6 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return y6;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void A(b bVar, HashMap hashMap) {
        int i6;
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] c6 = N0.b.c(dVar.o(this.f3540h));
        long[] c7 = N0.b.c(dVar2.o(this.f3540h));
        if (c6 == null || c6.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c7 == null || c7.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c6.length != c7.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j6 = 0;
        for (long j7 : c7) {
            j6 += j7;
        }
        int i7 = (int) j6;
        byte[] bArr = new byte[i7];
        int i8 = 1;
        this.f3543k = true;
        this.f3542j = true;
        this.f3541i = true;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < c6.length) {
            int i12 = (int) c6[i9];
            int i13 = (int) c7[i9];
            if (i9 < c6.length - i8) {
                i6 = i9;
                if (i12 + i13 != c6[i6 + 1]) {
                    this.f3543k = false;
                }
            } else {
                i6 = i9;
            }
            int i14 = i12 - i10;
            if (i14 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.P(i14);
                int i15 = i10 + i14;
                byte[] bArr2 = new byte[i13];
                try {
                    bVar.readFully(bArr2);
                    i10 = i15 + i13;
                    System.arraycopy(bArr2, 0, bArr, i11, i13);
                    i11 += i13;
                    i9 = i6 + 1;
                    i8 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                return;
            }
        }
        this.f3546n = bArr;
        if (this.f3543k) {
            this.f3544l = (int) c6[0];
            this.f3545m = i7;
        }
    }

    public final void B(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f3535c = null;
        this.f3533a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (J(fileInputStream.getFD())) {
                this.f3534b = fileInputStream.getFD();
            } else {
                this.f3534b = null;
            }
            O(fileInputStream);
            N0.b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            N0.b.b(fileInputStream2);
            throw th;
        }
    }

    public final boolean D(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j6;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e7) {
            e = e7;
            bVar2 = bVar;
            if (f3527v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f3482C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j6 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j6 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j7 = readInt - j6;
        if (j7 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z6 = false;
        boolean z7 = false;
        for (long j8 = 0; j8 < j7 / 4; j8++) {
            try {
                bVar.readFully(bArr3);
                if (j8 != 1) {
                    if (Arrays.equals(bArr3, f3483D)) {
                        z6 = true;
                    } else if (Arrays.equals(bArr3, f3484E)) {
                        z7 = true;
                    }
                    if (z6 && z7) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    public final boolean F(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder R5 = R(bVar2);
                this.f3540h = R5;
                bVar2.I(R5);
                short readShort = bVar2.readShort();
                boolean z6 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z6;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean G(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = f3487H;
            if (i6 >= bArr2.length) {
                return true;
            }
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
            i6++;
        }
    }

    public final boolean H(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i6 = 0; i6 < bytes.length; i6++) {
            if (bArr[i6] != bytes[i6]) {
                return false;
            }
        }
        return true;
    }

    public final boolean I(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder R5 = R(bVar2);
                this.f3540h = R5;
                bVar2.I(R5);
                boolean z6 = bVar2.readShort() == 85;
                bVar2.close();
                return z6;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean K(HashMap hashMap) {
        d dVar;
        int m6;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f3540h);
            int[] iArr2 = f3531y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3536d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m6 = dVar.m(this.f3540h)) == 1 && Arrays.equals(iArr, f3480A)) || (m6 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f3527v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean M(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f3540h) <= 512 && dVar2.m(this.f3540h) <= 512;
    }

    public final boolean N(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = f3491L;
            if (i6 >= bArr2.length) {
                int i7 = 0;
                while (true) {
                    byte[] bArr3 = f3492M;
                    if (i7 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f3491L.length + i7 + 4] != bArr3[i7]) {
                        return false;
                    }
                    i7++;
                }
            } else {
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
                i6++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:8:0x001e, B:10:0x0022, B:11:0x0030, B:13:0x0038, B:15:0x0041, B:16:0x0061, B:23:0x0045, B:25:0x004b, B:28:0x0052, B:31:0x005a, B:32:0x005e, B:33:0x006b, B:35:0x0075, B:38:0x007d, B:41:0x0085, B:44:0x008d, B:53:0x009b, B:55:0x009f), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lba
            r0 = 0
            r1 = r0
        L4:
            N0.a$e[][] r2 = N0.a.f3515j0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f3538f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Laf
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f3537e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.n(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f3536d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f3536d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = g0(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            N0.a$g r0 = new N0.a$g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f3537e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.u(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f3536d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.o(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.t(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.r(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f3548p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.R(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f0(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            N0.a$b r1 = new N0.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f3536d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.l(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.p(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.q(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.x(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = N0.a.f3527v
            if (r5 == 0) goto Lae
            r4.Q()
            return
        L9b:
            boolean r0 = N0.a.f3527v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lae
            r4.Q()
        Lae:
            return
        Laf:
            r4.a()
            boolean r0 = N0.a.f3527v
            if (r0 == 0) goto Lb9
            r4.Q()
        Lb9:
            throw r5
        Lba:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.O(java.io.InputStream):void");
    }

    public final void P(b bVar) {
        ByteOrder R5 = R(bVar);
        this.f3540h = R5;
        bVar.I(R5);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i6 = this.f3536d;
        if (i6 != 7 && i6 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i7 = readInt - 8;
        if (i7 > 0) {
            bVar.P(i7);
        }
    }

    public final void Q() {
        for (int i6 = 0; i6 < this.f3538f.length; i6++) {
            Log.d("ExifInterface", "The size of tag group[" + i6 + "]: " + this.f3538f[i6].size());
            for (Map.Entry entry : this.f3538f[i6].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f3540h) + "'");
            }
        }
    }

    public final ByteOrder R(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f3527v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f3527v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void S(byte[] bArr, int i6) {
        g gVar = new g(bArr);
        P(gVar);
        T(gVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(N0.a.g r26, int r27) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.T(N0.a$g, int):void");
    }

    public final void U(String str) {
        for (int i6 = 0; i6 < f3515j0.length; i6++) {
            this.f3538f[i6].remove(str);
        }
    }

    public final void V(int i6, String str, String str2) {
        if (this.f3538f[i6].isEmpty() || this.f3538f[i6].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f3538f[i6];
        hashMap.put(str2, hashMap.get(str));
        this.f3538f[i6].remove(str);
    }

    public final void W(g gVar, int i6) {
        d dVar = (d) this.f3538f[i6].get("ImageLength");
        d dVar2 = (d) this.f3538f[i6].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f3538f[i6].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f3538f[i6].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m6 = dVar3.m(this.f3540h);
            int m7 = dVar3.m(this.f3540h);
            gVar.R(m6);
            byte[] bArr = new byte[m7];
            gVar.readFully(bArr);
            l(new b(bArr), m6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x0106), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.X():void");
    }

    public final void Y(InputStream inputStream, OutputStream outputStream) {
        if (f3527v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-40);
        d dVar = (g("Xmp") == null || !this.f3553u) ? null : (d) this.f3538f[0].remove("Xmp");
        cVar.c(-1);
        cVar.c(-31);
        k0(cVar);
        if (dVar != null) {
            this.f3538f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.c(-1);
                cVar.c(readByte);
                N0.b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.c(-1);
                cVar.c(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.R(readUnsignedShort);
                int i6 = readUnsignedShort - 2;
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i6 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i6, ConstantsKt.DEFAULT_BLOCK_SIZE));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i6 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i7 = readUnsignedShort2 - 2;
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i7 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f3522q0)) {
                        bVar.P(readUnsignedShort2 - 8);
                    }
                }
                cVar.c(-1);
                cVar.c(readByte);
                cVar.R(readUnsignedShort2);
                if (i7 >= 6) {
                    i7 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i7 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i7, ConstantsKt.DEFAULT_BLOCK_SIZE));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i7 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void Z(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f3527v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        N0.b.e(bVar, cVar, f3487H.length);
        if (this.f3548p == 0) {
            int readInt = bVar.readInt();
            cVar.D(readInt);
            N0.b.e(bVar, cVar, readInt + 8);
        } else {
            N0.b.e(bVar, cVar, (r2 - r7.length) - 8);
            bVar.P(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            k0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f3562a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.D((int) crc32.getValue());
            N0.b.b(byteArrayOutputStream);
            N0.b.d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            N0.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void a() {
        String g6 = g("DateTimeOriginal");
        if (g6 != null && g("DateTime") == null) {
            this.f3538f[0].put("DateTime", d.e(g6));
        }
        if (g("ImageWidth") == null) {
            this.f3538f[0].put("ImageWidth", d.f(0L, this.f3540h));
        }
        if (g("ImageLength") == null) {
            this.f3538f[0].put("ImageLength", d.f(0L, this.f3540h));
        }
        if (g("Orientation") == null) {
            this.f3538f[0].put("Orientation", d.f(0L, this.f3540h));
        }
        if (g("LightSource") == null) {
            this.f3538f[1].put("LightSource", d.f(0L, this.f3540h));
        }
    }

    public final void a0(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        char c6;
        int i6;
        int i7;
        int i8;
        boolean z6;
        if (f3527v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f3491L;
        N0.b.e(bVar, cVar, bArr.length);
        byte[] bArr2 = f3492M;
        bVar.P(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e6) {
            e = e6;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i9 = this.f3548p;
            if (i9 != 0) {
                N0.b.e(bVar, cVar2, (i9 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.P(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.P(readInt);
                k0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = f3495P;
                boolean z7 = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int readInt2 = bVar.readInt();
                    byte[] bArr5 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                    bVar.readFully(bArr5);
                    byte b6 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b6;
                    boolean z8 = ((b6 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.D(readInt2);
                    cVar2.write(bArr5);
                    if (z8) {
                        d(bVar, cVar2, f3498S, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            try {
                                bVar.readFully(bArr6);
                                z6 = !Arrays.equals(bArr6, f3499T);
                            } catch (EOFException unused) {
                                z6 = true;
                            }
                            if (z6) {
                                break;
                            } else {
                                e(bVar, cVar2, bArr6);
                            }
                        }
                        k0(cVar2);
                    } else {
                        d(bVar, cVar2, f3497R, f3496Q);
                        k0(cVar2);
                    }
                } else {
                    byte[] bArr7 = f3497R;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f3496Q)) {
                        int readInt3 = bVar.readInt();
                        int i10 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            bVar.readFully(bArr8);
                            byte[] bArr9 = new byte[3];
                            bVar.readFully(bArr9);
                            if (!Arrays.equals(f3494O, bArr9)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            int readInt4 = bVar.readInt();
                            i8 = (readInt4 << 2) >> 18;
                            i10 -= 10;
                            c6 = '\b';
                            i6 = (readInt4 << 18) >> 18;
                            i7 = readInt4;
                            z7 = false;
                        } else if (!Arrays.equals(bArr3, f3496Q)) {
                            c6 = '\b';
                            i6 = 0;
                            z7 = false;
                            i7 = 0;
                            i8 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i7 = bVar.readInt();
                            c6 = '\b';
                            i6 = (i7 & 16383) + 1;
                            i8 = ((i7 & 268419072) >>> 14) + 1;
                            if ((i7 & 268435456) == 0) {
                                z7 = false;
                            }
                            i10 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.D(10);
                        byte[] bArr10 = new byte[10];
                        if (z7) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i11 = i6 - 1;
                        int i12 = i8 - 1;
                        bArr10[4] = (byte) i11;
                        bArr10[5] = (byte) (i11 >> 8);
                        bArr10[6] = (byte) (i11 >> 16);
                        bArr10[7] = (byte) i12;
                        bArr10[c6] = (byte) (i12 >> 8);
                        bArr10[9] = (byte) (i12 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.D(readInt3);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(f3494O);
                            cVar2.D(i7);
                        } else if (Arrays.equals(bArr3, f3496Q)) {
                            cVar2.write(47);
                            cVar2.D(i7);
                        }
                        N0.b.e(bVar, cVar2, i10);
                        k0(cVar2);
                    }
                }
            }
            N0.b.d(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f3492M;
            cVar.D(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            N0.b.b(byteArrayOutputStream);
        } catch (Exception e7) {
            e = e7;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            N0.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    public final String b(double d6) {
        long j6 = (long) d6;
        double d7 = d6 - j6;
        long j7 = (long) (d7 * 60.0d);
        return j6 + "/1," + j7 + "/1," + Math.round((d7 - (j7 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public void b0(double d6) {
        String str = d6 >= 0.0d ? "0" : "1";
        c0("GPSAltitude", new f(Math.abs(d6)).toString());
        c0("GPSAltitudeRef", str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x021b. Please report as an issue. */
    public void c0(String str, String str2) {
        e eVar;
        int i6;
        int i7;
        int i8;
        String str3;
        int i9;
        String str4 = str;
        String str5 = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        String str6 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
            boolean find = f3526u0.matcher(str5).find();
            boolean find2 = f3528v0.matcher(str5).find();
            if (str5.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                return;
            }
            if (find2) {
                str5 = str5.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f3527v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i10 = 2;
        int i11 = 1;
        if (str5 != null && f3519n0.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f3525t0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str5 = new f(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < f3515j0.length) {
            if ((i13 != 4 || this.f3541i) && (eVar = (e) f3518m0[i13].get(str4)) != null) {
                if (str5 == null) {
                    this.f3538f[i13].remove(str4);
                } else {
                    Pair y6 = y(str5);
                    if (eVar.f3570c == ((Integer) y6.first).intValue() || eVar.f3570c == ((Integer) y6.second).intValue()) {
                        i6 = eVar.f3570c;
                    } else {
                        int i14 = eVar.f3571d;
                        if (i14 == -1 || !(i14 == ((Integer) y6.first).intValue() || eVar.f3571d == ((Integer) y6.second).intValue())) {
                            int i15 = eVar.f3570c;
                            if (i15 == i11 || i15 == 7 || i15 == i10) {
                                i6 = i15;
                            } else if (f3527v) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str4);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f3502W;
                                sb.append(strArr[eVar.f3570c]);
                                sb.append(eVar.f3571d == -1 ? "" : ", " + strArr[eVar.f3571d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) y6.first).intValue()]);
                                sb.append(((Integer) y6.second).intValue() != -1 ? ", " + strArr[((Integer) y6.second).intValue()] : "");
                                sb.append(")");
                                Log.d(str6, sb.toString());
                            }
                        } else {
                            i6 = eVar.f3571d;
                        }
                    }
                    switch (i6) {
                        case 1:
                            i7 = i12;
                            i8 = i13;
                            str3 = str6;
                            i9 = i11;
                            this.f3538f[i8].put(str4, d.a(str5));
                            break;
                        case 2:
                        case 7:
                            i7 = i12;
                            i8 = i13;
                            str3 = str6;
                            i9 = i11;
                            this.f3538f[i8].put(str4, d.e(str5));
                            break;
                        case 3:
                            i7 = i12;
                            i8 = i13;
                            str3 = str6;
                            i9 = i11;
                            String[] split = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            int[] iArr = new int[split.length];
                            for (int i16 = i7; i16 < split.length; i16++) {
                                iArr[i16] = Integer.parseInt(split[i16]);
                            }
                            this.f3538f[i8].put(str4, d.k(iArr, this.f3540h));
                            break;
                        case 4:
                            i7 = i12;
                            i8 = i13;
                            str3 = str6;
                            i9 = i11;
                            String[] split2 = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            long[] jArr = new long[split2.length];
                            for (int i17 = i7; i17 < split2.length; i17++) {
                                jArr[i17] = Long.parseLong(split2[i17]);
                            }
                            this.f3538f[i8].put(str4, d.g(jArr, this.f3540h));
                            break;
                        case 5:
                            i7 = i12;
                            i9 = i11;
                            String[] split3 = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            f[] fVarArr = new f[split3.length];
                            int i18 = i7;
                            while (i18 < split3.length) {
                                String[] split4 = split3[i18].split("/", -1);
                                fVarArr[i18] = new f((long) Double.parseDouble(split4[i7]), (long) Double.parseDouble(split4[i9]));
                                i18++;
                                str6 = str6;
                                i13 = i13;
                            }
                            i8 = i13;
                            str3 = str6;
                            this.f3538f[i8].put(str4, d.i(fVarArr, this.f3540h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f3527v) {
                                Log.d(str6, "Data format isn't one of expected formats: " + i6);
                                break;
                            }
                            break;
                        case 9:
                            i7 = i12;
                            i9 = i11;
                            String[] split5 = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i19 = i7; i19 < split5.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split5[i19]);
                            }
                            this.f3538f[i13].put(str4, d.c(iArr2, this.f3540h));
                            i8 = i13;
                            str3 = str6;
                            break;
                        case 10:
                            String[] split6 = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i20 = i12;
                            while (i20 < split6.length) {
                                String[] split7 = split6[i20].split("/", -1);
                                fVarArr2[i20] = new f((long) Double.parseDouble(split7[i12]), (long) Double.parseDouble(split7[i11]));
                                i20++;
                                i12 = i12;
                                i11 = i11;
                                split6 = split6;
                            }
                            i7 = i12;
                            i9 = i11;
                            this.f3538f[i13].put(str4, d.d(fVarArr2, this.f3540h));
                            i8 = i13;
                            str3 = str6;
                            break;
                        case 12:
                            String[] split8 = str5.split(com.amazon.a.a.o.b.f.f11248a, -1);
                            double[] dArr = new double[split8.length];
                            for (int i21 = i12; i21 < split8.length; i21++) {
                                dArr[i21] = Double.parseDouble(split8[i21]);
                            }
                            this.f3538f[i13].put(str4, d.b(dArr, this.f3540h));
                            break;
                    }
                    i13 = i8 + 1;
                    i12 = i7;
                    str6 = str3;
                    i11 = i9;
                    i10 = 2;
                }
            }
            i7 = i12;
            i8 = i13;
            str3 = str6;
            i9 = i11;
            i13 = i8 + 1;
            i12 = i7;
            str6 = str3;
            i11 = i9;
            i10 = 2;
        }
    }

    public final void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void d0(Location location) {
        if (location == null) {
            return;
        }
        c0("GPSProcessingMethod", location.getProvider());
        e0(location.getLatitude(), location.getLongitude());
        b0(location.getAltitude());
        c0("GPSSpeedRef", "K");
        c0("GPSSpeed", new f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = f3500U.format(new Date(location.getTime())).split("\\s+", -1);
        c0("GPSDateStamp", split[0]);
        c0("GPSTimeStamp", split[1]);
    }

    public final void e(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.D(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        N0.b.e(bVar, cVar, readInt);
    }

    public void e0(double d6, double d7) {
        if (d6 < -90.0d || d6 > 90.0d || Double.isNaN(d6)) {
            throw new IllegalArgumentException("Latitude value " + d6 + " is not valid.");
        }
        if (d7 < -180.0d || d7 > 180.0d || Double.isNaN(d7)) {
            throw new IllegalArgumentException("Longitude value " + d7 + " is not valid.");
        }
        c0("GPSLatitudeRef", d6 >= 0.0d ? "N" : "S");
        c0("GPSLatitude", b(Math.abs(d6)));
        c0("GPSLongitudeRef", d7 >= 0.0d ? "E" : "W");
        c0("GPSLongitude", b(Math.abs(d7)));
    }

    public double f(double d6) {
        double h6 = h("GPSAltitude", -1.0d);
        int i6 = i("GPSAltitudeRef", -1);
        if (h6 < 0.0d || i6 < 0) {
            return d6;
        }
        return h6 * (i6 != 1 ? 1 : -1);
    }

    public final void f0(b bVar) {
        HashMap hashMap = this.f3538f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar == null) {
            this.f3547o = 6;
            z(bVar, hashMap);
            return;
        }
        int m6 = dVar.m(this.f3540h);
        this.f3547o = m6;
        if (m6 != 1) {
            if (m6 == 6) {
                z(bVar, hashMap);
                return;
            } else if (m6 != 7) {
                return;
            }
        }
        if (K(hashMap)) {
            A(bVar, hashMap);
        }
    }

    public String g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j6 = j(str);
        if (j6 != null) {
            if (!f3519n0.contains(str)) {
                return j6.n(this.f3540h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i6 = j6.f3564a;
                if (i6 != 5 && i6 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j6.f3564a);
                    return null;
                }
                f[] fVarArr = (f[]) j6.o(this.f3540h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) fVar.f3572a) / ((float) fVar.f3573b)));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) fVar2.f3572a) / ((float) fVar2.f3573b)));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) fVar3.f3572a) / ((float) fVar3.f3573b))));
            }
            try {
                return Double.toString(j6.l(this.f3540h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double h(String str, double d6) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j6 = j(str);
        if (j6 != null) {
            try {
                return j6.l(this.f3540h);
            } catch (NumberFormatException unused) {
                return d6;
            }
        }
        return d6;
    }

    public final void h0(int i6, int i7) {
        if (this.f3538f[i6].isEmpty() || this.f3538f[i7].isEmpty()) {
            if (f3527v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f3538f[i6].get("ImageLength");
        d dVar2 = (d) this.f3538f[i6].get("ImageWidth");
        d dVar3 = (d) this.f3538f[i7].get("ImageLength");
        d dVar4 = (d) this.f3538f[i7].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f3527v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f3527v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m6 = dVar.m(this.f3540h);
        int m7 = dVar2.m(this.f3540h);
        int m8 = dVar3.m(this.f3540h);
        int m9 = dVar4.m(this.f3540h);
        if (m6 >= m8 || m7 >= m9) {
            return;
        }
        HashMap[] hashMapArr = this.f3538f;
        HashMap hashMap = hashMapArr[i6];
        hashMapArr[i6] = hashMapArr[i7];
        hashMapArr[i7] = hashMap;
    }

    public int i(String str, int i6) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d j6 = j(str);
        if (j6 != null) {
            try {
                return j6.m(this.f3540h);
            } catch (NumberFormatException unused) {
                return i6;
            }
        }
        return i6;
    }

    public final void i0(g gVar, int i6) {
        d j6;
        d j7;
        d dVar = (d) this.f3538f[i6].get("DefaultCropSize");
        d dVar2 = (d) this.f3538f[i6].get("SensorTopBorder");
        d dVar3 = (d) this.f3538f[i6].get("SensorLeftBorder");
        d dVar4 = (d) this.f3538f[i6].get("SensorBottomBorder");
        d dVar5 = (d) this.f3538f[i6].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                W(gVar, i6);
                return;
            }
            int m6 = dVar2.m(this.f3540h);
            int m7 = dVar4.m(this.f3540h);
            int m8 = dVar5.m(this.f3540h);
            int m9 = dVar3.m(this.f3540h);
            if (m7 <= m6 || m8 <= m9) {
                return;
            }
            d j8 = d.j(m7 - m6, this.f3540h);
            d j9 = d.j(m8 - m9, this.f3540h);
            this.f3538f[i6].put("ImageLength", j8);
            this.f3538f[i6].put("ImageWidth", j9);
            return;
        }
        if (dVar.f3564a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f3540h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            j6 = d.h(fVarArr[0], this.f3540h);
            j7 = d.h(fVarArr[1], this.f3540h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f3540h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            j6 = d.j(iArr[0], this.f3540h);
            j7 = d.j(iArr[1], this.f3540h);
        }
        this.f3538f[i6].put("ImageWidth", j6);
        this.f3538f[i6].put("ImageLength", j7);
    }

    public final d j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f3527v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < f3515j0.length; i6++) {
            d dVar = (d) this.f3538f[i6].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void j0() {
        h0(0, 5);
        h0(0, 4);
        h0(5, 4);
        d dVar = (d) this.f3538f[1].get("PixelXDimension");
        d dVar2 = (d) this.f3538f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f3538f[0].put("ImageWidth", dVar);
            this.f3538f[0].put("ImageLength", dVar2);
        }
        if (this.f3538f[4].isEmpty() && M(this.f3538f[5])) {
            HashMap[] hashMapArr = this.f3538f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!M(this.f3538f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        V(0, "ThumbnailOrientation", "Orientation");
        V(0, "ThumbnailImageLength", "ImageLength");
        V(0, "ThumbnailImageWidth", "ImageWidth");
        V(5, "ThumbnailOrientation", "Orientation");
        V(5, "ThumbnailImageLength", "ImageLength");
        V(5, "ThumbnailImageWidth", "ImageWidth");
        V(4, "Orientation", "ThumbnailOrientation");
        V(4, "ImageLength", "ThumbnailImageLength");
        V(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void k(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0062b.a(mediaMetadataRetriever, new C0061a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f3538f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f3540h));
                }
                if (str2 != null) {
                    this.f3538f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f3540h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f3538f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f3540h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.R(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i6 = parseInt2 + 6;
                    int i7 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f3522q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    gVar.readFully(bArr2);
                    this.f3548p = i6;
                    S(bArr2, 0);
                }
                if (f3527v) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k0(N0.a.c r19) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.k0(N0.a$c):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x017b, code lost:
    
        r21.I(r20.f3540h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(N0.a.b r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.l(N0.a$b, int, int):void");
    }

    public double[] m() {
        String g6 = g("GPSLatitude");
        String g7 = g("GPSLatitudeRef");
        String g8 = g("GPSLongitude");
        String g9 = g("GPSLongitudeRef");
        if (g6 == null || g7 == null || g8 == null || g9 == null) {
            return null;
        }
        try {
            return new double[]{c(g6, g7), c(g8, g9)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", g6, g7, g8, g9));
            return null;
        }
    }

    public final int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (E(bArr)) {
            return 4;
        }
        if (H(bArr)) {
            return 9;
        }
        if (D(bArr)) {
            return 12;
        }
        if (F(bArr)) {
            return 7;
        }
        if (I(bArr)) {
            return 10;
        }
        if (G(bArr)) {
            return 13;
        }
        return N(bArr) ? 14 : 0;
    }

    public final void o(g gVar) {
        int i6;
        int i7;
        r(gVar);
        d dVar = (d) this.f3538f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f3567d);
            gVar2.I(this.f3540h);
            byte[] bArr = f3485F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.R(0L);
            byte[] bArr3 = f3486G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.R(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.R(12L);
            }
            T(gVar2, 6);
            d dVar2 = (d) this.f3538f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f3538f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f3538f[5].put("JPEGInterchangeFormat", dVar2);
                this.f3538f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f3538f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f3540h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i9 = iArr[0];
                if (i8 <= i9 || (i6 = iArr[3]) <= (i7 = iArr[1])) {
                    return;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = (i6 - i7) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                d j6 = d.j(i10, this.f3540h);
                d j7 = d.j(i11, this.f3540h);
                this.f3538f[0].put("ImageWidth", j6);
                this.f3538f[0].put("ImageLength", j7);
            }
        }
    }

    public final void p(b bVar) {
        if (f3527v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.I(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f3487H;
        bVar.P(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i6 = length + 8;
                if (i6 == 16 && !Arrays.equals(bArr2, f3489J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f3490K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f3488I)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f3548p = i6;
                        S(bArr3, 0);
                        j0();
                        f0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i7 = readInt + 4;
                bVar.P(i7);
                length = i6 + i7;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void q(b bVar) {
        boolean z6 = f3527v;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.P(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        bVar.P(i6 - bVar.c());
        bVar.readFully(bArr4);
        l(new b(bArr4), i6, 5);
        bVar.P(i8 - bVar.c());
        bVar.I(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i9 = 0; i9 < readInt; i9++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f3510e0.f3568a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j6 = d.j(readShort, this.f3540h);
                d j7 = d.j(readShort2, this.f3540h);
                this.f3538f[0].put("ImageLength", j6);
                this.f3538f[0].put("ImageWidth", j7);
                if (f3527v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.P(readUnsignedShort2);
        }
    }

    public final void r(g gVar) {
        d dVar;
        P(gVar);
        T(gVar, 0);
        i0(gVar, 0);
        i0(gVar, 5);
        i0(gVar, 4);
        j0();
        if (this.f3536d != 8 || (dVar = (d) this.f3538f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f3567d);
        gVar2.I(this.f3540h);
        gVar2.P(6);
        T(gVar2, 9);
        d dVar2 = (d) this.f3538f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f3538f[1].put("ColorSpace", dVar2);
        }
    }

    public int s() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void t(g gVar) {
        if (f3527v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = (d) this.f3538f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f3567d), (int) dVar.f3566c, 5);
        }
        d dVar2 = (d) this.f3538f[0].get("ISO");
        d dVar3 = (d) this.f3538f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f3538f[1].put("PhotographicSensitivity", dVar2);
    }

    public final void u(g gVar) {
        byte[] bArr = f3522q0;
        gVar.P(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f3548p = bArr.length;
        S(bArr2, 0);
    }

    public byte[] v() {
        int i6 = this.f3547o;
        if (i6 == 6 || i6 == 7) {
            return w();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] w() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f3541i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f3546n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f3535c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            N0.b.b(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.f3533a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.f3533a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.f3534b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = N0.b.a.b(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            N0.b.a.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            N0.a$b r4 = new N0.a$b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f3544l     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.f3548p     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.P(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f3545m     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.f3546n = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            N0.b.b(r1)
            if (r3 == 0) goto L76
            N0.b.a(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            N0.b.b(r1)
            if (r3 == 0) goto L8f
            N0.b.a(r3)
        L8f:
            return r2
        L90:
            N0.b.b(r2)
            if (r3 == 0) goto L98
            N0.b.a(r3)
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.w():byte[]");
    }

    public final void x(b bVar) {
        if (f3527v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.I(ByteOrder.LITTLE_ENDIAN);
        bVar.P(f3491L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f3492M;
        bVar.P(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i6 = length + 8;
                if (Arrays.equals(f3493N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f3548p = i6;
                    S(bArr3, 0);
                    f0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i6 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.P(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m6 = dVar.m(this.f3540h);
        int m7 = dVar2.m(this.f3540h);
        if (this.f3536d == 7) {
            m6 += this.f3549q;
        }
        if (m6 > 0 && m7 > 0) {
            this.f3541i = true;
            if (this.f3533a == null && this.f3535c == null && this.f3534b == null) {
                byte[] bArr = new byte[m7];
                bVar.P(m6);
                bVar.readFully(bArr);
                this.f3546n = bArr;
            }
            this.f3544l = m6;
            this.f3545m = m7;
        }
        if (f3527v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m6 + ", length: " + m7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f3557a;

        /* renamed from: b, reason: collision with root package name */
        public int f3558b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f3559c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f3560d;

        /* renamed from: e, reason: collision with root package name */
        public int f3561e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f3561e = bArr.length;
        }

        public long D() {
            return readInt() & 4294967295L;
        }

        public void I(ByteOrder byteOrder) {
            this.f3559c = byteOrder;
        }

        public void P(int i6) {
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i6 - i7;
                int skip = (int) this.f3557a.skip(i8);
                if (skip <= 0) {
                    if (this.f3560d == null) {
                        this.f3560d = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                    }
                    skip = this.f3557a.read(this.f3560d, 0, Math.min(ConstantsKt.DEFAULT_BUFFER_SIZE, i8));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i6 + " bytes.");
                    }
                }
                i7 += skip;
            }
            this.f3558b += i7;
        }

        public int a() {
            return this.f3561e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3557a.available();
        }

        public int c() {
            return this.f3558b;
        }

        @Override // java.io.InputStream
        public void mark(int i6) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f3558b++;
            return this.f3557a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f3558b++;
            return this.f3557a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f3558b++;
            int read = this.f3557a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f3558b += 2;
            return this.f3557a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i6, int i7) {
            this.f3558b += i7;
            this.f3557a.readFully(bArr, i6, i7);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f3558b += 4;
            int read = this.f3557a.read();
            int read2 = this.f3557a.read();
            int read3 = this.f3557a.read();
            int read4 = this.f3557a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3559c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f3559c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f3558b += 8;
            int read = this.f3557a.read();
            int read2 = this.f3557a.read();
            int read3 = this.f3557a.read();
            int read4 = this.f3557a.read();
            int read5 = this.f3557a.read();
            int read6 = this.f3557a.read();
            int read7 = this.f3557a.read();
            int read8 = this.f3557a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3559c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f3559c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f3558b += 2;
            int read = this.f3557a.read();
            int read2 = this.f3557a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3559c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f3559c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f3558b += 2;
            return this.f3557a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f3558b++;
            return this.f3557a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f3558b += 2;
            int read = this.f3557a.read();
            int read2 = this.f3557a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3559c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f3559c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i6) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            int read = this.f3557a.read(bArr, i6, i7);
            this.f3558b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f3558b += bArr.length;
            this.f3557a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3557a = dataInputStream;
            dataInputStream.mark(0);
            this.f3558b = 0;
            this.f3559c = byteOrder;
            this.f3561e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f3557a.mark(IntCompanionObject.MAX_VALUE);
        }

        public void R(long j6) {
            int i6 = this.f3558b;
            if (i6 > j6) {
                this.f3558b = 0;
                this.f3557a.reset();
            } else {
                j6 -= i6;
            }
            P((int) j6);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f3557a.mark(IntCompanionObject.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f3568a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3569b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3570c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3571d;

        public e(String str, int i6, int i7) {
            this.f3569b = str;
            this.f3568a = i6;
            this.f3570c = i7;
            this.f3571d = -1;
        }

        public boolean a(int i6) {
            int i7;
            int i8 = this.f3570c;
            if (i8 == 7 || i6 == 7 || i8 == i6 || (i7 = this.f3571d) == i6) {
                return true;
            }
            if ((i8 == 4 || i7 == 4) && i6 == 3) {
                return true;
            }
            if ((i8 == 9 || i7 == 9) && i6 == 8) {
                return true;
            }
            return (i8 == 12 || i7 == 12) && i6 == 11;
        }

        public e(String str, int i6, int i7, int i8) {
            this.f3569b = str;
            this.f3568a = i6;
            this.f3570c = i7;
            this.f3571d = i8;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i6) {
        e[][] eVarArr = f3515j0;
        this.f3538f = new HashMap[eVarArr.length];
        this.f3539g = new HashSet(eVarArr.length);
        this.f3540h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f3533a = null;
            if (i6 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f3522q0.length);
                if (!C(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f3537e = true;
                this.f3535c = null;
                this.f3534b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f3535c = (AssetManager.AssetInputStream) inputStream;
                this.f3534b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (J(fileInputStream.getFD())) {
                        this.f3535c = null;
                        this.f3534b = fileInputStream.getFD();
                    }
                }
                this.f3535c = null;
                this.f3534b = null;
            }
            O(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
