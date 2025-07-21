package f3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static final a f14114u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final String f14115v;

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC2069a f14116w;

    /* renamed from: a, reason: collision with root package name */
    public final String f14117a;

    /* renamed from: b, reason: collision with root package name */
    public W2.u f14118b;

    /* renamed from: c, reason: collision with root package name */
    public String f14119c;

    /* renamed from: d, reason: collision with root package name */
    public String f14120d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f14121e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f14122f;

    /* renamed from: g, reason: collision with root package name */
    public long f14123g;

    /* renamed from: h, reason: collision with root package name */
    public long f14124h;

    /* renamed from: i, reason: collision with root package name */
    public long f14125i;

    /* renamed from: j, reason: collision with root package name */
    public W2.b f14126j;

    /* renamed from: k, reason: collision with root package name */
    public int f14127k;

    /* renamed from: l, reason: collision with root package name */
    public W2.a f14128l;

    /* renamed from: m, reason: collision with root package name */
    public long f14129m;

    /* renamed from: n, reason: collision with root package name */
    public long f14130n;

    /* renamed from: o, reason: collision with root package name */
    public long f14131o;

    /* renamed from: p, reason: collision with root package name */
    public long f14132p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14133q;

    /* renamed from: r, reason: collision with root package name */
    public W2.o f14134r;

    /* renamed from: s, reason: collision with root package name */
    public int f14135s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14136t;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f14137a;

        /* renamed from: b, reason: collision with root package name */
        public W2.u f14138b;

        public b(String id, W2.u state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f14137a = id;
            this.f14138b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f14137a, bVar.f14137a) && this.f14138b == bVar.f14138b;
        }

        public int hashCode() {
            return (this.f14137a.hashCode() * 31) + this.f14138b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f14137a + ", state=" + this.f14138b + ')';
        }
    }

    static {
        String i6 = W2.k.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"WorkSpec\")");
        f14115v = i6;
        f14116w = new InterfaceC2069a() { // from class: f3.t
            @Override // t.InterfaceC2069a
            public final Object apply(Object obj) {
                List b6;
                b6 = u.b((List) obj);
                return b6;
            }
        };
    }

    public u(String id, W2.u state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j6, long j7, long j8, W2.b constraints, int i6, W2.a backoffPolicy, long j9, long j10, long j11, long j12, boolean z6, W2.o outOfQuotaPolicy, int i7, int i8) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f14117a = id;
        this.f14118b = state;
        this.f14119c = workerClassName;
        this.f14120d = str;
        this.f14121e = input;
        this.f14122f = output;
        this.f14123g = j6;
        this.f14124h = j7;
        this.f14125i = j8;
        this.f14126j = constraints;
        this.f14127k = i6;
        this.f14128l = backoffPolicy;
        this.f14129m = j9;
        this.f14130n = j10;
        this.f14131o = j11;
        this.f14132p = j12;
        this.f14133q = z6;
        this.f14134r = outOfQuotaPolicy;
        this.f14135s = i7;
        this.f14136t = i8;
    }

    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public static /* synthetic */ u e(u uVar, String str, W2.u uVar2, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j6, long j7, long j8, W2.b bVar3, int i6, W2.a aVar, long j9, long j10, long j11, long j12, boolean z6, W2.o oVar, int i7, int i8, int i9, Object obj) {
        int i10;
        W2.o oVar2;
        String str4 = (i9 & 1) != 0 ? uVar.f14117a : str;
        W2.u uVar3 = (i9 & 2) != 0 ? uVar.f14118b : uVar2;
        String str5 = (i9 & 4) != 0 ? uVar.f14119c : str2;
        String str6 = (i9 & 8) != 0 ? uVar.f14120d : str3;
        androidx.work.b bVar4 = (i9 & 16) != 0 ? uVar.f14121e : bVar;
        androidx.work.b bVar5 = (i9 & 32) != 0 ? uVar.f14122f : bVar2;
        long j13 = (i9 & 64) != 0 ? uVar.f14123g : j6;
        long j14 = (i9 & 128) != 0 ? uVar.f14124h : j7;
        long j15 = (i9 & 256) != 0 ? uVar.f14125i : j8;
        W2.b bVar6 = (i9 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? uVar.f14126j : bVar3;
        int i11 = (i9 & 1024) != 0 ? uVar.f14127k : i6;
        String str7 = str4;
        W2.a aVar2 = (i9 & 2048) != 0 ? uVar.f14128l : aVar;
        W2.u uVar4 = uVar3;
        long j16 = (i9 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? uVar.f14129m : j9;
        long j17 = (i9 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? uVar.f14130n : j10;
        long j18 = (i9 & 16384) != 0 ? uVar.f14131o : j11;
        long j19 = (i9 & 32768) != 0 ? uVar.f14132p : j12;
        boolean z7 = (i9 & 65536) != 0 ? uVar.f14133q : z6;
        long j20 = j19;
        W2.o oVar3 = (i9 & 131072) != 0 ? uVar.f14134r : oVar;
        int i12 = (i9 & 262144) != 0 ? uVar.f14135s : i7;
        if ((i9 & 524288) != 0) {
            oVar2 = oVar3;
            i10 = uVar.f14136t;
        } else {
            i10 = i8;
            oVar2 = oVar3;
        }
        return uVar.d(str7, uVar4, str5, str6, bVar4, bVar5, j13, j14, j15, bVar6, i11, aVar2, j16, j17, j18, j20, z7, oVar2, i12, i10);
    }

    public final long c() {
        if (i()) {
            return this.f14130n + RangesKt.coerceAtMost(this.f14128l == W2.a.LINEAR ? this.f14129m * this.f14127k : Math.scalb((float) this.f14129m, this.f14127k - 1), 18000000L);
        }
        if (!j()) {
            long j6 = this.f14130n;
            if (j6 == 0) {
                j6 = System.currentTimeMillis();
            }
            return j6 + this.f14123g;
        }
        int i6 = this.f14135s;
        long j7 = this.f14130n;
        if (i6 == 0) {
            j7 += this.f14123g;
        }
        long j8 = this.f14125i;
        long j9 = this.f14124h;
        if (j8 != j9) {
            return j7 + j9 + (i6 == 0 ? (-1) * j8 : 0L);
        }
        return j7 + (i6 != 0 ? j9 : 0L);
    }

    public final u d(String id, W2.u state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j6, long j7, long j8, W2.b constraints, int i6, W2.a backoffPolicy, long j9, long j10, long j11, long j12, boolean z6, W2.o outOfQuotaPolicy, int i7, int i8) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new u(id, state, workerClassName, str, input, output, j6, j7, j8, constraints, i6, backoffPolicy, j9, j10, j11, j12, z6, outOfQuotaPolicy, i7, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f14117a, uVar.f14117a) && this.f14118b == uVar.f14118b && Intrinsics.areEqual(this.f14119c, uVar.f14119c) && Intrinsics.areEqual(this.f14120d, uVar.f14120d) && Intrinsics.areEqual(this.f14121e, uVar.f14121e) && Intrinsics.areEqual(this.f14122f, uVar.f14122f) && this.f14123g == uVar.f14123g && this.f14124h == uVar.f14124h && this.f14125i == uVar.f14125i && Intrinsics.areEqual(this.f14126j, uVar.f14126j) && this.f14127k == uVar.f14127k && this.f14128l == uVar.f14128l && this.f14129m == uVar.f14129m && this.f14130n == uVar.f14130n && this.f14131o == uVar.f14131o && this.f14132p == uVar.f14132p && this.f14133q == uVar.f14133q && this.f14134r == uVar.f14134r && this.f14135s == uVar.f14135s && this.f14136t == uVar.f14136t;
    }

    public final int f() {
        return this.f14136t;
    }

    public final int g() {
        return this.f14135s;
    }

    public final boolean h() {
        return !Intrinsics.areEqual(W2.b.f5536j, this.f14126j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f14117a.hashCode() * 31) + this.f14118b.hashCode()) * 31) + this.f14119c.hashCode()) * 31;
        String str = this.f14120d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14121e.hashCode()) * 31) + this.f14122f.hashCode()) * 31) + Long.hashCode(this.f14123g)) * 31) + Long.hashCode(this.f14124h)) * 31) + Long.hashCode(this.f14125i)) * 31) + this.f14126j.hashCode()) * 31) + Integer.hashCode(this.f14127k)) * 31) + this.f14128l.hashCode()) * 31) + Long.hashCode(this.f14129m)) * 31) + Long.hashCode(this.f14130n)) * 31) + Long.hashCode(this.f14131o)) * 31) + Long.hashCode(this.f14132p)) * 31;
        boolean z6 = this.f14133q;
        int i6 = z6;
        if (z6 != 0) {
            i6 = 1;
        }
        return ((((((hashCode2 + i6) * 31) + this.f14134r.hashCode()) * 31) + Integer.hashCode(this.f14135s)) * 31) + Integer.hashCode(this.f14136t);
    }

    public final boolean i() {
        return this.f14118b == W2.u.ENQUEUED && this.f14127k > 0;
    }

    public final boolean j() {
        return this.f14124h != 0;
    }

    public final void k(long j6) {
        if (j6 < 900000) {
            W2.k.e().k(f14115v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        l(RangesKt.coerceAtLeast(j6, 900000L), RangesKt.coerceAtLeast(j6, 900000L));
    }

    public final void l(long j6, long j7) {
        if (j6 < 900000) {
            W2.k.e().k(f14115v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f14124h = RangesKt.coerceAtLeast(j6, 900000L);
        if (j7 < 300000) {
            W2.k.e().k(f14115v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j7 > this.f14124h) {
            W2.k.e().k(f14115v, "Flex duration greater than interval duration; Changed to " + j6);
        }
        this.f14125i = RangesKt.coerceIn(j7, 300000L, this.f14124h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f14117a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ u(java.lang.String r31, W2.u r32, java.lang.String r33, java.lang.String r34, androidx.work.b r35, androidx.work.b r36, long r37, long r39, long r41, W2.b r43, int r44, W2.a r45, long r46, long r48, long r50, long r52, boolean r54, W2.o r55, int r56, int r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.u.<init>(java.lang.String, W2.u, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, W2.b, int, W2.a, long, long, long, long, boolean, W2.o, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String newId, u other) {
        this(newId, other.f14118b, other.f14119c, other.f14120d, new androidx.work.b(other.f14121e), new androidx.work.b(other.f14122f), other.f14123g, other.f14124h, other.f14125i, new W2.b(other.f14126j), other.f14127k, other.f14128l, other.f14129m, other.f14130n, other.f14131o, other.f14132p, other.f14133q, other.f14134r, other.f14135s, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
