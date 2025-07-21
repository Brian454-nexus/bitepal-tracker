package w0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f19723a;

        /* renamed from: b, reason: collision with root package name */
        public int f19724b;

        /* renamed from: w0.k$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0265a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final int f19725a;

            public C0265a(Runnable runnable, String str, int i6) {
                super(runnable, str);
                this.f19725a = i6;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f19725a);
                super.run();
            }
        }

        public a(String str, int i6) {
            this.f19723a = str;
            this.f19724b = i6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0265a(runnable, this.f19723a, this.f19724b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f19726a;

        public b(Handler handler) {
            this.f19726a = (Handler) y0.g.f(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f19726a.post((Runnable) y0.g.f(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f19726a + " is shutting down");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Callable f19727a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC2343a f19728b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f19729c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2343a f19730a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f19731b;

            public a(InterfaceC2343a interfaceC2343a, Object obj) {
                this.f19730a = interfaceC2343a;
                this.f19731b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19730a.accept(this.f19731b);
            }
        }

        public c(Handler handler, Callable callable, InterfaceC2343a interfaceC2343a) {
            this.f19727a = callable;
            this.f19728b = interfaceC2343a;
            this.f19729c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f19727a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f19729c.post(new a(this.f19728b, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i6, int i7) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i7, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i6));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static void c(Executor executor, Callable callable, InterfaceC2343a interfaceC2343a) {
        executor.execute(new c(AbstractC2207b.a(), callable, interfaceC2343a));
    }

    public static Object d(ExecutorService executorService, Callable callable, int i6) {
        try {
            return executorService.submit(callable).get(i6, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            throw e6;
        } catch (ExecutionException e7) {
            throw new RuntimeException(e7);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
