package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f11983a;

    public /* synthetic */ a(Function1 function1) {
        this.f11983a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.a(this.f11983a);
    }
}
