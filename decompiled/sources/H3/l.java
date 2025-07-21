package H3;

import G3.p;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends b {

    /* renamed from: c, reason: collision with root package name */
    public Set f2222c;

    /* renamed from: d, reason: collision with root package name */
    public Set f2223d;

    /* renamed from: e, reason: collision with root package name */
    public Set f2224e;

    /* renamed from: f, reason: collision with root package name */
    public Set f2225f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2226g;

    /* renamed from: h, reason: collision with root package name */
    public Set f2227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(JSONObject response) {
        super(g.f2216f, null);
        Intrinsics.checkNotNullParameter(response, "response");
        this.f2222c = SetsKt.emptySet();
        this.f2223d = SetsKt.emptySet();
        this.f2224e = SetsKt.emptySet();
        this.f2225f = SetsKt.emptySet();
        this.f2226g = p.c(response, "error", "");
        this.f2227h = SetsKt.emptySet();
        if (response.has("exceeded_daily_quota_users")) {
            Set keySet = response.getJSONObject("exceeded_daily_quota_users").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            this.f2222c = keySet;
        }
        if (response.has("exceeded_daily_quota_devices")) {
            Set keySet2 = response.getJSONObject("exceeded_daily_quota_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet2, "keySet(...)");
            this.f2223d = keySet2;
        }
        if (response.has("throttled_events")) {
            JSONArray jSONArray = response.getJSONArray("throttled_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            this.f2227h = ArraysKt.toSet(p.i(jSONArray));
        }
        if (response.has("throttled_users")) {
            Set keySet3 = response.getJSONObject("throttled_users").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet3, "keySet(...)");
            this.f2225f = keySet3;
        }
        if (response.has("throttled_devices")) {
            Set keySet4 = response.getJSONObject("throttled_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet4, "keySet(...)");
            this.f2224e = keySet4;
        }
    }

    public final String b() {
        return this.f2226g;
    }

    public final Set c() {
        return this.f2227h;
    }

    public final boolean d(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.N() == null || !CollectionsKt.contains(this.f2222c, event.N())) {
            return event.l() != null && CollectionsKt.contains(this.f2223d, event.l());
        }
        return true;
    }
}
