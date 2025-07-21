package com.braze.managers;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class r0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f12508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.f12508b = s0Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r0(this.f12508b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r0(this.f12508b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12507a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            s0 s0Var = this.f12508b;
            this.f12507a = 1;
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
