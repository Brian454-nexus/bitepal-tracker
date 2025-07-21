package com.amazon.a.a.o;

import android.util.Log;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11253a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11254b = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f11255c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11256d = "Kiwi";

    /* renamed from: e, reason: collision with root package name */
    private String f11257e;

    public c(String str) {
        this.f11257e = str;
    }

    private String d(String str) {
        return this.f11257e + ": " + str;
    }

    public void a(String str) {
        if (f11253a) {
            Log.d(f11256d, d(str));
        }
    }

    public void b(String str) {
        if (f11254b) {
            Log.e(f11256d, d(str));
        }
    }

    public void c(String str) {
        if (f11255c) {
            Log.e(f11256d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f11253a) {
            Log.d(f11256d, d(str), th);
        }
    }

    public void b(String str, Throwable th) {
        if (f11254b) {
            Log.e(f11256d, d(str), th);
        }
    }

    public static void a() {
        f11255c = true;
    }

    public static boolean b() {
        return f11255c;
    }
}
