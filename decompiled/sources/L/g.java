package L;

import F.AbstractC0335i0;
import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3025c = "g";

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3026d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3027e = new b();

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f3028f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final List f3029g = n();

    /* renamed from: h, reason: collision with root package name */
    public static final List f3030h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    public final N0.a f3031a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3032b = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final double f3033a;

            public a(double d6) {
                this.f3033a = d6;
            }

            public double a() {
                return this.f3033a / 2.23694d;
            }
        }

        public static a a(double d6) {
            return new a(d6 * 0.621371d);
        }

        public static a b(double d6) {
            return new a(d6 * 1.15078d);
        }

        public static a c(double d6) {
            return new a(d6);
        }
    }

    public g(N0.a aVar) {
        this.f3031a = aVar;
    }

    public static Date c(String str) {
        return ((SimpleDateFormat) f3026d.get()).parse(str);
    }

    public static Date d(String str) {
        return ((SimpleDateFormat) f3028f.get()).parse(str);
    }

    public static Date e(String str) {
        return ((SimpleDateFormat) f3027e.get()).parse(str);
    }

    public static String f(long j6) {
        return ((SimpleDateFormat) f3028f.get()).format(new Date(j6));
    }

    public static g h(File file) {
        return i(file.toString());
    }

    public static g i(String str) {
        return new g(new N0.a(str));
    }

    public static g j(androidx.camera.core.d dVar) {
        ByteBuffer d6 = dVar.j()[0].d();
        d6.rewind();
        byte[] bArr = new byte[d6.capacity()];
        d6.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static g k(InputStream inputStream) {
        return new g(new N0.a(inputStream));
    }

    public static List n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void A() {
        if (!this.f3032b) {
            a();
        }
        this.f3031a.X();
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f6 = f(currentTimeMillis);
        this.f3031a.c0("DateTime", f6);
        try {
            this.f3031a.c0("SubSecTime", Long.toString(currentTimeMillis - d(f6).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void b(Location location) {
        this.f3031a.d0(location);
    }

    public void g(g gVar) {
        ArrayList<String> arrayList = new ArrayList(f3029g);
        arrayList.removeAll(f3030h);
        for (String str : arrayList) {
            String g6 = this.f3031a.g(str);
            String g7 = gVar.f3031a.g(str);
            if (g6 != null && !g6.equals(g7)) {
                gVar.f3031a.c0(str, g6);
            }
        }
    }

    public void l() {
        int i6;
        switch (r()) {
            case 2:
                i6 = 1;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 3;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 5;
                break;
            case 7:
                i6 = 8;
                break;
            case 8:
                i6 = 7;
                break;
            default:
                i6 = 2;
                break;
        }
        this.f3031a.c0("Orientation", String.valueOf(i6));
    }

    public void m() {
        int i6;
        switch (r()) {
            case 2:
                i6 = 3;
                break;
            case 3:
                i6 = 2;
                break;
            case 4:
                i6 = 1;
                break;
            case 5:
                i6 = 8;
                break;
            case 6:
                i6 = 7;
                break;
            case 7:
                i6 = 6;
                break;
            case 8:
                i6 = 5;
                break;
            default:
                i6 = 4;
                break;
        }
        this.f3031a.c0("Orientation", String.valueOf(i6));
    }

    public String o() {
        return this.f3031a.g("ImageDescription");
    }

    public int p() {
        return this.f3031a.i("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location q() {
        /*
            r16 = this;
            r0 = r16
            N0.a r1 = r0.f3031a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.g(r2)
            N0.a r2 = r0.f3031a
            double[] r2 = r2.m()
            N0.a r3 = r0.f3031a
            r4 = 0
            double r6 = r3.f(r4)
            N0.a r3 = r0.f3031a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.h(r8, r4)
            N0.a r3 = r0.f3031a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.g(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L2d
            r3 = r10
        L2d:
            N0.a r11 = r0.f3031a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.g(r12)
            N0.a r12 = r0.f3031a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.g(r13)
            long r11 = r0.y(r11, r12)
            if (r2 != 0) goto L45
            r1 = 0
            return r1
        L45:
            if (r1 != 0) goto L49
            java.lang.String r1 = L.g.f3025c
        L49:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            r13.setAltitude(r6)
        L61:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L8a
            r2 = 77
            if (r1 == r2) goto L80
            r2 = 78
            if (r1 == r2) goto L76
            goto L92
        L76:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = r14
            goto L93
        L80:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L93
        L8a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L92
            r1 = 2
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La9
            if (r1 == r14) goto La0
            L.g$d$a r1 = L.g.d.a(r8)
            double r1 = r1.a()
            goto Lb1
        La0:
            L.g$d$a r1 = L.g.d.b(r8)
            double r1 = r1.a()
            goto Lb1
        La9:
            L.g$d$a r1 = L.g.d.c(r8)
            double r1 = r1.a()
        Lb1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        Lb5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            r13.setTime(r11)
        Lbe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L.g.q():android.location.Location");
    }

    public int r() {
        return this.f3031a.i("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() {
        long x6 = x(this.f3031a.g("DateTimeOriginal"));
        if (x6 == -1) {
            return -1L;
        }
        String g6 = this.f3031a.g("SubSecTimeOriginal");
        if (g6 == null) {
            return x6;
        }
        try {
            long parseLong = Long.parseLong(g6);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x6 + parseLong;
        } catch (NumberFormatException unused) {
            return x6;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f3031a.i("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int r6 = r();
        return r6 == 4 || r6 == 5 || r6 == 7;
    }

    public final long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void z(int i6) {
        if (i6 % 90 != 0) {
            AbstractC0335i0.l(f3025c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i6)));
            this.f3031a.c0("Orientation", String.valueOf(0));
            return;
        }
        int i7 = i6 % 360;
        int r6 = r();
        while (i7 < 0) {
            i7 += 90;
            switch (r6) {
                case 2:
                    r6 = 5;
                    break;
                case 3:
                case 8:
                    r6 = 6;
                    break;
                case 4:
                    r6 = 7;
                    break;
                case 5:
                    r6 = 4;
                    break;
                case 6:
                    r6 = 1;
                    break;
                case 7:
                    r6 = 2;
                    break;
                default:
                    r6 = 8;
                    break;
            }
        }
        while (i7 > 0) {
            i7 -= 90;
            switch (r6) {
                case 2:
                    r6 = 7;
                    break;
                case 3:
                    r6 = 8;
                    break;
                case 4:
                    r6 = 5;
                    break;
                case 5:
                    r6 = 2;
                    break;
                case 6:
                    r6 = 3;
                    break;
                case 7:
                    r6 = 4;
                    break;
                case 8:
                    r6 = 1;
                    break;
                default:
                    r6 = 6;
                    break;
            }
        }
        this.f3031a.c0("Orientation", String.valueOf(r6));
    }
}
