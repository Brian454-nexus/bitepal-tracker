package x5;

import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20642a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f20643a;

        public a(Runnable runnable) {
            this.f20643a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20643a.run();
            } catch (Exception e6) {
                B5.a.c("Executor", "Background execution failure.", e6);
            }
        }
    }

    public n(Executor executor) {
        this.f20642a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20642a.execute(new a(runnable));
    }
}
