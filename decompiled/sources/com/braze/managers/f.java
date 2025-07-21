package com.braze.managers;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends SuspendLambda implements Function1 {
    public f(Continuation continuation) {
        super(1, continuation);
    }

    public static final String a(d dVar) {
        return "Removing banner from monitor list " + dVar.f12403a;
    }

    public static final String b(d dVar) {
        return com.braze.c.a(new StringBuilder("Error checking banner visibility for "), dVar.f12403a, ".Removing banner from visibility monitoring.");
    }

    public final Continuation create(Continuation continuation) {
        return new f(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new f((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ReentrantLock reentrantLock = h.f12412n;
        reentrantLock.lock();
        try {
            h.f12411m = null;
            Iterator it = h.f12413o.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                try {
                    if (!dVar.f12405c) {
                        g gVar = h.f12409k;
                        if (gVar.a(dVar)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) gVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.z0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return com.braze.managers.f.a(com.braze.managers.d.this);
                                }
                            }, 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.f12409k, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.A0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.f.b(com.braze.managers.d.this);
                        }
                    }, 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = h.f12413o;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((d) it2.next()).f12405c) {
                        g gVar2 = h.f12409k;
                        g.b();
                        break;
                    }
                }
            }
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
