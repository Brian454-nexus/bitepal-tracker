package F;

import F.AbstractC0347t;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0326e extends AbstractC0347t {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0347t.b f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0347t.a f1420b;

    public C0326e(AbstractC0347t.b bVar, AbstractC0347t.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f1419a = bVar;
        this.f1420b = aVar;
    }

    @Override // F.AbstractC0347t
    public AbstractC0347t.a c() {
        return this.f1420b;
    }

    @Override // F.AbstractC0347t
    public AbstractC0347t.b d() {
        return this.f1419a;
    }

    public boolean equals(Object obj) {
        AbstractC0347t.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0347t) {
            AbstractC0347t abstractC0347t = (AbstractC0347t) obj;
            if (this.f1419a.equals(abstractC0347t.d()) && ((aVar = this.f1420b) != null ? aVar.equals(abstractC0347t.c()) : abstractC0347t.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f1419a.hashCode() ^ 1000003) * 1000003;
        AbstractC0347t.a aVar = this.f1420b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f1419a + ", error=" + this.f1420b + "}";
    }
}
