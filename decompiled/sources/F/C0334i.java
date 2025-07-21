package F;

import F.w0;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0334i extends w0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1433a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f1434b;

    public C0334i(int i6, w0 w0Var) {
        this.f1433a = i6;
        if (w0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f1434b = w0Var;
    }

    @Override // F.w0.a
    public int a() {
        return this.f1433a;
    }

    @Override // F.w0.a
    public w0 b() {
        return this.f1434b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0.a) {
            w0.a aVar = (w0.a) obj;
            if (this.f1433a == aVar.a() && this.f1434b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1433a ^ 1000003) * 1000003) ^ this.f1434b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f1433a + ", surfaceOutput=" + this.f1434b + "}";
    }
}
