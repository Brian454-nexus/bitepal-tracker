package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import com.amazon.a.a.a.a.d;
import com.amazon.a.a.c.f;
import com.amazon.a.a.o.g;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f10818a = new com.amazon.a.a.o.c("ContextManagerImplV3");

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f10822e;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f10823f;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<Activity> f10819b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private final g<Activity> f10820c = new g<>();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<Activity> f10821d = new LinkedHashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f10824g = false;

    private boolean e() {
        return !this.f10824g && this.f10821d.size() == 1;
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10818a.a("Checking if application is destroyed");
        }
        if (!this.f10821d.isEmpty()) {
            return false;
        }
        f10818a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Service service) {
    }

    @Override // com.amazon.a.a.a.a
    public void b(Service service) {
    }

    @Override // com.amazon.a.a.a.a
    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f10818a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        this.f10820c.a(activity);
        this.f10821d.add(activity);
        Activity i6 = i(activity);
        this.f10819b.set(i6);
        cVar.a("Setting visible to: " + i6);
        if (com.amazon.a.a.o.c.f11253a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    @Override // com.amazon.a.a.a.a
    public boolean d() {
        return false;
    }

    @Override // com.amazon.a.a.a.a
    public void f() {
    }

    @Override // com.amazon.a.a.a.a
    public void g() {
    }

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    @Override // com.amazon.a.a.a.a
    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        Object[] array = this.f10821d.toArray();
        Activity activity = null;
        for (int length = array.length - 1; length >= 0; length--) {
            activity = (Activity) array[length];
            if (g(activity)) {
                f10818a.a("root activity" + activity);
                return activity;
            }
        }
        if (activity != null || array.length <= 0) {
            return activity;
        }
        f10818a.a("root not fount returning" + activity);
        return (Activity) array[array.length - 1];
    }

    @Override // com.amazon.a.a.a.a
    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f10821d.remove(activity);
        if (com.amazon.a.a.o.c.f11253a) {
            f10818a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f10821d.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            f10818a.a("AppLifeCycle application has been destroyed");
            this.f10824g = false;
            a(d.DESTROY);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10818a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        this.f10821d.add(activity);
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10818a.a("Setting visible activity to null");
            }
            this.f10819b.set(null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f10818a.a("Activity stopped: " + activity);
        this.f10821d.add(activity);
        this.f10820c.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f10820c.a()) {
            a(d.STOP);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f10818a.a("Activity started: " + activity);
        this.f10821d.add(activity);
        this.f10820c.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (e()) {
            this.f10824g = true;
            a(d.CREATE);
        }
        if (this.f10820c.b() == 1) {
            a(d.START);
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean h() {
        com.amazon.a.a.o.a.a.a();
        return (!c() && this.f10821d.isEmpty() && this.f10820c.a()) ? false : true;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f10821d.add(activity);
        if (com.amazon.a.a.o.c.f11253a) {
            f10818a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f10821d.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (e()) {
            this.f10824g = true;
            a(d.CREATE);
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean c() {
        return this.f10819b.get() != null;
    }

    @Override // com.amazon.a.a.a.a
    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f10819b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f10823f.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(d dVar) {
        this.f10823f.a(new com.amazon.a.a.a.a.c(dVar, this.f10822e));
    }
}
