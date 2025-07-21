package androidx.appcompat.widget;

import C0.h;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import i.AbstractC1468a;
import i.AbstractC1476i;
import k.AbstractC1653a;
import n.C1808a;
import q.C1989m;
import q.S;
import q.V;
import q.y;
import r0.AbstractC2019a;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: V, reason: collision with root package name */
    public static final Property f8200V = new a(Float.class, "thumbPos");

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f8201W = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f8202A;

    /* renamed from: B, reason: collision with root package name */
    public int f8203B;

    /* renamed from: C, reason: collision with root package name */
    public int f8204C;

    /* renamed from: D, reason: collision with root package name */
    public int f8205D;

    /* renamed from: E, reason: collision with root package name */
    public int f8206E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f8207F;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f8208G;

    /* renamed from: H, reason: collision with root package name */
    public Layout f8209H;

    /* renamed from: I, reason: collision with root package name */
    public Layout f8210I;

    /* renamed from: J, reason: collision with root package name */
    public TransformationMethod f8211J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f8212K;

    /* renamed from: L, reason: collision with root package name */
    public final C1989m f8213L;

    /* renamed from: M, reason: collision with root package name */
    public final Rect f8214M;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f8215a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f8216b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8217c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8218d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8219e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8220f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8221g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8222h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8223i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8224j;

    /* renamed from: k, reason: collision with root package name */
    public int f8225k;

    /* renamed from: l, reason: collision with root package name */
    public int f8226l;

    /* renamed from: m, reason: collision with root package name */
    public int f8227m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8228n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f8229o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f8230p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8231q;

    /* renamed from: r, reason: collision with root package name */
    public int f8232r;

    /* renamed from: s, reason: collision with root package name */
    public int f8233s;

    /* renamed from: t, reason: collision with root package name */
    public float f8234t;

    /* renamed from: u, reason: collision with root package name */
    public float f8235u;

    /* renamed from: v, reason: collision with root package name */
    public VelocityTracker f8236v;

    /* renamed from: w, reason: collision with root package name */
    public int f8237w;

    /* renamed from: x, reason: collision with root package name */
    public float f8238x;

    /* renamed from: y, reason: collision with root package name */
    public int f8239y;

    /* renamed from: z, reason: collision with root package name */
    public int f8240z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f8238x);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f6) {
            switchCompat.setThumbPosition(f6.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1468a.f15343q);
    }

    public static float f(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
    }

    private boolean getTargetCheckedState() {
        return this.f8238x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((V.b(this) ? 1.0f - this.f8238x : this.f8238x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f8220f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f8214M;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f8215a;
        Rect c6 = drawable2 != null ? y.c(drawable2) : y.f18590c;
        return ((((this.f8239y - this.f8202A) - rect.left) - rect.right) - c6.left) - c6.right;
    }

    public final void a(boolean z6) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f8200V, z6 ? 1.0f : 0.0f);
        this.f8212K = ofFloat;
        ofFloat.setDuration(250L);
        this.f8212K.setAutoCancel(true);
        this.f8212K.start();
    }

    public final void b() {
        Drawable drawable = this.f8215a;
        if (drawable != null) {
            if (this.f8218d || this.f8219e) {
                Drawable mutate = AbstractC2019a.j(drawable).mutate();
                this.f8215a = mutate;
                if (this.f8218d) {
                    AbstractC2019a.g(mutate, this.f8216b);
                }
                if (this.f8219e) {
                    AbstractC2019a.h(this.f8215a, this.f8217c);
                }
                if (this.f8215a.isStateful()) {
                    this.f8215a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f8220f;
        if (drawable != null) {
            if (this.f8223i || this.f8224j) {
                Drawable mutate = AbstractC2019a.j(drawable).mutate();
                this.f8220f = mutate;
                if (this.f8223i) {
                    AbstractC2019a.g(mutate, this.f8221g);
                }
                if (this.f8224j) {
                    AbstractC2019a.h(this.f8220f, this.f8222h);
                }
                if (this.f8220f.isStateful()) {
                    this.f8220f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f8212K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i6;
        int i7;
        Rect rect = this.f8214M;
        int i8 = this.f8203B;
        int i9 = this.f8204C;
        int i10 = this.f8205D;
        int i11 = this.f8206E;
        int thumbOffset = getThumbOffset() + i8;
        Drawable drawable = this.f8215a;
        Rect c6 = drawable != null ? y.c(drawable) : y.f18590c;
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i12 = rect.left;
            thumbOffset += i12;
            if (c6 != null) {
                int i13 = c6.left;
                if (i13 > i12) {
                    i8 += i13 - i12;
                }
                int i14 = c6.top;
                int i15 = rect.top;
                i6 = i14 > i15 ? (i14 - i15) + i9 : i9;
                int i16 = c6.right;
                int i17 = rect.right;
                if (i16 > i17) {
                    i10 -= i16 - i17;
                }
                int i18 = c6.bottom;
                int i19 = rect.bottom;
                if (i18 > i19) {
                    i7 = i11 - (i18 - i19);
                    this.f8220f.setBounds(i8, i6, i10, i7);
                }
            } else {
                i6 = i9;
            }
            i7 = i11;
            this.f8220f.setBounds(i8, i6, i10, i7);
        }
        Drawable drawable3 = this.f8215a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i20 = thumbOffset - rect.left;
            int i21 = thumbOffset + this.f8202A + rect.right;
            this.f8215a.setBounds(i20, i9, i21, i11);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC2019a.e(background, i20, i9, i21, i11);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f8215a;
        if (drawable != null) {
            AbstractC2019a.d(drawable, f6, f7);
        }
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null) {
            AbstractC2019a.d(drawable2, f6, f7);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8215a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final boolean g(float f6, float f7) {
        if (this.f8215a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f8215a.getPadding(this.f8214M);
        int i6 = this.f8204C;
        int i7 = this.f8233s;
        int i8 = i6 - i7;
        int i9 = (this.f8203B + thumbOffset) - i7;
        int i10 = this.f8202A + i9;
        Rect rect = this.f8214M;
        return f6 > ((float) i9) && f6 < ((float) (((i10 + rect.left) + rect.right) + i7)) && f7 > ((float) i8) && f7 < ((float) (this.f8206E + i7));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!V.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f8239y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f8227m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (V.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f8239y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f8227m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f8231q;
    }

    public boolean getSplitTrack() {
        return this.f8228n;
    }

    public int getSwitchMinWidth() {
        return this.f8226l;
    }

    public int getSwitchPadding() {
        return this.f8227m;
    }

    public CharSequence getTextOff() {
        return this.f8230p;
    }

    public CharSequence getTextOn() {
        return this.f8229o;
    }

    public Drawable getThumbDrawable() {
        return this.f8215a;
    }

    public int getThumbTextPadding() {
        return this.f8225k;
    }

    public ColorStateList getThumbTintList() {
        return this.f8216b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f8217c;
    }

    public Drawable getTrackDrawable() {
        return this.f8220f;
    }

    public ColorStateList getTrackTintList() {
        return this.f8221g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f8222h;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f8211J;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f8207F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void i(Context context, int i6) {
        S p6 = S.p(context, i6, AbstractC1476i.f15622m2);
        ColorStateList c6 = p6.c(AbstractC1476i.f15638q2);
        if (c6 != null) {
            this.f8208G = c6;
        } else {
            this.f8208G = getTextColors();
        }
        int e6 = p6.e(AbstractC1476i.f15626n2, 0);
        if (e6 != 0) {
            float f6 = e6;
            if (f6 != this.f8207F.getTextSize()) {
                this.f8207F.setTextSize(f6);
                requestLayout();
            }
        }
        k(p6.i(AbstractC1476i.f15630o2, -1), p6.i(AbstractC1476i.f15634p2, -1));
        if (p6.a(AbstractC1476i.f15658v2, false)) {
            this.f8211J = new C1808a(getContext());
        } else {
            this.f8211J = null;
        }
        p6.s();
    }

    public void j(Typeface typeface, int i6) {
        if (i6 <= 0) {
            this.f8207F.setFakeBoldText(false);
            this.f8207F.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i6) : Typeface.create(typeface, i6);
            setSwitchTypeface(defaultFromStyle);
            int i7 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i6;
            this.f8207F.setFakeBoldText((i7 & 1) != 0);
            this.f8207F.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8215a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f8212K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f8212K.end();
        this.f8212K = null;
    }

    public final void k(int i6, int i7) {
        j(i6 != 1 ? i6 != 2 ? i6 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i7);
    }

    public final void l(MotionEvent motionEvent) {
        this.f8232r = 0;
        boolean z6 = true;
        boolean z7 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z7) {
            this.f8236v.computeCurrentVelocity(1000);
            float xVelocity = this.f8236v.getXVelocity();
            if (Math.abs(xVelocity) <= this.f8237w) {
                z6 = getTargetCheckedState();
            } else if (!V.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z6 = false;
            }
        } else {
            z6 = isChecked;
        }
        if (z6 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z6);
        e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f8201W);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f8214M;
        Drawable drawable = this.f8220f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i6 = this.f8204C;
        int i7 = this.f8206E;
        int i8 = i6 + rect.top;
        int i9 = i7 - rect.bottom;
        Drawable drawable2 = this.f8215a;
        if (drawable != null) {
            if (!this.f8228n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c6 = y.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c6.left;
                rect.right -= c6.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f8209H : this.f8210I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f8208G;
            if (colorStateList != null) {
                this.f8207F.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f8207F.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i8 + i9) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f8229o : this.f8230p;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10;
        int width;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onLayout(z6, i6, i7, i8, i9);
        int i15 = 0;
        if (this.f8215a != null) {
            Rect rect = this.f8214M;
            Drawable drawable = this.f8220f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c6 = y.c(this.f8215a);
            i10 = Math.max(0, c6.left - rect.left);
            i15 = Math.max(0, c6.right - rect.right);
        } else {
            i10 = 0;
        }
        if (V.b(this)) {
            i11 = getPaddingLeft() + i10;
            width = ((this.f8239y + i11) - i10) - i15;
        } else {
            width = (getWidth() - getPaddingRight()) - i15;
            i11 = (width - this.f8239y) + i10 + i15;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i12 = this.f8240z;
            i13 = paddingTop - (i12 / 2);
        } else {
            if (gravity == 80) {
                i14 = getHeight() - getPaddingBottom();
                i13 = i14 - this.f8240z;
                this.f8203B = i11;
                this.f8204C = i13;
                this.f8206E = i14;
                this.f8205D = width;
            }
            i13 = getPaddingTop();
            i12 = this.f8240z;
        }
        i14 = i12 + i13;
        this.f8203B = i11;
        this.f8204C = i13;
        this.f8206E = i14;
        this.f8205D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        if (this.f8231q) {
            if (this.f8209H == null) {
                this.f8209H = h(this.f8229o);
            }
            if (this.f8210I == null) {
                this.f8210I = h(this.f8230p);
            }
        }
        Rect rect = this.f8214M;
        Drawable drawable = this.f8215a;
        int i10 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i8 = (this.f8215a.getIntrinsicWidth() - rect.left) - rect.right;
            i9 = this.f8215a.getIntrinsicHeight();
        } else {
            i8 = 0;
            i9 = 0;
        }
        this.f8202A = Math.max(this.f8231q ? Math.max(this.f8209H.getWidth(), this.f8210I.getWidth()) + (this.f8225k * 2) : 0, i8);
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i10 = this.f8220f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i11 = rect.left;
        int i12 = rect.right;
        Drawable drawable3 = this.f8215a;
        if (drawable3 != null) {
            Rect c6 = y.c(drawable3);
            i11 = Math.max(i11, c6.left);
            i12 = Math.max(i12, c6.right);
        }
        int max = Math.max(this.f8226l, (this.f8202A * 2) + i11 + i12);
        int max2 = Math.max(i10, i9);
        this.f8239y = max;
        this.f8240z = max2;
        super.onMeasure(i6, i7);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f8229o : this.f8230p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f8236v
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f8232r
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f8234t
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = q.V.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f8238x
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f8238x
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f8234t = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f8234t
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f8233s
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f8235u
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f8233s
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f8232r = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f8234t = r0
            r6.f8235u = r3
            return r1
        L89:
            int r0 = r6.f8232r
            if (r0 != r2) goto L94
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f8232r = r0
            android.view.VelocityTracker r0 = r6.f8236v
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f8232r = r1
            r6.f8234t = r0
            r6.f8235u = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && AbstractC2393D.A(this)) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.m(this, callback));
    }

    public void setShowText(boolean z6) {
        if (this.f8231q != z6) {
            this.f8231q = z6;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z6) {
        this.f8228n = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i6) {
        this.f8226l = i6;
        requestLayout();
    }

    public void setSwitchPadding(int i6) {
        this.f8227m = i6;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f8207F.getTypeface() == null || this.f8207F.getTypeface().equals(typeface)) && (this.f8207F.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f8207F.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f8230p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f8229o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8215a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8215a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f6) {
        this.f8238x = f6;
        invalidate();
    }

    public void setThumbResource(int i6) {
        setThumbDrawable(AbstractC1653a.b(getContext(), i6));
    }

    public void setThumbTextPadding(int i6) {
        this.f8225k = i6;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8216b = colorStateList;
        this.f8218d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f8217c = mode;
        this.f8219e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8220f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8220f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i6) {
        setTrackDrawable(AbstractC1653a.b(getContext(), i6));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8221g = colorStateList;
        this.f8223i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f8222h = mode;
        this.f8224j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8215a || drawable == this.f8220f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8216b = null;
        this.f8217c = null;
        this.f8218d = false;
        this.f8219e = false;
        this.f8221g = null;
        this.f8222h = null;
        this.f8223i = false;
        this.f8224j = false;
        this.f8236v = VelocityTracker.obtain();
        this.f8214M = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f8207F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        S r6 = S.r(context, attributeSet, AbstractC1476i.f15551X1, i6, 0);
        Drawable f6 = r6.f(AbstractC1476i.f15564a2);
        this.f8215a = f6;
        if (f6 != null) {
            f6.setCallback(this);
        }
        Drawable f7 = r6.f(AbstractC1476i.f15609j2);
        this.f8220f = f7;
        if (f7 != null) {
            f7.setCallback(this);
        }
        this.f8229o = r6.n(AbstractC1476i.f15555Y1);
        this.f8230p = r6.n(AbstractC1476i.f15559Z1);
        this.f8231q = r6.a(AbstractC1476i.f15569b2, true);
        this.f8225k = r6.e(AbstractC1476i.f15594g2, 0);
        this.f8226l = r6.e(AbstractC1476i.f15579d2, 0);
        this.f8227m = r6.e(AbstractC1476i.f15584e2, 0);
        this.f8228n = r6.a(AbstractC1476i.f15574c2, false);
        ColorStateList c6 = r6.c(AbstractC1476i.f15599h2);
        if (c6 != null) {
            this.f8216b = c6;
            this.f8218d = true;
        }
        PorterDuff.Mode d6 = y.d(r6.i(AbstractC1476i.f15604i2, -1), null);
        if (this.f8217c != d6) {
            this.f8217c = d6;
            this.f8219e = true;
        }
        if (this.f8218d || this.f8219e) {
            b();
        }
        ColorStateList c7 = r6.c(AbstractC1476i.f15614k2);
        if (c7 != null) {
            this.f8221g = c7;
            this.f8223i = true;
        }
        PorterDuff.Mode d7 = y.d(r6.i(AbstractC1476i.f15618l2, -1), null);
        if (this.f8222h != d7) {
            this.f8222h = d7;
            this.f8224j = true;
        }
        if (this.f8223i || this.f8224j) {
            c();
        }
        int l6 = r6.l(AbstractC1476i.f15589f2, 0);
        if (l6 != 0) {
            i(context, l6);
        }
        C1989m c1989m = new C1989m(this);
        this.f8213L = c1989m;
        c1989m.m(attributeSet, i6);
        r6.s();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8233s = viewConfiguration.getScaledTouchSlop();
        this.f8237w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
