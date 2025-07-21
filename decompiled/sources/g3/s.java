package g3;

import i3.InterfaceExecutorC1510a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class s implements InterfaceExecutorC1510a {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f14884b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f14885c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14883a = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f14886d = new Object();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final s f14887a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f14888b;

        public a(s sVar, Runnable runnable) {
            this.f14887a = sVar;
            this.f14888b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14888b.run();
                synchronized (this.f14887a.f14886d) {
                    this.f14887a.b();
                }
            } catch (Throwable th) {
                synchronized (this.f14887a.f14886d) {
                    this.f14887a.b();
                    throw th;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f14884b = executor;
    }

    public void b() {
        Runnable runnable = (Runnable) this.f14883a.poll();
        this.f14885c = runnable;
        if (runnable != null) {
            this.f14884b.execute(runnable);
        }
    }

    @Override // i3.InterfaceExecutorC1510a
    public boolean c() {
        boolean z6;
        synchronized (this.f14886d) {
            z6 = !this.f14883a.isEmpty();
        }
        return z6;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f14886d) {
            try {
                this.f14883a.add(new a(this, runnable));
                if (this.f14885c == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
