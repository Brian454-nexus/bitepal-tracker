package Z;

import F.C;
import I.InterfaceC0421c0;
import I.InterfaceC0423d0;
import f0.AbstractC1283a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements InterfaceC0421c0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0421c0 f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final C f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6607c = new HashMap();

    public f(InterfaceC0421c0 interfaceC0421c0, C c6) {
        this.f6605a = interfaceC0421c0;
        this.f6606b = c6;
    }

    public static InterfaceC0423d0 c(InterfaceC0423d0 interfaceC0423d0, C c6) {
        if (interfaceC0423d0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0423d0.c cVar : interfaceC0423d0.d()) {
            if (e(cVar, c6) && f(cVar, c6)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0423d0.b.h(interfaceC0423d0.a(), interfaceC0423d0.b(), interfaceC0423d0.c(), arrayList);
    }

    private InterfaceC0423d0 d(int i6) {
        if (this.f6607c.containsKey(Integer.valueOf(i6))) {
            return (InterfaceC0423d0) this.f6607c.get(Integer.valueOf(i6));
        }
        if (!this.f6605a.a(i6)) {
            return null;
        }
        InterfaceC0423d0 c6 = c(this.f6605a.b(i6), this.f6606b);
        this.f6607c.put(Integer.valueOf(i6), c6);
        return c6;
    }

    public static boolean e(InterfaceC0423d0.c cVar, C c6) {
        Set set = (Set) AbstractC1283a.f13986a.get(Integer.valueOf(c6.a()));
        return set != null && set.contains(Integer.valueOf(cVar.b()));
    }

    public static boolean f(InterfaceC0423d0.c cVar, C c6) {
        Set set = (Set) AbstractC1283a.f13987b.get(Integer.valueOf(c6.b()));
        return set != null && set.contains(Integer.valueOf(cVar.g()));
    }

    @Override // I.InterfaceC0421c0
    public boolean a(int i6) {
        return this.f6605a.a(i6) && d(i6) != null;
    }

    @Override // I.InterfaceC0421c0
    public InterfaceC0423d0 b(int i6) {
        return d(i6);
    }
}
