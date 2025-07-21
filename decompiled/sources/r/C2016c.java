package r;

import java.util.concurrent.Executor;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2016c extends AbstractC2018e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2016c f18686c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f18687d = new Executor() { // from class: r.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2016c.g().c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f18688e = new Executor() { // from class: r.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2016c.g().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public AbstractC2018e f18689a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2018e f18690b;

    public C2016c() {
        C2017d c2017d = new C2017d();
        this.f18690b = c2017d;
        this.f18689a = c2017d;
    }

    public static Executor f() {
        return f18688e;
    }

    public static C2016c g() {
        if (f18686c != null) {
            return f18686c;
        }
        synchronized (C2016c.class) {
            try {
                if (f18686c == null) {
                    f18686c = new C2016c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18686c;
    }

    @Override // r.AbstractC2018e
    public void a(Runnable runnable) {
        this.f18689a.a(runnable);
    }

    @Override // r.AbstractC2018e
    public boolean b() {
        return this.f18689a.b();
    }

    @Override // r.AbstractC2018e
    public void c(Runnable runnable) {
        this.f18689a.c(runnable);
    }
}
