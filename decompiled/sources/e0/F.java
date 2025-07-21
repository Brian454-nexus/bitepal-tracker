package e0;

import F.AbstractC0335i0;
import I.B0;
import I.T0;
import Z.d;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import c0.AbstractC1104f;
import c0.C1099a;
import c0.C1102d;
import c0.C1106h;
import e0.F;
import e0.InterfaceC1229l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class F implements InterfaceC1229l {

    /* renamed from: E, reason: collision with root package name */
    public static final Range f13603E;

    /* renamed from: D, reason: collision with root package name */
    public final g0.b f13607D;

    /* renamed from: a, reason: collision with root package name */
    public final String f13608a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13610c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f13611d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec f13612e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1229l.b f13613f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f13614g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f13615h;

    /* renamed from: i, reason: collision with root package name */
    public final D6.g f13616i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1728c.a f13617j;

    /* renamed from: p, reason: collision with root package name */
    public final T0 f13623p;

    /* renamed from: t, reason: collision with root package name */
    public e f13627t;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13609b = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final Queue f13618k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    public final Queue f13619l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final Set f13620m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final Set f13621n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final Deque f13622o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public final l0 f13624q = new k0();

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1230m f13625r = InterfaceC1230m.f13770a;

    /* renamed from: s, reason: collision with root package name */
    public Executor f13626s = M.c.b();

    /* renamed from: u, reason: collision with root package name */
    public Range f13628u = f13603E;

    /* renamed from: v, reason: collision with root package name */
    public long f13629v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13630w = false;

    /* renamed from: x, reason: collision with root package name */
    public Long f13631x = null;

    /* renamed from: y, reason: collision with root package name */
    public Future f13632y = null;

    /* renamed from: z, reason: collision with root package name */
    public f f13633z = null;

    /* renamed from: A, reason: collision with root package name */
    public boolean f13604A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13605B = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13606C = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: e0.F$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class C0191a implements N.c {
            public C0191a() {
            }

            @Override // N.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r12) {
            }

            @Override // N.c
            public void onFailure(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    F.this.E((MediaCodec.CodecException) th);
                } else {
                    F.this.D(0, th.getMessage(), th);
                }
            }
        }

        public a() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(f0 f0Var) {
            f0Var.d(F.this.B());
            f0Var.b(true);
            f0Var.c();
            N.f.b(f0Var.a(), new C0191a(), F.this.f13615h);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            F.this.D(0, "Unable to acquire InputBuffer.", th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13636a;

        static {
            int[] iArr = new int[e.values().length];
            f13636a = iArr;
            try {
                iArr[e.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13636a[e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13636a[e.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13636a[e.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13636a[e.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13636a[e.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13636a[e.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13636a[e.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13636a[e.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        @NonNull
        public static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void b(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements InterfaceC1229l.a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f13637a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public d.a f13638b = d.a.INACTIVE;

        /* renamed from: c, reason: collision with root package name */
        public final List f13639c = new ArrayList();

        public d() {
        }

        public static /* synthetic */ Object h(final d dVar, final AbstractC1728c.a aVar) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.M
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(F.d.this.f13638b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(d dVar, final B0.a aVar, Executor executor) {
            dVar.f13637a.put((B0.a) y0.g.f(aVar), (Executor) y0.g.f(executor));
            final d.a aVar2 = dVar.f13638b;
            executor.execute(new Runnable() { // from class: e0.P
                @Override // java.lang.Runnable
                public final void run() {
                    B0.a.this.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final d dVar, final AbstractC1728c.a aVar) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.O
                @Override // java.lang.Runnable
                public final void run() {
                    F.d.n(F.d.this, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final d dVar, AbstractC1728c.a aVar) {
            d.a aVar2 = dVar.f13638b;
            if (aVar2 == d.a.ACTIVE) {
                final D6.g y6 = F.this.y();
                N.f.j(y6, aVar);
                aVar.a(new Runnable() { // from class: e0.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.d.this.p(y6);
                    }
                }, M.c.b());
                dVar.f13639c.add(y6);
                y6.c(new Runnable() { // from class: e0.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.d.this.f13639c.remove(y6);
                    }
                }, F.this.f13615h);
                return;
            }
            if (aVar2 == d.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + dVar.f13638b));
        }

        @Override // Z.d
        public D6.g a() {
            return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.L
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return F.d.m(F.d.this, aVar);
                }
            });
        }

        @Override // I.B0
        public void b(final Executor executor, final B0.a aVar) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.K
                @Override // java.lang.Runnable
                public final void run() {
                    F.d.i(F.d.this, aVar, executor);
                }
            });
        }

        @Override // I.B0
        public D6.g d() {
            return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.I
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return F.d.h(F.d.this, aVar);
                }
            });
        }

        @Override // I.B0
        public void e(final B0.a aVar) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.N
                @Override // java.lang.Runnable
                public final void run() {
                    F.d.this.f13637a.remove(y0.g.f(aVar));
                }
            });
        }

        public final void p(D6.g gVar) {
            if (gVar.cancel(true)) {
                return;
            }
            y0.g.h(gVar.isDone());
            try {
                ((f0) gVar.get()).cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e6) {
                AbstractC0335i0.l(F.this.f13608a, "Unable to cancel the input buffer: " + e6);
            }
        }

        public void q(boolean z6) {
            final d.a aVar = z6 ? d.a.ACTIVE : d.a.INACTIVE;
            if (this.f13638b == aVar) {
                return;
            }
            this.f13638b = aVar;
            if (aVar == d.a.INACTIVE) {
                Iterator it = this.f13639c.iterator();
                while (it.hasNext()) {
                    ((D6.g) it.next()).cancel(true);
                }
                this.f13639c.clear();
            }
            for (final Map.Entry entry : this.f13637a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: e0.J
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((B0.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum e {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final g0.e f13651a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13652b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13653c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13654d = false;

        /* renamed from: e, reason: collision with root package name */
        public long f13655e = 0;

        /* renamed from: f, reason: collision with root package name */
        public long f13656f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f13657g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f13658h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f13659i = false;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements N.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1228k f13661a;

            public a(C1228k c1228k) {
                this.f13661a = c1228k;
            }

            @Override // N.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                F.this.f13621n.remove(this.f13661a);
            }

            @Override // N.c
            public void onFailure(Throwable th) {
                F.this.f13621n.remove(this.f13661a);
                if (th instanceof MediaCodec.CodecException) {
                    F.this.E((MediaCodec.CodecException) th);
                } else {
                    F.this.D(0, th.getMessage(), th);
                }
            }
        }

        public f() {
            T0 t02 = null;
            if (!F.this.f13610c) {
                this.f13651a = null;
                return;
            }
            if (AbstractC1104f.a(C1102d.class) != null) {
                AbstractC0335i0.l(F.this.f13608a, "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                t02 = F.this.f13623p;
            }
            this.f13651a = new g0.e(F.this.f13624q, t02);
        }

        public static /* synthetic */ void a(final f fVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i6) {
            final InterfaceC1230m interfaceC1230m;
            final Executor executor;
            if (fVar.f13659i) {
                AbstractC0335i0.l(F.this.f13608a, "Receives frame after codec is reset.");
                return;
            }
            switch (b.f13636a[F.this.f13627t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (F.this.f13609b) {
                        F f6 = F.this;
                        interfaceC1230m = f6.f13625r;
                        executor = f6.f13626s;
                    }
                    if (!fVar.f13652b) {
                        fVar.f13652b = true;
                        try {
                            Objects.requireNonNull(interfaceC1230m);
                            executor.execute(new Runnable() { // from class: e0.W
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC1230m.this.b();
                                }
                            });
                        } catch (RejectedExecutionException e6) {
                            AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
                        }
                    }
                    if (fVar.i(bufferInfo)) {
                        if (!fVar.f13653c) {
                            fVar.f13653c = true;
                            AbstractC0335i0.a(F.this.f13608a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + F.this.f13623p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo l6 = fVar.l(bufferInfo);
                        fVar.f13656f = l6.presentationTimeUs;
                        try {
                            fVar.m(new C1228k(mediaCodec, i6, l6), interfaceC1230m, executor);
                        } catch (MediaCodec.CodecException e7) {
                            F.this.E(e7);
                            return;
                        }
                    } else if (i6 != -9999) {
                        try {
                            F.this.f13612e.releaseOutputBuffer(i6, false);
                        } catch (MediaCodec.CodecException e8) {
                            F.this.E(e8);
                            return;
                        }
                    }
                    if (fVar.f13654d || !fVar.j(bufferInfo)) {
                        return;
                    }
                    fVar.f13654d = true;
                    F.this.T(new Runnable() { // from class: e0.X
                        @Override // java.lang.Runnable
                        public final void run() {
                            F.f.e(F.f.this, executor, interfaceC1230m);
                        }
                    });
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + F.this.f13627t);
            }
        }

        public static /* synthetic */ MediaFormat b(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void e(f fVar, Executor executor, final InterfaceC1230m interfaceC1230m) {
            if (F.this.f13627t == e.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC1230m);
                executor.execute(new Runnable() { // from class: e0.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1230m.this.d();
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
            }
        }

        public static /* synthetic */ void f(f fVar, final MediaFormat mediaFormat) {
            final InterfaceC1230m interfaceC1230m;
            Executor executor;
            if (fVar.f13659i) {
                AbstractC0335i0.l(F.this.f13608a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (b.f13636a[F.this.f13627t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (F.this.f13609b) {
                        F f6 = F.this;
                        interfaceC1230m = f6.f13625r;
                        executor = f6.f13626s;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: e0.Y
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC1230m.this.a(new j0() { // from class: e0.b0
                                    @Override // e0.j0
                                    public final MediaFormat a() {
                                        return F.f.b(r1);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e6) {
                        AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + F.this.f13627t);
            }
        }

        public static /* synthetic */ void g(f fVar, int i6) {
            if (fVar.f13659i) {
                AbstractC0335i0.l(F.this.f13608a, "Receives input frame after codec is reset.");
                return;
            }
            switch (b.f13636a[F.this.f13627t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    F.this.f13618k.offer(Integer.valueOf(i6));
                    F.this.J();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + F.this.f13627t);
            }
        }

        public static /* synthetic */ void h(f fVar, MediaCodec.CodecException codecException) {
            fVar.getClass();
            switch (b.f13636a[F.this.f13627t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    F.this.E(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + F.this.f13627t);
            }
        }

        public final boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f13654d) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by codec config.");
                return false;
            }
            g0.e eVar = this.f13651a;
            if (eVar != null) {
                bufferInfo.presentationTimeUs = eVar.b(bufferInfo.presentationTimeUs);
            }
            long j6 = bufferInfo.presentationTimeUs;
            if (j6 <= this.f13655e) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f13655e = j6;
            if (!F.this.f13628u.contains((Range) Long.valueOf(j6))) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by not in start-stop range.");
                F f6 = F.this;
                if (f6.f13630w && bufferInfo.presentationTimeUs >= ((Long) f6.f13628u.getUpper()).longValue()) {
                    Future future = F.this.f13632y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    F.this.f13631x = Long.valueOf(bufferInfo.presentationTimeUs);
                    F.this.Q();
                    F.this.f13630w = false;
                }
                return false;
            }
            if (o(bufferInfo)) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by pause.");
                return false;
            }
            if (F.this.C(bufferInfo) <= this.f13656f) {
                AbstractC0335i0.a(F.this.f13608a, "Drop buffer by adjusted time is less than the last sent time.");
                if (F.this.f13610c && F.I(bufferInfo)) {
                    this.f13658h = true;
                }
                return false;
            }
            if (!this.f13653c && !this.f13658h && F.this.f13610c) {
                this.f13658h = true;
            }
            if (this.f13658h) {
                if (!F.I(bufferInfo)) {
                    AbstractC0335i0.a(F.this.f13608a, "Drop buffer by not a key frame.");
                    F.this.M();
                    return false;
                }
                this.f13658h = false;
            }
            return true;
        }

        public final boolean j(MediaCodec.BufferInfo bufferInfo) {
            return F.G(bufferInfo) || k(bufferInfo);
        }

        public final boolean k(MediaCodec.BufferInfo bufferInfo) {
            F f6 = F.this;
            return f6.f13606C && bufferInfo.presentationTimeUs > ((Long) f6.f13628u.getUpper()).longValue();
        }

        public final MediaCodec.BufferInfo l(MediaCodec.BufferInfo bufferInfo) {
            long C6 = F.this.C(bufferInfo);
            if (bufferInfo.presentationTimeUs == C6) {
                return bufferInfo;
            }
            y0.g.h(C6 > this.f13656f);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, C6, bufferInfo.flags);
            return bufferInfo2;
        }

        public final void m(final C1228k c1228k, final InterfaceC1230m interfaceC1230m, Executor executor) {
            F.this.f13621n.add(c1228k);
            N.f.b(c1228k.c(), new a(c1228k), F.this.f13615h);
            try {
                executor.execute(new Runnable() { // from class: e0.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1230m.this.e(c1228k);
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
                c1228k.close();
            }
        }

        public void n() {
            this.f13659i = true;
        }

        public final boolean o(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC1230m interfaceC1230m;
            F.this.U(bufferInfo.presentationTimeUs);
            boolean H6 = F.this.H(bufferInfo.presentationTimeUs);
            boolean z6 = this.f13657g;
            if (!z6 && H6) {
                AbstractC0335i0.a(F.this.f13608a, "Switch to pause state");
                this.f13657g = true;
                synchronized (F.this.f13609b) {
                    F f6 = F.this;
                    executor = f6.f13626s;
                    interfaceC1230m = f6.f13625r;
                }
                Objects.requireNonNull(interfaceC1230m);
                executor.execute(new Runnable() { // from class: e0.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1230m.this.f();
                    }
                });
                F f7 = F.this;
                if (f7.f13627t == e.PAUSED && ((f7.f13610c || AbstractC1104f.a(C1099a.class) == null) && (!F.this.f13610c || AbstractC1104f.a(c0.t.class) == null))) {
                    InterfaceC1229l.b bVar = F.this.f13613f;
                    if (bVar instanceof d) {
                        ((d) bVar).q(false);
                    }
                    F.this.O(true);
                }
                F.this.f13631x = Long.valueOf(bufferInfo.presentationTimeUs);
                F f8 = F.this;
                if (f8.f13630w) {
                    Future future = f8.f13632y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    F.this.Q();
                    F.this.f13630w = false;
                }
            } else if (z6 && !H6) {
                AbstractC0335i0.a(F.this.f13608a, "Switch to resume state");
                this.f13657g = false;
                if (F.this.f13610c && !F.I(bufferInfo)) {
                    this.f13658h = true;
                }
            }
            return this.f13657g;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.U
                @Override // java.lang.Runnable
                public final void run() {
                    F.f.h(F.f.this, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i6) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.Q
                @Override // java.lang.Runnable
                public final void run() {
                    F.f.g(F.f.this, i6);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i6, final MediaCodec.BufferInfo bufferInfo) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.T
                @Override // java.lang.Runnable
                public final void run() {
                    F.f.a(F.f.this, bufferInfo, mediaCodec, i6);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            F.this.f13615h.execute(new Runnable() { // from class: e0.V
                @Override // java.lang.Runnable
                public final void run() {
                    F.f.f(F.f.this, mediaFormat);
                }
            });
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements InterfaceC1229l.c {

        /* renamed from: b, reason: collision with root package name */
        public Surface f13664b;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1229l.c.a f13666d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f13667e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f13663a = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final Set f13665c = new HashSet();

        public g() {
        }

        public final void b(Executor executor, final InterfaceC1229l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: e0.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1229l.c.a.this.a(surface);
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d(F.this.f13608a, "Unable to post to the supplied executor.", e6);
            }
        }

        @Override // e0.InterfaceC1229l.c
        public void c(Executor executor, InterfaceC1229l.c.a aVar) {
            Surface surface;
            synchronized (this.f13663a) {
                this.f13666d = (InterfaceC1229l.c.a) y0.g.f(aVar);
                this.f13667e = (Executor) y0.g.f(executor);
                surface = this.f13664b;
            }
            if (surface != null) {
                b(executor, aVar, surface);
            }
        }

        public void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f13663a) {
                surface = this.f13664b;
                this.f13664b = null;
                hashSet = new HashSet(this.f13665c);
                this.f13665c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        public void e() {
            Surface createInputSurface;
            InterfaceC1229l.c.a aVar;
            Executor executor;
            C1106h c1106h = (C1106h) AbstractC1104f.a(C1106h.class);
            synchronized (this.f13663a) {
                try {
                    if (c1106h == null) {
                        if (this.f13664b == null) {
                            createInputSurface = c.a();
                            this.f13664b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        c.b(F.this.f13612e, this.f13664b);
                    } else {
                        Surface surface = this.f13664b;
                        if (surface != null) {
                            this.f13665c.add(surface);
                        }
                        createInputSurface = F.this.f13612e.createInputSurface();
                        this.f13664b = createInputSurface;
                    }
                    aVar = this.f13666d;
                    executor = this.f13667e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (createInputSurface == null || aVar == null || executor == null) {
                return;
            }
            b(executor, aVar, createInputSurface);
        }
    }

    static {
        Long valueOf = Long.valueOf(LongCompanionObject.MAX_VALUE);
        f13603E = Range.create(valueOf, valueOf);
    }

    public F(Executor executor, InterfaceC1231n interfaceC1231n) {
        g0.b bVar = new g0.b();
        this.f13607D = bVar;
        y0.g.f(executor);
        y0.g.f(interfaceC1231n);
        this.f13615h = M.c.g(executor);
        if (interfaceC1231n instanceof AbstractC1218a) {
            this.f13608a = "AudioEncoder";
            this.f13610c = false;
            this.f13613f = new d();
        } else {
            if (!(interfaceC1231n instanceof m0)) {
                throw new i0("Unknown encoder config type");
            }
            this.f13608a = "VideoEncoder";
            this.f13610c = true;
            this.f13613f = new g();
        }
        T0 b6 = interfaceC1231n.b();
        this.f13623p = b6;
        AbstractC0335i0.a(this.f13608a, "mInputTimebase = " + b6);
        MediaFormat a6 = interfaceC1231n.a();
        this.f13611d = a6;
        AbstractC0335i0.a(this.f13608a, "mMediaFormat = " + a6);
        MediaCodec a7 = bVar.a(a6);
        this.f13612e = a7;
        AbstractC0335i0.e(this.f13608a, "Selected encoder: " + a7.getName());
        d0 A6 = A(this.f13610c, a7.getCodecInfo(), interfaceC1231n.c());
        this.f13614g = A6;
        if (this.f13610c) {
            z((o0) A6, a6);
        }
        try {
            N();
            final AtomicReference atomicReference = new AtomicReference();
            this.f13616i = N.f.i(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.B
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return F.v(atomicReference, aVar);
                }
            }));
            this.f13617j = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
            P(e.CONFIGURED);
        } catch (MediaCodec.CodecException e6) {
            throw new i0(e6);
        }
    }

    public static d0 A(boolean z6, MediaCodecInfo mediaCodecInfo, String str) {
        return z6 ? new p0(mediaCodecInfo, str) : new C1219b(mediaCodecInfo, str);
    }

    public static boolean G(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    public static boolean I(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    public static /* synthetic */ void i(F f6) {
        if (f6.f13630w) {
            AbstractC0335i0.l(f6.f13608a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            f6.f13631x = null;
            f6.Q();
            f6.f13630w = false;
        }
    }

    public static /* synthetic */ void l(F f6, List list, Runnable runnable) {
        if (f6.f13627t != e.ERROR) {
            if (!list.isEmpty()) {
                AbstractC0335i0.a(f6.f13608a, "encoded data and input buffers are returned");
            }
            if (!(f6.f13613f instanceof g) || f6.f13605B) {
                f6.f13612e.stop();
            } else {
                f6.f13612e.flush();
                f6.f13604A = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        f6.F();
    }

    public static /* synthetic */ void m(F f6) {
        f6.getClass();
        int i6 = b.f13636a[f6.f13627t.ordinal()];
        if (i6 == 2) {
            f6.M();
        } else if (i6 == 7 || i6 == 9) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void o(F f6, long j6) {
        f6.getClass();
        switch (b.f13636a[f6.f13627t.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                AbstractC0335i0.a(f6.f13608a, "Pause on " + Z.e.j(j6));
                f6.f13622o.addLast(Range.create(Long.valueOf(j6), Long.valueOf(LongCompanionObject.MAX_VALUE)));
                f6.P(e.PAUSED);
                return;
            case 6:
                f6.P(e.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + f6.f13627t);
        }
    }

    public static /* synthetic */ void r(F f6) {
        f6.f13605B = true;
        if (f6.f13604A) {
            f6.f13612e.stop();
            f6.N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void t(final e0.F r6, long r7, long r9) {
        /*
            r6.getClass()
            int[] r0 = e0.F.b.f13636a
            e0.F$e r1 = r6.f13627t
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lc1;
                case 2: goto L37;
                case 3: goto L37;
                case 4: goto Lc1;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L29;
                case 8: goto Lc1;
                case 9: goto L29;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown state: "
            r8.append(r9)
            e0.F$e r6 = r6.f13627t
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Encoder is released"
            r6.<init>(r7)
            throw r6
        L31:
            e0.F$e r7 = e0.F.e.CONFIGURED
            r6.P(r7)
            return
        L37:
            e0.F$e r0 = r6.f13627t
            e0.F$e r1 = e0.F.e.STOPPING
            r6.P(r1)
            android.util.Range r1 = r6.f13628u
            java.lang.Comparable r1 = r1.getLower()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto Lb9
            r4 = -1
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L5a
            goto L65
        L5a:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L66
            java.lang.String r7 = r6.f13608a
            java.lang.String r8 = "The expected stop time is less than the start time. Use current time as stop time."
            F.AbstractC0335i0.l(r7, r8)
        L65:
            r7 = r9
        L66:
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto Lb1
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            android.util.Range r9 = android.util.Range.create(r1, r9)
            r6.f13628u = r9
            java.lang.String r9 = r6.f13608a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Stop on "
            r10.append(r1)
            java.lang.String r7 = Z.e.j(r7)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            F.AbstractC0335i0.a(r9, r7)
            e0.F$e r7 = e0.F.e.PAUSED
            if (r0 != r7) goto L9a
            java.lang.Long r7 = r6.f13631x
            if (r7 == 0) goto L9a
            r6.Q()
            return
        L9a:
            r7 = 1
            r6.f13630w = r7
            java.util.concurrent.ScheduledExecutorService r7 = M.c.e()
            e0.v r8 = new e0.v
            r8.<init>()
            r9 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r0)
            r6.f13632y = r7
            return
        Lb1:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "The start time should be before the stop time."
            r6.<init>(r7)
            throw r6
        Lb9:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "There should be a \"start\" before \"stop\""
            r6.<init>(r7)
            throw r6
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.F.t(e0.F, long, long):void");
    }

    public static /* synthetic */ void u(F f6, long j6) {
        f6.getClass();
        switch (b.f13636a[f6.f13627t.ordinal()]) {
            case 1:
                f6.f13631x = null;
                AbstractC0335i0.a(f6.f13608a, "Start on " + Z.e.j(j6));
                try {
                    if (f6.f13604A) {
                        f6.N();
                    }
                    f6.f13628u = Range.create(Long.valueOf(j6), Long.valueOf(LongCompanionObject.MAX_VALUE));
                    f6.f13612e.start();
                    InterfaceC1229l.b bVar = f6.f13613f;
                    if (bVar instanceof d) {
                        ((d) bVar).q(true);
                    }
                    f6.P(e.STARTED);
                    return;
                } catch (MediaCodec.CodecException e6) {
                    f6.E(e6);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                f6.f13631x = null;
                Range range = (Range) f6.f13622o.removeLast();
                y0.g.i(range != null && ((Long) range.getUpper()).longValue() == LongCompanionObject.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l6 = (Long) range.getLower();
                long longValue = l6.longValue();
                f6.f13622o.addLast(Range.create(l6, Long.valueOf(j6)));
                AbstractC0335i0.a(f6.f13608a, "Resume on " + Z.e.j(j6) + "\nPaused duration = " + Z.e.j(j6 - longValue));
                if ((f6.f13610c || AbstractC1104f.a(C1099a.class) == null) && (!f6.f13610c || AbstractC1104f.a(c0.t.class) == null)) {
                    f6.O(false);
                    InterfaceC1229l.b bVar2 = f6.f13613f;
                    if (bVar2 instanceof d) {
                        ((d) bVar2).q(true);
                    }
                }
                if (f6.f13610c) {
                    f6.M();
                }
                f6.P(e.STARTED);
                return;
            case 4:
            case 5:
                f6.P(e.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + f6.f13627t);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ Object w(AtomicReference atomicReference, AbstractC1728c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public static /* synthetic */ void x(F f6) {
        f6.getClass();
        switch (b.f13636a[f6.f13627t.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                f6.L();
                return;
            case 4:
            case 5:
            case 6:
                f6.P(e.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + f6.f13627t);
        }
    }

    public long B() {
        return this.f13624q.a();
    }

    public long C(MediaCodec.BufferInfo bufferInfo) {
        long j6 = this.f13629v;
        return j6 > 0 ? bufferInfo.presentationTimeUs - j6 : bufferInfo.presentationTimeUs;
    }

    public void D(final int i6, final String str, final Throwable th) {
        switch (b.f13636a[this.f13627t.ordinal()]) {
            case 1:
                K(i6, str, th);
                N();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                P(e.ERROR);
                T(new Runnable() { // from class: e0.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.this.K(i6, str, th);
                    }
                });
                return;
            case 8:
                AbstractC0335i0.m(this.f13608a, "Get more than one error: " + str + "(" + i6 + ")", th);
                return;
            default:
                return;
        }
    }

    public void E(MediaCodec.CodecException codecException) {
        D(1, codecException.getMessage(), codecException);
    }

    public void F() {
        e eVar = this.f13627t;
        if (eVar == e.PENDING_RELEASE) {
            L();
            return;
        }
        if (!this.f13604A) {
            N();
        }
        P(e.CONFIGURED);
        if (eVar == e.PENDING_START || eVar == e.PENDING_START_PAUSED) {
            start();
            if (eVar == e.PENDING_START_PAUSED) {
                c();
            }
        }
    }

    public boolean H(long j6) {
        for (Range range : this.f13622o) {
            if (range.contains((Range) Long.valueOf(j6))) {
                return true;
            }
            if (j6 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    public void J() {
        while (!this.f13619l.isEmpty() && !this.f13618k.isEmpty()) {
            AbstractC1728c.a aVar = (AbstractC1728c.a) this.f13619l.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) this.f13618k.poll();
            Objects.requireNonNull(num);
            try {
                final h0 h0Var = new h0(this.f13612e, num.intValue());
                if (aVar.c(h0Var)) {
                    this.f13620m.add(h0Var);
                    h0Var.a().c(new Runnable() { // from class: e0.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            F.this.f13620m.remove(h0Var);
                        }
                    }, this.f13615h);
                } else {
                    h0Var.cancel();
                }
            } catch (MediaCodec.CodecException e6) {
                E(e6);
                return;
            }
        }
    }

    public void K(final int i6, final String str, final Throwable th) {
        final InterfaceC1230m interfaceC1230m;
        Executor executor;
        synchronized (this.f13609b) {
            interfaceC1230m = this.f13625r;
            executor = this.f13626s;
        }
        try {
            executor.execute(new Runnable() { // from class: e0.E
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1230m.this.c(new C1225h(i6, str, th));
                }
            });
        } catch (RejectedExecutionException e6) {
            AbstractC0335i0.d(this.f13608a, "Unable to post to the supplied executor.", e6);
        }
    }

    public final void L() {
        if (this.f13604A) {
            this.f13612e.stop();
            this.f13604A = false;
        }
        this.f13612e.release();
        InterfaceC1229l.b bVar = this.f13613f;
        if (bVar instanceof g) {
            ((g) bVar).d();
        }
        P(e.RELEASED);
        this.f13617j.c(null);
    }

    public void M() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f13612e.setParameters(bundle);
    }

    public final void N() {
        this.f13628u = f13603E;
        this.f13629v = 0L;
        this.f13622o.clear();
        this.f13618k.clear();
        Iterator it = this.f13619l.iterator();
        while (it.hasNext()) {
            ((AbstractC1728c.a) it.next()).d();
        }
        this.f13619l.clear();
        this.f13612e.reset();
        this.f13604A = false;
        this.f13605B = false;
        this.f13606C = false;
        this.f13630w = false;
        Future future = this.f13632y;
        if (future != null) {
            future.cancel(true);
            this.f13632y = null;
        }
        f fVar = this.f13633z;
        if (fVar != null) {
            fVar.n();
        }
        f fVar2 = new f();
        this.f13633z = fVar2;
        this.f13612e.setCallback(fVar2);
        this.f13612e.configure(this.f13611d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC1229l.b bVar = this.f13613f;
        if (bVar instanceof g) {
            ((g) bVar).e();
        }
    }

    public void O(boolean z6) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z6 ? 1 : 0);
        this.f13612e.setParameters(bundle);
    }

    public final void P(e eVar) {
        if (this.f13627t == eVar) {
            return;
        }
        AbstractC0335i0.a(this.f13608a, "Transitioning encoder internal state: " + this.f13627t + " --> " + eVar);
        this.f13627t = eVar;
    }

    public void Q() {
        InterfaceC1229l.b bVar = this.f13613f;
        if (bVar instanceof d) {
            ((d) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13620m.iterator();
            while (it.hasNext()) {
                arrayList.add(((f0) it.next()).a());
            }
            N.f.m(arrayList).c(new Runnable() { // from class: e0.u
                @Override // java.lang.Runnable
                public final void run() {
                    F.this.R();
                }
            }, this.f13615h);
            return;
        }
        if (bVar instanceof g) {
            try {
                this.f13612e.signalEndOfInputStream();
                this.f13606C = true;
            } catch (MediaCodec.CodecException e6) {
                E(e6);
            }
        }
    }

    public final void R() {
        N.f.b(y(), new a(), this.f13615h);
    }

    public void S() {
        this.f13615h.execute(new Runnable() { // from class: e0.q
            @Override // java.lang.Runnable
            public final void run() {
                F.r(F.this);
            }
        });
    }

    public void T(final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f13621n.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1228k) it.next()).c());
        }
        Iterator it2 = this.f13620m.iterator();
        while (it2.hasNext()) {
            arrayList.add(((f0) it2.next()).a());
        }
        if (!arrayList.isEmpty()) {
            AbstractC0335i0.a(this.f13608a, "Waiting for resources to return. encoded data = " + this.f13621n.size() + ", input buffers = " + this.f13620m.size());
        }
        N.f.m(arrayList).c(new Runnable() { // from class: e0.r
            @Override // java.lang.Runnable
            public final void run() {
                F.l(F.this, arrayList, runnable);
            }
        }, this.f13615h);
    }

    public void U(long j6) {
        while (!this.f13622o.isEmpty()) {
            Range range = (Range) this.f13622o.getFirst();
            if (j6 <= ((Long) range.getUpper()).longValue()) {
                return;
            }
            this.f13622o.removeFirst();
            this.f13629v += ((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue();
            AbstractC0335i0.a(this.f13608a, "Total paused duration = " + Z.e.j(this.f13629v));
        }
    }

    @Override // e0.InterfaceC1229l
    public void a(final long j6) {
        final long B6 = B();
        this.f13615h.execute(new Runnable() { // from class: e0.s
            @Override // java.lang.Runnable
            public final void run() {
                F.t(F.this, j6, B6);
            }
        });
    }

    @Override // e0.InterfaceC1229l
    public InterfaceC1229l.b b() {
        return this.f13613f;
    }

    @Override // e0.InterfaceC1229l
    public void c() {
        final long B6 = B();
        this.f13615h.execute(new Runnable() { // from class: e0.z
            @Override // java.lang.Runnable
            public final void run() {
                F.o(F.this, B6);
            }
        });
    }

    @Override // e0.InterfaceC1229l
    public void d(InterfaceC1230m interfaceC1230m, Executor executor) {
        synchronized (this.f13609b) {
            this.f13625r = interfaceC1230m;
            this.f13626s = executor;
        }
    }

    @Override // e0.InterfaceC1229l
    public d0 e() {
        return this.f13614g;
    }

    @Override // e0.InterfaceC1229l
    public D6.g f() {
        return this.f13616i;
    }

    @Override // e0.InterfaceC1229l
    public void g() {
        this.f13615h.execute(new Runnable() { // from class: e0.w
            @Override // java.lang.Runnable
            public final void run() {
                F.m(F.this);
            }
        });
    }

    @Override // e0.InterfaceC1229l
    public int h() {
        if (this.f13611d.containsKey("bitrate")) {
            return this.f13611d.getInteger("bitrate");
        }
        return 0;
    }

    @Override // e0.InterfaceC1229l
    public void release() {
        this.f13615h.execute(new Runnable() { // from class: e0.C
            @Override // java.lang.Runnable
            public final void run() {
                F.x(F.this);
            }
        });
    }

    @Override // e0.InterfaceC1229l
    public void start() {
        final long B6 = B();
        this.f13615h.execute(new Runnable() { // from class: e0.A
            @Override // java.lang.Runnable
            public final void run() {
                F.u(F.this, B6);
            }
        });
    }

    public D6.g y() {
        switch (b.f13636a[this.f13627t.ordinal()]) {
            case 1:
                return N.f.f(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                D6.g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: e0.x
                    @Override // l0.AbstractC1728c.InterfaceC0214c
                    public final Object a(AbstractC1728c.a aVar) {
                        return F.w(atomicReference, aVar);
                    }
                });
                final AbstractC1728c.a aVar = (AbstractC1728c.a) y0.g.f((AbstractC1728c.a) atomicReference.get());
                this.f13619l.offer(aVar);
                aVar.a(new Runnable() { // from class: e0.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.this.f13619l.remove(aVar);
                    }
                }, this.f13615h);
                J();
                return a6;
            case 8:
                return N.f.f(new IllegalStateException("Encoder is in error state."));
            case 9:
                return N.f.f(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f13627t);
        }
    }

    public final void z(o0 o0Var, MediaFormat mediaFormat) {
        y0.g.h(this.f13610c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = ((Integer) o0Var.b().clamp(Integer.valueOf(integer))).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                AbstractC0335i0.a(this.f13608a, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }
}
