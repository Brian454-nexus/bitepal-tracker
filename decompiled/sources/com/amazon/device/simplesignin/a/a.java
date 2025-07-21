package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11697a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static final a f11698b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f11699c;

    private a() {
    }

    public static a a() {
        return f11698b;
    }

    public boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }

    public b a(Context context) {
        if (f11699c == null) {
            synchronized (a.class) {
                try {
                    if (f11699c == null) {
                        if (b(context)) {
                            f11699c = new com.amazon.device.simplesignin.a.c.b();
                            com.amazon.device.simplesignin.a.d.a.a(f11697a, "SDK initialized in Sandbox mode.");
                        } else {
                            f11699c = new com.amazon.device.simplesignin.a.a.b();
                            com.amazon.device.simplesignin.a.d.a.a(f11697a, "SDK initialized in Production mode.");
                        }
                    }
                } finally {
                }
            }
        }
        return f11699c;
    }
}
