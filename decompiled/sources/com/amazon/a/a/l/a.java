package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f11000a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11001b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11002c;

    /* renamed from: d, reason: collision with root package name */
    private final Intent f11003d;

    public a(Activity activity, int i6, int i7, Intent intent) {
        this.f11000a = activity;
        this.f11001b = i6;
        this.f11002c = i7;
        this.f11003d = intent;
    }

    public Activity a() {
        return this.f11000a;
    }

    public int b() {
        return this.f11001b;
    }

    public Intent c() {
        return this.f11003d;
    }

    public int d() {
        return this.f11002c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f11001b + ", resultCode: " + this.f11002c + ", activity: " + this.f11000a + ", intent: " + this.f11003d + "]";
    }
}
