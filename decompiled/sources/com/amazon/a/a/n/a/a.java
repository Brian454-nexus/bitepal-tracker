package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.j;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a extends com.amazon.a.a.n.c.a {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11033b = new com.amazon.a.a.o.c("AbstractCommandTask");

    /* renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.l.b f11034a;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11035c;

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private d f11036d;

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f11037e;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f11038f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f11039g;

    private void b(j jVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Command executed successfully");
        }
        a(jVar);
    }

    private com.amazon.d.a.c i() {
        return new c.a() { // from class: com.amazon.a.a.n.a.a.1
            @Override // com.amazon.d.a.c
            public String a() {
                return a.this.c();
            }

            @Override // com.amazon.d.a.c
            public String b() {
                return a.this.a_();
            }

            @Override // com.amazon.d.a.c
            public Map c() {
                return a.this.b();
            }

            @Override // com.amazon.d.a.c
            public String d() {
                return a.this.f11035c.getPackageName();
            }
        };
    }

    private void j() {
        if (m()) {
            return;
        }
        this.f11036d.b();
    }

    public abstract void a(com.amazon.d.a.h hVar);

    public abstract void a(j jVar);

    public abstract String a_();

    public abstract Map<String, Object> b();

    public abstract String c();

    public abstract boolean d();

    public void e() {
    }

    public boolean f() {
        return true;
    }

    public String g() {
        return a_() + "_failure";
    }

    public String h() {
        return a_() + "_success";
    }

    @Override // com.amazon.a.a.n.a
    public final void a() {
        try {
            if (com.amazon.a.a.o.c.f11253a) {
                com.amazon.a.a.o.c cVar = f11033b;
                cVar.a("----------------------------------------------");
                cVar.a("Executing: " + a_());
                cVar.a("----------------------------------------------");
            }
            e();
            if (!d()) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("Execution not needed, quitting");
                }
                return;
            }
            if (com.amazon.a.a.o.c.f11253a) {
                f11033b.a("Executing Command: " + a_());
            }
            a(this.f11036d.a(i()));
            if (com.amazon.a.a.o.c.f11253a) {
                f11033b.a("Task finished");
            }
            j();
        } catch (Throwable th) {
            try {
                a(th);
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("Task finished");
                }
                j();
            } finally {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("Task finished");
                }
                j();
            }
        }
    }

    private void b(com.amazon.d.a.h hVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private com.amazon.a.a.d.b b(Throwable th) {
        if (th instanceof com.amazon.a.a.d.b) {
            return (com.amazon.a.a.d.b) th;
        }
        if (th instanceof RemoteException) {
            return new com.amazon.a.a.n.a.a.d((RemoteException) th);
        }
        return new com.amazon.a.a.n.a.a.h(th);
    }

    public void b(com.amazon.a.a.d.b bVar) {
        f11033b.b("On Exception!!!!: " + bVar);
    }

    private void a(c cVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11033b.a("Received null result from command service, exiting task");
            }
        } else {
            if (cVar.e() != null) {
                a(cVar.e());
                return;
            }
            this.f11039g.a(cVar.a(), this.f11036d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(com.amazon.d.a.g gVar) {
        throw new com.amazon.a.a.n.a.a.f(gVar);
    }

    private void a(com.amazon.d.a.f fVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.f11037e.a((com.amazon.a.a.i.b) fVar2);
            com.amazon.d.a.a i6 = fVar2.i();
            if (i6 == null) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("DecisionChooser returned null!!, expiring");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            a(fVar, i6);
        } catch (com.amazon.a.a.n.a.a.e e6) {
            a(fVar, e6.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Handling customer choice: " + aVar);
        }
        Intent b6 = aVar.b();
        if (b6 != null) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11033b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a a6 = this.f11034a.a(b6);
            if (a6 == null) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("No result recived, expiring decision");
                }
                a(fVar, e.EXPIRATION_DURATION_ELAPSED);
                return;
            } else if (a6.d() == 0) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("Result canceled, expiring decision");
                }
                a(fVar, e.ACTION_CANCELED);
                return;
            } else {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11033b.a("Result received!!!, notifying service");
                }
                a(this.f11036d.a(aVar));
                return;
            }
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("No intent given, choosing now");
        }
        a(this.f11036d.a(aVar));
    }

    private void a(com.amazon.d.a.f fVar, e eVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.f11036d.a(fVar, eVar));
    }

    private void a(Throwable th) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11033b.a("Exception occurred while processing task: " + th, th);
        }
        com.amazon.a.a.d.b b6 = b(th);
        b(b6);
        this.f11038f.a(a(b6));
    }

    public com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }
}
