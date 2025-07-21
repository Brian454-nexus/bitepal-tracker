package com.braze;

import com.braze.managers.u0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f13138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f13138a = braze;
        this.f13139b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y(this.f13138a, this.f13139b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y(this.f13138a, this.f13139b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((u0) this.f13138a.getUdm$android_sdk_base_release()).f12556u.a(this.f13139b));
    }
}
