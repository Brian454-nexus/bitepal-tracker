package G3;

import com.appsflyer.AdRevenueScheme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1895a = new o();

    public final JSONObject a(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", event.F0());
        p.a(jSONObject, "user_id", event.N());
        p.a(jSONObject, "device_id", event.l());
        p.a(jSONObject, com.amazon.a.a.h.a.f10907b, event.M());
        p.a(jSONObject, "event_properties", f(n.e(event.E0())));
        p.a(jSONObject, "user_properties", f(n.e(event.I0())));
        p.a(jSONObject, "groups", f(n.e(event.H0())));
        p.a(jSONObject, "group_properties", f(n.e(event.G0())));
        p.a(jSONObject, "app_version", event.d());
        p.a(jSONObject, "platform", event.E());
        p.a(jSONObject, "os_name", event.A());
        p.a(jSONObject, "os_version", event.B());
        p.a(jSONObject, "device_brand", event.k());
        p.a(jSONObject, "device_manufacturer", event.m());
        p.a(jSONObject, "device_model", event.n());
        p.a(jSONObject, "carrier", event.g());
        p.a(jSONObject, AdRevenueScheme.COUNTRY, event.i());
        p.a(jSONObject, "region", event.I());
        p.a(jSONObject, "city", event.h());
        p.a(jSONObject, "dma", event.o());
        p.a(jSONObject, "language", event.w());
        p.a(jSONObject, com.amazon.a.a.o.b.f11220x, event.F());
        p.a(jSONObject, "quantity", event.H());
        p.a(jSONObject, "revenue", event.J());
        p.a(jSONObject, "productId", event.G());
        p.a(jSONObject, "revenueType", event.K());
        p.a(jSONObject, com.amazon.a.a.o.b.f11197a, event.j());
        p.a(jSONObject, "location_lat", event.y());
        p.a(jSONObject, "location_lng", event.z());
        p.a(jSONObject, "ip", event.v());
        p.a(jSONObject, "version_name", event.O());
        p.a(jSONObject, "idfa", event.r());
        p.a(jSONObject, "idfv", event.s());
        p.a(jSONObject, "adid", event.a());
        p.a(jSONObject, "android_id", event.b());
        p.a(jSONObject, "event_id", event.p());
        p.a(jSONObject, "session_id", event.L());
        p.a(jSONObject, "insert_id", event.u());
        p.a(jSONObject, "library", event.x());
        p.a(jSONObject, "partner_id", event.C());
        p.a(jSONObject, "android_app_set_id", event.c());
        C3.e D6 = event.D();
        if (D6 != null) {
            jSONObject.put("plan", D6.b());
        }
        C3.d t6 = event.t();
        if (t6 != null) {
            jSONObject.put("ingestion_metadata", t6.b());
        }
        return jSONObject;
    }

    public final String b(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String jSONObject = a(event).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final String c(List events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            jSONArray.put(a((C3.a) it.next()));
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public final String d(String str) {
        if (str.length() <= 1024) {
            return str;
        }
        String substring = str.substring(0, 1024);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final JSONArray e(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new JSONArray();
        }
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = jSONArray.get(i6);
            if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                jSONArray.put(i6, d((String) obj));
            } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONArray.put(i6, f((JSONObject) obj));
            } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray.put(i6, e((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public final JSONObject f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    jSONObject.put(str, d((String) obj));
                } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    jSONObject.put(str, f((JSONObject) obj));
                } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    jSONObject.put(str, e((JSONArray) obj));
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }
}
