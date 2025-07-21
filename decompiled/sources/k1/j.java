package k1;

import Z0.q;
import android.net.Uri;
import c1.AbstractC1119a;
import java.util.Collections;
import java.util.List;
import k1.k;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f16365a;

    /* renamed from: b, reason: collision with root package name */
    public final q f16366b;

    /* renamed from: c, reason: collision with root package name */
    public final w f16367c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16368d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16369e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16370f;

    /* renamed from: g, reason: collision with root package name */
    public final List f16371g;

    /* renamed from: h, reason: collision with root package name */
    public final i f16372h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends j implements j1.g {

        /* renamed from: i, reason: collision with root package name */
        public final k.a f16373i;

        public b(long j6, q qVar, List list, k.a aVar, List list2, List list3, List list4) {
            super(j6, qVar, list, aVar, list2, list3, list4);
            this.f16373i = aVar;
        }

        @Override // j1.g
        public long a(long j6, long j7) {
            return this.f16373i.h(j6, j7);
        }

        @Override // j1.g
        public long b(long j6) {
            return this.f16373i.j(j6);
        }

        @Override // j1.g
        public long c(long j6, long j7) {
            return this.f16373i.d(j6, j7);
        }

        @Override // j1.g
        public long d(long j6, long j7) {
            return this.f16373i.f(j6, j7);
        }

        @Override // j1.g
        public i e(long j6) {
            return this.f16373i.k(this, j6);
        }

        @Override // j1.g
        public long f(long j6, long j7) {
            return this.f16373i.i(j6, j7);
        }

        @Override // j1.g
        public boolean g() {
            return this.f16373i.l();
        }

        @Override // j1.g
        public long h() {
            return this.f16373i.e();
        }

        @Override // j1.g
        public long i(long j6) {
            return this.f16373i.g(j6);
        }

        @Override // j1.g
        public long j(long j6, long j7) {
            return this.f16373i.c(j6, j7);
        }

        @Override // k1.j
        public String k() {
            return null;
        }

        @Override // k1.j
        public j1.g l() {
            return this;
        }

        @Override // k1.j
        public i m() {
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends j {

        /* renamed from: i, reason: collision with root package name */
        public final Uri f16374i;

        /* renamed from: j, reason: collision with root package name */
        public final long f16375j;

        /* renamed from: k, reason: collision with root package name */
        public final String f16376k;

        /* renamed from: l, reason: collision with root package name */
        public final i f16377l;

        /* renamed from: m, reason: collision with root package name */
        public final m f16378m;

        public c(long j6, q qVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j7) {
            super(j6, qVar, list, eVar, list2, list3, list4);
            this.f16374i = Uri.parse(((C1658b) list.get(0)).f16312a);
            i c6 = eVar.c();
            this.f16377l = c6;
            this.f16376k = str;
            this.f16375j = j7;
            this.f16378m = c6 != null ? null : new m(new i(null, 0L, j7));
        }

        @Override // k1.j
        public String k() {
            return this.f16376k;
        }

        @Override // k1.j
        public j1.g l() {
            return this.f16378m;
        }

        @Override // k1.j
        public i m() {
            return this.f16377l;
        }
    }

    public static j o(long j6, q qVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j6, qVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j6, qVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract j1.g l();

    public abstract i m();

    public i n() {
        return this.f16372h;
    }

    public j(long j6, q qVar, List list, k kVar, List list2, List list3, List list4) {
        List unmodifiableList;
        AbstractC1119a.a(!list.isEmpty());
        this.f16365a = j6;
        this.f16366b = qVar;
        this.f16367c = w.s(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f16369e = unmodifiableList;
        this.f16370f = list3;
        this.f16371g = list4;
        this.f16372h = kVar.a(this);
        this.f16368d = kVar.b();
    }
}
