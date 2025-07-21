package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f12314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.f12313a = brazeUser;
        this.f12314b = notificationSubscriptionType;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h0(this.f12313a, this.f12314b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h0(this.f12313a, this.f12314b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        String key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12313a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f12314b;
        synchronized (h0Var) {
            if (notificationSubscriptionType != null) {
                try {
                    key = notificationSubscriptionType.getKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                key = null;
            }
            h0Var.c("email_subscribe", key);
        }
        return Unit.INSTANCE;
    }
}
