package s1;

import c1.AbstractC1119a;
import java.util.Map;
import z6.y;

/* renamed from: s1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2047g {

    /* renamed from: a, reason: collision with root package name */
    public final int f18805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18806b;

    /* renamed from: c, reason: collision with root package name */
    public final Z0.q f18807c;

    /* renamed from: d, reason: collision with root package name */
    public final y f18808d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18809e;

    public C2047g(Z0.q qVar, int i6, int i7, Map map, String str) {
        this.f18805a = i6;
        this.f18806b = i7;
        this.f18807c = qVar;
        this.f18808d = y.c(map);
        this.f18809e = str;
    }

    public static String a(String str) {
        String f6 = y6.c.f(str);
        f6.getClass();
        char c6 = 65535;
        switch (f6.hashCode()) {
            case -1922091719:
                if (f6.equals("MPEG4-GENERIC")) {
                    c6 = 0;
                    break;
                }
                break;
            case 2412:
                if (f6.equals("L8")) {
                    c6 = 1;
                    break;
                }
                break;
            case 64593:
                if (f6.equals("AC3")) {
                    c6 = 2;
                    break;
                }
                break;
            case 64934:
                if (f6.equals("AMR")) {
                    c6 = 3;
                    break;
                }
                break;
            case 74609:
                if (f6.equals("L16")) {
                    c6 = 4;
                    break;
                }
                break;
            case 85182:
                if (f6.equals("VP8")) {
                    c6 = 5;
                    break;
                }
                break;
            case 85183:
                if (f6.equals("VP9")) {
                    c6 = 6;
                    break;
                }
                break;
            case 2194728:
                if (f6.equals("H264")) {
                    c6 = 7;
                    break;
                }
                break;
            case 2194729:
                if (f6.equals("H265")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 2433087:
                if (f6.equals("OPUS")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 2450119:
                if (f6.equals("PCMA")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 2450139:
                if (f6.equals("PCMU")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1061166827:
                if (f6.equals("MP4A-LATM")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 1934494802:
                if (f6.equals("AMR-WB")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 1959269366:
                if (f6.equals("MP4V-ES")) {
                    c6 = 14;
                    break;
                }
                break;
            case 2137188397:
                if (f6.equals("H263-1998")) {
                    c6 = 15;
                    break;
                }
                break;
            case 2137209252:
                if (f6.equals("H263-2000")) {
                    c6 = 16;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case '\f':
                return "audio/mp4a-latm";
            case 1:
            case 4:
                return "audio/raw";
            case 2:
                return "audio/ac3";
            case 3:
                return "audio/3gpp";
            case 5:
                return "video/x-vnd.on2.vp8";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/avc";
            case '\b':
                return "video/hevc";
            case '\t':
                return "audio/opus";
            case '\n':
                return "audio/g711-alaw";
            case 11:
                return "audio/g711-mlaw";
            case '\r':
                return "audio/amr-wb";
            case 14:
                return "video/mp4v-es";
            case 15:
            case 16:
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        AbstractC1119a.a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    public static boolean c(C2041a c2041a) {
        String f6 = y6.c.f(c2041a.f18749j.f18760b);
        f6.getClass();
        char c6 = 65535;
        switch (f6.hashCode()) {
            case -1922091719:
                if (f6.equals("MPEG4-GENERIC")) {
                    c6 = 0;
                    break;
                }
                break;
            case 2412:
                if (f6.equals("L8")) {
                    c6 = 1;
                    break;
                }
                break;
            case 64593:
                if (f6.equals("AC3")) {
                    c6 = 2;
                    break;
                }
                break;
            case 64934:
                if (f6.equals("AMR")) {
                    c6 = 3;
                    break;
                }
                break;
            case 74609:
                if (f6.equals("L16")) {
                    c6 = 4;
                    break;
                }
                break;
            case 85182:
                if (f6.equals("VP8")) {
                    c6 = 5;
                    break;
                }
                break;
            case 85183:
                if (f6.equals("VP9")) {
                    c6 = 6;
                    break;
                }
                break;
            case 2194728:
                if (f6.equals("H264")) {
                    c6 = 7;
                    break;
                }
                break;
            case 2194729:
                if (f6.equals("H265")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 2433087:
                if (f6.equals("OPUS")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 2450119:
                if (f6.equals("PCMA")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 2450139:
                if (f6.equals("PCMU")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1061166827:
                if (f6.equals("MP4A-LATM")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 1934494802:
                if (f6.equals("AMR-WB")) {
                    c6 = '\r';
                    break;
                }
                break;
            case 1959269366:
                if (f6.equals("MP4V-ES")) {
                    c6 = 14;
                    break;
                }
                break;
            case 2137188397:
                if (f6.equals("H263-1998")) {
                    c6 = 15;
                    break;
                }
                break;
            case 2137209252:
                if (f6.equals("H263-2000")) {
                    c6 = 16;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2047g.class == obj.getClass()) {
            C2047g c2047g = (C2047g) obj;
            if (this.f18805a == c2047g.f18805a && this.f18806b == c2047g.f18806b && this.f18807c.equals(c2047g.f18807c) && this.f18808d.equals(c2047g.f18808d) && this.f18809e.equals(c2047g.f18809e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.f18805a) * 31) + this.f18806b) * 31) + this.f18807c.hashCode()) * 31) + this.f18808d.hashCode()) * 31) + this.f18809e.hashCode();
    }
}
