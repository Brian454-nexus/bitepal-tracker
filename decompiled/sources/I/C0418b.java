package I;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0418b extends AbstractC0416a {

    /* renamed from: a, reason: collision with root package name */
    public final Q0 f2413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2414b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f2415c;

    /* renamed from: d, reason: collision with root package name */
    public final F.C f2416d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2417e;

    /* renamed from: f, reason: collision with root package name */
    public final P f2418f;

    /* renamed from: g, reason: collision with root package name */
    public final Range f2419g;

    public C0418b(Q0 q02, int i6, Size size, F.C c6, List list, P p6, Range range) {
        if (q02 == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f2413a = q02;
        this.f2414b = i6;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2415c = size;
        if (c6 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f2416d = c6;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f2417e = list;
        this.f2418f = p6;
        this.f2419g = range;
    }

    @Override // I.AbstractC0416a
    public List b() {
        return this.f2417e;
    }

    @Override // I.AbstractC0416a
    public F.C c() {
        return this.f2416d;
    }

    @Override // I.AbstractC0416a
    public int d() {
        return this.f2414b;
    }

    @Override // I.AbstractC0416a
    public P e() {
        return this.f2418f;
    }

    public boolean equals(Object obj) {
        P p6;
        Range range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0416a) {
            AbstractC0416a abstractC0416a = (AbstractC0416a) obj;
            if (this.f2413a.equals(abstractC0416a.g()) && this.f2414b == abstractC0416a.d() && this.f2415c.equals(abstractC0416a.f()) && this.f2416d.equals(abstractC0416a.c()) && this.f2417e.equals(abstractC0416a.b()) && ((p6 = this.f2418f) != null ? p6.equals(abstractC0416a.e()) : abstractC0416a.e() == null) && ((range = this.f2419g) != null ? range.equals(abstractC0416a.h()) : abstractC0416a.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // I.AbstractC0416a
    public Size f() {
        return this.f2415c;
    }

    @Override // I.AbstractC0416a
    public Q0 g() {
        return this.f2413a;
    }

    @Override // I.AbstractC0416a
    public Range h() {
        return this.f2419g;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f2413a.hashCode() ^ 1000003) * 1000003) ^ this.f2414b) * 1000003) ^ this.f2415c.hashCode()) * 1000003) ^ this.f2416d.hashCode()) * 1000003) ^ this.f2417e.hashCode()) * 1000003;
        P p6 = this.f2418f;
        int hashCode2 = (hashCode ^ (p6 == null ? 0 : p6.hashCode())) * 1000003;
        Range range = this.f2419g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f2413a + ", imageFormat=" + this.f2414b + ", size=" + this.f2415c + ", dynamicRange=" + this.f2416d + ", captureTypes=" + this.f2417e + ", implementationOptions=" + this.f2418f + ", targetFrameRate=" + this.f2419g + "}";
    }
}
