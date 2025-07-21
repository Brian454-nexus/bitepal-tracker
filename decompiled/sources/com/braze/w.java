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
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f13128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f13129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f13130f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z6, Object obj, boolean z7, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f13125a = z6;
        this.f13126b = obj;
        this.f13127c = z7;
        this.f13128d = braze;
        this.f13129e = function2;
        this.f13130f = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f13125a, this.f13126b, this.f13127c, this.f13128d, this.f13129e, this.f13130f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return (this.f13125a && Braze.INSTANCE.isDisabled()) ? this.f13126b : ga.i.f((CoroutineContext) null, new v(this.f13127c, this.f13128d, this.f13126b, this.f13129e, this.f13130f, null), 1, (Object) null);
    }
}
