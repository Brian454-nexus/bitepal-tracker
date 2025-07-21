package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFa1mSDK {
    public static AFh1sSDK AFAdRevenueData(Context context) {
        return context instanceof Activity ? AFh1sSDK.activity : context instanceof Application ? AFh1sSDK.application : AFh1sSDK.other;
    }

    private static List<Object> getCurrencyIso4217Code(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            Object obj = jSONArray.get(i6);
            if (obj instanceof JSONArray) {
                obj = getCurrencyIso4217Code((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getRevenue((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static JSONObject getMediationNetwork(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getMediationNetwork(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject getMonetizationNetwork(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Map<String, Object> getRevenue(@NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = getCurrencyIso4217Code((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getRevenue((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static Object getMediationNetwork(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getMediationNetwork(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i6 = 0; i6 < length; i6++) {
                    jSONArray2.put(getMediationNetwork(Array.get(obj, i6)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return getMediationNetwork((Map<String, ?>) obj);
            }
            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
