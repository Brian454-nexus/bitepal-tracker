package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f9977D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9978E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f9979A;

    /* renamed from: B, reason: collision with root package name */
    public final Runnable f9980B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView.u f9981C;

    /* renamed from: a, reason: collision with root package name */
    public final int f9982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9983b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f9984c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f9985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9986e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9987f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f9988g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f9989h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9990i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9991j;

    /* renamed from: k, reason: collision with root package name */
    public int f9992k;

    /* renamed from: l, reason: collision with root package name */
    public int f9993l;

    /* renamed from: m, reason: collision with root package name */
    public float f9994m;

    /* renamed from: n, reason: collision with root package name */
    public int f9995n;

    /* renamed from: o, reason: collision with root package name */
    public int f9996o;

    /* renamed from: p, reason: collision with root package name */
    public float f9997p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f10000s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10007z;

    /* renamed from: q, reason: collision with root package name */
    public int f9998q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f9999r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10001t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10002u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f10003v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f10004w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f10005x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f10006y = new int[2];

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.m(500);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i6, int i7) {
            f.this.x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10010a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10010a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10010a) {
                this.f10010a = false;
                return;
            }
            if (((Float) f.this.f10007z.getAnimatedValue()).floatValue() == 0.0f) {
                f fVar = f.this;
                fVar.f9979A = 0;
                fVar.u(0);
            } else {
                f fVar2 = f.this;
                fVar2.f9979A = 2;
                fVar2.r();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            f.this.f9984c.setAlpha(floatValue);
            f.this.f9985d.setAlpha(floatValue);
            f.this.r();
        }
    }

    public f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i7, int i8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10007z = ofFloat;
        this.f9979A = 0;
        this.f9980B = new a();
        this.f9981C = new b();
        this.f9984c = stateListDrawable;
        this.f9985d = drawable;
        this.f9988g = stateListDrawable2;
        this.f9989h = drawable2;
        this.f9986e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f9987f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f9990i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f9991j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f9982a = i7;
        this.f9983b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f10003v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean q6 = q(motionEvent.getX(), motionEvent.getY());
            boolean p6 = p(motionEvent.getX(), motionEvent.getY());
            if (q6 || p6) {
                if (p6) {
                    this.f10004w = 1;
                    this.f9997p = (int) motionEvent.getX();
                } else if (q6) {
                    this.f10004w = 2;
                    this.f9994m = (int) motionEvent.getY();
                }
                u(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10003v == 2) {
            this.f9994m = 0.0f;
            this.f9997p = 0.0f;
            u(1);
            this.f10004w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10003v == 2) {
            w();
            if (this.f10004w == 1) {
                n(motionEvent.getX());
            }
            if (this.f10004w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i6 = this.f10003v;
        if (i6 != 1) {
            return i6 == 2;
        }
        boolean q6 = q(motionEvent.getX(), motionEvent.getY());
        boolean p6 = p(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!q6 && !p6)) {
            return false;
        }
        if (p6) {
            this.f10004w = 1;
            this.f9997p = (int) motionEvent.getX();
        } else if (q6) {
            this.f10004w = 2;
            this.f9994m = (int) motionEvent.getY();
        }
        u(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z6) {
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10000s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f10000s = recyclerView;
        if (recyclerView != null) {
            v();
        }
    }

    public final void g() {
        this.f10000s.removeCallbacks(this.f9980B);
    }

    public final void h() {
        this.f10000s.W0(this);
        this.f10000s.Y0(this);
        this.f10000s.Z0(this.f9981C);
        g();
    }

    public final void i(Canvas canvas) {
        int i6 = this.f9999r;
        int i7 = this.f9990i;
        int i8 = this.f9996o;
        int i9 = this.f9995n;
        this.f9988g.setBounds(0, 0, i9, i7);
        this.f9989h.setBounds(0, 0, this.f9998q, this.f9991j);
        canvas.translate(0.0f, i6 - i7);
        this.f9989h.draw(canvas);
        canvas.translate(i8 - (i9 / 2), 0.0f);
        this.f9988g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void j(Canvas canvas) {
        int i6 = this.f9998q;
        int i7 = this.f9986e;
        int i8 = i6 - i7;
        int i9 = this.f9993l;
        int i10 = this.f9992k;
        int i11 = i9 - (i10 / 2);
        this.f9984c.setBounds(0, 0, i7, i10);
        this.f9985d.setBounds(0, 0, this.f9987f, this.f9999r);
        if (!o()) {
            canvas.translate(i8, 0.0f);
            this.f9985d.draw(canvas);
            canvas.translate(0.0f, i11);
            this.f9984c.draw(canvas);
            canvas.translate(-i8, -i11);
            return;
        }
        this.f9985d.draw(canvas);
        canvas.translate(this.f9986e, i11);
        canvas.scale(-1.0f, 1.0f);
        this.f9984c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f9986e, -i11);
    }

    public final int[] k() {
        int[] iArr = this.f10006y;
        int i6 = this.f9983b;
        iArr[0] = i6;
        iArr[1] = this.f9998q - i6;
        return iArr;
    }

    public final int[] l() {
        int[] iArr = this.f10005x;
        int i6 = this.f9983b;
        iArr[0] = i6;
        iArr[1] = this.f9999r - i6;
        return iArr;
    }

    public void m(int i6) {
        int i7 = this.f9979A;
        if (i7 == 1) {
            this.f10007z.cancel();
        } else if (i7 != 2) {
            return;
        }
        this.f9979A = 3;
        ValueAnimator valueAnimator = this.f10007z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f10007z.setDuration(i6);
        this.f10007z.start();
    }

    public final void n(float f6) {
        int[] k6 = k();
        float max = Math.max(k6[0], Math.min(k6[1], f6));
        if (Math.abs(this.f9996o - max) < 2.0f) {
            return;
        }
        int t6 = t(this.f9997p, max, k6, this.f10000s.computeHorizontalScrollRange(), this.f10000s.computeHorizontalScrollOffset(), this.f9998q);
        if (t6 != 0) {
            this.f10000s.scrollBy(t6, 0);
        }
        this.f9997p = max;
    }

    public final boolean o() {
        return AbstractC2393D.p(this.f10000s) == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a6) {
        if (this.f9998q != this.f10000s.getWidth() || this.f9999r != this.f10000s.getHeight()) {
            this.f9998q = this.f10000s.getWidth();
            this.f9999r = this.f10000s.getHeight();
            u(0);
        } else if (this.f9979A != 0) {
            if (this.f10001t) {
                j(canvas);
            }
            if (this.f10002u) {
                i(canvas);
            }
        }
    }

    public boolean p(float f6, float f7) {
        if (f7 < this.f9999r - this.f9990i) {
            return false;
        }
        int i6 = this.f9996o;
        int i7 = this.f9995n;
        return f6 >= ((float) (i6 - (i7 / 2))) && f6 <= ((float) (i6 + (i7 / 2)));
    }

    public boolean q(float f6, float f7) {
        if (o()) {
            if (f6 > this.f9986e) {
                return false;
            }
        } else if (f6 < this.f9998q - this.f9986e) {
            return false;
        }
        int i6 = this.f9993l;
        int i7 = this.f9992k;
        return f7 >= ((float) (i6 - (i7 / 2))) && f7 <= ((float) (i6 + (i7 / 2)));
    }

    public void r() {
        this.f10000s.invalidate();
    }

    public final void s(int i6) {
        g();
        this.f10000s.postDelayed(this.f9980B, i6);
    }

    public final int t(float f6, float f7, int[] iArr, int i6, int i7, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 == 0) {
            return 0;
        }
        int i10 = i6 - i8;
        int i11 = (int) (((f7 - f6) / i9) * i10);
        int i12 = i7 + i11;
        if (i12 >= i10 || i12 < 0) {
            return 0;
        }
        return i11;
    }

    public void u(int i6) {
        if (i6 == 2 && this.f10003v != 2) {
            this.f9984c.setState(f9977D);
            g();
        }
        if (i6 == 0) {
            r();
        } else {
            w();
        }
        if (this.f10003v == 2 && i6 != 2) {
            this.f9984c.setState(f9978E);
            s(1200);
        } else if (i6 == 1) {
            s(1500);
        }
        this.f10003v = i6;
    }

    public final void v() {
        this.f10000s.g(this);
        this.f10000s.j(this);
        this.f10000s.k(this.f9981C);
    }

    public void w() {
        int i6 = this.f9979A;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            } else {
                this.f10007z.cancel();
            }
        }
        this.f9979A = 1;
        ValueAnimator valueAnimator = this.f10007z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f10007z.setDuration(500L);
        this.f10007z.setStartDelay(0L);
        this.f10007z.start();
    }

    public void x(int i6, int i7) {
        int computeVerticalScrollRange = this.f10000s.computeVerticalScrollRange();
        int i8 = this.f9999r;
        this.f10001t = computeVerticalScrollRange - i8 > 0 && i8 >= this.f9982a;
        int computeHorizontalScrollRange = this.f10000s.computeHorizontalScrollRange();
        int i9 = this.f9998q;
        boolean z6 = computeHorizontalScrollRange - i9 > 0 && i9 >= this.f9982a;
        this.f10002u = z6;
        boolean z7 = this.f10001t;
        if (!z7 && !z6) {
            if (this.f10003v != 0) {
                u(0);
                return;
            }
            return;
        }
        if (z7) {
            float f6 = i8;
            this.f9993l = (int) ((f6 * (i7 + (f6 / 2.0f))) / computeVerticalScrollRange);
            this.f9992k = Math.min(i8, (i8 * i8) / computeVerticalScrollRange);
        }
        if (this.f10002u) {
            float f7 = i9;
            this.f9996o = (int) ((f7 * (i6 + (f7 / 2.0f))) / computeHorizontalScrollRange);
            this.f9995n = Math.min(i9, (i9 * i9) / computeHorizontalScrollRange);
        }
        int i10 = this.f10003v;
        if (i10 == 0 || i10 == 1) {
            u(1);
        }
    }

    public final void y(float f6) {
        int[] l6 = l();
        float max = Math.max(l6[0], Math.min(l6[1], f6));
        if (Math.abs(this.f9993l - max) < 2.0f) {
            return;
        }
        int t6 = t(this.f9994m, max, l6, this.f10000s.computeVerticalScrollRange(), this.f10000s.computeVerticalScrollOffset(), this.f9999r);
        if (t6 != 0) {
            this.f10000s.scrollBy(0, t6);
        }
        this.f9994m = max;
    }
}
