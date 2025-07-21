package X;

import X.C0813w;

/* renamed from: X.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0800i extends C0813w.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0811u f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5891b;

    public C0800i(AbstractC0811u abstractC0811u, int i6) {
        if (abstractC0811u == null) {
            throw new NullPointerException("Null quality");
        }
        this.f5890a = abstractC0811u;
        this.f5891b = i6;
    }

    @Override // X.C0813w.a
    public int a() {
        return this.f5891b;
    }

    @Override // X.C0813w.a
    public AbstractC0811u b() {
        return this.f5890a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0813w.a) {
            C0813w.a aVar = (C0813w.a) obj;
            if (this.f5890a.equals(aVar.b()) && this.f5891b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5890a.hashCode() ^ 1000003) * 1000003) ^ this.f5891b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f5890a + ", aspectRatio=" + this.f5891b + "}";
    }
}
