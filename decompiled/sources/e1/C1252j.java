package e1;

import android.net.Uri;
import c1.AbstractC1119a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e1.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1252j {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13820a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13821b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13822c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13823d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f13824e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13825f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13826g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13827h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13828i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13829j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f13830k;

    /* renamed from: e1.j$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f13831a;

        /* renamed from: b, reason: collision with root package name */
        public long f13832b;

        /* renamed from: c, reason: collision with root package name */
        public int f13833c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f13834d;

        /* renamed from: e, reason: collision with root package name */
        public Map f13835e;

        /* renamed from: f, reason: collision with root package name */
        public long f13836f;

        /* renamed from: g, reason: collision with root package name */
        public long f13837g;

        /* renamed from: h, reason: collision with root package name */
        public String f13838h;

        /* renamed from: i, reason: collision with root package name */
        public int f13839i;

        /* renamed from: j, reason: collision with root package name */
        public Object f13840j;

        public C1252j a() {
            AbstractC1119a.j(this.f13831a, "The uri must be set.");
            return new C1252j(this.f13831a, this.f13832b, this.f13833c, this.f13834d, this.f13835e, this.f13836f, this.f13837g, this.f13838h, this.f13839i, this.f13840j);
        }

        public b b(int i6) {
            this.f13839i = i6;
            return this;
        }

        public b c(byte[] bArr) {
            this.f13834d = bArr;
            return this;
        }

        public b d(int i6) {
            this.f13833c = i6;
            return this;
        }

        public b e(Map map) {
            this.f13835e = map;
            return this;
        }

        public b f(String str) {
            this.f13838h = str;
            return this;
        }

        public b g(long j6) {
            this.f13837g = j6;
            return this;
        }

        public b h(long j6) {
            this.f13836f = j6;
            return this;
        }

        public b i(Uri uri) {
            this.f13831a = uri;
            return this;
        }

        public b j(String str) {
            this.f13831a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f13833c = 1;
            this.f13835e = Collections.EMPTY_MAP;
            this.f13837g = -1L;
        }

        public b(C1252j c1252j) {
            this.f13831a = c1252j.f13820a;
            this.f13832b = c1252j.f13821b;
            this.f13833c = c1252j.f13822c;
            this.f13834d = c1252j.f13823d;
            this.f13835e = c1252j.f13824e;
            this.f13836f = c1252j.f13826g;
            this.f13837g = c1252j.f13827h;
            this.f13838h = c1252j.f13828i;
            this.f13839i = c1252j.f13829j;
            this.f13840j = c1252j.f13830k;
        }
    }

    static {
        Z0.v.a("media3.datasource");
    }

    public static String c(int i6) {
        if (i6 == 1) {
            return "GET";
        }
        if (i6 == 2) {
            return "POST";
        }
        if (i6 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f13822c);
    }

    public boolean d(int i6) {
        return (this.f13829j & i6) == i6;
    }

    public C1252j e(long j6) {
        long j7 = this.f13827h;
        return f(j6, j7 != -1 ? j7 - j6 : -1L);
    }

    public C1252j f(long j6, long j7) {
        return (j6 == 0 && this.f13827h == j7) ? this : new C1252j(this.f13820a, this.f13821b, this.f13822c, this.f13823d, this.f13824e, this.f13826g + j6, j7, this.f13828i, this.f13829j, this.f13830k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f13820a + ", " + this.f13826g + ", " + this.f13827h + ", " + this.f13828i + ", " + this.f13829j + "]";
    }

    public C1252j(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C1252j(Uri uri, long j6, long j7) {
        this(uri, j6, j7, null);
    }

    public C1252j(Uri uri, long j6, long j7, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j6, j7, str, 0, null);
    }

    public C1252j(Uri uri, long j6, int i6, byte[] bArr, Map map, long j7, long j8, String str, int i7, Object obj) {
        byte[] bArr2 = bArr;
        long j9 = j6 + j7;
        AbstractC1119a.a(j9 >= 0);
        AbstractC1119a.a(j7 >= 0);
        AbstractC1119a.a(j8 > 0 || j8 == -1);
        this.f13820a = (Uri) AbstractC1119a.e(uri);
        this.f13821b = j6;
        this.f13822c = i6;
        this.f13823d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f13824e = Collections.unmodifiableMap(new HashMap(map));
        this.f13826g = j7;
        this.f13825f = j9;
        this.f13827h = j8;
        this.f13828i = str;
        this.f13829j = i7;
        this.f13830k = obj;
    }
}
