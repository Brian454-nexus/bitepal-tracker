package com.braze.managers;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import ga.U;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f12491b = rVar;
    }

    public static final String a() {
        return "Requesting data flush on internal session close flush timer.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f12491b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q(this.f12491b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12490a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            long j6 = r.f12493n;
            this.f12490a = 1;
            if (U.a(j6, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, r.f12492m, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.Q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.q.a();
            }
        }, 14, (Object) null);
        Braze.INSTANCE.getInstance(this.f12491b.f12495a).requestImmediateDataFlush();
        return Unit.INSTANCE;
    }
}
