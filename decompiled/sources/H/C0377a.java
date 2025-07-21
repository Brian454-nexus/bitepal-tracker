package H;

import H.C0385i;

/* renamed from: H.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0377a extends C0385i.a {

    /* renamed from: a, reason: collision with root package name */
    public final T.A f1974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1975b;

    public C0377a(T.A a6, int i6) {
        if (a6 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1974a = a6;
        this.f1975b = i6;
    }

    @Override // H.C0385i.a
    public int a() {
        return this.f1975b;
    }

    @Override // H.C0385i.a
    public T.A b() {
        return this.f1974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0385i.a) {
            C0385i.a aVar = (C0385i.a) obj;
            if (this.f1974a.equals(aVar.b()) && this.f1975b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1974a.hashCode() ^ 1000003) * 1000003) ^ this.f1975b;
    }

    public String toString() {
        return "In{packet=" + this.f1974a + ", jpegQuality=" + this.f1975b + "}";
    }
}
