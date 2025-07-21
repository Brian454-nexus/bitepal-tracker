package com.braze;

import ga.J;
import ga.L;
import ga.Q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f13135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f13136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f13137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z6, Object obj, boolean z7, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f13132b = z6;
        this.f13133c = obj;
        this.f13134d = z7;
        this.f13135e = braze;
        this.f13136f = function2;
        this.f13137g = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f13132b, this.f13133c, this.f13134d, this.f13135e, this.f13136f, this.f13137g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f13131a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Q b6 = ga.i.b(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new w(this.f13132b, this.f13133c, this.f13134d, this.f13135e, this.f13136f, this.f13137g, null), 3, (Object) null);
        this.f13131a = 1;
        Object await = b6.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
