package p1;

import Z0.C0836h;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import p1.G;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f18122a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18123b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f18124c = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f18125a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18126b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f18127c;

        public b(String str, boolean z6, boolean z7) {
            this.f18125a = str;
            this.f18126b = z6;
            this.f18127c = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f18125a, bVar.f18125a) && this.f18126b == bVar.f18126b && this.f18127c == bVar.f18127c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f18125a.hashCode() + 31) * 31) + (this.f18126b ? 1231 : 1237)) * 31) + (this.f18127c ? 1231 : 1237);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        MediaCodecInfo a(int i6);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements d {
        public e() {
        }

        @Override // p1.G.d
        public MediaCodecInfo a(int i6) {
            return MediaCodecList.getCodecInfoAt(i6);
        }

        @Override // p1.G.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p1.G.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p1.G.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p1.G.d
        public boolean e() {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f18128a;

        /* renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f18129b;

        public f(boolean z6, boolean z7) {
            this.f18128a = (z6 || z7) ? 1 : 0;
        }

        @Override // p1.G.d
        public MediaCodecInfo a(int i6) {
            f();
            return this.f18129b[i6];
        }

        @Override // p1.G.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p1.G.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p1.G.d
        public int d() {
            f();
            return this.f18129b.length;
        }

        @Override // p1.G.d
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f18129b == null) {
                this.f18129b = new MediaCodecList(this.f18128a).getCodecInfos();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface g {
        int a(Object obj);
    }

    public static Pair A(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int P5 = P(parseInt);
            if (P5 == -1) {
                AbstractC1133o.h("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int O5 = O(parseInt2);
            if (O5 != -1) {
                return new Pair(Integer.valueOf(P5), Integer.valueOf(O5));
            }
            AbstractC1133o.h("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    public static Integer B(String str) {
        if (str == null) {
            return null;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c6 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c6 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c6 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c6 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c6 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c6 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c6 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c6 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c6 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c6 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c6 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c6 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c6 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c6 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c6 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c6 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c6 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c6 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c6 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c6 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c6 = 25;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return Integer.valueOf(ConstantsKt.DEFAULT_BUFFER_SIZE);
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return Integer.valueOf(ConstantsKt.DEFAULT_BLOCK_SIZE);
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return AbstractC1117K.f10560a >= 29 && D(mediaCodecInfo);
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z6 && str.endsWith(".secure"))) {
            return false;
        }
        int i6 = AbstractC1117K.f10560a;
        if (i6 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i6 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC1117K.f10562c))) {
            String str3 = AbstractC1117K.f10561b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i6 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC1117K.f10562c)) {
            String str4 = AbstractC1117K.f10561b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i6 == 19 && AbstractC1117K.f10561b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i6 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return AbstractC1117K.f10560a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    public static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC1117K.f10560a >= 29) {
            return I(mediaCodecInfo);
        }
        if (Z0.y.o(str)) {
            return true;
        }
        String e6 = y6.c.e(mediaCodecInfo.getName());
        if (e6.startsWith("arc.")) {
            return false;
        }
        return e6.startsWith("omx.google.") || e6.startsWith("omx.ffmpeg.") || (e6.startsWith("omx.sec.") && e6.contains(".sw.")) || e6.equals("omx.qcom.video.decoder.hevcswvdec") || e6.startsWith("c2.android.") || e6.startsWith("c2.google.") || !(e6.startsWith("omx.") || e6.startsWith("c2."));
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    public static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC1117K.f10560a >= 29) {
            return K(mediaCodecInfo);
        }
        String e6 = y6.c.e(mediaCodecInfo.getName());
        return (e6.startsWith("omx.google.") || e6.startsWith("c2.android.") || e6.startsWith("c2.google.")) ? false : true;
    }

    public static boolean K(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    public static int L() {
        if (f18124c == -1) {
            int i6 = 0;
            n s6 = s("video/avc", false, false);
            if (s6 != null) {
                MediaCodecInfo.CodecProfileLevel[] g6 = s6.g();
                int length = g6.length;
                int i7 = 0;
                while (i6 < length) {
                    i7 = Math.max(h(g6[i6].level), i7);
                    i6++;
                }
                i6 = Math.max(i7, AbstractC1117K.f10560a >= 21 ? 345600 : 172800);
            }
            f18124c = i6;
        }
        return f18124c;
    }

    public static int M(int i6) {
        int i7 = 17;
        if (i6 != 17) {
            i7 = 20;
            if (i6 != 20) {
                i7 = 23;
                if (i6 != 23) {
                    i7 = 29;
                    if (i6 != 29) {
                        i7 = 39;
                        if (i6 != 39) {
                            i7 = 42;
                            if (i6 != 42) {
                                switch (i6) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i7;
    }

    public static void N(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: p1.F
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return G.b(G.g.this, obj, obj2);
            }
        });
    }

    public static int O(int i6) {
        if (i6 == 10) {
            return 1;
        }
        if (i6 == 11) {
            return 2;
        }
        if (i6 == 20) {
            return 4;
        }
        if (i6 == 21) {
            return 8;
        }
        if (i6 == 30) {
            return 16;
        }
        if (i6 == 31) {
            return 32;
        }
        if (i6 == 40) {
            return 64;
        }
        if (i6 == 41) {
            return 128;
        }
        if (i6 == 50) {
            return 256;
        }
        if (i6 == 51) {
            return ConstantsKt.MINIMUM_BLOCK_SIZE;
        }
        switch (i6) {
            case 60:
                return 2048;
            case 61:
                return ConstantsKt.DEFAULT_BLOCK_SIZE;
            case 62:
                return ConstantsKt.DEFAULT_BUFFER_SIZE;
            default:
                return -1;
        }
    }

    public static int P(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 != 2) {
            return i6 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static /* synthetic */ int a(n nVar) {
        return nVar.f18194a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int b(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static /* synthetic */ int c(Z0.q qVar, n nVar) {
        return nVar.l(qVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(n nVar) {
        String str = nVar.f18194a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC1117K.f10560a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (AbstractC1117K.f10560a < 26 && AbstractC1117K.f10561b.equals("R9") && list.size() == 1 && ((n) list.get(0)).f18194a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n.C("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            N(list, new g() { // from class: p1.C
                @Override // p1.G.g
                public final int a(Object obj) {
                    return G.d((n) obj);
                }
            });
        }
        int i6 = AbstractC1117K.f10560a;
        if (i6 < 21 && list.size() > 1) {
            String str2 = ((n) list.get(0)).f18194a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                N(list, new g() { // from class: p1.D
                    @Override // p1.G.g
                    public final int a(Object obj) {
                        return G.a((n) obj);
                    }
                });
            }
        }
        if (i6 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) list.get(0)).f18194a)) {
            return;
        }
        list.add((n) list.remove(0));
    }

    public static int f(int i6) {
        switch (i6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return ConstantsKt.MINIMUM_BLOCK_SIZE;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return ConstantsKt.DEFAULT_BLOCK_SIZE;
            case 13:
                return ConstantsKt.DEFAULT_BUFFER_SIZE;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int g(int i6) {
        switch (i6) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i6) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i6) {
                            case 30:
                                return 256;
                            case 31:
                                return ConstantsKt.MINIMUM_BLOCK_SIZE;
                            case 32:
                                return 1024;
                            default:
                                switch (i6) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return ConstantsKt.DEFAULT_BLOCK_SIZE;
                                    case 42:
                                        return ConstantsKt.DEFAULT_BUFFER_SIZE;
                                    default:
                                        switch (i6) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i6) {
        if (i6 == 1 || i6 == 2) {
            return 25344;
        }
        switch (i6) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                return 2097152;
            case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int i(int i6) {
        if (i6 == 66) {
            return 1;
        }
        if (i6 == 77) {
            return 2;
        }
        if (i6 == 88) {
            return 4;
        }
        if (i6 == 100) {
            return 8;
        }
        if (i6 == 110) {
            return 16;
        }
        if (i6 != 122) {
            return i6 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c6 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c6 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c6 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c6 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c6 = '\f';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return Integer.valueOf(ConstantsKt.DEFAULT_BLOCK_SIZE);
            default:
                return null;
        }
    }

    public static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c6 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c6 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c6 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c6 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c6 = '\n';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
            case '\n':
                return 1024;
            default:
                return null;
        }
    }

    public static Pair l(String str, String[] strArr) {
        int M5;
        if (strArr.length != 3) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(Z0.y.h(Integer.parseInt(strArr[1], 16))) && (M5 = M(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(M5), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(Z0.q qVar) {
        Pair r6;
        if ("audio/eac3-joc".equals(qVar.f6990n)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(qVar.f6990n) || (r6 = r(qVar)) == null) {
            return null;
        }
        int intValue = ((Integer) r6.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static List n(x xVar, Z0.q qVar, boolean z6, boolean z7) {
        String m6 = m(qVar);
        return m6 == null ? z6.w.w() : xVar.a(m6, z6, z7);
    }

    public static Pair o(String str, String[] strArr, C0836h c0836h) {
        int i6;
        if (strArr.length < 4) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                AbstractC1133o.h("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                AbstractC1133o.h("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i7 = parseInt3 != 8 ? (c0836h == null || !(c0836h.f6895d != null || (i6 = c0836h.f6894c) == 7 || i6 == 6)) ? 2 : ConstantsKt.DEFAULT_BLOCK_SIZE : 1;
            int f6 = f(parseInt2);
            if (f6 != -1) {
                return new Pair(Integer.valueOf(i7), Integer.valueOf(f6));
            }
            AbstractC1133o.h("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    public static Pair p(String str, String[] strArr) {
        int parseInt;
        int i6;
        if (strArr.length < 2) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i6 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i6 = parseInt2;
            }
            int i7 = i(i6);
            if (i7 == -1) {
                AbstractC1133o.h("MediaCodecUtil", "Unknown AVC profile: " + i6);
                return null;
            }
            int g6 = g(parseInt);
            if (g6 != -1) {
                return new Pair(Integer.valueOf(i7), Integer.valueOf(g6));
            }
            AbstractC1133o.h("MediaCodecUtil", "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair r(Z0.q r6) {
        /*
            r0 = 0
            java.lang.String r1 = r6.f6986j
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r6.f6990n
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1e
            java.lang.String r6 = r6.f6986j
            android.util.Pair r6 = y(r6, r1)
            return r6
        L1e:
            r3 = r1[r0]
            r3.getClass()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r0 = r4
            goto L78
        L2d:
            java.lang.String r0 = "vp09"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L2b
        L36:
            r0 = 6
            goto L78
        L38:
            java.lang.String r0 = "mp4a"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L2b
        L41:
            r0 = 5
            goto L78
        L43:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
            goto L2b
        L4c:
            r0 = 4
            goto L78
        L4e:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L57
            goto L2b
        L57:
            r0 = 3
            goto L78
        L59:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L62
            goto L2b
        L62:
            r0 = 2
            goto L78
        L64:
            java.lang.String r0 = "avc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6d
            goto L2b
        L6d:
            r0 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r2
        L7c:
            java.lang.String r6 = r6.f6986j
            android.util.Pair r6 = A(r6, r1)
            return r6
        L83:
            java.lang.String r6 = r6.f6986j
            android.util.Pair r6 = l(r6, r1)
            return r6
        L8a:
            java.lang.String r0 = r6.f6986j
            Z0.h r6 = r6.f6965A
            android.util.Pair r6 = z(r0, r1, r6)
            return r6
        L93:
            java.lang.String r6 = r6.f6986j
            android.util.Pair r6 = p(r6, r1)
            return r6
        L9a:
            java.lang.String r0 = r6.f6986j
            Z0.h r6 = r6.f6965A
            android.util.Pair r6 = o(r0, r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.G.r(Z0.q):android.util.Pair");
    }

    public static n s(String str, boolean z6, boolean z7) {
        List t6 = t(str, z6, z7);
        if (t6.isEmpty()) {
            return null;
        }
        return (n) t6.get(0);
    }

    public static synchronized List t(String str, boolean z6, boolean z7) {
        synchronized (G.class) {
            try {
                b bVar = new b(str, z6, z7);
                HashMap hashMap = f18123b;
                List list = (List) hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i6 = AbstractC1117K.f10560a;
                ArrayList u6 = u(bVar, i6 >= 21 ? new f(z6, z7) : new e());
                if (z6 && u6.isEmpty() && 21 <= i6 && i6 <= 23) {
                    u6 = u(bVar, new e());
                    if (!u6.isEmpty()) {
                        AbstractC1133o.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) u6.get(0)).f18194a);
                    }
                }
                e(str, u6);
                z6.w s6 = z6.w.s(u6);
                hashMap.put(bVar, s6);
                return s6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1.f18126b != r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r17 = r11;
        r18 = r16;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        r5.add(p1.n.C(r9, r7, r8, r9, r10, r11, r18, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009b, code lost:
    
        if (r1.f18126b == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0119, B:10:0x002b, B:13:0x0036, B:48:0x00f2, B:51:0x00fa, B:53:0x0100, B:56:0x0121, B:57:0x0142), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(p1.G.b r19, p1.G.d r20) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.G.u(p1.G$b, p1.G$d):java.util.ArrayList");
    }

    public static List v(x xVar, Z0.q qVar, boolean z6, boolean z7) {
        List a6 = xVar.a(qVar.f6990n, z6, z7);
        return z6.w.o().j(a6).j(n(xVar, qVar, z6, z7)).k();
    }

    public static List w(List list, final Z0.q qVar) {
        ArrayList arrayList = new ArrayList(list);
        N(arrayList, new g() { // from class: p1.E
            @Override // p1.G.g
            public final int a(Object obj) {
                return G.c(Z0.q.this, (n) obj);
            }
        });
        return arrayList;
    }

    public static n x() {
        return s("audio/raw", false, false);
    }

    public static Pair y(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f18122a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k6 = k(group);
        if (k6 == null) {
            AbstractC1133o.h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j6 = j(str2);
        if (j6 != null) {
            return new Pair(k6, j6);
        }
        AbstractC1133o.h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    public static Pair z(String str, String[] strArr, C0836h c0836h) {
        if (strArr.length < 4) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i6 = 1;
        Matcher matcher = f18122a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1133o.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                AbstractC1133o.h("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
            i6 = (c0836h == null || c0836h.f6894c != 6) ? 2 : ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        String str2 = strArr[3];
        Integer B6 = B(str2);
        if (B6 != null) {
            return new Pair(Integer.valueOf(i6), B6);
        }
        AbstractC1133o.h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
