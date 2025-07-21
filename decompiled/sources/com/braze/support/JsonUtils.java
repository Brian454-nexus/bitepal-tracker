package com.braze.support;

import android.os.Bundle;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u000f\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b*\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b#\u0010!\u001a\u0013\u0010$\u001a\u00020\u0004*\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u0004\u0018\u00010&*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010(\u001a!\u0010,\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010.\u001a\u00020+*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010-\u001a\u0011\u0010/\u001a\u00020\u0002*\u00020\u0002¢\u0006\u0004\b/\u00100\u001a\u0013\u00102\u001a\u000201*\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00103\"\u0014\u00104\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"", "TargetEnum", "Lorg/json/JSONObject;", "jsonObject", "", "key", "Ljava/lang/Class;", "targetEnumClass", "defaultEnum", "optEnum", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "T", "", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONArray;", "constructJsonArray", "(Ljava/util/Collection;)Lorg/json/JSONArray;", "", "([Ljava/lang/Object;)Lorg/json/JSONArray;", "getOptionalString", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "getDoubleOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "", "convertJSONObjectToMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "", "convertStringJsonArrayToList", "(Lorg/json/JSONArray;)Ljava/util/List;", "oldJson", "newJson", "mergeJsonObjects", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "otherJson", "plus", "getPrettyPrintedString", "(Lorg/json/JSONObject;)Ljava/lang/String;", "", "getColorIntegerOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "target", "source", "", "areJsonObjectsEqual", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z", "isEqualTo", "deepcopy", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Landroid/os/Bundle;", "parseJsonObjectIntoBundle", "(Ljava/lang/String;)Landroid/os/Bundle;", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) opt, (JSONObject) opt2)) {
                    return false;
                }
            } else if (opt != null && opt2 != null && !Intrinsics.areEqual(opt, opt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getJsonKey());
        }
        return jSONArray;
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(final JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (final int i6 = 0; i6 < length; i6++) {
                try {
                    String string = jSONArray.getString(i6);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String convertStringJsonArrayToList$lambda$1;
                            convertStringJsonArrayToList$lambda$1 = JsonUtils.convertStringJsonArrayToList$lambda$1(i6, jSONArray);
                            return convertStringJsonArrayToList$lambda$1;
                        }
                    }, 8, (Object) null);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String convertStringJsonArrayToList$lambda$1(int i6, JSONArray jSONArray) {
        return "Failed to get string for item at index: " + i6 + " and array: " + jSONArray;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: p4.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String colorIntegerOrNull$lambda$8;
                        colorIntegerOrNull$lambda$8 = JsonUtils.getColorIntegerOrNull$lambda$8();
                        return colorIntegerOrNull$lambda$8;
                    }
                }, 8, (Object) null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getColorIntegerOrNull$lambda$8() {
        return "Failed to retrieve color integer from JSON";
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, th, false, new Function0() { // from class: p4.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String prettyPrintedString$lambda$6;
                    prettyPrintedString$lambda$6 = JsonUtils.getPrettyPrintedString$lambda$6();
                    return prettyPrintedString$lambda$6;
                }
            }, 8, (Object) null);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$6() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final JSONObject mergeJsonObjects(JSONObject oldJson, JSONObject newJson) {
        Intrinsics.checkNotNullParameter(oldJson, "oldJson");
        Intrinsics.checkNotNullParameter(newJson, "newJson");
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = oldJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            final String next = keys.next();
            try {
                jSONObject.put(next, oldJson.get(next));
            } catch (JSONException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String mergeJsonObjects$lambda$3$lambda$2;
                        mergeJsonObjects$lambda$3$lambda$2 = JsonUtils.mergeJsonObjects$lambda$3$lambda$2(next);
                        return mergeJsonObjects$lambda$3$lambda$2;
                    }
                }, 8, (Object) null);
            }
        }
        Iterator<String> keys2 = newJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
        while (keys2.hasNext()) {
            final String next2 = keys2.next();
            try {
                jSONObject.put(next2, newJson.get(next2));
            } catch (JSONException e7) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: p4.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String mergeJsonObjects$lambda$5$lambda$4;
                        mergeJsonObjects$lambda$5$lambda$4 = JsonUtils.mergeJsonObjects$lambda$5$lambda$4(next2);
                        return mergeJsonObjects$lambda$5$lambda$4;
                    }
                }, 8, (Object) null);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$3$lambda$2(String str) {
        return com.braze.j.a("Caught exception merging JSON for old key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$5$lambda$4(String str) {
        return com.braze.j.a("Caught exception merging JSON for new key ", str);
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jsonObject, String key, Class<TargetEnum> targetEnumClass, TargetEnum targetenum) {
        TargetEnum targetenum2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        try {
            String string = jsonObject.getString(key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String enumValue = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(enumValue, "toUpperCase(...)");
            Intrinsics.checkNotNullParameter(enumValue, "enumValue");
            Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
            targetenum2 = (TargetEnum) Enum.valueOf(targetEnumClass, enumValue);
        } catch (Exception unused) {
        }
        return targetenum2 == null ? targetenum : targetenum2;
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.Z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String parseJsonObjectIntoBundle$lambda$10;
                        parseJsonObjectIntoBundle$lambda$10 = JsonUtils.parseJsonObjectIntoBundle$lambda$10();
                        return parseJsonObjectIntoBundle$lambda$10;
                    }
                }, 8, (Object) null);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseJsonObjectIntoBundle$lambda$10() {
        return "Unable parse JSON into a bundle.";
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject otherJson) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(otherJson, "otherJson");
        return mergeJsonObjects(jSONObject, otherJson);
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (T t6 : tArr) {
            jSONArray.put(t6);
        }
        return jSONArray;
    }
}
