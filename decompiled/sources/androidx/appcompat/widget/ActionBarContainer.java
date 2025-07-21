package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import i.AbstractC1472e;
import i.AbstractC1476i;
import kotlin.jvm.internal.IntCompanionObject;
import q.C1978b;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8046a;

    /* renamed from: b, reason: collision with root package name */
    public View f8047b;

    /* renamed from: c, reason: collision with root package name */
    public View f8048c;

    /* renamed from: d, reason: collision with root package name */
    public View f8049d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8050e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8051f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f8052g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8053h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8054i;

    /* renamed from: j, reason: collision with root package name */
    public int f8055j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2393D.O(this, new C1978b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15561a);
        this.f8050e = obtainStyledAttributes.getDrawable(AbstractC1476i.f15566b);
        this.f8051f = obtainStyledAttributes.getDrawable(AbstractC1476i.f15576d);
        this.f8055j = obtainStyledAttributes.getDimensionPixelSize(AbstractC1476i.f15601i, -1);
        boolean z6 = true;
        if (getId() == AbstractC1472e.f15428w) {
            this.f8053h = true;
            this.f8052g = obtainStyledAttributes.getDrawable(AbstractC1476i.f15571c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f8053h ? this.f8050e != null || this.f8051f != null : this.f8052g != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8050e;
        if (drawable != null && drawable.isStateful()) {
            this.f8050e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8051f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8051f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8052g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8052g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f8047b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8050e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8051f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8052g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8048c = findViewById(AbstractC1472e.f15406a);
        this.f8049d = findViewById(AbstractC1472e.f15411f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8046a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        Drawable drawable;
        super.onLayout(z6, i6, i7, i8, i9);
        View view = this.f8047b;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i10 = layoutParams.bottomMargin;
            view.layout(i6, measuredHeight2 - i10, i8, measuredHeight - i10);
        }
        if (this.f8053h) {
            Drawable drawable2 = this.f8052g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z7 = z8;
        } else {
            if (this.f8050e != null) {
                if (this.f8048c.getVisibility() == 0) {
                    this.f8050e.setBounds(this.f8048c.getLeft(), this.f8048c.getTop(), this.f8048c.getRight(), this.f8048c.getBottom());
                } else {
                    View view2 = this.f8049d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f8050e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f8050e.setBounds(this.f8049d.getLeft(), this.f8049d.getTop(), this.f8049d.getRight(), this.f8049d.getBottom());
                    }
                }
                z8 = true;
            }
            this.f8054i = z9;
            if (z9 && (drawable = this.f8051f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z7 = z8;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        if (this.f8048c == null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE && (i8 = this.f8055j) >= 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i7)), IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i6, i7);
        if (this.f8048c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        View view = this.f8047b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f8048c) ? a(this.f8048c) : !b(this.f8049d) ? a(this.f8049d) : 0) + a(this.f8047b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i7) : IntCompanionObject.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8050e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8050e);
        }
        this.f8050e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8048c;
            if (view != null) {
                this.f8050e.setBounds(view.getLeft(), this.f8048c.getTop(), this.f8048c.getRight(), this.f8048c.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f8053h ? !(this.f8050e != null || this.f8051f != null) : this.f8052g == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8052g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8052g);
        }
        this.f8052g = drawable;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8053h && (drawable2 = this.f8052g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f8053h ? !(this.f8050e != null || this.f8051f != null) : this.f8052g == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8051f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8051f);
        }
        this.f8051f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8054i && (drawable2 = this.f8051f) != null) {
                drawable2.setBounds(this.f8047b.getLeft(), this.f8047b.getTop(), this.f8047b.getRight(), this.f8047b.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f8053h ? !(this.f8050e != null || this.f8051f != null) : this.f8052g == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        View view = this.f8047b;
        if (view != null) {
            removeView(view);
        }
        this.f8047b = cVar;
    }

    public void setTransitioning(boolean z6) {
        this.f8046a = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        Drawable drawable = this.f8050e;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f8051f;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f8052g;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f8050e && !this.f8053h) {
            return true;
        }
        if (drawable == this.f8051f && this.f8054i) {
            return true;
        }
        return (drawable == this.f8052g && this.f8053h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }
}
