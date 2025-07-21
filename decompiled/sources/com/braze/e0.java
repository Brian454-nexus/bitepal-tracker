package com.braze;

import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(BrazeUser brazeUser, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f12165a = brazeUser;
        this.f12166b = str;
        this.f12167c = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e0(this.f12165a, this.f12166b, this.f12167c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12165a.userCache;
        String key = this.f12166b;
        Object value = this.f12167c;
        synchronized (h0Var) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            h0Var.a(key, value);
        }
        return Unit.INSTANCE;
    }
}
