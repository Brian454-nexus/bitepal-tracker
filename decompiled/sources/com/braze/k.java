package com.braze;

import com.braze.managers.u0;
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
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f12336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f12336b = braze;
        this.f12337c = str;
    }

    public static final String a(String str) {
        return j.a("Getting Banner for ", str);
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f12336b, this.f12337c, continuation);
        kVar.f12335a = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f12335a;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        final String str = this.f12337c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) j6, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.k.a(str);
            }
        }, 7, (Object) null);
        return ((u0) this.f12336b.getUdm$android_sdk_base_release()).f12530A.a(this.f12337c);
    }
}
