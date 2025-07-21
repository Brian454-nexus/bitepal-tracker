package com.braze.storage;

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
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f12958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f12959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Function0 function0, v vVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f12958b = function0;
        this.f12959c = vVar;
        this.f12960d = str;
    }

    public static final String a(String str) {
        return com.braze.j.a("Failed to ", str);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.f12958b, this.f12959c, this.f12960d, continuation);
        uVar.f12957a = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12957a;
        try {
            this.f12958b.invoke();
        } catch (Exception e6) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12981E;
            final String str = this.f12960d;
            BrazeLogger.brazelog$default(brazeLogger, (Object) j6, priority, (Throwable) e6, false, new Function0() { // from class: o4.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.storage.u.a(str);
                }
            }, 4, (Object) null);
            this.f12959c.a(e6);
        }
        return Unit.INSTANCE;
    }
}
