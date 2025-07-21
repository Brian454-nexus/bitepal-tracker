package E;

import F.r;
import I.D;
import android.hardware.camera2.CameraCharacteristics;
import y.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final N f867a;

    public h(N n6) {
        this.f867a = n6;
    }

    public static h a(r rVar) {
        D b6 = ((D) rVar).b();
        y0.g.b(b6 instanceof N, "CameraInfo doesn't contain Camera2 implementation.");
        return ((N) b6).o();
    }

    public Object b(CameraCharacteristics.Key key) {
        return this.f867a.p().a(key);
    }

    public String c() {
        return this.f867a.d();
    }
}
