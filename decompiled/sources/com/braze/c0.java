package com.braze;

import com.braze.models.outgoing.AttributionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f12068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionData f12069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(BrazeUser brazeUser, AttributionData attributionData, Continuation continuation) {
        super(2, continuation);
        this.f12068a = brazeUser;
        this.f12069b = attributionData;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f12068a, this.f12069b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c0(this.f12068a, this.f12069b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.braze.storage.h0 h0Var;
        JSONObject key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0Var = this.f12068a.userCache;
        AttributionData attributionData = this.f12069b;
        synchronized (h0Var) {
            if (attributionData != null) {
                try {
                    key = attributionData.getKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                key = null;
            }
            h0Var.b(key);
        }
        return Unit.INSTANCE;
    }
}
