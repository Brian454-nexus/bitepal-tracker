package O;

import I.D;
import I.InterfaceC0441m0;
import I.Y0;
import L.a;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3868b;

    /* renamed from: c, reason: collision with root package name */
    public final Rational f3869c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3870d;

    public i(D d6, Rational rational) {
        this.f3867a = d6.a();
        this.f3868b = d6.g();
        this.f3869c = rational;
        boolean z6 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z6 = false;
        }
        this.f3870d = z6;
    }

    public static Size a(Size size, int i6, int i7, int i8) {
        return (size == null || !e(i6, i7, i8)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static Rational b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : h.l(list)) {
            if (L.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i6, int i7, int i8) {
        int a6 = L.c.a(L.c.b(i6), i8, 1 == i7);
        return a6 == 90 || a6 == 270;
    }

    public final Rational c(InterfaceC0441m0 interfaceC0441m0, List list) {
        if (interfaceC0441m0.L()) {
            return h.n(interfaceC0441m0.O(), this.f3870d);
        }
        Size d6 = d(interfaceC0441m0);
        if (d6 != null) {
            return b(d6, list);
        }
        return null;
    }

    public final Size d(InterfaceC0441m0 interfaceC0441m0) {
        return a(interfaceC0441m0.A(null), interfaceC0441m0.V(0), this.f3868b, this.f3867a);
    }

    public List f(List list, Y0 y02) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new L.e(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0441m0 interfaceC0441m0 = (InterfaceC0441m0) y02;
        Size i6 = interfaceC0441m0.i(null);
        Size size = (Size) arrayList.get(0);
        if (i6 == null || S.d.a(size) < S.d.a(i6)) {
            i6 = size;
        }
        Size d6 = d(interfaceC0441m0);
        Size size2 = S.d.f4639c;
        int a6 = S.d.a(size2);
        if (S.d.a(i6) < a6) {
            size2 = S.d.f4637a;
        } else if (d6 != null && S.d.a(d6) < a6) {
            size2 = d6;
        }
        for (Size size3 : arrayList) {
            if (S.d.a(size3) <= S.d.a(i6) && S.d.a(size3) >= S.d.a(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + i6 + "\ninitial size list: " + arrayList);
        }
        Rational c6 = c(interfaceC0441m0, arrayList2);
        if (d6 == null) {
            d6 = interfaceC0441m0.w(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (c6 == null) {
            arrayList3.addAll(arrayList2);
            if (d6 != null) {
                h.q(arrayList3, d6, true);
                return arrayList3;
            }
        } else {
            Map o6 = h.o(arrayList2);
            if (d6 != null) {
                Iterator it = o6.keySet().iterator();
                while (it.hasNext()) {
                    h.q((List) o6.get((Rational) it.next()), d6, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(o6.keySet());
            Collections.sort(arrayList4, new a.C0055a(c6, this.f3869c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) o6.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
