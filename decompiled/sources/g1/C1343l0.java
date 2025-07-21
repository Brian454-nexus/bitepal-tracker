package g1;

import c1.AbstractC1119a;

/* renamed from: g1.l0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1343l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14722a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14723b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14724c;

    /* renamed from: g1.l0$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long f14725a;

        /* renamed from: b, reason: collision with root package name */
        public float f14726b;

        /* renamed from: c, reason: collision with root package name */
        public long f14727c;

        public C1343l0 d() {
            return new C1343l0(this);
        }

        public b e(long j6) {
            AbstractC1119a.a(j6 >= 0 || j6 == -9223372036854775807L);
            this.f14727c = j6;
            return this;
        }

        public b f(long j6) {
            this.f14725a = j6;
            return this;
        }

        public b g(float f6) {
            AbstractC1119a.a(f6 > 0.0f || f6 == -3.4028235E38f);
            this.f14726b = f6;
            return this;
        }

        public b() {
            this.f14725a = -9223372036854775807L;
            this.f14726b = -3.4028235E38f;
            this.f14727c = -9223372036854775807L;
        }

        public b(C1343l0 c1343l0) {
            this.f14725a = c1343l0.f14722a;
            this.f14726b = c1343l0.f14723b;
            this.f14727c = c1343l0.f14724c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343l0)) {
            return false;
        }
        C1343l0 c1343l0 = (C1343l0) obj;
        return this.f14722a == c1343l0.f14722a && this.f14723b == c1343l0.f14723b && this.f14724c == c1343l0.f14724c;
    }

    public int hashCode() {
        return y6.k.b(new Object[]{Long.valueOf(this.f14722a), Float.valueOf(this.f14723b), Long.valueOf(this.f14724c)});
    }

    public C1343l0(b bVar) {
        this.f14722a = bVar.f14725a;
        this.f14723b = bVar.f14726b;
        this.f14724c = bVar.f14727c;
    }
}
