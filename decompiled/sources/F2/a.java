package F2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f1578a;

    /* renamed from: b, reason: collision with root package name */
    public int f1579b;

    /* renamed from: c, reason: collision with root package name */
    public int f1580c;

    /* renamed from: F2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0029a extends OvalShape {

        /* renamed from: a, reason: collision with root package name */
        public Paint f1581a = new Paint();

        /* renamed from: b, reason: collision with root package name */
        public int f1582b;

        /* renamed from: c, reason: collision with root package name */
        public a f1583c;

        public C0029a(a aVar, int i6) {
            this.f1583c = aVar;
            this.f1582b = i6;
            a((int) rect().width());
        }

        public final void a(int i6) {
            float f6 = i6 / 2;
            this.f1581a.setShader(new RadialGradient(f6, f6, this.f1582b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f1583c.getWidth() / 2;
            float height = this.f1583c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f1581a);
            canvas.drawCircle(width, height, r0 - this.f1582b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f6, float f7) {
            super.onResize(f6, f7);
            a((int) f6);
        }
    }

    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f6 = getContext().getResources().getDisplayMetrics().density;
        int i6 = (int) (1.75f * f6);
        int i7 = (int) (0.0f * f6);
        this.f1579b = (int) (3.5f * f6);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(E2.a.f1105f);
        this.f1580c = obtainStyledAttributes.getColor(E2.a.f1106g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC2393D.S(this, f6 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0029a(this, this.f1579b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f1579b, i7, i6, 503316480);
            int i8 = this.f1579b;
            setPadding(i8, i8, i8, i8);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f1580c);
        AbstractC2393D.O(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f1578a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1578a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1578a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f1579b * 2), getMeasuredHeight() + (this.f1579b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i6);
            this.f1580c = i6;
        }
    }
}
