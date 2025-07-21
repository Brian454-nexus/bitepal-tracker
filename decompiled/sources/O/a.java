package O;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3834b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3835c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3836d;

    public a(float f6, float f7, float f8, float f9) {
        this.f3833a = f6;
        this.f3834b = f7;
        this.f3835c = f8;
        this.f3836d = f9;
    }

    @Override // O.f, F.K0
    public float a() {
        return this.f3834b;
    }

    @Override // O.f, F.K0
    public float b() {
        return this.f3835c;
    }

    @Override // O.f, F.K0
    public float c() {
        return this.f3833a;
    }

    @Override // O.f, F.K0
    public float d() {
        return this.f3836d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Float.floatToIntBits(this.f3833a) == Float.floatToIntBits(fVar.c()) && Float.floatToIntBits(this.f3834b) == Float.floatToIntBits(fVar.a()) && Float.floatToIntBits(this.f3835c) == Float.floatToIntBits(fVar.b()) && Float.floatToIntBits(this.f3836d) == Float.floatToIntBits(fVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f3833a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f3834b)) * 1000003) ^ Float.floatToIntBits(this.f3835c)) * 1000003) ^ Float.floatToIntBits(this.f3836d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f3833a + ", maxZoomRatio=" + this.f3834b + ", minZoomRatio=" + this.f3835c + ", linearZoom=" + this.f3836d + "}";
    }
}
