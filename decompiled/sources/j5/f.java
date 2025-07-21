package j5;

import T4.q;
import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n5.l;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f implements c, g {

    /* renamed from: k, reason: collision with root package name */
    public static final a f16243k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f16244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16245b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16246c;

    /* renamed from: d, reason: collision with root package name */
    public final a f16247d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16248e;

    /* renamed from: f, reason: collision with root package name */
    public d f16249f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16250g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16251h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16252i;

    /* renamed from: j, reason: collision with root package name */
    public q f16253j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j6) {
            obj.wait(j6);
        }
    }

    public f(int i6, int i7) {
        this(i6, i7, true, f16243k);
    }

    @Override // g5.l
    public void a() {
    }

    @Override // j5.g
    public synchronized boolean b(q qVar, Object obj, k5.h hVar, boolean z6) {
        this.f16252i = true;
        this.f16253j = qVar;
        this.f16247d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f16250g = true;
                this.f16247d.a(this);
                d dVar = null;
                if (z6) {
                    d dVar2 = this.f16249f;
                    this.f16249f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k5.h
    public synchronized void d(Object obj, l5.b bVar) {
    }

    @Override // k5.h
    public void e(k5.g gVar) {
    }

    @Override // g5.l
    public void f() {
    }

    @Override // j5.g
    public synchronized boolean g(Object obj, Object obj2, k5.h hVar, R4.a aVar, boolean z6) {
        this.f16251h = true;
        this.f16248e = obj;
        this.f16247d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return o(null);
        } catch (TimeoutException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // k5.h
    public synchronized void h(Drawable drawable) {
    }

    @Override // k5.h
    public synchronized void i(d dVar) {
        this.f16249f = dVar;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f16250g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z6;
        if (!this.f16250g && !this.f16251h) {
            z6 = this.f16252i;
        }
        return z6;
    }

    @Override // g5.l
    public void j() {
    }

    @Override // k5.h
    public void k(Drawable drawable) {
    }

    @Override // k5.h
    public synchronized d l() {
        return this.f16249f;
    }

    @Override // k5.h
    public void m(Drawable drawable) {
    }

    @Override // k5.h
    public void n(k5.g gVar) {
        gVar.f(this.f16244a, this.f16245b);
    }

    public final synchronized Object o(Long l6) {
        try {
            if (this.f16246c && !isDone()) {
                l.a();
            }
            if (this.f16250g) {
                throw new CancellationException();
            }
            if (this.f16252i) {
                throw new ExecutionException(this.f16253j);
            }
            if (this.f16251h) {
                return this.f16248e;
            }
            if (l6 == null) {
                this.f16247d.b(this, 0L);
            } else if (l6.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l6.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f16247d.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f16252i) {
                throw new ExecutionException(this.f16253j);
            }
            if (this.f16250g) {
                throw new CancellationException();
            }
            if (!this.f16251h) {
                throw new TimeoutException();
            }
            return this.f16248e;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                dVar = null;
                if (this.f16250g) {
                    str = "CANCELLED";
                } else if (this.f16252i) {
                    str = "FAILURE";
                } else if (this.f16251h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.f16249f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + dVar + "]]";
    }

    public f(int i6, int i7, boolean z6, a aVar) {
        this.f16244a = i6;
        this.f16245b = i7;
        this.f16246c = z6;
        this.f16247d = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j6, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j6)));
    }
}
