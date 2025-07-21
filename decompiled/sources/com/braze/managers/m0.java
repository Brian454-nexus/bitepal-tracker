package com.braze.managers;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f12473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.f12473b = s0Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m0(this.f12473b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m0(this.f12473b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12472a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            s0 s0Var = this.f12473b;
            this.f12472a = 1;
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
