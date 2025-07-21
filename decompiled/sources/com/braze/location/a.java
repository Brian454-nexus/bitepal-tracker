package com.braze.location;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {
    public a() {
        try {
            Object newInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            android.support.v4.media.session.b.a(newInstance);
        } catch (Exception unused) {
        }
    }
}
