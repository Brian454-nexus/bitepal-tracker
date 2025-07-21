package com.braze;

import com.braze.managers.u0;
import com.braze.support.n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f12309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f12308a = str;
        this.f12309b = braze;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f12308a, this.f12309b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f12308a, this.f12309b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f12308a;
        if (str == null) {
            return null;
        }
        return n.a(str, ((u0) this.f12309b.getUdm$android_sdk_base_release()).f12558w);
    }
}
