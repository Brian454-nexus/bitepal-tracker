package com.braze.communication.dust;

import com.braze.support.BrazeLogger;
import ga.J;
import ga.K;
import ia.r;
import java.io.BufferedReader;
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
    public int f12089a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f12091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f12092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BufferedReader bufferedReader, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f12091c = bufferedReader;
        this.f12092d = rVar;
    }

    public static final String a() {
        return "Caught unexpected exception in stream producer";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f12091c, this.f12092d, continuation);
        cVar.f12090b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ga.J, int] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f12089a;
        try {
            if (r12 == 0) {
                ResultKt.throwOnFailure(obj);
                J j6 = (J) this.f12090b;
                String readLine = this.f12091c.readLine();
                if (readLine == null) {
                    return Unit.INSTANCE;
                }
                r rVar = this.f12092d;
                this.f12090b = j6;
                this.f12089a = 1;
                if (rVar.i(readLine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e6) {
            if (K.e((J) r12)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, h.f12106b, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: R3.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.communication.dust.c.a();
                    }
                }, 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, h.f12106b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: R3.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.communication.dust.c.a(e6);
                    }
                }, 14, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(Exception exc) {
        return "Stream producer job cancelled " + exc;
    }
}
