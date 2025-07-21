package y;

import y.C2298e1;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2296e extends C2298e1.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f20963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20964b;

    public C2296e(int i6, int i7) {
        this.f20963a = i6;
        this.f20964b = i7;
    }

    @Override // y.C2298e1.b
    public int a() {
        return this.f20963a;
    }

    @Override // y.C2298e1.b
    public int b() {
        return this.f20964b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2298e1.b) {
            C2298e1.b bVar = (C2298e1.b) obj;
            if (this.f20963a == bVar.a() && this.f20964b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20963a ^ 1000003) * 1000003) ^ this.f20964b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f20963a + ", requiredMaxBitDepth=" + this.f20964b + "}";
    }
}
