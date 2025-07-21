package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f12125a;

    public a(Throwable th) {
        this.f12125a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Child job of BrazeCoroutineScope got exception: " + this.f12125a;
    }
}
