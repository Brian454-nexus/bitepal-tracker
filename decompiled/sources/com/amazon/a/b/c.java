package com.amazon.a.b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11308a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11309b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f11310c;

    private boolean b() {
        return this.f11309b.b(com.amazon.a.a.m.c.f11025b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f11309b.a(com.amazon.a.a.m.c.f11026c);
        if (cVar == null) {
            return e.f11316e;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11308a.a("Fetched failure content from store: " + cVar);
        }
        this.f11309b.c(com.amazon.a.a.m.c.f11026c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11308a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f11308a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11308a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f11310c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
