package n1;

import Z0.C0841m;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z6.D;
import z6.w;
import z6.y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f17495d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17496e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17497f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17498g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17499h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17500i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17501j;

    /* renamed from: k, reason: collision with root package name */
    public final long f17502k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17503l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17504m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17505n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17506o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17507p;

    /* renamed from: q, reason: collision with root package name */
    public final C0841m f17508q;

    /* renamed from: r, reason: collision with root package name */
    public final List f17509r;

    /* renamed from: s, reason: collision with root package name */
    public final List f17510s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f17511t;

    /* renamed from: u, reason: collision with root package name */
    public final long f17512u;

    /* renamed from: v, reason: collision with root package name */
    public final C0222f f17513v;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends e {

        /* renamed from: l, reason: collision with root package name */
        public final boolean f17514l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f17515m;

        public b(String str, d dVar, long j6, int i6, long j7, C0841m c0841m, String str2, String str3, long j8, long j9, boolean z6, boolean z7, boolean z8) {
            super(str, dVar, j6, i6, j7, c0841m, str2, str3, j8, j9, z6);
            this.f17514l = z7;
            this.f17515m = z8;
        }

        public b b(long j6, int i6) {
            return new b(this.f17521a, this.f17522b, this.f17523c, i6, j6, this.f17526f, this.f17527g, this.f17528h, this.f17529i, this.f17530j, this.f17531k, this.f17514l, this.f17515m);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f17516a;

        /* renamed from: b, reason: collision with root package name */
        public final long f17517b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17518c;

        public c(Uri uri, long j6, int i6) {
            this.f17516a = uri;
            this.f17517b = j6;
            this.f17518c = i6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final String f17521a;

        /* renamed from: b, reason: collision with root package name */
        public final d f17522b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17523c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17524d;

        /* renamed from: e, reason: collision with root package name */
        public final long f17525e;

        /* renamed from: f, reason: collision with root package name */
        public final C0841m f17526f;

        /* renamed from: g, reason: collision with root package name */
        public final String f17527g;

        /* renamed from: h, reason: collision with root package name */
        public final String f17528h;

        /* renamed from: i, reason: collision with root package name */
        public final long f17529i;

        /* renamed from: j, reason: collision with root package name */
        public final long f17530j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f17531k;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l6) {
            if (this.f17525e > l6.longValue()) {
                return 1;
            }
            return this.f17525e < l6.longValue() ? -1 : 0;
        }

        public e(String str, d dVar, long j6, int i6, long j7, C0841m c0841m, String str2, String str3, long j8, long j9, boolean z6) {
            this.f17521a = str;
            this.f17522b = dVar;
            this.f17523c = j6;
            this.f17524d = i6;
            this.f17525e = j7;
            this.f17526f = c0841m;
            this.f17527g = str2;
            this.f17528h = str3;
            this.f17529i = j8;
            this.f17530j = j9;
            this.f17531k = z6;
        }
    }

    /* renamed from: n1.f$f, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0222f {

        /* renamed from: a, reason: collision with root package name */
        public final long f17532a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17533b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17534c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17535d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f17536e;

        public C0222f(long j6, boolean z6, long j7, long j8, boolean z7) {
            this.f17532a = j6;
            this.f17533b = z6;
            this.f17534c = j7;
            this.f17535d = j8;
            this.f17536e = z7;
        }
    }

    public f(int i6, String str, List list, long j6, boolean z6, long j7, boolean z7, int i7, long j8, int i8, long j9, long j10, boolean z8, boolean z9, boolean z10, C0841m c0841m, List list2, List list3, C0222f c0222f, Map map) {
        super(str, list, z8);
        this.f17495d = i6;
        this.f17499h = j7;
        this.f17498g = z6;
        this.f17500i = z7;
        this.f17501j = i7;
        this.f17502k = j8;
        this.f17503l = i8;
        this.f17504m = j9;
        this.f17505n = j10;
        this.f17506o = z9;
        this.f17507p = z10;
        this.f17508q = c0841m;
        this.f17509r = w.s(list2);
        this.f17510s = w.s(list3);
        this.f17511t = y.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) D.d(list3);
            this.f17512u = bVar.f17525e + bVar.f17523c;
        } else if (list2.isEmpty()) {
            this.f17512u = 0L;
        } else {
            d dVar = (d) D.d(list2);
            this.f17512u = dVar.f17525e + dVar.f17523c;
        }
        this.f17496e = j6 != -9223372036854775807L ? j6 >= 0 ? Math.min(this.f17512u, j6) : Math.max(0L, this.f17512u + j6) : -9223372036854775807L;
        this.f17497f = j6 >= 0;
        this.f17513v = c0222f;
    }

    @Override // r1.InterfaceC2021a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }

    public f c(long j6, int i6) {
        return new f(this.f17495d, this.f17558a, this.f17559b, this.f17496e, this.f17498g, j6, true, i6, this.f17502k, this.f17503l, this.f17504m, this.f17505n, this.f17560c, this.f17506o, this.f17507p, this.f17508q, this.f17509r, this.f17510s, this.f17513v, this.f17511t);
    }

    public f d() {
        return this.f17506o ? this : new f(this.f17495d, this.f17558a, this.f17559b, this.f17496e, this.f17498g, this.f17499h, this.f17500i, this.f17501j, this.f17502k, this.f17503l, this.f17504m, this.f17505n, this.f17560c, true, this.f17507p, this.f17508q, this.f17509r, this.f17510s, this.f17513v, this.f17511t);
    }

    public long e() {
        return this.f17499h + this.f17512u;
    }

    public boolean f(f fVar) {
        if (fVar != null) {
            long j6 = this.f17502k;
            long j7 = fVar.f17502k;
            if (j6 <= j7) {
                if (j6 < j7) {
                    return false;
                }
                int size = this.f17509r.size() - fVar.f17509r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f17510s.size();
                int size3 = fVar.f17510s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f17506o || fVar.f17506o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends e {

        /* renamed from: l, reason: collision with root package name */
        public final String f17519l;

        /* renamed from: m, reason: collision with root package name */
        public final List f17520m;

        public d(String str, long j6, long j7, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j6, j7, false, w.w());
        }

        public d b(long j6, int i6) {
            ArrayList arrayList = new ArrayList();
            long j7 = j6;
            for (int i7 = 0; i7 < this.f17520m.size(); i7++) {
                b bVar = (b) this.f17520m.get(i7);
                arrayList.add(bVar.b(j7, i6));
                j7 += bVar.f17523c;
            }
            return new d(this.f17521a, this.f17522b, this.f17519l, this.f17523c, i6, j6, this.f17526f, this.f17527g, this.f17528h, this.f17529i, this.f17530j, this.f17531k, arrayList);
        }

        public d(String str, d dVar, String str2, long j6, int i6, long j7, C0841m c0841m, String str3, String str4, long j8, long j9, boolean z6, List list) {
            super(str, dVar, j6, i6, j7, c0841m, str3, str4, j8, j9, z6);
            this.f17519l = str2;
            this.f17520m = w.s(list);
        }
    }
}
