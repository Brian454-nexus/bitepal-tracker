package I;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2251a;

    public G0(List list) {
        this.f2251a = new ArrayList(list);
    }

    public boolean a(Class cls) {
        Iterator it = this.f2251a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((F0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public F0 b(Class cls) {
        for (F0 f02 : this.f2251a) {
            if (f02.getClass() == cls) {
                return f02;
            }
        }
        return null;
    }

    public List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (F0 f02 : this.f2251a) {
            if (cls.isAssignableFrom(f02.getClass())) {
                arrayList.add(f02);
            }
        }
        return arrayList;
    }
}
