package E3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1153a = new e();

    public final Map a(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }

    public final Map b(List events) {
        Intrinsics.checkNotNullParameter(events, "events");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            C3.a aVar = (C3.a) it.next();
            e eVar = f1153a;
            Map I02 = aVar.I0();
            Intrinsics.checkNotNull(I02);
            Object obj = I02.get(C3.c.f709b.b());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            linkedHashMap.putAll(eVar.a(TypeIntrinsics.asMutableMap(obj)));
        }
        return linkedHashMap;
    }
}
