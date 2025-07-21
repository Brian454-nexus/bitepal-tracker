package l0;

import D6.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1728c {

    /* renamed from: l0.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f16892a;

        /* renamed from: b, reason: collision with root package name */
        public d f16893b;

        /* renamed from: c, reason: collision with root package name */
        public C1729d f16894c = C1729d.s();

        /* renamed from: d, reason: collision with root package name */
        public boolean f16895d;

        public void a(Runnable runnable, Executor executor) {
            C1729d c1729d = this.f16894c;
            if (c1729d != null) {
                c1729d.c(runnable, executor);
            }
        }

        public void b() {
            this.f16892a = null;
            this.f16893b = null;
            this.f16894c.o(null);
        }

        public boolean c(Object obj) {
            this.f16895d = true;
            d dVar = this.f16893b;
            boolean z6 = dVar != null && dVar.b(obj);
            if (z6) {
                e();
            }
            return z6;
        }

        public boolean d() {
            this.f16895d = true;
            d dVar = this.f16893b;
            boolean z6 = dVar != null && dVar.a(true);
            if (z6) {
                e();
            }
            return z6;
        }

        public final void e() {
            this.f16892a = null;
            this.f16893b = null;
            this.f16894c = null;
        }

        public boolean f(Throwable th) {
            this.f16895d = true;
            d dVar = this.f16893b;
            boolean z6 = dVar != null && dVar.d(th);
            if (z6) {
                e();
            }
            return z6;
        }

        public void finalize() {
            C1729d c1729d;
            d dVar = this.f16893b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f16892a));
            }
            if (this.f16895d || (c1729d = this.f16894c) == null) {
                return;
            }
            c1729d.o(null);
        }
    }

    /* renamed from: l0.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: l0.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0214c {
        Object a(a aVar);
    }

    /* renamed from: l0.c$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f16896a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1726a f16897b = new a();

        /* renamed from: l0.c$d$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a extends AbstractC1726a {
            public a() {
            }

            @Override // l0.AbstractC1726a
            public String l() {
                a aVar = (a) d.this.f16896a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f16892a + "]";
            }
        }

        public d(a aVar) {
            this.f16896a = new WeakReference(aVar);
        }

        public boolean a(boolean z6) {
            return this.f16897b.cancel(z6);
        }

        public boolean b(Object obj) {
            return this.f16897b.o(obj);
        }

        public void c(Runnable runnable, Executor executor) {
            this.f16897b.c(runnable, executor);
        }

        public boolean cancel(boolean z6) {
            a aVar = (a) this.f16896a.get();
            boolean cancel = this.f16897b.cancel(z6);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        public boolean d(Throwable th) {
            return this.f16897b.p(th);
        }

        public Object get() {
            return this.f16897b.get();
        }

        public boolean isCancelled() {
            return this.f16897b.isCancelled();
        }

        public boolean isDone() {
            return this.f16897b.isDone();
        }

        public String toString() {
            return this.f16897b.toString();
        }

        public Object get(long j6, TimeUnit timeUnit) {
            return this.f16897b.get(j6, timeUnit);
        }
    }

    public static g a(InterfaceC0214c interfaceC0214c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f16893b = dVar;
        aVar.f16892a = interfaceC0214c.getClass();
        try {
            Object a6 = interfaceC0214c.a(aVar);
            if (a6 != null) {
                aVar.f16892a = a6;
                return dVar;
            }
        } catch (Exception e6) {
            dVar.d(e6);
        }
        return dVar;
    }
}
