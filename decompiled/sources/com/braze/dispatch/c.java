package com.braze.dispatch;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f12140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f12141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Intent intent, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.f12139b = fVar;
        this.f12140c = intent;
        this.f12141d = pendingResult;
    }

    public static final String a() {
        return "Retrieving connectivity event data in background";
    }

    public static final String b() {
        return "Failed to process connectivity event.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f12139b, this.f12140c, this.f12141d, continuation);
        cVar.f12138a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12138a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: U3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.dispatch.c.a();
            }
        }, 6, (Object) null);
        try {
            f fVar = this.f12139b;
            com.braze.enums.f fVar2 = fVar.f12158j;
            fVar.f12158j = com.braze.support.c.a(this.f12140c, fVar.f12157i);
            f fVar3 = this.f12139b;
            com.braze.enums.f fVar4 = fVar3.f12158j;
            if (fVar2 != fVar4) {
                fVar3.f12150b.b(new o(fVar2, fVar4), o.class);
            }
            this.f12139b.b();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: U3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.dispatch.c.b();
                }
            }, 4, (Object) null);
            f fVar5 = this.f12139b;
            fVar5.a(fVar5.f12150b, e6);
        }
        this.f12141d.finish();
        return Unit.INSTANCE;
    }
}
