package C;

import B.F;
import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f404a;

    public q() {
        this.f404a = ((F) B.l.a(F.class)) != null;
    }

    public boolean a(List list, boolean z6) {
        if (this.f404a && z6) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
