package com.braze.models.outgoing;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {
    public static final LinkedHashMap a(Map map) {
        Map map2;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof String) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        final List list = (List) new Pair(arrayList, arrayList2).component2();
        if (list.isEmpty()) {
            map2 = map;
        } else {
            map2 = map;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) map2, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: e4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.e.a(list);
                }
            }, 6, (Object) null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getKey() instanceof String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object value = entry2.getValue();
            if ((value instanceof Date) || (value instanceof Map) || (value instanceof Long) || (value instanceof Integer) || (value instanceof Double) || (value instanceof Boolean) || (value instanceof String) || (value instanceof JSONObject) || (value instanceof JSONArray) || value == null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Date) {
                value2 = DateTimeUtils.formatDate$default((Date) value2, BrazeDateFormat.LONG, null, 2, null);
            } else if (value2 instanceof JSONArray) {
                value2 = a((JSONArray) value2);
            } else if (value2 instanceof Map) {
                value2 = a((Map) value2);
            }
            linkedHashMap3.put(key, value2);
        }
        return linkedHashMap3;
    }

    public static final String a(List list) {
        return "Removing non-string keys from map. Removed keys: " + list;
    }

    public static final JSONArray a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = jSONArray.get(i6);
            if (obj instanceof Date) {
                jSONArray2.put(DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
            } else if (obj instanceof JSONArray) {
                jSONArray2.put(a((JSONArray) obj));
            } else if (obj instanceof Map) {
                jSONArray2.put(a((Map) obj));
            } else {
                jSONArray2.put(obj);
            }
        }
        return jSONArray2;
    }
}
