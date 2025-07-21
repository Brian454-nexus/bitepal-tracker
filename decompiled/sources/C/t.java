package C;

import B.H;
import I.N;
import I.W;
import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import x.C2253a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f408a;

    public t() {
        this.f408a = B.l.a(H.class) != null;
    }

    public N a(N n6) {
        N.a aVar = new N.a();
        aVar.s(n6.i());
        Iterator it = n6.g().iterator();
        while (it.hasNext()) {
            aVar.f((W) it.next());
        }
        aVar.e(n6.f());
        C2253a.C0269a c0269a = new C2253a.C0269a();
        c0269a.d(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0269a.a());
        return aVar.h();
    }

    public boolean b(List list, boolean z6) {
        if (!this.f408a || !z6) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
