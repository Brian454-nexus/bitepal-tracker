package com.braze.storage;

import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f12930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.f12929a = pVar;
        this.f12930b = linkedHashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f12929a, this.f12930b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f12929a, this.f12930b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f12929a.f12946j.edit().putStringSet("expired", this.f12930b).apply();
        return Unit.INSTANCE;
    }
}
