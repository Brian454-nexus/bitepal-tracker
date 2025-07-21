package y;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class J0 implements F.D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20752a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C2362A f20753b;

    /* renamed from: c, reason: collision with root package name */
    public int f20754c;

    public J0(C2362A c2362a, int i6) {
        this.f20753b = c2362a;
        this.f20754c = i6;
    }

    @Override // F.D
    public Range a() {
        return (Range) this.f20753b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // F.D
    public Rational b() {
        return !d() ? Rational.ZERO : (Rational) this.f20753b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    public int c() {
        int i6;
        synchronized (this.f20752a) {
            i6 = this.f20754c;
        }
        return i6;
    }

    public boolean d() {
        Range range = (Range) this.f20753b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void e(int i6) {
        synchronized (this.f20752a) {
            this.f20754c = i6;
        }
    }
}
