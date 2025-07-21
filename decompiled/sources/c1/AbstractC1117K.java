package c1;

import Z0.C;
import Z0.q;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.installreferrer.api.InstallReferrerClient;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: c1.K, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1117K {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10560a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f10561b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f10562c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f10563d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f10564e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10565f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f10566g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f10567h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f10568i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f10569j;

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f10570k;

    /* renamed from: l, reason: collision with root package name */
    public static HashMap f10571l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f10572m;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f10573n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f10574o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f10575p;

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f10576q;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f10560a = i6;
        String str = Build.DEVICE;
        f10561b = str;
        String str2 = Build.MANUFACTURER;
        f10562c = str2;
        String str3 = Build.MODEL;
        f10563d = str3;
        f10564e = str + ", " + str3 + ", " + str2 + ", " + i6;
        f10565f = new byte[0];
        f10566g = new long[0];
        f10567h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f10568i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f10569j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f10570k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f10572m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f10573n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f10574o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f10575p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f10576q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Handler A() {
        return B(null);
    }

    public static boolean A0(int i6) {
        return i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736 || i6 == 4;
    }

    public static Handler B(Handler.Callback callback) {
        return z((Looper) AbstractC1119a.i(Looper.myLooper()), callback);
    }

    public static boolean B0(int i6) {
        return i6 == 3 || i6 == 2 || i6 == 268435456 || i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736 || i6 == 4;
    }

    public static Handler C() {
        return D(null);
    }

    public static boolean C0(Context context) {
        int i6 = f10560a;
        if (i6 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i6 != 30) {
            return false;
        }
        String str = f10563d;
        return y6.c.a(str, "moto g(20)") || y6.c.a(str, "rmx3231");
    }

    public static Handler D(Handler.Callback callback) {
        return z(W(), callback);
    }

    public static boolean D0(int i6) {
        return i6 == 10 || i6 == 13;
    }

    public static HashMap E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f10572m.length);
        int i6 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f10572m;
            if (i6 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i6], strArr[i6 + 1]);
            i6 += 2;
        }
    }

    public static boolean E0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static long F(long j6, int i6) {
        return Z0(j6, i6, 1000000L, RoundingMode.CEILING);
    }

    public static boolean F0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Uri G(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f10570k.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean G0(Context context) {
        return f10560a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String H(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int H0(int[] iArr, int i6) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (iArr[i7] == i6) {
                return i7;
            }
        }
        return -1;
    }

    public static String I(byte[] bArr) {
        return new String(bArr, y6.e.c);
    }

    public static String I0(String str) {
        int i6 = 0;
        while (true) {
            String[] strArr = f10573n;
            if (i6 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i6])) {
                return strArr[i6 + 1] + str.substring(strArr[i6].length());
            }
            i6 += 2;
        }
    }

    public static String J(byte[] bArr, int i6, int i7) {
        return new String(bArr, i6, i7, y6.e.c);
    }

    public static long J0(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 * 1000;
    }

    public static int K(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static ExecutorService K0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: c1.J
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC1117K.a(str, runnable);
            }
        });
    }

    public static int L(int i6) {
        if (i6 == 20) {
            return 30;
        }
        if (i6 == 22) {
            return 31;
        }
        if (i6 == 30) {
            return 34;
        }
        switch (i6) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i6) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return IntCompanionObject.MAX_VALUE;
                }
        }
    }

    public static String L0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e6 = y6.c.e(str);
        String str2 = e1(e6, "-")[0];
        if (f10571l == null) {
            f10571l = E();
        }
        String str3 = (String) f10571l.get(str2);
        if (str3 != null) {
            e6 = str3 + e6.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? I0(e6) : e6;
    }

    public static AudioFormat M(int i6, int i7, int i8) {
        return new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i7).setEncoding(i8).build();
    }

    public static Object[] M0(Object[] objArr, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        copyOf[objArr.length] = obj;
        return j(copyOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int N(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = c1.AbstractC1117K.f10560a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.AbstractC1117K.N(int):int");
    }

    public static Object[] N0(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static C.b O(Z0.C c6, C.b bVar) {
        boolean l6 = c6.l();
        boolean C6 = c6.C();
        boolean v6 = c6.v();
        boolean F6 = c6.F();
        boolean R5 = c6.R();
        boolean J6 = c6.J();
        boolean q6 = c6.N().q();
        boolean z6 = false;
        C.b.a d6 = new C.b.a().b(bVar).d(4, !l6).d(5, C6 && !l6).d(6, v6 && !l6).d(7, !q6 && (v6 || !R5 || C6) && !l6).d(8, F6 && !l6).d(9, !q6 && (F6 || (R5 && J6)) && !l6).d(10, !l6).d(11, C6 && !l6);
        if (C6 && !l6) {
            z6 = true;
        }
        return d6.d(12, z6).e();
    }

    public static Object[] O0(Object[] objArr, int i6) {
        AbstractC1119a.a(i6 <= objArr.length);
        return Arrays.copyOf(objArr, i6);
    }

    public static int P(ByteBuffer byteBuffer, int i6) {
        int i7 = byteBuffer.getInt(i6);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i7 : Integer.reverseBytes(i7);
    }

    public static Object[] P0(Object[] objArr, int i6, int i7) {
        AbstractC1119a.a(i6 >= 0);
        AbstractC1119a.a(i7 <= objArr.length);
        return Arrays.copyOfRange(objArr, i6, i7);
    }

    public static byte[] Q(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            bArr[i6] = (byte) ((Character.digit(str.charAt(i7), 16) << 4) + Character.digit(str.charAt(i7 + 1), 16));
        }
        return bArr;
    }

    public static long Q0(String str) {
        Matcher matcher = f10567h.matcher(str);
        if (!matcher.matches()) {
            throw Z0.z.a("Invalid date/time format: " + str, null);
        }
        int i6 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i6 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i6 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i6 != 0 ? timeInMillis - (i6 * 60000) : timeInMillis;
    }

    public static int R(String str, int i6) {
        int i7 = 0;
        for (String str2 : f1(str)) {
            if (i6 == Z0.y.m(str2)) {
                i7++;
            }
        }
        return i7;
    }

    public static long R0(String str) {
        Matcher matcher = f10568i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static String S(String str, int i6) {
        String[] f12 = f1(str);
        if (f12.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : f12) {
            if (i6 == Z0.y.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(com.amazon.a.a.o.b.f.f11248a);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean S0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String T(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return y6.c.f(networkCountryIso);
            }
        }
        return y6.c.f(Locale.getDefault().getCountry());
    }

    public static boolean T0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Point U(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) AbstractC1119a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return V(context, display);
    }

    public static void U0(List list, int i6, int i7) {
        if (i6 < 0 || i7 > list.size() || i6 > i7) {
            throw new IllegalArgumentException();
        }
        if (i6 != i7) {
            list.subList(i6, i7).clear();
        }
    }

    public static Point V(Context context, Display display) {
        if (display.getDisplayId() == 0 && F0(context)) {
            String q02 = f10560a < 28 ? q0("sys.display-size") : q0("vendor.display-size");
            if (!TextUtils.isEmpty(q02)) {
                try {
                    String[] d12 = d1(q02.trim(), "x");
                    if (d12.length == 2) {
                        int parseInt = Integer.parseInt(d12[0]);
                        int parseInt2 = Integer.parseInt(d12[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC1133o.c("Util", "Invalid display size: " + q02);
            }
            if ("Sony".equals(f10562c) && f10563d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f10560a >= 23) {
            X(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static long V0(long j6, int i6) {
        return Z0(j6, 1000000L, i6, RoundingMode.FLOOR);
    }

    public static Looper W() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long W0(long j6, long j7, long j8) {
        return Z0(j6, j7, j8, RoundingMode.FLOOR);
    }

    public static void X(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long[] X0(List list, long j6, long j7) {
        return b1(list, j6, j7, RoundingMode.FLOOR);
    }

    public static int Y(int i6) {
        if (i6 == 2 || i6 == 4) {
            return 6005;
        }
        if (i6 == 10) {
            return 6004;
        }
        if (i6 == 7) {
            return 6005;
        }
        if (i6 == 8) {
            return 6003;
        }
        switch (i6) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i6) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static void Y0(long[] jArr, long j6, long j7) {
        c1(jArr, j6, j7, RoundingMode.FLOOR);
    }

    public static int Z(String str) {
        String[] d12;
        int length;
        int i6 = 0;
        if (str == null || (length = (d12 = d1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = d12[length - 1];
        boolean z6 = length >= 3 && "neg".equals(d12[length - 2]);
        try {
            i6 = Integer.parseInt((String) AbstractC1119a.e(str2));
            if (z6) {
                return -i6;
            }
        } catch (NumberFormatException unused) {
        }
        return i6;
    }

    public static long Z0(long j6, long j7, long j8, RoundingMode roundingMode) {
        if (j6 == 0 || j7 == 0) {
            return 0L;
        }
        return (j8 < j7 || j8 % j7 != 0) ? (j8 >= j7 || j7 % j8 != 0) ? (j8 < j6 || j8 % j6 != 0) ? (j8 >= j6 || j6 % j8 != 0) ? a1(j6, j7, j8, roundingMode) : B6.e.d(j7, B6.e.b(j6, j8, RoundingMode.UNNECESSARY)) : B6.e.b(j7, B6.e.b(j8, j6, RoundingMode.UNNECESSARY), roundingMode) : B6.e.d(j6, B6.e.b(j7, j8, RoundingMode.UNNECESSARY)) : B6.e.b(j6, B6.e.b(j8, j7, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String a0(int i6) {
        if (i6 == 0) {
            return "NO";
        }
        if (i6 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i6 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i6 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i6 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long a1(long j6, long j7, long j8, RoundingMode roundingMode) {
        long d6 = B6.e.d(j6, j7);
        if (d6 != LongCompanionObject.MAX_VALUE && d6 != Long.MIN_VALUE) {
            return B6.e.b(d6, j8, roundingMode);
        }
        long c6 = B6.e.c(Math.abs(j7), Math.abs(j8));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b6 = B6.e.b(j7, c6, roundingMode2);
        long b7 = B6.e.b(j8, c6, roundingMode2);
        long c7 = B6.e.c(Math.abs(j6), Math.abs(b7));
        long b8 = B6.e.b(j6, c7, roundingMode2);
        long b9 = B6.e.b(b7, c7, roundingMode2);
        long d7 = B6.e.d(b8, b6);
        if (d7 != LongCompanionObject.MAX_VALUE && d7 != Long.MIN_VALUE) {
            return B6.e.b(d7, b9, roundingMode);
        }
        double d8 = b8 * (b6 / b9);
        if (d8 > 9.223372036854776E18d) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (d8 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return B6.b.c(d8, roundingMode);
    }

    public static long b(long j6, long j7, long j8) {
        long j9 = j6 + j7;
        return ((j6 ^ j9) & (j7 ^ j9)) < 0 ? j8 : j9;
    }

    public static String b0(Locale locale) {
        return f10560a >= 21 ? c0(locale) : locale.toString();
    }

    public static long[] b1(List list, long j6, long j7, RoundingMode roundingMode) {
        long j8 = j6;
        long j9 = j7;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j8 != 0) {
            int i6 = 0;
            if (j9 >= j8 && j9 % j8 == 0) {
                long b6 = B6.e.b(j9, j8, RoundingMode.UNNECESSARY);
                while (i6 < size) {
                    jArr[i6] = B6.e.b(((Long) list.get(i6)).longValue(), b6, roundingMode2);
                    i6++;
                }
            } else if (j9 >= j8 || j8 % j9 != 0) {
                int i7 = 0;
                while (i7 < size) {
                    long longValue = ((Long) list.get(i7)).longValue();
                    if (longValue != 0) {
                        if (j9 >= longValue && j9 % longValue == 0) {
                            jArr[i7] = B6.e.b(j8, B6.e.b(j9, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j9 >= longValue || longValue % j9 != 0) {
                            jArr[i7] = a1(longValue, j8, j9, roundingMode2);
                        } else {
                            jArr[i7] = B6.e.d(j8, B6.e.b(longValue, j9, RoundingMode.UNNECESSARY));
                        }
                    }
                    i7++;
                    j8 = j6;
                    j9 = j7;
                    roundingMode2 = roundingMode;
                }
            } else {
                long b7 = B6.e.b(j8, j9, RoundingMode.UNNECESSARY);
                while (i6 < size) {
                    jArr[i6] = B6.e.d(((Long) list.get(i6)).longValue(), b7);
                    i6++;
                }
            }
        }
        return jArr;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String c0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void c1(long[] jArr, long j6, long j7, RoundingMode roundingMode) {
        if (j6 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i6 = 0;
        if (j7 >= j6 && j7 % j6 == 0) {
            long b6 = B6.e.b(j7, j6, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = B6.e.b(jArr[i6], b6, roundingMode);
                i6++;
            }
            return;
        }
        if (j7 < j6 && j6 % j7 == 0) {
            long b7 = B6.e.b(j6, j7, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = B6.e.d(jArr[i6], b7);
                i6++;
            }
            return;
        }
        for (int i7 = 0; i7 < jArr.length; i7++) {
            long j8 = jArr[i7];
            if (j8 != 0) {
                if (j7 >= j8 && j7 % j8 == 0) {
                    jArr[i7] = B6.e.b(j6, B6.e.b(j7, j8, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j7 >= j8 || j8 % j7 != 0) {
                    jArr[i7] = a1(j8, j6, j7, roundingMode);
                } else {
                    jArr[i7] = B6.e.d(j6, B6.e.b(j8, j7, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static int d(long[] jArr, long j6, boolean z6, boolean z7) {
        int i6;
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            i7 = ~binarySearch;
        } else {
            while (true) {
                i6 = binarySearch + 1;
                if (i6 >= jArr.length || jArr[i6] != j6) {
                    break;
                }
                binarySearch = i6;
            }
            i7 = z6 ? binarySearch : i6;
        }
        return z7 ? Math.min(jArr.length - 1, i7) : i7;
    }

    public static int d0(Context context) {
        return C0(context) ? 1 : 5;
    }

    public static String[] d1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int e(C1134p c1134p, long j6, boolean z6, boolean z7) {
        int i6;
        int c6 = c1134p.c() - 1;
        int i7 = 0;
        while (i7 <= c6) {
            int i8 = (i7 + c6) >>> 1;
            if (c1134p.b(i8) < j6) {
                i7 = i8 + 1;
            } else {
                c6 = i8 - 1;
            }
        }
        if (z6 && (i6 = c6 + 1) < c1134p.c() && c1134p.b(i6) == j6) {
            return i6;
        }
        if (z7 && c6 == -1) {
            return 0;
        }
        return c6;
    }

    public static long e0(long j6, float f6) {
        return f6 == 1.0f ? j6 : Math.round(j6 * f6);
    }

    public static String[] e1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int f(List list, Comparable comparable, boolean z6, boolean z7) {
        int i6;
        int i7;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                i6 = binarySearch - 1;
                if (i6 < 0 || ((Comparable) list.get(i6)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i6;
            }
            i7 = z6 ? binarySearch : i6;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    public static long f0(long j6) {
        return j6 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j6;
    }

    public static String[] f1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : d1(str.trim(), "(\\s*,\\s*)");
    }

    public static int g(int[] iArr, int i6, boolean z6, boolean z7) {
        int i7;
        int i8;
        int binarySearch = Arrays.binarySearch(iArr, i6);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                i7 = binarySearch - 1;
                if (i7 < 0 || iArr[i7] != i6) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z6 ? binarySearch : i7;
        }
        return z7 ? Math.max(0, i8) : i8;
    }

    public static int g0(int i6) {
        if (i6 == 8) {
            return 3;
        }
        if (i6 == 16) {
            return 2;
        }
        if (i6 != 24) {
            return i6 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long g1(long j6, long j7, long j8) {
        long j9 = j6 - j7;
        return ((j6 ^ j9) & (j7 ^ j6)) < 0 ? j8 : j9;
    }

    public static int h(long[] jArr, long j6, boolean z6, boolean z7) {
        int i6;
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                i6 = binarySearch - 1;
                if (i6 < 0 || jArr[i6] != j6) {
                    break;
                }
                binarySearch = i6;
            }
            i7 = z6 ? binarySearch : i6;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    public static Z0.q h0(int i6, int i7, int i8) {
        return new q.b().o0("audio/raw").N(i7).p0(i8).i0(i6).K();
    }

    public static String h1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            sb.append(Character.forDigit((bArr[i6] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i6] & 15, 16));
        }
        return sb.toString();
    }

    public static Object i(Object obj) {
        return obj;
    }

    public static int i0(int i6, int i7) {
        if (i6 != 2) {
            if (i6 == 3) {
                return i7;
            }
            if (i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 != 268435456) {
                            if (i6 != 1342177280) {
                                if (i6 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i7 * 3;
            }
            return i7 * 4;
        }
        return i7 * 2;
    }

    public static long i1(int i6, int i7) {
        return j1(i7) | (j1(i6) << 32);
    }

    public static Object[] j(Object[] objArr) {
        return objArr;
    }

    public static long j0(long j6, float f6) {
        return f6 == 1.0f ? j6 : Math.round(j6 / f6);
    }

    public static long j1(int i6) {
        return i6 & 4294967295L;
    }

    public static int k(int i6, int i7) {
        return ((i6 + i7) - 1) / i7;
    }

    public static List k0(int i6) {
        ArrayList arrayList = new ArrayList();
        if ((i6 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i6 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i6 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i6 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i6 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i6 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i6 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i6 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i6 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            arrayList.add("describes-video");
        }
        if ((i6 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i6 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
            arrayList.add("easy-read");
        }
        if ((i6 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static long k1(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 / 1000;
    }

    public static long l(long j6, long j7) {
        return ((j6 + j7) - 1) / j7;
    }

    public static List l0(int i6) {
        ArrayList arrayList = new ArrayList();
        if ((i6 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i6 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i6 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static void l1(Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int m0(int i6) {
        if (i6 == 13) {
            return 1;
        }
        switch (i6) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int n(long j6, long j7) {
        if (j6 < j7) {
            return -1;
        }
        return j6 == j7 ? 0 : 1;
    }

    public static String[] n0() {
        String[] o02 = o0();
        for (int i6 = 0; i6 < o02.length; i6++) {
            o02[i6] = L0(o02[i6]);
        }
        return o02;
    }

    public static float o(float f6, float f7, float f8) {
        return Math.max(f7, Math.min(f6, f8));
    }

    public static String[] o0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f10560a >= 24 ? p0(configuration) : new String[]{b0(configuration.locale)};
    }

    public static int p(int i6, int i7, int i8) {
        return Math.max(i7, Math.min(i6, i8));
    }

    public static String[] p0(Configuration configuration) {
        return d1(configuration.getLocales().toLanguageTags(), com.amazon.a.a.o.b.f.f11248a);
    }

    public static long q(long j6, long j7, long j8) {
        return Math.max(j7, Math.min(j6, j8));
    }

    public static String q0(String str) {
        try {
            Class<?> cls = Class.forName(com.amazon.a.a.o.b.at);
            return (String) cls.getMethod(com.amazon.a.a.o.b.au, String.class).invoke(cls, str);
        } catch (Exception e6) {
            AbstractC1133o.d("Util", "Failed to read system property " + str, e6);
            return null;
        }
    }

    public static boolean r(SparseArray sparseArray, int i6) {
        return sparseArray.indexOfKey(i6) >= 0;
    }

    public static String r0(int i6) {
        switch (i6) {
            case -2:
                return "none";
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i6 < 10000) {
                    return "?";
                }
                return "custom (" + i6 + ")";
        }
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] s0(String str) {
        return str.getBytes(y6.e.c);
    }

    public static boolean t(SparseArray sparseArray, SparseArray sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f10560a >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i6 = 0; i6 < size; i6++) {
            if (!Objects.equals(sparseArray.valueAt(i6), sparseArray2.get(sparseArray.keyAt(i6)))) {
                return false;
            }
        }
        return true;
    }

    public static int t0(Uri uri) {
        int u02;
        String scheme = uri.getScheme();
        if (scheme != null && y6.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (u02 = u0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return u02;
        }
        Matcher matcher = f10570k.matcher((CharSequence) AbstractC1119a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int u(SparseArray sparseArray) {
        int contentHashCode;
        if (f10560a >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i6 = 17;
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            i6 = (((i6 * 31) + sparseArray.keyAt(i7)) * 31) + Objects.hashCode(sparseArray.valueAt(i7));
        }
        return i6;
    }

    public static int u0(String str) {
        String e6 = y6.c.e(str);
        e6.getClass();
        char c6 = 65535;
        switch (e6.hashCode()) {
            case 104579:
                if (e6.equals("ism")) {
                    c6 = 0;
                    break;
                }
                break;
            case 108321:
                if (e6.equals("mpd")) {
                    c6 = 1;
                    break;
                }
                break;
            case 3242057:
                if (e6.equals("isml")) {
                    c6 = 2;
                    break;
                }
                break;
            case 3299913:
                if (e6.equals("m3u8")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static int v(byte[] bArr, int i6, int i7, int i8) {
        while (i6 < i7) {
            int b6 = C6.j.b(bArr[i6]);
            i8 = w(b6 & 15, w(b6 >> 4, i8));
            i6++;
        }
        return i8;
    }

    public static int v0(Uri uri, String str) {
        if (str == null) {
            return t0(uri);
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c6 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c6 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int w(int i6, int i7) {
        return (f10575p[(i6 ^ ((i7 >> 12) & 255)) & 255] ^ ((i7 << 4) & 65535)) & 65535;
    }

    public static boolean w0(C1144z c1144z, C1144z c1144z2, Inflater inflater) {
        if (c1144z.a() <= 0) {
            return false;
        }
        if (c1144z2.b() < c1144z.a()) {
            c1144z2.c(c1144z.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c1144z.e(), c1144z.f(), c1144z.a());
        int i6 = 0;
        while (true) {
            try {
                i6 += inflater.inflate(c1144z2.e(), i6, c1144z2.b() - i6);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i6 == c1144z2.b()) {
                        c1144z2.c(c1144z2.b() * 2);
                    }
                } else {
                    c1144z2.S(i6);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static int x(byte[] bArr, int i6, int i7, int i8) {
        while (i6 < i7) {
            i8 = f10574o[((i8 >>> 24) ^ (bArr[i6] & 255)) & 255] ^ (i8 << 8);
            i6++;
        }
        return i8;
    }

    public static String x0(int i6) {
        return Integer.toString(i6, 36);
    }

    public static int y(byte[] bArr, int i6, int i7, int i8) {
        while (i6 < i7) {
            i8 = f10576q[i8 ^ (bArr[i6] & 255)];
            i6++;
        }
        return i8;
    }

    public static boolean y0(Context context) {
        return f10560a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean z0(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c6 = 4;
                    break;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c6 = 5;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c6 = 6;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return f10560a >= 34;
            case 1:
            case 2:
                return f10560a >= 26;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
