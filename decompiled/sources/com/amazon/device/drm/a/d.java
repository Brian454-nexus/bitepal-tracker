package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f11514a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static d f11515b = new d();

    /* renamed from: c, reason: collision with root package name */
    private c f11516c;

    /* renamed from: d, reason: collision with root package name */
    private Context f11517d;

    /* renamed from: e, reason: collision with root package name */
    private LicensingListener f11518e;

    private d() {
    }

    public static d d() {
        return f11515b;
    }

    private void f() {
        if (this.f11518e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f11517d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener != null && context != null) {
            com.amazon.device.drm.a.e.b.a(f11514a, "LicensingListener registered: " + licensingListener);
            com.amazon.device.drm.a.e.b.a(f11514a, "LicensingListener Context: " + context);
            this.f11517d = context.getApplicationContext();
            this.f11518e = licensingListener;
            c a6 = a.a().a(this.f11517d);
            this.f11516c = a6;
            if (a6 == null) {
                com.amazon.device.drm.a.e.b.a(f11514a, "requestHandler is null");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LicensingManager/Context cannot be null");
    }

    public LicensingListener b() {
        return this.f11518e;
    }

    public Context c() {
        return this.f11517d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f11516c.a(requestId);
        return requestId;
    }

    public String a() {
        try {
            g();
            if (com.amazon.a.a.a((Application) this.f11517d.getApplicationContext())) {
                return AppstoreSDKModes.SANDBOX.name();
            }
            return AppstoreSDKModes.PRODUCTION.name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f11516c.a(context, intent);
        } catch (Exception e6) {
            com.amazon.device.drm.a.e.b.b(f11514a, "Error in onReceive: " + e6);
        }
    }
}
