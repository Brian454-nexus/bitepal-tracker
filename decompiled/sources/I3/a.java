package I3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2792a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2793b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2794c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2795d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2796e;

    public a(String eventType, Map map, Map map2, Map map3, Map map4) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f2792a = eventType;
        this.f2793b = map;
        this.f2794c = map2;
        this.f2795d = map3;
        this.f2796e = map4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f2792a, aVar.f2792a) && Intrinsics.areEqual(this.f2793b, aVar.f2793b) && Intrinsics.areEqual(this.f2794c, aVar.f2794c) && Intrinsics.areEqual(this.f2795d, aVar.f2795d) && Intrinsics.areEqual(this.f2796e, aVar.f2796e);
    }

    public int hashCode() {
        int hashCode = this.f2792a.hashCode() * 31;
        Map map = this.f2793b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f2794c;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f2795d;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f2796e;
        return hashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "Event(eventType=" + this.f2792a + ", eventProperties=" + this.f2793b + ", userProperties=" + this.f2794c + ", groups=" + this.f2795d + ", groupProperties=" + this.f2796e + ')';
    }
}
