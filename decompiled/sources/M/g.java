package M;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Executor f3344b;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3345a = Executors.newFixedThreadPool(2, new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3346a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f3346a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (f3344b != null) {
            return f3344b;
        }
        synchronized (g.class) {
            try {
                if (f3344b == null) {
                    f3344b = new g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3344b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3345a.execute(runnable);
    }
}
