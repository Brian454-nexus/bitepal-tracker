package com.amazon.a;

import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c extends com.amazon.a.a.n.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11342b = new com.amazon.a.a.o.c("CheckIfAppisBlockedTask");

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f11343c;

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        if (jVar.b() == null || !jVar.b().containsKey("verbose")) {
            return;
        }
        boolean booleanValue = ((Boolean) jVar.b().get("verbose")).booleanValue();
        com.amazon.a.a.o.c.f11254b = booleanValue;
        com.amazon.a.a.o.c.f11253a = booleanValue;
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return "check_blocked_status";
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
        return true;
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(h hVar) {
        if (m()) {
            n();
        }
        f11342b.c("app is blocked, killing");
        this.f11343c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e())));
    }
}
