package com.braze.support;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12989a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final List f12990b = CollectionsKt.listOf(new String[]{"$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object"});

    public static final String a(String str) {
        return com.braze.a.a("Nested Custom Attribute Key '", str, "' is invalid.");
    }

    public static final String b(String str) {
        return com.braze.b.a("Custom attribute key cannot be blocklisted attribute: ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final boolean a(final String str, Set blocklistedAttributes) {
        Intrinsics.checkNotNullParameter(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12989a, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.d.c();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12989a, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.d.b(str);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12989a, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.d.d();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return "JSON Object size (" + ((JSONObject) obj).toString().length() + " bytes) exceeds 76800";
    }

    public static final String b(Object obj) {
        return "Could not add unsupported custom attribute type with value: " + obj;
    }

    public static final String c(Object obj) {
        return "Error parsing date " + obj;
    }

    public final JSONObject a(JSONObject jSONObject, int i6) {
        if (i6 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.d.b();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            final String next = keys.next();
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            d dVar = f12989a;
            if ((StringsKt.isBlank(ensureBrazeFieldLength) | StringsKt.contains$default(ensureBrazeFieldLength, "$", false, 2, (Object) null) | StringsKt.contains$default(ensureBrazeFieldLength, ".", false, 2, (Object) null)) & (!f12990b.contains(ensureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dVar, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.d.a(next);
                    }
                }, 6, (Object) null);
            }
            if (!StringsKt.isBlank(ensureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    Object a6 = dVar.a(obj, i6);
                    if (a6 == null) {
                        return null;
                    }
                    jSONObject2.put(ensureBrazeFieldLength, a6);
                }
            }
        }
        return jSONObject2;
    }

    public final JSONArray a(JSONArray jSONArray, int i6) {
        if (i6 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.d.a();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = jSONArray.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Object a6 = a(obj, i6);
            if (a6 == null) {
                return null;
            }
            jSONArray2.put(a6);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public final Object a(final Object value, int i6) {
        Intrinsics.checkNotNullParameter(value, "value");
        if ((value instanceof Boolean) || (value instanceof Integer) || (value instanceof Float) || (value instanceof Long) || (value instanceof Double)) {
            return value;
        }
        if (value instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) value);
        }
        if (value instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.c1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.d.c(value);
                    }
                }, 4, (Object) null);
                return null;
            }
        }
        if (value instanceof JSONObject) {
            if (i6 == 0 && ((JSONObject) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.d1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.d.d(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONObject) value, i6 + 1);
        }
        if (value instanceof JSONArray) {
            if (i6 == 0 && ((JSONArray) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.d.a(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONArray) value, i6 + 1);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.d.b(value);
            }
        }, 6, (Object) null);
        return null;
    }

    public static final String a(Object obj) {
        return "JSON Array size (" + ((JSONArray) obj).toString().length() + " bytes) exceeds 76800";
    }
}
