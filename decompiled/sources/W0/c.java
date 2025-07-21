package W0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static Handler f5387e;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f5389b = e.PENDING;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5390c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5391d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final FutureTask f5388a = new b(new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            c.this.f5391d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = c.this.b();
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends FutureTask {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e6) {
                Log.w("AsyncTask", e6);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e7) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: W0.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC0095c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f5394a;

        public RunnableC0095c(Object obj) {
            this.f5394a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f5394a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5396a;

        static {
            int[] iArr = new int[e.values().length];
            f5396a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5396a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f5387e == null) {
                    f5387e = new Handler(Looper.getMainLooper());
                }
                handler = f5387e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z6) {
        this.f5390c.set(true);
        return this.f5388a.cancel(z6);
    }

    public abstract Object b();

    public final void c(Executor executor) {
        if (this.f5389b == e.PENDING) {
            this.f5389b = e.RUNNING;
            executor.execute(this.f5388a);
            return;
        }
        int i6 = d.f5396a[this.f5389b.ordinal()];
        if (i6 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i6 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f5389b = e.FINISHED;
    }

    public final boolean f() {
        return this.f5390c.get();
    }

    public abstract void g(Object obj);

    public abstract void h(Object obj);

    public void i(Object obj) {
        e().post(new RunnableC0095c(obj));
    }

    public void j(Object obj) {
        if (this.f5391d.get()) {
            return;
        }
        i(obj);
    }
}
