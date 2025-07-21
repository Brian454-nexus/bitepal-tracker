package com.braze.managers;

import com.braze.support.BrazeLogger;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f12527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f12527b = u0Var;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t0 t0Var = new t0(this.f12527b, continuation);
        t0Var.f12526a = obj;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0 t0Var = new t0(this.f12527b, (Continuation) obj2);
        t0Var.f12526a = (J) obj;
        return t0Var.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12526a;
        try {
            if (this.f12527b.a().f12896a.a() == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) j6, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.v3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.t0.a();
                    }
                }, 6, (Object) null);
                com.braze.storage.h0 a6 = this.f12527b.a();
                a6.getClass();
                ga.i.f((CoroutineContext) null, new com.braze.storage.a(a6, null), 1, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) j6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.w3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.t0.b();
                    }
                }, 7, (Object) null);
            }
            com.braze.storage.r rVar = this.f12527b.f12546k;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                rVar = null;
            }
            if (rVar.f12896a.a() == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) j6, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.x3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.t0.c();
                    }
                }, 6, (Object) null);
                com.braze.storage.r rVar2 = this.f12527b.f12546k;
                if (rVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                    rVar2 = null;
                }
                rVar2.getClass();
                ga.i.f((CoroutineContext) null, new com.braze.storage.a(rVar2, null), 1, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger2, (Object) j6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.y3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.t0.d();
                    }
                }, 7, (Object) null);
            }
            this.f12527b.f12534E.e();
            this.f12527b.f12547l.c();
            this.f12527b.f12552q.l();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: Z3.z3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t0.e();
                }
            }, 4, (Object) null);
        }
        try {
            this.f12527b.f12551p.f();
        } catch (Exception e7) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j6, BrazeLogger.Priority.f12984W, (Throwable) e7, false, new Function0() { // from class: Z3.A3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t0.f();
                }
            }, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
