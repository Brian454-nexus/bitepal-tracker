package M;

import M.b;
import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Executor f3324b;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3325a = Executors.newFixedThreadPool(2, new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3326a = new AtomicInteger(0);

        public a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: M.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f3326a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (f3324b != null) {
            return f3324b;
        }
        synchronized (b.class) {
            try {
                if (f3324b == null) {
                    f3324b = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3324b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3325a.execute(runnable);
    }
}
