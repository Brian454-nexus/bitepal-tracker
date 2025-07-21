package com.braze;

import com.braze.managers.u0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f12315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f12315a = braze;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f12315a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f12315a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return ((u0) this.f12315a.getUdm$android_sdk_base_release()).f12548m.G() ? ((u0) this.f12315a.getUdm$android_sdk_base_release()).f12561z.e(null) : CollectionsKt.emptyList();
    }
}
