package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import i.AbstractC1468a;
import i.AbstractC1472e;
import kotlin.jvm.internal.IntCompanionObject;
import q.InterfaceC1994s;
import q.V;
import z0.AbstractC2393D;
import z0.C2436v;
import z0.InterfaceC2434t;
import z0.InterfaceC2435u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2434t, InterfaceC2435u {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f8067A = {AbstractC1468a.f15328b, R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f8068a;

    /* renamed from: b, reason: collision with root package name */
    public int f8069b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f8070c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f8071d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1994s f8072e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8073f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8074g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8075h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8076i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8077j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8078k;

    /* renamed from: l, reason: collision with root package name */
    public int f8079l;

    /* renamed from: m, reason: collision with root package name */
    public int f8080m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f8081n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f8082o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f8083p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f8084q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f8085r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f8086s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f8087t;

    /* renamed from: u, reason: collision with root package name */
    public OverScroller f8088u;

    /* renamed from: v, reason: collision with root package name */
    public ViewPropertyAnimator f8089v;

    /* renamed from: w, reason: collision with root package name */
    public final AnimatorListenerAdapter f8090w;

    /* renamed from: x, reason: collision with root package name */
    public final Runnable f8091x;

    /* renamed from: y, reason: collision with root package name */
    public final Runnable f8092y;

    /* renamed from: z, reason: collision with root package name */
    public final C2436v f8093z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8089v = null;
            actionBarOverlayLayout.f8078k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8089v = null;
            actionBarOverlayLayout.f8078k = false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8089v = actionBarOverlayLayout.f8071d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f8090w);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8089v = actionBarOverlayLayout.f8071d.animate().translationY(-ActionBarOverlayLayout.this.f8071d.getHeight()).setListener(ActionBarOverlayLayout.this.f8090w);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i6, int i7) {
            super(i6, i7);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8069b = 0;
        this.f8081n = new Rect();
        this.f8082o = new Rect();
        this.f8083p = new Rect();
        this.f8084q = new Rect();
        this.f8085r = new Rect();
        this.f8086s = new Rect();
        this.f8087t = new Rect();
        this.f8090w = new a();
        this.f8091x = new b();
        this.f8092y = new c();
        m(context);
        this.f8093z = new C2436v(this);
    }

    @Override // z0.InterfaceC2435u
    public void a(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        b(view, i6, i7, i8, i9, i10);
    }

    @Override // z0.InterfaceC2434t
    public void b(View view, int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i6, i7, i8, i9);
        }
    }

    @Override // z0.InterfaceC2434t
    public boolean c(View view, View view2, int i6, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // z0.InterfaceC2434t
    public void d(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8073f == null || this.f8074g) {
            return;
        }
        int bottom = this.f8071d.getVisibility() == 0 ? (int) (this.f8071d.getBottom() + this.f8071d.getTranslationY() + 0.5f) : 0;
        this.f8073f.setBounds(0, bottom, getWidth(), this.f8073f.getIntrinsicHeight() + bottom);
        this.f8073f.draw(canvas);
    }

    @Override // z0.InterfaceC2434t
    public void e(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // z0.InterfaceC2434t
    public void f(View view, int i6, int i7, int[] iArr, int i8) {
        if (i8 == 0) {
            onNestedPreScroll(view, i6, i7, iArr);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        p();
        AbstractC2393D.v(this);
        boolean h6 = h(this.f8071d, rect, true, true, false, true);
        this.f8084q.set(rect);
        V.a(this, this.f8084q, this.f8081n);
        if (!this.f8085r.equals(this.f8084q)) {
            this.f8085r.set(this.f8084q);
            h6 = true;
        }
        if (!this.f8082o.equals(this.f8081n)) {
            this.f8082o.set(this.f8081n);
            h6 = true;
        }
        if (h6) {
            requestLayout();
        }
        return true;
    }

    public final void g() {
        l();
        this.f8092y.run();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8071d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8093z.a();
    }

    public CharSequence getTitle() {
        p();
        return this.f8072e.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1994s k(View view) {
        if (view instanceof InterfaceC1994s) {
            return (InterfaceC1994s) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void l() {
        removeCallbacks(this.f8091x);
        removeCallbacks(this.f8092y);
        ViewPropertyAnimator viewPropertyAnimator = this.f8089v;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8067A);
        this.f8068a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f8073f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f8074g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f8088u = new OverScroller(context);
    }

    public final void n() {
        l();
        postDelayed(this.f8092y, 600L);
    }

    public final void o() {
        l();
        postDelayed(this.f8091x, 600L);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(getContext());
        AbstractC2393D.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        p();
        measureChildWithMargins(this.f8071d, i6, 0, i7, 0);
        e eVar = (e) this.f8071d.getLayoutParams();
        int i8 = 0;
        int max = Math.max(0, this.f8071d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f8071d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f8071d.getMeasuredState());
        boolean z6 = (AbstractC2393D.v(this) & 256) != 0;
        if (z6) {
            i8 = this.f8068a;
            if (this.f8076i && this.f8071d.getTabContainer() != null) {
                i8 += this.f8068a;
            }
        } else if (this.f8071d.getVisibility() != 8) {
            i8 = this.f8071d.getMeasuredHeight();
        }
        this.f8083p.set(this.f8081n);
        this.f8086s.set(this.f8084q);
        if (this.f8075h || z6) {
            Rect rect = this.f8086s;
            rect.top += i8;
            rect.bottom = rect.bottom;
        } else {
            Rect rect2 = this.f8083p;
            rect2.top += i8;
            rect2.bottom = rect2.bottom;
        }
        h(this.f8070c, this.f8083p, true, true, true, true);
        if (!this.f8087t.equals(this.f8086s)) {
            this.f8087t.set(this.f8086s);
            this.f8070c.a(this.f8086s);
        }
        measureChildWithMargins(this.f8070c, i6, 0, i7, 0);
        e eVar2 = (e) this.f8070c.getLayoutParams();
        int max3 = Math.max(max, this.f8070c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f8070c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f8070c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i7, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        if (!this.f8077j || !z6) {
            return false;
        }
        if (r(f6, f7)) {
            g();
        } else {
            q();
        }
        this.f8078k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        int i10 = this.f8079l + i7;
        this.f8079l = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        this.f8093z.b(view, view2, i6);
        this.f8079l = getActionBarHideOffset();
        l();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f8071d.getVisibility() != 0) {
            return false;
        }
        return this.f8077j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f8077j || this.f8078k) {
            return;
        }
        if (this.f8079l <= this.f8071d.getHeight()) {
            o();
        } else {
            n();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i6) {
        super.onWindowSystemUiVisibilityChanged(i6);
        p();
        this.f8080m = i6;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f8069b = i6;
    }

    public void p() {
        if (this.f8070c == null) {
            this.f8070c = (ContentFrameLayout) findViewById(AbstractC1472e.f15407b);
            this.f8071d = (ActionBarContainer) findViewById(AbstractC1472e.f15408c);
            this.f8072e = k(findViewById(AbstractC1472e.f15406a));
        }
    }

    public final void q() {
        l();
        this.f8091x.run();
    }

    public final boolean r(float f6, float f7) {
        this.f8088u.fling(0, 0, 0, (int) f7, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        return this.f8088u.getFinalY() > this.f8071d.getHeight();
    }

    public void setActionBarHideOffset(int i6) {
        l();
        this.f8071d.setTranslationY(-Math.max(0, Math.min(i6, this.f8071d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f8076i = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f8077j) {
            this.f8077j = z6;
            if (z6) {
                return;
            }
            l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        p();
        this.f8072e.setIcon(i6);
    }

    public void setLogo(int i6) {
        p();
        this.f8072e.b(i6);
    }

    public void setOverlayMode(boolean z6) {
        this.f8075h = z6;
        this.f8074g = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i6) {
    }

    public void setWindowCallback(Window.Callback callback) {
        p();
        this.f8072e.c(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        p();
        this.f8072e.a(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        p();
        this.f8072e.setIcon(drawable);
    }
}
