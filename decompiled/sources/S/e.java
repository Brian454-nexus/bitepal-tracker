package S;

import I.InterfaceC0441m0;
import I.Y0;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {
    public static void a(Y0.a aVar, int i6) {
        Size A6;
        InterfaceC0441m0 interfaceC0441m0 = (InterfaceC0441m0) aVar.c();
        int V5 = interfaceC0441m0.V(-1);
        if (V5 == -1 || V5 != i6) {
            ((InterfaceC0441m0.a) aVar).d(i6);
        }
        if (V5 == -1 || i6 == -1 || V5 == i6) {
            return;
        }
        if (Math.abs(L.c.b(i6) - L.c.b(V5)) % 180 != 90 || (A6 = interfaceC0441m0.A(null)) == null) {
            return;
        }
        ((InterfaceC0441m0.a) aVar).a(new Size(A6.getHeight(), A6.getWidth()));
    }
}
