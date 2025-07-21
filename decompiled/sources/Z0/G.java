package Z0;

import Z0.C0829a;
import Z0.u;
import android.net.Uri;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f6652a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f6653b = AbstractC1117K.x0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f6654c = AbstractC1117K.x0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final String f6655d = AbstractC1117K.x0(2);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends G {
        @Override // Z0.G
        public int b(Object obj) {
            return -1;
        }

        @Override // Z0.G
        public b g(int i6, b bVar, boolean z6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // Z0.G
        public int i() {
            return 0;
        }

        @Override // Z0.G
        public Object m(int i6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // Z0.G
        public c o(int i6, c cVar, long j6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // Z0.G
        public int p() {
            return 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final String f6656h = AbstractC1117K.x0(0);

        /* renamed from: i, reason: collision with root package name */
        public static final String f6657i = AbstractC1117K.x0(1);

        /* renamed from: j, reason: collision with root package name */
        public static final String f6658j = AbstractC1117K.x0(2);

        /* renamed from: k, reason: collision with root package name */
        public static final String f6659k = AbstractC1117K.x0(3);

        /* renamed from: l, reason: collision with root package name */
        public static final String f6660l = AbstractC1117K.x0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f6661a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6662b;

        /* renamed from: c, reason: collision with root package name */
        public int f6663c;

        /* renamed from: d, reason: collision with root package name */
        public long f6664d;

        /* renamed from: e, reason: collision with root package name */
        public long f6665e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6666f;

        /* renamed from: g, reason: collision with root package name */
        public C0829a f6667g = C0829a.f6828g;

        public int a(int i6) {
            return this.f6667g.a(i6).f6850b;
        }

        public long b(int i6, int i7) {
            C0829a.C0114a a6 = this.f6667g.a(i6);
            if (a6.f6850b != -1) {
                return a6.f6855g[i7];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f6667g.f6835b;
        }

        public int d(long j6) {
            return this.f6667g.b(j6, this.f6664d);
        }

        public int e(long j6) {
            return this.f6667g.c(j6, this.f6664d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (AbstractC1117K.c(this.f6661a, bVar.f6661a) && AbstractC1117K.c(this.f6662b, bVar.f6662b) && this.f6663c == bVar.f6663c && this.f6664d == bVar.f6664d && this.f6665e == bVar.f6665e && this.f6666f == bVar.f6666f && AbstractC1117K.c(this.f6667g, bVar.f6667g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i6) {
            return this.f6667g.a(i6).f6849a;
        }

        public long g() {
            return this.f6667g.f6836c;
        }

        public int h(int i6, int i7) {
            C0829a.C0114a a6 = this.f6667g.a(i6);
            if (a6.f6850b != -1) {
                return a6.f6854f[i7];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f6661a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f6662b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f6663c) * 31;
            long j6 = this.f6664d;
            int i6 = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.f6665e;
            return ((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f6666f ? 1 : 0)) * 31) + this.f6667g.hashCode();
        }

        public long i(int i6) {
            return this.f6667g.a(i6).f6856h;
        }

        public long j() {
            return this.f6664d;
        }

        public int k(int i6) {
            return this.f6667g.a(i6).d();
        }

        public int l(int i6, int i7) {
            return this.f6667g.a(i6).e(i7);
        }

        public long m() {
            return AbstractC1117K.k1(this.f6665e);
        }

        public long n() {
            return this.f6665e;
        }

        public int o() {
            return this.f6667g.f6838e;
        }

        public boolean p(int i6) {
            return !this.f6667g.a(i6).f();
        }

        public boolean q(int i6) {
            return i6 == c() - 1 && this.f6667g.d(i6);
        }

        public boolean r(int i6) {
            return this.f6667g.a(i6).f6857i;
        }

        public b s(Object obj, Object obj2, int i6, long j6, long j7) {
            return t(obj, obj2, i6, j6, j7, C0829a.f6828g, false);
        }

        public b t(Object obj, Object obj2, int i6, long j6, long j7, C0829a c0829a, boolean z6) {
            this.f6661a = obj;
            this.f6662b = obj2;
            this.f6663c = i6;
            this.f6664d = j6;
            this.f6665e = j7;
            this.f6667g = c0829a;
            this.f6666f = z6;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public Object f6685b;

        /* renamed from: d, reason: collision with root package name */
        public Object f6687d;

        /* renamed from: e, reason: collision with root package name */
        public long f6688e;

        /* renamed from: f, reason: collision with root package name */
        public long f6689f;

        /* renamed from: g, reason: collision with root package name */
        public long f6690g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6691h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f6692i;

        /* renamed from: j, reason: collision with root package name */
        public u.g f6693j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f6694k;

        /* renamed from: l, reason: collision with root package name */
        public long f6695l;

        /* renamed from: m, reason: collision with root package name */
        public long f6696m;

        /* renamed from: n, reason: collision with root package name */
        public int f6697n;

        /* renamed from: o, reason: collision with root package name */
        public int f6698o;

        /* renamed from: p, reason: collision with root package name */
        public long f6699p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f6674q = new Object();

        /* renamed from: r, reason: collision with root package name */
        public static final Object f6675r = new Object();

        /* renamed from: s, reason: collision with root package name */
        public static final u f6676s = new u.c().c("androidx.media3.common.Timeline").g(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        public static final String f6677t = AbstractC1117K.x0(1);

        /* renamed from: u, reason: collision with root package name */
        public static final String f6678u = AbstractC1117K.x0(2);

        /* renamed from: v, reason: collision with root package name */
        public static final String f6679v = AbstractC1117K.x0(3);

        /* renamed from: w, reason: collision with root package name */
        public static final String f6680w = AbstractC1117K.x0(4);

        /* renamed from: x, reason: collision with root package name */
        public static final String f6681x = AbstractC1117K.x0(5);

        /* renamed from: y, reason: collision with root package name */
        public static final String f6682y = AbstractC1117K.x0(6);

        /* renamed from: z, reason: collision with root package name */
        public static final String f6683z = AbstractC1117K.x0(7);

        /* renamed from: A, reason: collision with root package name */
        public static final String f6668A = AbstractC1117K.x0(8);

        /* renamed from: B, reason: collision with root package name */
        public static final String f6669B = AbstractC1117K.x0(9);

        /* renamed from: C, reason: collision with root package name */
        public static final String f6670C = AbstractC1117K.x0(10);

        /* renamed from: D, reason: collision with root package name */
        public static final String f6671D = AbstractC1117K.x0(11);

        /* renamed from: E, reason: collision with root package name */
        public static final String f6672E = AbstractC1117K.x0(12);

        /* renamed from: F, reason: collision with root package name */
        public static final String f6673F = AbstractC1117K.x0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f6684a = f6674q;

        /* renamed from: c, reason: collision with root package name */
        public u f6686c = f6676s;

        public long a() {
            return AbstractC1117K.f0(this.f6690g);
        }

        public long b() {
            return AbstractC1117K.k1(this.f6695l);
        }

        public long c() {
            return this.f6695l;
        }

        public long d() {
            return AbstractC1117K.k1(this.f6696m);
        }

        public long e() {
            return this.f6699p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (AbstractC1117K.c(this.f6684a, cVar.f6684a) && AbstractC1117K.c(this.f6686c, cVar.f6686c) && AbstractC1117K.c(this.f6687d, cVar.f6687d) && AbstractC1117K.c(this.f6693j, cVar.f6693j) && this.f6688e == cVar.f6688e && this.f6689f == cVar.f6689f && this.f6690g == cVar.f6690g && this.f6691h == cVar.f6691h && this.f6692i == cVar.f6692i && this.f6694k == cVar.f6694k && this.f6695l == cVar.f6695l && this.f6696m == cVar.f6696m && this.f6697n == cVar.f6697n && this.f6698o == cVar.f6698o && this.f6699p == cVar.f6699p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f6693j != null;
        }

        public c g(Object obj, u uVar, Object obj2, long j6, long j7, long j8, boolean z6, boolean z7, u.g gVar, long j9, long j10, int i6, int i7, long j11) {
            u.h hVar;
            this.f6684a = obj;
            this.f6686c = uVar != null ? uVar : f6676s;
            this.f6685b = (uVar == null || (hVar = uVar.f7064b) == null) ? null : hVar.f7163h;
            this.f6687d = obj2;
            this.f6688e = j6;
            this.f6689f = j7;
            this.f6690g = j8;
            this.f6691h = z6;
            this.f6692i = z7;
            this.f6693j = gVar;
            this.f6695l = j9;
            this.f6696m = j10;
            this.f6697n = i6;
            this.f6698o = i7;
            this.f6699p = j11;
            this.f6694k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f6684a.hashCode()) * 31) + this.f6686c.hashCode()) * 31;
            Object obj = this.f6687d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            u.g gVar = this.f6693j;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j6 = this.f6688e;
            int i6 = (hashCode3 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.f6689f;
            int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f6690g;
            int i8 = (((((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f6691h ? 1 : 0)) * 31) + (this.f6692i ? 1 : 0)) * 31) + (this.f6694k ? 1 : 0)) * 31;
            long j9 = this.f6695l;
            int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f6696m;
            int i10 = (((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6697n) * 31) + this.f6698o) * 31;
            long j11 = this.f6699p;
            return i10 + ((int) (j11 ^ (j11 >>> 32)));
        }
    }

    public int a(boolean z6) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z6) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i6, b bVar, c cVar, int i7, boolean z6) {
        int i8 = f(i6, bVar).f6663c;
        if (n(i8, cVar).f6698o != i6) {
            return i6 + 1;
        }
        int e6 = e(i8, i7, z6);
        if (e6 == -1) {
            return -1;
        }
        return n(e6, cVar).f6697n;
    }

    public int e(int i6, int i7, boolean z6) {
        if (i7 == 0) {
            if (i6 == c(z6)) {
                return -1;
            }
            return i6 + 1;
        }
        if (i7 == 1) {
            return i6;
        }
        if (i7 == 2) {
            return i6 == c(z6) ? a(z6) : i6 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g6 = (G) obj;
        if (g6.p() != p() || g6.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i6 = 0; i6 < p(); i6++) {
            if (!n(i6, cVar).equals(g6.n(i6, cVar2))) {
                return false;
            }
        }
        for (int i7 = 0; i7 < i(); i7++) {
            if (!g(i7, bVar, true).equals(g6.g(i7, bVar2, true))) {
                return false;
            }
        }
        int a6 = a(true);
        if (a6 != g6.a(true) || (c6 = c(true)) != g6.c(true)) {
            return false;
        }
        while (a6 != c6) {
            int e6 = e(a6, 0, true);
            if (e6 != g6.e(a6, 0, true)) {
                return false;
            }
            a6 = e6;
        }
        return true;
    }

    public final b f(int i6, b bVar) {
        return g(i6, bVar, false);
    }

    public abstract b g(int i6, b bVar, boolean z6);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p6 = 217 + p();
        for (int i6 = 0; i6 < p(); i6++) {
            p6 = (p6 * 31) + n(i6, cVar).hashCode();
        }
        int i7 = (p6 * 31) + i();
        for (int i8 = 0; i8 < i(); i8++) {
            i7 = (i7 * 31) + g(i8, bVar, true).hashCode();
        }
        int a6 = a(true);
        while (a6 != -1) {
            i7 = (i7 * 31) + a6;
            a6 = e(a6, 0, true);
        }
        return i7;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i6, long j6) {
        return (Pair) AbstractC1119a.e(k(cVar, bVar, i6, j6, 0L));
    }

    public final Pair k(c cVar, b bVar, int i6, long j6, long j7) {
        AbstractC1119a.c(i6, 0, p());
        o(i6, cVar, j7);
        if (j6 == -9223372036854775807L) {
            j6 = cVar.c();
            if (j6 == -9223372036854775807L) {
                return null;
            }
        }
        int i7 = cVar.f6697n;
        f(i7, bVar);
        while (i7 < cVar.f6698o && bVar.f6665e != j6) {
            int i8 = i7 + 1;
            if (f(i8, bVar).f6665e > j6) {
                break;
            }
            i7 = i8;
        }
        g(i7, bVar, true);
        long j8 = j6 - bVar.f6665e;
        long j9 = bVar.f6664d;
        if (j9 != -9223372036854775807L) {
            j8 = Math.min(j8, j9 - 1);
        }
        return Pair.create(AbstractC1119a.e(bVar.f6662b), Long.valueOf(Math.max(0L, j8)));
    }

    public int l(int i6, int i7, boolean z6) {
        if (i7 == 0) {
            if (i6 == a(z6)) {
                return -1;
            }
            return i6 - 1;
        }
        if (i7 == 1) {
            return i6;
        }
        if (i7 == 2) {
            return i6 == a(z6) ? c(z6) : i6 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i6);

    public final c n(int i6, c cVar) {
        return o(i6, cVar, 0L);
    }

    public abstract c o(int i6, c cVar, long j6);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i6, b bVar, c cVar, int i7, boolean z6) {
        return d(i6, bVar, cVar, i7, z6) == -1;
    }
}
