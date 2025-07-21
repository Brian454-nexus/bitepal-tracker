package com.braze.events;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IEventSubscriber f12246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IEventSubscriber iEventSubscriber, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f12246a = iEventSubscriber;
        this.f12247b = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f12246a, this.f12247b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f12246a, this.f12247b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f12246a.trigger(this.f12247b);
        return Unit.INSTANCE;
    }
}
