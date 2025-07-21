package com.braze.storage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, Continuation continuation) {
        super(2, continuation);
        this.f12915a = pVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f12915a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f12915a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f12915a.f12946j.edit().putStringSet("expired", this.f12915a.f12943g).apply();
        return Unit.INSTANCE;
    }
}
