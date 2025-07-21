package com.braze.managers;

import android.content.Context;
import android.view.View;
import com.braze.Braze;
import ga.J;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f12408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, String str, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f12406a = view;
        this.f12407b = str;
        this.f12408c = dVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f12406a, this.f12407b, this.f12408c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return create((J) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = this.f12406a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.getInstance(context).logBannerImpression(this.f12407b);
        ReentrantLock reentrantLock = h.f12412n;
        d dVar = this.f12408c;
        reentrantLock.lock();
        try {
            dVar.f12405c = true;
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
