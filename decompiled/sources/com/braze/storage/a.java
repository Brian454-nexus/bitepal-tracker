package com.braze.storage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public pa.d f12892a;

    /* renamed from: b, reason: collision with root package name */
    public int f12893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12894c = bVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f12894c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f12894c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        pa.d dVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f12893b;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            pa.d dVar2 = this.f12894c.f12896a;
            this.f12892a = dVar2;
            this.f12893b = 1;
            if (dVar2.d(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = dVar2;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.f12892a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return Unit.INSTANCE;
        } finally {
            dVar.release();
        }
    }
}
