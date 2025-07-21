package y;

import F.AbstractC0335i0;
import I.AbstractC0416a;
import I.C0437k0;
import I.C0464y0;
import I.InterfaceC0439l0;
import I.P;
import I.Z0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x.C2253a;
import y.C2298e1;
import z.C2362A;

/* renamed from: y.c1, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2292c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f20954a = P.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b, reason: collision with root package name */
    public static final Map f20955b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f20956c;

    static {
        HashMap hashMap = new HashMap();
        f20955b = hashMap;
        HashMap hashMap2 = new HashMap();
        f20956c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            Z0.b bVar = Z0.b.PREVIEW;
            hashSet.add(bVar);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(Z0.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            Z0.b bVar2 = Z0.b.IMAGE_CAPTURE;
            hashSet3.add(bVar2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            Z0.b bVar3 = Z0.b.VIDEO_CAPTURE;
            hashSet4.add(bVar3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar2);
            hashSet5.add(bVar3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar3);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map map, Map map2, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            long f6 = ((I.Q0) list.get(i6)).f();
            if (map.containsKey(Integer.valueOf(i6))) {
                AbstractC0416a abstractC0416a = (AbstractC0416a) map.get(Integer.valueOf(i6));
                if (!g(abstractC0416a.b().size() == 1 ? (Z0.b) abstractC0416a.b().get(0) : Z0.b.STREAM_SHARING, f6, abstractC0416a.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i6))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                I.Y0 y02 = (I.Y0) map2.get(Integer.valueOf(i6));
                if (!g(y02.G(), f6, y02.G() == Z0.b.STREAM_SHARING ? ((V.f) y02).X() : Collections.EMPTY_LIST)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains((Long) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(C2362A c2362a, List list) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c2362a.a(key);
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j6 : jArr) {
            hashSet.add(Long.valueOf(j6));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((I.Q0) it.next()).f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0416a abstractC0416a = (AbstractC0416a) it.next();
            if (j(abstractC0416a.e(), (Z0.b) abstractC0416a.b().get(0))) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            I.Y0 y02 = (I.Y0) it2.next();
            if (j(y02, y02.G())) {
                return true;
            }
        }
        return false;
    }

    public static C2253a e(I.Y0 y02) {
        C0464y0 a02 = C0464y0.a0();
        P.a aVar = C2253a.f20383I;
        if (y02.h(aVar)) {
            a02.H(aVar, (Long) y02.b(aVar));
        }
        P.a aVar2 = I.Y0.f2399y;
        if (y02.h(aVar2)) {
            a02.H(aVar2, (Boolean) y02.b(aVar2));
        }
        P.a aVar3 = C0437k0.f2481H;
        if (y02.h(aVar3)) {
            a02.H(aVar3, (Integer) y02.b(aVar3));
        }
        P.a aVar4 = InterfaceC0439l0.f2494f;
        if (y02.h(aVar4)) {
            a02.H(aVar4, (Integer) y02.b(aVar4));
        }
        return new C2253a(a02);
    }

    public static I.P f(I.P p6, long j6) {
        P.a aVar = f20954a;
        if (p6.h(aVar) && ((Long) p6.b(aVar)).longValue() == j6) {
            return null;
        }
        C0464y0 b02 = C0464y0.b0(p6);
        b02.H(aVar, Long.valueOf(j6));
        return new C2253a(b02);
    }

    public static boolean g(Z0.b bVar, long j6, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != Z0.b.STREAM_SHARING) {
            Map map = f20955b;
            return map.containsKey(Long.valueOf(j6)) && ((Set) map.get(Long.valueOf(j6))).contains(bVar);
        }
        Map map2 = f20956c;
        if (!map2.containsKey(Long.valueOf(j6))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j6));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((Z0.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(C2362A c2362a) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c2362a.a(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean i(List list, List list2, Set set) {
        boolean z6;
        boolean z7;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0416a abstractC0416a = (AbstractC0416a) it.next();
            I.P e6 = abstractC0416a.e();
            P.a aVar = C2253a.f20383I;
            if (e6.h(aVar) && ((Long) abstractC0416a.e().b(aVar)).longValue() != 0) {
                z6 = true;
                z7 = false;
            } else {
                z7 = true;
                z6 = false;
            }
        } else {
            z6 = false;
            z7 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            I.Y0 y02 = (I.Y0) it2.next();
            P.a aVar2 = C2253a.f20383I;
            if (y02.h(aVar2)) {
                Long l6 = (Long) y02.b(aVar2);
                if (l6.longValue() != 0) {
                    if (z7) {
                        o();
                    }
                    hashSet.add(l6);
                    z6 = true;
                } else if (z6) {
                    o();
                }
            } else if (z6) {
                o();
            }
            z7 = true;
        }
        return !z7 && b(set, hashSet);
    }

    public static boolean j(I.P p6, Z0.b bVar) {
        if (((Boolean) p6.e(I.Y0.f2399y, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        P.a aVar = C0437k0.f2481H;
        return p6.h(aVar) && t1.b(bVar, ((Integer) p6.b(aVar)).intValue()) == 5;
    }

    public static boolean k(C2362A c2362a, List list, Map map, Map map2) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<I.Y0> arrayList = new ArrayList(map.keySet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0.g.f(((AbstractC0416a) it.next()).e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            y0.g.f(((I.O0) y0.g.f((I.O0) map.get((I.Y0) it2.next()))).d());
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c2362a.a(key);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j6 : jArr) {
                hashSet.add(Long.valueOf(j6));
            }
            if (i(list, arrayList, hashSet)) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC0416a abstractC0416a = (AbstractC0416a) it3.next();
                    I.P e6 = abstractC0416a.e();
                    I.P f6 = f(e6, ((Long) e6.b(C2253a.f20383I)).longValue());
                    if (f6 != null) {
                        map2.put(abstractC0416a, abstractC0416a.i(f6));
                    }
                }
                for (I.Y0 y02 : arrayList) {
                    I.O0 o02 = (I.O0) map.get(y02);
                    I.P d6 = o02.d();
                    I.P f7 = f(d6, ((Long) d6.b(C2253a.f20383I)).longValue());
                    if (f7 != null) {
                        map.put(y02, o02.f().d(f7).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map map, Map map2, Map map3, Map map4, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            long f6 = ((I.Q0) list.get(i6)).f();
            if (map3.containsKey(Integer.valueOf(i6))) {
                AbstractC0416a abstractC0416a = (AbstractC0416a) map3.get(Integer.valueOf(i6));
                I.P f7 = f(abstractC0416a.e(), f6);
                if (f7 != null) {
                    map2.put(abstractC0416a, abstractC0416a.i(f7));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i6))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                I.Y0 y02 = (I.Y0) map4.get(Integer.valueOf(i6));
                I.O0 o02 = (I.O0) map.get(y02);
                I.P f8 = f(o02.d(), f6);
                if (f8 != null) {
                    map.put(y02, o02.f().d(f8).a());
                }
            }
        }
    }

    public static void m(Collection collection, Collection collection2, Map map) {
        ArrayList arrayList = new ArrayList(collection2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            I.L0 l02 = (I.L0) it.next();
            I.P d6 = l02.d();
            P.a aVar = f20954a;
            if (d6.h(aVar) && l02.k().size() != 1) {
                AbstractC0335i0.c("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(l02.k().size())));
                return;
            }
            if (l02.d().h(aVar)) {
                Iterator it2 = collection.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    I.L0 l03 = (I.L0) it2.next();
                    if (((I.Y0) arrayList.get(i6)).G() == Z0.b.METERING_REPEATING) {
                        map.put((I.W) l03.k().get(0), 1L);
                    } else {
                        I.P d7 = l03.d();
                        P.a aVar2 = f20954a;
                        if (d7.h(aVar2)) {
                            map.put((I.W) l03.k().get(0), (Long) l03.d().b(aVar2));
                        }
                    }
                    i6++;
                }
                return;
            }
        }
    }

    public static boolean n(C2298e1.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    public static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
