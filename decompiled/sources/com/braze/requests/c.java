package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {
    public static void a(final Object obj, Function0 function0) {
        try {
            function0.invoke();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: k4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.requests.c.a(obj);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return "Encountered exception while parsing server response for " + obj;
    }
}
