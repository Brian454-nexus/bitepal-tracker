package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import i.AbstractC1476i;
import q.S;
import q.V;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8324a;

    /* renamed from: b, reason: collision with root package name */
    public int f8325b;

    /* renamed from: c, reason: collision with root package name */
    public int f8326c;

    /* renamed from: d, reason: collision with root package name */
    public int f8327d;

    /* renamed from: e, reason: collision with root package name */
    public int f8328e;

    /* renamed from: f, reason: collision with root package name */
    public int f8329f;

    /* renamed from: g, reason: collision with root package name */
    public float f8330g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8331h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f8332i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f8333j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f8334k;

    /* renamed from: l, reason: collision with root package name */
    public int f8335l;

    /* renamed from: m, reason: collision with root package name */
    public int f8336m;

    /* renamed from: n, reason: collision with root package name */
    public int f8337n;

    /* renamed from: o, reason: collision with root package name */
    public int f8338o;

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void i(int i6, int i7) {
        int i8;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i9 = 0;
        while (i9 < i6) {
            View p6 = p(i9);
            if (p6.getVisibility() != 8) {
                a aVar = (a) p6.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = p6.getMeasuredHeight();
                    i8 = i7;
                    measureChildWithMargins(p6, makeMeasureSpec, 0, i8, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i10;
                    i9++;
                    i7 = i8;
                }
            }
            i8 = i7;
            i9++;
            i7 = i8;
        }
    }

    private void x(View view, int i6, int i7, int i8, int i9) {
        view.layout(i6, i7, i8 + i6, i9 + i7);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void d(Canvas canvas) {
        int right;
        int left;
        int i6;
        int virtualChildCount = getVirtualChildCount();
        boolean b6 = V.b(this);
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View p6 = p(i7);
            if (p6 != null && p6.getVisibility() != 8 && q(i7)) {
                a aVar = (a) p6.getLayoutParams();
                g(canvas, b6 ? p6.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (p6.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f8335l);
            }
        }
        if (q(virtualChildCount)) {
            View p7 = p(virtualChildCount - 1);
            if (p7 != null) {
                a aVar2 = (a) p7.getLayoutParams();
                if (b6) {
                    left = p7.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i6 = this.f8335l;
                    right = left - i6;
                } else {
                    right = p7.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i6 = this.f8335l;
                right = left - i6;
            }
            g(canvas, right);
        }
    }

    public void e(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            View p6 = p(i6);
            if (p6 != null && p6.getVisibility() != 8 && q(i6)) {
                f(canvas, (p6.getTop() - ((ViewGroup.MarginLayoutParams) ((a) p6.getLayoutParams())).topMargin) - this.f8336m);
            }
        }
        if (q(virtualChildCount)) {
            View p7 = p(virtualChildCount - 1);
            f(canvas, p7 == null ? (getHeight() - getPaddingBottom()) - this.f8336m : p7.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) p7.getLayoutParams())).bottomMargin);
        }
    }

    public void f(Canvas canvas, int i6) {
        this.f8334k.setBounds(getPaddingLeft() + this.f8338o, i6, (getWidth() - getPaddingRight()) - this.f8338o, this.f8336m + i6);
        this.f8334k.draw(canvas);
    }

    public void g(Canvas canvas, int i6) {
        this.f8334k.setBounds(i6, getPaddingTop() + this.f8338o, this.f8335l + i6, (getHeight() - getPaddingBottom()) - this.f8338o);
        this.f8334k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f8325b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f8325b;
        if (childCount <= i7) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i7);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8325b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i8 = this.f8326c;
        if (this.f8327d == 1 && (i6 = this.f8328e & 112) != 48) {
            if (i6 == 16) {
                i8 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8329f) / 2;
            } else if (i6 == 80) {
                i8 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8329f;
            }
        }
        return i8 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8325b;
    }

    public Drawable getDividerDrawable() {
        return this.f8334k;
    }

    public int getDividerPadding() {
        return this.f8338o;
    }

    public int getDividerWidth() {
        return this.f8335l;
    }

    public int getGravity() {
        return this.f8328e;
    }

    public int getOrientation() {
        return this.f8327d;
    }

    public int getShowDividers() {
        return this.f8337n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8330g;
    }

    public final void h(int i6, int i7) {
        int i8;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i9 = 0;
        while (i9 < i6) {
            View p6 = p(i9);
            if (p6.getVisibility() != 8) {
                a aVar = (a) p6.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = p6.getMeasuredWidth();
                    i8 = i7;
                    measureChildWithMargins(p6, i8, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i10;
                    i9++;
                    i7 = i8;
                }
            }
            i8 = i7;
            i9++;
            i7 = i8;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i6 = this.f8327d;
        if (i6 == 0) {
            return new a(-2, -2);
        }
        if (i6 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int m(View view, int i6) {
        return 0;
    }

    public int n(View view) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f8334k == null) {
            return;
        }
        if (this.f8327d == 1) {
            e(canvas);
        } else {
            d(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        if (this.f8327d == 1) {
            s(i6, i7, i8, i9);
        } else {
            r(i6, i7, i8, i9);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        if (this.f8327d == 1) {
            w(i6, i7);
        } else {
            u(i6, i7);
        }
    }

    public View p(int i6) {
        return getChildAt(i6);
    }

    public boolean q(int i6) {
        if (i6 == 0) {
            return (this.f8337n & 1) != 0;
        }
        if (i6 == getChildCount()) {
            return (this.f8337n & 4) != 0;
        }
        if ((this.f8337n & 2) != 0) {
            for (int i7 = i6 - 1; i7 >= 0; i7--) {
                if (getChildAt(i7).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.r(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f8328e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f8329f
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f8329f
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.p(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.v(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.b$a r10 = (androidx.appcompat.widget.b.a) r10
            int r3 = r10.f8340b
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = z0.AbstractC2393D.p(r11)
            int r3 = z0.AbstractC2424j.a(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.q(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f8336m
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.n(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.x(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.o(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.m(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z6) {
        this.f8324a = z6;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f8325b = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8334k) {
            return;
        }
        this.f8334k = drawable;
        if (drawable != null) {
            this.f8335l = drawable.getIntrinsicWidth();
            this.f8336m = drawable.getIntrinsicHeight();
        } else {
            this.f8335l = 0;
            this.f8336m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.f8338o = i6;
    }

    public void setGravity(int i6) {
        if (this.f8328e != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f8328e = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i7 = i6 & 8388615;
        int i8 = this.f8328e;
        if ((8388615 & i8) != i7) {
            this.f8328e = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f8331h = z6;
    }

    public void setOrientation(int i6) {
        if (this.f8327d != i6) {
            this.f8327d = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.f8337n) {
            requestLayout();
        }
        this.f8337n = i6;
    }

    public void setVerticalGravity(int i6) {
        int i7 = i6 & 112;
        int i8 = this.f8328e;
        if ((i8 & 112) != i7) {
            this.f8328e = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f8330g = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(View view, int i6, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.u(int, int):void");
    }

    public int v(int i6) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.w(int, int):void");
    }

    public b(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8324a = true;
        this.f8325b = -1;
        this.f8326c = 0;
        this.f8328e = 8388659;
        S r6 = S.r(context, attributeSet, AbstractC1476i.f15656v0, i6, 0);
        int i7 = r6.i(AbstractC1476i.f15664x0, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i8 = r6.i(AbstractC1476i.f15660w0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean a6 = r6.a(AbstractC1476i.f15668y0, true);
        if (!a6) {
            setBaselineAligned(a6);
        }
        this.f8330g = r6.g(AbstractC1476i.f15458A0, -1.0f);
        this.f8325b = r6.i(AbstractC1476i.f15672z0, -1);
        this.f8331h = r6.a(AbstractC1476i.f15470D0, false);
        setDividerDrawable(r6.f(AbstractC1476i.f15462B0));
        this.f8337n = r6.i(AbstractC1476i.f15474E0, 0);
        this.f8338o = r6.e(AbstractC1476i.f15466C0, 0);
        r6.s();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f8339a;

        /* renamed from: b, reason: collision with root package name */
        public int f8340b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8340b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15478F0);
            this.f8339a = obtainStyledAttributes.getFloat(AbstractC1476i.f15486H0, 0.0f);
            this.f8340b = obtainStyledAttributes.getInt(AbstractC1476i.f15482G0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i6, int i7) {
            super(i6, i7);
            this.f8340b = -1;
            this.f8339a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8340b = -1;
        }
    }
}
