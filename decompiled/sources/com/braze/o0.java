package com.braze;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f12726a = brazeUser;
        this.f12727b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o0(this.f12726a, this.f12727b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o0(this.f12726a, this.f12727b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12726a.userCache;
        String str = this.f12727b;
        synchronized (h0Var) {
            h0Var.c("phone", str);
        }
        return Unit.INSTANCE;
    }
}
