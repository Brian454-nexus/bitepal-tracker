package t1;

import c1.AbstractC1119a;
import s1.C2047g;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2071a {
    public k a(C2047g c2047g) {
        String str = (String) AbstractC1119a.e(c2047g.f18807c.f6990n);
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
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
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c6 = 6;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c6 = 7;
                    break;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
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
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c6 = '\r';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return new e(c2047g);
            case 1:
                return new g(c2047g);
            case 2:
            case '\b':
                return new C2074d(c2047g);
            case 3:
                return c2047g.f18809e.equals("MP4A-LATM") ? new h(c2047g) : new C2072b(c2047g);
            case 4:
                return new C2073c(c2047g);
            case 5:
            case '\f':
            case '\r':
                return new l(c2047g);
            case 6:
                return new i(c2047g);
            case 7:
                return new f(c2047g);
            case '\t':
                return new j(c2047g);
            case '\n':
                return new n(c2047g);
            case 11:
                return new o(c2047g);
            default:
                return null;
        }
    }
}
