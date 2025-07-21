package T4;

import T4.p;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4916b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4917c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f4918d;

    /* renamed from: e, reason: collision with root package name */
    public p.a f4919e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4920f;

    /* renamed from: T4.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class ThreadFactoryC0084a implements ThreadFactory {

        /* renamed from: T4.a$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class RunnableC0085a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f4921a;

            public RunnableC0085a(Runnable runnable) {
                this.f4921a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f4921a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0085a(runnable), "glide-active-resources");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final R4.f f4924a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4925b;

        /* renamed from: c, reason: collision with root package name */
        public v f4926c;

        public c(R4.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z6) {
            super(pVar, referenceQueue);
            this.f4924a = (R4.f) n5.k.d(fVar);
            this.f4926c = (pVar.e() && z6) ? (v) n5.k.d(pVar.d()) : null;
            this.f4925b = pVar.e();
        }

        public void a() {
            this.f4926c = null;
            clear();
        }
    }

    public a(boolean z6) {
        this(z6, Executors.newSingleThreadExecutor(new ThreadFactoryC0084a()));
    }

    public synchronized void a(R4.f fVar, p pVar) {
        c cVar = (c) this.f4917c.put(fVar, new c(fVar, pVar, this.f4918d, this.f4915a));
        if (cVar != null) {
            cVar.a();
        }
    }

    public void b() {
        while (!this.f4920f) {
            try {
                c((c) this.f4918d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f4917c.remove(cVar.f4924a);
            if (cVar.f4925b && (vVar = cVar.f4926c) != null) {
                this.f4919e.d(cVar.f4924a, new p(vVar, true, false, cVar.f4924a, this.f4919e));
            }
        }
    }

    public synchronized void d(R4.f fVar) {
        c cVar = (c) this.f4917c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized p e(R4.f fVar) {
        c cVar = (c) this.f4917c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f4919e = aVar;
            }
        }
    }

    public a(boolean z6, Executor executor) {
        this.f4917c = new HashMap();
        this.f4918d = new ReferenceQueue();
        this.f4915a = z6;
        this.f4916b = executor;
        executor.execute(new b());
    }
}
