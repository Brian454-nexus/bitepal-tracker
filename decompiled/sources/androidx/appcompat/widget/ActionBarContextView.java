package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import i.AbstractC1468a;
import i.AbstractC1472e;
import i.AbstractC1473f;
import i.AbstractC1476i;
import kotlin.jvm.internal.IntCompanionObject;
import q.AbstractC1977a;
import q.S;
import q.V;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionBarContextView extends AbstractC1977a {

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f8056h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f8057i;

    /* renamed from: j, reason: collision with root package name */
    public View f8058j;

    /* renamed from: k, reason: collision with root package name */
    public View f8059k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f8060l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f8061m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f8062n;

    /* renamed from: o, reason: collision with root package name */
    public int f8063o;

    /* renamed from: p, reason: collision with root package name */
    public int f8064p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8065q;

    /* renamed from: r, reason: collision with root package name */
    public int f8066r;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1468a.f15330d);
    }

    public final void d() {
        if (this.f8060l == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC1473f.f15432a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8060l = linearLayout;
            this.f8061m = (TextView) linearLayout.findViewById(AbstractC1472e.f15410e);
            this.f8062n = (TextView) this.f8060l.findViewById(AbstractC1472e.f15409d);
            if (this.f8063o != 0) {
                this.f8061m.setTextAppearance(getContext(), this.f8063o);
            }
            if (this.f8064p != 0) {
                this.f8062n.setTextAppearance(getContext(), this.f8064p);
            }
        }
        this.f8061m.setText(this.f8056h);
        this.f8062n.setText(this.f8057i);
        boolean isEmpty = TextUtils.isEmpty(this.f8056h);
        boolean isEmpty2 = TextUtils.isEmpty(this.f8057i);
        this.f8062n.setVisibility(!isEmpty2 ? 0 : 8);
        this.f8060l.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f8060l.getParent() == null) {
            addView(this.f8060l);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // q.AbstractC1977a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // q.AbstractC1977a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f8057i;
    }

    public CharSequence getTitle() {
        return this.f8056h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f18515d;
        if (aVar != null) {
            aVar.y();
            this.f18515d.z();
        }
    }

    @Override // q.AbstractC1977a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f8056h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        boolean b6 = V.b(this);
        int paddingRight = b6 ? (i8 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8058j;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8058j.getLayoutParams();
            int i10 = b6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = b6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int b7 = AbstractC1977a.b(paddingRight, i10, b6);
            paddingRight = AbstractC1977a.b(b7 + c(this.f8058j, b7, paddingTop, paddingTop2, b6), i11, b6);
        }
        int i12 = paddingRight;
        LinearLayout linearLayout = this.f8060l;
        if (linearLayout != null && this.f8059k == null && linearLayout.getVisibility() != 8) {
            i12 += c(this.f8060l, i12, paddingTop, paddingTop2, b6);
        }
        View view2 = this.f8059k;
        if (view2 != null) {
            c(view2, i12, paddingTop, paddingTop2, b6);
        }
        int paddingLeft = b6 ? getPaddingLeft() : (i8 - i6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f18514c;
        if (actionMenuView != null) {
            c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        if (View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i6);
        int i8 = this.f18516e;
        if (i8 <= 0) {
            i8 = View.MeasureSpec.getSize(i7);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i9 = i8 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, IntCompanionObject.MIN_VALUE);
        View view = this.f8058j;
        if (view != null) {
            int a6 = a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8058j.getLayoutParams();
            paddingLeft = a6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f18514c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = a(this.f18514c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f8060l;
        if (linearLayout != null && this.f8059k == null) {
            if (this.f8065q) {
                this.f8060l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f8060l.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f8060l.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f8059k;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                i9 = Math.min(i12, i9);
            }
            this.f8059k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i13));
        }
        if (this.f18516e > 0) {
            setMeasuredDimension(size, i8);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // q.AbstractC1977a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // q.AbstractC1977a
    public void setContentHeight(int i6) {
        this.f18516e = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8059k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8059k = view;
        if (view != null && (linearLayout = this.f8060l) != null) {
            removeView(linearLayout);
            this.f8060l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8057i = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8056h = charSequence;
        d();
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f8065q) {
            requestLayout();
        }
        this.f8065q = z6;
    }

    @Override // q.AbstractC1977a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        S r6 = S.r(context, attributeSet, AbstractC1476i.f15659w, i6, 0);
        AbstractC2393D.O(this, r6.f(AbstractC1476i.f15663x));
        this.f8063o = r6.l(AbstractC1476i.f15461B, 0);
        this.f8064p = r6.l(AbstractC1476i.f15457A, 0);
        this.f18516e = r6.k(AbstractC1476i.f15671z, 0);
        this.f8066r = r6.l(AbstractC1476i.f15667y, AbstractC1473f.f15435d);
        r6.s();
    }
}
