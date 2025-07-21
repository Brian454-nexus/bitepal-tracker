package s1;

import Z0.z;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.HashMap;
import z6.y;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2041a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18741b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18742c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18744e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18745f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18746g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18747h;

    /* renamed from: i, reason: collision with root package name */
    public final y f18748i;

    /* renamed from: j, reason: collision with root package name */
    public final c f18749j;

    /* renamed from: s1.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f18750a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18751b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18752c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18753d;

        /* renamed from: e, reason: collision with root package name */
        public final HashMap f18754e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public int f18755f = -1;

        /* renamed from: g, reason: collision with root package name */
        public String f18756g;

        /* renamed from: h, reason: collision with root package name */
        public String f18757h;

        /* renamed from: i, reason: collision with root package name */
        public String f18758i;

        public b(String str, int i6, String str2, int i7) {
            this.f18750a = str;
            this.f18751b = i6;
            this.f18752c = str2;
            this.f18753d = i7;
        }

        public static String k(int i6, String str, int i7, int i8) {
            return AbstractC1117K.H("%d %s/%d/%d", Integer.valueOf(i6), str, Integer.valueOf(i7), Integer.valueOf(i8));
        }

        public static String l(int i6) {
            AbstractC1119a.a(i6 < 96);
            if (i6 == 0) {
                return k(0, "PCMU", 8000, 1);
            }
            if (i6 == 8) {
                return k(8, "PCMA", 8000, 1);
            }
            if (i6 == 10) {
                return k(10, "L16", 44100, 2);
            }
            if (i6 == 11) {
                return k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i6);
        }

        public b i(String str, String str2) {
            this.f18754e.put(str, str2);
            return this;
        }

        public C2041a j() {
            try {
                return new C2041a(this, y.c(this.f18754e), this.f18754e.containsKey("rtpmap") ? c.a((String) AbstractC1117K.i((String) this.f18754e.get("rtpmap"))) : c.a(l(this.f18753d)));
            } catch (z e6) {
                throw new IllegalStateException(e6);
            }
        }

        public b m(int i6) {
            this.f18755f = i6;
            return this;
        }

        public b n(String str) {
            this.f18757h = str;
            return this;
        }

        public b o(String str) {
            this.f18758i = str;
            return this;
        }

        public b p(String str) {
            this.f18756g = str;
            return this;
        }
    }

    /* renamed from: s1.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18759a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18760b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18761c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18762d;

        public c(int i6, String str, int i7, int i8) {
            this.f18759a = i6;
            this.f18760b = str;
            this.f18761c = i7;
            this.f18762d = i8;
        }

        public static c a(String str) {
            String[] e12 = AbstractC1117K.e1(str, " ");
            AbstractC1119a.a(e12.length == 2);
            int h6 = androidx.media3.exoplayer.rtsp.h.h(e12[0]);
            String[] d12 = AbstractC1117K.d1(e12[1].trim(), "/");
            AbstractC1119a.a(d12.length >= 2);
            return new c(h6, d12[0], androidx.media3.exoplayer.rtsp.h.h(d12[1]), d12.length == 3 ? androidx.media3.exoplayer.rtsp.h.h(d12[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f18759a == cVar.f18759a && this.f18760b.equals(cVar.f18760b) && this.f18761c == cVar.f18761c && this.f18762d == cVar.f18762d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.f18759a) * 31) + this.f18760b.hashCode()) * 31) + this.f18761c) * 31) + this.f18762d;
        }
    }

    public y a() {
        String str = (String) this.f18748i.get("fmtp");
        if (str == null) {
            return y.j();
        }
        String[] e12 = AbstractC1117K.e1(str, " ");
        AbstractC1119a.b(e12.length == 2, str);
        String[] split = e12[1].split(";\\s?", 0);
        y.a aVar = new y.a();
        for (String str2 : split) {
            String[] e13 = AbstractC1117K.e1(str2, com.amazon.a.a.o.b.f.f11249b);
            aVar.f(e13[0], e13[1]);
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2041a.class == obj.getClass()) {
            C2041a c2041a = (C2041a) obj;
            if (this.f18740a.equals(c2041a.f18740a) && this.f18741b == c2041a.f18741b && this.f18742c.equals(c2041a.f18742c) && this.f18743d == c2041a.f18743d && this.f18744e == c2041a.f18744e && this.f18748i.equals(c2041a.f18748i) && this.f18749j.equals(c2041a.f18749j) && AbstractC1117K.c(this.f18745f, c2041a.f18745f) && AbstractC1117K.c(this.f18746g, c2041a.f18746g) && AbstractC1117K.c(this.f18747h, c2041a.f18747h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.f18740a.hashCode()) * 31) + this.f18741b) * 31) + this.f18742c.hashCode()) * 31) + this.f18743d) * 31) + this.f18744e) * 31) + this.f18748i.hashCode()) * 31) + this.f18749j.hashCode()) * 31;
        String str = this.f18745f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18746g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18747h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public C2041a(b bVar, y yVar, c cVar) {
        this.f18740a = bVar.f18750a;
        this.f18741b = bVar.f18751b;
        this.f18742c = bVar.f18752c;
        this.f18743d = bVar.f18753d;
        this.f18745f = bVar.f18756g;
        this.f18746g = bVar.f18757h;
        this.f18744e = bVar.f18755f;
        this.f18747h = bVar.f18758i;
        this.f18748i = yVar;
        this.f18749j = cVar;
    }
}
