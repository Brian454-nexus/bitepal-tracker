package i0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1481e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f15686a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f15688c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f15689d;

    /* renamed from: e, reason: collision with root package name */
    public float f15690e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f15693h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f15694i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f15695j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15691f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15692g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f15696k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f15687b = new Paint(5);

    public C1481e(ColorStateList colorStateList, float f6) {
        this.f15686a = f6;
        e(colorStateList);
        this.f15688c = new RectF();
        this.f15689d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f15693h;
    }

    public float c() {
        return this.f15690e;
    }

    public float d() {
        return this.f15686a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f15687b;
        if (this.f15694i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f15694i);
            z6 = true;
        }
        RectF rectF = this.f15688c;
        float f6 = this.f15686a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f15693h = colorStateList;
        this.f15687b.setColor(colorStateList.getColorForState(getState(), this.f15693h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f6, boolean z6, boolean z7) {
        if (f6 == this.f15690e && this.f15691f == z6 && this.f15692g == z7) {
            return;
        }
        this.f15690e = f6;
        this.f15691f = z6;
        this.f15692g = z7;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f15689d, this.f15686a);
    }

    public void h(float f6) {
        if (f6 == this.f15686a) {
            return;
        }
        this.f15686a = f6;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f15688c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f15689d.set(rect);
        if (this.f15691f) {
            this.f15689d.inset((int) Math.ceil(AbstractC1482f.a(this.f15690e, this.f15686a, this.f15692g)), (int) Math.ceil(AbstractC1482f.b(this.f15690e, this.f15686a, this.f15692g)));
            this.f15688c.set(this.f15689d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f15695j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f15693h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f15693h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z6 = colorForState != this.f15687b.getColor();
        if (z6) {
            this.f15687b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f15695j;
        if (colorStateList2 == null || (mode = this.f15696k) == null) {
            return z6;
        }
        this.f15694i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f15687b.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15687b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15695j = colorStateList;
        this.f15694i = a(colorStateList, this.f15696k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f15696k = mode;
        this.f15694i = a(this.f15695j, mode);
        invalidateSelf();
    }
}
