package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l {
    public static final String b(String str) {
        return com.braze.j.a("No RequestEndpointDestination found for name: ", str);
    }

    public final m a(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return m.valueOf(name);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: k4.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.l.b(name);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
