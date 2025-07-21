package T;

import T.U;
import java.util.List;

/* renamed from: T.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0749d extends U.b {

    /* renamed from: a, reason: collision with root package name */
    public final L f4817a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4818b;

    public C0749d(L l6, List list) {
        if (l6 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f4817a = l6;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f4818b = list;
    }

    @Override // T.U.b
    public List a() {
        return this.f4818b;
    }

    @Override // T.U.b
    public L b() {
        return this.f4817a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof U.b) {
            U.b bVar = (U.b) obj;
            if (this.f4817a.equals(bVar.b()) && this.f4818b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4817a.hashCode() ^ 1000003) * 1000003) ^ this.f4818b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f4817a + ", outConfigs=" + this.f4818b + "}";
    }
}
