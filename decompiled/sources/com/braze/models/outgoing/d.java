package com.braze.models.outgoing;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {
    public static final String b() {
        return "The leading character in the key string may not be '$'. Not adding property.";
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.isBlank(key)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: e4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.models.outgoing.d.a();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!StringsKt.startsWith$default(key, "$", false, 2, (Object) null)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: e4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.d.b();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
    }
}
