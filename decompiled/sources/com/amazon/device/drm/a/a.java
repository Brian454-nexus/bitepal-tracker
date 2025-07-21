package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f11495a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f11496b;

    private a() {
    }

    public static a a() {
        return f11495a;
    }

    public c a(Context context) {
        if (f11496b == null) {
            synchronized (a.class) {
                try {
                    if (f11496b == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f11496b = new com.amazon.device.drm.a.d.c();
                        } else {
                            f11496b = new com.amazon.device.drm.a.b.c();
                        }
                    }
                } finally {
                }
            }
        }
        return f11496b;
    }
}
