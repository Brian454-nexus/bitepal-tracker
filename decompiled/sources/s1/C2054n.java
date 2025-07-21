package s1;

import E1.AbstractC0299a;
import Z0.C0836h;
import Z0.q;
import Z0.z;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1122d;
import c1.C1143y;
import d1.d;
import s1.C2041a;
import z6.y;

/* renamed from: s1.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2054n {

    /* renamed from: a, reason: collision with root package name */
    public final C2047g f18818a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f18819b;

    public C2054n(androidx.media3.exoplayer.rtsp.e eVar, C2041a c2041a, Uri uri) {
        AbstractC1119a.b(c2041a.f18748i.containsKey("control"), "missing attribute control");
        this.f18818a = b(c2041a);
        this.f18819b = a(eVar, uri, (String) AbstractC1117K.i((String) c2041a.f18748i.get("control")));
    }

    public static Uri a(androidx.media3.exoplayer.rtsp.e eVar, Uri uri, String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        if (!TextUtils.isEmpty(eVar.d("Content-Base"))) {
            uri = Uri.parse(eVar.d("Content-Base"));
        } else if (!TextUtils.isEmpty(eVar.d("Content-Location"))) {
            uri = Uri.parse(eVar.d("Content-Location"));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C2047g b(C2041a c2041a) {
        int i6;
        char c6;
        q.b bVar = new q.b();
        int i7 = c2041a.f18744e;
        if (i7 > 0) {
            bVar.M(i7);
        }
        C2041a.c cVar = c2041a.f18749j;
        int i8 = cVar.f18759a;
        String str = cVar.f18760b;
        String a6 = C2047g.a(str);
        bVar.o0(a6);
        int i9 = c2041a.f18749j.f18761c;
        if ("audio".equals(c2041a.f18740a)) {
            i6 = d(c2041a.f18749j.f18762d, a6);
            bVar.p0(i9).N(i6);
        } else {
            i6 = -1;
        }
        y a7 = c2041a.a();
        switch (a6.hashCode()) {
            case -1664118616:
                if (a6.equals("video/3gpp")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case -1662541442:
                if (a6.equals("video/hevc")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -1606874997:
                if (a6.equals("audio/amr-wb")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -53558318:
                if (a6.equals("audio/mp4a-latm")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 187078296:
                if (a6.equals("audio/ac3")) {
                    c6 = 11;
                    break;
                }
                c6 = 65535;
                break;
            case 187094639:
                if (a6.equals("audio/raw")) {
                    c6 = '\n';
                    break;
                }
                c6 = 65535;
                break;
            case 1187890754:
                if (a6.equals("video/mp4v-es")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case 1331836730:
                if (a6.equals("video/avc")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case 1503095341:
                if (a6.equals("audio/3gpp")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 1504891608:
                if (a6.equals("audio/opus")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 1599127256:
                if (a6.equals("video/x-vnd.on2.vp8")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case 1599127257:
                if (a6.equals("video/x-vnd.on2.vp9")) {
                    c6 = '\t';
                    break;
                }
                c6 = 65535;
                break;
            case 1903231877:
                if (a6.equals("audio/g711-alaw")) {
                    c6 = '\f';
                    break;
                }
                c6 = 65535;
                break;
            case 1903589369:
                if (a6.equals("audio/g711-mlaw")) {
                    c6 = '\r';
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        switch (c6) {
            case 0:
                AbstractC1119a.a(i6 != -1);
                AbstractC1119a.b(!a7.isEmpty(), "missing attribute fmtp");
                if (str.equals("MP4A-LATM")) {
                    AbstractC1119a.b(a7.containsKey("cpresent") && ((String) a7.get("cpresent")).equals("0"), "Only supports cpresent=0 in AAC audio.");
                    String str2 = (String) a7.get("config");
                    AbstractC1119a.f(str2, "AAC audio stream must include config fmtp parameter");
                    AbstractC1119a.b(str2.length() % 2 == 0, "Malformat MPEG4 config: " + str2);
                    AbstractC0299a.b e6 = e(str2);
                    bVar.p0(e6.f961a).N(e6.f962b).O(e6.f963c);
                }
                f(bVar, a7, str, i6, i9);
                break;
            case 1:
            case 2:
                AbstractC1119a.b(i6 == 1, "Multi channel AMR is not currently supported.");
                AbstractC1119a.b(!a7.isEmpty(), "fmtp parameters must include octet-align.");
                AbstractC1119a.b(a7.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                AbstractC1119a.b(!a7.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                break;
            case 3:
                AbstractC1119a.a(i6 != -1);
                AbstractC1119a.b(i9 == 48000, "Invalid OPUS clock rate.");
                break;
            case 4:
                AbstractC1119a.a(!a7.isEmpty());
                i(bVar, a7);
                break;
            case 5:
                bVar.v0(352).Y(288);
                break;
            case 6:
                AbstractC1119a.b(!a7.isEmpty(), "missing attribute fmtp");
                g(bVar, a7);
                break;
            case 7:
                AbstractC1119a.b(!a7.isEmpty(), "missing attribute fmtp");
                h(bVar, a7);
                break;
            case '\b':
                bVar.v0(320).Y(240);
                break;
            case '\t':
                bVar.v0(320).Y(240);
                break;
            case '\n':
                bVar.i0(C2047g.b(str));
                break;
        }
        AbstractC1119a.a(i9 > 0);
        return new C2047g(bVar.K(), i8, i9, a7, str);
    }

    public static byte[] c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = d1.d.f13379a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    public static int d(int i6, String str) {
        return i6 != -1 ? i6 : str.equals("audio/ac3") ? 6 : 1;
    }

    public static AbstractC0299a.b e(String str) {
        C1143y c1143y = new C1143y(AbstractC1117K.Q(str));
        AbstractC1119a.b(c1143y.h(1) == 0, "Only supports audio mux version 0.");
        AbstractC1119a.b(c1143y.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        c1143y.r(6);
        AbstractC1119a.b(c1143y.h(4) == 0, "Only supports one program.");
        AbstractC1119a.b(c1143y.h(3) == 0, "Only supports one numLayer.");
        try {
            return AbstractC0299a.e(c1143y, false);
        } catch (z e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static void f(q.b bVar, y yVar, String str, int i6, int i7) {
        String str2 = (String) yVar.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        AbstractC1119a.b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.O("mp4a.40." + str2);
        bVar.b0(z6.w.y(AbstractC0299a.a(i7, i6)));
    }

    public static void g(q.b bVar, y yVar) {
        AbstractC1119a.b(yVar.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] d12 = AbstractC1117K.d1((String) AbstractC1119a.e((String) yVar.get("sprop-parameter-sets")), com.amazon.a.a.o.b.f.f11248a);
        AbstractC1119a.b(d12.length == 2, "empty sprop value");
        z6.w z6 = z6.w.z(c(d12[0]), c(d12[1]));
        bVar.b0(z6);
        byte[] bArr = (byte[]) z6.get(0);
        d.c l6 = d1.d.l(bArr, d1.d.f13379a.length, bArr.length);
        bVar.k0(l6.f13410h);
        bVar.Y(l6.f13409g);
        bVar.v0(l6.f13408f);
        bVar.P(new C0836h.b().d(l6.f13419q).c(l6.f13420r).e(l6.f13421s).g(l6.f13411i + 8).b(l6.f13412j + 8).a());
        String str = (String) yVar.get("profile-level-id");
        if (str == null) {
            bVar.O(AbstractC1122d.a(l6.f13403a, l6.f13404b, l6.f13405c));
            return;
        }
        bVar.O("avc1." + str);
    }

    public static void h(q.b bVar, y yVar) {
        if (yVar.containsKey("sprop-max-don-diff")) {
            int parseInt = Integer.parseInt((String) AbstractC1119a.e((String) yVar.get("sprop-max-don-diff")));
            AbstractC1119a.b(parseInt == 0, "non-zero sprop-max-don-diff " + parseInt + " is not supported");
        }
        AbstractC1119a.b(yVar.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) AbstractC1119a.e((String) yVar.get("sprop-vps"));
        AbstractC1119a.b(yVar.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) AbstractC1119a.e((String) yVar.get("sprop-sps"));
        AbstractC1119a.b(yVar.containsKey("sprop-pps"), "missing sprop-pps parameter");
        z6.w A6 = z6.w.A(c(str), c(str2), c((String) AbstractC1119a.e((String) yVar.get("sprop-pps"))));
        bVar.b0(A6);
        byte[] bArr = (byte[]) A6.get(1);
        d.a h6 = d1.d.h(bArr, d1.d.f13379a.length, bArr.length);
        bVar.k0(h6.f13395m);
        bVar.Y(h6.f13394l).v0(h6.f13393k);
        bVar.P(new C0836h.b().d(h6.f13397o).c(h6.f13398p).e(h6.f13399q).g(h6.f13388f + 8).b(h6.f13389g + 8).a());
        bVar.O(AbstractC1122d.c(h6.f13383a, h6.f13384b, h6.f13385c, h6.f13386d, h6.f13390h, h6.f13391i));
    }

    public static void i(q.b bVar, y yVar) {
        String str = (String) yVar.get("config");
        if (str != null) {
            byte[] Q5 = AbstractC1117K.Q(str);
            bVar.b0(z6.w.y(Q5));
            Pair f6 = AbstractC1122d.f(Q5);
            bVar.v0(((Integer) f6.first).intValue()).Y(((Integer) f6.second).intValue());
        } else {
            bVar.v0(352).Y(288);
        }
        String str2 = (String) yVar.get("profile-level-id");
        StringBuilder sb = new StringBuilder();
        sb.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb.append(str2);
        bVar.O(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2054n.class == obj.getClass()) {
            C2054n c2054n = (C2054n) obj;
            if (this.f18818a.equals(c2054n.f18818a) && this.f18819b.equals(c2054n.f18819b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.f18818a.hashCode()) * 31) + this.f18819b.hashCode();
    }
}
