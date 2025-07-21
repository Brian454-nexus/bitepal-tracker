package I;

import F.AbstractC0335i0;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class W {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f2361k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f2362l = AbstractC0335i0.f("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f2363m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f2364n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2365a;

    /* renamed from: b, reason: collision with root package name */
    public int f2366b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2367c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1728c.a f2368d;

    /* renamed from: e, reason: collision with root package name */
    public final D6.g f2369e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1728c.a f2370f;

    /* renamed from: g, reason: collision with root package name */
    public final D6.g f2371g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f2372h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2373i;

    /* renamed from: j, reason: collision with root package name */
    public Class f2374j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public W f2375a;

        public a(String str, W w6) {
            super(str);
            this.f2375a = w6;
        }

        public W a() {
            return this.f2375a;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public W() {
        this(f2361k, 0);
    }

    public static /* synthetic */ Object a(W w6, AbstractC1728c.a aVar) {
        synchronized (w6.f2365a) {
            w6.f2368d = aVar;
        }
        return "DeferrableSurface-termination(" + w6 + ")";
    }

    public static /* synthetic */ Object b(W w6, AbstractC1728c.a aVar) {
        synchronized (w6.f2365a) {
            w6.f2370f = aVar;
        }
        return "DeferrableSurface-close(" + w6 + ")";
    }

    public static /* synthetic */ void c(W w6, String str) {
        w6.getClass();
        try {
            w6.f2369e.get();
            w6.n("Surface terminated", f2364n.decrementAndGet(), f2363m.get());
        } catch (Exception e6) {
            AbstractC0335i0.c("DeferrableSurface", "Unexpected surface termination for " + w6 + "\nStack Trace:\n" + str);
            synchronized (w6.f2365a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", w6, Boolean.valueOf(w6.f2367c), Integer.valueOf(w6.f2366b)), e6);
            }
        }
    }

    public void d() {
        AbstractC1728c.a aVar;
        synchronized (this.f2365a) {
            try {
                if (this.f2367c) {
                    aVar = null;
                } else {
                    this.f2367c = true;
                    this.f2370f.c(null);
                    if (this.f2366b == 0) {
                        aVar = this.f2368d;
                        this.f2368d = null;
                    } else {
                        aVar = null;
                    }
                    if (AbstractC0335i0.f("DeferrableSurface")) {
                        AbstractC0335i0.a("DeferrableSurface", "surface closed,  useCount=" + this.f2366b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        AbstractC1728c.a aVar;
        synchronized (this.f2365a) {
            try {
                int i6 = this.f2366b;
                if (i6 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i7 = i6 - 1;
                this.f2366b = i7;
                if (i7 == 0 && this.f2367c) {
                    aVar = this.f2368d;
                    this.f2368d = null;
                } else {
                    aVar = null;
                }
                if (AbstractC0335i0.f("DeferrableSurface")) {
                    AbstractC0335i0.a("DeferrableSurface", "use count-1,  useCount=" + this.f2366b + " closed=" + this.f2367c + " " + this);
                    if (this.f2366b == 0) {
                        n("Surface no longer in use", f2364n.get(), f2363m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public D6.g f() {
        return N.f.i(this.f2371g);
    }

    public Class g() {
        return this.f2374j;
    }

    public Size h() {
        return this.f2372h;
    }

    public int i() {
        return this.f2373i;
    }

    public final D6.g j() {
        synchronized (this.f2365a) {
            try {
                if (this.f2367c) {
                    return N.f.f(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public D6.g k() {
        return N.f.i(this.f2369e);
    }

    public void l() {
        synchronized (this.f2365a) {
            try {
                int i6 = this.f2366b;
                if (i6 == 0 && this.f2367c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f2366b = i6 + 1;
                if (AbstractC0335i0.f("DeferrableSurface")) {
                    if (this.f2366b == 1) {
                        n("New surface in use", f2364n.get(), f2363m.incrementAndGet());
                    }
                    AbstractC0335i0.a("DeferrableSurface", "use count+1, useCount=" + this.f2366b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z6;
        synchronized (this.f2365a) {
            z6 = this.f2367c;
        }
        return z6;
    }

    public final void n(String str, int i6, int i7) {
        if (!f2362l && AbstractC0335i0.f("DeferrableSurface")) {
            AbstractC0335i0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC0335i0.a("DeferrableSurface", str + "[total_surfaces=" + i6 + ", used_surfaces=" + i7 + "](" + this + "}");
    }

    public abstract D6.g o();

    public void p(Class cls) {
        this.f2374j = cls;
    }

    public W(Size size, int i6) {
        this.f2365a = new Object();
        this.f2366b = 0;
        this.f2367c = false;
        this.f2372h = size;
        this.f2373i = i6;
        D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: I.T
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return W.a(W.this, aVar);
            }
        });
        this.f2369e = a6;
        this.f2371g = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: I.U
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return W.b(W.this, aVar);
            }
        });
        if (AbstractC0335i0.f("DeferrableSurface")) {
            n("Surface created", f2364n.incrementAndGet(), f2363m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a6.c(new Runnable() { // from class: I.V
                @Override // java.lang.Runnable
                public final void run() {
                    W.c(W.this, stackTraceString);
                }
            }, M.c.b());
        }
    }
}
