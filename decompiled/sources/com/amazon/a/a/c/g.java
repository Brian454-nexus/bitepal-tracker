package com.amazon.a.a.c;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10880a = new com.amazon.a.a.o.c("EventManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private final Map<b, e<?>> f10881b = new HashMap();

    @Override // com.amazon.a.a.c.f
    public <T extends a> void a(c<T> cVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "listener");
        com.amazon.a.a.o.a.a.a();
        b a6 = cVar.a();
        f10880a.a("Registering listener for event: " + a6 + ", " + cVar);
        e<?> eVar = this.f10881b.get(a6);
        if (eVar == null) {
            eVar = new e<>();
            this.f10881b.put(a6, eVar);
        }
        eVar.a((c<?>) cVar);
    }

    @Override // com.amazon.a.a.c.f
    public void a(a aVar) {
        b a6 = aVar.a();
        if (com.amazon.a.a.o.c.f11253a) {
            f10880a.a("Posting event: " + a6);
        }
        if (!this.f10881b.containsKey(a6)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10880a.a("No registered listeners, returning");
                return;
            }
            return;
        }
        this.f10881b.get(a6).a((e<?>) aVar);
    }
}
