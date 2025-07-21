package N;

import N.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import l0.AbstractC1728c;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2069a f3459a = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2069a f3460a;

        public a(InterfaceC2069a interfaceC2069a) {
            this.f3460a = interfaceC2069a;
        }

        @Override // N.a
        public D6.g apply(Object obj) {
            return f.h(this.f3460a.apply(obj));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements InterfaceC2069a {
        @Override // t.InterfaceC2069a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f3461a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2069a f3462b;

        public c(AbstractC1728c.a aVar, InterfaceC2069a interfaceC2069a) {
            this.f3461a = aVar;
            this.f3462b = interfaceC2069a;
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            this.f3461a.f(th);
        }

        @Override // N.c
        public void onSuccess(Object obj) {
            try {
                this.f3461a.c(this.f3462b.apply(obj));
            } catch (Throwable th) {
                this.f3461a.f(th);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D6.g f3463a;

        public d(D6.g gVar) {
            this.f3463a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3463a.cancel(true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Future f3464a;

        /* renamed from: b, reason: collision with root package name */
        public final N.c f3465b;

        public e(Future future, N.c cVar) {
            this.f3464a = future;
            this.f3465b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3465b.onSuccess(f.d(this.f3464a));
            } catch (Error e6) {
                e = e6;
                this.f3465b.onFailure(e);
            } catch (RuntimeException e7) {
                e = e7;
                this.f3465b.onFailure(e);
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    this.f3465b.onFailure(e8);
                } else {
                    this.f3465b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + com.amazon.a.a.o.b.f.f11248a + this.f3465b;
        }
    }

    public static /* synthetic */ Object a(D6.g gVar, AbstractC1728c.a aVar) {
        l(false, gVar, f3459a, aVar, M.c.b());
        return "nonCancellationPropagating[" + gVar + "]";
    }

    public static void b(D6.g gVar, N.c cVar, Executor executor) {
        y0.g.f(cVar);
        gVar.c(new e(gVar, cVar), executor);
    }

    public static D6.g c(Collection collection) {
        return new h(new ArrayList(collection), true, M.c.b());
    }

    public static Object d(Future future) {
        y0.g.i(future.isDone(), "Future was expected to be done, " + future);
        return e(future);
    }

    public static Object e(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public static D6.g f(Throwable th) {
        return new g.a(th);
    }

    public static ScheduledFuture g(Throwable th) {
        return new g.b(th);
    }

    public static D6.g h(Object obj) {
        return obj == null ? g.a() : new g.c(obj);
    }

    public static D6.g i(final D6.g gVar) {
        y0.g.f(gVar);
        return gVar.isDone() ? gVar : AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: N.e
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return f.a(gVar, aVar);
            }
        });
    }

    public static void j(D6.g gVar, AbstractC1728c.a aVar) {
        k(gVar, f3459a, aVar, M.c.b());
    }

    public static void k(D6.g gVar, InterfaceC2069a interfaceC2069a, AbstractC1728c.a aVar, Executor executor) {
        l(true, gVar, interfaceC2069a, aVar, executor);
    }

    public static void l(boolean z6, D6.g gVar, InterfaceC2069a interfaceC2069a, AbstractC1728c.a aVar, Executor executor) {
        y0.g.f(gVar);
        y0.g.f(interfaceC2069a);
        y0.g.f(aVar);
        y0.g.f(executor);
        b(gVar, new c(aVar, interfaceC2069a), executor);
        if (z6) {
            aVar.a(new d(gVar), M.c.b());
        }
    }

    public static D6.g m(Collection collection) {
        return new h(new ArrayList(collection), false, M.c.b());
    }

    public static D6.g n(D6.g gVar, InterfaceC2069a interfaceC2069a, Executor executor) {
        y0.g.f(interfaceC2069a);
        return o(gVar, new a(interfaceC2069a), executor);
    }

    public static D6.g o(D6.g gVar, N.a aVar, Executor executor) {
        N.b bVar = new N.b(aVar, gVar);
        gVar.c(bVar, executor);
        return bVar;
    }
}
