package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f12130a;

    public d(Throwable th) {
        this.f12130a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Child job of SerialCoroutineScope got exception: " + this.f12130a;
    }
}
