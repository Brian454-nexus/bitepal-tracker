package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12998a = new k();

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final int g6 = GoogleApiAvailability.m().g(context);
        if (g6 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12998a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.p1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.k.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12998a, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: p4.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.k.a(g6);
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String b() {
        return "Google Play Services is available.";
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final boolean b(Context context) {
        PackageManager.PackageInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageManager.getPackageInfo("com.google.android.gsf", of);
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12998a, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: p4.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.k.c();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final String a(int i6) {
        return "Google Play Services is unavailable. Connection result: " + i6;
    }
}
