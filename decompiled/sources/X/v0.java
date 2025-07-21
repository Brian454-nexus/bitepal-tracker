package X;

import F.AbstractC0335i0;
import F.H0;
import I.T0;
import android.view.Surface;
import e0.InterfaceC1229l;
import e0.InterfaceC1232o;
import java.util.Objects;
import java.util.concurrent.Executor;
import l0.AbstractC1728c;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5987a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5988b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1232o f5989c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1229l f5990d = null;

    /* renamed from: e, reason: collision with root package name */
    public Surface f5991e = null;

    /* renamed from: f, reason: collision with root package name */
    public H0 f5992f = null;

    /* renamed from: g, reason: collision with root package name */
    public Executor f5993g = null;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1229l.c.a f5994h = null;

    /* renamed from: i, reason: collision with root package name */
    public c f5995i = c.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    public D6.g f5996j = N.f.f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    public AbstractC1728c.a f5997k = null;

    /* renamed from: l, reason: collision with root package name */
    public D6.g f5998l = N.f.f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1728c.a f5999m = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {
        public a() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC1229l interfaceC1229l) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            AbstractC0335i0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            v0.this.r();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6001a;

        static {
            int[] iArr = new int[c.values().length];
            f6001a = iArr;
            try {
                iArr[c.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6001a[c.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6001a[c.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6001a[c.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6001a[c.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public v0(InterfaceC1232o interfaceC1232o, Executor executor, Executor executor2) {
        this.f5987a = executor2;
        this.f5988b = executor;
        this.f5989c = interfaceC1232o;
    }

    public static /* synthetic */ Object a(v0 v0Var, H0 h02, T0 t02, Z.g gVar, AbstractC0808q abstractC0808q, AbstractC1728c.a aVar) {
        v0Var.j(h02, t02, gVar, abstractC0808q, aVar);
        return "ConfigureVideoEncoderFuture " + v0Var;
    }

    public static /* synthetic */ Object d(v0 v0Var, AbstractC1728c.a aVar) {
        v0Var.f5997k = aVar;
        return "ReleasedFuture " + v0Var;
    }

    public static /* synthetic */ Object f(v0 v0Var, AbstractC1728c.a aVar) {
        v0Var.f5999m = aVar;
        return "ReadyToReleaseFuture " + v0Var;
    }

    public static /* synthetic */ void g(final v0 v0Var, AbstractC1728c.a aVar, H0 h02, final Surface surface) {
        Executor executor;
        v0Var.getClass();
        int i6 = b.f6001a[v0Var.f5995i.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                if (h02.p()) {
                    AbstractC0335i0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(h02, com.amazon.a.a.n.a.a.g.f11050a) + " is already serviced.");
                    aVar.c(null);
                    v0Var.h();
                    return;
                }
                v0Var.f5991e = surface;
                AbstractC0335i0.a("VideoEncoderSession", "provide surface: " + surface);
                h02.q(surface, v0Var.f5988b, new InterfaceC2343a() { // from class: X.o0
                    @Override // y0.InterfaceC2343a
                    public final void accept(Object obj) {
                        v0.this.o((H0.g) obj);
                    }
                });
                v0Var.f5995i = c.READY;
                aVar.c(v0Var.f5990d);
                return;
            }
            if (i6 == 3) {
                if (v0Var.f5994h != null && (executor = v0Var.f5993g) != null) {
                    executor.execute(new Runnable() { // from class: X.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            v0.this.f5994h.a(surface);
                        }
                    });
                }
                AbstractC0335i0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                return;
            }
            if (i6 != 4 && i6 != 5) {
                throw new IllegalStateException("State " + v0Var.f5995i + " is not handled");
            }
        }
        AbstractC0335i0.a("VideoEncoderSession", "Not provide surface in " + v0Var.f5995i);
        aVar.c(null);
    }

    public final void h() {
        int i6 = b.f6001a[this.f5995i.ordinal()];
        if (i6 == 1 || i6 == 2) {
            r();
            return;
        }
        if (i6 == 3 || i6 == 4) {
            AbstractC0335i0.a("VideoEncoderSession", "closeInternal in " + this.f5995i + " state");
            this.f5995i = c.PENDING_RELEASE;
            return;
        }
        if (i6 == 5) {
            AbstractC0335i0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f5995i + " is not handled");
    }

    public D6.g i(final H0 h02, final T0 t02, final AbstractC0808q abstractC0808q, final Z.g gVar) {
        if (b.f6001a[this.f5995i.ordinal()] != 1) {
            return N.f.f(new IllegalStateException("configure() shouldn't be called in " + this.f5995i));
        }
        this.f5995i = c.INITIALIZING;
        this.f5992f = h02;
        AbstractC0335i0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f5996j = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.r0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return v0.d(v0.this, aVar);
            }
        });
        this.f5998l = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.s0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return v0.f(v0.this, aVar);
            }
        });
        D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.t0
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return v0.a(v0.this, h02, t02, gVar, abstractC0808q, aVar);
            }
        });
        N.f.b(a6, new a(), this.f5988b);
        return N.f.i(a6);
    }

    public final void j(final H0 h02, T0 t02, Z.g gVar, AbstractC0808q abstractC0808q, final AbstractC1728c.a aVar) {
        F.C l6 = h02.l();
        try {
            InterfaceC1229l a6 = this.f5989c.a(this.f5987a, d0.k.c(d0.k.d(abstractC0808q, l6, gVar), t02, abstractC0808q.d(), h02.n(), l6, h02.m()));
            this.f5990d = a6;
            InterfaceC1229l.b b6 = a6.b();
            if (b6 instanceof InterfaceC1229l.c) {
                ((InterfaceC1229l.c) b6).c(this.f5988b, new InterfaceC1229l.c.a() { // from class: X.u0
                    @Override // e0.InterfaceC1229l.c.a
                    public final void a(Surface surface) {
                        v0.g(v0.this, aVar, h02, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (e0.i0 e6) {
            AbstractC0335i0.d("VideoEncoderSession", "Unable to initialize video encoder.", e6);
            aVar.f(e6);
        }
    }

    public Surface k() {
        if (this.f5995i != c.READY) {
            return null;
        }
        return this.f5991e;
    }

    public D6.g l() {
        return N.f.i(this.f5998l);
    }

    public InterfaceC1229l m() {
        return this.f5990d;
    }

    public boolean n(H0 h02) {
        int i6 = b.f6001a[this.f5995i.ordinal()];
        if (i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                if (this.f5992f == h02) {
                    return true;
                }
            } else if (i6 != 4 && i6 != 5) {
                throw new IllegalStateException("State " + this.f5995i + " is not handled");
            }
        }
        return false;
    }

    public final void o(H0.g gVar) {
        AbstractC0335i0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface b6 = gVar.b();
        if (b6 != this.f5991e) {
            b6.release();
            return;
        }
        this.f5991e = null;
        this.f5999m.c(this.f5990d);
        h();
    }

    public void p(Executor executor, InterfaceC1229l.c.a aVar) {
        this.f5993g = executor;
        this.f5994h = aVar;
    }

    public D6.g q() {
        h();
        return N.f.i(this.f5996j);
    }

    public void r() {
        int i6 = b.f6001a[this.f5995i.ordinal()];
        if (i6 == 1) {
            this.f5995i = c.RELEASED;
            return;
        }
        if (i6 != 2 && i6 != 3 && i6 != 4) {
            if (i6 != 5) {
                throw new IllegalStateException("State " + this.f5995i + " is not handled");
            }
            AbstractC0335i0.a("VideoEncoderSession", "terminateNow in " + this.f5995i + ", No-op");
            return;
        }
        this.f5995i = c.RELEASED;
        this.f5999m.c(this.f5990d);
        this.f5992f = null;
        if (this.f5990d == null) {
            AbstractC0335i0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f5997k.c(null);
            return;
        }
        AbstractC0335i0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f5990d);
        this.f5990d.release();
        this.f5990d.f().c(new Runnable() { // from class: X.q0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.f5997k.c(null);
            }
        }, this.f5988b);
        this.f5990d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f5992f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
