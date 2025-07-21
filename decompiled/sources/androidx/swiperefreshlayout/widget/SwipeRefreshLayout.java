package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.NonNull;
import n0.AbstractC1809a;
import z0.AbstractC2393D;
import z0.C2433s;
import z0.C2436v;
import z0.InterfaceC2434t;
import z0.InterfaceC2435u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC2435u, InterfaceC2434t {

    /* renamed from: a0, reason: collision with root package name */
    public static final String f10120a0 = "SwipeRefreshLayout";

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f10121b0 = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    public int f10122A;

    /* renamed from: B, reason: collision with root package name */
    public int f10123B;

    /* renamed from: C, reason: collision with root package name */
    public F2.b f10124C;

    /* renamed from: D, reason: collision with root package name */
    public Animation f10125D;

    /* renamed from: E, reason: collision with root package name */
    public Animation f10126E;

    /* renamed from: F, reason: collision with root package name */
    public Animation f10127F;

    /* renamed from: G, reason: collision with root package name */
    public Animation f10128G;

    /* renamed from: H, reason: collision with root package name */
    public Animation f10129H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f10130I;

    /* renamed from: J, reason: collision with root package name */
    public int f10131J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10132K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10133L;

    /* renamed from: M, reason: collision with root package name */
    public Animation.AnimationListener f10134M;

    /* renamed from: V, reason: collision with root package name */
    public final Animation f10135V;

    /* renamed from: W, reason: collision with root package name */
    public final Animation f10136W;

    /* renamed from: a, reason: collision with root package name */
    public View f10137a;

    /* renamed from: b, reason: collision with root package name */
    public j f10138b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10139c;

    /* renamed from: d, reason: collision with root package name */
    public int f10140d;

    /* renamed from: e, reason: collision with root package name */
    public float f10141e;

    /* renamed from: f, reason: collision with root package name */
    public float f10142f;

    /* renamed from: g, reason: collision with root package name */
    public final C2436v f10143g;

    /* renamed from: h, reason: collision with root package name */
    public final C2433s f10144h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f10145i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f10146j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f10147k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10148l;

    /* renamed from: m, reason: collision with root package name */
    public int f10149m;

    /* renamed from: n, reason: collision with root package name */
    public int f10150n;

    /* renamed from: o, reason: collision with root package name */
    public float f10151o;

    /* renamed from: p, reason: collision with root package name */
    public float f10152p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10153q;

    /* renamed from: r, reason: collision with root package name */
    public int f10154r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10155s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10156t;

    /* renamed from: u, reason: collision with root package name */
    public final DecelerateInterpolator f10157u;

    /* renamed from: v, reason: collision with root package name */
    public F2.a f10158v;

    /* renamed from: w, reason: collision with root package name */
    public int f10159w;

    /* renamed from: x, reason: collision with root package name */
    public int f10160x;

    /* renamed from: y, reason: collision with root package name */
    public float f10161y;

    /* renamed from: z, reason: collision with root package name */
    public int f10162z;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f10139c) {
                swipeRefreshLayout.r();
                return;
            }
            swipeRefreshLayout.f10124C.setAlpha(255);
            SwipeRefreshLayout.this.f10124C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f10130I && (jVar = swipeRefreshLayout2.f10138b) != null) {
                jVar.onRefresh();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f10150n = swipeRefreshLayout3.f10158v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends Animation {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10166a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10167b;

        public d(int i6, int i7) {
            this.f10166a = i6;
            this.f10167b = i7;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout.this.f10124C.setAlpha((int) (this.f10166a + ((this.f10167b - r0) * f6)));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f10155s) {
                return;
            }
            swipeRefreshLayout.x(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f10132K ? swipeRefreshLayout.f10122A - Math.abs(swipeRefreshLayout.f10162z) : swipeRefreshLayout.f10122A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f10160x + ((int) ((abs - r1) * f6))) - swipeRefreshLayout2.f10158v.getTop());
            SwipeRefreshLayout.this.f10124C.e(1.0f - f6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout.this.p(f6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f6, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f7 = swipeRefreshLayout.f10161y;
            swipeRefreshLayout.setAnimationProgress(f7 + ((-f7) * f6));
            SwipeRefreshLayout.this.p(f6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface i {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface j {
        void onRefresh();
    }

    public SwipeRefreshLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10139c = false;
        this.f10141e = -1.0f;
        this.f10145i = new int[2];
        this.f10146j = new int[2];
        this.f10147k = new int[2];
        this.f10154r = -1;
        this.f10159w = -1;
        this.f10134M = new a();
        this.f10135V = new f();
        this.f10136W = new g();
        this.f10140d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f10149m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f10157u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f10131J = (int) (displayMetrics.density * 40.0f);
        j();
        setChildrenDrawingOrderEnabled(true);
        int i6 = (int) (displayMetrics.density * 64.0f);
        this.f10122A = i6;
        this.f10141e = i6;
        this.f10143g = new C2436v(this);
        this.f10144h = new C2433s(this);
        setNestedScrollingEnabled(true);
        int i7 = -this.f10131J;
        this.f10150n = i7;
        this.f10162z = i7;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10121b0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10154r) {
            this.f10154r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i6) {
        this.f10158v.getBackground().setAlpha(i6);
        this.f10124C.setAlpha(i6);
    }

    @Override // z0.InterfaceC2435u
    public void a(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i10 != 0) {
            return;
        }
        int i11 = iArr[1];
        k(i6, i7, i8, i9, this.f10146j, i10, iArr);
        int i12 = i9 - (iArr[1] - i11);
        if ((i12 == 0 ? i9 + this.f10146j[1] : i12) >= 0 || i()) {
            return;
        }
        float abs = this.f10142f + Math.abs(r14);
        this.f10142f = abs;
        o(abs);
        iArr[1] = iArr[1] + i12;
    }

    @Override // z0.InterfaceC2434t
    public void b(View view, int i6, int i7, int i8, int i9, int i10) {
        a(view, i6, i7, i8, i9, i10, this.f10147k);
    }

    @Override // z0.InterfaceC2434t
    public boolean c(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            return onStartNestedScroll(view, view2, i6);
        }
        return false;
    }

    @Override // z0.InterfaceC2434t
    public void d(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return this.f10144h.a(f6, f7, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f10144h.b(f6, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.f10144h.c(i6, i7, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f10144h.f(i6, i7, i8, i9, iArr);
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

    public final void g(int i6, Animation.AnimationListener animationListener) {
        this.f10160x = i6;
        this.f10135V.reset();
        this.f10135V.setDuration(200L);
        this.f10135V.setInterpolator(this.f10157u);
        if (animationListener != null) {
            this.f10158v.b(animationListener);
        }
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(this.f10135V);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i6, int i7) {
        int i8 = this.f10159w;
        return i8 < 0 ? i7 : i7 == i6 + (-1) ? i8 : i7 >= i8 ? i7 + 1 : i7;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10143g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f10131J;
    }

    public int getProgressViewEndOffset() {
        return this.f10122A;
    }

    public int getProgressViewStartOffset() {
        return this.f10162z;
    }

    public final void h(int i6, Animation.AnimationListener animationListener) {
        if (this.f10155s) {
            y(i6, animationListener);
            return;
        }
        this.f10160x = i6;
        this.f10136W.reset();
        this.f10136W.setDuration(200L);
        this.f10136W.setInterpolator(this.f10157u);
        if (animationListener != null) {
            this.f10158v.b(animationListener);
        }
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(this.f10136W);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f10144h.j();
    }

    public boolean i() {
        View view = this.f10137a;
        return view instanceof ListView ? C0.f.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f10144h.l();
    }

    public final void j() {
        this.f10158v = new F2.a(getContext());
        F2.b bVar = new F2.b(getContext());
        this.f10124C = bVar;
        bVar.l(1);
        this.f10158v.setImageDrawable(this.f10124C);
        this.f10158v.setVisibility(8);
        addView(this.f10158v);
    }

    public void k(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        if (i10 == 0) {
            this.f10144h.e(i6, i7, i8, i9, iArr, i10, iArr2);
        }
    }

    public final void l() {
        if (this.f10137a == null) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.equals(this.f10158v)) {
                    this.f10137a = childAt;
                    return;
                }
            }
        }
    }

    public final void m(float f6) {
        if (f6 > this.f10141e) {
            s(true, true);
            return;
        }
        this.f10139c = false;
        this.f10124C.j(0.0f, 0.0f);
        h(this.f10150n, !this.f10155s ? new e() : null);
        this.f10124C.d(false);
    }

    public final boolean n(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void o(float f6) {
        this.f10124C.d(true);
        float min = Math.min(1.0f, Math.abs(f6 / this.f10141e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f6) - this.f10141e;
        int i6 = this.f10123B;
        if (i6 <= 0) {
            i6 = this.f10132K ? this.f10122A - this.f10162z : this.f10122A;
        }
        float f7 = i6;
        double max2 = Math.max(0.0f, Math.min(abs, f7 * 2.0f) / f7) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i7 = this.f10162z + ((int) ((f7 * min) + (f7 * pow * 2.0f)));
        if (this.f10158v.getVisibility() != 0) {
            this.f10158v.setVisibility(0);
        }
        if (!this.f10155s) {
            this.f10158v.setScaleX(1.0f);
            this.f10158v.setScaleY(1.0f);
        }
        if (this.f10155s) {
            setAnimationProgress(Math.min(1.0f, f6 / this.f10141e));
        }
        if (f6 < this.f10141e) {
            if (this.f10124C.getAlpha() > 76 && !n(this.f10127F)) {
                w();
            }
        } else if (this.f10124C.getAlpha() < 255 && !n(this.f10128G)) {
            v();
        }
        this.f10124C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f10124C.e(Math.min(1.0f, max));
        this.f10124C.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i7 - this.f10150n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10156t && actionMasked == 0) {
            this.f10156t = false;
        }
        if (!isEnabled() || this.f10156t || i() || this.f10139c || this.f10148l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i6 = this.f10154r;
                    if (i6 == -1) {
                        Log.e(f10120a0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i6);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f10153q = false;
            this.f10154r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f10162z - this.f10158v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f10154r = pointerId;
            this.f10153q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f10152p = motionEvent.getY(findPointerIndex2);
        }
        return this.f10153q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f10137a == null) {
            l();
        }
        View view = this.f10137a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f10158v.getMeasuredWidth();
        int measuredHeight2 = this.f10158v.getMeasuredHeight();
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        int i12 = this.f10150n;
        this.f10158v.layout(i10 - i11, i12, i10 + i11, measuredHeight2 + i12);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f10137a == null) {
            l();
        }
        View view = this.f10137a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f10158v.measure(View.MeasureSpec.makeMeasureSpec(this.f10131J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f10131J, 1073741824));
        this.f10159w = -1;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == this.f10158v) {
                this.f10159w = i8;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        return dispatchNestedFling(f6, f7, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        if (i7 > 0) {
            float f6 = this.f10142f;
            if (f6 > 0.0f) {
                float f7 = i7;
                if (f7 > f6) {
                    iArr[1] = (int) f6;
                    this.f10142f = 0.0f;
                } else {
                    this.f10142f = f6 - f7;
                    iArr[1] = i7;
                }
                o(this.f10142f);
            }
        }
        if (this.f10132K && i7 > 0 && this.f10142f == 0.0f && Math.abs(i7 - iArr[1]) > 0) {
            this.f10158v.setVisibility(8);
        }
        int[] iArr2 = this.f10145i;
        if (dispatchNestedPreScroll(i6 - iArr[0], i7 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        a(view, i6, i7, i8, i9, 0, this.f10147k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        this.f10143g.b(view, view2, i6);
        startNestedScroll(i6 & 2);
        this.f10142f = 0.0f;
        this.f10148l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f10173a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f10139c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        return (!isEnabled() || this.f10156t || this.f10139c || (i6 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f10143g.d(view);
        this.f10148l = false;
        float f6 = this.f10142f;
        if (f6 > 0.0f) {
            m(f6);
            this.f10142f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10156t && actionMasked == 0) {
            this.f10156t = false;
        }
        if (!isEnabled() || this.f10156t || i() || this.f10139c || this.f10148l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f10154r = motionEvent.getPointerId(0);
            this.f10153q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f10154r);
                if (findPointerIndex < 0) {
                    Log.e(f10120a0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f10153q) {
                    float y6 = (motionEvent.getY(findPointerIndex) - this.f10151o) * 0.5f;
                    this.f10153q = false;
                    m(y6);
                }
                this.f10154r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f10154r);
                if (findPointerIndex2 < 0) {
                    Log.e(f10120a0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y7 = motionEvent.getY(findPointerIndex2);
                u(y7);
                if (this.f10153q) {
                    float f6 = (y7 - this.f10151o) * 0.5f;
                    if (f6 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    o(f6);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f10120a0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f10154r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    public void p(float f6) {
        setTargetOffsetTopAndBottom((this.f10160x + ((int) ((this.f10162z - r0) * f6))) - this.f10158v.getTop());
    }

    public void r() {
        this.f10158v.clearAnimation();
        this.f10124C.stop();
        this.f10158v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f10155s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f10162z - this.f10150n);
        }
        this.f10150n = this.f10158v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        ViewParent parent;
        View view = this.f10137a;
        if (view == null || AbstractC2393D.B(view)) {
            super.requestDisallowInterceptTouchEvent(z6);
        } else {
            if (this.f10133L || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z6);
        }
    }

    public final void s(boolean z6, boolean z7) {
        if (this.f10139c != z6) {
            this.f10130I = z7;
            l();
            this.f10139c = z6;
            if (z6) {
                g(this.f10150n, this.f10134M);
            } else {
                x(this.f10134M);
            }
        }
    }

    public void setAnimationProgress(float f6) {
        this.f10158v.setScaleX(f6);
        this.f10158v.setScaleY(f6);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        l();
        this.f10124C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr2[i6] = AbstractC1809a.getColor(context, iArr[i6]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i6) {
        this.f10141e = i6;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (z6) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z6) {
        this.f10133L = z6;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f10144h.m(z6);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f10138b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i6) {
        setProgressBackgroundColorSchemeResource(i6);
    }

    public void setProgressBackgroundColorSchemeColor(int i6) {
        this.f10158v.setBackgroundColor(i6);
    }

    public void setProgressBackgroundColorSchemeResource(int i6) {
        setProgressBackgroundColorSchemeColor(AbstractC1809a.getColor(getContext(), i6));
    }

    public void setRefreshing(boolean z6) {
        if (!z6 || this.f10139c == z6) {
            s(z6, false);
            return;
        }
        this.f10139c = z6;
        setTargetOffsetTopAndBottom((!this.f10132K ? this.f10122A + this.f10162z : this.f10122A) - this.f10150n);
        this.f10130I = false;
        z(this.f10134M);
    }

    public void setSize(int i6) {
        if (i6 == 0 || i6 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i6 == 0) {
                this.f10131J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f10131J = (int) (displayMetrics.density * 40.0f);
            }
            this.f10158v.setImageDrawable(null);
            this.f10124C.l(i6);
            this.f10158v.setImageDrawable(this.f10124C);
        }
    }

    public void setSlingshotDistance(int i6) {
        this.f10123B = i6;
    }

    public void setTargetOffsetTopAndBottom(int i6) {
        this.f10158v.bringToFront();
        AbstractC2393D.E(this.f10158v, i6);
        this.f10150n = this.f10158v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return this.f10144h.o(i6);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f10144h.q();
    }

    public final Animation t(int i6, int i7) {
        d dVar = new d(i6, i7);
        dVar.setDuration(300L);
        this.f10158v.b(null);
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(dVar);
        return dVar;
    }

    public final void u(float f6) {
        float f7 = this.f10152p;
        float f8 = f6 - f7;
        int i6 = this.f10140d;
        if (f8 <= i6 || this.f10153q) {
            return;
        }
        this.f10151o = f7 + i6;
        this.f10153q = true;
        this.f10124C.setAlpha(76);
    }

    public final void v() {
        this.f10128G = t(this.f10124C.getAlpha(), 255);
    }

    public final void w() {
        this.f10127F = t(this.f10124C.getAlpha(), 76);
    }

    public void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f10126E = cVar;
        cVar.setDuration(150L);
        this.f10158v.b(animationListener);
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(this.f10126E);
    }

    public final void y(int i6, Animation.AnimationListener animationListener) {
        this.f10160x = i6;
        this.f10161y = this.f10158v.getScaleX();
        h hVar = new h();
        this.f10129H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f10158v.b(animationListener);
        }
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(this.f10129H);
    }

    public final void z(Animation.AnimationListener animationListener) {
        this.f10158v.setVisibility(0);
        this.f10124C.setAlpha(255);
        b bVar = new b();
        this.f10125D = bVar;
        bVar.setDuration(this.f10149m);
        if (animationListener != null) {
            this.f10158v.b(animationListener);
        }
        this.f10158v.clearAnimation();
        this.f10158v.startAnimation(this.f10125D);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10173a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i6) {
                return new k[i6];
            }
        }

        public k(Parcelable parcelable, boolean z6) {
            super(parcelable);
            this.f10173a = z6;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f10173a ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.f10173a = parcel.readByte() != 0;
        }
    }
}
