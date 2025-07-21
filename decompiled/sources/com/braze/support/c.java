package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f12988a = new c();

    public static final String a(String str) {
        return com.braze.b.a("Unexpected system broadcast received [", str, ']');
    }

    public static final com.braze.enums.f a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        final String action = intent.getAction();
        if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo != null && !booleanExtra) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1 || type == 6) {
                            return com.braze.enums.f.f12210d;
                        }
                        if (type != 9) {
                            return com.braze.enums.f.f12207a;
                        }
                        return com.braze.enums.f.f12209c;
                    }
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 3) {
                        return com.braze.enums.f.f12209c;
                    }
                    if (subtype != 13 && subtype != 20) {
                        return com.braze.enums.f.f12208b;
                    }
                    return com.braze.enums.f.f12210d;
                }
                return com.braze.enums.f.f12207a;
            } catch (SecurityException e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12988a, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: p4.X0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.c.a();
                    }
                }, 4, (Object) null);
                return com.braze.enums.f.f12207a;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f12988a, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.Y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.c.a(action);
            }
        }, 6, (Object) null);
        return com.braze.enums.f.f12207a;
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final com.braze.enums.f a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return com.braze.enums.f.f12207a;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return com.braze.enums.f.f12210d;
        }
        if (min > 4000) {
            return com.braze.enums.f.f12209c;
        }
        return com.braze.enums.f.f12208b;
    }
}
