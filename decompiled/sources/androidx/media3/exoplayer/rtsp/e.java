package androidx.media3.exoplayer.rtsp;

import c1.AbstractC1117K;
import java.util.List;
import java.util.Map;
import z6.D;
import z6.w;
import z6.x;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f9345b = new b().e();

    /* renamed from: a, reason: collision with root package name */
    public final x f9346a;

    public static String c(String str) {
        return y6.c.a(str, "Accept") ? "Accept" : y6.c.a(str, "Allow") ? "Allow" : y6.c.a(str, "Authorization") ? "Authorization" : y6.c.a(str, "Bandwidth") ? "Bandwidth" : y6.c.a(str, "Blocksize") ? "Blocksize" : y6.c.a(str, "Cache-Control") ? "Cache-Control" : y6.c.a(str, "Connection") ? "Connection" : y6.c.a(str, "Content-Base") ? "Content-Base" : y6.c.a(str, "Content-Encoding") ? "Content-Encoding" : y6.c.a(str, "Content-Language") ? "Content-Language" : y6.c.a(str, "Content-Length") ? "Content-Length" : y6.c.a(str, "Content-Location") ? "Content-Location" : y6.c.a(str, "Content-Type") ? "Content-Type" : y6.c.a(str, "CSeq") ? "CSeq" : y6.c.a(str, "Date") ? "Date" : y6.c.a(str, "Expires") ? "Expires" : y6.c.a(str, "Location") ? "Location" : y6.c.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : y6.c.a(str, "Proxy-Require") ? "Proxy-Require" : y6.c.a(str, "Public") ? "Public" : y6.c.a(str, "Range") ? "Range" : y6.c.a(str, "RTP-Info") ? "RTP-Info" : y6.c.a(str, "RTCP-Interval") ? "RTCP-Interval" : y6.c.a(str, "Scale") ? "Scale" : y6.c.a(str, "Session") ? "Session" : y6.c.a(str, "Speed") ? "Speed" : y6.c.a(str, "Supported") ? "Supported" : y6.c.a(str, "Timestamp") ? "Timestamp" : y6.c.a(str, "Transport") ? "Transport" : y6.c.a(str, "User-Agent") ? "User-Agent" : y6.c.a(str, "Via") ? "Via" : y6.c.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public x b() {
        return this.f9346a;
    }

    public String d(String str) {
        w e6 = e(str);
        if (e6.isEmpty()) {
            return null;
        }
        return (String) D.d(e6);
    }

    public w e(String str) {
        return this.f9346a.t(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f9346a.equals(((e) obj).f9346a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9346a.hashCode();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final x.a f9347a;

        public b() {
            this.f9347a = new x.a();
        }

        public b b(String str, String str2) {
            this.f9347a.f(e.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List list) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                String[] e12 = AbstractC1117K.e1((String) list.get(i6), ":\\s?");
                if (e12.length == 2) {
                    b(e12[0], e12[1]);
                }
            }
            return this;
        }

        public b d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public e e() {
            return new e(this);
        }

        public b(String str, String str2, int i6) {
            this();
            b("User-Agent", str);
            b("CSeq", String.valueOf(i6));
            if (str2 != null) {
                b("Session", str2);
            }
        }
    }

    public e(b bVar) {
        this.f9346a = bVar.f9347a.e();
    }
}
