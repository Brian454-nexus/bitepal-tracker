package N;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h implements D6.g {

    /* renamed from: a, reason: collision with root package name */
    public List f3469a;

    /* renamed from: b, reason: collision with root package name */
    public List f3470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3471c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f3472d;

    /* renamed from: e, reason: collision with root package name */
    public final D6.g f3473e = AbstractC1728c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1728c.a f3474f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements AbstractC1728c.InterfaceC0214c {
        public a() {
        }

        @Override // l0.AbstractC1728c.InterfaceC0214c
        public Object a(AbstractC1728c.a aVar) {
            y0.g.i(h.this.f3474f == null, "The result can only set once!");
            h.this.f3474f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f3470b = null;
            hVar.f3469a = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f3477a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D6.g f3478b;

        public c(int i6, D6.g gVar) {
            this.f3477a = i6;
            this.f3478b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f(this.f3477a, this.f3478b);
        }
    }

    public h(List list, boolean z6, Executor executor) {
        this.f3469a = (List) y0.g.f(list);
        this.f3470b = new ArrayList(list.size());
        this.f3471c = z6;
        this.f3472d = new AtomicInteger(list.size());
        e(executor);
    }

    public final void a() {
        List<D6.g> list = this.f3469a;
        if (list == null || isDone()) {
            return;
        }
        for (D6.g gVar : list) {
            while (!gVar.isDone()) {
                try {
                    gVar.get();
                } catch (Error e6) {
                    throw e6;
                } catch (InterruptedException e7) {
                    throw e7;
                } catch (Throwable unused) {
                    if (this.f3471c) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List get() {
        a();
        return (List) this.f3473e.get();
    }

    public void c(Runnable runnable, Executor executor) {
        this.f3473e.c(runnable, executor);
    }

    public boolean cancel(boolean z6) {
        List list = this.f3469a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((D6.g) it.next()).cancel(z6);
            }
        }
        return this.f3473e.cancel(z6);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get(long j6, TimeUnit timeUnit) {
        return (List) this.f3473e.get(j6, timeUnit);
    }

    public final void e(Executor executor) {
        c(new b(), M.c.b());
        if (this.f3469a.isEmpty()) {
            this.f3474f.c(new ArrayList(this.f3470b));
            return;
        }
        for (int i6 = 0; i6 < this.f3469a.size(); i6++) {
            this.f3470b.add(null);
        }
        List list = this.f3469a;
        for (int i7 = 0; i7 < list.size(); i7++) {
            D6.g gVar = (D6.g) list.get(i7);
            gVar.c(new c(i7, gVar), executor);
        }
    }

    public void f(int i6, Future future) {
        AbstractC1728c.a aVar;
        ArrayList arrayList;
        List list = this.f3470b;
        if (isDone() || list == null) {
            y0.g.i(this.f3471c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            y0.g.i(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i6, f.e(future));
                            int decrementAndGet = this.f3472d.decrementAndGet();
                            y0.g.i(decrementAndGet >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet == 0) {
                                List list2 = this.f3470b;
                                if (list2 != null) {
                                    this.f3474f.c(new ArrayList(list2));
                                } else {
                                    y0.g.h(isDone());
                                }
                            }
                        } catch (ExecutionException e6) {
                            if (this.f3471c) {
                                this.f3474f.f(e6.getCause());
                            }
                            int decrementAndGet2 = this.f3472d.decrementAndGet();
                            y0.g.i(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List list3 = this.f3470b;
                                if (list3 != null) {
                                    aVar = this.f3474f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                y0.g.h(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f3471c) {
                            cancel(false);
                        }
                        int decrementAndGet3 = this.f3472d.decrementAndGet();
                        y0.g.i(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet3 == 0) {
                            List list4 = this.f3470b;
                            if (list4 != null) {
                                aVar = this.f3474f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            y0.g.h(isDone());
                        }
                    }
                } catch (Error e7) {
                    this.f3474f.f(e7);
                    int decrementAndGet4 = this.f3472d.decrementAndGet();
                    y0.g.i(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet4 == 0) {
                        List list5 = this.f3470b;
                        if (list5 != null) {
                            aVar = this.f3474f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        y0.g.h(isDone());
                    }
                }
            } catch (RuntimeException e8) {
                if (this.f3471c) {
                    this.f3474f.f(e8);
                }
                int decrementAndGet5 = this.f3472d.decrementAndGet();
                y0.g.i(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List list6 = this.f3470b;
                    if (list6 != null) {
                        aVar = this.f3474f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    y0.g.h(isDone());
                }
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.f3472d.decrementAndGet();
            y0.g.i(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List list7 = this.f3470b;
                if (list7 != null) {
                    this.f3474f.c(new ArrayList(list7));
                } else {
                    y0.g.h(isDone());
                }
            }
            throw th;
        }
    }

    public boolean isCancelled() {
        return this.f3473e.isCancelled();
    }

    public boolean isDone() {
        return this.f3473e.isDone();
    }
}
