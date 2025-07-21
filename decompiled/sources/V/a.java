package V;

import I.InterfaceC0441m0;
import I.Y0;
import android.util.Size;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {
    public static List a(List list, Size size, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Y0) it.next()).e(InterfaceC0441m0.f2512q, null);
            if (list2 != null) {
                return list2;
            }
        }
        return list;
    }
}
