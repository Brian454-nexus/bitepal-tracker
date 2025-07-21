package R0;

import android.view.animation.Interpolator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f4569a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4570b;

    public b(float[] fArr) {
        this.f4569a = fArr;
        this.f4570b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4569a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f4570b;
        float f8 = (f6 - (min * f7)) / f7;
        float[] fArr2 = this.f4569a;
        float f9 = fArr2[min];
        return f9 + (f8 * (fArr2[min + 1] - f9));
    }
}
