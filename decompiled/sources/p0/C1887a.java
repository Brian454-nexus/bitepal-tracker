package p0;

import q0.AbstractC1998a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1887a {

    /* renamed from: a, reason: collision with root package name */
    public final float f18071a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18072b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18073c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18074d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18075e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18076f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18077g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18078h;

    /* renamed from: i, reason: collision with root package name */
    public final float f18079i;

    public C1887a(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f18071a = f6;
        this.f18072b = f7;
        this.f18073c = f8;
        this.f18074d = f9;
        this.f18075e = f10;
        this.f18076f = f11;
        this.f18077g = f12;
        this.f18078h = f13;
        this.f18079i = f14;
    }

    public static C1887a b(float f6, float f7, float f8) {
        float f9 = 100.0f;
        float f10 = 1000.0f;
        float f11 = 0.0f;
        C1887a c1887a = null;
        float f12 = 1000.0f;
        while (Math.abs(f11 - f9) > 0.01f) {
            float f13 = ((f9 - f11) / 2.0f) + f11;
            int p6 = e(f13, f7, f6).p();
            float b6 = AbstractC1888b.b(p6);
            float abs = Math.abs(f8 - b6);
            if (abs < 0.2f) {
                C1887a c6 = c(p6);
                float a6 = c6.a(e(c6.k(), c6.i(), f6));
                if (a6 <= 1.0f) {
                    c1887a = c6;
                    f10 = abs;
                    f12 = a6;
                }
            }
            if (f10 == 0.0f && f12 == 0.0f) {
                return c1887a;
            }
            if (b6 < f8) {
                f11 = f13;
            } else {
                f9 = f13;
            }
        }
        return c1887a;
    }

    public static C1887a c(int i6) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i6, C1896j.f18109k, fArr, fArr2);
        return new C1887a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i6, C1896j c1896j, float[] fArr, float[] fArr2) {
        AbstractC1888b.f(i6, fArr2);
        float[][] fArr3 = AbstractC1888b.f18080a;
        float f6 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f7 = fArr4[0] * f6;
        float f8 = fArr2[1];
        float f9 = f7 + (fArr4[1] * f8);
        float f10 = fArr2[2];
        float f11 = f9 + (fArr4[2] * f10);
        float[] fArr5 = fArr3[1];
        float f12 = (fArr5[0] * f6) + (fArr5[1] * f8) + (fArr5[2] * f10);
        float[] fArr6 = fArr3[2];
        float f13 = (f6 * fArr6[0]) + (f8 * fArr6[1]) + (f10 * fArr6[2]);
        float f14 = c1896j.i()[0] * f11;
        float f15 = c1896j.i()[1] * f12;
        float f16 = c1896j.i()[2] * f13;
        float pow = (float) Math.pow((c1896j.c() * Math.abs(f14)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c1896j.c() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c1896j.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = signum3;
        float f17 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d6)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d6 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = (((signum * 20.0f) + f19) + (21.0f * signum3)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * c1896j.f()) / c1896j.a(), c1896j.b() * c1896j.j())) * 100.0f;
        float b6 = (4.0f / c1896j.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c1896j.a() + 4.0f) * c1896j.d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c1896j.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1896j.g()) * c1896j.h()) * ((float) Math.sqrt((f17 * f17) + (f18 * f18)))) / (f20 + 0.305f), 0.9d));
        float d7 = c1896j.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r4 * c1896j.b()) / (c1896j.a() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d7) + 1.0f)) * 43.85965f;
        double d8 = f22;
        float cos = ((float) Math.cos(d8)) * log;
        float sin = log * ((float) Math.sin(d8));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b6;
            fArr[2] = d7;
            fArr[3] = sqrt2;
            fArr[4] = f23;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static C1887a e(float f6, float f7, float f8) {
        return f(f6, f7, f8, C1896j.f18109k);
    }

    public static C1887a f(float f6, float f7, float f8, C1896j c1896j) {
        float b6 = (4.0f / c1896j.b()) * ((float) Math.sqrt(f6 / 100.0d)) * (c1896j.a() + 4.0f) * c1896j.d();
        float d6 = c1896j.d() * f7;
        float sqrt = ((float) Math.sqrt(((f7 / ((float) Math.sqrt(r4))) * c1896j.b()) / (c1896j.a() + 4.0f))) * 50.0f;
        float f9 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((d6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new C1887a(f8, f7, f6, b6, d6, sqrt, f9, ((float) Math.cos(d7)) * log, log * ((float) Math.sin(d7)));
    }

    public static int m(float f6, float f7, float f8) {
        return n(f6, f7, f8, C1896j.f18109k);
    }

    public static int n(float f6, float f7, float f8, C1896j c1896j) {
        if (f7 < 1.0d || Math.round(f8) <= 0.0d || Math.round(f8) >= 100.0d) {
            return AbstractC1888b.a(f8);
        }
        float min = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
        C1887a c1887a = null;
        boolean z6 = true;
        float f9 = 0.0f;
        float f10 = f7;
        while (Math.abs(f9 - f7) >= 0.4f) {
            C1887a b6 = b(min, f10, f8);
            if (!z6) {
                if (b6 == null) {
                    f7 = f10;
                } else {
                    f9 = f10;
                    c1887a = b6;
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
            } else {
                if (b6 != null) {
                    return b6.o(c1896j);
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
                z6 = false;
            }
        }
        return c1887a == null ? AbstractC1888b.a(f8) : c1887a.o(c1896j);
    }

    public float a(C1887a c1887a) {
        float l6 = l() - c1887a.l();
        float g6 = g() - c1887a.g();
        float h6 = h() - c1887a.h();
        return (float) (Math.pow(Math.sqrt((l6 * l6) + (g6 * g6) + (h6 * h6)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.f18078h;
    }

    public float h() {
        return this.f18079i;
    }

    public float i() {
        return this.f18072b;
    }

    public float j() {
        return this.f18071a;
    }

    public float k() {
        return this.f18073c;
    }

    public float l() {
        return this.f18077g;
    }

    public int o(C1896j c1896j) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c1896j.e()), 0.73d), 1.1111111111111112d);
        double j6 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j6) + 3.8d)) * 0.25f;
        float a6 = c1896j.a() * ((float) Math.pow(k() / 100.0d, (1.0d / c1896j.b()) / c1896j.j()));
        float g6 = cos * 3846.1538f * c1896j.g() * c1896j.h();
        float f6 = a6 / c1896j.f();
        float sin = (float) Math.sin(j6);
        float cos2 = (float) Math.cos(j6);
        float f7 = (((0.305f + f6) * 23.0f) * pow) / (((g6 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f8 = cos2 * f7;
        float f9 = f7 * sin;
        float f10 = f6 * 460.0f;
        float f11 = (((451.0f * f8) + f10) + (288.0f * f9)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float signum = Math.signum(f11) * (100.0f / c1896j.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum2 = Math.signum(f12) * (100.0f / c1896j.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * (100.0f / c1896j.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f13 = signum / c1896j.i()[0];
        float f14 = signum2 / c1896j.i()[1];
        float f15 = signum3 / c1896j.i()[2];
        float[][] fArr = AbstractC1888b.f18081b;
        float[] fArr2 = fArr[0];
        float f16 = (fArr2[0] * f13) + (fArr2[1] * f14) + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f13) + (fArr3[1] * f14) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        return AbstractC1998a.a(f16, f17, (f13 * fArr4[0]) + (f14 * fArr4[1]) + (f15 * fArr4[2]));
    }

    public int p() {
        return o(C1896j.f18109k);
    }
}
