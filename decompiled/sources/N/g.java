package N;

import F.AbstractC0335i0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g implements D6.g {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f3466a;

        public a(Throwable th) {
            this.f3466a = th;
        }

        @Override // N.g
        public Object get() {
            throw new ExecutionException(this.f3466a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f3466a + "]]";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends a implements ScheduledFuture {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final g f3467b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        public final Object f3468a;

        public c(Object obj) {
            this.f3468a = obj;
        }

        @Override // N.g
        public Object get() {
            return this.f3468a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f3468a + "]]";
        }
    }

    public static D6.g a() {
        return c.f3467b;
    }

    public void c(Runnable runnable, Executor executor) {
        y0.g.f(runnable);
        y0.g.f(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            AbstractC0335i0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e6);
        }
    }

    public boolean cancel(boolean z6) {
        return false;
    }

    public abstract Object get();

    public Object get(long j6, TimeUnit timeUnit) {
        y0.g.f(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
