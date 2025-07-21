package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b;
import i.AbstractC1472e;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AlertDialogLayout extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int y(View view) {
        int q6 = AbstractC2393D.q(view);
        if (q6 > 0) {
            return q6;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return y(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final void i(int i6, int i7) {
        int i8;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i9 = 0;
        while (i9 < i6) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                b.a aVar = (b.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i8 = i7;
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i8, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r13 = r10.getPaddingTop()
            goto L43
        L30:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L43
        L39:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / 2
            int r13 = r3 + r15
        L43:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r0 = 0
            if (r15 != 0) goto L4c
            r15 = r0
            goto L50
        L4c:
            int r15 = r15.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb1
            android.view.View r4 = r10.getChildAt(r0)
            if (r4 == 0) goto Lae
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto Lae
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r9 = r3
            androidx.appcompat.widget.b$a r9 = (androidx.appcompat.widget.b.a) r9
            int r3 = r9.f8340b
            if (r3 >= 0) goto L74
            r3 = r2
        L74:
            int r5 = z0.AbstractC2393D.p(r10)
            int r3 = z0.AbstractC2424j.a(r3, r5)
            r3 = r3 & 7
            r5 = 1
            if (r3 == r5) goto L8f
            r5 = 5
            if (r3 == r5) goto L89
            int r3 = r9.leftMargin
            int r3 = r3 + r11
        L87:
            r5 = r3
            goto L9a
        L89:
            int r3 = r12 - r7
            int r5 = r9.rightMargin
        L8d:
            int r3 = r3 - r5
            goto L87
        L8f:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r11
            int r5 = r9.leftMargin
            int r3 = r3 + r5
            int r5 = r9.rightMargin
            goto L8d
        L9a:
            boolean r3 = r10.q(r0)
            if (r3 == 0) goto La1
            int r13 = r13 + r15
        La1:
            int r3 = r9.topMargin
            int r6 = r13 + r3
            r3 = r10
            r3.x(r4, r5, r6, r7, r8)
            int r13 = r9.bottomMargin
            int r8 = r8 + r13
            int r6 = r6 + r8
            r13 = r6
        Lae:
            int r0 = r0 + 1
            goto L50
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i6, int i7) {
        if (z(i6, i7)) {
            return;
        }
        super.onMeasure(i6, i7);
    }

    public final void x(View view, int i6, int i7, int i8, int i9) {
        view.layout(i6, i7, i8 + i6, i9 + i7);
    }

    public final boolean z(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC1472e.f15405A) {
                    view = childAt;
                } else if (id == AbstractC1472e.f15412g) {
                    view2 = childAt;
                } else {
                    if ((id != AbstractC1472e.f15414i && id != AbstractC1472e.f15415j) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i6);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i6, 0);
            paddingTop += view.getMeasuredHeight();
            i8 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i8 = 0;
        }
        if (view2 != null) {
            view2.measure(i6, 0);
            i9 = y(view2);
            i10 = view2.getMeasuredHeight() - i9;
            paddingTop += i9;
            i8 = View.combineMeasuredStates(i8, view2.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (view3 != null) {
            view3.measure(i6, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i11 = view3.getMeasuredHeight();
            paddingTop += i11;
            i8 = View.combineMeasuredStates(i8, view3.getMeasuredState());
        } else {
            i11 = 0;
        }
        int i13 = size - paddingTop;
        if (view2 != null) {
            int i14 = paddingTop - i9;
            int min = Math.min(i13, i10);
            if (min > 0) {
                i13 -= min;
                i9 += min;
            }
            view2.measure(i6, View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            paddingTop = i14 + view2.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i6, View.MeasureSpec.makeMeasureSpec(i11 + i13, mode));
            paddingTop = (paddingTop - i11) + view3.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, view3.getMeasuredState());
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15 + getPaddingLeft() + getPaddingRight(), i6, i8), View.resolveSizeAndState(paddingTop, i7, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        i(childCount, i7);
        return true;
    }
}
