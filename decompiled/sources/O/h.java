package O;

import F.AbstractC0335i0;
import I.D;
import I.InterfaceC0441m0;
import I.Y0;
import L.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final D f3861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3863c;

    /* renamed from: d, reason: collision with root package name */
    public final Rational f3864d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3865e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3866f;

    public h(D d6, Size size) {
        this.f3861a = d6;
        this.f3862b = d6.a();
        this.f3863c = d6.g();
        Rational h6 = size != null ? h(size) : i(d6);
        this.f3864d = h6;
        boolean z6 = true;
        if (h6 != null && h6.getNumerator() < h6.getDenominator()) {
            z6 = false;
        }
        this.f3865e = z6;
        this.f3866f = new i(d6, h6);
    }

    public static void d(LinkedHashMap linkedHashMap, Size size) {
        int a6 = S.d.a(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (S.d.a(size2) <= a6) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static void f(LinkedHashMap linkedHashMap, U.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g((List) linkedHashMap.get((Rational) it.next()), dVar);
        }
    }

    public static void g(List list, U.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int b6 = dVar.b();
        if (dVar.equals(U.d.f5160c)) {
            return;
        }
        Size a6 = dVar.a();
        if (b6 == 0) {
            s(list, a6);
            return;
        }
        if (b6 == 1) {
            q(list, a6, true);
            return;
        }
        if (b6 == 2) {
            q(list, a6, false);
        } else if (b6 == 3) {
            r(list, a6, true);
        } else {
            if (b6 != 4) {
                return;
            }
            r(list, a6, false);
        }
    }

    public static List l(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(L.a.f3013a);
        arrayList.add(L.a.f3015c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (L.a.a(size, (Rational) it2.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational n(int i6, boolean z6) {
        if (i6 == -1) {
            return null;
        }
        if (i6 == 0) {
            return z6 ? L.a.f3013a : L.a.f3014b;
        }
        if (i6 == 1) {
            return z6 ? L.a.f3015c : L.a.f3016d;
        }
        AbstractC0335i0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i6);
        return null;
    }

    public static Map o(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = l(list).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (L.a.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void q(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    public static void r(List list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            Size size2 = (Size) list.get(i6);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    public static void s(List list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public final LinkedHashMap a(List list, U.a aVar) {
        return b(o(list), aVar);
    }

    public final LinkedHashMap b(Map map, U.a aVar) {
        Rational n6 = n(aVar.b(), this.f3865e);
        if (aVar.a() == 0) {
            Rational n7 = n(aVar.b(), this.f3865e);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational = (Rational) it.next();
                if (!rational.equals(n7)) {
                    map.remove(rational);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0055a(n6, this.f3864d));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, (List) map.get(rational2));
        }
        return linkedHashMap;
    }

    public final List c(List list, U.c cVar, int i6) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f3861a.i(i6));
        Collections.sort(arrayList, new L.e(true));
        return arrayList;
    }

    public final List e(List list, U.b bVar, int i6) {
        if (bVar == null) {
            return list;
        }
        List a6 = bVar.a(new ArrayList(list), L.c.a(L.c.b(i6), this.f3862b, this.f3863c == 1));
        if (list.containsAll(a6)) {
            return a6;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public final Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Rational i(D d6) {
        List m6 = d6.m(256);
        if (m6.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(m6, new L.e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List j(int i6, InterfaceC0441m0 interfaceC0441m0) {
        Size[] sizeArr;
        List<Pair> m6 = interfaceC0441m0.m(null);
        if (m6 != null) {
            for (Pair pair : m6) {
                if (((Integer) pair.first).intValue() == i6) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public final List k(Y0 y02) {
        int q6 = y02.q();
        List j6 = j(q6, (InterfaceC0441m0) y02);
        if (j6 == null) {
            j6 = this.f3861a.m(q6);
        }
        ArrayList arrayList = new ArrayList(j6);
        Collections.sort(arrayList, new L.e(true));
        if (arrayList.isEmpty()) {
            AbstractC0335i0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + q6 + ".");
        }
        return arrayList;
    }

    public List m(Y0 y02) {
        InterfaceC0441m0 interfaceC0441m0 = (InterfaceC0441m0) y02;
        List p6 = interfaceC0441m0.p(null);
        return p6 != null ? p6 : interfaceC0441m0.F(null) == null ? this.f3866f.f(k(y02), y02) : p(y02);
    }

    public final List p(Y0 y02) {
        U.c n6 = ((InterfaceC0441m0) y02).n();
        List k6 = k(y02);
        if (!y02.s(false)) {
            k6 = c(k6, n6, y02.q());
        }
        LinkedHashMap a6 = a(k6, n6.b());
        InterfaceC0441m0 interfaceC0441m0 = (InterfaceC0441m0) y02;
        Size i6 = interfaceC0441m0.i(null);
        if (i6 != null) {
            d(a6, i6);
        }
        f(a6, n6.d());
        ArrayList arrayList = new ArrayList();
        Iterator it = a6.values().iterator();
        while (it.hasNext()) {
            for (Size size : (List) it.next()) {
                if (!arrayList.contains(size)) {
                    arrayList.add(size);
                }
            }
        }
        return e(arrayList, n6.c(), interfaceC0441m0.V(0));
    }
}
