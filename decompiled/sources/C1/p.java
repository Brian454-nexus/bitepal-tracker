package C1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final i f598a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final b f599b;

    /* renamed from: c, reason: collision with root package name */
    public final c f600c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f601d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f602e;

    /* renamed from: f, reason: collision with root package name */
    public float f603f;

    /* renamed from: g, reason: collision with root package name */
    public float f604g;

    /* renamed from: h, reason: collision with root package name */
    public float f605h;

    /* renamed from: i, reason: collision with root package name */
    public float f606i;

    /* renamed from: j, reason: collision with root package name */
    public int f607j;

    /* renamed from: k, reason: collision with root package name */
    public long f608k;

    /* renamed from: l, reason: collision with root package name */
    public long f609l;

    /* renamed from: m, reason: collision with root package name */
    public long f610m;

    /* renamed from: n, reason: collision with root package name */
    public long f611n;

    /* renamed from: o, reason: collision with root package name */
    public long f612o;

    /* renamed from: p, reason: collision with root package name */
    public long f613p;

    /* renamed from: q, reason: collision with root package name */
    public long f614q;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public static void a(Surface surface, float f6) {
            try {
                surface.setFrameRate(f6, f6 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e6) {
                AbstractC1133o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f615a;

        public b(DisplayManager displayManager) {
            this.f615a = displayManager;
        }

        public final Display a() {
            return this.f615a.getDisplay(0);
        }

        public void b() {
            this.f615a.registerDisplayListener(this, AbstractC1117K.A());
            p.this.p(a());
        }

        public void c() {
            this.f615a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i6) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i6) {
            if (i6 == 0) {
                p.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i6) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        public static final c f617f = new c();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f618a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f619b;

        /* renamed from: c, reason: collision with root package name */
        public final HandlerThread f620c;

        /* renamed from: d, reason: collision with root package name */
        public Choreographer f621d;

        /* renamed from: e, reason: collision with root package name */
        public int f622e;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f620c = handlerThread;
            handlerThread.start();
            Handler z6 = AbstractC1117K.z(handlerThread.getLooper(), this);
            this.f619b = z6;
            z6.sendEmptyMessage(1);
        }

        public static c d() {
            return f617f;
        }

        public void a() {
            this.f619b.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.f621d;
            if (choreographer != null) {
                int i6 = this.f622e + 1;
                this.f622e = i6;
                if (i6 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f621d = Choreographer.getInstance();
            } catch (RuntimeException e6) {
                AbstractC1133o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j6) {
            this.f618a = j6;
            ((Choreographer) AbstractC1119a.e(this.f621d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f619b.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.f621d;
            if (choreographer != null) {
                int i6 = this.f622e - 1;
                this.f622e = i6;
                if (i6 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f618a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                c();
                return true;
            }
            if (i6 == 2) {
                b();
                return true;
            }
            if (i6 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public p(Context context) {
        b f6 = f(context);
        this.f599b = f6;
        this.f600c = f6 != null ? c.d() : null;
        this.f608k = -9223372036854775807L;
        this.f609l = -9223372036854775807L;
        this.f603f = -1.0f;
        this.f606i = 1.0f;
        this.f607j = 0;
    }

    public static boolean c(long j6, long j7) {
        return Math.abs(j6 - j7) <= 20000000;
    }

    public static long e(long j6, long j7, long j8) {
        long j9;
        long j10 = j7 + (((j6 - j7) / j8) * j8);
        if (j6 <= j10) {
            j9 = j10 - j8;
        } else {
            long j11 = j8 + j10;
            j9 = j10;
            j10 = j11;
        }
        return j10 - j6 < j6 - j9 ? j10 : j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f613p
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2f
            C1.i r0 = r10.f598a
            boolean r0 = r0.e()
            if (r0 == 0) goto L2f
            C1.i r0 = r10.f598a
            long r0 = r0.a()
            long r2 = r10.f614q
            long r4 = r10.f610m
            long r6 = r10.f613p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f606i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L2c
            r4 = r2
            goto L30
        L2c:
            r10.n()
        L2f:
            r4 = r11
        L30:
            long r11 = r10.f610m
            r10.f611n = r11
            r10.f612o = r4
            C1.p$c r11 = r10.f600c
            if (r11 == 0) goto L57
            long r0 = r10.f608k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L46
            goto L57
        L46:
            long r6 = r11.f618a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L4d
            goto L57
        L4d:
            long r8 = r10.f608k
            long r11 = e(r4, r6, r8)
            long r0 = r10.f609l
            long r11 = r11 - r0
            return r11
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.p.b(long):long");
    }

    public final void d() {
        Surface surface;
        if (AbstractC1117K.f10560a < 30 || (surface = this.f602e) == null || this.f607j == Integer.MIN_VALUE || this.f605h == 0.0f) {
            return;
        }
        this.f605h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void g(float f6) {
        this.f603f = f6;
        this.f598a.g();
        q();
    }

    public void h(long j6) {
        long j7 = this.f611n;
        if (j7 != -1) {
            this.f613p = j7;
            this.f614q = this.f612o;
        }
        this.f610m++;
        this.f598a.f(j6 * 1000);
        q();
    }

    public void i(float f6) {
        this.f606i = f6;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f601d = true;
        n();
        if (this.f599b != null) {
            ((c) AbstractC1119a.e(this.f600c)).a();
            this.f599b.b();
        }
        r(false);
    }

    public void l() {
        this.f601d = false;
        b bVar = this.f599b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC1119a.e(this.f600c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof l) {
            surface = null;
        }
        if (this.f602e == surface) {
            return;
        }
        d();
        this.f602e = surface;
        r(true);
    }

    public final void n() {
        this.f610m = 0L;
        this.f613p = -1L;
        this.f611n = -1L;
    }

    public void o(int i6) {
        if (this.f607j == i6) {
            return;
        }
        this.f607j = i6;
        r(true);
    }

    public final void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f608k = refreshRate;
            this.f609l = (refreshRate * 80) / 100;
        } else {
            AbstractC1133o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f608k = -9223372036854775807L;
            this.f609l = -9223372036854775807L;
        }
    }

    public final void q() {
        if (AbstractC1117K.f10560a < 30 || this.f602e == null) {
            return;
        }
        float b6 = this.f598a.e() ? this.f598a.b() : this.f603f;
        float f6 = this.f604g;
        if (b6 == f6) {
            return;
        }
        if (b6 != -1.0f && f6 != -1.0f) {
            if (Math.abs(b6 - this.f604g) < ((!this.f598a.e() || this.f598a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b6 == -1.0f && this.f598a.c() < 30) {
            return;
        }
        this.f604g = b6;
        r(false);
    }

    public final void r(boolean z6) {
        Surface surface;
        float f6;
        if (AbstractC1117K.f10560a < 30 || (surface = this.f602e) == null || this.f607j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f601d) {
            float f7 = this.f604g;
            if (f7 != -1.0f) {
                f6 = f7 * this.f606i;
                if (z6 && this.f605h == f6) {
                    return;
                }
                this.f605h = f6;
                a.a(surface, f6);
            }
        }
        f6 = 0.0f;
        if (z6) {
        }
        this.f605h = f6;
        a.a(surface, f6);
    }
}
