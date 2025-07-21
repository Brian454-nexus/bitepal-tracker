package H;

import H.C0392p;
import T.C0766v;

/* renamed from: H.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0379c extends C0392p.c {

    /* renamed from: a, reason: collision with root package name */
    public final C0766v f1982a;

    /* renamed from: b, reason: collision with root package name */
    public final C0766v f1983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1985d;

    public C0379c(C0766v c0766v, C0766v c0766v2, int i6, int i7) {
        if (c0766v == null) {
            throw new NullPointerException("Null imageEdge");
        }
        this.f1982a = c0766v;
        if (c0766v2 == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f1983b = c0766v2;
        this.f1984c = i6;
        this.f1985d = i7;
    }

    @Override // H.C0392p.c
    public C0766v a() {
        return this.f1982a;
    }

    @Override // H.C0392p.c
    public int b() {
        return this.f1984c;
    }

    @Override // H.C0392p.c
    public int c() {
        return this.f1985d;
    }

    @Override // H.C0392p.c
    public C0766v d() {
        return this.f1983b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0392p.c) {
            C0392p.c cVar = (C0392p.c) obj;
            if (this.f1982a.equals(cVar.a()) && this.f1983b.equals(cVar.d()) && this.f1984c == cVar.b() && this.f1985d == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f1982a.hashCode() ^ 1000003) * 1000003) ^ this.f1983b.hashCode()) * 1000003) ^ this.f1984c) * 1000003) ^ this.f1985d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f1982a + ", requestEdge=" + this.f1983b + ", inputFormat=" + this.f1984c + ", outputFormat=" + this.f1985d + "}";
    }
}
