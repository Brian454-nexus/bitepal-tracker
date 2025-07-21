package E5;

import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1155b;

    public b(H5.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f1154a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f1155b = map;
    }

    @Override // E5.f
    public H5.a e() {
        return this.f1154a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f1154a.equals(fVar.e()) && this.f1155b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // E5.f
    public Map h() {
        return this.f1155b;
    }

    public int hashCode() {
        return ((this.f1154a.hashCode() ^ 1000003) * 1000003) ^ this.f1155b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f1154a + ", values=" + this.f1155b + "}";
    }
}
