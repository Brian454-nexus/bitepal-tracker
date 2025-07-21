package com.braze;

import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f12340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f12341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f12340a = iValueCallback;
        this.f12341b = braze;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f12340a, this.f12341b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f12340a, this.f12341b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BrazeUser brazeUser;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Braze.INSTANCE.isDisabled()) {
            this.f12340a.onError();
            return Unit.INSTANCE;
        }
        IValueCallback iValueCallback = this.f12340a;
        brazeUser = this.f12341b.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        iValueCallback.onSuccess(brazeUser);
        return Unit.INSTANCE;
    }
}
