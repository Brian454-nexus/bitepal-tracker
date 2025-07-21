package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12396c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12397a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f12398b;

    public b(Context context, g0 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f12397a = context;
        this.f12398b = admRegistrationDataProvider;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((l0) this.f12398b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.b.a(com.braze.managers.b.this);
                }
            }, 6, (Object) null);
            l0 l0Var = (l0) this.f12398b;
            l0Var.a(l0Var.b());
        } else {
            ADM adm = new ADM(this.f12397a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.managers.b.b();
                    }
                }, 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(b bVar) {
        return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + ((l0) bVar.f12398b).b();
    }
}
