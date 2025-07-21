package X2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6202a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f6203b = new LinkedHashMap();

    public final boolean a(f3.m id) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f6202a) {
            containsKey = this.f6203b.containsKey(id);
        }
        return containsKey;
    }

    public final v b(f3.m id) {
        v vVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f6202a) {
            vVar = (v) this.f6203b.remove(id);
        }
        return vVar;
    }

    public final List c(String workSpecId) {
        List list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f6202a) {
            try {
                Map map = this.f6203b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Intrinsics.areEqual(((f3.m) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f6203b.remove((f3.m) it.next());
                }
                list = CollectionsKt.toList(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final v d(f3.m id) {
        v vVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f6202a) {
            try {
                Map map = this.f6203b;
                Object obj = map.get(id);
                if (obj == null) {
                    obj = new v(id);
                    map.put(id, obj);
                }
                vVar = (v) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(f3.u spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return d(f3.x.a(spec));
    }
}
