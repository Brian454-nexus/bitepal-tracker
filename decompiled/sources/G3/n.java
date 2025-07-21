package G3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n {
    public static final Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return g((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return f((JSONArray) obj);
        }
        if (obj instanceof BigDecimal) {
            return Double.valueOf(((BigDecimal) obj).doubleValue());
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static final Object b(Object obj) {
        return obj instanceof Map ? e((Map) obj) : obj instanceof Collection ? c((Collection) obj) : obj instanceof Object[] ? d((Object[]) obj) : obj;
    }

    public static final JSONArray c(Collection collection) {
        if (collection == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(b(it.next()));
        }
        return jSONArray;
    }

    public static final JSONArray d(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ArrayIteratorKt.iterator(objArr);
        while (it.hasNext()) {
            jSONArray.put(b(it.next()));
        }
        return jSONArray;
    }

    public static final JSONObject e(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, b(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final List f(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(a(jSONArray.get(i6)));
        }
        return arrayList;
    }

    public static final Map g(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next);
            linkedHashMap.put(next, a(jSONObject.get(next)));
        }
        return linkedHashMap;
    }
}
