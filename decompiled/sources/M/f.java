package M;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Executor f3341b;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3342a = Executors.newSingleThreadExecutor(new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor b() {
        if (f3341b != null) {
            return f3341b;
        }
        synchronized (f.class) {
            try {
                if (f3341b == null) {
                    f3341b = new f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3341b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3342a.execute(runnable);
    }
}
