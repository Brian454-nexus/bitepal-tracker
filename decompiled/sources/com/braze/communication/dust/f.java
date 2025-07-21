package com.braze.communication.dust;

import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Continuation continuation) {
        super(2, continuation);
        this.f12098a = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f12098a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f12098a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URLConnection openConnection = new URL(this.f12098a).openConnection();
        openConnection.setRequestProperty("Accept", "text/event-stream");
        openConnection.setDoInput(true);
        openConnection.connect();
        return openConnection;
    }
}
