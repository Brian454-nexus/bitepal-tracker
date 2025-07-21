package com.braze.communication.dust;

import ga.G;
import ga.K;
import ga.Y;
import ga.i;
import ia.r;
import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12093a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f12095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BufferedReader bufferedReader, Continuation continuation) {
        super(2, continuation);
        this.f12095c = bufferedReader;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f12095c, continuation);
        dVar.f12094b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.f12095c, (Continuation) obj2);
        dVar.f12094b = (r) obj;
        return dVar.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        r rVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12093a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            rVar = (r) this.f12094b;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) this.f12094b;
            ResultKt.throwOnFailure(obj);
        }
        while (K.e(rVar)) {
            G b6 = Y.b();
            c cVar = new c(this.f12095c, rVar, null);
            this.f12094b = rVar;
            this.f12093a = 1;
            if (i.g(b6, cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
