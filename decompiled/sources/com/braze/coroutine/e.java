package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import ga.H;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends AbstractCoroutineContextElement implements H {
    public e(H.a aVar) {
        super(aVar);
    }

    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f.f12131a, BrazeLogger.Priority.f12981E, th, false, (Function0) new d(th), 4, (Object) null);
            com.braze.events.d dVar = f.f12132b;
            if (dVar != null) {
                dVar.b(th, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
