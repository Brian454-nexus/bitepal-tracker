package com.amazon.a.a.n.c;

import com.amazon.a.a.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b extends a implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11153b = new com.amazon.a.a.o.c("TaskWorkflow");

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f11155c;

    /* renamed from: a, reason: collision with root package name */
    protected final List<com.amazon.a.a.n.a> f11154a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f11156d = new AtomicBoolean(false);

    private void f() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11153b.a("Exiting task workflow: " + this);
        }
        for (com.amazon.a.a.n.a aVar : this.f11154a) {
            if (this.f11156d.get()) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11153b.a("Finished set, exiting task workflow early");
                    return;
                }
                return;
            }
            aVar.a();
        }
    }

    @Override // com.amazon.a.a.n.a
    public final void a() {
        try {
            c();
            f();
        } finally {
            b();
        }
    }

    public void b() {
    }

    public abstract String b_();

    public void c() {
    }

    public final void d() {
        this.f11156d.set(true);
    }

    @Override // com.amazon.a.a.k.d
    public final void e() {
        Iterator<com.amazon.a.a.n.a> it = this.f11154a.iterator();
        while (it.hasNext()) {
            this.f11155c.b(it.next());
        }
    }

    public final String toString() {
        return b_();
    }

    public final void a(com.amazon.a.a.n.a aVar) {
        com.amazon.a.a.o.a.a.a((Object) aVar, "task");
        this.f11154a.add(aVar);
        if (aVar instanceof c) {
            ((c) aVar).a(this);
        }
    }
}
