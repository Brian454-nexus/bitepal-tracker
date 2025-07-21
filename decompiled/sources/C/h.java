package C;

import B.C0291h;
import I.G0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y.InterfaceC2301f1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final C0291h f391a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(InterfaceC2301f1 interfaceC2301f1);
    }

    public h(G0 g02) {
        this.f391a = (C0291h) g02.b(C0291h.class);
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2301f1 interfaceC2301f1 = (InterfaceC2301f1) it.next();
            interfaceC2301f1.c().p(interfaceC2301f1);
        }
    }

    public final void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2301f1 interfaceC2301f1 = (InterfaceC2301f1) it.next();
            interfaceC2301f1.c().q(interfaceC2301f1);
        }
    }

    public void c(InterfaceC2301f1 interfaceC2301f1, List list, List list2, a aVar) {
        InterfaceC2301f1 interfaceC2301f12;
        InterfaceC2301f1 interfaceC2301f13;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (interfaceC2301f13 = (InterfaceC2301f1) it.next()) != interfaceC2301f1) {
                linkedHashSet.add(interfaceC2301f13);
            }
            b(linkedHashSet);
        }
        aVar.a(interfaceC2301f1);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (interfaceC2301f12 = (InterfaceC2301f1) it2.next()) != interfaceC2301f1) {
                linkedHashSet2.add(interfaceC2301f12);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f391a != null;
    }
}
