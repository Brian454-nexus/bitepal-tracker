package F;

import I.C0447p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0346s {

    /* renamed from: b, reason: collision with root package name */
    public static final C0346s f1477b = new a().d(0).b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0346s f1478c = new a().d(1).b();

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashSet f1479a;

    public C0346s(LinkedHashSet linkedHashSet) {
        this.f1479a = linkedHashSet;
    }

    public LinkedHashSet a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((I.E) it.next()).b());
        }
        List b6 = b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            I.E e6 = (I.E) it2.next();
            if (b6.contains(e6.b())) {
                linkedHashSet2.add(e6);
            }
        }
        return linkedHashSet2;
    }

    public List b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f1479a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC0345q) it.next()).b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet c() {
        return this.f1479a;
    }

    public Integer d() {
        Iterator it = this.f1479a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0345q interfaceC0345q = (InterfaceC0345q) it.next();
            if (interfaceC0345q instanceof C0447p0) {
                Integer valueOf = Integer.valueOf(((C0447p0) interfaceC0345q).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public I.E e(LinkedHashSet linkedHashSet) {
        Iterator it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (I.E) it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: F.s$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f1480a;

        public a() {
            this.f1480a = new LinkedHashSet();
        }

        public static a c(C0346s c0346s) {
            return new a(c0346s.c());
        }

        public a a(InterfaceC0345q interfaceC0345q) {
            this.f1480a.add(interfaceC0345q);
            return this;
        }

        public C0346s b() {
            return new C0346s(this.f1480a);
        }

        public a d(int i6) {
            y0.g.i(i6 != -1, "The specified lens facing is invalid.");
            this.f1480a.add(new C0447p0(i6));
            return this;
        }

        public a(LinkedHashSet linkedHashSet) {
            this.f1480a = new LinkedHashSet(linkedHashSet);
        }
    }
}
