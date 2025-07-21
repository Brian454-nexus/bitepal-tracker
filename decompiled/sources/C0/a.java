package C0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f422r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    public final View f425c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f426d;

    /* renamed from: g, reason: collision with root package name */
    public int f429g;

    /* renamed from: h, reason: collision with root package name */
    public int f430h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f434l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f435m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f436n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f437o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f438p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f439q;

    /* renamed from: a, reason: collision with root package name */
    public final C0014a f423a = new C0014a();

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f424b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public float[] f427e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    public float[] f428f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    public float[] f431i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public float[] f432j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    public float[] f433k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: C0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0014a {

        /* renamed from: a, reason: collision with root package name */
        public int f440a;

        /* renamed from: b, reason: collision with root package name */
        public int f441b;

        /* renamed from: c, reason: collision with root package name */
        public float f442c;

        /* renamed from: d, reason: collision with root package name */
        public float f443d;

        /* renamed from: j, reason: collision with root package name */
        public float f449j;

        /* renamed from: k, reason: collision with root package name */
        public int f450k;

        /* renamed from: e, reason: collision with root package name */
        public long f444e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f448i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f445f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f446g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f447h = 0;

        public void a() {
            if (this.f445f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g6 = g(e(currentAnimationTimeMillis));
            long j6 = currentAnimationTimeMillis - this.f445f;
            this.f445f = currentAnimationTimeMillis;
            float f6 = ((float) j6) * g6;
            this.f446g = (int) (this.f442c * f6);
            this.f447h = (int) (f6 * this.f443d);
        }

        public int b() {
            return this.f446g;
        }

        public int c() {
            return this.f447h;
        }

        public int d() {
            float f6 = this.f442c;
            return (int) (f6 / Math.abs(f6));
        }

        public final float e(long j6) {
            long j7 = this.f444e;
            if (j6 < j7) {
                return 0.0f;
            }
            long j8 = this.f448i;
            if (j8 < 0 || j6 < j8) {
                return a.e(((float) (j6 - j7)) / this.f440a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f449j;
            return (1.0f - f6) + (f6 * a.e(((float) (j6 - j8)) / this.f450k, 0.0f, 1.0f));
        }

        public int f() {
            float f6 = this.f443d;
            return (int) (f6 / Math.abs(f6));
        }

        public final float g(float f6) {
            return ((-4.0f) * f6 * f6) + (f6 * 4.0f);
        }

        public boolean h() {
            return this.f448i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f448i + ((long) this.f450k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f450k = a.f((int) (currentAnimationTimeMillis - this.f444e), 0, this.f441b);
            this.f449j = e(currentAnimationTimeMillis);
            this.f448i = currentAnimationTimeMillis;
        }

        public void j(int i6) {
            this.f441b = i6;
        }

        public void k(int i6) {
            this.f440a = i6;
        }

        public void l(float f6, float f7) {
            this.f442c = f6;
            this.f443d = f7;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f444e = currentAnimationTimeMillis;
            this.f448i = -1L;
            this.f445f = currentAnimationTimeMillis;
            this.f449j = 0.5f;
            this.f446g = 0;
            this.f447h = 0;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f437o) {
                if (aVar.f435m) {
                    aVar.f435m = false;
                    aVar.f423a.m();
                }
                C0014a c0014a = a.this.f423a;
                if (c0014a.h() || !a.this.u()) {
                    a.this.f437o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f436n) {
                    aVar2.f436n = false;
                    aVar2.c();
                }
                c0014a.a();
                a.this.j(c0014a.b(), c0014a.c());
                AbstractC2393D.I(a.this.f425c, this);
            }
        }
    }

    public a(View view) {
        this.f425c = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = (int) ((1575.0f * f6) + 0.5f);
        o(f7, f7);
        float f8 = (int) ((f6 * 315.0f) + 0.5f);
        p(f8, f8);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f422r);
        r(500);
        q(500);
    }

    public static float e(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    public static int f(int i6, int i7, int i8) {
        return i6 > i8 ? i8 : i6 < i7 ? i7 : i6;
    }

    public abstract boolean a(int i6);

    public abstract boolean b(int i6);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f425c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i6, float f6, float f7, float f8) {
        float h6 = h(this.f427e[i6], f7, this.f428f[i6], f6);
        if (h6 == 0.0f) {
            return 0.0f;
        }
        float f9 = this.f431i[i6];
        float f10 = this.f432j[i6];
        float f11 = this.f433k[i6];
        float f12 = f9 * f8;
        return h6 > 0.0f ? e(h6 * f12, f10, f11) : -e((-h6) * f12, f10, f11);
    }

    public final float g(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.f429g;
        if (i6 == 0 || i6 == 1) {
            if (f6 < f7) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f7);
                }
                if (this.f437o && i6 == 1) {
                    return 1.0f;
                }
            }
        } else if (i6 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    public final float h(float f6, float f7, float f8, float f9) {
        float interpolation;
        float e6 = e(f6 * f7, 0.0f, f8);
        float g6 = g(f7 - f9, e6) - g(f9, e6);
        if (g6 < 0.0f) {
            interpolation = -this.f424b.getInterpolation(-g6);
        } else {
            if (g6 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f424b.getInterpolation(g6);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f435m) {
            this.f437o = false;
        } else {
            this.f423a.i();
        }
    }

    public abstract void j(int i6, int i7);

    public a k(int i6) {
        this.f430h = i6;
        return this;
    }

    public a l(int i6) {
        this.f429g = i6;
        return this;
    }

    public a m(boolean z6) {
        if (this.f438p && !z6) {
            i();
        }
        this.f438p = z6;
        return this;
    }

    public a n(float f6, float f7) {
        float[] fArr = this.f428f;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    public a o(float f6, float f7) {
        float[] fArr = this.f433k;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f438p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f436n = r2
            r5.f434l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f425c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f425c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            C0.a$a r7 = r5.f423a
            r7.l(r0, r6)
            boolean r6 = r5.f437o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f439q
            if (r6 == 0) goto L61
            boolean r6 = r5.f437o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f6, float f7) {
        float[] fArr = this.f432j;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    public a q(int i6) {
        this.f423a.j(i6);
        return this;
    }

    public a r(int i6) {
        this.f423a.k(i6);
        return this;
    }

    public a s(float f6, float f7) {
        float[] fArr = this.f427e;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    public a t(float f6, float f7) {
        float[] fArr = this.f431i;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0014a c0014a = this.f423a;
        int f6 = c0014a.f();
        int d6 = c0014a.d();
        if (f6 == 0 || !b(f6)) {
            return d6 != 0 && a(d6);
        }
        return true;
    }

    public final void v() {
        int i6;
        if (this.f426d == null) {
            this.f426d = new b();
        }
        this.f437o = true;
        this.f435m = true;
        if (this.f434l || (i6 = this.f430h) <= 0) {
            this.f426d.run();
        } else {
            AbstractC2393D.J(this.f425c, this.f426d, i6);
        }
        this.f434l = true;
    }
}
