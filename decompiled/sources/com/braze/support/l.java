package com.braze.support;

import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12999a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");

    /* renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f13000b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final Long a(final String str) {
        try {
            Double doubleOrNull = StringsKt.toDoubleOrNull(str);
            if (doubleOrNull != null) {
                return Long.valueOf((long) (doubleOrNull.doubleValue() * 1000));
            }
            Date parse = f13000b.parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f12999a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.r1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.l.b(str);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(String str) {
        return com.braze.j.a("Could not parse http-date value: ", str);
    }

    public static final LinkedHashMap a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Intrinsics.checkNotNull(key);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ((String) key).toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), CollectionsKt.joinToString$default((Iterable) entry3.getValue(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        return linkedHashMap3;
    }
}
