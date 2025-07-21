package T4;

import java.security.MessageDigest;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements R4.f {

    /* renamed from: b, reason: collision with root package name */
    public final R4.f f4936b;

    /* renamed from: c, reason: collision with root package name */
    public final R4.f f4937c;

    public d(R4.f fVar, R4.f fVar2) {
        this.f4936b = fVar;
        this.f4937c = fVar2;
    }

    @Override // R4.f
    public void a(MessageDigest messageDigest) {
        this.f4936b.a(messageDigest);
        this.f4937c.a(messageDigest);
    }

    @Override // R4.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4936b.equals(dVar.f4936b) && this.f4937c.equals(dVar.f4937c)) {
                return true;
            }
        }
        return false;
    }

    @Override // R4.f
    public int hashCode() {
        return (this.f4936b.hashCode() * 31) + this.f4937c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4936b + ", signature=" + this.f4937c + '}';
    }
}
