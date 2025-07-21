package com.amazon.a.a.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.a.a.o.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final c f10895a = new c("ApplicationLifecycleObserver");

    /* renamed from: b, reason: collision with root package name */
    private static final String f10896b = a.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final a f10897c = new a();

    private a() {
    }

    public static a a() {
        return f10897c;
    }

    private static boolean b() {
        return com.amazon.a.a.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!com.amazon.a.a.d()) {
            com.amazon.a.a.a((Context) activity.getApplication());
            f10895a.a("AppstoreSDK Re-initialized");
        }
        if (a("onCreate", activity)) {
            com.amazon.a.a.b().a(activity);
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnCreate Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onDestroy", activity)) {
            try {
                com.amazon.a.a.b().b(activity);
            } catch (Exception e6) {
                f10895a.b("ActivityOnDestroy Error: ", e6);
            }
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnDestroy Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onPause", activity)) {
            com.amazon.a.a.b().d(activity);
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnPause Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onResume", activity)) {
            com.amazon.a.a.b().c(activity);
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnResume Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f10895a.a(f10896b + " onActivitySaveInstanceState " + activity.getLocalClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onStart", activity)) {
            com.amazon.a.a.b().e(activity);
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnStart Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onStop", activity)) {
            com.amazon.a.a.b().f(activity);
        }
        if (c.f11253a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f10895a.a("ActivityOnStop Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    private static boolean a(String str, Context context) {
        return com.amazon.a.a.a(str, context);
    }
}
