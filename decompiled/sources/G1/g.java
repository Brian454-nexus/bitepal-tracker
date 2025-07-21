package G1;

import Z0.q;
import c1.AbstractC1117K;
import c1.AbstractC1133o;
import c1.C1144z;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final q f1762a;

    public g(q qVar) {
        this.f1762a = qVar;
    }

    public static String a(int i6) {
        switch (i6) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String b(int i6) {
        if (i6 == 1) {
            return "audio/raw";
        }
        if (i6 == 85) {
            return "audio/mpeg";
        }
        if (i6 == 255) {
            return "audio/mp4a-latm";
        }
        if (i6 == 8192) {
            return "audio/ac3";
        }
        if (i6 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static a c(C1144z c1144z) {
        c1144z.U(4);
        int t6 = c1144z.t();
        int t7 = c1144z.t();
        c1144z.U(4);
        int t8 = c1144z.t();
        String a6 = a(t8);
        if (a6 != null) {
            q.b bVar = new q.b();
            bVar.v0(t6).Y(t7).o0(a6);
            return new g(bVar.K());
        }
        AbstractC1133o.h("StreamFormatChunk", "Ignoring track with unsupported compression " + t8);
        return null;
    }

    public static a d(int i6, C1144z c1144z) {
        if (i6 == 2) {
            return c(c1144z);
        }
        if (i6 == 1) {
            return e(c1144z);
        }
        AbstractC1133o.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC1117K.r0(i6));
        return null;
    }

    public static a e(C1144z c1144z) {
        int y6 = c1144z.y();
        String b6 = b(y6);
        if (b6 == null) {
            AbstractC1133o.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + y6);
            return null;
        }
        int y7 = c1144z.y();
        int t6 = c1144z.t();
        c1144z.U(6);
        int g02 = AbstractC1117K.g0(c1144z.y());
        int y8 = c1144z.a() > 0 ? c1144z.y() : 0;
        byte[] bArr = new byte[y8];
        c1144z.l(bArr, 0, y8);
        q.b bVar = new q.b();
        bVar.o0(b6).N(y7).p0(t6);
        if ("audio/raw".equals(b6) && g02 != 0) {
            bVar.i0(g02);
        }
        if ("audio/mp4a-latm".equals(b6) && y8 > 0) {
            bVar.b0(w.y(bArr));
        }
        return new g(bVar.K());
    }

    @Override // G1.a
    public int getType() {
        return 1718776947;
    }
}
