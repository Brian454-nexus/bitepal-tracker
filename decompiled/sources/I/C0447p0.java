package I;

import F.InterfaceC0345q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: I.p0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0447p0 implements InterfaceC0345q {

    /* renamed from: b, reason: collision with root package name */
    public final int f2524b;

    public C0447p0(int i6) {
        this.f2524b = i6;
    }

    @Override // F.InterfaceC0345q
    public List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.r rVar = (F.r) it.next();
            y0.g.b(rVar instanceof D, "The camera info doesn't contain internal implementation.");
            if (rVar.g() == this.f2524b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f2524b;
    }
}
