package com.braze.events.internal.dispatchmanager;

import com.braze.models.o;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public final c a(o oVar) {
        if (oVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.events.internal.dispatchmanager.a.a();
                }
            }, 7, (Object) null);
        }
        return new c(b.f12267c, null, oVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
