package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractViewOnTouchListenerC1968B implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f18389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18391c;

    /* renamed from: d, reason: collision with root package name */
    public final View f18392d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f18393e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f18394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18395g;

    /* renamed from: h, reason: collision with root package name */
    public int f18396h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f18397i = new int[2];

    /* renamed from: q.B$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC1968B.this.f18392d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: q.B$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1968B.this.e();
        }
    }

    public AbstractViewOnTouchListenerC1968B(View view) {
        this.f18392d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f18389a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f18390b = tapTimeout;
        this.f18391c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f6, float f7, float f8) {
        float f9 = -f8;
        return f6 >= f9 && f7 >= f9 && f6 < ((float) (view.getRight() - view.getLeft())) + f8 && f7 < ((float) (view.getBottom() - view.getTop())) + f8;
    }

    public final void a() {
        Runnable runnable = this.f18394f;
        if (runnable != null) {
            this.f18392d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f18393e;
        if (runnable2 != null) {
            this.f18392d.removeCallbacks(runnable2);
        }
    }

    public abstract p.c b();

    public abstract boolean c();

    public boolean d() {
        p.c b6 = b();
        if (b6 == null || !b6.f()) {
            return true;
        }
        b6.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f18392d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f18395g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        z zVar;
        View view = this.f18392d;
        p.c b6 = b();
        if (b6 != null && b6.f() && (zVar = (z) b6.j()) != null && zVar.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, obtainNoHistory);
            j(zVar, obtainNoHistory);
            boolean e6 = zVar.e(obtainNoHistory, this.f18396h);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (e6 && z6) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f18392d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f18396h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f18389a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f18396h = r6
            java.lang.Runnable r6 = r5.f18393e
            if (r6 != 0) goto L52
            q.B$a r6 = new q.B$a
            r6.<init>()
            r5.f18393e = r6
        L52:
            java.lang.Runnable r6 = r5.f18393e
            int r1 = r5.f18390b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f18394f
            if (r6 != 0) goto L65
            q.B$b r6 = new q.B$b
            r6.<init>()
            r5.f18394f = r6
        L65:
            java.lang.Runnable r6 = r5.f18394f
            int r1 = r5.f18391c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractViewOnTouchListenerC1968B.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f18397i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f18397i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        boolean z7 = this.f18395g;
        if (z7) {
            z6 = f(motionEvent) || !d();
        } else {
            z6 = g(motionEvent) && c();
            if (z6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f18392d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f18395g = z6;
        return z6 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f18395g = false;
        this.f18396h = -1;
        Runnable runnable = this.f18393e;
        if (runnable != null) {
            this.f18392d.removeCallbacks(runnable);
        }
    }
}
