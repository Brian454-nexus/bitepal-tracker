package i1;

import E1.AbstractC0300b;
import E1.AbstractC0301c;
import E1.AbstractC0313o;
import Z0.C0830b;
import Z0.C0833e;
import a1.C0998a;
import a1.C1003f;
import a1.C1004g;
import a1.InterfaceC0999b;
import a1.InterfaceC1000c;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1124f;
import c1.InterfaceC1121c;
import g1.InterfaceC1344m;
import h1.v1;
import i1.C1483A;
import i1.C1492i;
import i1.InterfaceC1507y;
import i1.M;
import i1.V;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.io.ConstantsKt;
import z6.g0;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class M implements InterfaceC1507y {

    /* renamed from: n0, reason: collision with root package name */
    public static boolean f15747n0 = false;

    /* renamed from: o0, reason: collision with root package name */
    public static final Object f15748o0 = new Object();

    /* renamed from: p0, reason: collision with root package name */
    public static ExecutorService f15749p0;

    /* renamed from: q0, reason: collision with root package name */
    public static int f15750q0;

    /* renamed from: A, reason: collision with root package name */
    public k f15751A;

    /* renamed from: B, reason: collision with root package name */
    public C0830b f15752B;

    /* renamed from: C, reason: collision with root package name */
    public j f15753C;

    /* renamed from: D, reason: collision with root package name */
    public j f15754D;

    /* renamed from: E, reason: collision with root package name */
    public Z0.B f15755E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f15756F;

    /* renamed from: G, reason: collision with root package name */
    public ByteBuffer f15757G;

    /* renamed from: H, reason: collision with root package name */
    public int f15758H;

    /* renamed from: I, reason: collision with root package name */
    public long f15759I;

    /* renamed from: J, reason: collision with root package name */
    public long f15760J;

    /* renamed from: K, reason: collision with root package name */
    public long f15761K;

    /* renamed from: L, reason: collision with root package name */
    public long f15762L;

    /* renamed from: M, reason: collision with root package name */
    public int f15763M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15764N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f15765O;

    /* renamed from: P, reason: collision with root package name */
    public long f15766P;

    /* renamed from: Q, reason: collision with root package name */
    public float f15767Q;

    /* renamed from: R, reason: collision with root package name */
    public ByteBuffer f15768R;

    /* renamed from: S, reason: collision with root package name */
    public int f15769S;

    /* renamed from: T, reason: collision with root package name */
    public ByteBuffer f15770T;

    /* renamed from: U, reason: collision with root package name */
    public byte[] f15771U;

    /* renamed from: V, reason: collision with root package name */
    public int f15772V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f15773W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f15774X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f15775Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f15776Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15777a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f15778a0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1000c f15779b;

    /* renamed from: b0, reason: collision with root package name */
    public int f15780b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15781c;

    /* renamed from: c0, reason: collision with root package name */
    public C0833e f15782c0;

    /* renamed from: d, reason: collision with root package name */
    public final B f15783d;

    /* renamed from: d0, reason: collision with root package name */
    public C1493j f15784d0;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f15785e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f15786e0;

    /* renamed from: f, reason: collision with root package name */
    public final z6.w f15787f;

    /* renamed from: f0, reason: collision with root package name */
    public long f15788f0;

    /* renamed from: g, reason: collision with root package name */
    public final z6.w f15789g;

    /* renamed from: g0, reason: collision with root package name */
    public long f15790g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1124f f15791h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f15792h0;

    /* renamed from: i, reason: collision with root package name */
    public final C1483A f15793i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f15794i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f15795j;

    /* renamed from: j0, reason: collision with root package name */
    public Looper f15796j0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f15797k;

    /* renamed from: k0, reason: collision with root package name */
    public long f15798k0;

    /* renamed from: l, reason: collision with root package name */
    public int f15799l;

    /* renamed from: l0, reason: collision with root package name */
    public long f15800l0;

    /* renamed from: m, reason: collision with root package name */
    public n f15801m;

    /* renamed from: m0, reason: collision with root package name */
    public Handler f15802m0;

    /* renamed from: n, reason: collision with root package name */
    public final l f15803n;

    /* renamed from: o, reason: collision with root package name */
    public final l f15804o;

    /* renamed from: p, reason: collision with root package name */
    public final e f15805p;

    /* renamed from: q, reason: collision with root package name */
    public final d f15806q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1344m.a f15807r;

    /* renamed from: s, reason: collision with root package name */
    public v1 f15808s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1507y.d f15809t;

    /* renamed from: u, reason: collision with root package name */
    public g f15810u;

    /* renamed from: v, reason: collision with root package name */
    public g f15811v;

    /* renamed from: w, reason: collision with root package name */
    public C0998a f15812w;

    /* renamed from: x, reason: collision with root package name */
    public AudioTrack f15813x;

    /* renamed from: y, reason: collision with root package name */
    public C1488e f15814y;

    /* renamed from: z, reason: collision with root package name */
    public C1492i f15815z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, C1493j c1493j) {
            audioTrack.setPreferredDevice(c1493j == null ? null : c1493j.f15939a);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static void a(AudioTrack audioTrack, v1 v1Var) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a6 = v1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a6.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        C1494k a(Z0.q qVar, C0830b c0830b);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f15816a = new V.a().h();

        int a(int i6, int i7, int i8, int i9, int i10, int i11, double d6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Context f15817a;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1000c f15819c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15820d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15821e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15822f;

        /* renamed from: h, reason: collision with root package name */
        public d f15824h;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC1344m.a f15825i;

        /* renamed from: b, reason: collision with root package name */
        public C1488e f15818b = C1488e.f15915c;

        /* renamed from: g, reason: collision with root package name */
        public e f15823g = e.f15816a;

        public f(Context context) {
            this.f15817a = context;
        }

        public M i() {
            AbstractC1119a.g(!this.f15822f);
            this.f15822f = true;
            if (this.f15819c == null) {
                this.f15819c = new h(new InterfaceC0999b[0]);
            }
            if (this.f15824h == null) {
                this.f15824h = new D(this.f15817a);
            }
            return new M(this);
        }

        public f j(boolean z6) {
            this.f15821e = z6;
            return this;
        }

        public f k(boolean z6) {
            this.f15820d = z6;
            return this;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.q f15826a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15827b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15828c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15829d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15830e;

        /* renamed from: f, reason: collision with root package name */
        public final int f15831f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15832g;

        /* renamed from: h, reason: collision with root package name */
        public final int f15833h;

        /* renamed from: i, reason: collision with root package name */
        public final C0998a f15834i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f15835j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f15836k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f15837l;

        public g(Z0.q qVar, int i6, int i7, int i8, int i9, int i10, int i11, int i12, C0998a c0998a, boolean z6, boolean z7, boolean z8) {
            this.f15826a = qVar;
            this.f15827b = i6;
            this.f15828c = i7;
            this.f15829d = i8;
            this.f15830e = i9;
            this.f15831f = i10;
            this.f15832g = i11;
            this.f15833h = i12;
            this.f15834i = c0998a;
            this.f15835j = z6;
            this.f15836k = z7;
            this.f15837l = z8;
        }

        public static AudioAttributes j(C0830b c0830b, boolean z6) {
            return z6 ? k() : c0830b.a().f6870a;
        }

        public static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(C0830b c0830b, int i6) {
            try {
                AudioTrack e6 = e(c0830b, i6);
                int state = e6.getState();
                if (state == 1) {
                    return e6;
                }
                try {
                    e6.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC1507y.c(state, this.f15830e, this.f15831f, this.f15833h, this.f15826a, m(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e7) {
                throw new InterfaceC1507y.c(0, this.f15830e, this.f15831f, this.f15833h, this.f15826a, m(), e7);
            }
        }

        public InterfaceC1507y.a b() {
            return new InterfaceC1507y.a(this.f15832g, this.f15830e, this.f15831f, this.f15837l, this.f15828c == 1, this.f15833h);
        }

        public boolean c(g gVar) {
            return gVar.f15828c == this.f15828c && gVar.f15832g == this.f15832g && gVar.f15830e == this.f15830e && gVar.f15831f == this.f15831f && gVar.f15829d == this.f15829d && gVar.f15835j == this.f15835j && gVar.f15836k == this.f15836k;
        }

        public g d(int i6) {
            return new g(this.f15826a, this.f15827b, this.f15828c, this.f15829d, this.f15830e, this.f15831f, this.f15832g, i6, this.f15834i, this.f15835j, this.f15836k, this.f15837l);
        }

        public final AudioTrack e(C0830b c0830b, int i6) {
            int i7 = AbstractC1117K.f10560a;
            return i7 >= 29 ? g(c0830b, i6) : i7 >= 21 ? f(c0830b, i6) : h(c0830b, i6);
        }

        public final AudioTrack f(C0830b c0830b, int i6) {
            return new AudioTrack(j(c0830b, this.f15837l), AbstractC1117K.M(this.f15830e, this.f15831f, this.f15832g), this.f15833h, 1, i6);
        }

        public final AudioTrack g(C0830b c0830b, int i6) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(j(c0830b, this.f15837l)).setAudioFormat(AbstractC1117K.M(this.f15830e, this.f15831f, this.f15832g)).setTransferMode(1).setBufferSizeInBytes(this.f15833h).setSessionId(i6).setOffloadedPlayback(this.f15828c == 1);
            return offloadedPlayback.build();
        }

        public final AudioTrack h(C0830b c0830b, int i6) {
            int m02 = AbstractC1117K.m0(c0830b.f6866c);
            return i6 == 0 ? new AudioTrack(m02, this.f15830e, this.f15831f, this.f15832g, this.f15833h, 1) : new AudioTrack(m02, this.f15830e, this.f15831f, this.f15832g, this.f15833h, 1, i6);
        }

        public long i(long j6) {
            return AbstractC1117K.V0(j6, this.f15830e);
        }

        public long l(long j6) {
            return AbstractC1117K.V0(j6, this.f15826a.f6967C);
        }

        public boolean m() {
            return this.f15828c == 1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h implements InterfaceC1000c {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0999b[] f15838a;

        /* renamed from: b, reason: collision with root package name */
        public final Y f15839b;

        /* renamed from: c, reason: collision with root package name */
        public final C1003f f15840c;

        public h(InterfaceC0999b... interfaceC0999bArr) {
            this(interfaceC0999bArr, new Y(), new C1003f());
        }

        @Override // a1.InterfaceC1000c
        public Z0.B a(Z0.B b6) {
            this.f15840c.i(b6.f6620a);
            this.f15840c.h(b6.f6621b);
            return b6;
        }

        @Override // a1.InterfaceC1000c
        public long b(long j6) {
            return this.f15840c.isActive() ? this.f15840c.g(j6) : j6;
        }

        @Override // a1.InterfaceC1000c
        public long c() {
            return this.f15839b.u();
        }

        @Override // a1.InterfaceC1000c
        public boolean d(boolean z6) {
            this.f15839b.D(z6);
            return z6;
        }

        @Override // a1.InterfaceC1000c
        public InterfaceC0999b[] e() {
            return this.f15838a;
        }

        public h(InterfaceC0999b[] interfaceC0999bArr, Y y6, C1003f c1003f) {
            InterfaceC0999b[] interfaceC0999bArr2 = new InterfaceC0999b[interfaceC0999bArr.length + 2];
            this.f15838a = interfaceC0999bArr2;
            System.arraycopy(interfaceC0999bArr, 0, interfaceC0999bArr2, 0, interfaceC0999bArr.length);
            this.f15839b = y6;
            this.f15840c = c1003f;
            interfaceC0999bArr2[interfaceC0999bArr.length] = y6;
            interfaceC0999bArr2[interfaceC0999bArr.length + 1] = c1003f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i extends RuntimeException {
        public i(String str) {
            super(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final Z0.B f15841a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15842b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15843c;

        public j(Z0.B b6, long j6, long j7) {
            this.f15841a = b6;
            this.f15842b = j6;
            this.f15843c = j7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f15844a;

        /* renamed from: b, reason: collision with root package name */
        public final C1492i f15845b;

        /* renamed from: c, reason: collision with root package name */
        public AudioRouting.OnRoutingChangedListener f15846c = new AudioRouting.OnRoutingChangedListener() { // from class: i1.Q
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                M.k.this.b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, C1492i c1492i) {
            this.f15844a = audioTrack;
            this.f15845b = c1492i;
            audioTrack.addOnRoutingChangedListener(this.f15846c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f15846c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.f15845b.i(audioRouting.getRoutedDevice());
        }

        public void c() {
            this.f15844a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) AbstractC1119a.e(this.f15846c));
            this.f15846c = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final long f15847a;

        /* renamed from: b, reason: collision with root package name */
        public Exception f15848b;

        /* renamed from: c, reason: collision with root package name */
        public long f15849c;

        public l(long j6) {
            this.f15847a = j6;
        }

        public void a() {
            this.f15848b = null;
        }

        public void b(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f15848b == null) {
                this.f15848b = exc;
                this.f15849c = this.f15847a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f15849c) {
                Exception exc2 = this.f15848b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f15848b;
                a();
                throw exc3;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class m implements C1483A.a {
        public m() {
        }

        @Override // i1.C1483A.a
        public void a(long j6) {
            if (M.this.f15809t != null) {
                M.this.f15809t.a(j6);
            }
        }

        @Override // i1.C1483A.a
        public void b(int i6, long j6) {
            if (M.this.f15809t != null) {
                M.this.f15809t.h(i6, j6, SystemClock.elapsedRealtime() - M.this.f15790g0);
            }
        }

        @Override // i1.C1483A.a
        public void c(long j6) {
            AbstractC1133o.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j6);
        }

        @Override // i1.C1483A.a
        public void d(long j6, long j7, long j8, long j9) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j6 + ", " + j7 + ", " + j8 + ", " + j9 + ", " + M.this.V() + ", " + M.this.W();
            if (M.f15747n0) {
                throw new i(str);
            }
            AbstractC1133o.h("DefaultAudioSink", str);
        }

        @Override // i1.C1483A.a
        public void e(long j6, long j7, long j8, long j9) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j6 + ", " + j7 + ", " + j8 + ", " + j9 + ", " + M.this.V() + ", " + M.this.W();
            if (M.f15747n0) {
                throw new i(str);
            }
            AbstractC1133o.h("DefaultAudioSink", str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class n {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f15851a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f15852b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ M f15854a;

            public a(M m6) {
                this.f15854a = m6;
            }

            public void onDataRequest(AudioTrack audioTrack, int i6) {
                if (audioTrack.equals(M.this.f15813x) && M.this.f15809t != null && M.this.f15776Z) {
                    M.this.f15809t.k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f15813x)) {
                    M.this.f15775Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(M.this.f15813x) && M.this.f15809t != null && M.this.f15776Z) {
                    M.this.f15809t.k();
                }
            }
        }

        public n() {
            this.f15852b = new a(M.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f15851a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new U(handler), this.f15852b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f15852b);
            this.f15851a.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void D(AudioTrack audioTrack, final InterfaceC1507y.d dVar, Handler handler, final InterfaceC1507y.a aVar, C1124f c1124f) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: i1.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1507y.d.this.e(aVar);
                    }
                });
            }
            c1124f.e();
            synchronized (f15748o0) {
                try {
                    int i6 = f15750q0 - 1;
                    f15750q0 = i6;
                    if (i6 == 0) {
                        f15749p0.shutdown();
                        f15749p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: i1.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1507y.d.this.e(aVar);
                    }
                });
            }
            c1124f.e();
            synchronized (f15748o0) {
                try {
                    int i7 = f15750q0 - 1;
                    f15750q0 = i7;
                    if (i7 == 0) {
                        f15749p0.shutdown();
                        f15749p0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static int T(int i6, int i7, int i8) {
        int minBufferSize = AudioTrack.getMinBufferSize(i6, i7, i8);
        AbstractC1119a.g(minBufferSize != -2);
        return minBufferSize;
    }

    public static int U(int i6, ByteBuffer byteBuffer) {
        if (i6 == 20) {
            return E1.H.h(byteBuffer);
        }
        if (i6 != 30) {
            switch (i6) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int m6 = E1.F.m(AbstractC1117K.P(byteBuffer, byteBuffer.position()));
                    if (m6 != -1) {
                        return m6;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i6) {
                        case 14:
                            int b6 = AbstractC0300b.b(byteBuffer);
                            if (b6 == -1) {
                                return 0;
                            }
                            return AbstractC0300b.i(byteBuffer, b6) * 16;
                        case 15:
                            return ConstantsKt.MINIMUM_BLOCK_SIZE;
                        case 16:
                            return 1024;
                        case 17:
                            return AbstractC0301c.c(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i6);
                    }
            }
            return AbstractC0300b.e(byteBuffer);
        }
        return AbstractC0313o.f(byteBuffer);
    }

    public static boolean Z(int i6) {
        return (AbstractC1117K.f10560a >= 24 && i6 == -6) || i6 == -32;
    }

    public static boolean b0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (AbstractC1117K.f10560a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public static void j0(final AudioTrack audioTrack, final C1124f c1124f, final InterfaceC1507y.d dVar, final InterfaceC1507y.a aVar) {
        c1124f.c();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f15748o0) {
            try {
                if (f15749p0 == null) {
                    f15749p0 = AbstractC1117K.K0("ExoPlayer:AudioTrackReleaseThread");
                }
                f15750q0++;
                f15749p0.execute(new Runnable() { // from class: i1.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.D(audioTrack, dVar, handler, aVar, c1124f);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o0(AudioTrack audioTrack, float f6) {
        audioTrack.setVolume(f6);
    }

    public static void p0(AudioTrack audioTrack, float f6) {
        audioTrack.setStereoVolume(f6, f6);
    }

    public static int v0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i6) {
        return audioTrack.write(byteBuffer, i6, 1);
    }

    @Override // i1.InterfaceC1507y
    public void A(InterfaceC1507y.d dVar) {
        this.f15809t = dVar;
    }

    @Override // i1.InterfaceC1507y
    public void B(C0833e c0833e) {
        if (this.f15782c0.equals(c0833e)) {
            return;
        }
        int i6 = c0833e.f6876a;
        float f6 = c0833e.f6877b;
        AudioTrack audioTrack = this.f15813x;
        if (audioTrack != null) {
            if (this.f15782c0.f6876a != i6) {
                audioTrack.attachAuxEffect(i6);
            }
            if (i6 != 0) {
                this.f15813x.setAuxEffectSendLevel(f6);
            }
        }
        this.f15782c0 = c0833e;
    }

    @Override // i1.InterfaceC1507y
    public void C(boolean z6) {
        this.f15756F = z6;
        l0(t0() ? Z0.B.f6617d : this.f15755E);
    }

    public final void N(long j6) {
        Z0.B b6;
        if (t0()) {
            b6 = Z0.B.f6617d;
        } else {
            b6 = r0() ? this.f15779b.a(this.f15755E) : Z0.B.f6617d;
            this.f15755E = b6;
        }
        Z0.B b7 = b6;
        this.f15756F = r0() ? this.f15779b.d(this.f15756F) : false;
        this.f15795j.add(new j(b7, Math.max(0L, j6), this.f15811v.i(W())));
        q0();
        InterfaceC1507y.d dVar = this.f15809t;
        if (dVar != null) {
            dVar.c(this.f15756F);
        }
    }

    public final long O(long j6) {
        while (!this.f15795j.isEmpty() && j6 >= ((j) this.f15795j.getFirst()).f15843c) {
            this.f15754D = (j) this.f15795j.remove();
        }
        long j7 = j6 - this.f15754D.f15843c;
        if (this.f15795j.isEmpty()) {
            return this.f15754D.f15842b + this.f15779b.b(j7);
        }
        j jVar = (j) this.f15795j.getFirst();
        return jVar.f15842b - AbstractC1117K.e0(jVar.f15843c - j6, this.f15754D.f15841a.f6620a);
    }

    public final long P(long j6) {
        long c6 = this.f15779b.c();
        long i6 = j6 + this.f15811v.i(c6);
        long j7 = this.f15798k0;
        if (c6 > j7) {
            long i7 = this.f15811v.i(c6 - j7);
            this.f15798k0 = c6;
            X(i7);
        }
        return i6;
    }

    public final AudioTrack Q(g gVar) {
        try {
            AudioTrack a6 = gVar.a(this.f15752B, this.f15780b0);
            InterfaceC1344m.a aVar = this.f15807r;
            if (aVar == null) {
                return a6;
            }
            aVar.D(b0(a6));
            return a6;
        } catch (InterfaceC1507y.c e6) {
            InterfaceC1507y.d dVar = this.f15809t;
            if (dVar != null) {
                dVar.d(e6);
            }
            throw e6;
        }
    }

    public final AudioTrack R() {
        try {
            return Q((g) AbstractC1119a.e(this.f15811v));
        } catch (InterfaceC1507y.c e6) {
            g gVar = this.f15811v;
            if (gVar.f15833h > 1000000) {
                g d6 = gVar.d(1000000);
                try {
                    AudioTrack Q5 = Q(d6);
                    this.f15811v = d6;
                    return Q5;
                } catch (InterfaceC1507y.c e7) {
                    e6.addSuppressed(e7);
                    c0();
                    throw e6;
                }
            }
            c0();
            throw e6;
        }
    }

    public final boolean S() {
        ByteBuffer byteBuffer;
        if (this.f15812w.f()) {
            this.f15812w.h();
            h0(Long.MIN_VALUE);
            return this.f15812w.e() && ((byteBuffer = this.f15770T) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.f15770T;
        if (byteBuffer2 == null) {
            return true;
        }
        u0(byteBuffer2, Long.MIN_VALUE);
        return this.f15770T == null;
    }

    public final long V() {
        return this.f15811v.f15828c == 0 ? this.f15759I / r0.f15827b : this.f15760J;
    }

    public final long W() {
        return this.f15811v.f15828c == 0 ? AbstractC1117K.l(this.f15761K, r0.f15829d) : this.f15762L;
    }

    public final void X(long j6) {
        this.f15800l0 += j6;
        if (this.f15802m0 == null) {
            this.f15802m0 = new Handler(Looper.myLooper());
        }
        this.f15802m0.removeCallbacksAndMessages(null);
        this.f15802m0.postDelayed(new Runnable() { // from class: i1.J
            @Override // java.lang.Runnable
            public final void run() {
                M.this.d0();
            }
        }, 100L);
    }

    public final boolean Y() {
        C1492i c1492i;
        v1 v1Var;
        if (!this.f15791h.d()) {
            return false;
        }
        AudioTrack R5 = R();
        this.f15813x = R5;
        if (b0(R5)) {
            i0(this.f15813x);
            g gVar = this.f15811v;
            if (gVar.f15836k) {
                AudioTrack audioTrack = this.f15813x;
                Z0.q qVar = gVar.f15826a;
                audioTrack.setOffloadDelayPadding(qVar.f6969E, qVar.f6970F);
            }
        }
        int i6 = AbstractC1117K.f10560a;
        if (i6 >= 31 && (v1Var = this.f15808s) != null) {
            c.a(this.f15813x, v1Var);
        }
        this.f15780b0 = this.f15813x.getAudioSessionId();
        C1483A c1483a = this.f15793i;
        AudioTrack audioTrack2 = this.f15813x;
        g gVar2 = this.f15811v;
        c1483a.s(audioTrack2, gVar2.f15828c == 2, gVar2.f15832g, gVar2.f15829d, gVar2.f15833h);
        n0();
        int i7 = this.f15782c0.f6876a;
        if (i7 != 0) {
            this.f15813x.attachAuxEffect(i7);
            this.f15813x.setAuxEffectSendLevel(this.f15782c0.f6877b);
        }
        C1493j c1493j = this.f15784d0;
        if (c1493j != null && i6 >= 23) {
            b.a(this.f15813x, c1493j);
            C1492i c1492i2 = this.f15815z;
            if (c1492i2 != null) {
                c1492i2.i(this.f15784d0.f15939a);
            }
        }
        if (i6 >= 24 && (c1492i = this.f15815z) != null) {
            this.f15751A = new k(this.f15813x, c1492i);
        }
        this.f15765O = true;
        InterfaceC1507y.d dVar = this.f15809t;
        if (dVar != null) {
            dVar.b(this.f15811v.b());
        }
        return true;
    }

    @Override // i1.InterfaceC1507y
    public void a() {
        flush();
        g0 l6 = this.f15787f.l();
        while (l6.hasNext()) {
            ((InterfaceC0999b) l6.next()).a();
        }
        g0 l7 = this.f15789g.l();
        while (l7.hasNext()) {
            ((InterfaceC0999b) l7.next()).a();
        }
        C0998a c0998a = this.f15812w;
        if (c0998a != null) {
            c0998a.j();
        }
        this.f15776Z = false;
        this.f15792h0 = false;
    }

    public final boolean a0() {
        return this.f15813x != null;
    }

    @Override // i1.InterfaceC1507y
    public boolean b(Z0.q qVar) {
        return x(qVar) != 0;
    }

    @Override // i1.InterfaceC1507y
    public void c() {
        this.f15776Z = false;
        if (a0()) {
            if (this.f15793i.p() || b0(this.f15813x)) {
                this.f15813x.pause();
            }
        }
    }

    public final void c0() {
        if (this.f15811v.m()) {
            this.f15792h0 = true;
        }
    }

    @Override // i1.InterfaceC1507y
    public boolean d() {
        if (a0()) {
            return this.f15773W && !k();
        }
        return true;
    }

    public final void d0() {
        if (this.f15800l0 >= 300000) {
            this.f15809t.f();
            this.f15800l0 = 0L;
        }
    }

    @Override // i1.InterfaceC1507y
    public void e(Z0.B b6) {
        this.f15755E = new Z0.B(AbstractC1117K.o(b6.f6620a, 0.1f, 8.0f), AbstractC1117K.o(b6.f6621b, 0.1f, 8.0f));
        if (t0()) {
            m0();
        } else {
            l0(b6);
        }
    }

    public final void e0() {
        if (this.f15815z != null || this.f15777a == null) {
            return;
        }
        this.f15796j0 = Looper.myLooper();
        C1492i c1492i = new C1492i(this.f15777a, new C1492i.f() { // from class: i1.K
            @Override // i1.C1492i.f
            public final void a(C1488e c1488e) {
                M.this.f0(c1488e);
            }
        }, this.f15752B, this.f15784d0);
        this.f15815z = c1492i;
        this.f15814y = c1492i.g();
    }

    @Override // i1.InterfaceC1507y
    public void f(AudioDeviceInfo audioDeviceInfo) {
        this.f15784d0 = audioDeviceInfo == null ? null : new C1493j(audioDeviceInfo);
        C1492i c1492i = this.f15815z;
        if (c1492i != null) {
            c1492i.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f15813x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f15784d0);
        }
    }

    public void f0(C1488e c1488e) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f15796j0;
        if (looper == myLooper) {
            if (c1488e.equals(this.f15814y)) {
                return;
            }
            this.f15814y = c1488e;
            InterfaceC1507y.d dVar = this.f15809t;
            if (dVar != null) {
                dVar.i();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (myLooper != null ? myLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // i1.InterfaceC1507y
    public void flush() {
        k kVar;
        if (a0()) {
            k0();
            if (this.f15793i.i()) {
                this.f15813x.pause();
            }
            if (b0(this.f15813x)) {
                ((n) AbstractC1119a.e(this.f15801m)).b(this.f15813x);
            }
            int i6 = AbstractC1117K.f10560a;
            if (i6 < 21 && !this.f15778a0) {
                this.f15780b0 = 0;
            }
            InterfaceC1507y.a b6 = this.f15811v.b();
            g gVar = this.f15810u;
            if (gVar != null) {
                this.f15811v = gVar;
                this.f15810u = null;
            }
            this.f15793i.q();
            if (i6 >= 24 && (kVar = this.f15751A) != null) {
                kVar.c();
                this.f15751A = null;
            }
            j0(this.f15813x, this.f15791h, this.f15809t, b6);
            this.f15813x = null;
        }
        this.f15804o.a();
        this.f15803n.a();
        this.f15798k0 = 0L;
        this.f15800l0 = 0L;
        Handler handler = this.f15802m0;
        if (handler != null) {
            ((Handler) AbstractC1119a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // i1.InterfaceC1507y
    public Z0.B g() {
        return this.f15755E;
    }

    public final void g0() {
        if (this.f15774X) {
            return;
        }
        this.f15774X = true;
        this.f15793i.g(W());
        if (b0(this.f15813x)) {
            this.f15775Y = false;
        }
        this.f15813x.stop();
        this.f15758H = 0;
    }

    @Override // i1.InterfaceC1507y
    public void h() {
        if (!this.f15773W && a0() && S()) {
            g0();
            this.f15773W = true;
        }
    }

    public final void h0(long j6) {
        ByteBuffer d6;
        if (!this.f15812w.f()) {
            ByteBuffer byteBuffer = this.f15768R;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC0999b.f7642a;
            }
            u0(byteBuffer, j6);
            return;
        }
        while (!this.f15812w.e()) {
            do {
                d6 = this.f15812w.d();
                if (d6.hasRemaining()) {
                    u0(d6, j6);
                } else {
                    ByteBuffer byteBuffer2 = this.f15768R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f15812w.i(this.f15768R);
                    }
                }
            } while (!d6.hasRemaining());
            return;
        }
    }

    @Override // i1.InterfaceC1507y
    public void i(float f6) {
        if (this.f15767Q != f6) {
            this.f15767Q = f6;
            n0();
        }
    }

    public final void i0(AudioTrack audioTrack) {
        if (this.f15801m == null) {
            this.f15801m = new n();
        }
        this.f15801m.a(audioTrack);
    }

    @Override // i1.InterfaceC1507y
    public void j() {
        this.f15776Z = true;
        if (a0()) {
            this.f15793i.v();
            this.f15813x.play();
        }
    }

    @Override // i1.InterfaceC1507y
    public boolean k() {
        boolean isOffloadedPlayback;
        if (!a0()) {
            return false;
        }
        if (AbstractC1117K.f10560a >= 29) {
            isOffloadedPlayback = this.f15813x.isOffloadedPlayback();
            if (isOffloadedPlayback && this.f15775Y) {
                return false;
            }
        }
        return this.f15793i.h(W());
    }

    public final void k0() {
        this.f15759I = 0L;
        this.f15760J = 0L;
        this.f15761K = 0L;
        this.f15762L = 0L;
        this.f15794i0 = false;
        this.f15763M = 0;
        this.f15754D = new j(this.f15755E, 0L, 0L);
        this.f15766P = 0L;
        this.f15753C = null;
        this.f15795j.clear();
        this.f15768R = null;
        this.f15769S = 0;
        this.f15770T = null;
        this.f15774X = false;
        this.f15773W = false;
        this.f15775Y = false;
        this.f15757G = null;
        this.f15758H = 0;
        this.f15785e.n();
        q0();
    }

    @Override // i1.InterfaceC1507y
    public C1494k l(Z0.q qVar) {
        return this.f15792h0 ? C1494k.f15940d : this.f15806q.a(qVar, this.f15752B);
    }

    public final void l0(Z0.B b6) {
        j jVar = new j(b6, -9223372036854775807L, -9223372036854775807L);
        if (a0()) {
            this.f15753C = jVar;
        } else {
            this.f15754D = jVar;
        }
    }

    @Override // i1.InterfaceC1507y
    public void m(int i6) {
        if (this.f15780b0 != i6) {
            this.f15780b0 = i6;
            this.f15778a0 = i6 != 0;
            flush();
        }
    }

    public final void m0() {
        if (a0()) {
            try {
                this.f15813x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f15755E.f6620a).setPitch(this.f15755E.f6621b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e6) {
                AbstractC1133o.i("DefaultAudioSink", "Failed to set playback params", e6);
            }
            Z0.B b6 = new Z0.B(this.f15813x.getPlaybackParams().getSpeed(), this.f15813x.getPlaybackParams().getPitch());
            this.f15755E = b6;
            this.f15793i.t(b6.f6620a);
        }
    }

    @Override // i1.InterfaceC1507y
    public void n(int i6, int i7) {
        g gVar;
        AudioTrack audioTrack = this.f15813x;
        if (audioTrack == null || !b0(audioTrack) || (gVar = this.f15811v) == null || !gVar.f15836k) {
            return;
        }
        this.f15813x.setOffloadDelayPadding(i6, i7);
    }

    public final void n0() {
        if (a0()) {
            if (AbstractC1117K.f10560a >= 21) {
                o0(this.f15813x, this.f15767Q);
            } else {
                p0(this.f15813x, this.f15767Q);
            }
        }
    }

    @Override // i1.InterfaceC1507y
    public void o(int i6) {
        AbstractC1119a.g(AbstractC1117K.f10560a >= 29);
        this.f15799l = i6;
    }

    @Override // i1.InterfaceC1507y
    public long p(boolean z6) {
        if (!a0() || this.f15765O) {
            return Long.MIN_VALUE;
        }
        return P(O(Math.min(this.f15793i.d(z6), this.f15811v.i(W()))));
    }

    @Override // i1.InterfaceC1507y
    public void q() {
        if (this.f15786e0) {
            this.f15786e0 = false;
            flush();
        }
    }

    public final void q0() {
        C0998a c0998a = this.f15811v.f15834i;
        this.f15812w = c0998a;
        c0998a.b();
    }

    public final boolean r0() {
        if (this.f15786e0) {
            return false;
        }
        g gVar = this.f15811v;
        return gVar.f15828c == 0 && !s0(gVar.f15826a.f6968D);
    }

    @Override // i1.InterfaceC1507y
    public void release() {
        C1492i c1492i = this.f15815z;
        if (c1492i != null) {
            c1492i.j();
        }
    }

    @Override // i1.InterfaceC1507y
    public void s(InterfaceC1121c interfaceC1121c) {
        this.f15793i.u(interfaceC1121c);
    }

    public final boolean s0(int i6) {
        return this.f15781c && AbstractC1117K.A0(i6);
    }

    @Override // i1.InterfaceC1507y
    public void t() {
        this.f15764N = true;
    }

    public final boolean t0() {
        g gVar = this.f15811v;
        return gVar != null && gVar.f15835j && AbstractC1117K.f10560a >= 23;
    }

    @Override // i1.InterfaceC1507y
    public void u(Z0.q qVar, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int i11;
        boolean z7;
        C0998a c0998a;
        int i12;
        int i13;
        int a6;
        int[] iArr2;
        e0();
        if ("audio/raw".equals(qVar.f6990n)) {
            AbstractC1119a.a(AbstractC1117K.B0(qVar.f6968D));
            i9 = AbstractC1117K.i0(qVar.f6968D, qVar.f6966B);
            w.a aVar = new w.a();
            if (s0(qVar.f6968D)) {
                aVar.j(this.f15789g);
            } else {
                aVar.j(this.f15787f);
                aVar.i(this.f15779b.e());
            }
            C0998a c0998a2 = new C0998a(aVar.k());
            if (c0998a2.equals(this.f15812w)) {
                c0998a2 = this.f15812w;
            }
            this.f15785e.o(qVar.f6969E, qVar.f6970F);
            if (AbstractC1117K.f10560a < 21 && qVar.f6966B == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.f15783d.m(iArr2);
            try {
                InterfaceC0999b.a a7 = c0998a2.a(new InterfaceC0999b.a(qVar));
                int i15 = a7.f7646c;
                i7 = a7.f7644a;
                int N5 = AbstractC1117K.N(a7.f7645b);
                int i02 = AbstractC1117K.i0(i15, a7.f7645b);
                i8 = 0;
                i10 = i15;
                i11 = N5;
                z7 = this.f15797k;
                c0998a = c0998a2;
                i12 = i02;
                z6 = false;
            } catch (InterfaceC0999b.C0119b e6) {
                throw new InterfaceC1507y.b(e6, qVar);
            }
        } else {
            C0998a c0998a3 = new C0998a(z6.w.w());
            i7 = qVar.f6967C;
            C1494k l6 = this.f15799l != 0 ? l(qVar) : C1494k.f15940d;
            if (this.f15799l == 0 || !l6.f15941a) {
                Pair i16 = this.f15814y.i(qVar, this.f15752B);
                if (i16 == null) {
                    throw new InterfaceC1507y.b("Unable to configure passthrough for: " + qVar, qVar);
                }
                int intValue = ((Integer) i16.first).intValue();
                int intValue2 = ((Integer) i16.second).intValue();
                i8 = 2;
                i9 = -1;
                z6 = false;
                i10 = intValue;
                i11 = intValue2;
                z7 = this.f15797k;
                c0998a = c0998a3;
            } else {
                int f6 = Z0.y.f((String) AbstractC1119a.e(qVar.f6990n), qVar.f6986j);
                int N6 = AbstractC1117K.N(qVar.f6966B);
                z6 = l6.f15942b;
                i9 = -1;
                c0998a = c0998a3;
                i10 = f6;
                i11 = N6;
                z7 = true;
                i8 = 1;
            }
            i12 = i9;
        }
        if (i10 == 0) {
            throw new InterfaceC1507y.b("Invalid output encoding (mode=" + i8 + ") for: " + qVar, qVar);
        }
        if (i11 == 0) {
            throw new InterfaceC1507y.b("Invalid output channel config (mode=" + i8 + ") for: " + qVar, qVar);
        }
        int i17 = qVar.f6985i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(qVar.f6990n) && i17 == -1) {
            i17 = 768000;
        }
        int i18 = i17;
        if (i6 != 0) {
            a6 = i6;
            i13 = i7;
        } else {
            i13 = i7;
            a6 = this.f15805p.a(T(i7, i11, i10), i10, i8, i12 != -1 ? i12 : 1, i13, i18, z7 ? 8.0d : 1.0d);
        }
        this.f15792h0 = false;
        boolean z8 = z6;
        int i19 = i8;
        g gVar = new g(qVar, i9, i19, i12, i13, i11, i10, a6, c0998a, z7, z8, this.f15786e0);
        if (a0()) {
            this.f15810u = gVar;
        } else {
            this.f15811v = gVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.M.u0(java.nio.ByteBuffer, long):void");
    }

    @Override // i1.InterfaceC1507y
    public void v() {
        AbstractC1119a.g(AbstractC1117K.f10560a >= 21);
        AbstractC1119a.g(this.f15778a0);
        if (this.f15786e0) {
            return;
        }
        this.f15786e0 = true;
        flush();
    }

    @Override // i1.InterfaceC1507y
    public void w(C0830b c0830b) {
        if (this.f15752B.equals(c0830b)) {
            return;
        }
        this.f15752B = c0830b;
        if (this.f15786e0) {
            return;
        }
        C1492i c1492i = this.f15815z;
        if (c1492i != null) {
            c1492i.h(c0830b);
        }
        flush();
    }

    public final int w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i6, long j6) {
        if (AbstractC1117K.f10560a >= 26) {
            return audioTrack.write(byteBuffer, i6, 1, j6 * 1000);
        }
        if (this.f15757G == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f15757G = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f15757G.putInt(1431633921);
        }
        if (this.f15758H == 0) {
            this.f15757G.putInt(4, i6);
            this.f15757G.putLong(8, j6 * 1000);
            this.f15757G.position(0);
            this.f15758H = i6;
        }
        int remaining = this.f15757G.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f15757G, remaining, 1);
            if (write < 0) {
                this.f15758H = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int v02 = v0(audioTrack, byteBuffer, i6);
        if (v02 < 0) {
            this.f15758H = 0;
            return v02;
        }
        this.f15758H -= v02;
        return v02;
    }

    @Override // i1.InterfaceC1507y
    public int x(Z0.q qVar) {
        e0();
        if (!"audio/raw".equals(qVar.f6990n)) {
            return this.f15814y.k(qVar, this.f15752B) ? 2 : 0;
        }
        if (AbstractC1117K.B0(qVar.f6968D)) {
            int i6 = qVar.f6968D;
            return (i6 == 2 || (this.f15781c && i6 == 4)) ? 2 : 1;
        }
        AbstractC1133o.h("DefaultAudioSink", "Invalid PCM encoding: " + qVar.f6968D);
        return 0;
    }

    @Override // i1.InterfaceC1507y
    public boolean y(ByteBuffer byteBuffer, long j6, int i6) {
        ByteBuffer byteBuffer2 = this.f15768R;
        AbstractC1119a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f15810u != null) {
            if (!S()) {
                return false;
            }
            if (this.f15810u.c(this.f15811v)) {
                this.f15811v = this.f15810u;
                this.f15810u = null;
                AudioTrack audioTrack = this.f15813x;
                if (audioTrack != null && b0(audioTrack) && this.f15811v.f15836k) {
                    if (this.f15813x.getPlayState() == 3) {
                        this.f15813x.setOffloadEndOfStream();
                        this.f15793i.a();
                    }
                    AudioTrack audioTrack2 = this.f15813x;
                    Z0.q qVar = this.f15811v.f15826a;
                    audioTrack2.setOffloadDelayPadding(qVar.f6969E, qVar.f6970F);
                    this.f15794i0 = true;
                }
            } else {
                g0();
                if (k()) {
                    return false;
                }
                flush();
            }
            N(j6);
        }
        if (!a0()) {
            try {
                if (!Y()) {
                    return false;
                }
            } catch (InterfaceC1507y.c e6) {
                if (e6.f15986b) {
                    throw e6;
                }
                this.f15803n.b(e6);
                return false;
            }
        }
        this.f15803n.a();
        if (this.f15765O) {
            this.f15766P = Math.max(0L, j6);
            this.f15764N = false;
            this.f15765O = false;
            if (t0()) {
                m0();
            }
            N(j6);
            if (this.f15776Z) {
                j();
            }
        }
        if (!this.f15793i.k(W())) {
            return false;
        }
        if (this.f15768R == null) {
            AbstractC1119a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f15811v;
            if (gVar.f15828c != 0 && this.f15763M == 0) {
                int U5 = U(gVar.f15832g, byteBuffer);
                this.f15763M = U5;
                if (U5 == 0) {
                    return true;
                }
            }
            if (this.f15753C != null) {
                if (!S()) {
                    return false;
                }
                N(j6);
                this.f15753C = null;
            }
            long l6 = this.f15766P + this.f15811v.l(V() - this.f15785e.m());
            if (!this.f15764N && Math.abs(l6 - j6) > 200000) {
                InterfaceC1507y.d dVar = this.f15809t;
                if (dVar != null) {
                    dVar.d(new InterfaceC1507y.e(j6, l6));
                }
                this.f15764N = true;
            }
            if (this.f15764N) {
                if (!S()) {
                    return false;
                }
                long j7 = j6 - l6;
                this.f15766P += j7;
                this.f15764N = false;
                N(j6);
                InterfaceC1507y.d dVar2 = this.f15809t;
                if (dVar2 != null && j7 != 0) {
                    dVar2.j();
                }
            }
            if (this.f15811v.f15828c == 0) {
                this.f15759I += byteBuffer.remaining();
            } else {
                this.f15760J += this.f15763M * i6;
            }
            this.f15768R = byteBuffer;
            this.f15769S = i6;
        }
        h0(j6);
        if (!this.f15768R.hasRemaining()) {
            this.f15768R = null;
            this.f15769S = 0;
            return true;
        }
        if (!this.f15793i.j(W())) {
            return false;
        }
        AbstractC1133o.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // i1.InterfaceC1507y
    public void z(v1 v1Var) {
        this.f15808s = v1Var;
    }

    public M(f fVar) {
        C1488e c1488e;
        Context context = fVar.f15817a;
        this.f15777a = context;
        C0830b c0830b = C0830b.f6858g;
        this.f15752B = c0830b;
        if (context != null) {
            c1488e = C1488e.e(context, c0830b, null);
        } else {
            c1488e = fVar.f15818b;
        }
        this.f15814y = c1488e;
        this.f15779b = fVar.f15819c;
        int i6 = AbstractC1117K.f10560a;
        this.f15781c = i6 >= 21 && fVar.f15820d;
        this.f15797k = i6 >= 23 && fVar.f15821e;
        this.f15799l = 0;
        this.f15805p = fVar.f15823g;
        this.f15806q = (d) AbstractC1119a.e(fVar.f15824h);
        C1124f c1124f = new C1124f(InterfaceC1121c.f10577a);
        this.f15791h = c1124f;
        c1124f.e();
        this.f15793i = new C1483A(new m());
        B b6 = new B();
        this.f15783d = b6;
        a0 a0Var = new a0();
        this.f15785e = a0Var;
        this.f15787f = z6.w.A(new C1004g(), b6, a0Var);
        this.f15789g = z6.w.y(new Z());
        this.f15767Q = 1.0f;
        this.f15780b0 = 0;
        this.f15782c0 = new C0833e(0, 0.0f);
        Z0.B b7 = Z0.B.f6617d;
        this.f15754D = new j(b7, 0L, 0L);
        this.f15755E = b7;
        this.f15756F = false;
        this.f15795j = new ArrayDeque();
        this.f15803n = new l(100L);
        this.f15804o = new l(100L);
        this.f15807r = fVar.f15825i;
    }
}
