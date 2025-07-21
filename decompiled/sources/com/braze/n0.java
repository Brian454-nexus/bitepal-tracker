package com.braze;

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
public final class n0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f12724b = brazeUser;
        this.f12725c = str;
    }

    public static final String a(String str) {
        return b.a("Successfully set LINE ID: ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n0 n0Var = new n0(this.f12724b, this.f12725c, continuation);
        n0Var.f12723a = obj;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12723a;
        h0Var = this.f12724b.userCache;
        String str = this.f12725c;
        synchronized (h0Var) {
            h0Var.c("native_line_id", str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
        final String str2 = this.f12725c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) j6, priority, (Throwable) null, false, new Function0() { // from class: N3.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.n0.a(str2);
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
