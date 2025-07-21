package Z;

import I.InterfaceC0423d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g implements InterfaceC0423d0 {
    public static g h(int i6, int i7, List list, List list2) {
        y0.g.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i6, i7, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? (InterfaceC0423d0.a) list.get(0) : null, (InterfaceC0423d0.c) list2.get(0));
    }

    public static g i(InterfaceC0423d0 interfaceC0423d0) {
        return h(interfaceC0423d0.a(), interfaceC0423d0.b(), interfaceC0423d0.c(), interfaceC0423d0.d());
    }

    public abstract InterfaceC0423d0.a j();

    public abstract InterfaceC0423d0.c k();
}
