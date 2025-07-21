package com.braze.storage;

import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f12924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.f12923a = pVar;
        this.f12924b = linkedHashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f12923a, this.f12924b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f12923a, this.f12924b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f12923a.f12946j.edit().putStringSet("test", this.f12924b).apply();
        return Unit.INSTANCE;
    }
}
