package com.braze.managers;

import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import ga.J;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f12480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.f12479b = rVar;
        this.f12480c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.f12479b, this.f12480c, continuation);
        oVar.f12478a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12478a;
        r rVar = this.f12479b;
        ReentrantLock reentrantLock = rVar.f12502h;
        reentrantLock.lock();
        try {
            try {
                rVar.i();
            } catch (Exception e6) {
                try {
                    rVar.f12497c.b(e6, Throwable.class);
                } catch (Exception e7) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: Z3.O2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.braze.managers.o.a();
                        }
                    }, 4, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f12480c.finish();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
