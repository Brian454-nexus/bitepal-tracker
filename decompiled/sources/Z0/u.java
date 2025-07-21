package Z0;

import android.net.Uri;
import android.os.Bundle;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: i, reason: collision with root package name */
    public static final u f7056i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f7057j = AbstractC1117K.x0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f7058k = AbstractC1117K.x0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f7059l = AbstractC1117K.x0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f7060m = AbstractC1117K.x0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f7061n = AbstractC1117K.x0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f7062o = AbstractC1117K.x0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f7063a;

    /* renamed from: b, reason: collision with root package name */
    public final h f7064b;

    /* renamed from: c, reason: collision with root package name */
    public final h f7065c;

    /* renamed from: d, reason: collision with root package name */
    public final g f7066d;

    /* renamed from: e, reason: collision with root package name */
    public final w f7067e;

    /* renamed from: f, reason: collision with root package name */
    public final d f7068f;

    /* renamed from: g, reason: collision with root package name */
    public final e f7069g;

    /* renamed from: h, reason: collision with root package name */
    public final i f7070h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f7071a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f7072b;

        /* renamed from: c, reason: collision with root package name */
        public String f7073c;

        /* renamed from: d, reason: collision with root package name */
        public d.a f7074d;

        /* renamed from: e, reason: collision with root package name */
        public f.a f7075e;

        /* renamed from: f, reason: collision with root package name */
        public List f7076f;

        /* renamed from: g, reason: collision with root package name */
        public String f7077g;

        /* renamed from: h, reason: collision with root package name */
        public z6.w f7078h;

        /* renamed from: i, reason: collision with root package name */
        public Object f7079i;

        /* renamed from: j, reason: collision with root package name */
        public long f7080j;

        /* renamed from: k, reason: collision with root package name */
        public w f7081k;

        /* renamed from: l, reason: collision with root package name */
        public g.a f7082l;

        /* renamed from: m, reason: collision with root package name */
        public i f7083m;

        public u a() {
            h hVar;
            AbstractC1119a.g(this.f7075e.f7125b == null || this.f7075e.f7124a != null);
            Uri uri = this.f7072b;
            if (uri != null) {
                hVar = new h(uri, this.f7073c, this.f7075e.f7124a != null ? this.f7075e.i() : null, null, this.f7076f, this.f7077g, this.f7078h, this.f7079i, this.f7080j);
            } else {
                hVar = null;
            }
            String str = this.f7071a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g6 = this.f7074d.g();
            g f6 = this.f7082l.f();
            w wVar = this.f7081k;
            if (wVar == null) {
                wVar = w.f7184H;
            }
            return new u(str2, g6, hVar, f6, wVar, this.f7083m);
        }

        public c b(g gVar) {
            this.f7082l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f7071a = (String) AbstractC1119a.e(str);
            return this;
        }

        public c d(String str) {
            this.f7073c = str;
            return this;
        }

        public c e(List list) {
            this.f7078h = z6.w.s(list);
            return this;
        }

        public c f(Object obj) {
            this.f7079i = obj;
            return this;
        }

        public c g(Uri uri) {
            this.f7072b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f7074d = new d.a();
            this.f7075e = new f.a();
            this.f7076f = Collections.EMPTY_LIST;
            this.f7078h = z6.w.w();
            this.f7082l = new g.a();
            this.f7083m = i.f7165d;
            this.f7080j = -9223372036854775807L;
        }

        public c(u uVar) {
            this();
            f.a aVar;
            this.f7074d = uVar.f7068f.a();
            this.f7071a = uVar.f7063a;
            this.f7081k = uVar.f7067e;
            this.f7082l = uVar.f7066d.a();
            this.f7083m = uVar.f7070h;
            h hVar = uVar.f7064b;
            if (hVar != null) {
                this.f7077g = hVar.f7160e;
                this.f7073c = hVar.f7157b;
                this.f7072b = hVar.f7156a;
                this.f7076f = hVar.f7159d;
                this.f7078h = hVar.f7161f;
                this.f7079i = hVar.f7163h;
                f fVar = hVar.f7158c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f7075e = aVar;
                this.f7080j = hVar.f7164i;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: h, reason: collision with root package name */
        public static final d f7084h = new a().f();

        /* renamed from: i, reason: collision with root package name */
        public static final String f7085i = AbstractC1117K.x0(0);

        /* renamed from: j, reason: collision with root package name */
        public static final String f7086j = AbstractC1117K.x0(1);

        /* renamed from: k, reason: collision with root package name */
        public static final String f7087k = AbstractC1117K.x0(2);

        /* renamed from: l, reason: collision with root package name */
        public static final String f7088l = AbstractC1117K.x0(3);

        /* renamed from: m, reason: collision with root package name */
        public static final String f7089m = AbstractC1117K.x0(4);

        /* renamed from: n, reason: collision with root package name */
        public static final String f7090n = AbstractC1117K.x0(5);

        /* renamed from: o, reason: collision with root package name */
        public static final String f7091o = AbstractC1117K.x0(6);

        /* renamed from: a, reason: collision with root package name */
        public final long f7092a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7093b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7094c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7095d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7096e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f7097f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7098g;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f7099a;

            /* renamed from: b, reason: collision with root package name */
            public long f7100b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f7101c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f7102d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f7103e;

            public d f() {
                return new d(this);
            }

            public e g() {
                return new e(this);
            }

            public a() {
                this.f7100b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f7099a = dVar.f7093b;
                this.f7100b = dVar.f7095d;
                this.f7101c = dVar.f7096e;
                this.f7102d = dVar.f7097f;
                this.f7103e = dVar.f7098g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7093b == dVar.f7093b && this.f7095d == dVar.f7095d && this.f7096e == dVar.f7096e && this.f7097f == dVar.f7097f && this.f7098g == dVar.f7098g;
        }

        public int hashCode() {
            long j6 = this.f7093b;
            int i6 = ((int) (j6 ^ (j6 >>> 32))) * 31;
            long j7 = this.f7095d;
            return ((((((i6 + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.f7096e ? 1 : 0)) * 31) + (this.f7097f ? 1 : 0)) * 31) + (this.f7098g ? 1 : 0);
        }

        public d(a aVar) {
            this.f7092a = AbstractC1117K.k1(aVar.f7099a);
            this.f7094c = AbstractC1117K.k1(aVar.f7100b);
            this.f7093b = aVar.f7099a;
            this.f7095d = aVar.f7100b;
            this.f7096e = aVar.f7101c;
            this.f7097f = aVar.f7102d;
            this.f7098g = aVar.f7103e;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends d {

        /* renamed from: p, reason: collision with root package name */
        public static final e f7104p = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: l, reason: collision with root package name */
        public static final String f7105l = AbstractC1117K.x0(0);

        /* renamed from: m, reason: collision with root package name */
        public static final String f7106m = AbstractC1117K.x0(1);

        /* renamed from: n, reason: collision with root package name */
        public static final String f7107n = AbstractC1117K.x0(2);

        /* renamed from: o, reason: collision with root package name */
        public static final String f7108o = AbstractC1117K.x0(3);

        /* renamed from: p, reason: collision with root package name */
        public static final String f7109p = AbstractC1117K.x0(4);

        /* renamed from: q, reason: collision with root package name */
        public static final String f7110q = AbstractC1117K.x0(5);

        /* renamed from: r, reason: collision with root package name */
        public static final String f7111r = AbstractC1117K.x0(6);

        /* renamed from: s, reason: collision with root package name */
        public static final String f7112s = AbstractC1117K.x0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f7113a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f7114b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f7115c;

        /* renamed from: d, reason: collision with root package name */
        public final z6.y f7116d;

        /* renamed from: e, reason: collision with root package name */
        public final z6.y f7117e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f7118f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7119g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f7120h;

        /* renamed from: i, reason: collision with root package name */
        public final z6.w f7121i;

        /* renamed from: j, reason: collision with root package name */
        public final z6.w f7122j;

        /* renamed from: k, reason: collision with root package name */
        public final byte[] f7123k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f7123k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f7113a.equals(fVar.f7113a) && AbstractC1117K.c(this.f7115c, fVar.f7115c) && AbstractC1117K.c(this.f7117e, fVar.f7117e) && this.f7118f == fVar.f7118f && this.f7120h == fVar.f7120h && this.f7119g == fVar.f7119g && this.f7122j.equals(fVar.f7122j) && Arrays.equals(this.f7123k, fVar.f7123k);
        }

        public int hashCode() {
            int hashCode = this.f7113a.hashCode() * 31;
            Uri uri = this.f7115c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f7117e.hashCode()) * 31) + (this.f7118f ? 1 : 0)) * 31) + (this.f7120h ? 1 : 0)) * 31) + (this.f7119g ? 1 : 0)) * 31) + this.f7122j.hashCode()) * 31) + Arrays.hashCode(this.f7123k);
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public UUID f7124a;

            /* renamed from: b, reason: collision with root package name */
            public Uri f7125b;

            /* renamed from: c, reason: collision with root package name */
            public z6.y f7126c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f7127d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f7128e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f7129f;

            /* renamed from: g, reason: collision with root package name */
            public z6.w f7130g;

            /* renamed from: h, reason: collision with root package name */
            public byte[] f7131h;

            public f i() {
                return new f(this);
            }

            public a() {
                this.f7126c = z6.y.j();
                this.f7128e = true;
                this.f7130g = z6.w.w();
            }

            public a(f fVar) {
                this.f7124a = fVar.f7113a;
                this.f7125b = fVar.f7115c;
                this.f7126c = fVar.f7117e;
                this.f7127d = fVar.f7118f;
                this.f7128e = fVar.f7119g;
                this.f7129f = fVar.f7120h;
                this.f7130g = fVar.f7122j;
                this.f7131h = fVar.f7123k;
            }
        }

        public f(a aVar) {
            AbstractC1119a.g((aVar.f7129f && aVar.f7125b == null) ? false : true);
            UUID uuid = (UUID) AbstractC1119a.e(aVar.f7124a);
            this.f7113a = uuid;
            this.f7114b = uuid;
            this.f7115c = aVar.f7125b;
            this.f7116d = aVar.f7126c;
            this.f7117e = aVar.f7126c;
            this.f7118f = aVar.f7127d;
            this.f7120h = aVar.f7129f;
            this.f7119g = aVar.f7128e;
            this.f7121i = aVar.f7130g;
            this.f7122j = aVar.f7130g;
            this.f7123k = aVar.f7131h != null ? Arrays.copyOf(aVar.f7131h, aVar.f7131h.length) : null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f7132f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        public static final String f7133g = AbstractC1117K.x0(0);

        /* renamed from: h, reason: collision with root package name */
        public static final String f7134h = AbstractC1117K.x0(1);

        /* renamed from: i, reason: collision with root package name */
        public static final String f7135i = AbstractC1117K.x0(2);

        /* renamed from: j, reason: collision with root package name */
        public static final String f7136j = AbstractC1117K.x0(3);

        /* renamed from: k, reason: collision with root package name */
        public static final String f7137k = AbstractC1117K.x0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f7138a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7139b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7140c;

        /* renamed from: d, reason: collision with root package name */
        public final float f7141d;

        /* renamed from: e, reason: collision with root package name */
        public final float f7142e;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f7143a;

            /* renamed from: b, reason: collision with root package name */
            public long f7144b;

            /* renamed from: c, reason: collision with root package name */
            public long f7145c;

            /* renamed from: d, reason: collision with root package name */
            public float f7146d;

            /* renamed from: e, reason: collision with root package name */
            public float f7147e;

            public g f() {
                return new g(this);
            }

            public a g(long j6) {
                this.f7145c = j6;
                return this;
            }

            public a h(float f6) {
                this.f7147e = f6;
                return this;
            }

            public a i(long j6) {
                this.f7144b = j6;
                return this;
            }

            public a j(float f6) {
                this.f7146d = f6;
                return this;
            }

            public a k(long j6) {
                this.f7143a = j6;
                return this;
            }

            public a() {
                this.f7143a = -9223372036854775807L;
                this.f7144b = -9223372036854775807L;
                this.f7145c = -9223372036854775807L;
                this.f7146d = -3.4028235E38f;
                this.f7147e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f7143a = gVar.f7138a;
                this.f7144b = gVar.f7139b;
                this.f7145c = gVar.f7140c;
                this.f7146d = gVar.f7141d;
                this.f7147e = gVar.f7142e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f7138a == gVar.f7138a && this.f7139b == gVar.f7139b && this.f7140c == gVar.f7140c && this.f7141d == gVar.f7141d && this.f7142e == gVar.f7142e;
        }

        public int hashCode() {
            long j6 = this.f7138a;
            long j7 = this.f7139b;
            int i6 = ((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f7140c;
            int i7 = (i6 + ((int) ((j8 >>> 32) ^ j8))) * 31;
            float f6 = this.f7141d;
            int floatToIntBits = (i7 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f7142e;
            return floatToIntBits + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0);
        }

        public g(a aVar) {
            this(aVar.f7143a, aVar.f7144b, aVar.f7145c, aVar.f7146d, aVar.f7147e);
        }

        public g(long j6, long j7, long j8, float f6, float f7) {
            this.f7138a = j6;
            this.f7139b = j7;
            this.f7140c = j8;
            this.f7141d = f6;
            this.f7142e = f7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h {

        /* renamed from: j, reason: collision with root package name */
        public static final String f7148j = AbstractC1117K.x0(0);

        /* renamed from: k, reason: collision with root package name */
        public static final String f7149k = AbstractC1117K.x0(1);

        /* renamed from: l, reason: collision with root package name */
        public static final String f7150l = AbstractC1117K.x0(2);

        /* renamed from: m, reason: collision with root package name */
        public static final String f7151m = AbstractC1117K.x0(3);

        /* renamed from: n, reason: collision with root package name */
        public static final String f7152n = AbstractC1117K.x0(4);

        /* renamed from: o, reason: collision with root package name */
        public static final String f7153o = AbstractC1117K.x0(5);

        /* renamed from: p, reason: collision with root package name */
        public static final String f7154p = AbstractC1117K.x0(6);

        /* renamed from: q, reason: collision with root package name */
        public static final String f7155q = AbstractC1117K.x0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f7156a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7157b;

        /* renamed from: c, reason: collision with root package name */
        public final f f7158c;

        /* renamed from: d, reason: collision with root package name */
        public final List f7159d;

        /* renamed from: e, reason: collision with root package name */
        public final String f7160e;

        /* renamed from: f, reason: collision with root package name */
        public final z6.w f7161f;

        /* renamed from: g, reason: collision with root package name */
        public final List f7162g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f7163h;

        /* renamed from: i, reason: collision with root package name */
        public final long f7164i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f7156a.equals(hVar.f7156a) && AbstractC1117K.c(this.f7157b, hVar.f7157b) && AbstractC1117K.c(this.f7158c, hVar.f7158c) && AbstractC1117K.c(null, null) && this.f7159d.equals(hVar.f7159d) && AbstractC1117K.c(this.f7160e, hVar.f7160e) && this.f7161f.equals(hVar.f7161f) && AbstractC1117K.c(this.f7163h, hVar.f7163h) && AbstractC1117K.c(Long.valueOf(this.f7164i), Long.valueOf(hVar.f7164i));
        }

        public int hashCode() {
            int hashCode = this.f7156a.hashCode() * 31;
            String str = this.f7157b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f7158c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f7159d.hashCode()) * 31;
            String str2 = this.f7160e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f7161f.hashCode()) * 31;
            return (int) (((hashCode4 + (this.f7163h != null ? r1.hashCode() : 0)) * 31) + this.f7164i);
        }

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, z6.w wVar, Object obj, long j6) {
            this.f7156a = uri;
            this.f7157b = y.t(str);
            this.f7158c = fVar;
            this.f7159d = list;
            this.f7160e = str2;
            this.f7161f = wVar;
            w.a o6 = z6.w.o();
            for (int i6 = 0; i6 < wVar.size(); i6++) {
                o6.h(((k) wVar.get(i6)).a().b());
            }
            this.f7162g = o6.k();
            this.f7163h = obj;
            this.f7164i = j6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f7165d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        public static final String f7166e = AbstractC1117K.x0(0);

        /* renamed from: f, reason: collision with root package name */
        public static final String f7167f = AbstractC1117K.x0(1);

        /* renamed from: g, reason: collision with root package name */
        public static final String f7168g = AbstractC1117K.x0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f7169a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7170b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f7171c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f7172a;

            /* renamed from: b, reason: collision with root package name */
            public String f7173b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f7174c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (AbstractC1117K.c(this.f7169a, iVar.f7169a) && AbstractC1117K.c(this.f7170b, iVar.f7170b)) {
                if ((this.f7171c == null) == (iVar.f7171c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f7169a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f7170b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f7171c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.f7169a = aVar.f7172a;
            this.f7170b = aVar.f7173b;
            this.f7171c = aVar.f7174c;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j extends k {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f7175a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7176b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7177c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7178d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7179e;

        /* renamed from: f, reason: collision with root package name */
        public final String f7180f;

        /* renamed from: g, reason: collision with root package name */
        public final String f7181g;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public abstract j b();
        }

        public abstract a a();
    }

    public static u b(String str) {
        return new c().h(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC1117K.c(this.f7063a, uVar.f7063a) && this.f7068f.equals(uVar.f7068f) && AbstractC1117K.c(this.f7064b, uVar.f7064b) && AbstractC1117K.c(this.f7066d, uVar.f7066d) && AbstractC1117K.c(this.f7067e, uVar.f7067e) && AbstractC1117K.c(this.f7070h, uVar.f7070h);
    }

    public int hashCode() {
        int hashCode = this.f7063a.hashCode() * 31;
        h hVar = this.f7064b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f7066d.hashCode()) * 31) + this.f7068f.hashCode()) * 31) + this.f7067e.hashCode()) * 31) + this.f7070h.hashCode();
    }

    public u(String str, e eVar, h hVar, g gVar, w wVar, i iVar) {
        this.f7063a = str;
        this.f7064b = hVar;
        this.f7065c = hVar;
        this.f7066d = gVar;
        this.f7067e = wVar;
        this.f7068f = eVar;
        this.f7069g = eVar;
        this.f7070h = iVar;
    }
}
