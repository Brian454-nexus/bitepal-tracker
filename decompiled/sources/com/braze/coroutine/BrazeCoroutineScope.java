package com.braze.coroutine;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import ga.H;
import ga.J;
import ga.L;
import ga.Q0;
import ga.Y;
import ga.i;
import ga.u0;
import ga.y0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/braze/coroutine/BrazeCoroutineScope;", "Lga/J;", "<init>", "()V", "", "cancelChildren", "", "startDelayInMs", "Lkotlin/coroutines/CoroutineContext;", "specificContext", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Lga/u0;", "launchDelayed", "(Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lga/u0;", "", "shouldReRaiseExceptions", "Z", "getShouldReRaiseExceptions$android_sdk_base_release", "()Z", "setShouldReRaiseExceptions$android_sdk_base_release", "(Z)V", "Lga/H;", "exceptionHandler", "Lga/H;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeCoroutineScope implements J {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final CoroutineContext coroutineContext;
    private static final H exceptionHandler;
    private static boolean shouldReRaiseExceptions;

    static {
        c cVar = new c(H.S);
        exceptionHandler = cVar;
        coroutineContext = Y.b().plus(cVar).plus(Q0.b((u0) null, 1, (Object) null));
    }

    private BrazeCoroutineScope() {
    }

    @JvmStatic
    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: T3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cancelChildren$lambda$1;
                cancelChildren$lambda$1 = BrazeCoroutineScope.cancelChildren$lambda$1();
                return cancelChildren$lambda$1;
            }
        }, 6, (Object) null);
        y0.f(brazeCoroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelChildren$lambda$1() {
        return "Cancelling children of BrazeCoroutineScope";
    }

    public static /* synthetic */ u0 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, CoroutineContext coroutineContext2, Function1 function1, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            coroutineContext2 = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, coroutineContext2, function1);
    }

    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    public final boolean getShouldReRaiseExceptions$android_sdk_base_release() {
        return shouldReRaiseExceptions;
    }

    public final u0 launchDelayed(Number startDelayInMs, CoroutineContext specificContext, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(startDelayInMs, "startDelayInMs");
        Intrinsics.checkNotNullParameter(specificContext, "specificContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return i.d(this, specificContext, (L) null, new b(startDelayInMs, block, null), 2, (Object) null);
    }
}
