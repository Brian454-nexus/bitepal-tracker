package I;

import I.P;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class D0 implements P {

    /* renamed from: H, reason: collision with root package name */
    public static final Comparator f2234H;

    /* renamed from: I, reason: collision with root package name */
    public static final D0 f2235I;

    /* renamed from: G, reason: collision with root package name */
    public final TreeMap f2236G;

    static {
        Comparator comparator = new Comparator() { // from class: I.C0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((P.a) obj).c().compareTo(((P.a) obj2).c());
                return compareTo;
            }
        };
        f2234H = comparator;
        f2235I = new D0(new TreeMap(comparator));
    }

    public D0(TreeMap treeMap) {
        this.f2236G = treeMap;
    }

    public static D0 Y() {
        return f2235I;
    }

    public static D0 Z(P p6) {
        if (D0.class.equals(p6.getClass())) {
            return (D0) p6;
        }
        TreeMap treeMap = new TreeMap(f2234H);
        for (P.a aVar : p6.c()) {
            Set<P.c> a6 = p6.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (P.c cVar : a6) {
                arrayMap.put(cVar, p6.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new D0(treeMap);
    }

    @Override // I.P
    public Set a(P.a aVar) {
        Map map = (Map) this.f2236G.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // I.P
    public Object b(P.a aVar) {
        Map map = (Map) this.f2236G.get(aVar);
        if (map != null) {
            return map.get((P.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // I.P
    public Set c() {
        return Collections.unmodifiableSet(this.f2236G.keySet());
    }

    @Override // I.P
    public Object d(P.a aVar, P.c cVar) {
        Map map = (Map) this.f2236G.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // I.P
    public Object e(P.a aVar, Object obj) {
        try {
            return b(aVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // I.P
    public P.c f(P.a aVar) {
        Map map = (Map) this.f2236G.get(aVar);
        if (map != null) {
            return (P.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // I.P
    public void g(String str, P.b bVar) {
        for (Map.Entry entry : this.f2236G.tailMap(P.a.a(str, Void.class)).entrySet()) {
            if (!((P.a) entry.getKey()).c().startsWith(str) || !bVar.a((P.a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // I.P
    public boolean h(P.a aVar) {
        return this.f2236G.containsKey(aVar);
    }
}
