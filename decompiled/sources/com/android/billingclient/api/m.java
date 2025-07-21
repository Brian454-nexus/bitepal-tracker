package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m {

    /* renamed from: A, reason: collision with root package name */
    public static final d f11944A;

    /* renamed from: B, reason: collision with root package name */
    public static final d f11945B;

    /* renamed from: C, reason: collision with root package name */
    public static final d f11946C;

    /* renamed from: D, reason: collision with root package name */
    public static final d f11947D;

    /* renamed from: E, reason: collision with root package name */
    public static final d f11948E;

    /* renamed from: F, reason: collision with root package name */
    public static final d f11949F;

    /* renamed from: G, reason: collision with root package name */
    public static final d f11950G;

    /* renamed from: a, reason: collision with root package name */
    public static final d f11951a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f11952b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f11953c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f11954d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f11955e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f11956f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f11957g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f11958h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f11959i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f11960j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f11961k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f11962l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f11963m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f11964n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f11965o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f11966p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f11967q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f11968r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f11969s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f11970t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f11971u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f11972v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f11973w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f11974x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f11975y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f11976z;

    static {
        d.a c6 = d.c();
        c6.c(3);
        c6.b("Google Play In-app Billing API version is less than 3");
        f11951a = c6.a();
        d.a c7 = d.c();
        c7.c(3);
        c7.b("Google Play In-app Billing API version is less than 9");
        f11952b = c7.a();
        d.a c8 = d.c();
        c8.c(3);
        c8.b("Billing service unavailable on device.");
        f11953c = c8.a();
        d.a c9 = d.c();
        c9.c(2);
        c9.b("Billing service unavailable on device.");
        f11954d = c9.a();
        d.a c10 = d.c();
        c10.c(5);
        c10.b("Client is already in the process of connecting to billing service.");
        f11955e = c10.a();
        d.a c11 = d.c();
        c11.c(5);
        c11.b("The list of SKUs can't be empty.");
        f11956f = c11.a();
        d.a c12 = d.c();
        c12.c(5);
        c12.b("SKU type can't be empty.");
        f11957g = c12.a();
        d.a c13 = d.c();
        c13.c(5);
        c13.b("Product type can't be empty.");
        f11958h = c13.a();
        d.a c14 = d.c();
        c14.c(-2);
        c14.b("Client does not support extra params.");
        f11959i = c14.a();
        d.a c15 = d.c();
        c15.c(5);
        c15.b("Invalid purchase token.");
        f11960j = c15.a();
        d.a c16 = d.c();
        c16.c(6);
        c16.b("An internal error occurred.");
        f11961k = c16.a();
        d.a c17 = d.c();
        c17.c(5);
        c17.b("SKU can't be null.");
        c17.a();
        d.a c18 = d.c();
        c18.c(0);
        f11962l = c18.a();
        d.a c19 = d.c();
        c19.c(-1);
        c19.b("Service connection is disconnected.");
        f11963m = c19.a();
        d.a c20 = d.c();
        c20.c(2);
        c20.b("Timeout communicating with service.");
        f11964n = c20.a();
        d.a c21 = d.c();
        c21.c(-2);
        c21.b("Client does not support subscriptions.");
        f11965o = c21.a();
        d.a c22 = d.c();
        c22.c(-2);
        c22.b("Client does not support subscriptions update.");
        f11966p = c22.a();
        d.a c23 = d.c();
        c23.c(-2);
        c23.b("Client does not support get purchase history.");
        f11967q = c23.a();
        d.a c24 = d.c();
        c24.c(-2);
        c24.b("Client does not support price change confirmation.");
        f11968r = c24.a();
        d.a c25 = d.c();
        c25.c(-2);
        c25.b("Play Store version installed does not support cross selling products.");
        f11969s = c25.a();
        d.a c26 = d.c();
        c26.c(-2);
        c26.b("Client does not support multi-item purchases.");
        f11970t = c26.a();
        d.a c27 = d.c();
        c27.c(-2);
        c27.b("Client does not support offer_id_token.");
        f11971u = c27.a();
        d.a c28 = d.c();
        c28.c(-2);
        c28.b("Client does not support ProductDetails.");
        f11972v = c28.a();
        d.a c29 = d.c();
        c29.c(-2);
        c29.b("Client does not support in-app messages.");
        f11973w = c29.a();
        d.a c30 = d.c();
        c30.c(-2);
        c30.b("Client does not support user choice billing.");
        c30.a();
        d.a c31 = d.c();
        c31.c(-2);
        c31.b("Play Store version installed does not support external offer.");
        f11974x = c31.a();
        d.a c32 = d.c();
        c32.c(-2);
        c32.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f11975y = c32.a();
        d.a c33 = d.c();
        c33.c(5);
        c33.b("Unknown feature");
        f11976z = c33.a();
        d.a c34 = d.c();
        c34.c(-2);
        c34.b("Play Store version installed does not support get billing config.");
        f11944A = c34.a();
        d.a c35 = d.c();
        c35.c(-2);
        c35.b("Query product details with serialized docid is not supported.");
        f11945B = c35.a();
        d.a c36 = d.c();
        c36.c(4);
        c36.b("Item is unavailable for purchase.");
        f11946C = c36.a();
        d.a c37 = d.c();
        c37.c(-2);
        c37.b("Query product details with developer specified account is not supported.");
        f11947D = c37.a();
        d.a c38 = d.c();
        c38.c(-2);
        c38.b("Play Store version installed does not support alternative billing only.");
        f11948E = c38.a();
        d.a c39 = d.c();
        c39.c(5);
        c39.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f11949F = c39.a();
        d.a c40 = d.c();
        c40.c(6);
        c40.b("An error occurred while retrieving billing override.");
        f11950G = c40.a();
    }

    public static d a(int i6, String str) {
        d.a c6 = d.c();
        c6.c(i6);
        c6.b(str);
        return c6.a();
    }
}
