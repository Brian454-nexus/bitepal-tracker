package com.braze.storage;

import android.content.Context;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f12895a;

    public a0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12895a = new e(context);
    }

    public static final String a(boolean z6) {
        return "Setting Braze SDK disabled to: " + z6;
    }

    public final void b(final boolean z6) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: o4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.a0.a(z6);
            }
        }, 6, (Object) null);
        this.f12895a.edit().putBoolean("appboy_sdk_disabled", z6).apply();
    }
}
