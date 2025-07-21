package Z0;

import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f7286a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7287b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7288a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7289b;

        public a(int i6, int i7) {
            this.f7288a = i6;
            this.f7289b = i7;
        }

        public int a() {
            int i6 = this.f7289b;
            if (i6 == 2) {
                return 10;
            }
            if (i6 == 5) {
                return 11;
            }
            if (i6 == 29) {
                return 12;
            }
            if (i6 == 42) {
                return 16;
            }
            if (i6 != 22) {
                return i6 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        a i6;
        int a6;
        if (str == null) {
            return false;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c6 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c6 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c6 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c6 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c6 = '\n';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (i6 = i(str2)) == null || (a6 = i6.a()) == 0 || a6 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC1117K.f1(str)) {
            String g6 = g(str2);
            if (g6 != null && o(g6)) {
                return g6;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str != null && str2 != null) {
            String[] f12 = AbstractC1117K.f1(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : f12) {
                if (str2.equals(g(str3))) {
                    if (sb.length() > 0) {
                        sb.append(com.amazon.a.a.o.b.f.f11248a);
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String e(String str) {
        ArrayList arrayList = f7286a;
        if (arrayList.size() <= 0) {
            return null;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public static int f(String str, String str2) {
        a i6;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c6 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c6 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c6 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c6 = 11;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (i6 = i(str2)) == null) {
                    return 0;
                }
                return i6.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        a i6;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e6 = y6.c.e(str.trim());
        if (e6.startsWith("avc1") || e6.startsWith("avc3")) {
            return "video/avc";
        }
        if (e6.startsWith("hev1") || e6.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e6.startsWith("dvav") || e6.startsWith("dva1") || e6.startsWith("dvhe") || e6.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e6.startsWith("av01")) {
            return "video/av01";
        }
        if (e6.startsWith("vp9") || e6.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e6.startsWith("vp8") || e6.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e6.startsWith("mp4a")) {
            return e6.startsWith("mha1") ? "audio/mha1" : e6.startsWith("mhm1") ? "audio/mhm1" : (e6.startsWith("ac-3") || e6.startsWith("dac3")) ? "audio/ac3" : (e6.startsWith("ec-3") || e6.startsWith("dec3")) ? "audio/eac3" : e6.startsWith("ec+3") ? "audio/eac3-joc" : (e6.startsWith("ac-4") || e6.startsWith("dac4")) ? "audio/ac4" : e6.startsWith("dtsc") ? "audio/vnd.dts" : e6.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e6.startsWith("dtsh") || e6.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e6.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e6.startsWith("opus") ? "audio/opus" : e6.startsWith("vorbis") ? "audio/vorbis" : e6.startsWith("flac") ? "audio/flac" : e6.startsWith("stpp") ? "application/ttml+xml" : e6.startsWith("wvtt") ? "text/vtt" : e6.contains("cea708") ? "application/cea-708" : (e6.contains("eia608") || e6.contains("cea608")) ? "application/cea-608" : e(e6);
        }
        if (e6.startsWith("mp4a.") && (i6 = i(e6)) != null) {
            str2 = h(i6.f7288a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i6) {
        if (i6 == 32) {
            return "video/mp4v-es";
        }
        if (i6 == 33) {
            return "video/avc";
        }
        if (i6 == 35) {
            return "video/hevc";
        }
        if (i6 == 64) {
            return "audio/mp4a-latm";
        }
        if (i6 == 163) {
            return "video/wvc1";
        }
        if (i6 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i6 == 221) {
            return "audio/vorbis";
        }
        if (i6 == 165) {
            return "audio/ac3";
        }
        if (i6 == 166) {
            return "audio/eac3";
        }
        switch (i6) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i6) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static a i(String str) {
        Matcher matcher = f7287b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) AbstractC1119a.e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if (p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    public static int l(String str) {
        ArrayList arrayList = f7286a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC1117K.f1(str)) {
            String g6 = g(str2);
            if (g6 != null && s(g6)) {
                return g6;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(j(str));
    }

    public static String t(String str) {
        if (str == null) {
            return null;
        }
        String e6 = y6.c.e(str);
        e6.getClass();
        char c6 = 65535;
        switch (e6.hashCode()) {
            case -1007807498:
                if (e6.equals("audio/x-flac")) {
                    c6 = 0;
                    break;
                }
                break;
            case -979095690:
                if (e6.equals("application/x-mpegurl")) {
                    c6 = 1;
                    break;
                }
                break;
            case -586683234:
                if (e6.equals("audio/x-wav")) {
                    c6 = 2;
                    break;
                }
                break;
            case -432836268:
                if (e6.equals("audio/mpeg-l1")) {
                    c6 = 3;
                    break;
                }
                break;
            case -432836267:
                if (e6.equals("audio/mpeg-l2")) {
                    c6 = 4;
                    break;
                }
                break;
            case 187090231:
                if (e6.equals("audio/mp3")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return e6;
        }
    }
}
