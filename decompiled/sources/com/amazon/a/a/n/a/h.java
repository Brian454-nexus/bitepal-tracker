package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h extends a {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11121b = new com.amazon.a.a.o.c("KiwiCommand");

    /* renamed from: c, reason: collision with root package name */
    private final com.amazon.a.a.j.a f11122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11123d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11124e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11125f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f11126g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11128i;

    /* renamed from: j, reason: collision with root package name */
    private h f11129j;

    /* renamed from: k, reason: collision with root package name */
    private h f11130k;

    /* renamed from: h, reason: collision with root package name */
    private final com.amazon.a.b.f f11127h = new com.amazon.a.b.f();

    /* renamed from: l, reason: collision with root package name */
    private boolean f11131l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f11122c = aVar;
        this.f11123d = str3;
        this.f11124e = str;
        this.f11125f = str2;
        HashMap hashMap = new HashMap();
        this.f11126g = hashMap;
        hashMap.put(com.amazon.a.a.o.b.f11172B, str3);
        hashMap.put(com.amazon.a.a.o.b.f11179I, str4);
        this.f11128i = true;
        this.f11129j = null;
        this.f11130k = null;
    }

    public h a(boolean z6) {
        this.f11131l = z6;
        return this;
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return this.f11124e;
    }

    public void b(com.amazon.d.a.h hVar) {
    }

    public abstract boolean b(j jVar);

    public void c(com.amazon.a.a.d.b bVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return true;
    }

    public boolean i() {
        return this.f11131l;
    }

    public com.amazon.a.a.j.a j() {
        return this.f11122c;
    }

    public String k() {
        return this.f11123d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }

    public void a(h hVar) {
        this.f11129j = hVar;
    }

    public void b(h hVar) {
        this.f11130k = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return this.f11125f;
    }

    public void a(String str, Object obj) {
        this.f11126g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        return this.f11126g;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e a6 = com.amazon.a.a.a();
        if (a6 == null) {
            f11121b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            a6.a((com.amazon.a.a.i.b) aVar);
        }
    }

    public void b(boolean z6) {
        this.f11128i = z6;
    }

    @Override // com.amazon.a.a.n.a.a
    public void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.ah.equals(this.f11125f) && (hVar = this.f11130k) != null) {
            hVar.a(this.f11131l);
            this.f11130k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e6) {
            f11121b.a("Error calling onResult: " + e6);
        }
        if (this.f11128i) {
            a(this.f11127h.a(bVar));
        }
        if (this.f11131l) {
            return;
        }
        this.f11122c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        boolean z6;
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f11202f);
        f11121b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            try {
                z6 = b(jVar);
            } catch (Exception e6) {
                f11121b.a("Error calling onResult: " + e6);
                z6 = false;
            }
            if (z6 && (hVar = this.f11129j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f11131l) {
                    return;
                }
                if (z6) {
                    this.f11122c.b();
                    return;
                } else {
                    this.f11122c.c();
                    return;
                }
            }
        }
        if (this.f11131l) {
            return;
        }
        this.f11122c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(com.amazon.d.a.h hVar) {
        String str;
        h hVar2;
        f11121b.a("onFailure: result = " + hVar);
        if (hVar != null && (str = (String) hVar.f().get(com.amazon.a.a.o.b.an)) != null && str.equalsIgnoreCase("1.0") && (hVar2 = this.f11130k) != null) {
            hVar2.a(this.f11131l);
            this.f11130k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e6) {
            f11121b.a("Error calling onResult: " + e6);
        }
        if (this.f11128i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f11131l) {
            return;
        }
        this.f11122c.c();
    }
}
