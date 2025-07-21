package com.braze.triggers.managers;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f13083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f13085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.braze.triggers.actions.a aVar, f fVar, com.braze.triggers.events.b bVar, long j6, Continuation continuation) {
        super(1, continuation);
        this.f13083a = aVar;
        this.f13084b = fVar;
        this.f13085c = bVar;
        this.f13086d = j6;
    }

    public final Continuation create(Continuation continuation) {
        return new e(this.f13083a, this.f13084b, this.f13085c, this.f13086d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return create((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.braze.triggers.actions.a aVar = this.f13083a;
        f fVar = this.f13084b;
        aVar.a(fVar.f13089a, fVar.f13091c, this.f13085c, this.f13086d);
        return Unit.INSTANCE;
    }
}
