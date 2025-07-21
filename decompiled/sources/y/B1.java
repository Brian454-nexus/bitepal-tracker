package y;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class B1 implements F.K0 {

    /* renamed from: a, reason: collision with root package name */
    public float f20684a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20685b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20686c;

    /* renamed from: d, reason: collision with root package name */
    public float f20687d;

    public B1(float f6, float f7) {
        this.f20685b = f6;
        this.f20686c = f7;
    }

    @Override // F.K0
    public float a() {
        return this.f20685b;
    }

    @Override // F.K0
    public float b() {
        return this.f20686c;
    }

    @Override // F.K0
    public float c() {
        return this.f20684a;
    }

    @Override // F.K0
    public float d() {
        return this.f20687d;
    }

    public final float e(float f6) {
        float f7 = this.f20685b;
        float f8 = this.f20686c;
        if (f7 == f8) {
            return 0.0f;
        }
        if (f6 == f7) {
            return 1.0f;
        }
        if (f6 == f8) {
            return 0.0f;
        }
        float f9 = 1.0f / f8;
        return ((1.0f / f6) - f9) / ((1.0f / f7) - f9);
    }

    public void f(float f6) {
        if (f6 <= this.f20685b && f6 >= this.f20686c) {
            this.f20684a = f6;
            this.f20687d = e(f6);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f6 + " is not within valid range [" + this.f20686c + " , " + this.f20685b + "]");
    }
}
