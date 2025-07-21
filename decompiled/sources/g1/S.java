package g1;

import Z0.AbstractC0834f;
import Z0.C;
import Z0.C0830b;
import Z0.C0840l;
import Z0.G;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import c1.C1107A;
import c1.C1124f;
import c1.C1132n;
import c1.InterfaceC1121c;
import c1.InterfaceC1129k;
import g1.C1322b;
import g1.C1326d;
import g1.C1333g0;
import g1.F0;
import g1.H0;
import g1.InterfaceC1344m;
import g1.Q0;
import h1.InterfaceC1400a;
import h1.InterfaceC1402b;
import h1.t1;
import h1.v1;
import i1.InterfaceC1506x;
import i1.InterfaceC1507y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import q1.InterfaceC2008b;
import w1.C2209A;
import w1.InterfaceC2212D;
import w1.d0;
import y1.InterfaceC2351h;
import z1.AbstractC2443C;
import z1.C2444D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class S extends AbstractC0834f implements InterfaceC1344m {

    /* renamed from: A, reason: collision with root package name */
    public final C1322b f14410A;

    /* renamed from: B, reason: collision with root package name */
    public final C1326d f14411B;

    /* renamed from: C, reason: collision with root package name */
    public final Q0 f14412C;

    /* renamed from: D, reason: collision with root package name */
    public final S0 f14413D;

    /* renamed from: E, reason: collision with root package name */
    public final T0 f14414E;

    /* renamed from: F, reason: collision with root package name */
    public final long f14415F;

    /* renamed from: G, reason: collision with root package name */
    public AudioManager f14416G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f14417H;

    /* renamed from: I, reason: collision with root package name */
    public int f14418I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14419J;

    /* renamed from: K, reason: collision with root package name */
    public int f14420K;

    /* renamed from: L, reason: collision with root package name */
    public int f14421L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f14422M;

    /* renamed from: N, reason: collision with root package name */
    public N0 f14423N;

    /* renamed from: O, reason: collision with root package name */
    public w1.d0 f14424O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1344m.c f14425P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14426Q;

    /* renamed from: R, reason: collision with root package name */
    public C.b f14427R;

    /* renamed from: S, reason: collision with root package name */
    public Z0.w f14428S;

    /* renamed from: T, reason: collision with root package name */
    public Z0.w f14429T;

    /* renamed from: U, reason: collision with root package name */
    public Z0.q f14430U;

    /* renamed from: V, reason: collision with root package name */
    public Z0.q f14431V;

    /* renamed from: W, reason: collision with root package name */
    public AudioTrack f14432W;

    /* renamed from: X, reason: collision with root package name */
    public Object f14433X;

    /* renamed from: Y, reason: collision with root package name */
    public Surface f14434Y;

    /* renamed from: Z, reason: collision with root package name */
    public SurfaceHolder f14435Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f14436a0;

    /* renamed from: b, reason: collision with root package name */
    public final C2444D f14437b;

    /* renamed from: b0, reason: collision with root package name */
    public TextureView f14438b0;

    /* renamed from: c, reason: collision with root package name */
    public final C.b f14439c;

    /* renamed from: c0, reason: collision with root package name */
    public int f14440c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1124f f14441d;

    /* renamed from: d0, reason: collision with root package name */
    public int f14442d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14443e;

    /* renamed from: e0, reason: collision with root package name */
    public C1107A f14444e0;

    /* renamed from: f, reason: collision with root package name */
    public final Z0.C f14445f;

    /* renamed from: f0, reason: collision with root package name */
    public C1330f f14446f0;

    /* renamed from: g, reason: collision with root package name */
    public final J0[] f14447g;

    /* renamed from: g0, reason: collision with root package name */
    public C1330f f14448g0;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2443C f14449h;

    /* renamed from: h0, reason: collision with root package name */
    public int f14450h0;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1129k f14451i;

    /* renamed from: i0, reason: collision with root package name */
    public C0830b f14452i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1333g0.f f14453j;

    /* renamed from: j0, reason: collision with root package name */
    public float f14454j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1333g0 f14455k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f14456k0;

    /* renamed from: l, reason: collision with root package name */
    public final C1132n f14457l;

    /* renamed from: l0, reason: collision with root package name */
    public b1.b f14458l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f14459m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f14460m0;

    /* renamed from: n, reason: collision with root package name */
    public final G.b f14461n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f14462n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f14463o;

    /* renamed from: o0, reason: collision with root package name */
    public int f14464o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14465p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f14466p0;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2212D.a f14467q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f14468q0;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1400a f14469r;

    /* renamed from: r0, reason: collision with root package name */
    public C0840l f14470r0;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f14471s;

    /* renamed from: s0, reason: collision with root package name */
    public Z0.N f14472s0;

    /* renamed from: t, reason: collision with root package name */
    public final A1.d f14473t;

    /* renamed from: t0, reason: collision with root package name */
    public Z0.w f14474t0;

    /* renamed from: u, reason: collision with root package name */
    public final long f14475u;

    /* renamed from: u0, reason: collision with root package name */
    public G0 f14476u0;

    /* renamed from: v, reason: collision with root package name */
    public final long f14477v;

    /* renamed from: v0, reason: collision with root package name */
    public int f14478v0;

    /* renamed from: w, reason: collision with root package name */
    public final long f14479w;

    /* renamed from: w0, reason: collision with root package name */
    public int f14480w0;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1121c f14481x;

    /* renamed from: x0, reason: collision with root package name */
    public long f14482x0;

    /* renamed from: y, reason: collision with root package name */
    public final d f14483y;

    /* renamed from: z, reason: collision with root package name */
    public final e f14484z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!AbstractC1117K.G0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i6 = AbstractC1117K.f10560a;
                if (i6 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i6 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i6 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i6 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static v1 a(Context context, S s6, boolean z6, String str) {
            LogSessionId logSessionId;
            t1 v02 = t1.v0(context);
            if (v02 == null) {
                AbstractC1133o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new v1(logSessionId, str);
            }
            if (z6) {
                s6.Z0(v02);
            }
            return new v1(v02.C0(), str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d implements C1.B, InterfaceC1506x, InterfaceC2351h, InterfaceC2008b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C1326d.b, C1322b.InterfaceC0198b, Q0.b, InterfaceC1344m.a {
        public d() {
        }

        @Override // g1.C1322b.InterfaceC0198b
        public void A() {
            S.this.M1(false, -1, 3);
        }

        @Override // g1.C1326d.b
        public void B(float f6) {
            S.this.F1();
        }

        @Override // g1.C1326d.b
        public void C(int i6) {
            S.this.M1(S.this.n(), i6, S.o1(i6));
        }

        @Override // g1.Q0.b
        public void E(final int i6, final boolean z6) {
            S.this.f14457l.j(30, new C1132n.a() { // from class: g1.Z
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).S(i6, z6);
                }
            });
        }

        @Override // g1.InterfaceC1344m.a
        public void F(boolean z6) {
            S.this.Q1();
        }

        @Override // C1.B
        public void a(final Z0.N n6) {
            S.this.f14472s0 = n6;
            S.this.f14457l.j(25, new C1132n.a() { // from class: g1.a0
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).a(Z0.N.this);
                }
            });
        }

        @Override // i1.InterfaceC1506x
        public void b(InterfaceC1507y.a aVar) {
            S.this.f14469r.b(aVar);
        }

        @Override // i1.InterfaceC1506x
        public void c(final boolean z6) {
            if (S.this.f14456k0 == z6) {
                return;
            }
            S.this.f14456k0 = z6;
            S.this.f14457l.j(23, new C1132n.a() { // from class: g1.c0
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).c(z6);
                }
            });
        }

        @Override // i1.InterfaceC1506x
        public void d(Exception exc) {
            S.this.f14469r.d(exc);
        }

        @Override // i1.InterfaceC1506x
        public void e(InterfaceC1507y.a aVar) {
            S.this.f14469r.e(aVar);
        }

        @Override // C1.B
        public void f(String str) {
            S.this.f14469r.f(str);
        }

        @Override // C1.B
        public void g(String str, long j6, long j7) {
            S.this.f14469r.g(str, j6, j7);
        }

        @Override // C1.B
        public void h(Z0.q qVar, C1332g c1332g) {
            S.this.f14430U = qVar;
            S.this.f14469r.h(qVar, c1332g);
        }

        @Override // y1.InterfaceC2351h
        public void i(final b1.b bVar) {
            S.this.f14458l0 = bVar;
            S.this.f14457l.j(27, new C1132n.a() { // from class: g1.U
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).i(b1.b.this);
                }
            });
        }

        @Override // i1.InterfaceC1506x
        public void j(C1330f c1330f) {
            S.this.f14448g0 = c1330f;
            S.this.f14469r.j(c1330f);
        }

        @Override // i1.InterfaceC1506x
        public void k(String str) {
            S.this.f14469r.k(str);
        }

        @Override // i1.InterfaceC1506x
        public void l(String str, long j6, long j7) {
            S.this.f14469r.l(str, j6, j7);
        }

        @Override // g1.Q0.b
        public void m(int i6) {
            final C0840l e12 = S.e1(S.this.f14412C);
            if (e12.equals(S.this.f14470r0)) {
                return;
            }
            S.this.f14470r0 = e12;
            S.this.f14457l.j(29, new C1132n.a() { // from class: g1.Y
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).Q(C0840l.this);
                }
            });
        }

        @Override // C1.B
        public void n(C1330f c1330f) {
            S.this.f14446f0 = c1330f;
            S.this.f14469r.n(c1330f);
        }

        @Override // C1.B
        public void o(int i6, long j6) {
            S.this.f14469r.o(i6, j6);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) {
            S.this.I1(surfaceTexture);
            S.this.z1(i6, i7);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            S.this.J1(null);
            S.this.z1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) {
            S.this.z1(i6, i7);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // C1.B
        public void p(Object obj, long j6) {
            S.this.f14469r.p(obj, j6);
            if (S.this.f14433X == obj) {
                S.this.f14457l.j(26, new C1132n.a() { // from class: g1.b0
                    @Override // c1.C1132n.a
                    public final void invoke(Object obj2) {
                        ((C.d) obj2).b0();
                    }
                });
            }
        }

        @Override // y1.InterfaceC2351h
        public void q(final List list) {
            S.this.f14457l.j(27, new C1132n.a() { // from class: g1.X
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).q(list);
                }
            });
        }

        @Override // i1.InterfaceC1506x
        public void r(long j6) {
            S.this.f14469r.r(j6);
        }

        @Override // i1.InterfaceC1506x
        public void s(Exception exc) {
            S.this.f14469r.s(exc);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i7, int i8) {
            S.this.z1(i7, i8);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (S.this.f14436a0) {
                S.this.J1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (S.this.f14436a0) {
                S.this.J1(null);
            }
            S.this.z1(0, 0);
        }

        @Override // i1.InterfaceC1506x
        public void t(C1330f c1330f) {
            S.this.f14469r.t(c1330f);
            S.this.f14431V = null;
            S.this.f14448g0 = null;
        }

        @Override // C1.B
        public void u(Exception exc) {
            S.this.f14469r.u(exc);
        }

        @Override // i1.InterfaceC1506x
        public void v(Z0.q qVar, C1332g c1332g) {
            S.this.f14431V = qVar;
            S.this.f14469r.v(qVar, c1332g);
        }

        @Override // i1.InterfaceC1506x
        public void w(int i6, long j6, long j7) {
            S.this.f14469r.w(i6, j6, j7);
        }

        @Override // q1.InterfaceC2008b
        public void x(final Z0.x xVar) {
            S s6 = S.this;
            s6.f14474t0 = s6.f14474t0.a().L(xVar).I();
            Z0.w c12 = S.this.c1();
            if (!c12.equals(S.this.f14428S)) {
                S.this.f14428S = c12;
                S.this.f14457l.h(14, new C1132n.a() { // from class: g1.V
                    @Override // c1.C1132n.a
                    public final void invoke(Object obj) {
                        ((C.d) obj).k0(S.this.f14428S);
                    }
                });
            }
            S.this.f14457l.h(28, new C1132n.a() { // from class: g1.W
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).x(Z0.x.this);
                }
            });
            S.this.f14457l.f();
        }

        @Override // C1.B
        public void y(C1330f c1330f) {
            S.this.f14469r.y(c1330f);
            S.this.f14430U = null;
            S.this.f14446f0 = null;
        }

        @Override // C1.B
        public void z(long j6, int i6) {
            S.this.f14469r.z(j6, i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e implements C1.m, D1.a, H0.b {

        /* renamed from: a, reason: collision with root package name */
        public C1.m f14486a;

        /* renamed from: b, reason: collision with root package name */
        public D1.a f14487b;

        /* renamed from: c, reason: collision with root package name */
        public C1.m f14488c;

        /* renamed from: d, reason: collision with root package name */
        public D1.a f14489d;

        public e() {
        }

        @Override // g1.H0.b
        public void H(int i6, Object obj) {
            if (i6 == 7) {
                this.f14486a = (C1.m) obj;
                return;
            }
            if (i6 == 8) {
                this.f14487b = (D1.a) obj;
            } else {
                if (i6 != 10000) {
                    return;
                }
                android.support.v4.media.session.b.a(obj);
                this.f14488c = null;
                this.f14489d = null;
            }
        }

        @Override // D1.a
        public void b(long j6, float[] fArr) {
            D1.a aVar = this.f14489d;
            if (aVar != null) {
                aVar.b(j6, fArr);
            }
            D1.a aVar2 = this.f14487b;
            if (aVar2 != null) {
                aVar2.b(j6, fArr);
            }
        }

        @Override // D1.a
        public void e() {
            D1.a aVar = this.f14489d;
            if (aVar != null) {
                aVar.e();
            }
            D1.a aVar2 = this.f14487b;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // C1.m
        public void g(long j6, long j7, Z0.q qVar, MediaFormat mediaFormat) {
            long j8;
            long j9;
            Z0.q qVar2;
            MediaFormat mediaFormat2;
            C1.m mVar = this.f14488c;
            if (mVar != null) {
                mVar.g(j6, j7, qVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                qVar2 = qVar;
                j9 = j7;
                j8 = j6;
            } else {
                j8 = j6;
                j9 = j7;
                qVar2 = qVar;
                mediaFormat2 = mediaFormat;
            }
            C1.m mVar2 = this.f14486a;
            if (mVar2 != null) {
                mVar2.g(j8, j9, qVar2, mediaFormat2);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f implements InterfaceC1354r0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14490a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2212D f14491b;

        /* renamed from: c, reason: collision with root package name */
        public Z0.G f14492c;

        public f(Object obj, C2209A c2209a) {
            this.f14490a = obj;
            this.f14491b = c2209a;
            this.f14492c = c2209a.Y();
        }

        @Override // g1.InterfaceC1354r0
        public Object a() {
            return this.f14490a;
        }

        @Override // g1.InterfaceC1354r0
        public Z0.G b() {
            return this.f14492c;
        }

        public void c(Z0.G g6) {
            this.f14492c = g6;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class g extends AudioDeviceCallback {
        public g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (S.this.u1() && S.this.f14476u0.f14341n == 3) {
                S s6 = S.this;
                s6.O1(s6.f14476u0.f14339l, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (S.this.u1()) {
                return;
            }
            S s6 = S.this;
            s6.O1(s6.f14476u0.f14339l, 1, 3);
        }
    }

    static {
        Z0.v.a("media3.exoplayer");
    }

    public S(InterfaceC1344m.b bVar, Z0.C c6) {
        boolean z6;
        C1124f c1124f = new C1124f();
        this.f14441d = c1124f;
        try {
            AbstractC1133o.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC1117K.f10564e + "]");
            Context applicationContext = bVar.f14736a.getApplicationContext();
            this.f14443e = applicationContext;
            InterfaceC1400a interfaceC1400a = (InterfaceC1400a) bVar.f14744i.apply(bVar.f14737b);
            this.f14469r = interfaceC1400a;
            this.f14464o0 = bVar.f14746k;
            this.f14452i0 = bVar.f14747l;
            this.f14440c0 = bVar.f14753r;
            this.f14442d0 = bVar.f14754s;
            this.f14456k0 = bVar.f14751p;
            this.f14415F = bVar.f14728A;
            d dVar = new d();
            this.f14483y = dVar;
            e eVar = new e();
            this.f14484z = eVar;
            Handler handler = new Handler(bVar.f14745j);
            J0[] a6 = ((M0) bVar.f14739d.get()).a(handler, dVar, dVar, dVar, dVar);
            this.f14447g = a6;
            AbstractC1119a.g(a6.length > 0);
            AbstractC2443C abstractC2443C = (AbstractC2443C) bVar.f14741f.get();
            this.f14449h = abstractC2443C;
            this.f14467q = (InterfaceC2212D.a) bVar.f14740e.get();
            A1.d dVar2 = (A1.d) bVar.f14743h.get();
            this.f14473t = dVar2;
            this.f14465p = bVar.f14755t;
            this.f14423N = bVar.f14756u;
            this.f14475u = bVar.f14757v;
            this.f14477v = bVar.f14758w;
            this.f14479w = bVar.f14759x;
            this.f14426Q = bVar.f14729B;
            Looper looper = bVar.f14745j;
            this.f14471s = looper;
            InterfaceC1121c interfaceC1121c = bVar.f14737b;
            this.f14481x = interfaceC1121c;
            Z0.C c7 = c6 == null ? this : c6;
            this.f14445f = c7;
            boolean z7 = bVar.f14733F;
            this.f14417H = z7;
            this.f14457l = new C1132n(looper, interfaceC1121c, new C1132n.b() { // from class: g1.D
                @Override // c1.C1132n.b
                public final void a(Object obj, Z0.p pVar) {
                    ((C.d) obj).a0(S.this.f14445f, new C.c(pVar));
                }
            });
            this.f14459m = new CopyOnWriteArraySet();
            this.f14463o = new ArrayList();
            this.f14424O = new d0.a(0);
            this.f14425P = InterfaceC1344m.c.f14762b;
            C2444D c2444d = new C2444D(new L0[a6.length], new z1.x[a6.length], Z0.J.f6806b, null);
            this.f14437b = c2444d;
            this.f14461n = new G.b();
            C.b e6 = new C.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, abstractC2443C.g()).d(23, bVar.f14752q).d(25, bVar.f14752q).d(33, bVar.f14752q).d(26, bVar.f14752q).d(34, bVar.f14752q).e();
            this.f14439c = e6;
            this.f14427R = new C.b.a().b(e6).a(4).a(10).e();
            this.f14451i = interfaceC1121c.e(looper, null);
            C1333g0.f fVar = new C1333g0.f() { // from class: g1.E
                @Override // g1.C1333g0.f
                public final void a(C1333g0.e eVar2) {
                    r0.f14451i.c(new Runnable() { // from class: g1.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            S.this.t1(eVar2);
                        }
                    });
                }
            };
            this.f14453j = fVar;
            this.f14476u0 = G0.k(c2444d);
            interfaceC1400a.X(c7, looper);
            int i6 = AbstractC1117K.f10560a;
            C1333g0 c1333g0 = new C1333g0(a6, abstractC2443C, c2444d, (InterfaceC1341k0) bVar.f14742g.get(), dVar2, this.f14418I, this.f14419J, interfaceC1400a, this.f14423N, bVar.f14760y, bVar.f14761z, this.f14426Q, bVar.f14735H, looper, interfaceC1121c, fVar, i6 < 31 ? new v1(bVar.f14734G) : c.a(applicationContext, this, bVar.f14730C, bVar.f14734G), bVar.f14731D, this.f14425P);
            this.f14455k = c1333g0;
            this.f14454j0 = 1.0f;
            this.f14418I = 0;
            Z0.w wVar = Z0.w.f7184H;
            this.f14428S = wVar;
            this.f14429T = wVar;
            this.f14474t0 = wVar;
            this.f14478v0 = -1;
            if (i6 < 21) {
                z6 = false;
                this.f14450h0 = v1(0);
            } else {
                z6 = false;
                this.f14450h0 = AbstractC1117K.K(applicationContext);
            }
            this.f14458l0 = b1.b.f10444c;
            this.f14460m0 = true;
            r(interfaceC1400a);
            dVar2.i(new Handler(looper), interfaceC1400a);
            a1(dVar);
            long j6 = bVar.f14738c;
            if (j6 > 0) {
                c1333g0.B(j6);
            }
            C1322b c1322b = new C1322b(bVar.f14736a, handler, dVar);
            this.f14410A = c1322b;
            c1322b.b(bVar.f14750o);
            C1326d c1326d = new C1326d(bVar.f14736a, handler, dVar);
            this.f14411B = c1326d;
            c1326d.m(bVar.f14748m ? this.f14452i0 : null);
            if (z7 && i6 >= 23) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f14416G = audioManager;
                b.b(audioManager, new g(), new Handler(looper));
            }
            if (bVar.f14752q) {
                Q0 q02 = new Q0(bVar.f14736a, handler, dVar);
                this.f14412C = q02;
                q02.h(AbstractC1117K.m0(this.f14452i0.f6866c));
            } else {
                this.f14412C = null;
            }
            S0 s02 = new S0(bVar.f14736a);
            this.f14413D = s02;
            s02.a(bVar.f14749n != 0 ? true : z6);
            T0 t02 = new T0(bVar.f14736a);
            this.f14414E = t02;
            t02.a(bVar.f14749n == 2 ? true : z6);
            this.f14470r0 = e1(this.f14412C);
            this.f14472s0 = Z0.N.f6819e;
            this.f14444e0 = C1107A.f10543c;
            abstractC2443C.k(this.f14452i0);
            D1(1, 10, Integer.valueOf(this.f14450h0));
            D1(2, 10, Integer.valueOf(this.f14450h0));
            D1(1, 3, this.f14452i0);
            D1(2, 4, Integer.valueOf(this.f14440c0));
            D1(2, 5, Integer.valueOf(this.f14442d0));
            D1(1, 9, Boolean.valueOf(this.f14456k0));
            D1(2, 7, eVar);
            D1(6, 8, eVar);
            E1(16, Integer.valueOf(this.f14464o0));
            c1124f.e();
        } catch (Throwable th) {
            this.f14441d.e();
            throw th;
        }
    }

    public static /* synthetic */ void c0(int i6, C.e eVar, C.e eVar2, C.d dVar) {
        dVar.C(i6);
        dVar.D(eVar, eVar2, i6);
    }

    public static C0840l e1(Q0 q02) {
        return new C0840l.b(0).g(q02 != null ? q02.d() : 0).f(q02 != null ? q02.c() : 0).e();
    }

    public static /* synthetic */ void j0(G0 g02, C.d dVar) {
        dVar.B(g02.f14334g);
        dVar.G(g02.f14334g);
    }

    public static int o1(int i6) {
        return i6 == -1 ? 2 : 1;
    }

    public static long s1(G0 g02) {
        G.c cVar = new G.c();
        G.b bVar = new G.b();
        g02.f14328a.h(g02.f14329b.f19753a, bVar);
        return g02.f14330c == -9223372036854775807L ? g02.f14328a.n(bVar.f6663c, cVar).c() : bVar.n() + g02.f14330c;
    }

    @Override // Z0.C
    public long A() {
        R1();
        return l1(this.f14476u0);
    }

    public final long A1(Z0.G g6, InterfaceC2212D.b bVar, long j6) {
        g6.h(bVar.f19753a, this.f14461n);
        return j6 + this.f14461n.n();
    }

    @Override // Z0.C
    public long B() {
        R1();
        if (!l()) {
            return k1();
        }
        G0 g02 = this.f14476u0;
        return g02.f14338k.equals(g02.f14329b) ? AbstractC1117K.k1(this.f14476u0.f14344q) : M();
    }

    public final void B1(int i6, int i7) {
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            this.f14463o.remove(i8);
        }
        this.f14424O = this.f14424O.b(i6, i7);
    }

    public final void C1() {
        TextureView textureView = this.f14438b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f14483y) {
                AbstractC1133o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f14438b0.setSurfaceTextureListener(null);
            }
            this.f14438b0 = null;
        }
        SurfaceHolder surfaceHolder = this.f14435Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f14483y);
            this.f14435Z = null;
        }
    }

    @Override // Z0.C
    public int D() {
        R1();
        return this.f14476u0.f14332e;
    }

    public final void D1(int i6, int i7, Object obj) {
        for (J0 j02 : this.f14447g) {
            if (i6 == -1 || j02.l() == i6) {
                h1(j02).n(i7).m(obj).l();
            }
        }
    }

    @Override // Z0.C
    public Z0.J E() {
        R1();
        return this.f14476u0.f14336i.f21482d;
    }

    public final void E1(int i6, Object obj) {
        D1(-1, i6, obj);
    }

    public final void F1() {
        D1(1, 2, Float.valueOf(this.f14454j0 * this.f14411B.g()));
    }

    @Override // Z0.C
    public int G() {
        R1();
        if (l()) {
            return this.f14476u0.f14329b.f19754b;
        }
        return -1;
    }

    public void G1(List list, boolean z6) {
        R1();
        H1(list, -1, -9223372036854775807L, z6);
    }

    @Override // Z0.C
    public int H() {
        R1();
        int n12 = n1(this.f14476u0);
        if (n12 == -1) {
            return 0;
        }
        return n12;
    }

    public final void H1(List list, int i6, long j6, boolean z6) {
        long j7;
        int i7;
        int i8;
        int i9 = i6;
        int n12 = n1(this.f14476u0);
        long P5 = P();
        this.f14420K++;
        if (!this.f14463o.isEmpty()) {
            B1(0, this.f14463o.size());
        }
        List b12 = b1(0, list);
        Z0.G f12 = f1();
        if (!f12.q() && i9 >= f12.p()) {
            throw new Z0.s(f12, i9, j6);
        }
        if (z6) {
            i9 = f12.a(this.f14419J);
            j7 = -9223372036854775807L;
        } else {
            if (i9 == -1) {
                i7 = n12;
                j7 = P5;
                G0 x12 = x1(this.f14476u0, f12, y1(f12, i7, j7));
                i8 = x12.f14332e;
                if (i7 != -1 && i8 != 1) {
                    i8 = (!f12.q() || i7 >= f12.p()) ? 4 : 2;
                }
                G0 h6 = x12.h(i8);
                this.f14455k.V0(b12, i7, AbstractC1117K.J0(j7), this.f14424O);
                N1(h6, 0, this.f14476u0.f14329b.f19753a.equals(h6.f14329b.f19753a) && !this.f14476u0.f14328a.q(), 4, m1(h6), -1, false);
            }
            j7 = j6;
        }
        i7 = i9;
        G0 x122 = x1(this.f14476u0, f12, y1(f12, i7, j7));
        i8 = x122.f14332e;
        if (i7 != -1) {
            if (f12.q()) {
            }
        }
        G0 h62 = x122.h(i8);
        this.f14455k.V0(b12, i7, AbstractC1117K.J0(j7), this.f14424O);
        N1(h62, 0, this.f14476u0.f14329b.f19753a.equals(h62.f14329b.f19753a) && !this.f14476u0.f14328a.q(), 4, m1(h62), -1, false);
    }

    @Override // Z0.C
    public void I(final int i6) {
        R1();
        if (this.f14418I != i6) {
            this.f14418I = i6;
            this.f14455k.d1(i6);
            this.f14457l.h(8, new C1132n.a() { // from class: g1.C
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).Y(i6);
                }
            });
            L1();
            this.f14457l.f();
        }
    }

    public final void I1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        J1(surface);
        this.f14434Y = surface;
    }

    public final void J1(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (J0 j02 : this.f14447g) {
            if (j02.l() == 2) {
                arrayList.add(h1(j02).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f14433X;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((H0) it.next()).a(this.f14415F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z6 = true;
            }
            Object obj3 = this.f14433X;
            Surface surface = this.f14434Y;
            if (obj3 == surface) {
                surface.release();
                this.f14434Y = null;
            }
        }
        this.f14433X = obj;
        if (z6) {
            K1(C1342l.d(new C1335h0(3), 1003));
        }
    }

    @Override // Z0.C
    public int K() {
        R1();
        return this.f14476u0.f14341n;
    }

    public final void K1(C1342l c1342l) {
        G0 g02 = this.f14476u0;
        G0 c6 = g02.c(g02.f14329b);
        c6.f14344q = c6.f14346s;
        c6.f14345r = 0L;
        G0 h6 = c6.h(1);
        if (c1342l != null) {
            h6 = h6.f(c1342l);
        }
        this.f14420K++;
        this.f14455k.p1();
        N1(h6, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // Z0.C
    public int L() {
        R1();
        return this.f14418I;
    }

    public final void L1() {
        C.b bVar = this.f14427R;
        C.b O5 = AbstractC1117K.O(this.f14445f, this.f14439c);
        this.f14427R = O5;
        if (O5.equals(bVar)) {
            return;
        }
        this.f14457l.h(13, new C1132n.a() { // from class: g1.I
            @Override // c1.C1132n.a
            public final void invoke(Object obj) {
                ((C.d) obj).i0(S.this.f14427R);
            }
        });
    }

    @Override // Z0.C
    public long M() {
        R1();
        if (!l()) {
            return b();
        }
        G0 g02 = this.f14476u0;
        InterfaceC2212D.b bVar = g02.f14329b;
        g02.f14328a.h(bVar.f19753a, this.f14461n);
        return AbstractC1117K.k1(this.f14461n.b(bVar.f19754b, bVar.f19755c));
    }

    public final void M1(boolean z6, int i6, int i7) {
        boolean z7 = z6 && i6 != -1;
        int d12 = d1(z7, i6);
        G0 g02 = this.f14476u0;
        if (g02.f14339l == z7 && g02.f14341n == d12 && g02.f14340m == i7) {
            return;
        }
        O1(z7, i7, d12);
    }

    @Override // Z0.C
    public Z0.G N() {
        R1();
        return this.f14476u0.f14328a;
    }

    public final void N1(final G0 g02, final int i6, boolean z6, final int i7, long j6, int i8, boolean z7) {
        G0 g03 = this.f14476u0;
        this.f14476u0 = g02;
        boolean equals = g03.f14328a.equals(g02.f14328a);
        Pair i12 = i1(g02, g03, z6, i7, !equals, z7);
        boolean booleanValue = ((Boolean) i12.first).booleanValue();
        final int intValue = ((Integer) i12.second).intValue();
        if (booleanValue) {
            r6 = g02.f14328a.q() ? null : g02.f14328a.n(g02.f14328a.h(g02.f14329b.f19753a, this.f14461n).f6663c, this.f6878a).f6686c;
            this.f14474t0 = Z0.w.f7184H;
        }
        if (booleanValue || !g03.f14337j.equals(g02.f14337j)) {
            this.f14474t0 = this.f14474t0.a().M(g02.f14337j).I();
        }
        Z0.w c12 = c1();
        boolean equals2 = c12.equals(this.f14428S);
        this.f14428S = c12;
        boolean z8 = g03.f14339l != g02.f14339l;
        boolean z9 = g03.f14332e != g02.f14332e;
        if (z9 || z8) {
            Q1();
        }
        boolean z10 = g03.f14334g;
        boolean z11 = g02.f14334g;
        boolean z12 = z10 != z11;
        if (z12) {
            P1(z11);
        }
        if (!equals) {
            this.f14457l.h(0, new C1132n.a() { // from class: g1.u
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    C.d dVar = (C.d) obj;
                    dVar.h0(G0.this.f14328a, i6);
                }
            });
        }
        if (z6) {
            final C.e r12 = r1(i7, g03, i8);
            final C.e q12 = q1(j6);
            this.f14457l.h(11, new C1132n.a() { // from class: g1.M
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    S.c0(i7, r12, q12, (C.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f14457l.h(1, new C1132n.a() { // from class: g1.N
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).L(Z0.u.this, intValue);
                }
            });
        }
        if (g03.f14333f != g02.f14333f) {
            this.f14457l.h(10, new C1132n.a() { // from class: g1.O
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).n0(G0.this.f14333f);
                }
            });
            if (g02.f14333f != null) {
                this.f14457l.h(10, new C1132n.a() { // from class: g1.P
                    @Override // c1.C1132n.a
                    public final void invoke(Object obj) {
                        ((C.d) obj).I(G0.this.f14333f);
                    }
                });
            }
        }
        C2444D c2444d = g03.f14336i;
        C2444D c2444d2 = g02.f14336i;
        if (c2444d != c2444d2) {
            this.f14449h.h(c2444d2.f21483e);
            this.f14457l.h(2, new C1132n.a() { // from class: g1.Q
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).f0(G0.this.f14336i.f21482d);
                }
            });
        }
        if (!equals2) {
            final Z0.w wVar = this.f14428S;
            this.f14457l.h(14, new C1132n.a() { // from class: g1.v
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).k0(Z0.w.this);
                }
            });
        }
        if (z12) {
            this.f14457l.h(3, new C1132n.a() { // from class: g1.w
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    S.j0(G0.this, (C.d) obj);
                }
            });
        }
        if (z9 || z8) {
            this.f14457l.h(-1, new C1132n.a() { // from class: g1.x
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).T(r0.f14339l, G0.this.f14332e);
                }
            });
        }
        if (z9) {
            this.f14457l.h(4, new C1132n.a() { // from class: g1.y
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).K(G0.this.f14332e);
                }
            });
        }
        if (z8 || g03.f14340m != g02.f14340m) {
            this.f14457l.h(5, new C1132n.a() { // from class: g1.F
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).j0(r0.f14339l, G0.this.f14340m);
                }
            });
        }
        if (g03.f14341n != g02.f14341n) {
            this.f14457l.h(6, new C1132n.a() { // from class: g1.J
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).A(G0.this.f14341n);
                }
            });
        }
        if (g03.n() != g02.n()) {
            this.f14457l.h(7, new C1132n.a() { // from class: g1.K
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).p0(G0.this.n());
                }
            });
        }
        if (!g03.f14342o.equals(g02.f14342o)) {
            this.f14457l.h(12, new C1132n.a() { // from class: g1.L
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).m(G0.this.f14342o);
                }
            });
        }
        L1();
        this.f14457l.f();
        if (g03.f14343p != g02.f14343p) {
            Iterator it = this.f14459m.iterator();
            while (it.hasNext()) {
                ((InterfaceC1344m.a) it.next()).F(g02.f14343p);
            }
        }
    }

    @Override // Z0.C
    public boolean O() {
        R1();
        return this.f14419J;
    }

    public final void O1(boolean z6, int i6, int i7) {
        this.f14420K++;
        G0 g02 = this.f14476u0;
        if (g02.f14343p) {
            g02 = g02.a();
        }
        G0 e6 = g02.e(z6, i6, i7);
        this.f14455k.Y0(z6, i6, i7);
        N1(e6, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // Z0.C
    public long P() {
        R1();
        return AbstractC1117K.k1(m1(this.f14476u0));
    }

    public final void P1(boolean z6) {
    }

    public final void Q1() {
        int D6 = D();
        if (D6 != 1) {
            if (D6 == 2 || D6 == 3) {
                this.f14413D.b(n() && !w1());
                this.f14414E.b(n());
                return;
            } else if (D6 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f14413D.b(false);
        this.f14414E.b(false);
    }

    public final void R1() {
        this.f14441d.b();
        if (Thread.currentThread() != j1().getThread()) {
            String H6 = AbstractC1117K.H("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), j1().getThread().getName());
            if (this.f14460m0) {
                throw new IllegalStateException(H6);
            }
            AbstractC1133o.i("ExoPlayerImpl", H6, this.f14462n0 ? null : new IllegalStateException());
            this.f14462n0 = true;
        }
    }

    @Override // Z0.AbstractC0834f
    public void T(int i6, long j6, int i7, boolean z6) {
        R1();
        if (i6 == -1) {
            return;
        }
        AbstractC1119a.a(i6 >= 0);
        Z0.G g6 = this.f14476u0.f14328a;
        if (g6.q() || i6 < g6.p()) {
            this.f14469r.O();
            this.f14420K++;
            if (l()) {
                AbstractC1133o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1333g0.e eVar = new C1333g0.e(this.f14476u0);
                eVar.b(1);
                this.f14453j.a(eVar);
                return;
            }
            G0 g02 = this.f14476u0;
            int i8 = g02.f14332e;
            if (i8 == 3 || (i8 == 4 && !g6.q())) {
                g02 = this.f14476u0.h(2);
            }
            int H6 = H();
            G0 x12 = x1(g02, g6, y1(g6, i6, j6));
            this.f14455k.I0(g6, i6, AbstractC1117K.J0(j6));
            N1(x12, 0, true, 1, m1(x12), H6, z6);
        }
    }

    public void Z0(InterfaceC1402b interfaceC1402b) {
        this.f14469r.d0((InterfaceC1402b) AbstractC1119a.e(interfaceC1402b));
    }

    @Override // g1.InterfaceC1344m
    public Z0.q a() {
        R1();
        return this.f14430U;
    }

    public void a1(InterfaceC1344m.a aVar) {
        this.f14459m.add(aVar);
    }

    public final List b1(int i6, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            F0.c cVar = new F0.c((InterfaceC2212D) list.get(i7), this.f14465p);
            arrayList.add(cVar);
            this.f14463o.add(i7 + i6, new f(cVar.f14322b, cVar.f14321a));
        }
        this.f14424O = this.f14424O.f(i6, arrayList.size());
        return arrayList;
    }

    public final Z0.w c1() {
        Z0.G N5 = N();
        if (N5.q()) {
            return this.f14474t0;
        }
        return this.f14474t0.a().K(N5.n(H(), this.f6878a).f6686c.f7067e).I();
    }

    public final int d1(boolean z6, int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (!this.f14417H) {
            return 0;
        }
        if (!z6 || u1()) {
            return (z6 || this.f14476u0.f14341n != 3) ? 0 : 3;
        }
        return 3;
    }

    @Override // Z0.C
    public void e(Z0.B b6) {
        R1();
        if (b6 == null) {
            b6 = Z0.B.f6617d;
        }
        if (this.f14476u0.f14342o.equals(b6)) {
            return;
        }
        G0 g6 = this.f14476u0.g(b6);
        this.f14420K++;
        this.f14455k.a1(b6);
        N1(g6, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final Z0.G f1() {
        return new I0(this.f14463o, this.f14424O);
    }

    @Override // Z0.C
    public Z0.B g() {
        R1();
        return this.f14476u0.f14342o;
    }

    public final List g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            arrayList.add(this.f14467q.d((Z0.u) list.get(i6)));
        }
        return arrayList;
    }

    @Override // Z0.C
    public void h() {
        R1();
        boolean n6 = n();
        int p6 = this.f14411B.p(n6, 2);
        M1(n6, p6, o1(p6));
        G0 g02 = this.f14476u0;
        if (g02.f14332e != 1) {
            return;
        }
        G0 f6 = g02.f(null);
        G0 h6 = f6.h(f6.f14328a.q() ? 4 : 2);
        this.f14420K++;
        this.f14455k.p0();
        N1(h6, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final H0 h1(H0.b bVar) {
        int n12 = n1(this.f14476u0);
        C1333g0 c1333g0 = this.f14455k;
        Z0.G g6 = this.f14476u0.f14328a;
        if (n12 == -1) {
            n12 = 0;
        }
        return new H0(c1333g0, bVar, g6, n12, this.f14481x, c1333g0.I());
    }

    @Override // Z0.C
    public void i(float f6) {
        R1();
        final float o6 = AbstractC1117K.o(f6, 0.0f, 1.0f);
        if (this.f14454j0 == o6) {
            return;
        }
        this.f14454j0 = o6;
        F1();
        this.f14457l.j(22, new C1132n.a() { // from class: g1.z
            @Override // c1.C1132n.a
            public final void invoke(Object obj) {
                ((C.d) obj).J(o6);
            }
        });
    }

    public final Pair i1(G0 g02, G0 g03, boolean z6, int i6, boolean z7, boolean z8) {
        Z0.G g6 = g03.f14328a;
        Z0.G g7 = g02.f14328a;
        if (g7.q() && g6.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i7 = 3;
        if (g7.q() != g6.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (g6.n(g6.h(g03.f14329b.f19753a, this.f14461n).f6663c, this.f6878a).f6684a.equals(g7.n(g7.h(g02.f14329b.f19753a, this.f14461n).f6663c, this.f6878a).f6684a)) {
            return (z6 && i6 == 0 && g03.f14329b.f19756d < g02.f14329b.f19756d) ? new Pair(Boolean.TRUE, 0) : (z6 && i6 == 1 && z8) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z6 && i6 == 0) {
            i7 = 1;
        } else if (z6 && i6 == 1) {
            i7 = 2;
        } else if (!z7) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i7));
    }

    public Looper j1() {
        return this.f14471s;
    }

    @Override // Z0.C
    public void k(Surface surface) {
        R1();
        C1();
        J1(surface);
        int i6 = surface == null ? 0 : -1;
        z1(i6, i6);
    }

    public long k1() {
        R1();
        if (this.f14476u0.f14328a.q()) {
            return this.f14482x0;
        }
        G0 g02 = this.f14476u0;
        if (g02.f14338k.f19756d != g02.f14329b.f19756d) {
            return g02.f14328a.n(H(), this.f6878a).d();
        }
        long j6 = g02.f14344q;
        if (this.f14476u0.f14338k.b()) {
            G0 g03 = this.f14476u0;
            G.b h6 = g03.f14328a.h(g03.f14338k.f19753a, this.f14461n);
            long f6 = h6.f(this.f14476u0.f14338k.f19754b);
            j6 = f6 == Long.MIN_VALUE ? h6.f6664d : f6;
        }
        G0 g04 = this.f14476u0;
        return AbstractC1117K.k1(A1(g04.f14328a, g04.f14338k, j6));
    }

    @Override // Z0.C
    public boolean l() {
        R1();
        return this.f14476u0.f14329b.b();
    }

    public final long l1(G0 g02) {
        if (!g02.f14329b.b()) {
            return AbstractC1117K.k1(m1(g02));
        }
        g02.f14328a.h(g02.f14329b.f19753a, this.f14461n);
        return g02.f14330c == -9223372036854775807L ? g02.f14328a.n(n1(g02), this.f6878a).b() : this.f14461n.m() + AbstractC1117K.k1(g02.f14330c);
    }

    @Override // Z0.C
    public long m() {
        R1();
        return AbstractC1117K.k1(this.f14476u0.f14345r);
    }

    public final long m1(G0 g02) {
        if (g02.f14328a.q()) {
            return AbstractC1117K.J0(this.f14482x0);
        }
        long m6 = g02.f14343p ? g02.m() : g02.f14346s;
        return g02.f14329b.b() ? m6 : A1(g02.f14328a, g02.f14329b, m6);
    }

    @Override // Z0.C
    public boolean n() {
        R1();
        return this.f14476u0.f14339l;
    }

    public final int n1(G0 g02) {
        return g02.f14328a.q() ? this.f14478v0 : g02.f14328a.h(g02.f14329b.f19753a, this.f14461n).f6663c;
    }

    @Override // Z0.C
    public void o(final C0830b c0830b, boolean z6) {
        R1();
        if (this.f14468q0) {
            return;
        }
        if (!AbstractC1117K.c(this.f14452i0, c0830b)) {
            this.f14452i0 = c0830b;
            D1(1, 3, c0830b);
            Q0 q02 = this.f14412C;
            if (q02 != null) {
                q02.h(AbstractC1117K.m0(c0830b.f6866c));
            }
            this.f14457l.h(20, new C1132n.a() { // from class: g1.G
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).E(C0830b.this);
                }
            });
        }
        this.f14411B.m(z6 ? c0830b : null);
        this.f14449h.k(c0830b);
        boolean n6 = n();
        int p6 = this.f14411B.p(n6, D());
        M1(n6, p6, o1(p6));
        this.f14457l.f();
    }

    @Override // Z0.C
    public int p() {
        R1();
        if (this.f14476u0.f14328a.q()) {
            return this.f14480w0;
        }
        G0 g02 = this.f14476u0;
        return g02.f14328a.b(g02.f14329b.f19753a);
    }

    @Override // Z0.C
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C1342l y() {
        R1();
        return this.f14476u0.f14333f;
    }

    @Override // Z0.C
    public Z0.N q() {
        R1();
        return this.f14472s0;
    }

    public final C.e q1(long j6) {
        Object obj;
        int i6;
        Z0.u uVar;
        Object obj2;
        int H6 = H();
        if (this.f14476u0.f14328a.q()) {
            obj = null;
            i6 = -1;
            uVar = null;
            obj2 = null;
        } else {
            G0 g02 = this.f14476u0;
            Object obj3 = g02.f14329b.f19753a;
            g02.f14328a.h(obj3, this.f14461n);
            i6 = this.f14476u0.f14328a.b(obj3);
            obj2 = obj3;
            obj = this.f14476u0.f14328a.n(H6, this.f6878a).f6684a;
            uVar = this.f6878a.f6686c;
        }
        int i7 = i6;
        long k12 = AbstractC1117K.k1(j6);
        long k13 = this.f14476u0.f14329b.b() ? AbstractC1117K.k1(s1(this.f14476u0)) : k12;
        InterfaceC2212D.b bVar = this.f14476u0.f14329b;
        return new C.e(obj, H6, uVar, obj2, i7, k12, k13, bVar.f19754b, bVar.f19755c);
    }

    @Override // Z0.C
    public void r(C.d dVar) {
        this.f14457l.c((C.d) AbstractC1119a.e(dVar));
    }

    public final C.e r1(int i6, G0 g02, int i7) {
        int i8;
        Object obj;
        Z0.u uVar;
        Object obj2;
        int i9;
        long j6;
        long s12;
        G.b bVar = new G.b();
        if (g02.f14328a.q()) {
            i8 = i7;
            obj = null;
            uVar = null;
            obj2 = null;
            i9 = -1;
        } else {
            Object obj3 = g02.f14329b.f19753a;
            g02.f14328a.h(obj3, bVar);
            int i10 = bVar.f6663c;
            int b6 = g02.f14328a.b(obj3);
            Object obj4 = g02.f14328a.n(i10, this.f6878a).f6684a;
            uVar = this.f6878a.f6686c;
            obj2 = obj3;
            i9 = b6;
            obj = obj4;
            i8 = i10;
        }
        if (i6 == 0) {
            if (g02.f14329b.b()) {
                InterfaceC2212D.b bVar2 = g02.f14329b;
                j6 = bVar.b(bVar2.f19754b, bVar2.f19755c);
                s12 = s1(g02);
            } else {
                j6 = g02.f14329b.f19757e != -1 ? s1(this.f14476u0) : bVar.f6665e + bVar.f6664d;
                s12 = j6;
            }
        } else if (g02.f14329b.b()) {
            j6 = g02.f14346s;
            s12 = s1(g02);
        } else {
            j6 = bVar.f6665e + g02.f14346s;
            s12 = j6;
        }
        long k12 = AbstractC1117K.k1(j6);
        long k13 = AbstractC1117K.k1(s12);
        InterfaceC2212D.b bVar3 = g02.f14329b;
        return new C.e(obj, i8, uVar, obj2, i9, k12, k13, bVar3.f19754b, bVar3.f19755c);
    }

    @Override // g1.InterfaceC1344m
    public void release() {
        AudioTrack audioTrack;
        AbstractC1133o.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC1117K.f10564e + "] [" + Z0.v.b() + "]");
        R1();
        if (AbstractC1117K.f10560a < 21 && (audioTrack = this.f14432W) != null) {
            audioTrack.release();
            this.f14432W = null;
        }
        this.f14410A.b(false);
        Q0 q02 = this.f14412C;
        if (q02 != null) {
            q02.g();
        }
        this.f14413D.b(false);
        this.f14414E.b(false);
        this.f14411B.i();
        if (!this.f14455k.r0()) {
            this.f14457l.j(10, new C1132n.a() { // from class: g1.B
                @Override // c1.C1132n.a
                public final void invoke(Object obj) {
                    ((C.d) obj).I(C1342l.d(new C1335h0(1), 1003));
                }
            });
        }
        this.f14457l.i();
        this.f14451i.j(null);
        this.f14473t.h(this.f14469r);
        G0 g02 = this.f14476u0;
        if (g02.f14343p) {
            this.f14476u0 = g02.a();
        }
        G0 h6 = this.f14476u0.h(1);
        this.f14476u0 = h6;
        G0 c6 = h6.c(h6.f14329b);
        this.f14476u0 = c6;
        c6.f14344q = c6.f14346s;
        this.f14476u0.f14345r = 0L;
        this.f14469r.release();
        this.f14449h.i();
        C1();
        Surface surface = this.f14434Y;
        if (surface != null) {
            surface.release();
            this.f14434Y = null;
        }
        if (this.f14466p0) {
            android.support.v4.media.session.b.a(AbstractC1119a.e(null));
            throw null;
        }
        this.f14458l0 = b1.b.f10444c;
        this.f14468q0 = true;
    }

    @Override // Z0.C
    public float s() {
        R1();
        return this.f14454j0;
    }

    public final void t1(C1333g0.e eVar) {
        boolean z6;
        long j6;
        int i6 = this.f14420K - eVar.f14632c;
        this.f14420K = i6;
        boolean z7 = true;
        if (eVar.f14633d) {
            this.f14421L = eVar.f14634e;
            this.f14422M = true;
        }
        if (i6 == 0) {
            Z0.G g6 = eVar.f14631b.f14328a;
            if (!this.f14476u0.f14328a.q() && g6.q()) {
                this.f14478v0 = -1;
                this.f14482x0 = 0L;
                this.f14480w0 = 0;
            }
            if (!g6.q()) {
                List F6 = ((I0) g6).F();
                AbstractC1119a.g(F6.size() == this.f14463o.size());
                for (int i7 = 0; i7 < F6.size(); i7++) {
                    ((f) this.f14463o.get(i7)).c((Z0.G) F6.get(i7));
                }
            }
            long j7 = -9223372036854775807L;
            if (this.f14422M) {
                if (eVar.f14631b.f14329b.equals(this.f14476u0.f14329b) && eVar.f14631b.f14331d == this.f14476u0.f14346s) {
                    z7 = false;
                }
                if (z7) {
                    if (g6.q() || eVar.f14631b.f14329b.b()) {
                        j6 = eVar.f14631b.f14331d;
                    } else {
                        G0 g02 = eVar.f14631b;
                        j6 = A1(g6, g02.f14329b, g02.f14331d);
                    }
                    j7 = j6;
                }
                z6 = z7;
            } else {
                z6 = false;
            }
            this.f14422M = false;
            N1(eVar.f14631b, 1, z6, this.f14421L, j7, -1, false);
        }
    }

    @Override // Z0.C
    public void u(List list, boolean z6) {
        R1();
        G1(g1(list), z6);
    }

    public final boolean u1() {
        AudioManager audioManager = this.f14416G;
        if (audioManager == null || AbstractC1117K.f10560a < 23) {
            return true;
        }
        return b.a(this.f14443e, audioManager.getDevices(2));
    }

    public final int v1(int i6) {
        AudioTrack audioTrack = this.f14432W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i6) {
            this.f14432W.release();
            this.f14432W = null;
        }
        if (this.f14432W == null) {
            this.f14432W = new AudioTrack(3, 4000, 4, 2, 2, 0, i6);
        }
        return this.f14432W.getAudioSessionId();
    }

    @Override // Z0.C
    public int w() {
        R1();
        if (l()) {
            return this.f14476u0.f14329b.f19755c;
        }
        return -1;
    }

    public boolean w1() {
        R1();
        return this.f14476u0.f14343p;
    }

    public final G0 x1(G0 g02, Z0.G g6, Pair pair) {
        AbstractC1119a.a(g6.q() || pair != null);
        Z0.G g7 = g02.f14328a;
        long l12 = l1(g02);
        G0 j6 = g02.j(g6);
        if (g6.q()) {
            InterfaceC2212D.b l6 = G0.l();
            long J02 = AbstractC1117K.J0(this.f14482x0);
            G0 c6 = j6.d(l6, J02, J02, J02, 0L, w1.l0.f20068d, this.f14437b, z6.w.w()).c(l6);
            c6.f14344q = c6.f14346s;
            return c6;
        }
        Object obj = j6.f14329b.f19753a;
        boolean equals = obj.equals(((Pair) AbstractC1117K.i(pair)).first);
        InterfaceC2212D.b bVar = !equals ? new InterfaceC2212D.b(pair.first) : j6.f14329b;
        long longValue = ((Long) pair.second).longValue();
        long J03 = AbstractC1117K.J0(l12);
        if (!g7.q()) {
            J03 -= g7.h(obj, this.f14461n).n();
        }
        if (!equals || longValue < J03) {
            InterfaceC2212D.b bVar2 = bVar;
            AbstractC1119a.g(!bVar2.b());
            G0 c7 = j6.d(bVar2, longValue, longValue, longValue, 0L, !equals ? w1.l0.f20068d : j6.f14335h, !equals ? this.f14437b : j6.f14336i, !equals ? z6.w.w() : j6.f14337j).c(bVar2);
            c7.f14344q = longValue;
            return c7;
        }
        if (longValue != J03) {
            InterfaceC2212D.b bVar3 = bVar;
            AbstractC1119a.g(!bVar3.b());
            long max = Math.max(0L, j6.f14345r - (longValue - J03));
            long j7 = j6.f14344q;
            if (j6.f14338k.equals(j6.f14329b)) {
                j7 = longValue + max;
            }
            G0 d6 = j6.d(bVar3, longValue, longValue, longValue, max, j6.f14335h, j6.f14336i, j6.f14337j);
            d6.f14344q = j7;
            return d6;
        }
        int b6 = g6.b(j6.f14338k.f19753a);
        if (b6 != -1 && g6.f(b6, this.f14461n).f6663c == g6.h(bVar.f19753a, this.f14461n).f6663c) {
            return j6;
        }
        g6.h(bVar.f19753a, this.f14461n);
        long b7 = bVar.b() ? this.f14461n.b(bVar.f19754b, bVar.f19755c) : this.f14461n.f6664d;
        InterfaceC2212D.b bVar4 = bVar;
        G0 c8 = j6.d(bVar4, j6.f14346s, j6.f14346s, j6.f14331d, b7 - j6.f14346s, j6.f14335h, j6.f14336i, j6.f14337j).c(bVar4);
        c8.f14344q = b7;
        return c8;
    }

    public final Pair y1(Z0.G g6, int i6, long j6) {
        if (g6.q()) {
            this.f14478v0 = i6;
            if (j6 == -9223372036854775807L) {
                j6 = 0;
            }
            this.f14482x0 = j6;
            this.f14480w0 = 0;
            return null;
        }
        if (i6 == -1 || i6 >= g6.p()) {
            i6 = g6.a(this.f14419J);
            j6 = g6.n(i6, this.f6878a).b();
        }
        return g6.j(this.f6878a, this.f14461n, i6, AbstractC1117K.J0(j6));
    }

    @Override // Z0.C
    public void z(boolean z6) {
        R1();
        int p6 = this.f14411B.p(z6, D());
        M1(z6, p6, o1(p6));
    }

    public final void z1(final int i6, final int i7) {
        if (i6 == this.f14444e0.b() && i7 == this.f14444e0.a()) {
            return;
        }
        this.f14444e0 = new C1107A(i6, i7);
        this.f14457l.j(24, new C1132n.a() { // from class: g1.A
            @Override // c1.C1132n.a
            public final void invoke(Object obj) {
                ((C.d) obj).m0(i6, i7);
            }
        });
        D1(2, 14, new C1107A(i6, i7));
    }
}
