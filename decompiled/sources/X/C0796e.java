package X;

import X.AbstractC0806o;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0796e extends AbstractC0806o.b {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0811u f5861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5862c;

    public C0796e(AbstractC0811u abstractC0811u, int i6) {
        if (abstractC0811u == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f5861b = abstractC0811u;
        this.f5862c = i6;
    }

    @Override // X.AbstractC0806o.b
    public AbstractC0811u e() {
        return this.f5861b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0806o.b) {
            AbstractC0806o.b bVar = (AbstractC0806o.b) obj;
            if (this.f5861b.equals(bVar.e()) && this.f5862c == bVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC0806o.b
    public int f() {
        return this.f5862c;
    }

    public int hashCode() {
        return ((this.f5861b.hashCode() ^ 1000003) * 1000003) ^ this.f5862c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f5861b + ", fallbackRule=" + this.f5862c + "}";
    }
}
