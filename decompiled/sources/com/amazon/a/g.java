package com.amazon.a;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements com.amazon.a.a.k.d {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f11346a = "ActivityName";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11347b = "EventName";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f11348c = "Timestamp";

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11349d = new com.amazon.a.a.o.c("Kiwi");

    /* renamed from: e, reason: collision with root package name */
    private static g f11350e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11351f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f11352g;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f11353h;

    /* renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f11354i;

    /* renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f11355j;

    /* renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f11356k;

    /* renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11357l;

    /* renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11358m;

    /* renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f11359n;

    private g(Application application, boolean z6) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f11351f = z6;
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f11349d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
            cVar.a("DRM enabled: " + z6);
        }
        a(application);
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void d(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStart", activity)) {
            f11350e.f11352g.e(activity);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnStart Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void e(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStop", activity)) {
            f11350e.f11352g.f(activity);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnStop Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void f() {
        this.f11354i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.2
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.f11347b, com.amazon.a.a.a.a.b.RESUME.name());
                hashMap.put(g.f11346a, aVar.b().getClass().getName());
                hashMap.put(g.f11348c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (com.amazon.a.a.o.c.f11253a) {
                    g.f11349d.a("Adding lifecycle RESUME command to pipeline");
                }
                g.c(bVar);
            }
        });
    }

    private void g() {
        this.f11354i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                g.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11349d.a("Enqueuing launch workflow");
        }
        this.f11355j.a(com.amazon.a.a.n.b.d.COMMAND, i());
    }

    private com.amazon.a.a.n.a i() {
        return this.f11351f ? new f() : new e();
    }

    private void j() {
        this.f11354i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                if (com.amazon.a.a.o.c.f11253a) {
                    g.f11349d.a("Beginning shutdown process for application: " + g.this.f11358m.getPackageName());
                }
                g unused = g.f11350e = null;
            }
        });
    }

    private void a(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.b());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.c());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a();
        cVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        f11350e.f11355j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
    }

    private static boolean c() {
        return f11350e != null;
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11349d.a(str + " called on context: " + context + " when Kiwi is dead, ignoring...");
        }
    }

    public static void c(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", activity)) {
            try {
                f11350e.f11352g.b(activity);
            } catch (Exception e6) {
                f11349d.b("Kiwi.ActivityOnDestroy Error: ", e6);
            }
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void b(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onPause", activity)) {
            f11350e.f11352g.d(activity);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnPause Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void d() {
        this.f11354i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.f11347b, com.amazon.a.a.a.a.b.PAUSE.name());
                hashMap.put(g.f11346a, aVar.b().getClass().getName());
                hashMap.put(g.f11348c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (com.amazon.a.a.o.c.f11253a) {
                    g.f11349d.a("Adding lifecycle PAUSE command to pipeline");
                }
                g.c(bVar);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        g();
        j();
        d();
        f();
    }

    public static void b(Activity activity, boolean z6) {
        if (a("onWindowFocusChanged", activity)) {
            f11350e.f11356k.a(activity, z6);
        }
    }

    public static void a(Activity activity, boolean z6) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!c()) {
            f11350e = new g(activity.getApplication(), z6);
        }
        if (a("onCreate", activity)) {
            f11350e.f11352g.a(activity);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11349d.a("WARNING: Use of deprecated method detected.");
        }
        if (c()) {
            c(aVar);
        } else {
            f11349d.b("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!c()) {
            if (context != null && context.getApplicationContext() != null) {
                f11350e = new g((Application) context.getApplicationContext(), false);
            } else {
                f11349d.b("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        c(aVar);
    }

    public static com.amazon.a.a.i.e a() {
        return f11350e.f11356k;
    }

    public static boolean a(String str, String str2) {
        if (c()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f11350e.f11359n.a());
            } catch (com.amazon.a.a.o.b.a.a e6) {
                f11349d.a("Unable to validate signature: " + e6.getMessage());
                return false;
            }
        }
        f11349d.a("Kiwi was not yet initialized - cannot do the IAP call");
        return false;
    }

    private static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f11349d.a(str + ": " + context);
        }
        if (c()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static void a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onResume", activity)) {
            f11350e.f11352g.c(activity);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ActivityOnResume Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static Dialog a(Activity activity, int i6) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreateDialog", activity)) {
            return f11350e.f11356k.a(activity, i6);
        }
        if (!com.amazon.a.a.o.c.f11253a) {
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        f11349d.a("Kiwi.ActivityOnCreateDialog Time: " + (currentTimeMillis2 - currentTimeMillis));
        return null;
    }

    public static boolean a(Activity activity, int i6, int i7, Intent intent) {
        if (!a("onActivityResult", activity)) {
            return false;
        }
        return f11350e.f11353h.a(new com.amazon.a.a.l.a(activity, i6, i7, intent));
    }

    public static void a(Service service, boolean z6) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreate", service)) {
            f11350e.f11352g.a(service);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ServiceOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void a(Service service) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", service)) {
            f11350e.f11352g.b(service);
        }
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f11349d.a("Kiwi.ServiceOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }
}
