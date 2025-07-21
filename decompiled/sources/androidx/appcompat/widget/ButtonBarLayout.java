package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import i.AbstractC1472e;
import i.AbstractC1476i;
import kotlin.jvm.internal.IntCompanionObject;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8117a;

    /* renamed from: b, reason: collision with root package name */
    public int f8118b;

    /* renamed from: c, reason: collision with root package name */
    public int f8119c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ButtonBarLayout buttonBarLayout;
        this.f8118b = -1;
        this.f8119c = 0;
        int[] iArr = AbstractC1476i.f15620m0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            buttonBarLayout = this;
            buttonBarLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        } else {
            buttonBarLayout = this;
        }
        buttonBarLayout.f8117a = obtainStyledAttributes.getBoolean(AbstractC1476i.f15624n0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z6) {
        setOrientation(z6 ? 1 : 0);
        setGravity(z6 ? 5 : 80);
        View findViewById = findViewById(AbstractC1472e.f15427v);
        if (findViewById != null) {
            findViewById.setVisibility(z6 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i6) {
        int childCount = getChildCount();
        while (i6 < childCount) {
            if (getChildAt(i6).getVisibility() == 0) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f8119c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        boolean z6;
        int size = View.MeasureSpec.getSize(i6);
        int i9 = 0;
        if (this.f8117a) {
            if (size > this.f8118b && b()) {
                setStacked(false);
            }
            this.f8118b = size;
        }
        if (b() || View.MeasureSpec.getMode(i6) != 1073741824) {
            i8 = i6;
            z6 = false;
        } else {
            i8 = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(i8, i7);
        if (this.f8117a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i6, i7);
        }
        int a6 = a(0);
        if (a6 >= 0) {
            View childAt = getChildAt(a6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a7 = a(a6 + 1);
                if (a7 >= 0) {
                    paddingTop += getChildAt(a7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i9 = paddingTop;
            } else {
                i9 = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC2393D.q(this) != i9) {
            setMinimumHeight(i9);
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f8117a != z6) {
            this.f8117a = z6;
            if (!z6 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
