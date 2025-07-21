package X;

import F.AbstractC0335i0;
import F.H0;
import I.B0;
import I.C0466z0;
import I.N0;
import I.T0;
import X.AbstractC0808q;
import X.Q;
import X.b0;
import X.w0;
import X.x0;
import X.y0;
import a0.AbstractC0976a;
import a0.C0989n;
import a0.C0990o;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import c0.AbstractC1104f;
import c0.C1103e;
import c0.C1106h;
import d0.AbstractC1172b;
import d0.AbstractC1175e;
import e0.C1224g;
import e0.C1225h;
import e0.InterfaceC1226i;
import e0.InterfaceC1229l;
import e0.InterfaceC1230m;
import e0.InterfaceC1231n;
import e0.InterfaceC1232o;
import f0.AbstractC1284b;
import g0.AbstractC1311a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import l0.AbstractC1728c;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Q implements w0 {

    /* renamed from: g0, reason: collision with root package name */
    public static final Set f5701g0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* renamed from: h0, reason: collision with root package name */
    public static final Set f5702h0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* renamed from: i0, reason: collision with root package name */
    public static final C0814x f5703i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final y0 f5704j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final AbstractC0808q f5705k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final Exception f5706l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final InterfaceC1232o f5707m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final Executor f5708n0;

    /* renamed from: A, reason: collision with root package name */
    public MediaMuxer f5709A;

    /* renamed from: B, reason: collision with root package name */
    public final C0466z0 f5710B;

    /* renamed from: C, reason: collision with root package name */
    public C0989n f5711C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1229l f5712D;

    /* renamed from: E, reason: collision with root package name */
    public e0.j0 f5713E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC1229l f5714F;

    /* renamed from: G, reason: collision with root package name */
    public e0.j0 f5715G;

    /* renamed from: H, reason: collision with root package name */
    public i f5716H;

    /* renamed from: I, reason: collision with root package name */
    public Uri f5717I;

    /* renamed from: J, reason: collision with root package name */
    public long f5718J;

    /* renamed from: K, reason: collision with root package name */
    public long f5719K;

    /* renamed from: L, reason: collision with root package name */
    public long f5720L;

    /* renamed from: M, reason: collision with root package name */
    public int f5721M;

    /* renamed from: N, reason: collision with root package name */
    public Range f5722N;

    /* renamed from: O, reason: collision with root package name */
    public long f5723O;

    /* renamed from: P, reason: collision with root package name */
    public long f5724P;

    /* renamed from: Q, reason: collision with root package name */
    public long f5725Q;

    /* renamed from: R, reason: collision with root package name */
    public long f5726R;

    /* renamed from: S, reason: collision with root package name */
    public long f5727S;

    /* renamed from: T, reason: collision with root package name */
    public int f5728T;

    /* renamed from: U, reason: collision with root package name */
    public Throwable f5729U;

    /* renamed from: V, reason: collision with root package name */
    public InterfaceC1226i f5730V;

    /* renamed from: W, reason: collision with root package name */
    public final S.c f5731W;

    /* renamed from: X, reason: collision with root package name */
    public Throwable f5732X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f5733Y;

    /* renamed from: Z, reason: collision with root package name */
    public w0.a f5734Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0466z0 f5735a;

    /* renamed from: a0, reason: collision with root package name */
    public ScheduledFuture f5736a0;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5737b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f5738b0;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5739c;

    /* renamed from: c0, reason: collision with root package name */
    public v0 f5740c0;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f5741d;

    /* renamed from: d0, reason: collision with root package name */
    public v0 f5742d0;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1232o f5743e;

    /* renamed from: e0, reason: collision with root package name */
    public double f5744e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1232o f5745f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f5746f0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5747g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5748h;

    /* renamed from: i, reason: collision with root package name */
    public l f5749i;

    /* renamed from: j, reason: collision with root package name */
    public l f5750j;

    /* renamed from: k, reason: collision with root package name */
    public int f5751k;

    /* renamed from: l, reason: collision with root package name */
    public k f5752l;

    /* renamed from: m, reason: collision with root package name */
    public k f5753m;

    /* renamed from: n, reason: collision with root package name */
    public long f5754n;

    /* renamed from: o, reason: collision with root package name */
    public k f5755o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5756p;

    /* renamed from: q, reason: collision with root package name */
    public H0.h f5757q;

    /* renamed from: r, reason: collision with root package name */
    public H0.h f5758r;

    /* renamed from: s, reason: collision with root package name */
    public Z.g f5759s;

    /* renamed from: t, reason: collision with root package name */
    public final List f5760t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f5761u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f5762v;

    /* renamed from: w, reason: collision with root package name */
    public H0 f5763w;

    /* renamed from: x, reason: collision with root package name */
    public T0 f5764x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f5765y;

    /* renamed from: z, reason: collision with root package name */
    public Surface f5766z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f5767a;

        public a(v0 v0Var) {
            this.f5767a = v0Var;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC1229l interfaceC1229l) {
            AbstractC0335i0.a("Recorder", "VideoEncoder is created. " + interfaceC1229l);
            if (interfaceC1229l == null) {
                return;
            }
            y0.g.h(Q.this.f5740c0 == this.f5767a);
            y0.g.h(Q.this.f5712D == null);
            Q.this.V(this.f5767a);
            Q.this.O();
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            AbstractC0335i0.a("Recorder", "VideoEncoder Setup error: " + th);
            Q.this.P(th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f5769a;

        public b(v0 v0Var) {
            this.f5769a = v0Var;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC1229l interfaceC1229l) {
            InterfaceC1229l interfaceC1229l2;
            AbstractC0335i0.a("Recorder", "VideoEncoder can be released: " + interfaceC1229l);
            if (interfaceC1229l == null) {
                return;
            }
            ScheduledFuture scheduledFuture = Q.this.f5736a0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC1229l2 = Q.this.f5712D) != null && interfaceC1229l2 == interfaceC1229l) {
                Q.N(interfaceC1229l2);
            }
            Q q6 = Q.this;
            q6.f5742d0 = this.f5769a;
            q6.k0(null);
            Q q7 = Q.this;
            q7.b0(4, null, q7.K());
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            AbstractC0335i0.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0989n f5771a;

        public c(C0989n c0989n) {
            this.f5771a = c0989n;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            AbstractC0335i0.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f5771a.hashCode())));
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            AbstractC0335i0.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f5771a.hashCode())));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements InterfaceC1230m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f5773b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5774c;

        public d(AbstractC1728c.a aVar, k kVar) {
            this.f5773b = aVar;
            this.f5774c = kVar;
        }

        @Override // e0.InterfaceC1230m
        public void a(e0.j0 j0Var) {
            Q.this.f5713E = j0Var;
        }

        @Override // e0.InterfaceC1230m
        public void b() {
        }

        @Override // e0.InterfaceC1230m
        public void c(C1225h c1225h) {
            this.f5773b.f(c1225h);
        }

        @Override // e0.InterfaceC1230m
        public void d() {
            this.f5773b.c(null);
        }

        @Override // e0.InterfaceC1230m
        public void e(InterfaceC1226i interfaceC1226i) {
            boolean z6;
            Q q6 = Q.this;
            if (q6.f5709A != null) {
                try {
                    q6.D0(interfaceC1226i, this.f5774c);
                    if (interfaceC1226i != null) {
                        interfaceC1226i.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (interfaceC1226i != null) {
                        try {
                            interfaceC1226i.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (q6.f5756p) {
                AbstractC0335i0.a("Recorder", "Drop video data since recording is stopping.");
                interfaceC1226i.close();
                return;
            }
            InterfaceC1226i interfaceC1226i2 = q6.f5730V;
            if (interfaceC1226i2 != null) {
                interfaceC1226i2.close();
                Q.this.f5730V = null;
                z6 = true;
            } else {
                z6 = false;
            }
            if (!interfaceC1226i.G()) {
                if (z6) {
                    AbstractC0335i0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                AbstractC0335i0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                Q.this.f5712D.g();
                interfaceC1226i.close();
                return;
            }
            Q q7 = Q.this;
            q7.f5730V = interfaceC1226i;
            if (!q7.I() || !Q.this.f5731W.isEmpty()) {
                AbstractC0335i0.a("Recorder", "Received video keyframe. Starting muxer...");
                Q.this.n0(this.f5774c);
            } else if (z6) {
                AbstractC0335i0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                AbstractC0335i0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements C0989n.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2343a f5776a;

        public e(InterfaceC2343a interfaceC2343a) {
            this.f5776a = interfaceC2343a;
        }

        @Override // a0.C0989n.d
        public void a(boolean z6) {
            Q q6 = Q.this;
            if (q6.f5733Y != z6) {
                q6.f5733Y = z6;
                q6.A0();
            } else {
                AbstractC0335i0.l("Recorder", "Audio source silenced transitions to the same state " + z6);
            }
        }

        @Override // a0.C0989n.d
        public void c(double d6) {
            Q.this.f5744e0 = d6;
        }

        @Override // a0.C0989n.d
        public void onError(Throwable th) {
            AbstractC0335i0.d("Recorder", "Error occurred after audio source started.", th);
            if (th instanceof C0990o) {
                this.f5776a.accept(th);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements InterfaceC1230m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f5778b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2343a f5779c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f5780d;

        public f(AbstractC1728c.a aVar, InterfaceC2343a interfaceC2343a, k kVar) {
            this.f5778b = aVar;
            this.f5779c = interfaceC2343a;
            this.f5780d = kVar;
        }

        @Override // e0.InterfaceC1230m
        public void a(e0.j0 j0Var) {
            Q.this.f5715G = j0Var;
        }

        @Override // e0.InterfaceC1230m
        public void b() {
        }

        @Override // e0.InterfaceC1230m
        public void c(C1225h c1225h) {
            if (Q.this.f5732X == null) {
                this.f5779c.accept(c1225h);
            }
        }

        @Override // e0.InterfaceC1230m
        public void d() {
            this.f5778b.c(null);
        }

        @Override // e0.InterfaceC1230m
        public void e(InterfaceC1226i interfaceC1226i) {
            Q q6 = Q.this;
            if (q6.f5716H == i.DISABLED) {
                interfaceC1226i.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (q6.f5709A == null) {
                if (q6.f5756p) {
                    AbstractC0335i0.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    q6.f5731W.b(new C1224g(interfaceC1226i));
                    if (Q.this.f5730V != null) {
                        AbstractC0335i0.a("Recorder", "Received audio data. Starting muxer...");
                        Q.this.n0(this.f5780d);
                    } else {
                        AbstractC0335i0.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                interfaceC1226i.close();
                return;
            }
            try {
                q6.C0(interfaceC1226i, this.f5780d);
                if (interfaceC1226i != null) {
                    interfaceC1226i.close();
                }
            } catch (Throwable th) {
                if (interfaceC1226i != null) {
                    try {
                        interfaceC1226i.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements N.c {
        public g() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            AbstractC0335i0.a("Recorder", "Encodings end successfully.");
            Q q6 = Q.this;
            q6.y(q6.f5728T, q6.f5729U);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            y0.g.i(Q.this.f5755o != null, "In-progress recording shouldn't be null");
            if (Q.this.f5755o.q0()) {
                return;
            }
            AbstractC0335i0.a("Recorder", "Encodings end with error: " + th);
            Q q6 = Q.this;
            q6.y(q6.f5709A == null ? 8 : 6, th);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5783a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5784b;

        static {
            int[] iArr = new int[i.values().length];
            f5784b = iArr;
            try {
                iArr[i.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5784b[i.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5784b[i.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5784b[i.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5784b[i.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5784b[i.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[l.values().length];
            f5783a = iArr2;
            try {
                iArr2[l.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5783a[l.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5783a[l.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5783a[l.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5783a[l.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5783a[l.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5783a[l.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5783a[l.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5783a[l.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum i {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0808q.a f5792a;

        /* renamed from: b, reason: collision with root package name */
        public Executor f5793b = null;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1232o f5794c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1232o f5795d;

        public j() {
            InterfaceC1232o interfaceC1232o = Q.f5707m0;
            this.f5794c = interfaceC1232o;
            this.f5795d = interfaceC1232o;
            this.f5792a = AbstractC0808q.a();
        }

        public Q d() {
            return new Q(this.f5793b, this.f5792a.a(), this.f5794c, this.f5795d);
        }

        public j e(final int i6) {
            this.f5792a.b(new InterfaceC2343a() { // from class: X.T
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    ((y0.a) obj).b(i6);
                }
            });
            return this;
        }

        public j f(Executor executor) {
            y0.g.g(executor, "The specified executor can't be null.");
            this.f5793b = executor;
            return this;
        }

        public j g(final C0814x c0814x) {
            y0.g.g(c0814x, "The specified quality selector can't be null.");
            this.f5792a.b(new InterfaceC2343a() { // from class: X.U
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    ((y0.a) obj).e(C0814x.this);
                }
            });
            return this;
        }

        public j h(final int i6) {
            if (i6 > 0) {
                this.f5792a.b(new InterfaceC2343a() { // from class: X.S
                    @Override // y0.InterfaceC2343a
                    public final void accept(Object obj) {
                        ((y0.a) obj).c(new Range(Integer.valueOf(r0), Integer.valueOf(i6)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i6 + " is not supported. Target bitrate must be greater than 0.");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class k implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public final L.d f5796a = L.d.b();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f5797b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference f5798c = new AtomicReference(null);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference f5799d = new AtomicReference(null);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference f5800e = new AtomicReference(new InterfaceC2343a() { // from class: X.W
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                Q.k.a((Uri) obj);
            }
        });

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f5801f = new AtomicBoolean(false);

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f5802a;

            public a(Context context) {
                this.f5802a = context;
            }

            @Override // X.Q.k.c
            public C0989n a(AbstractC0976a abstractC0976a, Executor executor) {
                return new C0989n(abstractC0976a, executor, this.f5802a);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements c {
            public b() {
            }

            @Override // X.Q.k.c
            public C0989n a(AbstractC0976a abstractC0976a, Executor executor) {
                return new C0989n(abstractC0976a, executor, null);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface c {
            C0989n a(AbstractC0976a abstractC0976a, Executor executor);
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface d {
            MediaMuxer a(int i6, InterfaceC2343a interfaceC2343a);
        }

        public static /* synthetic */ MediaMuxer D(r rVar, ParcelFileDescriptor parcelFileDescriptor, int i6, InterfaceC2343a interfaceC2343a) {
            Uri uri = Uri.EMPTY;
            if (!(rVar instanceof C0807p)) {
                throw new AssertionError("Invalid output options type: " + rVar.getClass().getSimpleName());
            }
            File d6 = ((C0807p) rVar).d();
            if (!AbstractC1284b.a(d6)) {
                AbstractC0335i0.l("Recorder", "Failed to create folder for " + d6.getAbsolutePath());
            }
            MediaMuxer mediaMuxer = new MediaMuxer(d6.getAbsolutePath(), i6);
            interfaceC2343a.accept(Uri.fromFile(d6));
            return mediaMuxer;
        }

        public static k R(C0810t c0810t, long j6) {
            return new C0802k(c0810t.d(), c0810t.c(), c0810t.b(), c0810t.f(), c0810t.g(), j6);
        }

        public static /* synthetic */ void a(Uri uri) {
        }

        public void I(Uri uri) {
            if (this.f5797b.get()) {
                P((InterfaceC2343a) this.f5800e.getAndSet(null), uri);
            }
        }

        public final void P(InterfaceC2343a interfaceC2343a, Uri uri) {
            if (interfaceC2343a != null) {
                this.f5796a.a();
                interfaceC2343a.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public abstract Executor T();

        public abstract InterfaceC2343a Y();

        public abstract r a0();

        @Override // java.lang.AutoCloseable
        public void close() {
            I(Uri.EMPTY);
        }

        public abstract long f0();

        public void finalize() {
            try {
                this.f5796a.d();
                InterfaceC2343a interfaceC2343a = (InterfaceC2343a) this.f5800e.getAndSet(null);
                if (interfaceC2343a != null) {
                    P(interfaceC2343a, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public abstract boolean k0();

        public void o0(Context context) {
            if (this.f5797b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final r a02 = a0();
            this.f5796a.c("finalizeRecording");
            final ParcelFileDescriptor parcelFileDescriptor = null;
            this.f5798c.set(new d() { // from class: X.V
                @Override // X.Q.k.d
                public final MediaMuxer a(int i6, InterfaceC2343a interfaceC2343a) {
                    return Q.k.D(r.this, parcelFileDescriptor, i6, interfaceC2343a);
                }
            });
            if (k0()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f5799d.set(new a(context));
                } else {
                    this.f5799d.set(new b());
                }
            }
        }

        public boolean p0() {
            return this.f5801f.get();
        }

        public abstract boolean q0();

        public C0989n r0(AbstractC0976a abstractC0976a, Executor executor) {
            if (!k0()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c cVar = (c) this.f5799d.getAndSet(null);
            if (cVar != null) {
                return cVar.a(abstractC0976a, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        public MediaMuxer s0(int i6, InterfaceC2343a interfaceC2343a) {
            if (!this.f5797b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d dVar = (d) this.f5798c.getAndSet(null);
            if (dVar == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return dVar.a(i6, interfaceC2343a);
            } catch (RuntimeException e6) {
                throw new IOException("Failed to create MediaMuxer by " + e6, e6);
            }
        }

        public void t0(final x0 x0Var) {
            if (!Objects.equals(x0Var.c(), a0())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + x0Var.c() + ", Expected: " + a0() + "]");
            }
            String str = "Sending VideoRecordEvent " + x0Var.getClass().getSimpleName();
            if (x0Var instanceof x0.a) {
                x0.a aVar = (x0.a) x0Var;
                if (aVar.k()) {
                    str = str + String.format(" [error: %s]", x0.a.h(aVar.j()));
                }
            }
            AbstractC0335i0.a("Recorder", str);
            if (T() == null || Y() == null) {
                return;
            }
            try {
                T().execute(new Runnable() { // from class: X.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        Q.k.this.Y().accept(x0Var);
                    }
                });
            } catch (RejectedExecutionException e6) {
                AbstractC0335i0.d("Recorder", "The callback executor is invalid.", e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        AbstractC0811u abstractC0811u = AbstractC0811u.f5976c;
        C0814x g6 = C0814x.g(Arrays.asList(abstractC0811u, AbstractC0811u.f5975b, AbstractC0811u.f5974a), AbstractC0806o.a(abstractC0811u));
        f5703i0 = g6;
        y0 a6 = y0.a().e(g6).b(-1).a();
        f5704j0 = a6;
        f5705k0 = AbstractC0808q.a().e(-1).f(a6).a();
        f5706l0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f5707m0 = new InterfaceC1232o() { // from class: X.I
            @Override // e0.InterfaceC1232o
            public final InterfaceC1229l a(Executor executor, InterfaceC1231n interfaceC1231n) {
                return new e0.F(executor, interfaceC1231n);
            }
        };
        f5708n0 = M.c.g(M.c.d());
    }

    public Q(Executor executor, AbstractC0808q abstractC0808q, InterfaceC1232o interfaceC1232o, InterfaceC1232o interfaceC1232o2) {
        this.f5748h = AbstractC1104f.a(C1106h.class) != null;
        this.f5749i = l.CONFIGURING;
        this.f5750j = null;
        this.f5751k = 0;
        this.f5752l = null;
        this.f5753m = null;
        this.f5754n = 0L;
        this.f5755o = null;
        this.f5756p = false;
        this.f5757q = null;
        this.f5758r = null;
        this.f5759s = null;
        this.f5760t = new ArrayList();
        this.f5761u = null;
        this.f5762v = null;
        this.f5765y = null;
        this.f5766z = null;
        this.f5709A = null;
        this.f5711C = null;
        this.f5712D = null;
        this.f5713E = null;
        this.f5714F = null;
        this.f5715G = null;
        this.f5716H = i.INITIALIZING;
        this.f5717I = Uri.EMPTY;
        this.f5718J = 0L;
        this.f5719K = 0L;
        this.f5720L = LongCompanionObject.MAX_VALUE;
        this.f5721M = 0;
        this.f5722N = null;
        this.f5723O = LongCompanionObject.MAX_VALUE;
        this.f5724P = LongCompanionObject.MAX_VALUE;
        this.f5725Q = LongCompanionObject.MAX_VALUE;
        this.f5726R = 0L;
        this.f5727S = 0L;
        this.f5728T = 1;
        this.f5729U = null;
        this.f5730V = null;
        this.f5731W = new S.a(60);
        this.f5732X = null;
        this.f5733Y = false;
        this.f5734Z = w0.a.INACTIVE;
        this.f5736a0 = null;
        this.f5738b0 = false;
        this.f5742d0 = null;
        this.f5744e0 = 0.0d;
        this.f5746f0 = false;
        this.f5737b = executor;
        executor = executor == null ? M.c.d() : executor;
        this.f5739c = executor;
        Executor g6 = M.c.g(executor);
        this.f5741d = g6;
        this.f5710B = C0466z0.i(w(abstractC0808q));
        this.f5735a = C0466z0.i(b0.d(this.f5751k, H(this.f5749i)));
        this.f5743e = interfaceC1232o;
        this.f5745f = interfaceC1232o2;
        this.f5740c0 = new v0(interfaceC1232o, g6, executor);
    }

    public static c0 F(F.r rVar) {
        return Y.h(rVar);
    }

    public static boolean L(Z z6, k kVar) {
        return kVar != null && z6.I() == kVar.f0();
    }

    public static void N(InterfaceC1229l interfaceC1229l) {
        if (interfaceC1229l instanceof e0.F) {
            ((e0.F) interfaceC1229l).S();
        }
    }

    public static /* synthetic */ void h(InterfaceC1229l interfaceC1229l) {
        AbstractC0335i0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (AbstractC1104f.a(C1103e.class) != null) {
            N(interfaceC1229l);
        }
    }

    public static /* synthetic */ void j(Q q6, H0 h02, T0 t02) {
        q6.getClass();
        if (!h02.p() && (!q6.f5740c0.n(h02) || q6.K())) {
            v0 v0Var = new v0(q6.f5743e, q6.f5741d, q6.f5739c);
            D6.g i6 = v0Var.i(h02, t02, (AbstractC0808q) q6.D(q6.f5710B), q6.f5759s);
            q6.f5740c0 = v0Var;
            N.f.b(i6, new a(v0Var), q6.f5741d);
            return;
        }
        AbstractC0335i0.l("Recorder", "Ignore the SurfaceRequest " + h02 + " isServiced: " + h02.p() + " VideoEncoderSession: " + q6.f5740c0 + " has been configured with a persistent in-progress recording.");
    }

    public static /* synthetic */ void k(Q q6, AbstractC1728c.a aVar, Throwable th) {
        if (q6.f5732X == null) {
            if (th instanceof C1225h) {
                q6.i0(i.ERROR_ENCODER);
            } else {
                q6.i0(i.ERROR_SOURCE);
            }
            q6.f5732X = th;
            q6.A0();
            aVar.c(null);
        }
    }

    public static /* synthetic */ void r(Q q6) {
        H0 h02 = q6.f5763w;
        if (h02 == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        q6.x(h02, q6.f5764x);
    }

    public static /* synthetic */ Object s(Q q6, k kVar, AbstractC1728c.a aVar) {
        q6.f5712D.d(new d(aVar, kVar), q6.f5741d);
        return "videoEncodingFuture";
    }

    public static /* synthetic */ Object t(final Q q6, k kVar, final AbstractC1728c.a aVar) {
        q6.getClass();
        InterfaceC2343a interfaceC2343a = new InterfaceC2343a() { // from class: X.B
            @Override // y0.InterfaceC2343a
            public final void accept(Object obj) {
                Q.k(Q.this, aVar, (Throwable) obj);
            }
        };
        q6.f5711C.A(q6.f5741d, new e(interfaceC2343a));
        q6.f5714F.d(new f(aVar, interfaceC2343a, kVar), q6.f5741d);
        return "audioEncodingFuture";
    }

    public static int w0(Z.g gVar, int i6) {
        if (gVar != null) {
            int b6 = gVar.b();
            if (b6 == 1) {
                return 2;
            }
            if (b6 == 2) {
                return 0;
            }
            if (b6 == 9) {
                return 1;
            }
        }
        return i6;
    }

    public int A() {
        return ((AbstractC0808q) D(this.f5710B)).d().b();
    }

    public void A0() {
        k kVar = this.f5755o;
        if (kVar != null) {
            kVar.t0(x0.g(kVar.a0(), C()));
        }
    }

    public final List B(long j6) {
        ArrayList arrayList = new ArrayList();
        while (!this.f5731W.isEmpty()) {
            InterfaceC1226i interfaceC1226i = (InterfaceC1226i) this.f5731W.a();
            if (interfaceC1226i.V() >= j6) {
                arrayList.add(interfaceC1226i);
            }
        }
        return arrayList;
    }

    public final void B0(l lVar) {
        if (!f5701g0.contains(this.f5749i)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f5749i);
        }
        if (!f5702h0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f5750j != lVar) {
            this.f5750j = lVar;
            this.f5735a.h(b0.e(this.f5751k, H(lVar), this.f5757q));
        }
    }

    public a0 C() {
        return a0.d(this.f5719K, this.f5718J, AbstractC0793b.d(G(this.f5716H), this.f5732X, this.f5744e0));
    }

    public void C0(InterfaceC1226i interfaceC1226i, k kVar) {
        long size = this.f5718J + interfaceC1226i.size();
        long j6 = this.f5726R;
        if (j6 != 0 && size > j6) {
            AbstractC0335i0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f5726R)));
            Q(kVar, 2, null);
            return;
        }
        long V5 = interfaceC1226i.V();
        long j7 = this.f5723O;
        if (j7 == LongCompanionObject.MAX_VALUE) {
            this.f5723O = V5;
            AbstractC0335i0.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(V5), Z.e.j(this.f5723O)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(V5 - Math.min(this.f5720L, j7));
            y0.g.i(this.f5725Q != LongCompanionObject.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(V5 - this.f5725Q);
            long j8 = this.f5727S;
            if (j8 != 0 && nanos2 > j8) {
                AbstractC0335i0.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f5727S)));
                Q(kVar, 9, null);
                return;
            }
        }
        this.f5709A.writeSampleData(this.f5761u.intValue(), interfaceC1226i.e(), interfaceC1226i.z());
        this.f5718J = size;
        this.f5725Q = V5;
    }

    public Object D(N0 n02) {
        try {
            return n02.d().get();
        } catch (InterruptedException | ExecutionException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public void D0(InterfaceC1226i interfaceC1226i, k kVar) {
        if (this.f5762v == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.f5718J + interfaceC1226i.size();
        long j6 = this.f5726R;
        long j7 = 0;
        if (j6 != 0 && size > j6) {
            AbstractC0335i0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f5726R)));
            Q(kVar, 2, null);
            return;
        }
        long V5 = interfaceC1226i.V();
        long j8 = this.f5720L;
        if (j8 == LongCompanionObject.MAX_VALUE) {
            this.f5720L = V5;
            AbstractC0335i0.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(V5), Z.e.j(this.f5720L)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            j7 = timeUnit.toNanos(V5 - Math.min(j8, this.f5723O));
            y0.g.i(this.f5724P != LongCompanionObject.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos = timeUnit.toNanos(V5 - this.f5724P) + j7;
            long j9 = this.f5727S;
            if (j9 != 0 && nanos > j9) {
                AbstractC0335i0.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.f5727S)));
                Q(kVar, 9, null);
                return;
            }
        }
        this.f5709A.writeSampleData(this.f5762v.intValue(), interfaceC1226i.e(), interfaceC1226i.z());
        this.f5718J = size;
        this.f5719K = j7;
        this.f5724P = V5;
        A0();
    }

    public int E() {
        return ((Integer) ((AbstractC0808q) D(this.f5710B)).d().c().getLower()).intValue();
    }

    public final int G(i iVar) {
        int i6 = h.f5784b[iVar.ordinal()];
        if (i6 == 1) {
            return 3;
        }
        if (i6 == 2) {
            return 4;
        }
        if (i6 == 3) {
            k kVar = this.f5755o;
            if (kVar == null || !kVar.p0()) {
                return this.f5733Y ? 2 : 0;
            }
            return 5;
        }
        if (i6 == 4 || i6 == 6) {
            return 1;
        }
        throw new AssertionError("Invalid internal audio state: " + iVar);
    }

    public final b0.a H(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((C1103e) AbstractC1104f.a(C1103e.class)) == null)) ? b0.a.ACTIVE : b0.a.INACTIVE;
    }

    public boolean I() {
        return this.f5716H == i.ENABLED;
    }

    public boolean J() {
        return ((AbstractC0808q) D(this.f5710B)).b().c() != 0;
    }

    public boolean K() {
        k kVar = this.f5755o;
        return kVar != null && kVar.q0();
    }

    public final k M(l lVar) {
        boolean z6;
        if (lVar == l.PENDING_PAUSED) {
            z6 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z6 = false;
        }
        if (this.f5752l != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        k kVar = this.f5753m;
        if (kVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f5752l = kVar;
        this.f5753m = null;
        if (z6) {
            l0(l.PAUSED);
            return kVar;
        }
        l0(l.RECORDING);
        return kVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0003, B:5:0x0010, B:9:0x008a, B:26:0x0014, B:27:0x001f, B:28:0x0025, B:30:0x0030, B:31:0x0037, B:32:0x0038, B:33:0x0050, B:35:0x0054, B:38:0x005c, B:40:0x0062, B:41:0x006e, B:44:0x007d), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q.O():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000e. Please report as an issue. */
    public void P(Throwable th) {
        k kVar;
        synchronized (this.f5747g) {
            kVar = null;
            switch (h.f5783a[this.f5749i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 9:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f5749i + ": " + th);
                case 3:
                case 4:
                    k kVar2 = this.f5753m;
                    this.f5753m = null;
                    kVar = kVar2;
                case 7:
                    m0(-1);
                    l0(l.ERROR);
                    break;
            }
        }
        if (kVar != null) {
            z(kVar, 7, th);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0012. Please report as an issue. */
    public void Q(k kVar, int i6, Throwable th) {
        boolean z6;
        if (kVar != this.f5755o) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f5747g) {
            try {
                z6 = false;
                switch (h.f5783a[this.f5749i.ordinal()]) {
                    case 1:
                    case 2:
                        l0(l.STOPPING);
                        z6 = true;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (kVar != this.f5752l) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                    case 7:
                    case 8:
                    case 9:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f5749i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z6) {
            v0(kVar, -1L, i6, th);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:12:0x009b, B:34:0x002a, B:36:0x0030, B:37:0x0043, B:39:0x0047, B:41:0x004d, B:44:0x0055, B:46:0x005f, B:48:0x0063, B:51:0x0075, B:53:0x0079, B:55:0x007f, B:58:0x0087, B:60:0x0091, B:61:0x00c4, B:62:0x00dc, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:12:0x009b, B:34:0x002a, B:36:0x0030, B:37:0x0043, B:39:0x0047, B:41:0x004d, B:44:0x0055, B:46:0x005f, B:48:0x0063, B:51:0x0075, B:53:0x0079, B:55:0x007f, B:58:0x0087, B:60:0x0091, B:61:0x00c4, B:62:0x00dc, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(X.Q.k r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q.R(X.Q$k):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void S() {
        boolean z6;
        H0 h02;
        synchronized (this.f5747g) {
            try {
                switch (h.f5783a[this.f5749i.ordinal()]) {
                    case 1:
                    case 2:
                    case 8:
                        if (K()) {
                            z6 = false;
                            break;
                        }
                        l0(l.CONFIGURING);
                        z6 = true;
                        break;
                    case 3:
                    case 4:
                        B0(l.CONFIGURING);
                        z6 = true;
                        break;
                    case 5:
                    case 6:
                    case 9:
                        l0(l.CONFIGURING);
                        z6 = true;
                        break;
                    case 7:
                    default:
                        z6 = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5738b0 = false;
        if (!z6 || (h02 = this.f5763w) == null || h02.p()) {
            return;
        }
        x(this.f5763w, this.f5764x);
    }

    public void T(w0.a aVar) {
        ScheduledFuture scheduledFuture;
        InterfaceC1229l interfaceC1229l;
        w0.a aVar2 = this.f5734Z;
        this.f5734Z = aVar;
        if (aVar2 == aVar) {
            AbstractC0335i0.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        AbstractC0335i0.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != w0.a.INACTIVE) {
            if (aVar != w0.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f5736a0) == null || !scheduledFuture.cancel(false) || (interfaceC1229l = this.f5712D) == null) {
                return;
            }
            N(interfaceC1229l);
            return;
        }
        if (this.f5766z == null) {
            b0(4, null, false);
            return;
        }
        this.f5738b0 = true;
        k kVar = this.f5755o;
        if (kVar == null || kVar.q0()) {
            return;
        }
        Q(this.f5755o, 4, null);
    }

    public final void U(H0 h02, T0 t02) {
        H0 h03 = this.f5763w;
        if (h03 != null && !h03.p()) {
            this.f5763w.t();
        }
        this.f5763w = h02;
        this.f5764x = t02;
        x(h02, t02);
    }

    public void V(v0 v0Var) {
        InterfaceC1229l m6 = v0Var.m();
        this.f5712D = m6;
        this.f5722N = ((e0.o0) m6.e()).b();
        this.f5721M = this.f5712D.h();
        Surface k6 = v0Var.k();
        this.f5766z = k6;
        k0(k6);
        v0Var.p(this.f5741d, new InterfaceC1229l.c.a() { // from class: X.E
            @Override // e0.InterfaceC1229l.c.a
            public final void a(Surface surface) {
                Q.this.k0(surface);
            }
        });
        N.f.b(v0Var.l(), new b(v0Var), this.f5741d);
    }

    public void W(Z z6) {
        synchronized (this.f5747g) {
            try {
                if (!L(z6, this.f5753m) && !L(z6, this.f5752l)) {
                    AbstractC0335i0.a("Recorder", "pause() called on a recording that is no longer active: " + z6.D());
                    return;
                }
                int i6 = h.f5783a[this.f5749i.ordinal()];
                if (i6 == 2) {
                    l0(l.PAUSED);
                    final k kVar = this.f5752l;
                    this.f5741d.execute(new Runnable() { // from class: X.M
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q.this.X(kVar);
                        }
                    });
                } else if (i6 == 4) {
                    l0(l.PENDING_PAUSED);
                } else if (i6 == 7 || i6 == 9) {
                    throw new IllegalStateException("Called pause() from invalid state: " + this.f5749i);
                }
            } finally {
            }
        }
    }

    public final void X(k kVar) {
        if (this.f5755o != kVar || this.f5756p) {
            return;
        }
        if (I()) {
            this.f5714F.c();
        }
        this.f5712D.c();
        k kVar2 = this.f5755o;
        kVar2.t0(x0.d(kVar2.a0(), C()));
    }

    public C0810t Y(Context context, C0807p c0807p) {
        return Z(context, c0807p);
    }

    public final C0810t Z(Context context, r rVar) {
        y0.g.g(rVar, "The OutputOptions cannot be null.");
        return new C0810t(context, this, rVar);
    }

    @Override // X.w0
    public void a(H0 h02) {
        b(h02, T0.UPTIME);
    }

    public final void a0() {
        C0989n c0989n = this.f5711C;
        if (c0989n == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f5711C = null;
        AbstractC0335i0.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(c0989n.hashCode())));
        N.f.b(c0989n.w(), new c(c0989n), M.c.b());
    }

    @Override // X.w0
    public void b(final H0 h02, final T0 t02) {
        synchronized (this.f5747g) {
            try {
                AbstractC0335i0.a("Recorder", "Surface is requested in state: " + this.f5749i + ", Current surface: " + this.f5751k);
                if (this.f5749i == l.ERROR) {
                    l0(l.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5741d.execute(new Runnable() { // from class: X.F
            @Override // java.lang.Runnable
            public final void run() {
                Q.this.U(h02, t02);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    public void b0(int i6, Throwable th, boolean z6) {
        boolean z7;
        boolean z8;
        synchronized (this.f5747g) {
            try {
                z7 = true;
                z8 = false;
                switch (h.f5783a[this.f5749i.ordinal()]) {
                    case 1:
                    case 2:
                        y0.g.i(this.f5755o != null, "In-progress recording shouldn't be null when in state " + this.f5749i);
                        if (this.f5752l != this.f5755o) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!K()) {
                            l0(l.RESETTING);
                            z8 = true;
                            z7 = false;
                        }
                        break;
                    case 3:
                    case 4:
                        B0(l.RESETTING);
                        break;
                    case 5:
                    default:
                        z7 = false;
                        break;
                    case 6:
                        l0(l.RESETTING);
                        z7 = false;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z7) {
            if (z8) {
                v0(this.f5755o, -1L, i6, th);
            }
        } else if (z6) {
            d0();
        } else {
            c0();
        }
    }

    @Override // X.w0
    public B0 c() {
        return this.f5710B;
    }

    public final void c0() {
        if (this.f5714F != null) {
            AbstractC0335i0.a("Recorder", "Releasing audio encoder.");
            this.f5714F.release();
            this.f5714F = null;
            this.f5715G = null;
        }
        if (this.f5711C != null) {
            a0();
        }
        i0(i.INITIALIZING);
        d0();
    }

    @Override // X.w0
    public B0 d() {
        return this.f5735a;
    }

    public final void d0() {
        if (this.f5712D != null) {
            AbstractC0335i0.a("Recorder", "Releasing video encoder.");
            x0();
        }
        S();
    }

    @Override // X.w0
    public void e(final w0.a aVar) {
        this.f5741d.execute(new Runnable() { // from class: X.G
            @Override // java.lang.Runnable
            public final void run() {
                Q.this.T(aVar);
            }
        });
    }

    public final void e0() {
        if (f5701g0.contains(this.f5749i)) {
            l0(this.f5750j);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f5749i);
    }

    @Override // X.w0
    public c0 f(F.r rVar) {
        return F(rVar);
    }

    public void f0(Z z6) {
        synchronized (this.f5747g) {
            try {
                if (!L(z6, this.f5753m) && !L(z6, this.f5752l)) {
                    AbstractC0335i0.a("Recorder", "resume() called on a recording that is no longer active: " + z6.D());
                    return;
                }
                int i6 = h.f5783a[this.f5749i.ordinal()];
                if (i6 == 1) {
                    l0(l.RECORDING);
                    final k kVar = this.f5752l;
                    this.f5741d.execute(new Runnable() { // from class: X.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q.this.g0(kVar);
                        }
                    });
                } else if (i6 == 3) {
                    l0(l.PENDING_RECORDING);
                } else if (i6 == 7 || i6 == 9) {
                    throw new IllegalStateException("Called resume() from invalid state: " + this.f5749i);
                }
            } finally {
            }
        }
    }

    public final void g0(k kVar) {
        if (this.f5755o != kVar || this.f5756p) {
            return;
        }
        if (I()) {
            this.f5714F.start();
        }
        InterfaceC1229l interfaceC1229l = this.f5712D;
        if (interfaceC1229l == null) {
            this.f5746f0 = true;
            return;
        }
        interfaceC1229l.start();
        k kVar2 = this.f5755o;
        kVar2.t0(x0.e(kVar2.a0(), C()));
    }

    public final D6.g h0() {
        AbstractC0335i0.a("Recorder", "Try to safely release video encoder: " + this.f5712D);
        return this.f5740c0.q();
    }

    public void i0(i iVar) {
        AbstractC0335i0.a("Recorder", "Transitioning audio state: " + this.f5716H + " --> " + iVar);
        this.f5716H = iVar;
    }

    public void j0(H0.h hVar) {
        AbstractC0335i0.a("Recorder", "Update stream transformation info: " + hVar);
        this.f5757q = hVar;
        synchronized (this.f5747g) {
            this.f5735a.h(b0.e(this.f5751k, H(this.f5749i), hVar));
        }
    }

    public void k0(Surface surface) {
        int hashCode;
        if (this.f5765y == surface) {
            return;
        }
        this.f5765y = surface;
        synchronized (this.f5747g) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            m0(hashCode);
        }
    }

    public void l0(l lVar) {
        if (this.f5749i == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        AbstractC0335i0.a("Recorder", "Transitioning Recorder internal state: " + this.f5749i + " --> " + lVar);
        Set set = f5701g0;
        b0.a aVar = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f5749i)) {
                if (!f5702h0.contains(this.f5749i)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f5749i);
                }
                l lVar2 = this.f5749i;
                this.f5750j = lVar2;
                aVar = H(lVar2);
            }
        } else if (this.f5750j != null) {
            this.f5750j = null;
        }
        this.f5749i = lVar;
        if (aVar == null) {
            aVar = H(lVar);
        }
        this.f5735a.h(b0.e(this.f5751k, aVar, this.f5757q));
    }

    public final void m0(int i6) {
        if (this.f5751k == i6) {
            return;
        }
        AbstractC0335i0.a("Recorder", "Transitioning streamId: " + this.f5751k + " --> " + i6);
        this.f5751k = i6;
        this.f5735a.h(b0.e(i6, H(this.f5749i), this.f5757q));
    }

    public void n0(k kVar) {
        if (this.f5709A != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (I() && this.f5731W.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC1226i interfaceC1226i = this.f5730V;
        if (interfaceC1226i == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f5730V = null;
            List B6 = B(interfaceC1226i.V());
            long size = interfaceC1226i.size();
            Iterator it = B6.iterator();
            while (it.hasNext()) {
                size += ((InterfaceC1226i) it.next()).size();
            }
            long j6 = this.f5726R;
            if (j6 != 0 && size > j6) {
                AbstractC0335i0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f5726R)));
                Q(kVar, 2, null);
                interfaceC1226i.close();
                return;
            }
            try {
                AbstractC0808q abstractC0808q = (AbstractC0808q) D(this.f5710B);
                MediaMuxer s02 = kVar.s0(abstractC0808q.c() == -1 ? w0(this.f5759s, AbstractC0808q.g(f5705k0.c())) : AbstractC0808q.g(abstractC0808q.c()), new InterfaceC2343a() { // from class: X.y
                    @Override // y0.InterfaceC2343a
                    public final void accept(Object obj) {
                        Q.this.f5717I = (Uri) obj;
                    }
                });
                H0.h hVar = this.f5758r;
                if (hVar != null) {
                    j0(hVar);
                    s02.setOrientationHint(hVar.c());
                }
                Location c6 = kVar.a0().c();
                if (c6 != null) {
                    try {
                        Pair a6 = AbstractC1311a.a(c6.getLatitude(), c6.getLongitude());
                        s02.setLocation((float) ((Double) a6.first).doubleValue(), (float) ((Double) a6.second).doubleValue());
                    } catch (IllegalArgumentException e6) {
                        s02.release();
                        Q(kVar, 5, e6);
                        interfaceC1226i.close();
                        return;
                    }
                }
                this.f5762v = Integer.valueOf(s02.addTrack(this.f5713E.a()));
                if (I()) {
                    this.f5761u = Integer.valueOf(s02.addTrack(this.f5715G.a()));
                }
                s02.start();
                this.f5709A = s02;
                D0(interfaceC1226i, kVar);
                Iterator it2 = B6.iterator();
                while (it2.hasNext()) {
                    C0((InterfaceC1226i) it2.next(), kVar);
                }
                interfaceC1226i.close();
            } catch (IOException e7) {
                Q(kVar, 5, e7);
            }
        } catch (Throwable th) {
            if (interfaceC1226i != null) {
                try {
                    interfaceC1226i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void o0(k kVar) {
        AbstractC0808q abstractC0808q = (AbstractC0808q) D(this.f5710B);
        AbstractC1175e c6 = AbstractC1172b.c(abstractC0808q, this.f5759s);
        T0 t02 = T0.UPTIME;
        AbstractC0976a d6 = AbstractC1172b.d(c6, abstractC0808q.b());
        if (this.f5711C != null) {
            a0();
        }
        C0989n p02 = p0(kVar, d6);
        this.f5711C = p02;
        AbstractC0335i0.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(p02.hashCode())));
        InterfaceC1229l a6 = this.f5745f.a(this.f5739c, AbstractC1172b.b(c6, t02, d6, abstractC0808q.b()));
        this.f5714F = a6;
        InterfaceC1229l.b b6 = a6.b();
        if (!(b6 instanceof InterfaceC1229l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.f5711C.B((InterfaceC1229l.a) b6);
    }

    public final C0989n p0(k kVar, AbstractC0976a abstractC0976a) {
        return kVar.r0(abstractC0976a, f5708n0);
    }

    public final void q0(final H0 h02, final T0 t02) {
        h0().c(new Runnable() { // from class: X.C
            @Override // java.lang.Runnable
            public final void run() {
                Q.j(Q.this, h02, t02);
            }
        }, this.f5741d);
    }

    public Z r0(C0810t c0810t) {
        long j6;
        k kVar;
        int i6;
        k kVar2;
        IOException e6;
        y0.g.g(c0810t, "The given PendingRecording cannot be null.");
        synchronized (this.f5747g) {
            try {
                j6 = this.f5754n + 1;
                this.f5754n = j6;
                kVar = null;
                i6 = 0;
                switch (h.f5783a[this.f5749i.ordinal()]) {
                    case 1:
                    case 2:
                        kVar2 = this.f5752l;
                        kVar = kVar2;
                        e6 = null;
                        break;
                    case 3:
                    case 4:
                        kVar2 = (k) y0.g.f(this.f5753m);
                        kVar = kVar2;
                        e6 = null;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        l lVar = this.f5749i;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            y0.g.i(this.f5752l == null && this.f5753m == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            k R5 = k.R(c0810t, j6);
                            R5.o0(c0810t.a());
                            this.f5753m = R5;
                            l lVar3 = this.f5749i;
                            if (lVar3 == lVar2) {
                                l0(l.PENDING_RECORDING);
                                this.f5741d.execute(new Runnable() { // from class: X.J
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Q.this.y0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                l0(l.PENDING_RECORDING);
                                this.f5741d.execute(new Runnable() { // from class: X.K
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Q.r(Q.this);
                                    }
                                });
                            } else {
                                l0(l.PENDING_RECORDING);
                            }
                            e6 = null;
                            break;
                        } catch (IOException e7) {
                            e6 = e7;
                            i6 = 5;
                            break;
                        }
                        break;
                    default:
                        e6 = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i6 == 0) {
            return Z.c(c0810t, j6);
        }
        AbstractC0335i0.c("Recorder", "Recording was started when the Recorder had encountered error " + e6);
        z(k.R(c0810t, j6), i6, e6);
        return Z.a(c0810t, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(X.Q.k r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q.s0(X.Q$k):void");
    }

    public final void t0(k kVar, boolean z6) {
        s0(kVar);
        if (z6) {
            X(kVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u0(X.Z r13, int r14, java.lang.Throwable r15) {
        /*
            r12 = this;
            java.lang.Object r1 = r12.f5747g
            monitor-enter(r1)
            X.Q$k r0 = r12.f5753m     // Catch: java.lang.Throwable -> La7
            boolean r0 = L(r13, r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L34
            X.Q$k r0 = r12.f5752l     // Catch: java.lang.Throwable -> L2f
            boolean r0 = L(r13, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L34
            java.lang.String r14 = "Recorder"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r15.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            r15.append(r0)     // Catch: java.lang.Throwable -> L2f
            X.r r13 = r13.D()     // Catch: java.lang.Throwable -> L2f
            r15.append(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L2f
            F.AbstractC0335i0.a(r14, r13)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto Laa
        L34:
            int[] r0 = X.Q.h.f5783a     // Catch: java.lang.Throwable -> La7
            X.Q$l r2 = r12.f5749i     // Catch: java.lang.Throwable -> La7
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La7
            r0 = r0[r2]     // Catch: java.lang.Throwable -> La7
            r2 = 0
            switch(r0) {
                case 1: goto L6b;
                case 2: goto L6b;
                case 3: goto L56;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L4c;
                case 7: goto L44;
                case 8: goto L42;
                case 9: goto L44;
                default: goto L42;
            }
        L42:
            r6 = r12
            goto L68
        L44:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r14 = "Calling stop() while idling or initializing is invalid."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L2f
            throw r13     // Catch: java.lang.Throwable -> L2f
        L4c:
            X.Q$k r0 = r12.f5752l     // Catch: java.lang.Throwable -> L2f
            boolean r13 = L(r13, r0)     // Catch: java.lang.Throwable -> L2f
            y0.g.h(r13)     // Catch: java.lang.Throwable -> L2f
            goto L42
        L56:
            X.Q$k r0 = r12.f5753m     // Catch: java.lang.Throwable -> L2f
            boolean r13 = L(r13, r0)     // Catch: java.lang.Throwable -> L2f
            y0.g.h(r13)     // Catch: java.lang.Throwable -> L2f
            X.Q$k r13 = r12.f5753m     // Catch: java.lang.Throwable -> L2f
            r12.f5753m = r2     // Catch: java.lang.Throwable -> L2f
            r12.e0()     // Catch: java.lang.Throwable -> L2f
            r6 = r12
            r2 = r13
        L68:
            r10 = r14
            r11 = r15
            goto L89
        L6b:
            X.Q$l r13 = X.Q.l.STOPPING     // Catch: java.lang.Throwable -> La7
            r12.l0(r13)     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> La7
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La7
            long r8 = r13.toMicros(r3)     // Catch: java.lang.Throwable -> La7
            X.Q$k r7 = r12.f5752l     // Catch: java.lang.Throwable -> La7
            java.util.concurrent.Executor r13 = r12.f5741d     // Catch: java.lang.Throwable -> La7
            X.N r5 = new X.N     // Catch: java.lang.Throwable -> La7
            r6 = r12
            r10 = r14
            r11 = r15
            r5.<init>()     // Catch: java.lang.Throwable -> La4
            r13.execute(r5)     // Catch: java.lang.Throwable -> La4
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La3
            r13 = 10
            if (r10 != r13) goto L97
            java.lang.String r13 = "Recorder"
            java.lang.String r14 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            F.AbstractC0335i0.c(r13, r14)
        L97:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Recording was stopped before any data could be produced."
            r13.<init>(r14, r11)
            r14 = 8
            r12.z(r2, r14, r13)
        La3:
            return
        La4:
            r0 = move-exception
        La5:
            r13 = r0
            goto Laa
        La7:
            r0 = move-exception
            r6 = r12
            goto La5
        Laa:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q.u0(X.Z, int, java.lang.Throwable):void");
    }

    public final void v() {
        while (!this.f5731W.isEmpty()) {
            this.f5731W.a();
        }
    }

    public void v0(k kVar, long j6, int i6, Throwable th) {
        if (this.f5755o != kVar || this.f5756p) {
            return;
        }
        this.f5756p = true;
        this.f5728T = i6;
        this.f5729U = th;
        if (I()) {
            v();
            this.f5714F.a(j6);
        }
        InterfaceC1226i interfaceC1226i = this.f5730V;
        if (interfaceC1226i != null) {
            interfaceC1226i.close();
            this.f5730V = null;
        }
        if (this.f5734Z != w0.a.ACTIVE_NON_STREAMING) {
            final InterfaceC1229l interfaceC1229l = this.f5712D;
            this.f5736a0 = M.c.e().schedule(new Runnable() { // from class: X.A
                @Override // java.lang.Runnable
                public final void run() {
                    Q.this.f5741d.execute(new Runnable() { // from class: X.D
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q.h(InterfaceC1229l.this);
                        }
                    });
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        } else {
            N(this.f5712D);
        }
        this.f5712D.a(j6);
    }

    public final AbstractC0808q w(AbstractC0808q abstractC0808q) {
        AbstractC0808q.a i6 = abstractC0808q.i();
        if (abstractC0808q.d().b() == -1) {
            i6.b(new InterfaceC2343a() { // from class: X.H
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    ((y0.a) obj).b(Q.f5704j0.b());
                }
            });
        }
        return i6.a();
    }

    public final void x(H0 h02, T0 t02) {
        if (h02.p()) {
            AbstractC0335i0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        h02.r(this.f5741d, new H0.i() { // from class: X.L
            @Override // F.H0.i
            public final void a(H0.h hVar) {
                Q.this.f5758r = hVar;
            }
        });
        Size n6 = h02.n();
        F.C l6 = h02.l();
        c0 F6 = F(h02.j().b());
        AbstractC0811u b6 = F6.b(n6, l6);
        AbstractC0335i0.a("Recorder", "Using supported quality of " + b6 + " for surface size " + n6);
        if (b6 != AbstractC0811u.f5980g) {
            Z.g c6 = F6.c(b6, l6);
            this.f5759s = c6;
            if (c6 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        q0(h02, t02);
    }

    public final void x0() {
        v0 v0Var = this.f5742d0;
        if (v0Var == null) {
            h0();
            return;
        }
        y0.g.h(v0Var.m() == this.f5712D);
        AbstractC0335i0.a("Recorder", "Releasing video encoder: " + this.f5712D);
        this.f5742d0.r();
        this.f5742d0 = null;
        this.f5712D = null;
        this.f5713E = null;
        k0(null);
    }

    public void y(int i6, Throwable th) {
        if (this.f5755o == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f5709A;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f5709A.release();
            } catch (IllegalStateException e6) {
                AbstractC0335i0.c("Recorder", "MediaMuxer failed to stop or release with error: " + e6.getMessage());
                if (i6 == 0) {
                    i6 = 1;
                }
            }
            this.f5709A = null;
        } else if (i6 == 0) {
            i6 = 8;
        }
        this.f5755o.I(this.f5717I);
        r a02 = this.f5755o.a0();
        a0 C6 = C();
        AbstractC0809s b6 = AbstractC0809s.b(this.f5717I);
        this.f5755o.t0(i6 == 0 ? x0.a(a02, C6, b6) : x0.b(a02, C6, b6, i6, th));
        k kVar = this.f5755o;
        this.f5755o = null;
        this.f5756p = false;
        this.f5761u = null;
        this.f5762v = null;
        this.f5760t.clear();
        this.f5717I = Uri.EMPTY;
        this.f5718J = 0L;
        this.f5719K = 0L;
        this.f5720L = LongCompanionObject.MAX_VALUE;
        this.f5723O = LongCompanionObject.MAX_VALUE;
        this.f5724P = LongCompanionObject.MAX_VALUE;
        this.f5725Q = LongCompanionObject.MAX_VALUE;
        this.f5728T = 1;
        this.f5729U = null;
        this.f5732X = null;
        this.f5744e0 = 0.0d;
        v();
        j0(null);
        int i7 = h.f5784b[this.f5716H.ordinal()];
        if (i7 == 1 || i7 == 2) {
            i0(i.INITIALIZING);
        } else if (i7 == 3 || i7 == 4) {
            i0(i.IDLING);
            this.f5711C.F();
        } else if (i7 == 5) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        R(kVar);
    }

    public void y0() {
        int i6;
        boolean z6;
        k kVar;
        boolean z7;
        k kVar2;
        Throwable th;
        synchronized (this.f5747g) {
            try {
                int i7 = h.f5783a[this.f5749i.ordinal()];
                i6 = 4;
                z6 = false;
                kVar = null;
                if (i7 == 3) {
                    z7 = true;
                } else if (i7 != 4) {
                    i6 = 0;
                    th = null;
                    kVar2 = th;
                } else {
                    z7 = false;
                }
                if (this.f5752l == null && !this.f5738b0) {
                    if (this.f5734Z == w0.a.INACTIVE) {
                        kVar2 = this.f5753m;
                        this.f5753m = null;
                        e0();
                        z6 = z7;
                        th = f5706l0;
                    } else if (this.f5712D != null) {
                        i6 = 0;
                        z6 = z7;
                        th = null;
                        kVar = M(this.f5749i);
                        kVar2 = th;
                    }
                }
                i6 = 0;
                kVar2 = null;
                z6 = z7;
                th = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kVar != null) {
            t0(kVar, z6);
        } else if (kVar2 != null) {
            z(kVar2, i6, th);
        }
    }

    public final void z(k kVar, int i6, Throwable th) {
        Uri uri = Uri.EMPTY;
        kVar.I(uri);
        kVar.t0(x0.b(kVar.a0(), a0.d(0L, 0L, AbstractC0793b.d(1, this.f5732X, 0.0d)), AbstractC0809s.b(uri), i6, th));
    }

    public final void z0(final k kVar, boolean z6) {
        if (!this.f5760t.isEmpty()) {
            D6.g c6 = N.f.c(this.f5760t);
            if (!c6.isDone()) {
                c6.cancel(true);
            }
            this.f5760t.clear();
        }
        this.f5760t.add(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.O
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return Q.s(Q.this, kVar, aVar);
            }
        }));
        if (I() && !z6) {
            this.f5760t.add(AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: X.P
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return Q.t(Q.this, kVar, aVar);
                }
            }));
        }
        N.f.b(N.f.c(this.f5760t), new g(), M.c.b());
    }
}
