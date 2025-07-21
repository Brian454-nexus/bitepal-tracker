package com.braze;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f12382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f12383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f12382b = iValueCallback;
        this.f12383c = braze;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f12382b, this.f12383c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.f12382b, this.f12383c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12381a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            l lVar = new l(this.f12382b, this.f12383c, null);
            this.f12381a = 1;
            if (ga.i.g(coroutineContext, lVar, this) == coroutine_suspended) {
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
