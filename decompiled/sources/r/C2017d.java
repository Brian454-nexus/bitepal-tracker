package r;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2017d extends AbstractC2018e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18691a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f18692b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f18693c;

    /* renamed from: r.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f18694a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f18694a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: r.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // r.AbstractC2018e
    public void a(Runnable runnable) {
        this.f18692b.execute(runnable);
    }

    @Override // r.AbstractC2018e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // r.AbstractC2018e
    public void c(Runnable runnable) {
        if (this.f18693c == null) {
            synchronized (this.f18691a) {
                try {
                    if (this.f18693c == null) {
                        this.f18693c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f18693c.post(runnable);
    }
}
