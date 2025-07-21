package com.amazon.a.b;

import android.app.Application;
import com.amazon.d.a.j;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11291b = new com.amazon.a.a.o.c("VerifyApplicationEntitlmentTask");

    /* renamed from: c, reason: collision with root package name */
    private f f11292c = new f();

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f11293d;

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11294e;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f11295f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11296g;

    /* renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f11297h;

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        g gVar = new g(jVar.b());
        b a6 = a(gVar, this.f11297h.a());
        if (a6 == null) {
            return;
        }
        a(gVar, a6);
        a(a6);
        this.f11293d.a(new com.amazon.a.b.b.a());
        this.f11295f.a(com.amazon.a.a.n.b.d.BACKGROUND, new i());
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return "get_license";
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        return null;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return this.f11296g.a(com.amazon.a.a.m.c.f11025b) == null;
    }

    @Override // com.amazon.a.a.n.a.a
    public void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.i.c a6 = this.f11292c.a(bVar);
        if (a6 == null && com.amazon.a.a.o.c.f11254b) {
            f11291b.b("No mapping specified for exception: " + bVar, bVar);
        }
        this.f11296g.a(com.amazon.a.a.m.c.f11026c, (String) a6);
        this.f11296g.a(com.amazon.a.a.m.c.f11027d, bVar.getClass().getName());
    }

    private b a(g gVar, PublicKey publicKey) {
        return new b(new com.amazon.a.a.o.b.f(gVar.c(), publicKey));
    }

    private void a(b bVar) {
        f11291b.a("License Verification succeeded!");
        this.f11296g.a(com.amazon.a.a.m.c.f11025b, new com.amazon.a.a.m.a(bVar, bVar.d()) { // from class: com.amazon.a.b.a.1
            @Override // com.amazon.a.a.e.a
            public void d() {
                this.f10888a.a(com.amazon.a.a.n.b.d.COMMAND, new a());
            }
        });
    }

    private void a(g gVar, b bVar) {
        com.amazon.a.a.o.d.c cVar = new com.amazon.a.a.o.d.c();
        cVar.a(gVar.a(), bVar.b(), (com.amazon.a.a.o.d.b) h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), (com.amazon.a.a.o.d.b) h.DEVICE_ID);
        cVar.a(bVar.e(), this.f11294e.getPackageName(), (com.amazon.a.a.o.d.b) h.PACKAGE_NAME);
        cVar.a(bVar.d(), new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(com.amazon.d.a.h hVar) {
        com.amazon.a.a.i.c cVar = new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e());
        f11291b.a("onFailure: " + cVar);
        this.f11296g.a(com.amazon.a.a.m.c.f11026c, (String) cVar);
    }
}
