package F;

import F.AbstractC0347t;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0328f extends AbstractC0347t.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1421a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1422b;

    public C0328f(int i6, Throwable th) {
        this.f1421a = i6;
        this.f1422b = th;
    }

    @Override // F.AbstractC0347t.a
    public Throwable c() {
        return this.f1422b;
    }

    @Override // F.AbstractC0347t.a
    public int d() {
        return this.f1421a;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0347t.a) {
            AbstractC0347t.a aVar = (AbstractC0347t.a) obj;
            if (this.f1421a == aVar.d() && ((th = this.f1422b) != null ? th.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i6 = (this.f1421a ^ 1000003) * 1000003;
        Throwable th = this.f1422b;
        return i6 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f1421a + ", cause=" + this.f1422b + "}";
    }
}
