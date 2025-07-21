package com.braze;

import com.braze.enums.Gender;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gender f12334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(BrazeUser brazeUser, Gender gender, Continuation continuation) {
        super(2, continuation);
        this.f12333a = brazeUser;
        this.f12334b = gender;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j0(this.f12333a, this.f12334b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j0(this.f12333a, this.f12334b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        String key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12333a.userCache;
        Gender gender = this.f12334b;
        synchronized (h0Var) {
            if (gender != null) {
                try {
                    key = gender.getKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                key = null;
            }
            h0Var.c("gender", key);
        }
        return Unit.INSTANCE;
    }
}
