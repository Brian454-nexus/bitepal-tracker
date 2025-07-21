package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f11593a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11594b = b.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f11595c;

    private b() {
    }

    public static b a() {
        return f11593a;
    }

    public e a(Context context) {
        if (f11595c == null) {
            synchronized (b.class) {
                try {
                    if (f11595c == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f11595c = new com.amazon.device.iap.internal.c.e();
                        } else {
                            f11595c = new com.amazon.device.iap.internal.a.d();
                        }
                    }
                } finally {
                }
            }
        }
        return f11595c;
    }
}
