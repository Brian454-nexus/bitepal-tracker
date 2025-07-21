package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements e, com.amazon.a.a.k.d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f10949a = new com.amazon.a.a.o.c("PromptManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f10950b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f10951c;

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f10952d;

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f10953e;

    /* renamed from: f, reason: collision with root package name */
    private b f10954f;

    /* renamed from: g, reason: collision with root package name */
    private Set<b> f10955g = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f10956h = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        if (this.f10956h.get()) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10949a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f10949a.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.f10955g.add(bVar);
        if (this.f10954f != null) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10949a.a("Dialog currently showing, not presenting given dialog");
            }
        } else {
            Activity b6 = this.f10950b.b();
            if (b6 != null) {
                a(b6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        this.f10955g.remove(bVar);
        if (this.f10954f == bVar) {
            this.f10954f = null;
            Activity b6 = this.f10950b.b();
            if (b6 != null) {
                a(b6);
            }
        }
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        b();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        b bVar = this.f10954f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    @Override // com.amazon.a.a.i.e
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(final b bVar) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10949a.a("Scheduling presentation: " + bVar);
        }
        this.f10953e.b(bVar);
        if (this.f10956h.get()) {
            if (com.amazon.a.a.o.c.f11254b) {
                f10949a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        this.f10952d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.c(bVar);
            }

            public String toString() {
                return "Prompt Presentation on Main Thread: " + bVar + ", " + bVar.a();
            }
        });
    }

    @Override // com.amazon.a.a.e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final b bVar) {
        this.f10952d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.d(bVar);
            }

            public String toString() {
                return "PromptManager:removeExpiredPrompt: " + bVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f10956h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10949a.a("PromptManager finishing....");
            }
            Iterator<b> it = this.f10955g.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                next.c();
            }
            b bVar = this.f10954f;
            if (bVar != null) {
                bVar.k();
            }
        }
    }

    private void b() {
        this.f10951c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.i.f.3
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
                f.this.b(aVar.b());
            }
        });
    }

    private void a(Activity activity) {
        b a6 = a();
        if (a6 == null) {
            return;
        }
        a(a6, activity);
    }

    private void c() {
        this.f10951c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.i.f.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.FIRST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                f.this.d();
            }
        });
    }

    private b a() {
        if (this.f10955g.isEmpty()) {
            return null;
        }
        return this.f10955g.iterator().next();
    }

    private void a(b bVar, Activity activity) {
        this.f10954f = bVar;
        bVar.a(activity);
    }

    @Override // com.amazon.a.a.i.e
    public Dialog a(Activity activity, int i6) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10949a.a("onCreateDialog, id: " + i6 + ", activity: " + activity);
        }
        b bVar = this.f10954f;
        if (bVar == null) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10949a.a("Showing dialog is null, returning");
            }
            return null;
        }
        if (bVar.j() != i6) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10949a.a("Showing dialog id does not match given id: " + i6 + ", returning");
            }
            return null;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f10949a.a("Creating dialog prompt: " + this.f10954f);
        }
        return this.f10954f.c(activity);
    }

    @Override // com.amazon.a.a.i.e
    public void a(Activity activity, boolean z6) {
        b bVar = this.f10954f;
        if (bVar != null) {
            bVar.a(activity, z6);
        }
    }
}
