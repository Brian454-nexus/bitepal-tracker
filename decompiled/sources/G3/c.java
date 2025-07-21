package G3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1771c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public List f1772a;

    /* renamed from: b, reason: collision with root package name */
    public Set f1773b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c() {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.f1773b = synchronizedSet;
    }

    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f1773b.add(log);
        while (this.f1773b.size() > 10) {
            Set set = this.f1773b;
            set.remove(CollectionsKt.first(set));
        }
    }

    public final void b(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f1772a == null) {
            this.f1772a = Collections.synchronizedList(new ArrayList());
        }
        List list = this.f1772a;
        if (list != null) {
            list.add(event);
        }
    }

    public final String c() {
        if (!d()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = this.f1772a;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (!list.isEmpty()) {
                List list2 = this.f1772a;
                Intrinsics.checkNotNull(list2);
                linkedHashMap.put("malformed_events", list2);
            }
        }
        if (!this.f1773b.isEmpty()) {
            linkedHashMap.put("error_logs", CollectionsKt.toList(this.f1773b));
        }
        String valueOf = String.valueOf(n.e(linkedHashMap));
        List list3 = this.f1772a;
        if (list3 != null) {
            list3.clear();
        }
        this.f1773b.clear();
        return valueOf;
    }

    public final boolean d() {
        List list = this.f1772a;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (!list.isEmpty()) {
                return true;
            }
        }
        return !this.f1773b.isEmpty();
    }
}
