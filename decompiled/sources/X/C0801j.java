package X;

import X.AbstractC0811u;

/* renamed from: X.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0801j extends AbstractC0811u.b {

    /* renamed from: j, reason: collision with root package name */
    public final int f5895j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5896k;

    public C0801j(int i6, String str) {
        this.f5895j = i6;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f5896k = str;
    }

    @Override // X.AbstractC0811u.b
    public String c() {
        return this.f5896k;
    }

    @Override // X.AbstractC0811u.b
    public int d() {
        return this.f5895j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0811u.b) {
            AbstractC0811u.b bVar = (AbstractC0811u.b) obj;
            if (this.f5895j == bVar.d() && this.f5896k.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5895j ^ 1000003) * 1000003) ^ this.f5896k.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f5895j + ", name=" + this.f5896k + "}";
    }
}
