package M;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f3329b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3330a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return M.c.e();
            }
            if (Looper.myLooper() != null) {
                return new e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3331a;

        public b(Runnable runnable) {
            this.f3331a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f3331a.run();
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements RunnableScheduledFuture {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f3333a = new AtomicReference(null);

        /* renamed from: b, reason: collision with root package name */
        public final long f3334b;

        /* renamed from: c, reason: collision with root package name */
        public final Callable f3335c;

        /* renamed from: d, reason: collision with root package name */
        public final D6.g f3336d;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements AbstractC1728c.InterfaceC0214c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f3337a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f3338b;

            /* renamed from: M.e$c$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public class RunnableC0058a implements Runnable {
                public RunnableC0058a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f3333a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f3337a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f3337a = handler;
                this.f3338b = callable;
            }

            @Override // l0.AbstractC1728c.InterfaceC0214c
            public Object a(AbstractC1728c.a aVar) {
                aVar.a(new RunnableC0058a(), M.c.b());
                c.this.f3333a.set(aVar);
                return "HandlerScheduledFuture-" + this.f3338b.toString();
            }
        }

        public c(Handler handler, long j6, Callable callable) {
            this.f3334b = j6;
            this.f3335c = callable;
            this.f3336d = AbstractC1728c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            return this.f3336d.cancel(z6);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f3336d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f3334b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3336d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3336d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            AbstractC1728c.a aVar = (AbstractC1728c.a) this.f3333a.getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.c(this.f3335c.call());
                } catch (Exception e6) {
                    aVar.f(e6);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j6, TimeUnit timeUnit) {
            return this.f3336d.get(j6, timeUnit);
        }
    }

    public e(Handler handler) {
        this.f3330a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final RejectedExecutionException b() {
        return new RejectedExecutionException(this.f3330a + " is shutting down");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f3330a.post(runnable)) {
            throw b();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return schedule(new b(runnable), j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j6, timeUnit);
        c cVar = new c(this.f3330a, uptimeMillis, callable);
        return this.f3330a.postAtTime(cVar, uptimeMillis) ? cVar : N.f.g(b());
    }
}
