package I;

import android.util.Size;
import java.util.Map;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0440m extends R0 {

    /* renamed from: a, reason: collision with root package name */
    public final Size f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2497b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f2498c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2499d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f2500e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f2501f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f2502g;

    public C0440m(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f2496a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f2497b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f2498c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f2499d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f2500e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f2501f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f2502g = map4;
    }

    @Override // I.R0
    public Size b() {
        return this.f2496a;
    }

    @Override // I.R0
    public Map d() {
        return this.f2501f;
    }

    @Override // I.R0
    public Size e() {
        return this.f2498c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof R0) {
            R0 r02 = (R0) obj;
            if (this.f2496a.equals(r02.b()) && this.f2497b.equals(r02.j()) && this.f2498c.equals(r02.e()) && this.f2499d.equals(r02.h()) && this.f2500e.equals(r02.f()) && this.f2501f.equals(r02.d()) && this.f2502g.equals(r02.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // I.R0
    public Size f() {
        return this.f2500e;
    }

    @Override // I.R0
    public Map h() {
        return this.f2499d;
    }

    public int hashCode() {
        return ((((((((((((this.f2496a.hashCode() ^ 1000003) * 1000003) ^ this.f2497b.hashCode()) * 1000003) ^ this.f2498c.hashCode()) * 1000003) ^ this.f2499d.hashCode()) * 1000003) ^ this.f2500e.hashCode()) * 1000003) ^ this.f2501f.hashCode()) * 1000003) ^ this.f2502g.hashCode();
    }

    @Override // I.R0
    public Map j() {
        return this.f2497b;
    }

    @Override // I.R0
    public Map l() {
        return this.f2502g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2496a + ", s720pSizeMap=" + this.f2497b + ", previewSize=" + this.f2498c + ", s1440pSizeMap=" + this.f2499d + ", recordSize=" + this.f2500e + ", maximumSizeMap=" + this.f2501f + ", ultraMaximumSizeMap=" + this.f2502g + "}";
    }
}
