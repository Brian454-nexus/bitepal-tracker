package N;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l0.AbstractC1728c;
import t.InterfaceC2069a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements D6.g {

    /* renamed from: a, reason: collision with root package name */
    public final D6.g f3455a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1728c.a f3456b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements AbstractC1728c.InterfaceC0214c {
        public a() {
        }

        @Override // l0.AbstractC1728c.InterfaceC0214c
        public Object a(AbstractC1728c.a aVar) {
            y0.g.i(d.this.f3456b == null, "The result can only set once!");
            d.this.f3456b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(D6.g gVar) {
        this.f3455a = (D6.g) y0.g.f(gVar);
    }

    public static d a(D6.g gVar) {
        return gVar instanceof d ? (d) gVar : new d(gVar);
    }

    public boolean b(Object obj) {
        AbstractC1728c.a aVar = this.f3456b;
        if (aVar != null) {
            return aVar.c(obj);
        }
        return false;
    }

    public void c(Runnable runnable, Executor executor) {
        this.f3455a.c(runnable, executor);
    }

    public boolean cancel(boolean z6) {
        return this.f3455a.cancel(z6);
    }

    public boolean d(Throwable th) {
        AbstractC1728c.a aVar = this.f3456b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final d e(InterfaceC2069a interfaceC2069a, Executor executor) {
        return (d) f.n(this, interfaceC2069a, executor);
    }

    public final d f(N.a aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    public Object get() {
        return this.f3455a.get();
    }

    public boolean isCancelled() {
        return this.f3455a.isCancelled();
    }

    public boolean isDone() {
        return this.f3455a.isDone();
    }

    public Object get(long j6, TimeUnit timeUnit) {
        return this.f3455a.get(j6, timeUnit);
    }

    public d() {
        this.f3455a = AbstractC1728c.a(new a());
    }
}
