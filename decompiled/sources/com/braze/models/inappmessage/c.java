package com.braze.models.inappmessage;

import com.braze.managers.c0;
import com.braze.managers.m;
import ga.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f12591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f12592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, InAppMessageBase inAppMessageBase, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f12590a = str;
        this.f12591b = inAppMessageBase;
        this.f12592c = c0Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f12590a, this.f12591b, this.f12592c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.braze.models.i m6 = com.braze.models.outgoing.event.b.f12605g.m(this.f12590a, this.f12591b.getMessageExtras());
        if (m6 != null) {
            ((m) this.f12592c).a(m6);
        }
        return Unit.INSTANCE;
    }
}
