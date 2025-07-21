package h3;

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
import l0.AbstractC1727b;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1459a implements D6.g {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15291d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ag));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f15292e = Logger.getLogger(AbstractC1459a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f15293f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f15294g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15295a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f15296b;

    /* renamed from: c, reason: collision with root package name */
    public volatile i f15297c;

    /* renamed from: h3.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC1459a abstractC1459a, e eVar, e eVar2);

        public abstract boolean b(AbstractC1459a abstractC1459a, Object obj, Object obj2);

        public abstract boolean c(AbstractC1459a abstractC1459a, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* renamed from: h3.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f15298c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f15299d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f15300a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f15301b;

        static {
            if (AbstractC1459a.f15291d) {
                f15299d = null;
                f15298c = null;
            } else {
                f15299d = new c(false, null);
                f15298c = new c(true, null);
            }
        }

        public c(boolean z6, Throwable th) {
            this.f15300a = z6;
            this.f15301b = th;
        }
    }

    /* renamed from: h3.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f15302b = new d(new C0205a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f15303a;

        /* renamed from: h3.a$d$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0205a extends Throwable {
            public C0205a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f15303a = (Throwable) AbstractC1459a.e(th);
        }
    }

    /* renamed from: h3.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f15304d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f15305a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f15306b;

        /* renamed from: c, reason: collision with root package name */
        public e f15307c;

        public e(Runnable runnable, Executor executor) {
            this.f15305a = runnable;
            this.f15306b = executor;
        }
    }

    /* renamed from: h3.a$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f15308a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f15309b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f15310c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f15311d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f15312e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f15308a = atomicReferenceFieldUpdater;
            this.f15309b = atomicReferenceFieldUpdater2;
            this.f15310c = atomicReferenceFieldUpdater3;
            this.f15311d = atomicReferenceFieldUpdater4;
            this.f15312e = atomicReferenceFieldUpdater5;
        }

        @Override // h3.AbstractC1459a.b
        public boolean a(AbstractC1459a abstractC1459a, e eVar, e eVar2) {
            return AbstractC1727b.a(this.f15311d, abstractC1459a, eVar, eVar2);
        }

        @Override // h3.AbstractC1459a.b
        public boolean b(AbstractC1459a abstractC1459a, Object obj, Object obj2) {
            return AbstractC1727b.a(this.f15312e, abstractC1459a, obj, obj2);
        }

        @Override // h3.AbstractC1459a.b
        public boolean c(AbstractC1459a abstractC1459a, i iVar, i iVar2) {
            return AbstractC1727b.a(this.f15310c, abstractC1459a, iVar, iVar2);
        }

        @Override // h3.AbstractC1459a.b
        public void d(i iVar, i iVar2) {
            this.f15309b.lazySet(iVar, iVar2);
        }

        @Override // h3.AbstractC1459a.b
        public void e(i iVar, Thread thread) {
            this.f15308a.lazySet(iVar, thread);
        }
    }

    /* renamed from: h3.a$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1459a f15313a;

        /* renamed from: b, reason: collision with root package name */
        public final D6.g f15314b;

        public g(AbstractC1459a abstractC1459a, D6.g gVar) {
            this.f15313a = abstractC1459a;
            this.f15314b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15313a.f15295a != this) {
                return;
            }
            if (AbstractC1459a.f15293f.b(this.f15313a, this, AbstractC1459a.j(this.f15314b))) {
                AbstractC1459a.g(this.f15313a);
            }
        }
    }

    /* renamed from: h3.a$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // h3.AbstractC1459a.b
        public boolean a(AbstractC1459a abstractC1459a, e eVar, e eVar2) {
            synchronized (abstractC1459a) {
                try {
                    if (abstractC1459a.f15296b != eVar) {
                        return false;
                    }
                    abstractC1459a.f15296b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // h3.AbstractC1459a.b
        public boolean b(AbstractC1459a abstractC1459a, Object obj, Object obj2) {
            synchronized (abstractC1459a) {
                try {
                    if (abstractC1459a.f15295a != obj) {
                        return false;
                    }
                    abstractC1459a.f15295a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // h3.AbstractC1459a.b
        public boolean c(AbstractC1459a abstractC1459a, i iVar, i iVar2) {
            synchronized (abstractC1459a) {
                try {
                    if (abstractC1459a.f15297c != iVar) {
                        return false;
                    }
                    abstractC1459a.f15297c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // h3.AbstractC1459a.b
        public void d(i iVar, i iVar2) {
            iVar.f15317b = iVar2;
        }

        @Override // h3.AbstractC1459a.b
        public void e(i iVar, Thread thread) {
            iVar.f15316a = thread;
        }
    }

    /* renamed from: h3.a$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        public static final i f15315c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f15316a;

        /* renamed from: b, reason: collision with root package name */
        public volatile i f15317b;

        public i(boolean z6) {
        }

        public void a(i iVar) {
            AbstractC1459a.f15293f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f15316a;
            if (thread != null) {
                this.f15316a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            AbstractC1459a.f15293f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1459a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1459a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1459a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f15293f = hVar;
        if (th != null) {
            f15292e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15294g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(StringBuilder sb) {
        try {
            Object k6 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k6));
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

    public static void g(AbstractC1459a abstractC1459a) {
        e eVar = null;
        while (true) {
            abstractC1459a.n();
            abstractC1459a.b();
            e f6 = abstractC1459a.f(eVar);
            while (f6 != null) {
                eVar = f6.f15307c;
                Runnable runnable = f6.f15305a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC1459a = gVar.f15313a;
                    if (abstractC1459a.f15295a == gVar) {
                        if (f15293f.b(abstractC1459a, gVar, j(gVar.f15314b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f6.f15306b);
                }
                f6 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f15292e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f15301b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f15303a);
        }
        if (obj == f15294g) {
            return null;
        }
        return obj;
    }

    public static Object j(D6.g gVar) {
        if (gVar instanceof AbstractC1459a) {
            Object obj = ((AbstractC1459a) gVar).f15295a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f15300a ? cVar.f15301b != null ? new c(false, cVar.f15301b) : c.f15299d : obj;
        }
        boolean isCancelled = gVar.isCancelled();
        if ((!f15291d) && isCancelled) {
            return c.f15299d;
        }
        try {
            Object k6 = k(gVar);
            return k6 == null ? f15294g : k6;
        } catch (CancellationException e6) {
            if (isCancelled) {
                return new c(false, e6);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + gVar, e6));
        } catch (ExecutionException e7) {
            return new d(e7.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f15297c;
        } while (!f15293f.c(this, iVar, i.f15315c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f15317b;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public void b() {
    }

    public final void c(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f15296b;
        if (eVar != e.f15304d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f15307c = eVar;
                if (f15293f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f15296b;
                }
            } while (eVar != e.f15304d);
        }
        h(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f15295a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof h3.AbstractC1459a.g
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = h3.AbstractC1459a.f15291d
            if (r3 == 0) goto L1f
            h3.a$c r3 = new h3.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            h3.a$c r3 = h3.AbstractC1459a.c.f15298c
            goto L26
        L24:
            h3.a$c r3 = h3.AbstractC1459a.c.f15299d
        L26:
            r4 = r7
            r5 = r2
        L28:
            h3.a$b r6 = h3.AbstractC1459a.f15293f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.l()
        L35:
            g(r4)
            boolean r4 = r0 instanceof h3.AbstractC1459a.g
            if (r4 == 0) goto L58
            h3.a$g r0 = (h3.AbstractC1459a.g) r0
            D6.g r0 = r0.f15314b
            boolean r4 = r0 instanceof h3.AbstractC1459a
            if (r4 == 0) goto L55
            r4 = r0
            h3.a r4 = (h3.AbstractC1459a) r4
            java.lang.Object r0 = r4.f15295a
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof h3.AbstractC1459a.g
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = r1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.f15295a
            boolean r6 = r0 instanceof h3.AbstractC1459a.g
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.AbstractC1459a.cancel(boolean):boolean");
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f15296b;
        } while (!f15293f.a(this, eVar2, e.f15304d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f15307c;
            eVar4.f15307c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f15295a;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f15297c;
                if (iVar != i.f15315c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f15293f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15295a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f15297c;
                        }
                    } while (iVar != i.f15315c);
                }
                return i(this.f15295a);
            }
            while (nanos > 0) {
                Object obj3 = this.f15295a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC1459a = toString();
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
            throw new TimeoutException(str + " for " + abstractC1459a);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f15295a instanceof c;
    }

    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f15295a != null);
    }

    public void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        Object obj = this.f15295a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f15314b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i iVar) {
        iVar.f15316a = null;
        while (true) {
            i iVar2 = this.f15297c;
            if (iVar2 == i.f15315c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f15317b;
                if (iVar2.f15316a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f15317b = iVar4;
                    if (iVar3.f15316a == null) {
                        break;
                    }
                } else if (!f15293f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = f15294g;
        }
        if (!f15293f.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!f15293f.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean r(D6.g gVar) {
        d dVar;
        e(gVar);
        Object obj = this.f15295a;
        if (obj == null) {
            if (gVar.isDone()) {
                if (!f15293f.b(this, null, j(gVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar2 = new g(this, gVar);
            if (f15293f.b(this, null, gVar2)) {
                try {
                    gVar.c(gVar2, EnumC1460b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f15302b;
                    }
                    f15293f.b(this, gVar2, dVar);
                }
                return true;
            }
            obj = this.f15295a;
        }
        if (obj instanceof c) {
            gVar.cancel(((c) obj).f15300a);
        }
        return false;
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
                str = m();
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
            Object obj2 = this.f15295a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f15297c;
            if (iVar != i.f15315c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f15293f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15295a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f15297c;
                } while (iVar != i.f15315c);
            }
            return i(this.f15295a);
        }
        throw new InterruptedException();
    }
}
