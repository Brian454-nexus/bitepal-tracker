package com.braze.requests;

import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f12853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.h f12854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.c f12855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, com.braze.requests.framework.h hVar, com.braze.requests.framework.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f12853a = uVar;
        this.f12854b = hVar;
        this.f12855c = cVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f12853a, this.f12854b, this.f12855c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        u uVar = this.f12853a;
        new d(this.f12854b, uVar.f12856a, uVar.f12857b, uVar.f12858c, uVar.f12859d, uVar.f12862g, uVar.f12860e, uVar.f12861f, uVar.f12863h, this.f12855c).c();
        return Unit.INSTANCE;
    }
}
