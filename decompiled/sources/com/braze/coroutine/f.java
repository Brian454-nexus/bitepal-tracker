package com.braze.coroutine;

import com.braze.coroutine.f;
import com.braze.support.BrazeLogger;
import ga.H;
import ga.J;
import ga.Q0;
import ga.m0;
import ga.u0;
import ga.y0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements J {

    /* renamed from: a, reason: collision with root package name */
    public static final f f12131a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static com.braze.events.d f12132b;

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineContext f12133c;

    static {
        e eVar = new e(H.S);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f12133c = m0.b(newSingleThreadExecutor).plus(eVar).plus(Q0.b((u0) null, 1, (Object) null));
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: T3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b();
            }
        }, 6, (Object) null);
        y0.f(f12133c, (CancellationException) null, 1, (Object) null);
    }

    public final CoroutineContext getCoroutineContext() {
        return f12133c;
    }
}
