package com.braze.models.inappmessage;

import com.braze.events.internal.f0;
import com.braze.managers.c0;
import com.braze.managers.m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f12593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InAppMessageBase inAppMessageBase, Continuation continuation) {
        super(2, continuation);
        this.f12593a = inAppMessageBase;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f12593a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f12593a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        c0 brazeManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        atomicBoolean = this.f12593a.clickLogged;
        if (atomicBoolean.get() && (brazeManager = this.f12593a.getBrazeManager()) != null) {
            com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(this.f12593a.getTriggerId());
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            ((m) brazeManager).f12454d.b(new f0(triggerEvent), f0.class);
        }
        return Unit.INSTANCE;
    }
}
