package f3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1294d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14085a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14086b;

    public C1294d(String key, Long l6) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14085a = key;
        this.f14086b = l6;
    }

    public final String a() {
        return this.f14085a;
    }

    public final Long b() {
        return this.f14086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294d)) {
            return false;
        }
        C1294d c1294d = (C1294d) obj;
        return Intrinsics.areEqual(this.f14085a, c1294d.f14085a) && Intrinsics.areEqual(this.f14086b, c1294d.f14086b);
    }

    public int hashCode() {
        int hashCode = this.f14085a.hashCode() * 31;
        Long l6 = this.f14086b;
        return hashCode + (l6 == null ? 0 : l6.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f14085a + ", value=" + this.f14086b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1294d(String key, boolean z6) {
        this(key, Long.valueOf(z6 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
