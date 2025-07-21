package com.braze.managers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import ga.L;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12487a;

    public p(r rVar) {
        this.f12487a = rVar;
    }

    public static final String a() {
        return "Session seal logic executing in broadcast";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: Z3.P2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.managers.p.a();
            }
        }, 6, (Object) null);
        ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new o(this.f12487a, goAsync(), null), 3, (Object) null);
    }
}
