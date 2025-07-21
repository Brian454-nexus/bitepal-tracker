package com.braze.support;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f12993a = new f();

    public static final String a(String str) {
        return com.braze.j.a("Failed to create valid enum from string: ", str);
    }

    public static final EnumSet a(Class targetEnumClass, Set sourceStringSet) {
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        Intrinsics.checkNotNullParameter(sourceStringSet, "sourceStringSet");
        EnumSet noneOf = EnumSet.noneOf(targetEnumClass);
        Iterator it = sourceStringSet.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String enumValue = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(enumValue, "toUpperCase(...)");
                Intrinsics.checkNotNullParameter(enumValue, "enumValue");
                Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
                noneOf.add(Enum.valueOf(targetEnumClass, enumValue));
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12993a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.j1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.f.a(str);
                    }
                }, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(noneOf);
        return noneOf;
    }

    public static final Set a(EnumSet sourceEnumSet) {
        Intrinsics.checkNotNullParameter(sourceEnumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sourceEnumSet, 10));
        Iterator it = sourceEnumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return CollectionsKt.toSet(arrayList);
    }
}
