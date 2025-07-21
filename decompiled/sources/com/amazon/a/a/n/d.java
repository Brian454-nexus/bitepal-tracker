package com.amazon.a.a.n;

import com.amazon.a.a.c.f;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements com.amazon.a.a.k.d, b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11157a = new com.amazon.a.a.o.c("TaskManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f11158b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f11159c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f11160d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final Map<com.amazon.a.a.n.b.d, com.amazon.a.a.n.b.c> f11161e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar);
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f11161e = hashMap;
        com.amazon.a.a.n.b.d dVar = com.amazon.a.a.n.b.d.COMMAND;
        com.amazon.a.a.n.b.b a6 = com.amazon.a.a.n.b.b.a(dVar.name());
        com.amazon.a.a.n.b.d dVar2 = com.amazon.a.a.n.b.d.BACKGROUND;
        com.amazon.a.a.n.b.b a7 = com.amazon.a.a.n.b.b.a(dVar2.name());
        com.amazon.a.a.n.b.a aVar = new com.amazon.a.a.n.b.a(a7);
        hashMap.put(dVar, a6);
        hashMap.put(dVar2, a7);
        hashMap.put(com.amazon.a.a.n.b.d.FOREGROUND, aVar);
    }

    private void c() {
        this.f11159c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.n.d.5
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                d.this.a();
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11157a.a("Enqueue task on pipeline id: " + dVar);
        }
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.1
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2);
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void b(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.2
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.b(aVar2);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        Iterator<com.amazon.a.a.n.b.c> it = this.f11161e.values().iterator();
        while (it.hasNext()) {
            this.f11158b.b(it.next());
        }
        c();
    }

    private boolean b() {
        return this.f11160d.get();
    }

    private void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, a aVar2) {
        if (b()) {
            if (com.amazon.a.a.o.c.f11254b) {
                f11157a.b("Task enqueued after TaskManager has been finished! Task: " + aVar);
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11157a.a("Populating Task: " + aVar);
        }
        this.f11158b.b(aVar);
        aVar2.a(aVar, a(dVar));
    }

    private com.amazon.a.a.n.b.c a(com.amazon.a.a.n.b.d dVar) {
        com.amazon.a.a.n.b.c cVar = this.f11161e.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No pipeline registered with id: " + dVar);
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, final Date date) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.3
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2, date);
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, final long j6) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.4
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2, j6);
            }
        });
    }

    public void a() {
        if (this.f11160d.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11157a.a("TaskManager finishing....");
            }
            Iterator<com.amazon.a.a.n.b.c> it = this.f11161e.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }
}
