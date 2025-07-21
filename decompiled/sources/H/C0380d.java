package H;

import H.C0393q;

/* renamed from: H.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0380d extends C0393q.a {

    /* renamed from: a, reason: collision with root package name */
    public final T.A f1986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1987b;

    public C0380d(T.A a6, int i6) {
        if (a6 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1986a = a6;
        this.f1987b = i6;
    }

    @Override // H.C0393q.a
    public int a() {
        return this.f1987b;
    }

    @Override // H.C0393q.a
    public T.A b() {
        return this.f1986a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0393q.a) {
            C0393q.a aVar = (C0393q.a) obj;
            if (this.f1986a.equals(aVar.b()) && this.f1987b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1986a.hashCode() ^ 1000003) * 1000003) ^ this.f1987b;
    }

    public String toString() {
        return "In{packet=" + this.f1986a + ", jpegQuality=" + this.f1987b + "}";
    }
}
