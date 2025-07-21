package F;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ExecutorC0344p implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f1455c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1456a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f1457b = d();

    /* renamed from: F.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f1458a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f1458a.getAndIncrement())));
            return thread;
        }
    }

    public static ThreadPoolExecutor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f1455c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: F.o
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC0335i0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void e(I.C c6) {
        ThreadPoolExecutor threadPoolExecutor;
        y0.g.f(c6);
        synchronized (this.f1456a) {
            try {
                if (this.f1457b.isShutdown()) {
                    this.f1457b = d();
                }
                threadPoolExecutor = this.f1457b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, c6.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        y0.g.f(runnable);
        synchronized (this.f1456a) {
            this.f1457b.execute(runnable);
        }
    }
}
