package e0;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1222e extends n0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f13742e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13743f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13744g;

    public C1222e(int i6, int i7, int i8) {
        this.f13742e = i6;
        this.f13743f = i7;
        this.f13744g = i8;
    }

    @Override // e0.n0
    public int b() {
        return this.f13744g;
    }

    @Override // e0.n0
    public int c() {
        return this.f13742e;
    }

    @Override // e0.n0
    public int d() {
        return this.f13743f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f13742e == n0Var.c() && this.f13743f == n0Var.d() && this.f13744g == n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13742e ^ 1000003) * 1000003) ^ this.f13743f) * 1000003) ^ this.f13744g;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f13742e + ", transfer=" + this.f13743f + ", range=" + this.f13744g + "}";
    }
}
