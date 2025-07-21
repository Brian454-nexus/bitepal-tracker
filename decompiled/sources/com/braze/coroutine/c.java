package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import ga.H;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends AbstractCoroutineContextElement implements H {
    public c(H.a aVar) {
        super(aVar);
    }

    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.f12981E, th, false, (Function0) new a(th), 4, (Object) null);
        if (brazeCoroutineScope.getShouldReRaiseExceptions$android_sdk_base_release()) {
            throw th;
        }
    }
}
