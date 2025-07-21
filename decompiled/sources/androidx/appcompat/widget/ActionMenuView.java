package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import kotlin.jvm.internal.IntCompanionObject;
import q.V;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements d.b, h {

    /* renamed from: A, reason: collision with root package name */
    public e f8097A;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f8098p;

    /* renamed from: q, reason: collision with root package name */
    public Context f8099q;

    /* renamed from: r, reason: collision with root package name */
    public int f8100r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8101s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.appcompat.widget.a f8102t;

    /* renamed from: u, reason: collision with root package name */
    public g.a f8103u;

    /* renamed from: v, reason: collision with root package name */
    public d.a f8104v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8105w;

    /* renamed from: x, reason: collision with root package name */
    public int f8106x;

    /* renamed from: y, reason: collision with root package name */
    public int f8107y;

    /* renamed from: z, reason: collision with root package name */
    public int f8108z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements g.a {
        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends b.a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f8109c;

        /* renamed from: d, reason: collision with root package name */
        public int f8110d;

        /* renamed from: e, reason: collision with root package name */
        public int f8111e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8112f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8113g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8114h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f8109c = cVar.f8109c;
        }

        public c(int i6, int i7) {
            super(i6, i7);
            this.f8109c = false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements d.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f8097A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            d.a aVar = ActionMenuView.this.f8104v;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int G(View view, int i6, int i7, int i8, int i9) {
        int i10;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8) - i9, View.MeasureSpec.getMode(i8));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z6 = false;
        boolean z7 = actionMenuItemView != null && actionMenuItemView.f();
        if (i7 > 0) {
            i10 = 2;
            if (!z7 || i7 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i11 = measuredWidth / i6;
                if (measuredWidth % i6 != 0) {
                    i11++;
                }
                if (!z7 || i11 >= 2) {
                    i10 = i11;
                }
                if (!cVar.f8109c && z7) {
                    z6 = true;
                }
                cVar.f8112f = z6;
                cVar.f8110d = i10;
                view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i10, 1073741824), makeMeasureSpec);
                return i10;
            }
        }
        i10 = 0;
        if (!cVar.f8109c) {
            z6 = true;
        }
        cVar.f8112f = z6;
        cVar.f8110d = i10;
        view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i10, 1073741824), makeMeasureSpec);
        return i10;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f8340b <= 0) {
            cVar.f8340b = 16;
        }
        return cVar;
    }

    public c C() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f8109c = true;
        return generateDefaultLayoutParams;
    }

    public boolean D(int i6) {
        boolean z6 = false;
        if (i6 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i6 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof a)) {
            z6 = ((a) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof a)) ? z6 : ((a) childAt2).b() | z6;
    }

    public void E(androidx.appcompat.view.menu.d dVar) {
        this.f8098p = dVar;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f8102t;
        return aVar != null && aVar.A();
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void H(int i6, int i7) {
        long j6;
        int i8;
        int i9;
        boolean z6;
        boolean z7;
        ?? r32;
        int i10;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i6);
        int size2 = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f8107y;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j7 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() == 8) {
                i10 = i15;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z9) {
                    int i22 = this.f8108z;
                    z7 = z9;
                    r32 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    z7 = z9;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f8114h = r32;
                cVar.f8111e = r32;
                cVar.f8110d = r32;
                cVar.f8112f = r32;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r32;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r32;
                cVar.f8113g = z7 && ((ActionMenuItemView) childAt).f();
                int G6 = G(childAt, i15, cVar.f8109c ? 1 : i13, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, G6);
                i10 = i15;
                if (cVar.f8112f) {
                    i20++;
                }
                if (cVar.f8109c) {
                    z8 = true;
                }
                i13 -= G6;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (G6 == 1) {
                    j7 |= 1 << i17;
                }
            }
            i17++;
            size2 = i21;
            i15 = i10;
        }
        int i23 = size2;
        int i24 = i15;
        char c6 = 2;
        boolean z10 = z8 && i18 == 2;
        boolean z11 = false;
        while (i20 > 0 && i13 > 0) {
            int i25 = IntCompanionObject.MAX_VALUE;
            long j8 = 0;
            char c7 = c6;
            int i26 = 0;
            int i27 = 0;
            j6 = 1;
            while (i27 < childCount) {
                c cVar2 = (c) getChildAt(i27).getLayoutParams();
                boolean z12 = z10;
                if (cVar2.f8112f) {
                    int i28 = cVar2.f8110d;
                    if (i28 < i25) {
                        j8 = 1 << i27;
                        i25 = i28;
                        i26 = 1;
                    } else if (i28 == i25) {
                        j8 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                z10 = z12;
            }
            boolean z13 = z10;
            j7 |= j8;
            if (i26 > i13) {
                break;
            }
            int i29 = i25 + 1;
            int i30 = 0;
            while (i30 < childCount) {
                View childAt2 = getChildAt(i30);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j9 = 1 << i30;
                if ((j8 & j9) == 0) {
                    if (cVar3.f8110d == i29) {
                        j7 |= j9;
                    }
                    i9 = i30;
                } else {
                    if (!z13 || !cVar3.f8113g) {
                        i9 = i30;
                        z6 = true;
                    } else if (i13 == 1) {
                        int i31 = this.f8108z;
                        z6 = true;
                        i9 = i30;
                        childAt2.setPadding(i31 + i24, 0, i31, 0);
                    } else {
                        i9 = i30;
                        z6 = true;
                    }
                    cVar3.f8110d++;
                    cVar3.f8114h = z6;
                    i13--;
                }
                i30 = i9 + 1;
            }
            c6 = c7;
            z10 = z13;
            z11 = true;
        }
        j6 = 1;
        boolean z14 = !z8 && i18 == 1;
        if (i13 <= 0 || j7 == 0 || (i13 >= i18 - 1 && !z14 && i19 <= 1)) {
            i8 = 0;
        } else {
            float bitCount = Long.bitCount(j7);
            if (z14) {
                i8 = 0;
            } else {
                if ((j7 & j6) != 0) {
                    i8 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f8113g) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i8 = 0;
                }
                int i32 = childCount - 1;
                if ((j7 & (1 << i32)) != 0 && !((c) getChildAt(i32).getLayoutParams()).f8113g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i13 * i24) / bitCount) : i8;
            boolean z15 = z11;
            for (int i34 = i8; i34 < childCount; i34++) {
                if ((j7 & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f8111e = i33;
                        cVar4.f8114h = true;
                        if (i34 == 0 && !cVar4.f8113g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i33) / 2;
                        }
                        z15 = true;
                    } else {
                        if (cVar4.f8109c) {
                            cVar4.f8111e = i33;
                            cVar4.f8114h = true;
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i33) / 2;
                            z15 = true;
                        } else {
                            if (i34 != 0) {
                                ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i33 / 2;
                            }
                            if (i34 != childCount - 1) {
                                ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i33 / 2;
                            }
                        }
                    }
                }
            }
            z11 = z15;
        }
        if (z11) {
            for (int i35 = i8; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f8114h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f8110d * i24) + cVar5.f8111e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i16 : i23);
    }

    public androidx.appcompat.view.menu.d I() {
        return this.f8098p;
    }

    public void J(g.a aVar, d.a aVar2) {
        this.f8103u = aVar;
        this.f8104v = aVar2;
    }

    public boolean K() {
        androidx.appcompat.widget.a aVar = this.f8102t;
        return aVar != null && aVar.G();
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(androidx.appcompat.view.menu.e eVar) {
        return this.f8098p.H(eVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f8098p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context);
            this.f8098p = dVar;
            dVar.L(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f8102t = aVar;
            aVar.F(true);
            androidx.appcompat.widget.a aVar2 = this.f8102t;
            g.a aVar3 = this.f8103u;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.h(aVar3);
            this.f8098p.b(this.f8102t, this.f8099q);
            this.f8102t.D(this);
        }
        return this.f8098p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f8102t.x();
    }

    public int getPopupTheme() {
        return this.f8100r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f8102t;
        if (aVar != null) {
            aVar.c(false);
            if (this.f8102t.A()) {
                this.f8102t.y();
                this.f8102t.G();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int width;
        int i10;
        if (!this.f8105w) {
            super.onLayout(z6, i6, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i8 - i6;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean b6 = V.b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f8109c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (D(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b6) {
                        i10 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    D(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (b6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f8109c) {
                    int i21 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f8109c) {
                int i24 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = i24 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i6, int i7) {
        androidx.appcompat.view.menu.d dVar;
        boolean z6 = this.f8105w;
        boolean z7 = View.MeasureSpec.getMode(i6) == 1073741824;
        this.f8105w = z7;
        if (z6 != z7) {
            this.f8106x = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.f8105w && (dVar = this.f8098p) != null && size != this.f8106x) {
            this.f8106x = size;
            dVar.G(true);
        }
        int childCount = getChildCount();
        if (this.f8105w && childCount > 0) {
            H(i6, i7);
            return;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            c cVar = (c) getChildAt(i8).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i6, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f8102t.C(z6);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f8097A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f8102t.E(drawable);
    }

    public void setOverflowReserved(boolean z6) {
        this.f8101s = z6;
    }

    public void setPopupTheme(int i6) {
        if (this.f8100r != i6) {
            this.f8100r = i6;
            if (i6 == 0) {
                this.f8099q = getContext();
            } else {
                this.f8099q = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f8102t = aVar;
        aVar.D(this);
    }

    public void y() {
        androidx.appcompat.widget.a aVar = this.f8102t;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f8340b = 16;
        return cVar;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f8107y = (int) (56.0f * f6);
        this.f8108z = (int) (f6 * 4.0f);
        this.f8099q = context;
        this.f8100r = 0;
    }
}
