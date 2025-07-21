package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import com.amazon.a.a.k.d;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a<T extends a<T>> implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10887b = new com.amazon.a.a.o.c("Expirable");

    /* renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f10888a;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f10889c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final List<b<T>> f10890d = new Vector();

    private void h() {
        this.f10888a.a(com.amazon.a.a.n.b.d.BACKGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.c();
            }

            public String toString() {
                return "Expire: " + a.this.toString();
            }
        }, a());
    }

    private void i() {
        Iterator<b<T>> it = this.f10890d.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public abstract Date a();

    public final void a(b<T> bVar) {
        this.f10890d.add(bVar);
    }

    public void b() {
    }

    public void c() {
        if (this.f10889c.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f11253a) {
                f10887b.a("Expiring: " + this);
            }
            d();
            if (com.amazon.a.a.o.c.f11253a) {
                f10887b.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    public abstract void d();

    @Override // com.amazon.a.a.k.d
    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.f10889c.compareAndSet(false, true)) {
            i();
        }
    }

    public boolean g() {
        return this.f10889c.get();
    }
}
