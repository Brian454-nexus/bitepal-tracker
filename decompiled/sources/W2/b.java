package W2;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final C0097b f5535i = new C0097b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final b f5536j = new b(null, false, false, false, false, 0, 0, null, 255, null);

    /* renamed from: a, reason: collision with root package name */
    public final l f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5538b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5539c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5540d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5541e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5542f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5543g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f5544h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5545a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5546b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5548d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5549e;

        /* renamed from: c, reason: collision with root package name */
        public l f5547c = l.NOT_REQUIRED;

        /* renamed from: f, reason: collision with root package name */
        public long f5550f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5551g = -1;

        /* renamed from: h, reason: collision with root package name */
        public Set f5552h = new LinkedHashSet();

        public final b a() {
            Set set = CollectionsKt.toSet(this.f5552h);
            long j6 = this.f5550f;
            long j7 = this.f5551g;
            return new b(this.f5547c, this.f5545a, this.f5546b, this.f5548d, this.f5549e, j6, j7, set);
        }

        public final a b(l networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f5547c = networkType;
            return this;
        }
    }

    /* renamed from: W2.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0097b {
        public /* synthetic */ C0097b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0097b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f5553a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5554b;

        public c(Uri uri, boolean z6) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f5553a = uri;
            this.f5554b = z6;
        }

        public final Uri a() {
            return this.f5553a;
        }

        public final boolean b() {
            return this.f5554b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f5553a, cVar.f5553a) && this.f5554b == cVar.f5554b;
        }

        public int hashCode() {
            return (this.f5553a.hashCode() * 31) + Boolean.hashCode(this.f5554b);
        }
    }

    public b(l requiredNetworkType, boolean z6, boolean z7, boolean z8, boolean z9, long j6, long j7, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f5537a = requiredNetworkType;
        this.f5538b = z6;
        this.f5539c = z7;
        this.f5540d = z8;
        this.f5541e = z9;
        this.f5542f = j6;
        this.f5543g = j7;
        this.f5544h = contentUriTriggers;
    }

    public final long a() {
        return this.f5543g;
    }

    public final long b() {
        return this.f5542f;
    }

    public final Set c() {
        return this.f5544h;
    }

    public final l d() {
        return this.f5537a;
    }

    public final boolean e() {
        return !this.f5544h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5538b == bVar.f5538b && this.f5539c == bVar.f5539c && this.f5540d == bVar.f5540d && this.f5541e == bVar.f5541e && this.f5542f == bVar.f5542f && this.f5543g == bVar.f5543g && this.f5537a == bVar.f5537a) {
            return Intrinsics.areEqual(this.f5544h, bVar.f5544h);
        }
        return false;
    }

    public final boolean f() {
        return this.f5540d;
    }

    public final boolean g() {
        return this.f5538b;
    }

    public final boolean h() {
        return this.f5539c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f5537a.hashCode() * 31) + (this.f5538b ? 1 : 0)) * 31) + (this.f5539c ? 1 : 0)) * 31) + (this.f5540d ? 1 : 0)) * 31) + (this.f5541e ? 1 : 0)) * 31;
        long j6 = this.f5542f;
        int i6 = (hashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f5543g;
        return ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f5544h.hashCode();
    }

    public final boolean i() {
        return this.f5541e;
    }

    public /* synthetic */ b(l lVar, boolean z6, boolean z7, boolean z8, boolean z9, long j6, long j7, Set set, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? l.NOT_REQUIRED : lVar, (i6 & 2) != 0 ? false : z6, (i6 & 4) != 0 ? false : z7, (i6 & 8) != 0 ? false : z8, (i6 & 16) != 0 ? false : z9, (i6 & 32) != 0 ? -1L : j6, (i6 & 64) != 0 ? -1L : j7, (i6 & 128) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(W2.b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            boolean r3 = r13.f5538b
            boolean r4 = r13.f5539c
            W2.l r2 = r13.f5537a
            boolean r5 = r13.f5540d
            boolean r6 = r13.f5541e
            java.util.Set r11 = r13.f5544h
            long r7 = r13.f5542f
            long r9 = r13.f5543g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.b.<init>(W2.b):void");
    }
}
