package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public static final String b() {
        return "com.amazon.device.messaging.ADM not found";
    }

    public final boolean a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.a.b();
                }
            }, 6, (Object) null);
            return false;
        }
    }

    public final boolean a(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: Z3.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.a.a(e6);
                }
            }, 6, (Object) null);
            return false;
        }
    }

    public static final String a(Exception exc) {
        return "Manifest not authored properly to support ADM. ADM manifest exception: " + exc;
    }
}
