package y;

import I.AbstractC0442n;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y.u0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2332u0 {
    public static CameraCaptureSession.CaptureCallback a(AbstractC0442n abstractC0442n) {
        if (abstractC0442n == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC0442n, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : O.a(arrayList);
    }

    public static void b(AbstractC0442n abstractC0442n, List list) {
        if (abstractC0442n instanceof C2330t0) {
            list.add(((C2330t0) abstractC0442n).e());
        } else {
            list.add(new C2328s0(abstractC0442n));
        }
    }
}
