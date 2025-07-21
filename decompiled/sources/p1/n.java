package p1;

import Z0.C0836h;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import g1.C1332g;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f18194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18196c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f18197d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18198e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18199f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18202i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18203j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18204k;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f18194a = (String) AbstractC1119a.e(str);
        this.f18195b = str2;
        this.f18196c = str3;
        this.f18197d = codecCapabilities;
        this.f18201h = z6;
        this.f18202i = z7;
        this.f18203j = z8;
        this.f18198e = z9;
        this.f18199f = z10;
        this.f18200g = z11;
        this.f18204k = Z0.y.s(str2);
    }

    public static boolean A(String str, int i6) {
        if (!"video/hevc".equals(str) || 2 != i6) {
            return false;
        }
        String str2 = AbstractC1117K.f10561b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(AbstractC1117K.f10561b)) ? false : true;
    }

    public static n C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z12;
        boolean z13;
        boolean z14;
        String str6;
        boolean z15 = (z9 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true;
        boolean z16 = codecCapabilities != null && s(codecCapabilities);
        if (z10 || (codecCapabilities != null && q(codecCapabilities))) {
            z11 = true;
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z12 = z6;
            z13 = z7;
            z14 = z8;
            str6 = str2;
        } else {
            z11 = false;
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z12 = z6;
            z13 = z7;
            z14 = z8;
            str4 = str;
        }
        return new n(str4, str6, str5, codecCapabilities2, z12, z13, z14, z15, z16, z11);
    }

    public static int a(String str, String str2, int i6) {
        if (i6 > 1 || ((AbstractC1117K.f10560a >= 26 && i6 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i6;
        }
        int i7 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC1133o.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i6 + " to " + i7 + "]");
        return i7;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC1117K.k(i6, widthAlignment) * widthAlignment, AbstractC1117K.k(i7, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i7, double d6) {
        Point c6 = c(videoCapabilities, i6, i7);
        int i8 = c6.x;
        int i9 = c6.y;
        return (d6 == -1.0d || d6 < 1.0d) ? videoCapabilities.isSizeSupported(i8, i9) : videoCapabilities.areSizeAndRateSupported(i8, i9, Math.floor(d6));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i6 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? ConstantsKt.MINIMUM_BLOCK_SIZE : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i6;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1117K.f10560a >= 21 && r(codecCapabilities);
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1117K.f10560a >= 21 && t(codecCapabilities);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean y(String str) {
        return AbstractC1117K.f10563d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean z(String str) {
        if (AbstractC1117K.f10560a > 22) {
            return false;
        }
        String str2 = AbstractC1117K.f10563d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    public Point b(int i6, int i7) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18197d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i6, i7);
    }

    public C1332g e(Z0.q qVar, Z0.q qVar2) {
        Z0.q qVar3;
        Z0.q qVar4;
        int i6 = !AbstractC1117K.c(qVar.f6990n, qVar2.f6990n) ? 8 : 0;
        if (this.f18204k) {
            if (qVar.f6999w != qVar2.f6999w) {
                i6 |= 1024;
            }
            if (!this.f18198e && (qVar.f6996t != qVar2.f6996t || qVar.f6997u != qVar2.f6997u)) {
                i6 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
            }
            if ((!C0836h.h(qVar.f6965A) || !C0836h.h(qVar2.f6965A)) && !AbstractC1117K.c(qVar.f6965A, qVar2.f6965A)) {
                i6 |= 2048;
            }
            if (y(this.f18194a) && !qVar.e(qVar2)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new C1332g(this.f18194a, qVar, qVar2, qVar.e(qVar2) ? 3 : 2, 0);
            }
            qVar3 = qVar;
            qVar4 = qVar2;
        } else {
            qVar3 = qVar;
            qVar4 = qVar2;
            if (qVar3.f6966B != qVar4.f6966B) {
                i6 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
            }
            if (qVar3.f6967C != qVar4.f6967C) {
                i6 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if (qVar3.f6968D != qVar4.f6968D) {
                i6 |= 16384;
            }
            if (i6 == 0 && "audio/mp4a-latm".equals(this.f18195b)) {
                Pair r6 = G.r(qVar3);
                Pair r7 = G.r(qVar4);
                if (r6 != null && r7 != null) {
                    int intValue = ((Integer) r6.first).intValue();
                    int intValue2 = ((Integer) r7.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C1332g(this.f18194a, qVar3, qVar4, 3, 0);
                    }
                }
            }
            if (!qVar3.e(qVar4)) {
                i6 |= 32;
            }
            if (x(this.f18195b)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new C1332g(this.f18194a, qVar3, qVar4, 1, 0);
            }
        }
        return new C1332g(this.f18194a, qVar3, qVar4, 0, i6);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18197d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i6) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18197d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f18194a, this.f18195b, audioCapabilities.getMaxInputChannelCount()) >= i6) {
            return true;
        }
        w("channelCount.support, " + i6);
        return false;
    }

    public boolean j(int i6) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18197d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i6)) {
            return true;
        }
        w("sampleRate.support, " + i6);
        return false;
    }

    public final boolean k(Z0.q qVar, boolean z6) {
        Pair r6 = G.r(qVar);
        if (r6 == null) {
            return true;
        }
        int intValue = ((Integer) r6.first).intValue();
        int intValue2 = ((Integer) r6.second).intValue();
        if ("video/dolby-vision".equals(qVar.f6990n)) {
            if (!"video/avc".equals(this.f18195b)) {
                intValue = "video/hevc".equals(this.f18195b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f18204k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g6 = g();
        if (AbstractC1117K.f10560a <= 23 && "video/x-vnd.on2.vp9".equals(this.f18195b) && g6.length == 0) {
            g6 = f(this.f18197d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g6) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z6) && !A(this.f18195b, intValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + qVar.f6986j + ", " + this.f18196c);
        return false;
    }

    public boolean l(Z0.q qVar) {
        return o(qVar) && k(qVar, false);
    }

    public boolean m(Z0.q qVar) {
        int i6;
        int i7;
        int i8;
        if (!o(qVar) || !k(qVar, true)) {
            return false;
        }
        if (!this.f18204k) {
            return AbstractC1117K.f10560a < 21 || (((i6 = qVar.f6967C) == -1 || j(i6)) && ((i7 = qVar.f6966B) == -1 || i(i7)));
        }
        int i9 = qVar.f6996t;
        if (i9 <= 0 || (i8 = qVar.f6997u) <= 0) {
            return true;
        }
        if (AbstractC1117K.f10560a >= 21) {
            return u(i9, i8, qVar.f6998v);
        }
        boolean z6 = i9 * i8 <= G.L();
        if (!z6) {
            w("legacyFrameSize, " + qVar.f6996t + "x" + qVar.f6997u);
        }
        return z6;
    }

    public boolean n() {
        if (AbstractC1117K.f10560a >= 29 && "video/x-vnd.on2.vp9".equals(this.f18195b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(Z0.q qVar) {
        return this.f18195b.equals(qVar.f6990n) || this.f18195b.equals(G.m(qVar));
    }

    public boolean p(Z0.q qVar) {
        if (this.f18204k) {
            return this.f18198e;
        }
        Pair r6 = G.r(qVar);
        return r6 != null && ((Integer) r6.first).intValue() == 42;
    }

    public String toString() {
        return this.f18194a;
    }

    public boolean u(int i6, int i7, double d6) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18197d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC1117K.f10560a >= 29) {
            int c6 = t.c(videoCapabilities, i6, i7, d6);
            if (c6 == 2) {
                return true;
            }
            if (c6 == 1) {
                w("sizeAndRate.cover, " + i6 + "x" + i7 + "@" + d6);
                return false;
            }
        }
        if (!d(videoCapabilities, i6, i7, d6)) {
            if (i6 >= i7 || !B(this.f18194a) || !d(videoCapabilities, i7, i6, d6)) {
                w("sizeAndRate.support, " + i6 + "x" + i7 + "@" + d6);
                return false;
            }
            v("sizeAndRate.rotated, " + i6 + "x" + i7 + "@" + d6);
        }
        return true;
    }

    public final void v(String str) {
        AbstractC1133o.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f18194a + ", " + this.f18195b + "] [" + AbstractC1117K.f10564e + "]");
    }

    public final void w(String str) {
        AbstractC1133o.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f18194a + ", " + this.f18195b + "] [" + AbstractC1117K.f10564e + "]");
    }
}
