package N;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public N.a f3448c;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue f3449d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f3450e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public D6.g f3451f;

    /* renamed from: g, reason: collision with root package name */
    public volatile D6.g f3452g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D6.g f3453a;

        public a(D6.g gVar) {
            this.f3453a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.b(f.e(this.f3453a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                    b.this.f3452g = null;
                } catch (ExecutionException e6) {
                    b.this.d(e6.getCause());
                    b.this.f3452g = null;
                }
            } catch (Throwable th) {
                b.this.f3452g = null;
                throw th;
            }
        }
    }

    public b(N.a aVar, D6.g gVar) {
        this.f3448c = (N.a) y0.g.f(aVar);
        this.f3451f = (D6.g) y0.g.f(gVar);
    }

    @Override // N.d
    public boolean cancel(boolean z6) {
        if (!super.cancel(z6)) {
            return false;
        }
        h(this.f3449d, Boolean.valueOf(z6));
        g(this.f3451f, z6);
        g(this.f3452g, z6);
        return true;
    }

    public final void g(Future future, boolean z6) {
        if (future != null) {
            future.cancel(z6);
        }
    }

    @Override // N.d
    public Object get() {
        if (!isDone()) {
            D6.g gVar = this.f3451f;
            if (gVar != null) {
                gVar.get();
            }
            this.f3450e.await();
            D6.g gVar2 = this.f3452g;
            if (gVar2 != null) {
                gVar2.get();
            }
        }
        return super.get();
    }

    public final void h(BlockingQueue blockingQueue, Object obj) {
        boolean z6 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public final Object i(BlockingQueue blockingQueue) {
        Object take;
        boolean z6 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // java.lang.Runnable
    public void run() {
        D6.g gVar;
        D6.g gVar2 = null;
        gVar2 = null;
        gVar2 = null;
        gVar2 = null;
        gVar2 = null;
        try {
            try {
                try {
                    try {
                        try {
                            D6.g apply = this.f3448c.apply(f.e(this.f3451f));
                            this.f3452g = apply;
                            if (isCancelled()) {
                                apply.cancel(((Boolean) i(this.f3449d)).booleanValue());
                                this.f3452g = null;
                            } else {
                                apply.c(new a(apply), M.c.b());
                            }
                        } catch (Exception e6) {
                            d(e6);
                            gVar = gVar2;
                        }
                    } catch (Error e7) {
                        d(e7);
                        gVar = gVar2;
                    }
                } finally {
                    this.f3448c = gVar2;
                    this.f3451f = gVar2;
                    this.f3450e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e8) {
                d(e8.getCause());
            }
        } catch (UndeclaredThrowableException e9) {
            d(e9.getCause());
            gVar = gVar2;
        }
    }

    @Override // N.d
    public Object get(long j6, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j6 = timeUnit2.convert(j6, timeUnit);
                timeUnit = timeUnit2;
            }
            D6.g gVar = this.f3451f;
            if (gVar != null) {
                long nanoTime = System.nanoTime();
                gVar.get(j6, timeUnit);
                j6 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f3450e.await(j6, timeUnit)) {
                j6 -= Math.max(0L, System.nanoTime() - nanoTime2);
                D6.g gVar2 = this.f3452g;
                if (gVar2 != null) {
                    gVar2.get(j6, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j6, timeUnit);
    }
}
