package X;

import F.AbstractC0335i0;
import I.InterfaceC0423d0;
import X.AbstractC0806o;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.x, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0814x {

    /* renamed from: a, reason: collision with root package name */
    public final List f6015a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0806o f6016b;

    public C0814x(List list, AbstractC0806o abstractC0806o) {
        y0.g.b((list.isEmpty() && abstractC0806o == AbstractC0806o.f5951a) ? false : true, "No preferred quality and fallback strategy.");
        this.f6015a = Collections.unmodifiableList(new ArrayList(list));
        this.f6016b = abstractC0806o;
    }

    public static void b(AbstractC0811u abstractC0811u) {
        y0.g.b(AbstractC0811u.a(abstractC0811u), "Invalid quality: " + abstractC0811u);
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0811u abstractC0811u = (AbstractC0811u) it.next();
            y0.g.b(AbstractC0811u.a(abstractC0811u), "qualities contain invalid quality: " + abstractC0811u);
        }
    }

    public static C0814x d(AbstractC0811u abstractC0811u) {
        return e(abstractC0811u, AbstractC0806o.f5951a);
    }

    public static C0814x e(AbstractC0811u abstractC0811u, AbstractC0806o abstractC0806o) {
        y0.g.g(abstractC0811u, "quality cannot be null");
        y0.g.g(abstractC0806o, "fallbackStrategy cannot be null");
        b(abstractC0811u);
        return new C0814x(Collections.singletonList(abstractC0811u), abstractC0806o);
    }

    public static C0814x f(List list) {
        return g(list, AbstractC0806o.f5951a);
    }

    public static C0814x g(List list, AbstractC0806o abstractC0806o) {
        y0.g.g(list, "qualities cannot be null");
        y0.g.g(abstractC0806o, "fallbackStrategy cannot be null");
        y0.g.b(!list.isEmpty(), "qualities cannot be empty");
        c(list);
        return new C0814x(list, abstractC0806o);
    }

    public static Size i(Z.g gVar) {
        InterfaceC0423d0.c k6 = gVar.k();
        return new Size(k6.k(), k6.h());
    }

    public static Map j(c0 c0Var, F.C c6) {
        HashMap hashMap = new HashMap();
        for (AbstractC0811u abstractC0811u : c0Var.d(c6)) {
            Z.g c7 = c0Var.c(abstractC0811u, c6);
            Objects.requireNonNull(c7);
            hashMap.put(abstractC0811u, i(c7));
        }
        return hashMap;
    }

    public static Size k(F.r rVar, AbstractC0811u abstractC0811u) {
        b(abstractC0811u);
        Z.g c6 = Q.F(rVar).c(abstractC0811u, F.C.f1236d);
        if (c6 != null) {
            return i(c6);
        }
        return null;
    }

    public final void a(List list, Set set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        AbstractC0335i0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f6016b);
        AbstractC0806o abstractC0806o = this.f6016b;
        if (abstractC0806o == AbstractC0806o.f5951a) {
            return;
        }
        y0.g.i(abstractC0806o instanceof AbstractC0806o.b, "Currently only support type RuleStrategy");
        AbstractC0806o.b bVar = (AbstractC0806o.b) this.f6016b;
        List b6 = AbstractC0811u.b();
        AbstractC0811u e6 = bVar.e() == AbstractC0811u.f5979f ? (AbstractC0811u) b6.get(0) : bVar.e() == AbstractC0811u.f5978e ? (AbstractC0811u) b6.get(b6.size() - 1) : bVar.e();
        int indexOf = b6.indexOf(e6);
        y0.g.h(indexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i6 = indexOf - 1; i6 >= 0; i6--) {
            AbstractC0811u abstractC0811u = (AbstractC0811u) b6.get(i6);
            if (list.contains(abstractC0811u)) {
                arrayList.add(abstractC0811u);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = indexOf + 1; i7 < b6.size(); i7++) {
            AbstractC0811u abstractC0811u2 = (AbstractC0811u) b6.get(i7);
            if (list.contains(abstractC0811u2)) {
                arrayList2.add(abstractC0811u2);
            }
        }
        AbstractC0335i0.a("QualitySelector", "sizeSortedQualities = " + b6 + ", fallback quality = " + e6 + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int f6 = bVar.f();
        if (f6 != 0) {
            if (f6 == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (f6 == 2) {
                set.addAll(arrayList);
                return;
            }
            if (f6 != 3) {
                if (f6 == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f6016b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    public List h(List list) {
        if (list.isEmpty()) {
            AbstractC0335i0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        AbstractC0335i0.a("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.f6015a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0811u abstractC0811u = (AbstractC0811u) it.next();
            if (abstractC0811u == AbstractC0811u.f5979f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (abstractC0811u == AbstractC0811u.f5978e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(abstractC0811u)) {
                linkedHashSet.add(abstractC0811u);
            } else {
                AbstractC0335i0.l("QualitySelector", "quality is not supported and will be ignored: " + abstractC0811u);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f6015a + ", fallbackStrategy=" + this.f6016b + "}";
    }
}
