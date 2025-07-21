package a0;

import F.AbstractC0335i0;
import I.B0;
import Z.d;
import a0.C0989n;
import a0.InterfaceC0991p;
import android.content.Context;
import e0.f0;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC1728c;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0989n {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7573a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f7574b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7575c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0991p f7576d;

    /* renamed from: e, reason: collision with root package name */
    public final C0975E f7577e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7578f;

    /* renamed from: g, reason: collision with root package name */
    public f f7579g;

    /* renamed from: h, reason: collision with root package name */
    public d.a f7580h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7581i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f7582j;

    /* renamed from: k, reason: collision with root package name */
    public d f7583k;

    /* renamed from: l, reason: collision with root package name */
    public Z.d f7584l;

    /* renamed from: m, reason: collision with root package name */
    public N.c f7585m;

    /* renamed from: n, reason: collision with root package name */
    public B0.a f7586n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7587o;

    /* renamed from: p, reason: collision with root package name */
    public long f7588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7589q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7590r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f7591s;

    /* renamed from: t, reason: collision with root package name */
    public double f7592t;

    /* renamed from: u, reason: collision with root package name */
    public long f7593u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7594v;

    /* renamed from: a0.n$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements B0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z.d f7595a;

        public a(Z.d dVar) {
            this.f7595a = dVar;
        }

        @Override // I.B0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d.a aVar) {
            Objects.requireNonNull(aVar);
            if (C0989n.this.f7584l == this.f7595a) {
                AbstractC0335i0.a("AudioSource", "Receive BufferProvider state change: " + C0989n.this.f7580h + " to " + aVar);
                C0989n c0989n = C0989n.this;
                if (c0989n.f7580h != aVar) {
                    c0989n.f7580h = aVar;
                    c0989n.H();
                }
            }
        }

        @Override // I.B0.a
        public void onError(Throwable th) {
            C0989n c0989n = C0989n.this;
            if (c0989n.f7584l == this.f7595a) {
                c0989n.r(th);
            }
        }
    }

    /* renamed from: a0.n$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z.d f7597a;

        public b(Z.d dVar) {
            this.f7597a = dVar;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(f0 f0Var) {
            C0989n c0989n = C0989n.this;
            if (!c0989n.f7581i || c0989n.f7584l != this.f7597a) {
                f0Var.cancel();
                return;
            }
            if (c0989n.f7587o && c0989n.p()) {
                C0989n.this.y();
            }
            InterfaceC0991p m6 = C0989n.this.m();
            ByteBuffer e6 = f0Var.e();
            InterfaceC0991p.c read = m6.read(e6);
            if (read.a() > 0) {
                C0989n c0989n2 = C0989n.this;
                if (c0989n2.f7590r) {
                    c0989n2.u(e6, read.a());
                }
                if (C0989n.this.f7582j != null) {
                    long b6 = read.b();
                    C0989n c0989n3 = C0989n.this;
                    if (b6 - c0989n3.f7593u >= 200) {
                        c0989n3.f7593u = read.b();
                        C0989n.this.v(e6);
                    }
                }
                e6.limit(e6.position() + read.a());
                f0Var.d(TimeUnit.NANOSECONDS.toMicros(read.b()));
                f0Var.c();
            } else {
                AbstractC0335i0.l("AudioSource", "Unable to read data from AudioStream.");
                f0Var.cancel();
            }
            C0989n.this.z();
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (C0989n.this.f7584l != this.f7597a) {
                return;
            }
            AbstractC0335i0.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th instanceof IllegalStateException) {
                return;
            }
            C0989n.this.r(th);
        }
    }

    /* renamed from: a0.n$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7599a;

        static {
            int[] iArr = new int[f.values().length];
            f7599a = iArr;
            try {
                iArr[f.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7599a[f.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7599a[f.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a0.n$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        void a(boolean z6);

        default void b(boolean z6) {
        }

        void c(double d6);

        void onError(Throwable th);
    }

    /* renamed from: a0.n$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements InterfaceC0991p.a {
        public e() {
        }

        @Override // a0.InterfaceC0991p.a
        public void a(boolean z6) {
            C0989n c0989n = C0989n.this;
            c0989n.f7589q = z6;
            if (c0989n.f7579g == f.STARTED) {
                c0989n.s();
            }
        }
    }

    /* renamed from: a0.n$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum f {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public C0989n(AbstractC0976a abstractC0976a, Executor executor, Context context) {
        this(abstractC0976a, executor, context, new InterfaceC0992q() { // from class: a0.h
            @Override // a0.InterfaceC0992q
            public final InterfaceC0991p a(AbstractC0976a abstractC0976a2, Context context2) {
                return new C0994s(abstractC0976a2, context2);
            }
        }, 3000L);
    }

    public static /* synthetic */ Object a(final C0989n c0989n, final AbstractC1728c.a aVar) {
        c0989n.f7573a.execute(new Runnable() { // from class: a0.k
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.f(C0989n.this, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(C0989n c0989n, Executor executor, d dVar) {
        c0989n.getClass();
        int i6 = c.f7599a[c0989n.f7579g.ordinal()];
        if (i6 == 1) {
            c0989n.f7582j = executor;
            c0989n.f7583k = dVar;
        } else if (i6 == 2 || i6 == 3) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(C0989n c0989n, Z.d dVar) {
        c0989n.getClass();
        int i6 = c.f7599a[c0989n.f7579g.ordinal()];
        if (i6 != 1 && i6 != 2) {
            if (i6 == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (c0989n.f7584l != dVar) {
            c0989n.x(dVar);
        }
    }

    public static /* synthetic */ void e(C0989n c0989n, boolean z6) {
        c0989n.getClass();
        int i6 = c.f7599a[c0989n.f7579g.ordinal()];
        if (i6 != 1 && i6 != 2) {
            if (i6 == 3) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (c0989n.f7590r == z6) {
                return;
            }
            c0989n.f7590r = z6;
            if (c0989n.f7579g == f.STARTED) {
                c0989n.s();
            }
        }
    }

    public static /* synthetic */ void f(C0989n c0989n, AbstractC1728c.a aVar) {
        c0989n.getClass();
        try {
            int i6 = c.f7599a[c0989n.f7579g.ordinal()];
            if (i6 == 1 || i6 == 2) {
                c0989n.x(null);
                c0989n.f7577e.release();
                c0989n.f7576d.release();
                c0989n.G();
                c0989n.C(f.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    public static /* synthetic */ void g(C0989n c0989n) {
        c0989n.getClass();
        int i6 = c.f7599a[c0989n.f7579g.ordinal()];
        if (i6 == 2) {
            c0989n.C(f.CONFIGURED);
            c0989n.H();
        } else {
            if (i6 != 3) {
                return;
            }
            AbstractC0335i0.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public static /* synthetic */ void k(C0989n c0989n, boolean z6) {
        c0989n.getClass();
        int i6 = c.f7599a[c0989n.f7579g.ordinal()];
        if (i6 != 1) {
            if (i6 == 3) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        c0989n.f7574b.set(null);
        c0989n.f7575c.set(false);
        c0989n.C(f.STARTED);
        c0989n.q(z6);
        c0989n.H();
    }

    public static d.a l(Z.d dVar) {
        try {
            D6.g d6 = dVar.d();
            if (d6.isDone()) {
                return (d.a) d6.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i6, int i7, int i8) {
        return C0994s.i(i6, i7, i8);
    }

    public void A(final Executor executor, final d dVar) {
        this.f7573a.execute(new Runnable() { // from class: a0.l
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.b(C0989n.this, executor, dVar);
            }
        });
    }

    public void B(final Z.d dVar) {
        this.f7573a.execute(new Runnable() { // from class: a0.g
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.d(C0989n.this, dVar);
            }
        });
    }

    public void C(f fVar) {
        AbstractC0335i0.a("AudioSource", "Transitioning internal state: " + this.f7579g + " --> " + fVar);
        this.f7579g = fVar;
    }

    public void D(final boolean z6) {
        this.f7573a.execute(new Runnable() { // from class: a0.f
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.k(C0989n.this, z6);
            }
        });
    }

    public final void E() {
        if (this.f7581i) {
            return;
        }
        try {
            AbstractC0335i0.a("AudioSource", "startSendingAudio");
            this.f7576d.start();
            this.f7587o = false;
        } catch (InterfaceC0991p.b e6) {
            AbstractC0335i0.m("AudioSource", "Failed to start AudioStream", e6);
            this.f7587o = true;
            this.f7577e.start();
            this.f7588p = n();
            s();
        }
        this.f7581i = true;
        z();
    }

    public void F() {
        this.f7573a.execute(new Runnable() { // from class: a0.b
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.g(C0989n.this);
            }
        });
    }

    public final void G() {
        if (this.f7581i) {
            this.f7581i = false;
            AbstractC0335i0.a("AudioSource", "stopSendingAudio");
            this.f7576d.stop();
        }
    }

    public void H() {
        if (this.f7579g != f.STARTED) {
            G();
            return;
        }
        boolean z6 = this.f7580h == d.a.ACTIVE;
        t(!z6);
        if (z6) {
            E();
        } else {
            G();
        }
    }

    public InterfaceC0991p m() {
        return this.f7587o ? this.f7577e : this.f7576d;
    }

    public boolean p() {
        y0.g.h(this.f7588p > 0);
        return n() - this.f7588p >= this.f7578f;
    }

    public void q(final boolean z6) {
        this.f7573a.execute(new Runnable() { // from class: a0.i
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.e(C0989n.this, z6);
            }
        });
    }

    public void r(final Throwable th) {
        Executor executor = this.f7582j;
        final d dVar = this.f7583k;
        if (executor == null || dVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: a0.d
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.d.this.onError(th);
            }
        });
    }

    public void s() {
        Executor executor = this.f7582j;
        final d dVar = this.f7583k;
        if (executor == null || dVar == null) {
            return;
        }
        final boolean z6 = this.f7590r || this.f7587o || this.f7589q;
        if (Objects.equals(this.f7574b.getAndSet(Boolean.valueOf(z6)), Boolean.valueOf(z6))) {
            return;
        }
        executor.execute(new Runnable() { // from class: a0.j
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.d.this.a(z6);
            }
        });
    }

    public void t(final boolean z6) {
        Executor executor = this.f7582j;
        final d dVar = this.f7583k;
        if (executor == null || dVar == null || this.f7575c.getAndSet(z6) == z6) {
            return;
        }
        executor.execute(new Runnable() { // from class: a0.c
            @Override // java.lang.Runnable
            public final void run() {
                C0989n.d.this.b(z6);
            }
        });
    }

    public void u(ByteBuffer byteBuffer, int i6) {
        byte[] bArr = this.f7591s;
        if (bArr == null || bArr.length < i6) {
            this.f7591s = new byte[i6];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f7591s, 0, i6);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    public void v(ByteBuffer byteBuffer) {
        Executor executor = this.f7582j;
        final d dVar = this.f7583k;
        if (this.f7594v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d6 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d6 = Math.max(d6, Math.abs((int) asShortBuffer.get()));
            }
            this.f7592t = d6 / 32767.0d;
            if (executor == null || dVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: a0.m
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.c(C0989n.this.f7592t);
                }
            });
        }
    }

    public D6.g w() {
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: a0.e
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return C0989n.a(C0989n.this, aVar);
            }
        });
    }

    public final void x(Z.d dVar) {
        Z.d dVar2 = this.f7584l;
        if (dVar2 != null) {
            B0.a aVar = this.f7586n;
            Objects.requireNonNull(aVar);
            dVar2.e(aVar);
            this.f7584l = null;
            this.f7586n = null;
            this.f7585m = null;
            this.f7580h = d.a.INACTIVE;
            H();
        }
        if (dVar != null) {
            this.f7584l = dVar;
            this.f7586n = new a(dVar);
            this.f7585m = new b(dVar);
            d.a l6 = l(dVar);
            if (l6 != null) {
                this.f7580h = l6;
                H();
            }
            this.f7584l.b(this.f7573a, this.f7586n);
        }
    }

    public void y() {
        y0.g.h(this.f7587o);
        try {
            this.f7576d.start();
            AbstractC0335i0.a("AudioSource", "Retry start AudioStream succeed");
            this.f7577e.stop();
            this.f7587o = false;
        } catch (InterfaceC0991p.b e6) {
            AbstractC0335i0.m("AudioSource", "Retry start AudioStream failed", e6);
            this.f7588p = n();
        }
    }

    public void z() {
        Z.d dVar = this.f7584l;
        Objects.requireNonNull(dVar);
        D6.g a6 = dVar.a();
        N.c cVar = this.f7585m;
        Objects.requireNonNull(cVar);
        N.f.b(a6, cVar, this.f7573a);
    }

    public C0989n(AbstractC0976a abstractC0976a, Executor executor, Context context, InterfaceC0992q interfaceC0992q, long j6) {
        this.f7574b = new AtomicReference(null);
        this.f7575c = new AtomicBoolean(false);
        this.f7579g = f.CONFIGURED;
        this.f7580h = d.a.INACTIVE;
        this.f7593u = 0L;
        Executor g6 = M.c.g(executor);
        this.f7573a = g6;
        this.f7578f = TimeUnit.MILLISECONDS.toNanos(j6);
        try {
            C0973C c0973c = new C0973C(interfaceC0992q.a(abstractC0976a, context), abstractC0976a);
            this.f7576d = c0973c;
            c0973c.a(new e(), g6);
            this.f7577e = new C0975E(abstractC0976a);
            this.f7594v = abstractC0976a.b();
        } catch (InterfaceC0991p.b | IllegalArgumentException e6) {
            throw new C0990o("Unable to create AudioStream", e6);
        }
    }
}
