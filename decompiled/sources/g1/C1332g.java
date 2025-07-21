package g1;

import c1.AbstractC1119a;

/* renamed from: g1.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1332g {

    /* renamed from: a, reason: collision with root package name */
    public final String f14566a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0.q f14567b;

    /* renamed from: c, reason: collision with root package name */
    public final Z0.q f14568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14569d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14570e;

    public C1332g(String str, Z0.q qVar, Z0.q qVar2, int i6, int i7) {
        AbstractC1119a.a(i6 == 0 || i7 == 0);
        this.f14566a = AbstractC1119a.d(str);
        this.f14567b = (Z0.q) AbstractC1119a.e(qVar);
        this.f14568c = (Z0.q) AbstractC1119a.e(qVar2);
        this.f14569d = i6;
        this.f14570e = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1332g.class == obj.getClass()) {
            C1332g c1332g = (C1332g) obj;
            if (this.f14569d == c1332g.f14569d && this.f14570e == c1332g.f14570e && this.f14566a.equals(c1332g.f14566a) && this.f14567b.equals(c1332g.f14567b) && this.f14568c.equals(c1332g.f14568c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f14569d) * 31) + this.f14570e) * 31) + this.f14566a.hashCode()) * 31) + this.f14567b.hashCode()) * 31) + this.f14568c.hashCode();
    }
}
