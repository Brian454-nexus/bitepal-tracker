package com.braze;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f12310a = brazeUser;
        this.f12311b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g0(this.f12310a, this.f12311b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g0(this.f12310a, this.f12311b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12310a.userCache;
        String str = this.f12311b;
        synchronized (h0Var) {
            h0Var.c("email", str);
        }
        return Unit.INSTANCE;
    }
}
