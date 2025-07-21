package I;

import I.P;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: I.y0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0464y0 extends D0 implements InterfaceC0462x0 {

    /* renamed from: J, reason: collision with root package name */
    public static final P.c f2573J = P.c.OPTIONAL;

    public C0464y0(TreeMap treeMap) {
        super(treeMap);
    }

    public static C0464y0 a0() {
        return new C0464y0(new TreeMap(D0.f2234H));
    }

    public static C0464y0 b0(P p6) {
        TreeMap treeMap = new TreeMap(D0.f2234H);
        for (P.a aVar : p6.c()) {
            Set<P.c> a6 = p6.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (P.c cVar : a6) {
                arrayMap.put(cVar, p6.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C0464y0(treeMap);
    }

    @Override // I.InterfaceC0462x0
    public void H(P.a aVar, Object obj) {
        x(aVar, f2573J, obj);
    }

    public Object c0(P.a aVar) {
        return this.f2236G.remove(aVar);
    }

    @Override // I.InterfaceC0462x0
    public void x(P.a aVar, P.c cVar, Object obj) {
        Map map = (Map) this.f2236G.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2236G.put(aVar, arrayMap);
            arrayMap.put(cVar, obj);
            return;
        }
        P.c cVar2 = (P.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), obj) || !P.t(cVar2, cVar)) {
            map.put(cVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + obj);
    }
}
