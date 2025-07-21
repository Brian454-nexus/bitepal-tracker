package com.braze.managers;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p0 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f12489b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, Continuation continuation) {
        super(1, continuation);
        this.f12489b = s0Var;
    }

    public final Continuation create(Continuation continuation) {
        return new p0(this.f12489b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new p0(this.f12489b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12488a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            s0 s0Var = this.f12489b;
            this.f12488a = 1;
            if (s0Var.a() == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
