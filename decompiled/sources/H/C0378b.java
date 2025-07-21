package H;

import F.InterfaceC0327e0;
import H.C0392p;
import T.C0766v;
import android.util.Size;

/* renamed from: H.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0378b extends C0392p.b {

    /* renamed from: c, reason: collision with root package name */
    public final Size f1976c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1977d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1978e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1979f;

    /* renamed from: g, reason: collision with root package name */
    public final C0766v f1980g;

    /* renamed from: h, reason: collision with root package name */
    public final C0766v f1981h;

    public C0378b(Size size, int i6, int i7, boolean z6, InterfaceC0327e0 interfaceC0327e0, C0766v c0766v, C0766v c0766v2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f1976c = size;
        this.f1977d = i6;
        this.f1978e = i7;
        this.f1979f = z6;
        if (c0766v == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f1980g = c0766v;
        if (c0766v2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f1981h = c0766v2;
    }

    @Override // H.C0392p.b
    public C0766v b() {
        return this.f1981h;
    }

    @Override // H.C0392p.b
    public InterfaceC0327e0 c() {
        return null;
    }

    @Override // H.C0392p.b
    public int d() {
        return this.f1977d;
    }

    @Override // H.C0392p.b
    public int e() {
        return this.f1978e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0392p.b) {
            C0392p.b bVar = (C0392p.b) obj;
            if (this.f1976c.equals(bVar.g()) && this.f1977d == bVar.d() && this.f1978e == bVar.e() && this.f1979f == bVar.i()) {
                bVar.c();
                if (this.f1980g.equals(bVar.f()) && this.f1981h.equals(bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // H.C0392p.b
    public C0766v f() {
        return this.f1980g;
    }

    @Override // H.C0392p.b
    public Size g() {
        return this.f1976c;
    }

    public int hashCode() {
        return ((((((((((this.f1976c.hashCode() ^ 1000003) * 1000003) ^ this.f1977d) * 1000003) ^ this.f1978e) * 1000003) ^ (this.f1979f ? 1231 : 1237)) * (-721379959)) ^ this.f1980g.hashCode()) * 1000003) ^ this.f1981h.hashCode();
    }

    @Override // H.C0392p.b
    public boolean i() {
        return this.f1979f;
    }

    public String toString() {
        return "In{size=" + this.f1976c + ", inputFormat=" + this.f1977d + ", outputFormat=" + this.f1978e + ", virtualCamera=" + this.f1979f + ", imageReaderProxyProvider=" + ((Object) null) + ", requestEdge=" + this.f1980g + ", errorEdge=" + this.f1981h + "}";
    }
}
