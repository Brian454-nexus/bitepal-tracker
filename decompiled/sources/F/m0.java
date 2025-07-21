package F;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public Rational f1451a;

    public m0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    public abstract PointF a(float f6, float f7);

    public final l0 b(float f6, float f7) {
        return c(f6, f7, d());
    }

    public final l0 c(float f6, float f7, float f8) {
        PointF a6 = a(f6, f7);
        return new l0(a6.x, a6.y, f8, this.f1451a);
    }

    public m0(Rational rational) {
        this.f1451a = rational;
    }
}
