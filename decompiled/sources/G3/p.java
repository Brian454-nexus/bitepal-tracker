package G3;

import C3.d;
import C3.e;
import com.appsflyer.AdRevenueScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class p {
    public static final void a(JSONObject jSONObject, String key, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            jSONObject.put(key, obj);
        }
    }

    public static final Set b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            for (int i6 : i(jSONArray)) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final String c(JSONObject jSONObject, String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (!jSONObject.has(key)) {
            return defaultValue;
        }
        String string = jSONObject.getString(key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final JSONObject d(JSONObject jSONObject, String key, JSONObject jSONObject2) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jSONObject.has(key) ? jSONObject.getJSONObject(key) : jSONObject2;
    }

    public static final String e(JSONObject jSONObject, String key, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jSONObject.has(key) ? jSONObject.getString(key) : str;
    }

    public static final Pair f(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length() / 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IntIterator it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            if (nextInt < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList.add(jSONObject);
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                arrayList2.add(jSONObject2);
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static final C3.a g(JSONObject jSONObject) {
        C3.e eVar;
        Map g6;
        Map g7;
        Map g8;
        Map g9;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        C3.a aVar = new C3.a();
        String string = jSONObject.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        aVar.M0(string);
        C3.d dVar = null;
        aVar.C0(e(jSONObject, "user_id", null));
        aVar.a0(e(jSONObject, "device_id", null));
        aVar.B0(jSONObject.has(com.amazon.a.a.h.a.f10907b) ? Long.valueOf(jSONObject.getLong(com.amazon.a.a.h.a.f10907b)) : null);
        JSONObject d6 = d(jSONObject, "event_properties", null);
        aVar.L0((d6 == null || (g9 = n.g(d6)) == null) ? null : MapsKt.toMutableMap(g9));
        JSONObject d7 = d(jSONObject, "user_properties", null);
        aVar.P0((d7 == null || (g8 = n.g(d7)) == null) ? null : MapsKt.toMutableMap(g8));
        JSONObject d8 = d(jSONObject, "groups", null);
        aVar.O0((d8 == null || (g7 = n.g(d8)) == null) ? null : MapsKt.toMutableMap(g7));
        JSONObject d9 = d(jSONObject, "group_properties", null);
        aVar.N0((d9 == null || (g6 = n.g(d9)) == null) ? null : MapsKt.toMutableMap(g6));
        aVar.S(e(jSONObject, "app_version", null));
        aVar.t0(e(jSONObject, "platform", null));
        aVar.p0(e(jSONObject, "os_name", null));
        aVar.q0(e(jSONObject, "os_version", null));
        aVar.Z(e(jSONObject, "device_brand", null));
        aVar.b0(e(jSONObject, "device_manufacturer", null));
        aVar.c0(e(jSONObject, "device_model", null));
        aVar.V(e(jSONObject, "carrier", null));
        aVar.X(e(jSONObject, AdRevenueScheme.COUNTRY, null));
        aVar.x0(e(jSONObject, "region", null));
        aVar.W(e(jSONObject, "city", null));
        aVar.d0(e(jSONObject, "dma", null));
        aVar.l0(e(jSONObject, "language", null));
        aVar.u0(jSONObject.has(com.amazon.a.a.o.b.f11220x) ? Double.valueOf(jSONObject.getDouble(com.amazon.a.a.o.b.f11220x)) : null);
        aVar.w0(jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null);
        aVar.y0(jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null);
        aVar.v0(e(jSONObject, "productId", null));
        aVar.z0(e(jSONObject, "revenueType", null));
        aVar.n0(jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null);
        aVar.o0(jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null);
        aVar.k0(e(jSONObject, "ip", null));
        aVar.g0(e(jSONObject, "idfa", null));
        aVar.h0(e(jSONObject, "idfv", null));
        aVar.P(e(jSONObject, "adid", null));
        aVar.Q(e(jSONObject, "android_id", null));
        aVar.R(jSONObject.optString("android_app_set_id", null));
        aVar.e0(jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null);
        aVar.A0(jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null);
        aVar.j0(e(jSONObject, "insert_id", null));
        aVar.m0(jSONObject.has("library") ? jSONObject.getString("library") : null);
        aVar.r0(e(jSONObject, "partner_id", null));
        if (jSONObject.has("plan")) {
            e.a aVar2 = C3.e.f725e;
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            eVar = aVar2.a(jSONObject2);
        } else {
            eVar = null;
        }
        aVar.s0(eVar);
        if (jSONObject.has("ingestion_metadata")) {
            d.a aVar3 = C3.d.f722c;
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
            dVar = aVar3.a(jSONObject3);
        }
        aVar.i0(dVar);
        return aVar;
    }

    public static final List h(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        IntIterator it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(it.nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(g(jSONObject));
        }
        return arrayList;
    }

    public static final int[] i(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = jSONArray.optInt(i6);
        }
        return iArr;
    }

    public static final List j(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        IntIterator it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(it.nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }
}
