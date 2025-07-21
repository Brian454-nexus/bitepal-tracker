package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f12731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.f12730a = brazeUser;
        this.f12731b = notificationSubscriptionType;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p0(this.f12730a, this.f12731b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p0(this.f12730a, this.f12731b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        String key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12730a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f12731b;
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
            h0Var.c("push_subscribe", key);
        }
        return Unit.INSTANCE;
    }
}
