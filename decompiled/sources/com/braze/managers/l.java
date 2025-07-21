package com.braze.managers;

import ga.U;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.f12447b = mVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f12447b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f12447b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12446a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f12446a = 1;
            if (U.a(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        m mVar = this.f12447b;
        mVar.getClass();
        mVar.a(new com.braze.models.outgoing.j());
        return Unit.INSTANCE;
    }
}
