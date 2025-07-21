package y;

import F.AbstractC0335i0;
import F.AbstractC0347t;
import I.A;
import I.AbstractC0465z;
import I.C0445o0;
import I.C0458v0;
import I.E;
import I.InterfaceC0459w;
import I.J;
import I.L0;
import I.N;
import I.W;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.AbstractC1728c;
import y.C2286a1;
import y.K;
import y.r1;
import z.AbstractC2369a;
import z.C2362A;
import z.C2375g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class K implements I.E {

    /* renamed from: A, reason: collision with root package name */
    public final Object f20755A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f20756B;

    /* renamed from: C, reason: collision with root package name */
    public final D0 f20757C;

    /* renamed from: D, reason: collision with root package name */
    public final C2362A f20758D;

    /* renamed from: E, reason: collision with root package name */
    public final A.e f20759E;

    /* renamed from: a, reason: collision with root package name */
    public final I.X0 f20760a;

    /* renamed from: b, reason: collision with root package name */
    public final z.N f20761b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20762c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20763d;

    /* renamed from: e, reason: collision with root package name */
    public volatile g f20764e = g.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    public final C0458v0 f20765f;

    /* renamed from: g, reason: collision with root package name */
    public final C2325q0 f20766g;

    /* renamed from: h, reason: collision with root package name */
    public final C2331u f20767h;

    /* renamed from: i, reason: collision with root package name */
    public final h f20768i;

    /* renamed from: j, reason: collision with root package name */
    public final N f20769j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f20770k;

    /* renamed from: l, reason: collision with root package name */
    public int f20771l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC2342z0 f20772m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f20773n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC1728c.a f20774o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f20775p;

    /* renamed from: q, reason: collision with root package name */
    public final d f20776q;

    /* renamed from: r, reason: collision with root package name */
    public final e f20777r;

    /* renamed from: s, reason: collision with root package name */
    public final G.a f20778s;

    /* renamed from: t, reason: collision with root package name */
    public final I.J f20779t;

    /* renamed from: u, reason: collision with root package name */
    public final Set f20780u;

    /* renamed from: v, reason: collision with root package name */
    public C2286a1 f20781v;

    /* renamed from: w, reason: collision with root package name */
    public final B0 f20782w;

    /* renamed from: x, reason: collision with root package name */
    public final r1.a f20783x;

    /* renamed from: y, reason: collision with root package name */
    public final Set f20784y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0459w f20785z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2342z0 f20786a;

        public a(InterfaceC2342z0 interfaceC2342z0) {
            this.f20786a = interfaceC2342z0;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            K.this.f20775p.remove(this.f20786a);
            int i6 = c.f20789a[K.this.f20764e.ordinal()];
            if (i6 != 3) {
                if (i6 != 7) {
                    if (i6 != 8) {
                        return;
                    }
                } else if (K.this.f20771l == 0) {
                    return;
                }
            }
            if (!K.this.S() || (cameraDevice = K.this.f20770k) == null) {
                return;
            }
            AbstractC2369a.a(cameraDevice);
            K.this.f20770k = null;
        }

        @Override // N.c
        public void onFailure(Throwable th) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements N.c {
        public b() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (K.this.f20778s.a() == 2 && K.this.f20764e == g.OPENED) {
                K.this.f0(g.CONFIGURED);
            }
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            if (th instanceof W.a) {
                I.L0 L5 = K.this.L(((W.a) th).a());
                if (L5 != null) {
                    K.this.Z(L5);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                K.this.J("Unable to configure camera cancelled");
                return;
            }
            g gVar = K.this.f20764e;
            g gVar2 = g.OPENED;
            if (gVar == gVar2) {
                K.this.g0(gVar2, AbstractC0347t.a.b(4, th));
            }
            if (th instanceof CameraAccessException) {
                K.this.J("Unable to configure camera due to " + th.getMessage());
                return;
            }
            if (th instanceof TimeoutException) {
                AbstractC0335i0.c("Camera2CameraImpl", "Unable to configure camera " + K.this.f20769j.d() + ", timeout!");
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20789a;

        static {
            int[] iArr = new int[g.values().length];
            f20789a = iArr;
            try {
                iArr[g.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20789a[g.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20789a[g.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20789a[g.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20789a[g.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20789a[g.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20789a[g.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20789a[g.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20789a[g.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements J.c {

        /* renamed from: a, reason: collision with root package name */
        public final String f20790a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20791b = true;

        public d(String str) {
            this.f20790a = str;
        }

        @Override // I.J.c
        public void a() {
            if (K.this.f20764e == g.PENDING_OPEN) {
                K.this.n0(false);
            }
        }

        public boolean b() {
            return this.f20791b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f20790a.equals(str)) {
                this.f20791b = true;
                if (K.this.f20764e == g.PENDING_OPEN) {
                    K.this.n0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f20790a.equals(str)) {
                this.f20791b = false;
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class e implements J.b {
        public e() {
        }

        @Override // I.J.b
        public void a() {
            if (K.this.f20764e == g.OPENED) {
                K.this.X();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f implements A.c {
        public f() {
        }

        @Override // I.A.c
        public void a() {
            K.this.o0();
        }

        @Override // I.A.c
        public void b(List list) {
            K.this.i0((List) y0.g.f(list));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum g {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class h extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f20805a;

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f20806b;

        /* renamed from: c, reason: collision with root package name */
        public b f20807c;

        /* renamed from: d, reason: collision with root package name */
        public ScheduledFuture f20808d;

        /* renamed from: e, reason: collision with root package name */
        public final a f20809e = new a();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public long f20811a = -1;

            public a() {
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f20811a == -1) {
                    this.f20811a = uptimeMillis;
                }
                return uptimeMillis - this.f20811a;
            }

            public int c() {
                if (!h.this.f()) {
                    return 700;
                }
                long b6 = b();
                if (b6 <= 120000) {
                    return 1000;
                }
                return b6 <= 300000 ? 2000 : 4000;
            }

            public int d() {
                return !h.this.f() ? 10000 : 1800000;
            }

            public void e() {
                this.f20811a = -1L;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public Executor f20813a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f20814b = false;

            public b(Executor executor) {
                this.f20813a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.f20814b) {
                    return;
                }
                y0.g.h(K.this.f20764e == g.REOPENING);
                if (h.this.f()) {
                    K.this.m0(true);
                } else {
                    K.this.n0(true);
                }
            }

            public void b() {
                this.f20814b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f20813a.execute(new Runnable() { // from class: y.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.h.b.a(K.h.b.this);
                    }
                });
            }
        }

        public h(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f20805a = executor;
            this.f20806b = scheduledExecutorService;
        }

        public boolean a() {
            if (this.f20808d == null) {
                return false;
            }
            K.this.J("Cancelling scheduled re-open: " + this.f20807c);
            this.f20807c.b();
            this.f20807c = null;
            this.f20808d.cancel(false);
            this.f20808d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i6) {
            y0.g.i(K.this.f20764e == g.OPENING || K.this.f20764e == g.OPENED || K.this.f20764e == g.CONFIGURED || K.this.f20764e == g.REOPENING, "Attempt to handle open error from non open state: " + K.this.f20764e);
            if (i6 == 1 || i6 == 2 || i6 == 4) {
                AbstractC0335i0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), K.N(i6)));
                c(i6);
                return;
            }
            AbstractC0335i0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + K.N(i6) + " closing camera.");
            K.this.g0(g.CLOSING, AbstractC0347t.a.a(i6 == 3 ? 5 : 6));
            K.this.F(false);
        }

        public final void c(int i6) {
            int i7 = 1;
            y0.g.i(K.this.f20771l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i6 == 1) {
                i7 = 2;
            } else if (i6 != 2) {
                i7 = 3;
            }
            K.this.g0(g.REOPENING, AbstractC0347t.a.a(i7));
            K.this.F(false);
        }

        public void d() {
            this.f20809e.e();
        }

        public void e() {
            y0.g.h(this.f20807c == null);
            y0.g.h(this.f20808d == null);
            if (!this.f20809e.a()) {
                AbstractC0335i0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f20809e.d() + "ms without success.");
                K.this.h0(g.PENDING_OPEN, null, false);
                return;
            }
            this.f20807c = new b(this.f20805a);
            K.this.J("Attempting camera re-open in " + this.f20809e.c() + "ms: " + this.f20807c + " activeResuming = " + K.this.f20756B);
            this.f20808d = this.f20806b.schedule(this.f20807c, (long) this.f20809e.c(), TimeUnit.MILLISECONDS);
        }

        public boolean f() {
            K k6 = K.this;
            if (!k6.f20756B) {
                return false;
            }
            int i6 = k6.f20771l;
            return i6 == 1 || i6 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            K.this.J("CameraDevice.onClosed()");
            y0.g.i(K.this.f20770k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i6 = c.f20789a[K.this.f20764e.ordinal()];
            if (i6 != 3) {
                if (i6 == 7) {
                    K k6 = K.this;
                    if (k6.f20771l == 0) {
                        k6.n0(false);
                        return;
                    }
                    k6.J("Camera closed due to error: " + K.N(K.this.f20771l));
                    e();
                    return;
                }
                if (i6 != 8) {
                    throw new IllegalStateException("Camera closed while in state: " + K.this.f20764e);
                }
            }
            y0.g.h(K.this.S());
            K.this.M();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            K.this.J("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i6) {
            K k6 = K.this;
            k6.f20770k = cameraDevice;
            k6.f20771l = i6;
            switch (c.f20789a[k6.f20764e.ordinal()]) {
                case 3:
                case 8:
                    AbstractC0335i0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), K.N(i6), K.this.f20764e.name()));
                    K.this.F(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    AbstractC0335i0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), K.N(i6), K.this.f20764e.name()));
                    b(cameraDevice, i6);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + K.this.f20764e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            K.this.J("CameraDevice.onOpened()");
            K k6 = K.this;
            k6.f20770k = cameraDevice;
            k6.f20771l = 0;
            d();
            int i6 = c.f20789a[K.this.f20764e.ordinal()];
            if (i6 != 3) {
                if (i6 == 6 || i6 == 7) {
                    K.this.f0(g.OPENED);
                    I.J j6 = K.this.f20779t;
                    String id = cameraDevice.getId();
                    K k7 = K.this;
                    if (j6.i(id, k7.f20778s.c(k7.f20770k.getId()))) {
                        K.this.X();
                        return;
                    }
                    return;
                }
                if (i6 != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + K.this.f20764e);
                }
            }
            y0.g.h(K.this.S());
            K.this.f20770k.close();
            K.this.f20770k = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class i {
        public static i a(String str, Class cls, I.L0 l02, I.Y0 y02, Size size) {
            return new C2293d(str, cls, l02, y02, size);
        }

        public static i b(F.I0 i02) {
            return a(K.P(i02), i02.getClass(), i02.t(), i02.j(), i02.f());
        }

        public abstract I.L0 c();

        public abstract Size d();

        public abstract I.Y0 e();

        public abstract String f();

        public abstract Class g();
    }

    public K(z.N n6, String str, N n7, G.a aVar, I.J j6, Executor executor, Handler handler, D0 d02) {
        C0458v0 c0458v0 = new C0458v0();
        this.f20765f = c0458v0;
        this.f20771l = 0;
        this.f20773n = new AtomicInteger(0);
        this.f20775p = new LinkedHashMap();
        this.f20780u = new HashSet();
        this.f20784y = new HashSet();
        this.f20785z = AbstractC0465z.a();
        this.f20755A = new Object();
        this.f20756B = false;
        this.f20761b = n6;
        this.f20778s = aVar;
        this.f20779t = j6;
        ScheduledExecutorService f6 = M.c.f(handler);
        this.f20763d = f6;
        Executor g6 = M.c.g(executor);
        this.f20762c = g6;
        this.f20768i = new h(g6, f6);
        this.f20760a = new I.X0(str);
        c0458v0.i(E.a.CLOSED);
        C2325q0 c2325q0 = new C2325q0(j6);
        this.f20766g = c2325q0;
        B0 b02 = new B0(g6);
        this.f20782w = b02;
        this.f20757C = d02;
        try {
            C2362A c6 = n6.c(str);
            this.f20758D = c6;
            C2331u c2331u = new C2331u(c6, f6, g6, new f(), n7.l());
            this.f20767h = c2331u;
            this.f20769j = n7;
            n7.s(c2331u);
            n7.v(c2325q0.a());
            this.f20759E = A.e.a(c6);
            this.f20772m = T();
            this.f20783x = new r1.a(g6, f6, handler, b02, n7.l(), B.l.b());
            d dVar = new d(str);
            this.f20776q = dVar;
            e eVar = new e();
            this.f20777r = eVar;
            j6.g(this, g6, eVar, dVar);
            n6.g(g6, dVar);
        } catch (C2375g e6) {
            throw AbstractC2326r0.a(e6);
        }
    }

    public static /* synthetic */ void A(K k6) {
        if (k6.R()) {
            k6.e0(O(k6.f20781v), k6.f20781v.g(), k6.f20781v.h());
        }
    }

    public static /* synthetic */ void B(K k6, String str) {
        k6.getClass();
        k6.J("Use case " + str + " INACTIVE");
        k6.f20760a.q(str);
        k6.o0();
    }

    public static String N(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String O(C2286a1 c2286a1) {
        return c2286a1.e() + c2286a1.hashCode();
    }

    public static String P(F.I0 i02) {
        return i02.o() + i02.hashCode();
    }

    public static /* synthetic */ void q(K k6, boolean z6) {
        k6.f20756B = z6;
        if (z6 && k6.f20764e == g.PENDING_OPEN) {
            k6.m0(false);
        }
    }

    public static /* synthetic */ void r(K k6, String str, I.L0 l02, I.Y0 y02) {
        k6.getClass();
        k6.J("Use case " + str + " RESET");
        k6.f20760a.r(str, l02, y02);
        k6.D();
        k6.d0(false);
        k6.o0();
        if (k6.f20764e == g.OPENED) {
            k6.X();
        }
    }

    public static /* synthetic */ void s(K k6, List list) {
        k6.getClass();
        try {
            k6.k0(list);
        } finally {
            k6.f20767h.y();
        }
    }

    public static /* synthetic */ void t(K k6, String str, I.L0 l02, I.Y0 y02) {
        k6.getClass();
        k6.J("Use case " + str + " UPDATED");
        k6.f20760a.r(str, l02, y02);
        k6.o0();
    }

    public static /* synthetic */ void v(K k6, AbstractC1728c.a aVar) {
        C2286a1 c2286a1 = k6.f20781v;
        if (c2286a1 == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(k6.f20760a.l(O(c2286a1))));
        }
    }

    public static /* synthetic */ void w(K k6, String str, I.L0 l02, I.Y0 y02) {
        k6.getClass();
        k6.J("Use case " + str + " ACTIVE");
        k6.f20760a.n(str, l02, y02);
        k6.f20760a.r(str, l02, y02);
        k6.o0();
    }

    public static /* synthetic */ Object x(final K k6, final AbstractC1728c.a aVar) {
        k6.getClass();
        try {
            k6.f20762c.execute(new Runnable() { // from class: y.A
                @Override // java.lang.Runnable
                public final void run() {
                    K.v(K.this, aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void y(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public final void C() {
        C2286a1 c2286a1 = this.f20781v;
        if (c2286a1 != null) {
            String O5 = O(c2286a1);
            this.f20760a.o(O5, this.f20781v.g(), this.f20781v.h());
            this.f20760a.n(O5, this.f20781v.g(), this.f20781v.h());
        }
    }

    public final void D() {
        I.L0 b6 = this.f20760a.f().b();
        I.N h6 = b6.h();
        int size = h6.g().size();
        int size2 = b6.k().size();
        if (b6.k().isEmpty()) {
            return;
        }
        if (h6.g().isEmpty()) {
            if (this.f20781v == null) {
                this.f20781v = new C2286a1(this.f20769j.p(), this.f20757C, new C2286a1.c() { // from class: y.y
                    @Override // y.C2286a1.c
                    public final void a() {
                        K.A(K.this);
                    }
                });
            }
            C();
        } else {
            if (size2 == 1 && size == 1) {
                c0();
                return;
            }
            if (size >= 2) {
                c0();
                return;
            }
            AbstractC0335i0.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    public final boolean E(N.a aVar) {
        if (!aVar.m().isEmpty()) {
            AbstractC0335i0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f20760a.e().iterator();
        while (it.hasNext()) {
            List g6 = ((I.L0) it.next()).h().g();
            if (!g6.isEmpty()) {
                Iterator it2 = g6.iterator();
                while (it2.hasNext()) {
                    aVar.f((I.W) it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        AbstractC0335i0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void F(boolean z6) {
        y0.g.i(this.f20764e == g.CLOSING || this.f20764e == g.RELEASING || (this.f20764e == g.REOPENING && this.f20771l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f20764e + " (error: " + N(this.f20771l) + ")");
        if (Build.VERSION.SDK_INT < 29 && Q() && this.f20771l == 0) {
            H(z6);
        } else {
            d0(z6);
        }
        this.f20772m.b();
    }

    public final void G() {
        J("Closing camera.");
        int i6 = c.f20789a[this.f20764e.ordinal()];
        if (i6 == 2) {
            y0.g.h(this.f20770k == null);
            f0(g.INITIALIZED);
            return;
        }
        if (i6 == 4 || i6 == 5) {
            f0(g.CLOSING);
            F(false);
            return;
        }
        if (i6 != 6 && i6 != 7) {
            J("close() ignored due to being in state: " + this.f20764e);
            return;
        }
        boolean a6 = this.f20768i.a();
        f0(g.CLOSING);
        if (a6) {
            y0.g.h(S());
            M();
        }
    }

    public final void H(boolean z6) {
        final C2340y0 c2340y0 = new C2340y0(this.f20759E);
        this.f20780u.add(c2340y0);
        d0(z6);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: y.x
            @Override // java.lang.Runnable
            public final void run() {
                K.y(surface, surfaceTexture);
            }
        };
        L0.b bVar = new L0.b();
        final C0445o0 c0445o0 = new C0445o0(surface);
        bVar.h(c0445o0);
        bVar.w(1);
        J("Start configAndClose.");
        c2340y0.a(bVar.o(), (CameraDevice) y0.g.f(this.f20770k), this.f20783x.a()).c(new Runnable() { // from class: y.B
            @Override // java.lang.Runnable
            public final void run() {
                K.this.a0(c2340y0, c0445o0, runnable);
            }
        }, this.f20762c);
    }

    public final CameraDevice.StateCallback I() {
        ArrayList arrayList = new ArrayList(this.f20760a.f().b().b());
        arrayList.add(this.f20782w.c());
        arrayList.add(this.f20768i);
        return AbstractC2321o0.a(arrayList);
    }

    public void J(String str) {
        K(str, null);
    }

    public final void K(String str, Throwable th) {
        AbstractC0335i0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public I.L0 L(I.W w6) {
        for (I.L0 l02 : this.f20760a.g()) {
            if (l02.k().contains(w6)) {
                return l02;
            }
        }
        return null;
    }

    public void M() {
        y0.g.h(this.f20764e == g.RELEASING || this.f20764e == g.CLOSING);
        y0.g.h(this.f20775p.isEmpty());
        this.f20770k = null;
        if (this.f20764e == g.CLOSING) {
            f0(g.INITIALIZED);
            return;
        }
        this.f20761b.h(this.f20776q);
        f0(g.RELEASED);
        AbstractC1728c.a aVar = this.f20774o;
        if (aVar != null) {
            aVar.c(null);
            this.f20774o = null;
        }
    }

    public final boolean Q() {
        return ((N) n()).r() == 2;
    }

    public boolean R() {
        try {
            return ((Boolean) AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.z
                @Override // l0.AbstractC1728c.InterfaceC0214c
                public final Object a(AbstractC1728c.a aVar) {
                    return K.x(K.this, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e6) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e6);
        }
    }

    public boolean S() {
        return this.f20775p.isEmpty() && this.f20780u.isEmpty();
    }

    public final InterfaceC2342z0 T() {
        C2340y0 c2340y0;
        synchronized (this.f20755A) {
            c2340y0 = new C2340y0(this.f20759E);
        }
        return c2340y0;
    }

    public final void U(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.I0 i02 = (F.I0) it.next();
            String P5 = P(i02);
            if (!this.f20784y.contains(P5)) {
                this.f20784y.add(P5);
                i02.K();
                i02.I();
            }
        }
    }

    public final void V(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.I0 i02 = (F.I0) it.next();
            String P5 = P(i02);
            if (this.f20784y.contains(P5)) {
                i02.L();
                this.f20784y.remove(P5);
            }
        }
    }

    public final void W(boolean z6) {
        if (!z6) {
            this.f20768i.d();
        }
        this.f20768i.a();
        J("Opening camera.");
        f0(g.OPENING);
        try {
            this.f20761b.f(this.f20769j.d(), this.f20762c, I());
        } catch (SecurityException e6) {
            J("Unable to open camera due to " + e6.getMessage());
            f0(g.REOPENING);
            this.f20768i.e();
        } catch (C2375g e7) {
            J("Unable to open camera due to " + e7.getMessage());
            if (e7.d() != 10001) {
                return;
            }
            g0(g.INITIALIZED, AbstractC0347t.a.b(7, e7));
        }
    }

    public void X() {
        y0.g.h(this.f20764e == g.OPENED);
        L0.g f6 = this.f20760a.f();
        if (!f6.d()) {
            J("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (this.f20779t.i(this.f20770k.getId(), this.f20778s.c(this.f20770k.getId()))) {
            HashMap hashMap = new HashMap();
            AbstractC2292c1.m(this.f20760a.g(), this.f20760a.h(), hashMap);
            this.f20772m.h(hashMap);
            N.f.b(this.f20772m.a(f6.b(), (CameraDevice) y0.g.f(this.f20770k), this.f20783x.a()), new b(), this.f20762c);
            return;
        }
        J("Unable to create capture session in camera operating mode = " + this.f20778s.a());
    }

    public final void Y() {
        int i6 = c.f20789a[this.f20764e.ordinal()];
        if (i6 == 1 || i6 == 2) {
            m0(false);
            return;
        }
        if (i6 != 3) {
            J("open() ignored due to being in state: " + this.f20764e);
            return;
        }
        f0(g.REOPENING);
        if (S() || this.f20771l != 0) {
            return;
        }
        y0.g.i(this.f20770k != null, "Camera Device should be open if session close is not complete");
        f0(g.OPENED);
        X();
    }

    public void Z(final I.L0 l02) {
        ScheduledExecutorService e6 = M.c.e();
        List c6 = l02.c();
        if (c6.isEmpty()) {
            return;
        }
        final L0.c cVar = (L0.c) c6.get(0);
        K("Posting surface closed", new Throwable());
        e6.execute(new Runnable() { // from class: y.H
            @Override // java.lang.Runnable
            public final void run() {
                L0.c.this.a(l02, L0.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        });
    }

    public void a0(C2340y0 c2340y0, I.W w6, Runnable runnable) {
        this.f20780u.remove(c2340y0);
        D6.g b02 = b0(c2340y0, false);
        w6.d();
        N.f.m(Arrays.asList(b02, w6.k())).c(runnable, M.c.b());
    }

    public D6.g b0(InterfaceC2342z0 interfaceC2342z0, boolean z6) {
        interfaceC2342z0.close();
        D6.g d6 = interfaceC2342z0.d(z6);
        J("Releasing session in state " + this.f20764e.name());
        this.f20775p.put(interfaceC2342z0, d6);
        N.f.b(d6, new a(interfaceC2342z0), M.c.b());
        return d6;
    }

    @Override // F.I0.d
    public void c(F.I0 i02) {
        y0.g.f(i02);
        final String P5 = P(i02);
        final I.L0 t6 = i02.t();
        final I.Y0 j6 = i02.j();
        this.f20762c.execute(new Runnable() { // from class: y.G
            @Override // java.lang.Runnable
            public final void run() {
                K.w(K.this, P5, t6, j6);
            }
        });
    }

    public final void c0() {
        if (this.f20781v != null) {
            this.f20760a.p(this.f20781v.e() + this.f20781v.hashCode());
            this.f20760a.q(this.f20781v.e() + this.f20781v.hashCode());
            this.f20781v.c();
            this.f20781v = null;
        }
    }

    public void d0(boolean z6) {
        y0.g.h(this.f20772m != null);
        J("Resetting Capture Session");
        InterfaceC2342z0 interfaceC2342z0 = this.f20772m;
        I.L0 g6 = interfaceC2342z0.g();
        List e6 = interfaceC2342z0.e();
        InterfaceC2342z0 T5 = T();
        this.f20772m = T5;
        T5.c(g6);
        this.f20772m.f(e6);
        b0(interfaceC2342z0, z6);
    }

    @Override // I.E
    public I.A e() {
        return this.f20767h;
    }

    public final void e0(final String str, final I.L0 l02, final I.Y0 y02) {
        this.f20762c.execute(new Runnable() { // from class: y.D
            @Override // java.lang.Runnable
            public final void run() {
                K.r(K.this, str, l02, y02);
            }
        });
    }

    @Override // F.I0.d
    public void f(F.I0 i02) {
        y0.g.f(i02);
        e0(P(i02), i02.t(), i02.j());
    }

    public void f0(g gVar) {
        g0(gVar, null);
    }

    @Override // I.E
    public InterfaceC0459w g() {
        return this.f20785z;
    }

    public void g0(g gVar, AbstractC0347t.a aVar) {
        h0(gVar, aVar, true);
    }

    @Override // I.E
    public void h(final boolean z6) {
        this.f20762c.execute(new Runnable() { // from class: y.J
            @Override // java.lang.Runnable
            public final void run() {
                K.q(K.this, z6);
            }
        });
    }

    public void h0(g gVar, AbstractC0347t.a aVar, boolean z6) {
        E.a aVar2;
        J("Transitioning camera internal state: " + this.f20764e + " --> " + gVar);
        this.f20764e = gVar;
        switch (c.f20789a[gVar.ordinal()]) {
            case 1:
                aVar2 = E.a.CLOSED;
                break;
            case 2:
                aVar2 = E.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = E.a.CLOSING;
                break;
            case 4:
                aVar2 = E.a.OPEN;
                break;
            case 5:
                aVar2 = E.a.CONFIGURED;
                break;
            case 6:
            case 7:
                aVar2 = E.a.OPENING;
                break;
            case 8:
                aVar2 = E.a.RELEASING;
                break;
            case 9:
                aVar2 = E.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + gVar);
        }
        this.f20779t.e(this, aVar2, z6);
        this.f20765f.i(aVar2);
        this.f20766g.c(aVar2, aVar);
    }

    @Override // F.I0.d
    public void i(F.I0 i02) {
        y0.g.f(i02);
        final String P5 = P(i02);
        final I.L0 t6 = i02.t();
        final I.Y0 j6 = i02.j();
        this.f20762c.execute(new Runnable() { // from class: y.E
            @Override // java.lang.Runnable
            public final void run() {
                K.t(K.this, P5, t6, j6);
            }
        });
    }

    public void i0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I.N n6 = (I.N) it.next();
            N.a k6 = N.a.k(n6);
            if (n6.i() == 5 && n6.d() != null) {
                k6.p(n6.d());
            }
            if (!n6.g().isEmpty() || !n6.j() || E(k6)) {
                arrayList.add(k6.h());
            }
        }
        J("Issue capture request");
        this.f20772m.f(arrayList);
    }

    @Override // I.E
    public void j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f20767h.R();
        U(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(j0(arrayList));
        try {
            this.f20762c.execute(new Runnable() { // from class: y.C
                @Override // java.lang.Runnable
                public final void run() {
                    K.s(K.this, arrayList2);
                }
            });
        } catch (RejectedExecutionException e6) {
            K("Unable to attach use cases.", e6);
            this.f20767h.y();
        }
    }

    public final Collection j0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i.b((F.I0) it.next()));
        }
        return arrayList;
    }

    @Override // I.E
    public void k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(j0(arrayList));
        V(new ArrayList(arrayList));
        this.f20762c.execute(new Runnable() { // from class: y.I
            @Override // java.lang.Runnable
            public final void run() {
                K.this.l0(arrayList2);
            }
        });
    }

    public final void k0(Collection collection) {
        Size d6;
        boolean isEmpty = this.f20760a.g().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!this.f20760a.l(iVar.f())) {
                this.f20760a.o(iVar.f(), iVar.c(), iVar.e());
                arrayList.add(iVar.f());
                if (iVar.g() == F.q0.class && (d6 = iVar.d()) != null) {
                    rational = new Rational(d6.getWidth(), d6.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        J("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f20767h.Y(true);
            this.f20767h.R();
        }
        D();
        p0();
        o0();
        d0(false);
        if (this.f20764e == g.OPENED) {
            X();
        } else {
            Y();
        }
        if (rational != null) {
            this.f20767h.Z(rational);
        }
    }

    @Override // F.I0.d
    public void l(F.I0 i02) {
        y0.g.f(i02);
        final String P5 = P(i02);
        this.f20762c.execute(new Runnable() { // from class: y.F
            @Override // java.lang.Runnable
            public final void run() {
                K.B(K.this, P5);
            }
        });
    }

    public final void l0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (this.f20760a.l(iVar.f())) {
                this.f20760a.m(iVar.f());
                arrayList.add(iVar.f());
                if (iVar.g() == F.q0.class) {
                    z6 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        J("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z6) {
            this.f20767h.Z(null);
        }
        D();
        if (this.f20760a.h().isEmpty()) {
            this.f20767h.b0(false);
        } else {
            p0();
        }
        if (this.f20760a.g().isEmpty()) {
            this.f20767h.y();
            d0(false);
            this.f20767h.Y(false);
            this.f20772m = T();
            G();
            return;
        }
        o0();
        d0(false);
        if (this.f20764e == g.OPENED) {
            X();
        }
    }

    public void m0(boolean z6) {
        J("Attempting to force open the camera.");
        if (this.f20779t.h(this)) {
            W(z6);
        } else {
            J("No cameras available. Waiting for available camera before opening camera.");
            f0(g.PENDING_OPEN);
        }
    }

    @Override // I.E
    public I.D n() {
        return this.f20769j;
    }

    public void n0(boolean z6) {
        J("Attempting to open the camera.");
        if (this.f20776q.b() && this.f20779t.h(this)) {
            W(z6);
        } else {
            J("No cameras available. Waiting for available camera before opening camera.");
            f0(g.PENDING_OPEN);
        }
    }

    @Override // I.E
    public void o(InterfaceC0459w interfaceC0459w) {
        if (interfaceC0459w == null) {
            interfaceC0459w = AbstractC0465z.a();
        }
        interfaceC0459w.k(null);
        this.f20785z = interfaceC0459w;
        synchronized (this.f20755A) {
        }
    }

    public void o0() {
        L0.g d6 = this.f20760a.d();
        if (!d6.d()) {
            this.f20767h.X();
            this.f20772m.c(this.f20767h.I());
            return;
        }
        this.f20767h.a0(d6.b().l());
        d6.a(this.f20767h.I());
        this.f20772m.c(d6.b());
    }

    public final void p0() {
        Iterator it = this.f20760a.h().iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= ((I.Y0) it.next()).y(false);
        }
        this.f20767h.b0(z6);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f20769j.d());
    }
}
