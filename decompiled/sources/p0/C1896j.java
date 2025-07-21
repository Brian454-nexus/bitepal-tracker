package p0;

/* renamed from: p0.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1896j {

    /* renamed from: k, reason: collision with root package name */
    public static final C1896j f18109k = k(AbstractC1888b.f18082c, (float) ((AbstractC1888b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    public final float f18110a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18111b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18112c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18113d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18114e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18115f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f18116g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18117h;

    /* renamed from: i, reason: collision with root package name */
    public final float f18118i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18119j;

    public C1896j(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f18115f = f6;
        this.f18110a = f7;
        this.f18111b = f8;
        this.f18112c = f9;
        this.f18113d = f10;
        this.f18114e = f11;
        this.f18116g = fArr;
        this.f18117h = f12;
        this.f18118i = f13;
        this.f18119j = f14;
    }

    public static C1896j k(float[] fArr, float f6, float f7, float f8, boolean z6) {
        float[][] fArr2 = AbstractC1888b.f18080a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = f10 + (fArr3[1] * f11);
        float f13 = fArr[2];
        float f14 = f12 + (fArr3[2] * f13);
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[0] * f9) + (fArr4[1] * f11) + (fArr4[2] * f13);
        float[] fArr5 = fArr2[2];
        float f16 = (f9 * fArr5[0]) + (f11 * fArr5[1]) + (f13 * fArr5[2]);
        float f17 = (f8 / 10.0f) + 0.8f;
        float d6 = ((double) f17) >= 0.9d ? AbstractC1888b.d(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : AbstractC1888b.d(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float exp = z6 ? 1.0f : (1.0f - (((float) Math.exp(((-f6) - 42.0f) / 92.0f)) * 0.2777778f)) * f17;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * f6) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (f19 * f6) + (0.1f * f20 * f20 * ((float) Math.cbrt(f6 * 5.0d)));
        float h6 = AbstractC1888b.h(f7) / fArr[1];
        double d8 = h6;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        return new C1896j(h6, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d6, f17, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.f18110a;
    }

    public float b() {
        return this.f18113d;
    }

    public float c() {
        return this.f18117h;
    }

    public float d() {
        return this.f18118i;
    }

    public float e() {
        return this.f18115f;
    }

    public float f() {
        return this.f18111b;
    }

    public float g() {
        return this.f18114e;
    }

    public float h() {
        return this.f18112c;
    }

    public float[] i() {
        return this.f18116g;
    }

    public float j() {
        return this.f18119j;
    }
}
