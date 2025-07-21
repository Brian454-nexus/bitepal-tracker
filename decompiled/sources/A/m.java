package A;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m extends l {
    public m(int i6, Surface surface) {
        this(new OutputConfiguration(i6, surface));
    }

    public static m j(OutputConfiguration outputConfiguration) {
        return new m(outputConfiguration);
    }

    @Override // A.n, A.i.a
    public void a(long j6) {
        if (j6 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j6);
    }

    @Override // A.k, A.i.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // A.l, A.k, A.i.a
    public void c(long j6) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j6);
    }

    @Override // A.l, A.k, A.i.a
    public /* bridge */ /* synthetic */ String d() {
        return super.d();
    }

    @Override // A.k, A.i.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // A.n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // A.l, A.k, A.i.a
    public /* bridge */ /* synthetic */ void f(String str) {
        super.f(str);
    }

    @Override // A.l, A.k, A.j, A.i.a
    public Object g() {
        y0.g.a(this.f14a instanceof OutputConfiguration);
        return this.f14a;
    }

    @Override // A.j, A.i.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // A.n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public m(Object obj) {
        super(obj);
    }
}
