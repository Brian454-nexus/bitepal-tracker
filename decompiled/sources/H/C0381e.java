package H;

import F.X;
import H.C0396u;

/* renamed from: H.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0381e extends C0396u.a {

    /* renamed from: a, reason: collision with root package name */
    public final T.A f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final X.g f1989b;

    public C0381e(T.A a6, X.g gVar) {
        if (a6 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f1988a = a6;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f1989b = gVar;
    }

    @Override // H.C0396u.a
    public X.g a() {
        return this.f1989b;
    }

    @Override // H.C0396u.a
    public T.A b() {
        return this.f1988a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0396u.a) {
            C0396u.a aVar = (C0396u.a) obj;
            if (this.f1988a.equals(aVar.b()) && this.f1989b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1988a.hashCode() ^ 1000003) * 1000003) ^ this.f1989b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f1988a + ", outputFileOptions=" + this.f1989b + "}";
    }
}
