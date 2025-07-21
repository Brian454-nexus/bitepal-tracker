package l0;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1726a implements D6.g {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f16867d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ag));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f16868e = Logger.getLogger(AbstractC1726a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f16869f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f16870g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f16871a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f16872b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f16873c;

    /* renamed from: l0.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC1726a abstractC1726a, e eVar, e eVar2);

        public abstract boolean b(AbstractC1726a abstractC1726a, Object obj, Object obj2);

        public abstract boolean c(AbstractC1726a abstractC1726a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: l0.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f16874c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f16875d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16876a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f16877b;

        static {
            if (AbstractC1726a.f16867d) {
                f16875d = null;
                f16874c = null;
            } else {
                f16875d = new c(false, null);
                f16874c = new c(true, null);
            }
        }

        public c(boolean z6, Throwable th) {
            this.f16876a = z6;
            this.f16877b = th;
        }
    }

    /* renamed from: l0.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f16878b = new d(new C0213a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f16879a;

        /* renamed from: l0.a$d$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0213a extends Throwable {
            public C0213a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f16879a = (Throwable) AbstractC1726a.e(th);
        }
    }

    /* renamed from: l0.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f16880d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f16881a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f16882b;

        /* renamed from: c, reason: collision with root package name */
        public e f16883c;

        public e(Runnable runnable, Executor executor) {
            this.f16881a = runnable;
            this.f16882b = executor;
        }
    }

    /* renamed from: l0.a$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f16884a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f16885b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f16886c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f16887d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f16888e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f16884a = atomicReferenceFieldUpdater;
            this.f16885b = atomicReferenceFieldUpdater2;
            this.f16886c = atomicReferenceFieldUpdater3;
            this.f16887d = atomicReferenceFieldUpdater4;
            this.f16888e = atomicReferenceFieldUpdater5;
        }

        @Override // l0.AbstractC1726a.b
        public boolean a(AbstractC1726a abstractC1726a, e eVar, e eVar2) {
            return AbstractC1727b.a(this.f16887d, abstractC1726a, eVar, eVar2);
        }

        @Override // l0.AbstractC1726a.b
        public boolean b(AbstractC1726a abstractC1726a, Object obj, Object obj2) {
            return AbstractC1727b.a(this.f16888e, abstractC1726a, obj, obj2);
        }

        @Override // l0.AbstractC1726a.b
        public boolean c(AbstractC1726a abstractC1726a, h hVar, h hVar2) {
            return AbstractC1727b.a(this.f16886c, abstractC1726a, hVar, hVar2);
        }

        @Override // l0.AbstractC1726a.b
        public void d(h hVar, h hVar2) {
            this.f16885b.lazySet(hVar, hVar2);
        }

        @Override // l0.AbstractC1726a.b
        public void e(h hVar, Thread thread) {
            this.f16884a.lazySet(hVar, thread);
        }
    }

    /* renamed from: l0.a$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // l0.AbstractC1726a.b
        public boolean a(AbstractC1726a abstractC1726a, e eVar, e eVar2) {
            synchronized (abstractC1726a) {
                try {
                    if (abstractC1726a.f16872b != eVar) {
                        return false;
                    }
                    abstractC1726a.f16872b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // l0.AbstractC1726a.b
        public boolean b(AbstractC1726a abstractC1726a, Object obj, Object obj2) {
            synchronized (abstractC1726a) {
                try {
                    if (abstractC1726a.f16871a != obj) {
                        return false;
                    }
                    abstractC1726a.f16871a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // l0.AbstractC1726a.b
        public boolean c(AbstractC1726a abstractC1726a, h hVar, h hVar2) {
            synchronized (abstractC1726a) {
                try {
                    if (abstractC1726a.f16873c != hVar) {
                        return false;
                    }
                    abstractC1726a.f16873c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // l0.AbstractC1726a.b
        public void d(h hVar, h hVar2) {
            hVar.f16891b = hVar2;
        }

        @Override // l0.AbstractC1726a.b
        public void e(h hVar, Thread thread) {
            hVar.f16890a = thread;
        }
    }

    /* renamed from: l0.a$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f16889c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f16890a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f16891b;

        public h(boolean z6) {
        }

        public void a(h hVar) {
            AbstractC1726a.f16869f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f16890a;
            if (thread != null) {
                this.f16890a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractC1726a.f16869f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1726a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1726a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1726a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f16869f = gVar;
        if (th != null) {
            f16868e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16870g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(StringBuilder sb) {
        try {
            Object j6 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(q(j6));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(AbstractC1726a abstractC1726a) {
        abstractC1726a.m();
        abstractC1726a.b();
        e f6 = abstractC1726a.f(null);
        while (f6 != null) {
            e eVar = f6.f16883c;
            h(f6.f16881a, f6.f16882b);
            f6 = eVar;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f16868e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f16877b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f16879a);
        }
        if (obj == f16870g) {
            return null;
        }
        return obj;
    }

    public static Object j(Future future) {
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

    private void m() {
        h hVar;
        do {
            hVar = this.f16873c;
        } while (!f16869f.c(this, hVar, h.f16889c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f16891b;
        }
    }

    public void b() {
    }

    public final void c(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f16872b;
        if (eVar != e.f16880d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f16883c = eVar;
                if (f16869f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f16872b;
                }
            } while (eVar != e.f16880d);
        }
        h(runnable, executor);
    }

    public final boolean cancel(boolean z6) {
        Object obj = this.f16871a;
        if (obj == null) {
            if (f16869f.b(this, obj, f16867d ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f16874c : c.f16875d)) {
                if (z6) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f16872b;
        } while (!f16869f.a(this, eVar2, e.f16880d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f16883c;
            eVar4.f16883c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f16871a;
            if (obj != null) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.f16873c;
                if (hVar != h.f16889c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f16869f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f16871a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(hVar2);
                        } else {
                            hVar = this.f16873c;
                        }
                    } while (hVar != h.f16889c);
                }
                return i(this.f16871a);
            }
            while (nanos > 0) {
                Object obj3 = this.f16871a;
                if (obj3 != null) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC1726a = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j7 = -nanos;
                long convert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
                long nanos2 = j7 - timeUnit.toNanos(convert);
                boolean z6 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z6) {
                        str3 = str3 + com.amazon.a.a.o.b.f.f11248a;
                    }
                    str2 = str3 + " ";
                }
                if (z6) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractC1726a);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f16871a instanceof c;
    }

    public final boolean isDone() {
        return this.f16871a != null;
    }

    public void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void n(h hVar) {
        hVar.f16890a = null;
        while (true) {
            h hVar2 = this.f16873c;
            if (hVar2 == h.f16889c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f16891b;
                if (hVar2.f16890a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f16891b = hVar4;
                    if (hVar3.f16890a == null) {
                        break;
                    }
                } else if (!f16869f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f16870g;
        }
        if (!f16869f.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean p(Throwable th) {
        if (!f16869f.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public final String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean r() {
        Object obj = this.f16871a;
        return (obj instanceof c) && ((c) obj).f16876a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = l();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16871a;
            if (obj2 != null) {
                return i(obj2);
            }
            h hVar = this.f16873c;
            if (hVar != h.f16889c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f16869f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16871a;
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return i(obj);
                    }
                    hVar = this.f16873c;
                } while (hVar != h.f16889c);
            }
            return i(this.f16871a);
        }
        throw new InterruptedException();
    }
}
