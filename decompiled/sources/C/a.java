package C;

import B.C0284a;
import I.G0;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Range f385a;

    public a(G0 g02) {
        C0284a c0284a = (C0284a) g02.b(C0284a.class);
        if (c0284a == null) {
            this.f385a = null;
        } else {
            this.f385a = c0284a.e();
        }
    }

    public void a(C2253a.C0269a c0269a) {
        Range range = this.f385a;
        if (range != null) {
            c0269a.d(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
