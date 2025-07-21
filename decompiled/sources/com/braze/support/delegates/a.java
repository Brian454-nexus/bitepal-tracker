package com.braze.support.delegates;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements ReadWriteProperty {

    /* renamed from: a, reason: collision with root package name */
    public Object f12991a;

    public static final String a(Object obj, KProperty kProperty) {
        return "Cannot assign " + obj + " to only-set-once property " + kProperty.getName();
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f12991a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object thisRef, final KProperty property, final Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f12991a;
        if (obj2 == null) {
            this.f12991a = obj;
        } else {
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: q4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.delegates.a.a(obj, property);
                }
            }, 7, (Object) null);
        }
    }
}
