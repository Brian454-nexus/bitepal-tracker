package y;

import F.AbstractC0335i0;
import I.AbstractC0416a;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2362A f20711a;

    /* renamed from: b, reason: collision with root package name */
    public final A.e f20712b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20713c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static F.C a(@NonNull C2362A c2362a) {
            Long l6 = (Long) c2362a.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l6 != null) {
                return A.b.b(l6.longValue());
            }
            return null;
        }
    }

    public E0(C2362A c2362a) {
        this.f20711a = c2362a;
        this.f20712b = A.e.a(c2362a);
        int[] iArr = (int[]) c2362a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z6 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (iArr[i6] == 18) {
                    z6 = true;
                    break;
                }
                i6++;
            }
        }
        this.f20713c = z6;
    }

    public static boolean a(F.C c6, F.C c7) {
        y0.g.i(c7.e(), "Fully specified range is not actually fully specified.");
        if (c6.b() == 2 && c7.b() == 1) {
            return false;
        }
        if (c6.b() == 2 || c6.b() == 0 || c6.b() == c7.b()) {
            return c6.a() == 0 || c6.a() == c7.a();
        }
        return false;
    }

    public static boolean b(F.C c6, F.C c7, Set set) {
        if (set.contains(c7)) {
            return a(c6, c7);
        }
        AbstractC0335i0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c6, c7));
        return false;
    }

    public static F.C c(F.C c6, Collection collection, Set set) {
        if (c6.b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            F.C c7 = (F.C) it.next();
            y0.g.g(c7, "Fully specified DynamicRange cannot be null.");
            int b6 = c7.b();
            y0.g.i(c7.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (b6 != 1 && b(c6, c7, set)) {
                return c7;
            }
        }
        return null;
    }

    public static boolean e(F.C c6) {
        return Objects.equals(c6, F.C.f1235c);
    }

    public static boolean f(F.C c6) {
        if (c6.b() == 2) {
            return true;
        }
        if (c6.b() == 0 || c6.a() != 0) {
            return c6.b() == 0 && c6.a() != 0;
        }
        return true;
    }

    public static void j(Set set, F.C c6, A.e eVar) {
        y0.g.i(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set b6 = eVar.b(c6);
        if (b6.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(b6);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c6, TextUtils.join("\n  ", b6), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean d() {
        return this.f20713c;
    }

    public Map g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AbstractC0416a) it.next()).c());
        }
        Set c6 = this.f20712b.c();
        HashSet hashSet = new HashSet(c6);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, (F.C) it2.next(), this.f20712b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            I.Y0 y02 = (I.Y0) list2.get(((Integer) it3.next()).intValue());
            F.C l6 = y02.l();
            if (e(l6)) {
                arrayList3.add(y02);
            } else if (f(l6)) {
                arrayList2.add(y02);
            } else {
                arrayList.add(y02);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<I.Y0> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (I.Y0 y03 : arrayList4) {
            F.C i6 = i(c6, linkedHashSet, linkedHashSet2, y03, hashSet);
            hashMap.put(y03, i6);
            if (!linkedHashSet.contains(i6)) {
                linkedHashSet2.add(i6);
            }
        }
        return hashMap;
    }

    public final F.C h(F.C c6, Set set, Set set2, Set set3, String str) {
        F.C c7;
        if (c6.e()) {
            if (set.contains(c6)) {
                return c6;
            }
            return null;
        }
        int b6 = c6.b();
        int a6 = c6.a();
        if (b6 == 1 && a6 == 0) {
            F.C c8 = F.C.f1236d;
            if (set.contains(c8)) {
                return c8;
            }
            return null;
        }
        F.C c9 = c(c6, set2, set);
        if (c9 != null) {
            AbstractC0335i0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c6, c9));
            return c9;
        }
        F.C c10 = c(c6, set3, set);
        if (c10 != null) {
            AbstractC0335i0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c6, c10));
            return c10;
        }
        F.C c11 = F.C.f1236d;
        if (b(c6, c11, set)) {
            AbstractC0335i0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c6, c11));
            return c11;
        }
        if (b6 == 2 && (a6 == 10 || a6 == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c7 = a.a(this.f20711a);
                if (c7 != null) {
                    linkedHashSet.add(c7);
                }
            } else {
                c7 = null;
            }
            linkedHashSet.add(F.C.f1238f);
            F.C c12 = c(c6, linkedHashSet, set);
            if (c12 != null) {
                AbstractC0335i0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, c12.equals(c7) ? "recommended" : "required", c6, c12));
                return c12;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            F.C c13 = (F.C) it.next();
            y0.g.i(c13.e(), "Candidate dynamic range must be fully specified.");
            if (!c13.equals(F.C.f1236d) && a(c6, c13)) {
                AbstractC0335i0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c6, c13));
                return c13;
            }
        }
        return null;
    }

    public final F.C i(Set set, Set set2, Set set3, I.Y0 y02, Set set4) {
        F.C l6 = y02.l();
        F.C h6 = h(l6, set4, set2, set3, y02.K());
        if (h6 == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", y02.K(), l6, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, h6, this.f20712b);
        return h6;
    }
}
