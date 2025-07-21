package com.amazon.a.a.n.b;

import com.amazon.a.a.c.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements com.amazon.a.a.k.d, c {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11133a = new com.amazon.a.a.o.c("ForegroundTaskPipeline");

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f11134b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f11135c;

    /* renamed from: e, reason: collision with root package name */
    private c f11137e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.amazon.a.a.n.a> f11138f = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private c f11136d = b.b("KIWI_UI");

    public a(c cVar) {
        this.f11137e = cVar;
    }

    private com.amazon.a.a.n.a c(final com.amazon.a.a.n.a aVar) {
        return new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.n.b.a.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.a(aVar, true);
            }

            public String toString() {
                return "Future:PostToUITask: " + aVar.toString();
            }
        };
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        a(aVar, true);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f11135c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.n.b.a.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public String toString() {
                return "ForegroundTaskPipeline:onResume listener";
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11133a.a("Activity resumed, scheduling tasks on UI thread");
        }
        Iterator<com.amazon.a.a.n.a> it = this.f11138f.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f11138f.clear();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        a(aVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.amazon.a.a.n.a aVar, boolean z6) {
        if (this.f11134b.c()) {
            if (z6) {
                this.f11136d.b(aVar);
                return;
            } else {
                this.f11136d.a(aVar);
                return;
            }
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11133a.a("No UI visible to execute task: " + aVar + ", placing into pending queue until task is visible");
        }
        this.f11138f.add(aVar);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        this.f11137e.a(c(aVar), date);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j6) {
        this.f11137e.a(c(aVar), j6);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        this.f11136d.a();
        this.f11137e.a();
        this.f11138f.clear();
    }
}
