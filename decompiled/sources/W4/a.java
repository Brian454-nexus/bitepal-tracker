package W4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5651b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f5652c;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5653a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5654a;

        /* renamed from: b, reason: collision with root package name */
        public int f5655b;

        /* renamed from: c, reason: collision with root package name */
        public int f5656c;

        /* renamed from: d, reason: collision with root package name */
        public ThreadFactory f5657d = new c();

        /* renamed from: e, reason: collision with root package name */
        public e f5658e = e.f5672d;

        /* renamed from: f, reason: collision with root package name */
        public String f5659f;

        /* renamed from: g, reason: collision with root package name */
        public long f5660g;

        public b(boolean z6) {
            this.f5654a = z6;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f5659f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f5659f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f5655b, this.f5656c, this.f5660g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f5657d, this.f5659f, this.f5658e, this.f5654a));
            if (this.f5660g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f5659f = str;
            return this;
        }

        public b c(int i6) {
            this.f5655b = i6;
            this.f5656c = i6;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements ThreadFactory {

        /* renamed from: W4.a$c$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0100a extends Thread {
            public C0100a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0100a(runnable);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f5662a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5663b;

        /* renamed from: c, reason: collision with root package name */
        public final e f5664c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f5665d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f5666e = new AtomicInteger();

        /* renamed from: W4.a$d$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class RunnableC0101a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f5667a;

            public RunnableC0101a(Runnable runnable) {
                this.f5667a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f5665d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f5667a.run();
                } catch (Throwable th) {
                    d.this.f5664c.a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z6) {
            this.f5662a = threadFactory;
            this.f5663b = str;
            this.f5664c = eVar;
            this.f5665d = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f5662a.newThread(new RunnableC0101a(runnable));
            newThread.setName("glide-" + this.f5663b + "-thread-" + this.f5666e.getAndIncrement());
            return newThread;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5669a = new C0102a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f5670b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f5671c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f5672d;

        /* renamed from: W4.a$e$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0102a implements e {
            @Override // W4.a.e
            public void a(Throwable th) {
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements e {
            @Override // W4.a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class c implements e {
            @Override // W4.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f5670b = bVar;
            f5671c = new c();
            f5672d = bVar;
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
        this.f5653a = executorService;
    }

    public static int b() {
        return d() >= 4 ? 2 : 1;
    }

    public static int d() {
        if (f5652c == 0) {
            f5652c = Math.min(4, W4.b.a());
        }
        return f5652c;
    }

    public static b e() {
        return new b(true).c(b()).b("animation");
    }

    public static a f() {
        return e().a();
    }

    public static b g() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a h() {
        return g().a();
    }

    public static b i() {
        return new b(false).c(d()).b("source");
    }

    public static a j() {
        return i().a();
    }

    public static a k() {
        return new a(new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, f5651b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f5672d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f5653a.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5653a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f5653a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f5653a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f5653a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f5653a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f5653a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f5653a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f5653a.submit(runnable);
    }

    public String toString() {
        return this.f5653a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f5653a.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f5653a.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f5653a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f5653a.submit(callable);
    }
}
