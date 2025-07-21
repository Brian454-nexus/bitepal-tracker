package com.braze;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f12306a = brazeUser;
        this.f12307b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.f12306a, this.f12307b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f0(this.f12306a, this.f12307b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12306a.userCache;
        String dateString = this.f12307b;
        synchronized (h0Var) {
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            h0Var.c("dob", dateString);
        }
        return Unit.INSTANCE;
    }
}
