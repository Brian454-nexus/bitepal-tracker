package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.amazon.d.a.d;
import com.amazon.d.a.e;
import com.amazon.d.a.i;
import com.amazon.d.a.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11065a = new com.amazon.a.a.o.c("CommandServiceClient");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11066b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11067c = "com.amazon.venezia.CommandService";

    /* renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.d f11068d;

    /* renamed from: e, reason: collision with root package name */
    private String f11069e;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11072h;

    /* renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f11073i;

    /* renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11074j;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<c> f11070f = new LinkedBlockingQueue();

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<com.amazon.d.a.d> f11071g = new LinkedBlockingQueue();

    /* renamed from: k, reason: collision with root package name */
    private final ServiceConnection f11075k = new ServiceConnection() { // from class: com.amazon.a.a.n.a.d.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f11065a.a("onServiceConnected");
            d.this.f11071g.add(d.a.a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.f11065a.a("onServiceDisconnected!!!");
        }
    };

    /* renamed from: l, reason: collision with root package name */
    private final com.amazon.d.a.i f11076l = new i.a() { // from class: com.amazon.a.a.n.a.d.2
        @Override // com.amazon.d.a.i
        public void a(j jVar) {
            d.this.f11070f.add(new c(jVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.h hVar) {
            d.this.f11070f.add(new c(hVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.f fVar) {
            d.this.f11070f.add(new c(fVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.g gVar) {
            d.this.f11070f.add(new c(gVar));
        }
    };

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f11081a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11082b;

        /* renamed from: c, reason: collision with root package name */
        long f11083c;
    }

    private boolean d() {
        return this.f11068d != null;
    }

    private void e() {
        long currentTimeMillis = System.currentTimeMillis();
        com.amazon.a.a.o.c cVar = f11065a;
        cVar.a("Binding Service!!!");
        Intent f6 = f();
        if (!a(this.f11072h, f6)) {
            throw new com.amazon.a.a.n.a.a.c();
        }
        cVar.a("Found service on one or more packages");
        Intent a6 = a(f6);
        String packageName = a6.getComponent().getPackageName();
        cVar.a("Attempting to bind to service on " + packageName);
        if (!this.f11072h.bindService(a6, this.f11075k, 1)) {
            throw new com.amazon.a.a.n.a.a.b();
        }
        try {
            cVar.a("Blocking while service is being bound!!");
            this.f11068d = this.f11071g.take();
            cVar.a("service bound, returning!!");
            if (com.amazon.a.a.o.c.f11253a) {
                cVar.a("Kiwi.BindService Time: " + (System.currentTimeMillis() - currentTimeMillis));
            }
            this.f11074j.a(com.amazon.a.a.m.c.f11029f, packageName);
            this.f11069e = packageName;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new com.amazon.a.a.n.a.a.b();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction(f11067c);
        f11065a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() {
        try {
            com.amazon.a.a.o.c cVar = f11065a;
            cVar.a("Blocking for result from service");
            c take = this.f11070f.take();
            cVar.a("Received result from service");
            return take;
        } catch (InterruptedException unused) {
            f11065a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    private c b(com.amazon.d.a.c cVar) {
        this.f11074j.a(com.amazon.a.a.m.c.f11030g, cVar.b());
        this.f11068d.a(cVar, this.f11076l);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) {
        a aVar = new a();
        aVar.f11081a = 6;
        aVar.f11083c = 100L;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (com.amazon.a.a.n.a.a.b e6) {
                a(e6, aVar);
                if (!aVar.f11082b) {
                    throw e6;
                }
            } catch (com.amazon.a.a.n.a.a.c e7) {
                a(e7, aVar);
                if (!aVar.f11082b) {
                    throw e7;
                }
            }
        }
    }

    public void b() {
        com.amazon.a.a.o.c cVar = f11065a;
        StringBuilder sb = new StringBuilder();
        sb.append("Finishing CommandServiceClient, unbinding service: ");
        sb.append(this.f11068d != null);
        cVar.a(sb.toString());
        if (this.f11068d != null) {
            this.f11072h.unbindService(this.f11075k);
            this.f11068d = null;
        }
    }

    private boolean b(String str) {
        f11065a.a("isPackageSignatureTrusted " + str);
        return this.f11073i.a(str, i.f11132a);
    }

    public static void a(com.amazon.a.a.d.b bVar, a aVar) {
        com.amazon.a.a.o.c cVar = f11065a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.f11081a, bVar);
        int i6 = aVar.f11081a;
        if (i6 == 0) {
            aVar.f11082b = false;
            return;
        }
        aVar.f11081a = i6 - 1;
        aVar.f11082b = true;
        try {
            cVar.a("Sleeping for " + aVar.f11083c + " ms");
            Thread.sleep(aVar.f11083c);
        } catch (InterruptedException unused) {
            aVar.f11082b = false;
        }
        aVar.f11083c *= 2;
    }

    public String a() {
        return this.f11069e;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(f11067c);
        intent.setClassName(str, f11066b);
        return intent;
    }

    private Intent a(Intent intent) {
        if (this.f11069e != null) {
            f11065a.a("Using previously determined package " + this.f11069e);
            return a(this.f11069e);
        }
        com.amazon.a.a.o.c cVar = f11065a;
        cVar.a("No previously determined package found, checking for suitable package.");
        Intent a6 = a(this.f11072h.getPackageManager().queryIntentServices(intent, 64));
        if (a6 != null) {
            return a6;
        }
        cVar.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    private Intent a(List<ResolveInfo> list) {
        int i6 = 0;
        String str = null;
        while (true) {
            try {
                if (i6 >= list.size()) {
                    i6 = -1;
                    break;
                }
                ResolveInfo resolveInfo = list.get(i6);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                com.amazon.a.a.o.c cVar = f11065a;
                cVar.a("Examining package " + str2);
                cVar.a("Priority is " + resolveInfo.filter.getPriority());
                cVar.a("Checking signature of package " + str2);
                if (b(str2)) {
                    cVar.a("Signature of package " + str2 + " is okay");
                    str = str2;
                    break;
                }
                cVar.a("Signature of package " + str2 + " is bad");
                i6++;
                str = str2;
            } catch (Exception e6) {
                f11065a.a("Caught exception " + e6);
            }
        }
        if (i6 > -1) {
            return a(str);
        }
        return null;
    }

    public c a(com.amazon.d.a.a aVar) {
        aVar.a(null);
        return g();
    }

    public c a(com.amazon.d.a.f fVar, final e eVar) {
        fVar.a(new e.a() { // from class: com.amazon.a.a.n.a.d.3
            @Override // com.amazon.d.a.e
            public String a() {
                return eVar.name();
            }

            @Override // com.amazon.d.a.e
            public Map b() {
                return null;
            }
        });
        return g();
    }
}
