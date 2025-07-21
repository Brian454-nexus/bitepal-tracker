package C;

import B.C;
import I.L0;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f402a = new Rational(16, 9);

    public static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, L0.b bVar) {
        if (((C) B.l.a(C.class)) == null || a(size, f402a)) {
            return;
        }
        C2253a.C0269a c0269a = new C2253a.C0269a();
        c0269a.d(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0269a.a());
    }
}
