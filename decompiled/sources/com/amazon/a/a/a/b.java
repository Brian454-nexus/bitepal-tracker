package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements a, d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f10802a = new com.amazon.a.a.o.c("ContextManagerImplV2");

    /* renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f10810i;

    /* renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f10811j;

    /* renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f10812k;

    /* renamed from: l, reason: collision with root package name */
    private String f10813l;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<Activity> f10803b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private final List<Activity> f10804c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final g<Service> f10805d = new g<>();

    /* renamed from: e, reason: collision with root package name */
    private final g<Activity> f10806e = new g<>();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f10807f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10808g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f10809h = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private boolean f10814m = false;

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Checking if application is destroyed");
        }
        if (!this.f10804c.isEmpty()) {
            return false;
        }
        f10802a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private boolean i() {
        return !this.f10814m && this.f10804c.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f10802a;
            cVar.a("----------- EXECUTING FINISH ACTIVITIES -----------");
            cVar.a(this.f10810i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        k();
        l();
        m();
    }

    private void k() {
        Activity a6 = a();
        for (Activity activity : this.f10804c) {
            if (!activity.equals(a6)) {
                j(activity);
            }
        }
    }

    private void l() {
        Activity a6 = a();
        if (a6 == null) {
            f10802a.a("Shutdown found no root, no activities to pop off stack!");
            return;
        }
        com.amazon.a.a.o.c cVar = f10802a;
        cVar.a("Moving task to background");
        a6.moveTaskToBack(true);
        cVar.a("Popping activity stack, root: " + a6);
        Intent intent = new Intent(a6, a6.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        a6.startActivity(intent);
    }

    private void m() {
        this.f10811j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity a6 = b.this.a();
                com.amazon.a.a.o.c cVar = b.f10802a;
                cVar.a("Finishing Root Task: " + a6);
                if (a6 != null) {
                    cVar.a("Finishing Root");
                    a6.finish();
                }
            }

            public String toString() {
                return "ContextManager: kill root task";
            }
        });
    }

    @Override // com.amazon.a.a.a.a
    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f10804c.remove(activity);
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f10804c.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            this.f10814m = false;
            a(com.amazon.a.a.a.a.d.DESTROY);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f10802a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity i6 = i(activity);
        StringBuilder sb = new StringBuilder();
        sb.append("Setting visible to: ");
        sb.append(i6);
        cVar.a(sb.toString());
        this.f10803b.set(i6);
        if (com.amazon.a.a.o.c.f11253a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    @Override // com.amazon.a.a.a.a
    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10802a.a("Setting visible activity to null");
            }
            this.f10803b.set(null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f10802a.a("Activity started: " + activity);
        this.f10806e.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (this.f10806e.b() == 1) {
            a(com.amazon.a.a.a.a.d.START);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f10802a.a("Activity stopped: " + activity);
        this.f10806e.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f10806e.a()) {
            a(com.amazon.a.a.a.a.d.STOP);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void g() {
        if (!this.f10808g.compareAndSet(false, true) && com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Ignoring duplicate stopServices request");
        }
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f10802a;
            cVar.a("------------- STOPPING SERVICES -------------------");
            cVar.a(this.f10810i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f10813l);
        intent.setPackage(this.f10810i.getPackageName());
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f10810i.sendBroadcast(intent);
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.a.a.a.a
    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        for (int size = this.f10804c.size() - 1; size >= 0; size--) {
            Activity activity = this.f10804c.get(size);
            if (g(activity)) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f10804c.add(activity);
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f10804c.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (i()) {
            this.f10814m = true;
            a(com.amazon.a.a.a.a.d.CREATE);
        }
    }

    private void j(Activity activity) {
        if (activity == null) {
            return;
        }
        if (activity.isChild()) {
            f10802a.a("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
            return;
        }
        f10802a.a("Finishing Activity: " + activity);
        activity.finish();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f10813l = "com.amazon." + this.f10810i.getPackageName() + ".shutdown";
        this.f10810i.registerReceiver(new BroadcastReceiver() { // from class: com.amazon.a.a.a.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b.this.a(intent);
            }
        }, new IntentFilter(this.f10813l));
    }

    @Override // com.amazon.a.a.a.a
    public void f() {
        if (this.f10807f.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                com.amazon.a.a.o.c cVar = f10802a;
                cVar.a("---------- SCHEDULING FINISH ACTIVITIES -----------");
                cVar.a(this.f10810i.getPackageName());
                cVar.a(Thread.currentThread().toString());
                cVar.a("---------------------------------------------------");
            }
            this.f10811j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.1
                @Override // com.amazon.a.a.n.a
                public void a() {
                    b.this.j();
                }

                public String toString() {
                    return "ContextManager: init app shutdown on main thread";
                }
            });
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean h() {
        com.amazon.a.a.o.a.a.a("Method isContextAware() is not used for Kiwi's ContextManagerImplV2");
        return false;
    }

    @Override // com.amazon.a.a.a.a
    public boolean c() {
        return this.f10803b.get() != null;
    }

    @Override // com.amazon.a.a.a.a
    public boolean d() {
        return this.f10808g.get() || this.f10807f.get();
    }

    private void c(Service service) {
        if (service == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Stopping service: " + service);
        }
        service.stopSelf();
    }

    @Override // com.amazon.a.a.a.a
    public void b(Service service) {
        com.amazon.a.a.o.a.a.a();
        this.f10805d.b(service);
    }

    @Override // com.amazon.a.a.a.a
    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f10803b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f10812k.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(com.amazon.a.a.a.a.d dVar) {
        this.f10812k.a(new com.amazon.a.a.a.a.c(dVar, this.f10810i));
    }

    @Override // com.amazon.a.a.a.a
    public void a(Service service) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Service->onCreate: " + service);
        }
        this.f10805d.a(service);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10802a.a("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(this.f10813l)) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10802a.b("Received broadcast for unrequested action: " + intent.getAction());
                return;
            }
            return;
        }
        if (!this.f10808g.get()) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10802a.b("Received intent to shutdown app when we are not in shutdown state: " + intent);
                return;
            }
            return;
        }
        if (!this.f10809h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10802a.a("shutdown broadcast already received, ignoring");
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f10802a;
            cVar.a("Stopping services in response to broadcast");
            cVar.a("Service to stop: " + this.f10805d.b());
        }
        Iterator<Service> it = this.f10805d.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
