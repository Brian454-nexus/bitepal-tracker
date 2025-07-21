package H;

import H.F;
import T.C0766v;

/* renamed from: H.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0382f extends F.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0766v f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1992c;

    public C0382f(C0766v c0766v, int i6, int i7) {
        if (c0766v == null) {
            throw new NullPointerException("Null edge");
        }
        this.f1990a = c0766v;
        this.f1991b = i6;
        this.f1992c = i7;
    }

    @Override // H.F.a
    public C0766v a() {
        return this.f1990a;
    }

    @Override // H.F.a
    public int b() {
        return this.f1991b;
    }

    @Override // H.F.a
    public int c() {
        return this.f1992c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a) {
            F.a aVar = (F.a) obj;
            if (this.f1990a.equals(aVar.a()) && this.f1991b == aVar.b() && this.f1992c == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1990a.hashCode() ^ 1000003) * 1000003) ^ this.f1991b) * 1000003) ^ this.f1992c;
    }

    public String toString() {
        return "In{edge=" + this.f1990a + ", inputFormat=" + this.f1991b + ", outputFormat=" + this.f1992c + "}";
    }
}
