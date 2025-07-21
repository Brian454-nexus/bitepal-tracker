package com.braze;

import com.braze.support.ValidationUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f12735a = brazeUser;
        this.f12736b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q0(this.f12735a, this.f12736b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q0(this.f12735a, this.f12736b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12735a.userCache;
        String key = this.f12736b;
        synchronized (h0Var) {
            Intrinsics.checkNotNullParameter(key, "key");
            h0Var.a(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
        }
        return Unit.INSTANCE;
    }
}
