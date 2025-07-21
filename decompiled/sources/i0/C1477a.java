package i0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import h0.AbstractC1398a;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1477a extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f15675h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC1480d f15676i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15677a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15678b;

    /* renamed from: c, reason: collision with root package name */
    public int f15679c;

    /* renamed from: d, reason: collision with root package name */
    public int f15680d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f15681e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f15682f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1479c f15683g;

    /* renamed from: i0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0206a implements InterfaceC1479c {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f15684a;

        public C0206a() {
        }

        @Override // i0.InterfaceC1479c
        public void a(Drawable drawable) {
            this.f15684a = drawable;
            C1477a.this.setBackgroundDrawable(drawable);
        }

        @Override // i0.InterfaceC1479c
        public boolean b() {
            return C1477a.this.getPreventCornerOverlap();
        }

        @Override // i0.InterfaceC1479c
        public boolean c() {
            return C1477a.this.getUseCompatPadding();
        }

        @Override // i0.InterfaceC1479c
        public Drawable d() {
            return this.f15684a;
        }

        @Override // i0.InterfaceC1479c
        public View e() {
            return C1477a.this;
        }

        @Override // i0.InterfaceC1479c
        public void f(int i6, int i7, int i8, int i9) {
            C1477a.this.f15682f.set(i6, i7, i8, i9);
            C1477a c1477a = C1477a.this;
            Rect rect = c1477a.f15681e;
            C1477a.super.setPadding(i6 + rect.left, i7 + rect.top, i8 + rect.right, i9 + rect.bottom);
        }
    }

    static {
        C1478b c1478b = new C1478b();
        f15676i = c1478b;
        c1478b.j();
    }

    public C1477a(Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f15676i.a(this.f15683g);
    }

    public float getCardElevation() {
        return f15676i.h(this.f15683g);
    }

    public int getContentPaddingBottom() {
        return this.f15681e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f15681e.left;
    }

    public int getContentPaddingRight() {
        return this.f15681e.right;
    }

    public int getContentPaddingTop() {
        return this.f15681e.top;
    }

    public float getMaxCardElevation() {
        return f15676i.c(this.f15683g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f15678b;
    }

    public float getRadius() {
        return f15676i.n(this.f15683g);
    }

    public boolean getUseCompatPadding() {
        return this.f15677a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        if (f15676i instanceof C1478b) {
            super.onMeasure(i6, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.f15683g)), View.MeasureSpec.getSize(i6)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.e(this.f15683g)), View.MeasureSpec.getSize(i7)), mode2);
        }
        super.onMeasure(i6, i7);
    }

    public void setCardBackgroundColor(int i6) {
        f15676i.l(this.f15683g, ColorStateList.valueOf(i6));
    }

    public void setCardElevation(float f6) {
        f15676i.g(this.f15683g, f6);
    }

    public void setMaxCardElevation(float f6) {
        f15676i.d(this.f15683g, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i6) {
        this.f15680d = i6;
        super.setMinimumHeight(i6);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i6) {
        this.f15679c = i6;
        super.setMinimumWidth(i6);
    }

    @Override // android.view.View
    public void setPadding(int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i6, int i7, int i8, int i9) {
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f15678b) {
            this.f15678b = z6;
            f15676i.i(this.f15683g);
        }
    }

    public void setRadius(float f6) {
        f15676i.b(this.f15683g, f6);
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f15677a != z6) {
            this.f15677a = z6;
            f15676i.k(this.f15683g);
        }
    }

    public C1477a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1398a.f14977a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f15676i.l(this.f15683g, colorStateList);
    }

    public C1477a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f15681e = rect;
        this.f15682f = new Rect();
        C0206a c0206a = new C0206a();
        this.f15683g = c0206a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.d.f14981a, i6, h0.c.f14980a);
        int i7 = h0.d.f14984d;
        if (obtainStyledAttributes.hasValue(i7)) {
            valueOf = obtainStyledAttributes.getColorStateList(i7);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f15675h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(h0.b.f14979b);
            } else {
                color = getResources().getColor(h0.b.f14978a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(h0.d.f14985e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(h0.d.f14986f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(h0.d.f14987g, 0.0f);
        this.f15677a = obtainStyledAttributes.getBoolean(h0.d.f14989i, false);
        this.f15678b = obtainStyledAttributes.getBoolean(h0.d.f14988h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14990j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14992l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14994n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14993m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14991k, dimensionPixelSize);
        float f6 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f15679c = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14982b, 0);
        this.f15680d = obtainStyledAttributes.getDimensionPixelSize(h0.d.f14983c, 0);
        obtainStyledAttributes.recycle();
        f15676i.m(c0206a, context, colorStateList, dimension, dimension2, f6);
    }
}
