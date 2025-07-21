package com.braze;

import com.braze.managers.u0;
import com.braze.models.FeatureFlag;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f12728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f12728a = braze;
        this.f12729b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f12728a, this.f12729b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p(this.f12728a, this.f12729b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((u0) this.f12728a.getUdm$android_sdk_base_release()).f12548m.G()) {
            return (FeatureFlag) CollectionsKt.firstOrNull(((u0) this.f12728a.getUdm$android_sdk_base_release()).f12561z.e(this.f12729b));
        }
        return null;
    }
}
