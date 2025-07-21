package I;

import I.InterfaceC0423d0;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: I.e0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0425e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2434a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2435b;

    public C0425e0(List list) {
        ArrayList arrayList = new ArrayList();
        this.f2434a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f2435b = b(list);
    }

    public InterfaceC0423d0 a(InterfaceC0423d0 interfaceC0423d0) {
        if (interfaceC0423d0 == null) {
            return null;
        }
        if (!c()) {
            return interfaceC0423d0;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0423d0.c cVar : interfaceC0423d0.d()) {
            if (this.f2435b.contains(new Size(cVar.k(), cVar.h()))) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0423d0.b.h(interfaceC0423d0.a(), interfaceC0423d0.b(), interfaceC0423d0.c(), arrayList);
    }

    public final Set b(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(((K.a) list.get(0)).b());
        for (int i6 = 1; i6 < list.size(); i6++) {
            hashSet.retainAll(((K.a) list.get(i6)).b());
        }
        return hashSet;
    }

    public boolean c() {
        return !this.f2434a.isEmpty();
    }

    public boolean d(InterfaceC0423d0 interfaceC0423d0) {
        if (interfaceC0423d0 == null) {
            return false;
        }
        if (!c()) {
            return !interfaceC0423d0.d().isEmpty();
        }
        for (InterfaceC0423d0.c cVar : interfaceC0423d0.d()) {
            if (this.f2435b.contains(new Size(cVar.k(), cVar.h()))) {
                return true;
            }
        }
        return false;
    }
}
