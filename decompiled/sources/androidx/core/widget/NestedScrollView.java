package androidx.core.widget;

import A0.s;
import A0.u;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import m0.AbstractC1787a;
import v0.C2159a;
import z0.AbstractC2393D;
import z0.AbstractC2432r;
import z0.C2415a;
import z0.C2419e;
import z0.C2433s;
import z0.C2436v;
import z0.InterfaceC2420f;
import z0.InterfaceC2435u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2435u {

    /* renamed from: C, reason: collision with root package name */
    public static final float f8596C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D, reason: collision with root package name */
    public static final a f8597D = new a();

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f8598E = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final d f8599A;

    /* renamed from: B, reason: collision with root package name */
    public C2419e f8600B;

    /* renamed from: a, reason: collision with root package name */
    public final float f8601a;

    /* renamed from: b, reason: collision with root package name */
    public long f8602b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8603c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f8604d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f8605e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f8606f;

    /* renamed from: g, reason: collision with root package name */
    public int f8607g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8608h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8609i;

    /* renamed from: j, reason: collision with root package name */
    public View f8610j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8611k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f8612l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8613m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8614n;

    /* renamed from: o, reason: collision with root package name */
    public int f8615o;

    /* renamed from: p, reason: collision with root package name */
    public int f8616p;

    /* renamed from: q, reason: collision with root package name */
    public int f8617q;

    /* renamed from: r, reason: collision with root package name */
    public int f8618r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f8619s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f8620t;

    /* renamed from: u, reason: collision with root package name */
    public int f8621u;

    /* renamed from: v, reason: collision with root package name */
    public int f8622v;

    /* renamed from: w, reason: collision with root package name */
    public f f8623w;

    /* renamed from: x, reason: collision with root package name */
    public final C2436v f8624x;

    /* renamed from: y, reason: collision with root package name */
    public final C2433s f8625y;

    /* renamed from: z, reason: collision with root package name */
    public float f8626z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C2415a {
        @Override // z0.C2415a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            u.a(accessibilityEvent, nestedScrollView.getScrollX());
            u.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // z0.C2415a
        public void g(View view, s sVar) {
            int scrollRange;
            super.g(view, sVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            sVar.Q(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            sVar.W(true);
            if (nestedScrollView.getScrollY() > 0) {
                sVar.b(s.a.f64q);
                sVar.b(s.a.f31B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                sVar.b(s.a.f63p);
                sVar.b(s.a.f33D);
            }
        }

        @Override // z0.C2415a
        public boolean j(View view, int i6, Bundle bundle) {
            if (super.j(view, i6, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i6 != 4096) {
                if (i6 == 8192 || i6 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                }
                if (i6 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public static void a(View view, float f6) {
            try {
                view.setFrameContentVelocity(f6);
            } catch (LinkageError unused) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements InterfaceC2420f {
        public d() {
        }

        @Override // z0.InterfaceC2420f
        public boolean a(float f6) {
            if (f6 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f6);
            return true;
        }

        @Override // z0.InterfaceC2420f
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // z0.InterfaceC2420f
        public void c() {
            NestedScrollView.this.f8604d.abortAnimation();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f8628a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i6) {
                return new f[i6];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f8628a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f8628a);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f8628a = parcel.readInt();
        }
    }

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1787a.f17141c);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int l(int i6, int i7, int i8) {
        if (i7 >= i8 || i6 < 0) {
            return 0;
        }
        return i7 + i6 > i8 ? i8 - i7 : i6;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.f8612l;
        if (velocityTracker == null) {
            this.f8612l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.f8604d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8615o = viewConfiguration.getScaledTouchSlop();
        this.f8616p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8617q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.f8612l == null) {
            this.f8612l = VelocityTracker.obtain();
        }
    }

    public final void D(int i6, int i7) {
        this.f8607g = i6;
        this.f8618r = i7;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i6, int i7) {
        view.getDrawingRect(this.f8603c);
        offsetDescendantRectToMyCoords(view, this.f8603c);
        return this.f8603c.bottom + i6 >= getScrollY() && this.f8603c.top - i6 <= getScrollY() + i7;
    }

    public final void H(int i6, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f8625y.e(0, scrollY2, 0, i6 - scrollY2, null, i7, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8618r) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f8607g = (int) motionEvent.getY(i6);
            this.f8618r = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.f8612l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z6) {
        boolean z7;
        boolean z8;
        int i14;
        int overScrollMode = getOverScrollMode();
        boolean z9 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z10 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z9);
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        int i15 = i8 + i6;
        int i16 = !z11 ? 0 : i12;
        int i17 = i9 + i7;
        int i18 = !z12 ? 0 : i13;
        int i19 = -i16;
        int i20 = i16 + i10;
        int i21 = -i18;
        int i22 = i18 + i11;
        if (i15 > i20) {
            i15 = i20;
            z7 = true;
        } else if (i15 < i19) {
            z7 = true;
            i15 = i19;
        } else {
            z7 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z8 = true;
        } else if (i17 < i21) {
            z8 = true;
            i17 = i21;
        } else {
            z8 = false;
        }
        if (!z8 || y(1)) {
            i14 = i15;
        } else {
            int i23 = i15;
            this.f8604d.springBack(i23, i17, 0, 0, 0, getScrollRange());
            i14 = i23;
        }
        onOverScrolled(i14, i17, z7, z8);
        return z7 || z8;
    }

    public boolean K(int i6) {
        boolean z6 = i6 == 130;
        int height = getHeight();
        if (z6) {
            this.f8603c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f8603c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f8603c.top = getScrollY() - height;
            Rect rect2 = this.f8603c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f8603c;
        int i7 = rect3.top;
        int i8 = height + i7;
        rect3.bottom = i8;
        return O(i6, i7, i8);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f8612l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8612l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f8605e
            float r0 = C0.c.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f8605e
            float r4 = -r4
            float r4 = C0.c.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f8605e
            float r5 = C0.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f8605e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f8606f
            float r0 = C0.c.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f8606f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = C0.c.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f8606f
            float r5 = C0.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f8606f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z6) {
        if (z6) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f8622v = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i6, int i7, int i8) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        boolean z6 = false;
        boolean z7 = i6 == 33;
        View u6 = u(z7, i7, i8);
        if (u6 == null) {
            u6 = this;
        }
        if (i7 < scrollY || i8 > i9) {
            P(z7 ? i7 - scrollY : i8 - i9, 0, 1, true);
            z6 = true;
        }
        if (u6 != findFocus()) {
            u6.requestFocus(i6);
        }
        return z6;
    }

    public final int P(int i6, int i7, int i8, boolean z6) {
        int i9;
        int i10;
        VelocityTracker velocityTracker;
        if (i8 == 1) {
            X(2, i8);
        }
        boolean z7 = false;
        if (o(0, i6, this.f8620t, this.f8619s, i8)) {
            int i11 = i6 - this.f8620t[1];
            i10 = this.f8619s[1];
            i9 = i11;
        } else {
            i9 = i6;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z8 = j() && !z6;
        int i12 = i9;
        boolean z9 = J(0, i9, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i8);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f8620t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i12 - scrollY2, this.f8619s, i8, iArr);
        int i13 = i10 + this.f8619s[1];
        int i14 = i12 - this.f8620t[1];
        int i15 = scrollY + i14;
        if (i15 < 0) {
            if (z8) {
                C0.c.d(this.f8605e, (-i14) / getHeight(), i7 / getWidth());
                if (!this.f8606f.isFinished()) {
                    this.f8606f.onRelease();
                }
            }
        } else if (i15 > scrollRange && z8) {
            C0.c.d(this.f8606f, i14 / getHeight(), 1.0f - (i7 / getWidth()));
            if (!this.f8605e.isFinished()) {
                this.f8605e.onRelease();
            }
        }
        if (this.f8605e.isFinished() && this.f8606f.isFinished()) {
            z7 = z9;
        } else {
            postInvalidateOnAnimation();
        }
        if (z7 && i8 == 0 && (velocityTracker = this.f8612l) != null) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
            Z(i8);
            this.f8605e.onRelease();
            this.f8606f.onRelease();
        }
        return i13;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f8603c);
        offsetDescendantRectToMyCoords(view, this.f8603c);
        int m6 = m(this.f8603c);
        if (m6 != 0) {
            scrollBy(0, m6);
        }
    }

    public final boolean R(Rect rect, boolean z6) {
        int m6 = m(rect);
        boolean z7 = m6 != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, m6);
                return z7;
            }
            T(0, m6);
        }
        return z7;
    }

    public final boolean S(EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        return x(-i6) < C0.c.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i6, int i7) {
        U(i6, i7, 250, false);
    }

    public final void U(int i6, int i7, int i8, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f8602b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f8604d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY, i8);
            N(z6);
        } else {
            if (!this.f8604d.isFinished()) {
                g();
            }
            scrollBy(i6, i7);
        }
        this.f8602b = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i6, int i7, int i8, boolean z6) {
        U(i6 - getScrollX(), i7 - getScrollY(), i8, z6);
    }

    public void W(int i6, int i7, boolean z6) {
        V(i6, i7, 250, z6);
    }

    public boolean X(int i6, int i7) {
        return this.f8625y.p(i6, i7);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z6;
        if (C0.c.b(this.f8605e) != 0.0f) {
            C0.c.d(this.f8605e, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        if (C0.c.b(this.f8606f) == 0.0f) {
            return z6;
        }
        C0.c.d(this.f8606f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i6) {
        this.f8625y.r(i6);
    }

    @Override // z0.InterfaceC2435u
    public void a(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        H(i9, i10, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // z0.InterfaceC2434t
    public void b(View view, int i6, int i7, int i8, int i9, int i10) {
        H(i9, i10, null);
    }

    @Override // z0.InterfaceC2434t
    public boolean c(View view, View view2, int i6, int i7) {
        return (i6 & 2) != 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i6;
        if (this.f8604d.isFinished()) {
            return;
        }
        this.f8604d.computeScrollOffset();
        int currY = this.f8604d.getCurrY();
        int n6 = n(currY - this.f8622v);
        this.f8622v = currY;
        int[] iArr = this.f8620t;
        iArr[1] = 0;
        o(0, n6, iArr, null, 1);
        int i7 = n6 - this.f8620t[1];
        int scrollRange = getScrollRange();
        if (C2159a.b()) {
            c.a(this, Math.abs(this.f8604d.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY = getScrollY();
            J(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i6 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f8620t;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i8, this.f8619s, 1, iArr2);
            i7 = i8 - this.f8620t[1];
        } else {
            i6 = scrollRange;
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i6 > 0)) {
                if (i7 < 0) {
                    if (this.f8605e.isFinished()) {
                        this.f8605e.onAbsorb((int) this.f8604d.getCurrVelocity());
                    }
                } else if (this.f8606f.isFinished()) {
                    this.f8606f.onAbsorb((int) this.f8604d.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f8604d.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // z0.InterfaceC2434t
    public void d(View view, View view2, int i6, int i7) {
        this.f8624x.c(view, view2, i6, i7);
        X(2, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return this.f8625y.a(f6, f7, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f8625y.b(f6, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return o(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f8625y.f(i6, i7, i8, i9, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i7 = 0;
        if (!this.f8605e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i6 = getPaddingLeft();
            } else {
                i6 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i6, min);
            this.f8605e.setSize(width, height);
            if (this.f8605e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f8606f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i7 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i7 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f8606f.setSize(width2, height2);
        if (this.f8606f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // z0.InterfaceC2434t
    public void e(View view, int i6) {
        this.f8624x.e(view, i6);
        Z(i6);
    }

    @Override // z0.InterfaceC2434t
    public void f(View view, int i6, int i7, int[] iArr, int i8) {
        o(i6, i7, iArr, null, i8);
    }

    public final void g() {
        this.f8604d.abortAnimation();
        Z(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8624x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f8626z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f8626z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f8626z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i6) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f8603c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f8603c);
            P(m(this.f8603c), 0, 1, true);
            findNextFocus.requestFocus(i6);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f8625y.l();
    }

    public final boolean j() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    public final boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int m(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i7, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i6, int i7) {
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public int n(int i6) {
        int height = getHeight();
        if (i6 > 0 && C0.c.b(this.f8605e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C0.c.d(this.f8605e, ((-i6) * 4.0f) / height, 0.5f));
            if (round != i6) {
                this.f8605e.finish();
            }
            return i6 - round;
        }
        if (i6 >= 0 || C0.c.b(this.f8606f) == 0.0f) {
            return i6;
        }
        float f6 = height;
        int round2 = Math.round((f6 / 4.0f) * C0.c.d(this.f8606f, (i6 * 4.0f) / f6, 0.5f));
        if (round2 != i6) {
            this.f8606f.finish();
        }
        return i6 - round2;
    }

    public boolean o(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return this.f8625y.d(i6, i7, iArr, iArr2, i8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8609i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i6;
        int i7;
        float f6;
        if (motionEvent.getAction() == 8 && !this.f8611k) {
            if (AbstractC2432r.a(motionEvent, 2)) {
                i6 = 9;
                f6 = motionEvent.getAxisValue(9);
                i7 = (int) motionEvent.getX();
            } else if (AbstractC2432r.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i7 = getWidth() / 2;
                i6 = 26;
                f6 = axisValue;
            } else {
                i6 = 0;
                i7 = 0;
                f6 = 0.0f;
            }
            if (f6 != 0.0f) {
                P(-((int) (f6 * getVerticalScrollFactorCompat())), i7, 1, AbstractC2432r.a(motionEvent, 8194));
                if (i6 != 0) {
                    this.f8600B.g(motionEvent, i6);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f8611k) {
            return true;
        }
        int i6 = action & 255;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = this.f8618r;
                    if (i7 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i7 + " in onInterceptTouchEvent");
                        } else {
                            int y6 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y6 - this.f8607g) > this.f8615o && (2 & getNestedScrollAxes()) == 0) {
                                this.f8611k = true;
                                this.f8607g = y6;
                                C();
                                this.f8612l.addMovement(motionEvent);
                                this.f8621u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f8611k = false;
            this.f8618r = -1;
            L();
            if (this.f8604d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y7 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y7)) {
                this.f8607g = y7;
                this.f8618r = motionEvent.getPointerId(0);
                A();
                this.f8612l.addMovement(motionEvent);
                this.f8604d.computeScrollOffset();
                if (!Y(motionEvent) && this.f8604d.isFinished()) {
                    z6 = false;
                }
                this.f8611k = z6;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f8604d.isFinished()) {
                    z6 = false;
                }
                this.f8611k = z6;
                L();
            }
        }
        return this.f8611k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        int i10 = 0;
        this.f8608h = false;
        View view = this.f8610j;
        if (view != null && F(view, this)) {
            Q(this.f8610j);
        }
        this.f8610j = null;
        if (!this.f8609i) {
            if (this.f8623w != null) {
                scrollTo(getScrollX(), this.f8623w.f8628a);
                this.f8623w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i10 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int l6 = l(scrollY, paddingTop, i10);
            if (l6 != scrollY) {
                scrollTo(getScrollX(), l6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f8609i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f8613m && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        v((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        f(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        H(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        d(view, view2, i6, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i6, int i7, boolean z6, boolean z7) {
        super.scrollTo(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i6) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i6);
        if (findNextFocus == null || E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i6, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f8623w = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f8628a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !G(findFocus, 0, i9)) {
            return;
        }
        findFocus.getDrawingRect(this.f8603c);
        offsetDescendantRectToMyCoords(findFocus, this.f8603c);
        q(m(this.f8603c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        return c(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8621u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f8621u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f8612l;
                velocityTracker.computeCurrentVelocity(1000, this.f8617q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f8618r);
                if (Math.abs(yVelocity) >= this.f8616p) {
                    if (!r(yVelocity)) {
                        int i6 = -yVelocity;
                        float f6 = i6;
                        if (!dispatchNestedPreFling(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            v(i6);
                        }
                    }
                } else if (this.f8604d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f8618r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f8618r + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(findPointerIndex);
                    int i7 = this.f8607g - y6;
                    int M5 = i7 - M(i7, motionEvent.getX(findPointerIndex));
                    if (!this.f8611k && Math.abs(M5) > this.f8615o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f8611k = true;
                        M5 = M5 > 0 ? M5 - this.f8615o : M5 + this.f8615o;
                    }
                    if (this.f8611k) {
                        int P5 = P(M5, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f8607g = y6 - P5;
                        this.f8621u += P5;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f8611k && getChildCount() > 0 && this.f8604d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f8607g = (int) motionEvent.getY(actionIndex);
                this.f8618r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f8607g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f8618r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f8611k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f8604d.isFinished()) {
                g();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f8612l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        this.f8625y.e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    public final void q(int i6) {
        if (i6 != 0) {
            if (this.f8614n) {
                T(0, i6);
            } else {
                scrollBy(0, i6);
            }
        }
    }

    public final boolean r(int i6) {
        if (C0.c.b(this.f8605e) != 0.0f) {
            if (S(this.f8605e, i6)) {
                this.f8605e.onAbsorb(i6);
                return true;
            }
            v(-i6);
            return true;
        }
        if (C0.c.b(this.f8606f) == 0.0f) {
            return false;
        }
        int i7 = -i6;
        if (S(this.f8606f, i7)) {
            this.f8606f.onAbsorb(i7);
            return true;
        }
        v(i7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f8608h) {
            this.f8610j = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (z6) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f8608h = true;
        super.requestLayout();
    }

    public final void s() {
        this.f8618r = -1;
        this.f8611k = false;
        L();
        Z(0);
        this.f8605e.onRelease();
        this.f8606f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int l6 = l(i6, width, width2);
            int l7 = l(i7, height, height2);
            if (l6 == getScrollX() && l7 == getScrollY()) {
                return;
            }
            super.scrollTo(l6, l7);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f8613m) {
            this.f8613m = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f8625y.m(z6);
    }

    public void setOnScrollChangeListener(e eVar) {
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f8614n = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return X(i6, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f8603c.setEmpty();
        if (!k()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : i(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : i(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    public final View u(boolean z6, int i6, int i7) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z8 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8) {
                            if (!z9) {
                            }
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z9) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void v(int i6) {
        if (getChildCount() > 0) {
            this.f8604d.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);
            N(true);
            if (C2159a.b()) {
                c.a(this, Math.abs(this.f8604d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i6) {
        int childCount;
        boolean z6 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f8603c;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f8603c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f8603c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f8603c;
        return O(i6, rect3.top, rect3.bottom);
    }

    public final float x(int i6) {
        double log = Math.log((Math.abs(i6) * 0.35f) / (this.f8601a * 0.015f));
        float f6 = f8596C;
        return (float) (this.f8601a * 0.015f * Math.exp((f6 / (f6 - 1.0d)) * log));
    }

    public boolean y(int i6) {
        return this.f8625y.k(i6);
    }

    public final boolean z(int i6, int i7) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i7 >= childAt.getTop() - scrollY && i7 < childAt.getBottom() - scrollY && i6 >= childAt.getLeft() && i6 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8603c = new Rect();
        this.f8608h = true;
        this.f8609i = false;
        this.f8610j = null;
        this.f8611k = false;
        this.f8614n = true;
        this.f8618r = -1;
        this.f8619s = new int[2];
        this.f8620t = new int[2];
        d dVar = new d();
        this.f8599A = dVar;
        this.f8600B = new C2419e(getContext(), dVar);
        this.f8605e = C0.c.a(context, attributeSet);
        this.f8606f = C0.c.a(context, attributeSet);
        this.f8601a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8598E, i6, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f8624x = new C2436v(this);
        this.f8625y = new C2433s(this);
        setNestedScrollingEnabled(true);
        AbstractC2393D.N(this, f8597D);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6) {
        if (getChildCount() <= 0) {
            super.addView(view, i6);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
