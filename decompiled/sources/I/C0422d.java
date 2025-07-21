package I;

import I.P;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0422d extends P.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2427c;

    public C0422d(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f2425a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f2426b = cls;
        this.f2427c = obj;
    }

    @Override // I.P.a
    public String c() {
        return this.f2425a;
    }

    @Override // I.P.a
    public Object d() {
        return this.f2427c;
    }

    @Override // I.P.a
    public Class e() {
        return this.f2426b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.a) {
            P.a aVar = (P.a) obj;
            if (this.f2425a.equals(aVar.c()) && this.f2426b.equals(aVar.e()) && ((obj2 = this.f2427c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f2425a.hashCode() ^ 1000003) * 1000003) ^ this.f2426b.hashCode()) * 1000003;
        Object obj = this.f2427c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f2425a + ", valueClass=" + this.f2426b + ", token=" + this.f2427c + "}";
    }
}
