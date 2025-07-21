package com.amazon.a.b;

import com.amazon.a.a.i.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11312a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11313b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11314c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11315d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11316e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11317f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f11318g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f11319h = "Quit";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11320i = "Help";

    /* renamed from: j, reason: collision with root package name */
    private static final String f11321j = "Update";

    static {
        String[] strArr = {f11319h, f11320i};
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = c.a.HELP;
        f11312a = new com.amazon.a.a.i.c(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", strArr, new c.a[]{aVar, aVar2}, true, true, 1, 1);
        f11313b = new com.amazon.a.a.i.c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f11319h, true, false);
        f11314c = new com.amazon.a.a.i.c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f11319h, f11320i}, new c.a[]{aVar, aVar2}, true, true, 1, 2);
        f11315d = new com.amazon.a.a.i.c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f11319h, true, false);
        f11316e = new com.amazon.a.a.i.c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f11319h, f11320i}, new c.a[]{aVar, aVar2}, true, true, 1, 3);
        f11317f = new com.amazon.a.a.i.c("Internal error", "An internal error occurred, please try opening this app again", f11319h, true, false);
        f11318g = new com.amazon.a.a.i.c("App update required", "Please update this app from the Amazon Appstore.", new String[]{f11319h, f11321j}, new c.a[]{aVar, c.a.DEEPLINK}, true, false, 0);
    }

    private e() {
    }
}
