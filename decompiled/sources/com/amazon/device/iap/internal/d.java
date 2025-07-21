package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f11678a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static String f11679b = "sku";

    /* renamed from: c, reason: collision with root package name */
    private static d f11680c = new d();

    /* renamed from: d, reason: collision with root package name */
    private e f11681d;

    /* renamed from: e, reason: collision with root package name */
    private Context f11682e;

    /* renamed from: f, reason: collision with root package name */
    private PurchasingListener f11683f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11684g = false;

    private d() {
    }

    public static d f() {
        return f11680c;
    }

    private void g() {
        if (this.f11683f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f11683f;
    }

    public Context b() {
        return this.f11682e;
    }

    public void c() {
        this.f11684g = true;
    }

    public boolean d() {
        return this.f11684g;
    }

    public boolean e() {
        g();
        return com.amazon.a.a.a((Application) this.f11682e.getApplicationContext());
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(f11678a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(f11678a, "PurchasingListener Context: " + context);
        if (purchasingListener != null && context != null) {
            this.f11682e = context.getApplicationContext();
            e a6 = b.a().a(this.f11682e);
            this.f11681d = a6;
            if (a6 == null) {
                com.amazon.device.iap.internal.util.b.a(f11678a, "requestHandler is null");
            }
            this.f11683f = purchasingListener;
            return;
        }
        throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.f11681d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, f11679b);
        g();
        RequestId requestId = new RequestId();
        this.f11681d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.f11185O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.f11185O);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.f11681d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z6) {
        g();
        RequestId requestId = new RequestId();
        this.f11681d.a(requestId, z6);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!f.a(str)) {
            f.a(fulfillmentResult, "fulfillmentResult");
            g();
            this.f11681d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.f11681d.a(context, intent);
        } catch (Exception e6) {
            com.amazon.device.iap.internal.util.b.b(f11678a, "Error in onReceive: " + e6);
        }
    }
}
