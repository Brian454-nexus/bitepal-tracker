package L;

import F.AbstractC0335i0;
import I.EnumC0453t;
import android.os.Build;
import android.util.Pair;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3042c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d, reason: collision with root package name */
    public static final k[] f3043d;

    /* renamed from: e, reason: collision with root package name */
    public static final k[] f3044e;

    /* renamed from: f, reason: collision with root package name */
    public static final k[] f3045f;

    /* renamed from: g, reason: collision with root package name */
    public static final k[] f3046g;

    /* renamed from: h, reason: collision with root package name */
    public static final k[] f3047h;

    /* renamed from: i, reason: collision with root package name */
    public static final k[][] f3048i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f3049j;

    /* renamed from: a, reason: collision with root package name */
    public final List f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteOrder f3051b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3052a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3053b;

        static {
            int[] iArr = new int[c.values().length];
            f3053b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3053b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0453t.values().length];
            f3052a = iArr2;
            try {
                iArr2[EnumC0453t.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3052a[EnumC0453t.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3052a[EnumC0453t.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f3054c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f3055d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f3056e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f, reason: collision with root package name */
        public static final List f3057f = Collections.list(new a());

        /* renamed from: a, reason: collision with root package name */
        public final List f3058a = Collections.list(new C0056b());

        /* renamed from: b, reason: collision with root package name */
        public final ByteOrder f3059b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            public int f3060a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap hashMap = new HashMap();
                for (k kVar : i.f3048i[this.f3060a]) {
                    hashMap.put(kVar.f3076b, kVar);
                }
                this.f3060a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3060a < i.f3048i.length;
            }
        }

        /* renamed from: L.i$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0056b implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            public int f3061a = 0;

            public C0056b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f3061a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3061a < i.f3048i.length;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class c implements Enumeration {

            /* renamed from: a, reason: collision with root package name */
            public final Enumeration f3063a;

            public c() {
                this.f3063a = Collections.enumeration(b.this.f3058a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f3063a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3063a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f3059b = byteOrder;
        }

        public static Pair b(String str) {
            if (str.contains(com.amazon.a.a.o.b.f.f11248a)) {
                String[] split = str.split(com.amazon.a.a.o.b.f.f11248a, -1);
                Pair b6 = b(split[0]);
                if (((Integer) b6.first).intValue() == 2) {
                    return b6;
                }
                for (int i6 = 1; i6 < split.length; i6++) {
                    Pair b7 = b(split[i6]);
                    int intValue = (((Integer) b7.first).equals(b6.first) || ((Integer) b7.second).equals(b6.first)) ? ((Integer) b6.first).intValue() : -1;
                    int intValue2 = (((Integer) b6.second).intValue() == -1 || !(((Integer) b7.first).equals(b6.second) || ((Integer) b7.second).equals(b6.second))) ? -1 : ((Integer) b6.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (intValue == -1) {
                        b6 = new Pair(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b6 = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
                return b6;
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

        public i a() {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new i(this.f3059b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f3058a);
            return this;
        }

        public final void d(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
        
            if (r7 != r0) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e(java.lang.String r17, java.lang.String r18, java.util.List r19) {
            /*
                Method dump skipped, instructions count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L.i.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public b f(long j6) {
            return c("ExposureTime", String.valueOf(j6 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(EnumC0453t enumC0453t) {
            int i6;
            if (enumC0453t == EnumC0453t.UNKNOWN) {
                return this;
            }
            int i7 = a.f3052a[enumC0453t.ordinal()];
            if (i7 == 1) {
                i6 = 0;
            } else if (i7 == 2) {
                i6 = 32;
            } else {
                if (i7 != 3) {
                    AbstractC0335i0.l("ExifData", "Unknown flash state: " + enumC0453t);
                    return this;
                }
                i6 = 1;
            }
            if ((i6 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i6));
        }

        public b h(float f6) {
            return c("FocalLength", new l(f6 * 1000.0f, 1000L).toString());
        }

        public b i(int i6) {
            return c("ImageLength", String.valueOf(i6));
        }

        public b j(int i6) {
            return c("ImageWidth", String.valueOf(i6));
        }

        public b k(int i6) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i6)));
        }

        public b l(float f6) {
            return c("FNumber", String.valueOf(f6));
        }

        public b m(int i6) {
            int i7;
            if (i6 == 0) {
                i7 = 1;
            } else if (i6 == 90) {
                i7 = 6;
            } else if (i6 == 180) {
                i7 = 3;
            } else if (i6 != 270) {
                AbstractC0335i0.l("ExifData", "Unexpected orientation value: " + i6 + ". Must be one of 0, 90, 180, 270.");
                i7 = 0;
            } else {
                i7 = 8;
            }
            return c("Orientation", String.valueOf(i7));
        }

        public b n(c cVar) {
            int i6 = a.f3053b[cVar.ordinal()];
            return c("WhiteBalance", i6 != 1 ? i6 != 2 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        k[] kVarArr = {new k("ImageWidth", 256, 3, 4), new k("ImageLength", 257, 3, 4), new k("Make", 271, 2), new k("Model", 272, 2), new k("Orientation", 274, 3), new k("XResolution", 282, 5), new k("YResolution", 283, 5), new k("ResolutionUnit", 296, 3), new k("Software", 305, 2), new k("DateTime", 306, 2), new k("YCbCrPositioning", 531, 3), new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4)};
        f3043d = kVarArr;
        k[] kVarArr2 = {new k("ExposureTime", 33434, 5), new k("FNumber", 33437, 5), new k("ExposureProgram", 34850, 3), new k("PhotographicSensitivity", 34855, 3), new k("SensitivityType", 34864, 3), new k("ExifVersion", 36864, 2), new k("DateTimeOriginal", 36867, 2), new k("DateTimeDigitized", 36868, 2), new k("ComponentsConfiguration", 37121, 7), new k("ShutterSpeedValue", 37377, 10), new k("ApertureValue", 37378, 5), new k("BrightnessValue", 37379, 10), new k("ExposureBiasValue", 37380, 10), new k("MaxApertureValue", 37381, 5), new k("MeteringMode", 37383, 3), new k("LightSource", 37384, 3), new k("Flash", 37385, 3), new k("FocalLength", 37386, 5), new k("SubSecTime", 37520, 2), new k("SubSecTimeOriginal", 37521, 2), new k("SubSecTimeDigitized", 37522, 2), new k("FlashpixVersion", 40960, 7), new k("ColorSpace", 40961, 3), new k("PixelXDimension", 40962, 3, 4), new k("PixelYDimension", 40963, 3, 4), new k("InteroperabilityIFDPointer", 40965, 4), new k("FocalPlaneResolutionUnit", 41488, 3), new k("SensingMethod", 41495, 3), new k("FileSource", 41728, 7), new k("SceneType", 41729, 7), new k("CustomRendered", 41985, 3), new k("ExposureMode", 41986, 3), new k("WhiteBalance", 41987, 3), new k("SceneCaptureType", 41990, 3), new k("Contrast", 41992, 3), new k("Saturation", 41993, 3), new k("Sharpness", 41994, 3)};
        f3044e = kVarArr2;
        k[] kVarArr3 = {new k("GPSVersionID", 0, 1), new k("GPSLatitudeRef", 1, 2), new k("GPSLatitude", 2, 5, 10), new k("GPSLongitudeRef", 3, 2), new k("GPSLongitude", 4, 5, 10), new k("GPSAltitudeRef", 5, 1), new k("GPSAltitude", 6, 5), new k("GPSTimeStamp", 7, 5), new k("GPSSpeedRef", 12, 2), new k("GPSTrackRef", 14, 2), new k("GPSImgDirectionRef", 16, 2), new k("GPSDestBearingRef", 23, 2), new k("GPSDestDistanceRef", 25, 2)};
        f3045f = kVarArr3;
        f3046g = new k[]{new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4), new k("InteroperabilityIFDPointer", 40965, 4)};
        k[] kVarArr4 = {new k("InteroperabilityIndex", 1, 2)};
        f3047h = kVarArr4;
        f3048i = new k[][]{kVarArr, kVarArr2, kVarArr3, kVarArr4};
        f3049j = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public i(ByteOrder byteOrder, List list) {
        y0.g.i(list.size() == f3048i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f3051b = byteOrder;
        this.f3050a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static i b(androidx.camera.core.d dVar, int i6) {
        b a6 = a();
        if (dVar.O() != null) {
            dVar.O().b(a6);
        }
        a6.m(i6);
        return a6.j(dVar.getWidth()).i(dVar.getHeight()).a();
    }

    public Map c(int i6) {
        y0.g.d(i6, 0, f3048i.length, "Invalid IFD index: " + i6 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f3050a.get(i6);
    }

    public ByteOrder d() {
        return this.f3051b;
    }
}
