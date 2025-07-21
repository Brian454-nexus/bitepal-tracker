package F2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import y0.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final Interpolator f1584g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final Interpolator f1585h = new R0.a();

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1586i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final c f1587a;

    /* renamed from: b, reason: collision with root package name */
    public float f1588b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f1589c;

    /* renamed from: d, reason: collision with root package name */
    public Animator f1590d;

    /* renamed from: e, reason: collision with root package name */
    public float f1591e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1592f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f1593a;

        public a(c cVar) {
            this.f1593a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f1593a);
            b.this.b(floatValue, this.f1593a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: F2.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0030b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f1595a;

        public C0030b(c cVar) {
            this.f1595a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f1595a, true);
            this.f1595a.A();
            this.f1595a.l();
            b bVar = b.this;
            if (!bVar.f1592f) {
                bVar.f1591e += 1.0f;
                return;
            }
            bVar.f1592f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f1595a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f1591e = 0.0f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f1597a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final Paint f1598b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f1599c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f1600d;

        /* renamed from: e, reason: collision with root package name */
        public float f1601e;

        /* renamed from: f, reason: collision with root package name */
        public float f1602f;

        /* renamed from: g, reason: collision with root package name */
        public float f1603g;

        /* renamed from: h, reason: collision with root package name */
        public float f1604h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f1605i;

        /* renamed from: j, reason: collision with root package name */
        public int f1606j;

        /* renamed from: k, reason: collision with root package name */
        public float f1607k;

        /* renamed from: l, reason: collision with root package name */
        public float f1608l;

        /* renamed from: m, reason: collision with root package name */
        public float f1609m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f1610n;

        /* renamed from: o, reason: collision with root package name */
        public Path f1611o;

        /* renamed from: p, reason: collision with root package name */
        public float f1612p;

        /* renamed from: q, reason: collision with root package name */
        public float f1613q;

        /* renamed from: r, reason: collision with root package name */
        public int f1614r;

        /* renamed from: s, reason: collision with root package name */
        public int f1615s;

        /* renamed from: t, reason: collision with root package name */
        public int f1616t;

        /* renamed from: u, reason: collision with root package name */
        public int f1617u;

        public c() {
            Paint paint = new Paint();
            this.f1598b = paint;
            Paint paint2 = new Paint();
            this.f1599c = paint2;
            Paint paint3 = new Paint();
            this.f1600d = paint3;
            this.f1601e = 0.0f;
            this.f1602f = 0.0f;
            this.f1603g = 0.0f;
            this.f1604h = 5.0f;
            this.f1612p = 1.0f;
            this.f1616t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f1607k = this.f1601e;
            this.f1608l = this.f1602f;
            this.f1609m = this.f1603g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1597a;
            float f6 = this.f1613q;
            float f7 = (this.f1604h / 2.0f) + f6;
            if (f6 <= 0.0f) {
                f7 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f1614r * this.f1612p) / 2.0f, this.f1604h / 2.0f);
            }
            rectF.set(rect.centerX() - f7, rect.centerY() - f7, rect.centerX() + f7, rect.centerY() + f7);
            float f8 = this.f1601e;
            float f9 = this.f1603g;
            float f10 = (f8 + f9) * 360.0f;
            float f11 = ((this.f1602f + f9) * 360.0f) - f10;
            this.f1598b.setColor(this.f1617u);
            this.f1598b.setAlpha(this.f1616t);
            float f12 = this.f1604h / 2.0f;
            rectF.inset(f12, f12);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1600d);
            float f13 = -f12;
            rectF.inset(f13, f13);
            canvas.drawArc(rectF, f10, f11, false, this.f1598b);
            b(canvas, f10, f11, rectF);
        }

        public void b(Canvas canvas, float f6, float f7, RectF rectF) {
            if (this.f1610n) {
                Path path = this.f1611o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f1611o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f8 = (this.f1614r * this.f1612p) / 2.0f;
                this.f1611o.moveTo(0.0f, 0.0f);
                this.f1611o.lineTo(this.f1614r * this.f1612p, 0.0f);
                Path path3 = this.f1611o;
                float f9 = this.f1614r;
                float f10 = this.f1612p;
                path3.lineTo((f9 * f10) / 2.0f, this.f1615s * f10);
                this.f1611o.offset((min + rectF.centerX()) - f8, rectF.centerY() + (this.f1604h / 2.0f));
                this.f1611o.close();
                this.f1599c.setColor(this.f1617u);
                this.f1599c.setAlpha(this.f1616t);
                canvas.save();
                canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1611o, this.f1599c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f1616t;
        }

        public float d() {
            return this.f1602f;
        }

        public int e() {
            return this.f1605i[f()];
        }

        public int f() {
            return (this.f1606j + 1) % this.f1605i.length;
        }

        public float g() {
            return this.f1601e;
        }

        public int h() {
            return this.f1605i[this.f1606j];
        }

        public float i() {
            return this.f1608l;
        }

        public float j() {
            return this.f1609m;
        }

        public float k() {
            return this.f1607k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f1607k = 0.0f;
            this.f1608l = 0.0f;
            this.f1609m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i6) {
            this.f1616t = i6;
        }

        public void o(float f6, float f7) {
            this.f1614r = (int) f6;
            this.f1615s = (int) f7;
        }

        public void p(float f6) {
            if (f6 != this.f1612p) {
                this.f1612p = f6;
            }
        }

        public void q(float f6) {
            this.f1613q = f6;
        }

        public void r(int i6) {
            this.f1617u = i6;
        }

        public void s(ColorFilter colorFilter) {
            this.f1598b.setColorFilter(colorFilter);
        }

        public void t(int i6) {
            this.f1606j = i6;
            this.f1617u = this.f1605i[i6];
        }

        public void u(int[] iArr) {
            this.f1605i = iArr;
            t(0);
        }

        public void v(float f6) {
            this.f1602f = f6;
        }

        public void w(float f6) {
            this.f1603g = f6;
        }

        public void x(boolean z6) {
            if (this.f1610n != z6) {
                this.f1610n = z6;
            }
        }

        public void y(float f6) {
            this.f1601e = f6;
        }

        public void z(float f6) {
            this.f1604h = f6;
            this.f1598b.setStrokeWidth(f6);
        }
    }

    public b(Context context) {
        this.f1589c = ((Context) g.f(context)).getResources();
        c cVar = new c();
        this.f1587a = cVar;
        cVar.u(f1586i);
        k(2.5f);
        m();
    }

    public final void a(float f6, c cVar) {
        n(f6, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f6));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f6));
    }

    public void b(float f6, c cVar, boolean z6) {
        float interpolation;
        float f7;
        if (this.f1592f) {
            a(f6, cVar);
            return;
        }
        if (f6 != 1.0f || z6) {
            float j6 = cVar.j();
            if (f6 < 0.5f) {
                interpolation = cVar.k();
                f7 = (f1585h.getInterpolation(f6 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k6 = cVar.k() + 0.79f;
                interpolation = k6 - (((1.0f - f1585h.getInterpolation((f6 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f7 = k6;
            }
            float f8 = j6 + (0.20999998f * f6);
            float f9 = (f6 + this.f1591e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f7);
            cVar.w(f8);
            h(f9);
        }
    }

    public final int c(float f6, int i6, int i7) {
        return ((((i6 >> 24) & 255) + ((int) ((((i7 >> 24) & 255) - r0) * f6))) << 24) | ((((i6 >> 16) & 255) + ((int) ((((i7 >> 16) & 255) - r1) * f6))) << 16) | ((((i6 >> 8) & 255) + ((int) ((((i7 >> 8) & 255) - r2) * f6))) << 8) | ((i6 & 255) + ((int) (f6 * ((i7 & 255) - r8))));
    }

    public void d(boolean z6) {
        this.f1587a.x(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1588b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1587a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f6) {
        this.f1587a.p(f6);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f1587a.u(iArr);
        this.f1587a.t(0);
        invalidateSelf();
    }

    public void g(float f6) {
        this.f1587a.w(f6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1587a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f6) {
        this.f1588b = f6;
    }

    public final void i(float f6, float f7, float f8, float f9) {
        c cVar = this.f1587a;
        float f10 = this.f1589c.getDisplayMetrics().density;
        cVar.z(f7 * f10);
        cVar.q(f6 * f10);
        cVar.t(0);
        cVar.o(f8 * f10, f9 * f10);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1590d.isRunning();
    }

    public void j(float f6, float f7) {
        this.f1587a.y(f6);
        this.f1587a.v(f7);
        invalidateSelf();
    }

    public void k(float f6) {
        this.f1587a.z(f6);
        invalidateSelf();
    }

    public void l(int i6) {
        if (i6 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f1587a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1584g);
        ofFloat.addListener(new C0030b(cVar));
        this.f1590d = ofFloat;
    }

    public void n(float f6, c cVar) {
        if (f6 > 0.75f) {
            cVar.r(c((f6 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f1587a.n(i6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1587a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f1590d.cancel();
        this.f1587a.A();
        if (this.f1587a.d() != this.f1587a.g()) {
            this.f1592f = true;
            this.f1590d.setDuration(666L);
            this.f1590d.start();
        } else {
            this.f1587a.t(0);
            this.f1587a.m();
            this.f1590d.setDuration(1332L);
            this.f1590d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1590d.cancel();
        h(0.0f);
        this.f1587a.x(false);
        this.f1587a.t(0);
        this.f1587a.m();
        invalidateSelf();
    }
}
