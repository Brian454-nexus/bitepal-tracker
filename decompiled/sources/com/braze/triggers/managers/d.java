package com.braze.triggers.managers;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f13078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f13080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.braze.triggers.actions.a aVar, f fVar, com.braze.triggers.events.b bVar, long j6, long j7, Continuation continuation) {
        super(1, continuation);
        this.f13078a = aVar;
        this.f13079b = fVar;
        this.f13080c = bVar;
        this.f13081d = j6;
        this.f13082e = j7;
    }

    public static final String a(long j6) {
        return "Performing triggered action after a delay of " + j6 + " ms.";
    }

    public final Continuation create(Continuation continuation) {
        return new d(this.f13078a, this.f13079b, this.f13080c, this.f13081d, this.f13082e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return create((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f.f13088q;
        final long j6 = this.f13082e;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: t4.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.triggers.managers.d.a(j6);
            }
        }, 14, (Object) null);
        com.braze.triggers.actions.a aVar = this.f13078a;
        f fVar = this.f13079b;
        aVar.a(fVar.f13089a, fVar.f13091c, this.f13080c, this.f13081d);
        return Unit.INSTANCE;
    }
}
