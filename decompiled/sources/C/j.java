package C;

import android.hardware.camera2.CaptureRequest;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {
    public void a(int i6, C2253a.C0269a c0269a) {
        if (((B.v) B.l.a(B.v.class)) == null) {
            return;
        }
        if (i6 == 0) {
            c0269a.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i6 != 1) {
                return;
            }
            c0269a.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
