package com.amazon.a.a.n.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private b f11152a;

    @Override // com.amazon.a.a.n.c.c
    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.f11152a, "workflow instance can only be set once");
        this.f11152a = bVar;
    }

    public final boolean m() {
        return this.f11152a != null;
    }

    public final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.f11152a.d();
    }
}
