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
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13006c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f13007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f13008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f13009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z6, boolean z7, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f13005b = z6;
        this.f13006c = z7;
        this.f13007d = braze;
        this.f13008e = function0;
        this.f13009f = function02;
    }

    public static final String a(Function0 function0) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + ((String) function0.invoke());
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.f13005b, this.f13006c, this.f13007d, this.f13008e, this.f13009f, continuation);
        tVar.f13004a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        J j6 = (J) this.f13004a;
        if (this.f13005b && Braze.INSTANCE.isDisabled()) {
            return Unit.INSTANCE;
        }
        if (!this.f13006c || this.f13007d.udm != null) {
            this.f13008e.invoke();
            return Unit.INSTANCE;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
        final Function0 function0 = this.f13009f;
        BrazeLogger.brazelog$default(brazeLogger, (Object) j6, priority, (Throwable) null, false, new Function0() { // from class: N3.m4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.t.a(Function0.this);
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
