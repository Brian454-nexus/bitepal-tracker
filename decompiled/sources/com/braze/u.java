package com.braze;

import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f13115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f13116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f13117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z6, boolean z7, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f13113a = z6;
        this.f13114b = z7;
        this.f13115c = braze;
        this.f13116d = function0;
        this.f13117e = function02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f13113a, this.f13114b, this.f13115c, this.f13116d, this.f13117e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ga.i.f((CoroutineContext) null, new t(this.f13113a, this.f13114b, this.f13115c, this.f13116d, this.f13117e, null), 1, (Object) null);
        return Unit.INSTANCE;
    }
}
