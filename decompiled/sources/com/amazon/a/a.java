package com.amazon.a;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements com.amazon.a.a.k.d {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f10767a = "ActivityName";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f10768b = "EventName";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f10769c = "Timestamp";

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10770d = new com.amazon.a.a.o.c("AppstoreSDK");

    /* renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.g.c f10771e = new com.amazon.a.a.g.a();

    /* renamed from: f, reason: collision with root package name */
    private static a f10772f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f10773g;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f10774h;

    /* renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f10775i;

    /* renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f10776j;

    /* renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f10777k;

    /* renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f10778l;

    /* renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f10779m;

    /* renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f10780n;

    /* renamed from: o, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.g.c f10781o;

    private a(Application application) {
        long currentTimeMillis = System.currentTimeMillis();
        if (com.amazon.a.a.o.c.f11253a) {
            f10770d.a("Starting initialization process for application: " + application.getPackageName());
        }
        b(application);
        if (com.amazon.a.a.o.c.f11253a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            f10770d.a("AppstoreSDK.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        if (!d()) {
            f10770d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        } else {
            f10772f.f10776j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
        }
    }

    public static boolean d() {
        return f10772f != null;
    }

    private static boolean l() {
        String a6;
        try {
            a6 = (String) Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, String.class).invoke(null, com.amazon.a.a.o.b.aq);
        } catch (Throwable unused) {
            f10770d.b("Unable to retrieve Sandbox property through reflection, using getProp");
            a6 = a(com.amazon.a.a.o.b.aq);
        }
        return com.amazon.a.a.o.b.ar.equals(a6);
    }

    private com.amazon.a.a.n.a m() {
        return new e();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        h();
        j();
        f();
        g();
    }

    public void f() {
        this.f10775i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.1
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
                hashMap.put(a.f10768b, com.amazon.a.a.a.a.b.PAUSE.name());
                hashMap.put(a.f10767a, aVar.b().getClass().getName());
                hashMap.put(a.f10769c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (com.amazon.a.a.o.c.f11253a) {
                    a.f10770d.a("Adding lifecycle PAUSE command to pipeline");
                }
                a.c(bVar);
            }
        });
    }

    public void g() {
        this.f10775i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.2
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
                hashMap.put(a.f10768b, com.amazon.a.a.a.a.b.RESUME.name());
                hashMap.put(a.f10767a, aVar.b().getClass().getName());
                hashMap.put(a.f10769c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
                if (com.amazon.a.a.o.c.f11253a) {
                    a.f10770d.a("Adding lifecycle RESUME command to pipeline");
                }
                a.c(bVar);
            }
        });
    }

    public void h() {
        this.f10775i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.3
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
                a.this.i();
            }
        });
    }

    public void i() {
        if (com.amazon.a.a.o.c.f11253a) {
            f10770d.a("Enqueuing launch workflow");
        }
        if (a(this.f10779m)) {
            return;
        }
        this.f10776j.a(com.amazon.a.a.n.b.d.COMMAND, m());
    }

    public void j() {
        this.f10775i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.4
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
                    a.f10770d.a("Beginning shutdown process for application: " + a.this.f10779m.getPackageName());
                }
                a unused = a.f10772f = null;
            }
        });
    }

    public static void a(Context context) {
        if (d()) {
            return;
        }
        synchronized (a.class) {
            try {
                if (!d()) {
                    Application application = (Application) context.getApplicationContext();
                    f10772f = new a(application);
                    application.registerActivityLifecycleCallbacks(com.amazon.a.a.f.a.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(Application application) {
        Object bVar;
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.c());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.d());
        cVar.a(new com.amazon.a.a.n.a.b());
        if (a(application)) {
            bVar = new com.amazon.a.a.g.d();
        } else {
            bVar = new com.amazon.a.a.g.b();
        }
        cVar.a(bVar);
        cVar.a();
        cVar.b(this);
    }

    public static com.amazon.a.a.g.c c() {
        if (!d()) {
            f10770d.a("Appstore SDK is not initialized. Returning default log handler");
            return f10771e;
        }
        return f10772f.f10781o;
    }

    public static boolean a(Application application) {
        boolean z6 = (application.getApplicationInfo().flags & 2) != 0;
        boolean l6 = l();
        if (z6 && l6) {
            f10770d.a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
            return true;
        }
        f10770d.a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
        return false;
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{com.amazon.a.a.o.b.as, str}).getInputStream()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
                return readLine;
            } catch (Exception unused) {
                f10770d.b("Unable to close BufferedReader instance");
                return readLine;
            }
        } catch (IOException e7) {
            e = e7;
            bufferedReader2 = bufferedReader;
            f10770d.a("Can't get system property", e);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    return "";
                } catch (Exception unused2) {
                    f10770d.b("Unable to close BufferedReader instance");
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Exception unused3) {
                    f10770d.b("Unable to close BufferedReader instance");
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10770d.a("WARNING: Use of deprecated method detected.");
        }
        if (d()) {
            c(aVar);
        } else {
            f10770d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!d()) {
            if (context != null && context.getApplicationContext() != null) {
                f10772f = new a((Application) context.getApplicationContext());
            } else {
                f10770d.b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        c(aVar);
    }

    public static com.amazon.a.a.a.a b() {
        if (!d()) {
            f10770d.b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
            return null;
        }
        return f10772f.f10773g;
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10770d.a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    public static com.amazon.a.a.i.e a() {
        if (!d()) {
            f10770d.b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
            return null;
        }
        return f10772f.f10777k;
    }

    public static boolean a(String str, String str2) {
        if (d()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f10772f.f10780n.a());
            } catch (com.amazon.a.a.o.b.a.a e6) {
                f10770d.a("Unable to validate signature: " + e6.getMessage());
                return false;
            }
        }
        f10770d.a("AppstoreSDK was not yet initialized - cannot do the IAP call");
        return false;
    }

    public static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10770d.a(str + ": " + context);
        }
        if (d()) {
            return true;
        }
        b(str, context);
        return false;
    }
}
