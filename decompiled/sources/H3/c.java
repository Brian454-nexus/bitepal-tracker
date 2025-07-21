package H3;

import G3.p;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f2205c;

    /* renamed from: d, reason: collision with root package name */
    public Set f2206d;

    /* renamed from: e, reason: collision with root package name */
    public Set f2207e;

    /* renamed from: f, reason: collision with root package name */
    public Set f2208f;

    /* renamed from: g, reason: collision with root package name */
    public Set f2209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JSONObject response) {
        super(g.f2213c, null);
        Intrinsics.checkNotNullParameter(response, "response");
        this.f2205c = p.c(response, "error", "");
        this.f2206d = SetsKt.emptySet();
        this.f2207e = SetsKt.emptySet();
        this.f2208f = SetsKt.emptySet();
        this.f2209g = SetsKt.emptySet();
        if (response.has("events_with_invalid_fields")) {
            JSONObject jSONObject = response.getJSONObject("events_with_invalid_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            this.f2206d = p.b(jSONObject);
        }
        if (response.has("events_with_missing_fields")) {
            JSONObject jSONObject2 = response.getJSONObject("events_with_missing_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            this.f2207e = p.b(jSONObject2);
        }
        if (response.has("silenced_devices")) {
            Object jSONArray = response.getJSONArray("silenced_devices");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            Set set = CollectionsKt.toSet((Iterable) jSONArray);
            Intrinsics.checkNotNull(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            this.f2209g = set;
        }
        if (response.has("silenced_events")) {
            JSONArray jSONArray2 = response.getJSONArray("silenced_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            this.f2208f = ArraysKt.toSet(p.i(jSONArray2));
        }
    }

    public final String b() {
        return this.f2205c;
    }

    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f2206d);
        linkedHashSet.addAll(this.f2207e);
        linkedHashSet.addAll(this.f2208f);
        return linkedHashSet;
    }

    public final boolean d(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String l6 = event.l();
        if (l6 != null) {
            return this.f2209g.contains(l6);
        }
        return false;
    }

    public final boolean e() {
        String lowerCase = this.f2205c.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.contains$default(lowerCase, "invalid api key", false, 2, (Object) null);
    }
}
