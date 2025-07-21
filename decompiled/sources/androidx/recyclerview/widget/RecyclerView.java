package androidx.recyclerview.widget;

import A0.s;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import t2.AbstractC2075a;
import t2.AbstractC2076b;
import z0.AbstractC2393D;
import z0.AbstractC2396G;
import z0.AbstractC2432r;
import z0.C2415a;
import z0.C2433s;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: I0, reason: collision with root package name */
    public static final int[] f9655I0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final boolean f9656J0 = false;

    /* renamed from: K0, reason: collision with root package name */
    public static final boolean f9657K0 = true;

    /* renamed from: L0, reason: collision with root package name */
    public static final boolean f9658L0 = true;

    /* renamed from: M0, reason: collision with root package name */
    public static final boolean f9659M0 = true;

    /* renamed from: N0, reason: collision with root package name */
    public static final boolean f9660N0 = false;

    /* renamed from: O0, reason: collision with root package name */
    public static final boolean f9661O0 = false;

    /* renamed from: P0, reason: collision with root package name */
    public static final Class[] f9662P0;

    /* renamed from: Q0, reason: collision with root package name */
    public static final Interpolator f9663Q0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f9664A;

    /* renamed from: A0, reason: collision with root package name */
    public final int[] f9665A0;

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f9666B;

    /* renamed from: B0, reason: collision with root package name */
    public final int[] f9667B0;

    /* renamed from: C, reason: collision with root package name */
    public List f9668C;

    /* renamed from: C0, reason: collision with root package name */
    public final List f9669C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9670D;

    /* renamed from: D0, reason: collision with root package name */
    public Runnable f9671D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9672E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f9673E0;

    /* renamed from: F, reason: collision with root package name */
    public int f9674F;

    /* renamed from: F0, reason: collision with root package name */
    public int f9675F0;

    /* renamed from: G, reason: collision with root package name */
    public int f9676G;

    /* renamed from: G0, reason: collision with root package name */
    public int f9677G0;

    /* renamed from: H, reason: collision with root package name */
    public l f9678H;

    /* renamed from: H0, reason: collision with root package name */
    public final p.b f9679H0;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f9680I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f9681J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f9682K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f9683L;

    /* renamed from: M, reason: collision with root package name */
    public m f9684M;

    /* renamed from: V, reason: collision with root package name */
    public int f9685V;

    /* renamed from: W, reason: collision with root package name */
    public int f9686W;

    /* renamed from: a, reason: collision with root package name */
    public final y f9687a;

    /* renamed from: a0, reason: collision with root package name */
    public VelocityTracker f9688a0;

    /* renamed from: b, reason: collision with root package name */
    public final w f9689b;

    /* renamed from: b0, reason: collision with root package name */
    public int f9690b0;

    /* renamed from: c, reason: collision with root package name */
    public z f9691c;

    /* renamed from: c0, reason: collision with root package name */
    public int f9692c0;

    /* renamed from: d, reason: collision with root package name */
    public a f9693d;

    /* renamed from: d0, reason: collision with root package name */
    public int f9694d0;

    /* renamed from: e, reason: collision with root package name */
    public c f9695e;

    /* renamed from: e0, reason: collision with root package name */
    public int f9696e0;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.p f9697f;

    /* renamed from: f0, reason: collision with root package name */
    public int f9698f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9699g;

    /* renamed from: g0, reason: collision with root package name */
    public final int f9700g0;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f9701h;

    /* renamed from: h0, reason: collision with root package name */
    public final int f9702h0;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f9703i;

    /* renamed from: i0, reason: collision with root package name */
    public float f9704i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f9705j;

    /* renamed from: j0, reason: collision with root package name */
    public float f9706j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f9707k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f9708k0;

    /* renamed from: l, reason: collision with root package name */
    public h f9709l;

    /* renamed from: l0, reason: collision with root package name */
    public final C f9710l0;

    /* renamed from: m, reason: collision with root package name */
    public p f9711m;

    /* renamed from: m0, reason: collision with root package name */
    public androidx.recyclerview.widget.g f9712m0;

    /* renamed from: n, reason: collision with root package name */
    public final List f9713n;

    /* renamed from: n0, reason: collision with root package name */
    public g.b f9714n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f9715o;

    /* renamed from: o0, reason: collision with root package name */
    public final A f9716o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9717p;

    /* renamed from: p0, reason: collision with root package name */
    public u f9718p0;

    /* renamed from: q, reason: collision with root package name */
    public t f9719q;

    /* renamed from: q0, reason: collision with root package name */
    public List f9720q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9721r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f9722r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9723s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f9724s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9725t;

    /* renamed from: t0, reason: collision with root package name */
    public m.b f9726t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9727u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f9728u0;

    /* renamed from: v, reason: collision with root package name */
    public int f9729v;

    /* renamed from: v0, reason: collision with root package name */
    public androidx.recyclerview.widget.l f9730v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9731w;

    /* renamed from: w0, reason: collision with root package name */
    public k f9732w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9733x;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f9734x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9735y;

    /* renamed from: y0, reason: collision with root package name */
    public C2433s f9736y0;

    /* renamed from: z, reason: collision with root package name */
    public int f9737z;

    /* renamed from: z0, reason: collision with root package name */
    public final int[] f9738z0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class A {

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f9740b;

        /* renamed from: m, reason: collision with root package name */
        public int f9751m;

        /* renamed from: n, reason: collision with root package name */
        public long f9752n;

        /* renamed from: o, reason: collision with root package name */
        public int f9753o;

        /* renamed from: p, reason: collision with root package name */
        public int f9754p;

        /* renamed from: q, reason: collision with root package name */
        public int f9755q;

        /* renamed from: a, reason: collision with root package name */
        public int f9739a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f9741c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f9742d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f9743e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f9744f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9745g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9746h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9747i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9748j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f9749k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f9750l = false;

        public void a(int i6) {
            if ((this.f9743e & i6) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f9743e));
        }

        public int b() {
            return this.f9746h ? this.f9741c - this.f9742d : this.f9744f;
        }

        public int c() {
            return this.f9739a;
        }

        public boolean d() {
            return this.f9739a != -1;
        }

        public boolean e() {
            return this.f9746h;
        }

        public void f(h hVar) {
            this.f9743e = 1;
            this.f9744f = hVar.getItemCount();
            this.f9746h = false;
            this.f9747i = false;
            this.f9748j = false;
        }

        public boolean g() {
            return this.f9750l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f9739a + ", mData=" + this.f9740b + ", mItemCount=" + this.f9744f + ", mIsMeasuring=" + this.f9748j + ", mPreviousLayoutItemCount=" + this.f9741c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9742d + ", mStructureChanged=" + this.f9745g + ", mInPreLayout=" + this.f9746h + ", mRunSimpleAnimations=" + this.f9749k + ", mRunPredictiveAnimations=" + this.f9750l + '}';
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class B {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f9756a;

        /* renamed from: b, reason: collision with root package name */
        public int f9757b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f9758c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f9759d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9760e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f9761f;

        public C() {
            Interpolator interpolator = RecyclerView.f9663Q0;
            this.f9759d = interpolator;
            this.f9760e = false;
            this.f9761f = false;
            this.f9758c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i6, int i7) {
            int abs = Math.abs(i6);
            int abs2 = Math.abs(i7);
            boolean z6 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z6) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i6, int i7) {
            RecyclerView.this.setScrollState(2);
            this.f9757b = 0;
            this.f9756a = 0;
            Interpolator interpolator = this.f9759d;
            Interpolator interpolator2 = RecyclerView.f9663Q0;
            if (interpolator != interpolator2) {
                this.f9759d = interpolator2;
                this.f9758c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f9758c.fling(0, 0, i6, i7, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC2393D.I(RecyclerView.this, this);
        }

        public void d() {
            if (this.f9760e) {
                this.f9761f = true;
            } else {
                c();
            }
        }

        public void e(int i6, int i7, int i8, Interpolator interpolator) {
            if (i8 == Integer.MIN_VALUE) {
                i8 = a(i6, i7);
            }
            int i9 = i8;
            if (interpolator == null) {
                interpolator = RecyclerView.f9663Q0;
            }
            if (this.f9759d != interpolator) {
                this.f9759d = interpolator;
                this.f9758c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f9757b = 0;
            this.f9756a = 0;
            RecyclerView.this.setScrollState(2);
            this.f9758c.startScroll(0, 0, i6, i7, i9);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f9758c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i6;
            int i7;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f9711m == null) {
                f();
                return;
            }
            this.f9761f = false;
            this.f9760e = true;
            recyclerView.u();
            OverScroller overScroller = this.f9758c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i8 = currX - this.f9756a;
                int i9 = currY - this.f9757b;
                this.f9756a = currX;
                this.f9757b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f9667B0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i8, i9, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f9667B0;
                    i8 -= iArr2[0];
                    i9 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i8, i9);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f9709l != null) {
                    int[] iArr3 = recyclerView3.f9667B0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.h1(i8, i9, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f9667B0;
                    int i10 = iArr4[0];
                    int i11 = iArr4[1];
                    i8 -= i10;
                    i9 -= i11;
                    recyclerView4.f9711m.getClass();
                    i7 = i11;
                    i6 = i10;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int i12 = i8;
                int i13 = i9;
                if (!RecyclerView.this.f9715o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f9667B0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i6, i7, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f9667B0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i6 != 0 || i7 != 0) {
                    recyclerView6.I(i6, i7);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                RecyclerView.this.f9711m.getClass();
                if (z6) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.f9659M0) {
                        RecyclerView.this.f9714n0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.g gVar = recyclerView7.f9712m0;
                    if (gVar != null) {
                        gVar.f(recyclerView7, i6, i7);
                    }
                }
            }
            RecyclerView.this.f9711m.getClass();
            this.f9760e = false;
            if (this.f9761f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.t1(1);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class D {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;

        @NonNull
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        D mShadowedHolder = null;
        D mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public D(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i6) {
            this.mFlags = i6 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && AbstractC2393D.x(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i6, int i7, boolean z6) {
            addFlags(8);
            offsetPosition(i7, z6);
            this.mPosition = i6;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int c02;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (c02 = this.mOwnerRecyclerView.c0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, c02);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i6 = this.mPreLayoutPosition;
            return i6 == -1 ? this.mPosition : i6;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i6) {
            return (i6 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !AbstractC2393D.x(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i6, boolean z6) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z6) {
                this.mPreLayoutPosition += i6;
            }
            this.mPosition += i6;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f9809c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i6 = this.mPendingAccessibilityState;
            if (i6 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i6;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = AbstractC2393D.n(this.itemView);
            }
            recyclerView.k1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.k1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.r(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i6, int i7) {
            this.mFlags = (i6 & i7) | (this.mFlags & (~i7));
        }

        public final void setIsRecyclable(boolean z6) {
            int i6 = this.mIsRecyclableCount;
            int i7 = z6 ? i6 - 1 : i6 + 1;
            this.mIsRecyclableCount = i7;
            if (i7 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z6 && i7 == 1) {
                this.mFlags |= 16;
            } else if (z6 && i7 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(w wVar, boolean z6) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z6;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC1068a implements Runnable {
        public RunnableC1068a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f9727u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f9721r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f9733x) {
                recyclerView2.f9731w = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class RunnableC1069b implements Runnable {
        public RunnableC1069b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f9684M;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.f9728u0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class InterpolatorC1070c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C1071d implements p.b {
        public C1071d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(D d6) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f9711m.k1(d6.itemView, recyclerView.f9689b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(D d6, m.c cVar, m.c cVar2) {
            RecyclerView.this.l(d6, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(D d6, m.c cVar, m.c cVar2) {
            RecyclerView.this.f9689b.J(d6);
            RecyclerView.this.n(d6, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(D d6, m.c cVar, m.c cVar2) {
            d6.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f9670D) {
                if (recyclerView.f9684M.b(d6, d6, cVar, cVar2)) {
                    RecyclerView.this.M0();
                }
            } else if (recyclerView.f9684M.d(d6, cVar, cVar2)) {
                RecyclerView.this.M0();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements c.b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.c.b
        public View a(int i6) {
            return RecyclerView.this.getChildAt(i6);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void b(View view) {
            D g02 = RecyclerView.g0(view);
            if (g02 != null) {
                g02.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.c.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.c.b
        public void d() {
            int c6 = c();
            for (int i6 = 0; i6 < c6; i6++) {
                View a6 = a(i6);
                RecyclerView.this.z(a6);
                a6.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.c.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public D f(View view) {
            return RecyclerView.g0(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void g(int i6) {
            D g02;
            View a6 = a(i6);
            if (a6 != null && (g02 = RecyclerView.g0(a6)) != null) {
                if (g02.isTmpDetached() && !g02.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + g02 + RecyclerView.this.P());
                }
                g02.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i6);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void h(View view) {
            D g02 = RecyclerView.g0(view);
            if (g02 != null) {
                g02.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.c.b
        public void i(View view, int i6) {
            RecyclerView.this.addView(view, i6);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void j(int i6) {
            View childAt = RecyclerView.this.getChildAt(i6);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i6);
        }

        @Override // androidx.recyclerview.widget.c.b
        public void k(View view, int i6, ViewGroup.LayoutParams layoutParams) {
            D g02 = RecyclerView.g0(view);
            if (g02 != null) {
                if (!g02.isTmpDetached() && !g02.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g02 + RecyclerView.this.P());
                }
                g02.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i6, layoutParams);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements a.InterfaceC0146a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void a(int i6, int i7) {
            RecyclerView.this.C0(i6, i7);
            RecyclerView.this.f9722r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void c(int i6, int i7, Object obj) {
            RecyclerView.this.w1(i6, i7, obj);
            RecyclerView.this.f9724s0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public D e(int i6) {
            D a02 = RecyclerView.this.a0(i6, true);
            if (a02 == null || RecyclerView.this.f9695e.n(a02.itemView)) {
                return null;
            }
            return a02;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void f(int i6, int i7) {
            RecyclerView.this.D0(i6, i7, false);
            RecyclerView.this.f9722r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void g(int i6, int i7) {
            RecyclerView.this.B0(i6, i7);
            RecyclerView.this.f9722r0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0146a
        public void h(int i6, int i7) {
            RecyclerView.this.D0(i6, i7, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f9722r0 = true;
            recyclerView.f9716o0.f9742d += i7;
        }

        public void i(a.b bVar) {
            int i6 = bVar.f9891a;
            if (i6 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f9711m.Q0(recyclerView, bVar.f9892b, bVar.f9894d);
                return;
            }
            if (i6 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f9711m.T0(recyclerView2, bVar.f9892b, bVar.f9894d);
            } else if (i6 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f9711m.V0(recyclerView3, bVar.f9892b, bVar.f9894d, bVar.f9893c);
            } else {
                if (i6 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f9711m.S0(recyclerView4, bVar.f9892b, bVar.f9894d, 1);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9768a;

        static {
            int[] iArr = new int[h.a.values().length];
            f9768a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9768a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@NonNull D d6, int i6) {
            boolean z6 = d6.mBindingAdapter == null;
            if (z6) {
                d6.mPosition = i6;
                if (hasStableIds()) {
                    d6.mItemId = getItemId(i6);
                }
                d6.setFlags(1, 519);
                v0.p.a("RV OnBindView");
            }
            d6.mBindingAdapter = this;
            onBindViewHolder(d6, i6, d6.getUnmodifiedPayloads());
            if (z6) {
                d6.clearPayload();
                ViewGroup.LayoutParams layoutParams = d6.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f9809c = true;
                }
                v0.p.b();
            }
        }

        public boolean canRestoreState() {
            int i6 = g.f9768a[this.mStateRestorationPolicy.ordinal()];
            return i6 != 1 && (i6 != 2 || getItemCount() > 0);
        }

        @NonNull
        public final D createViewHolder(@NonNull ViewGroup viewGroup, int i6) {
            try {
                v0.p.a("RV CreateView");
                D onCreateViewHolder = onCreateViewHolder(viewGroup, i6);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i6;
                return onCreateViewHolder;
            } finally {
                v0.p.b();
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull h hVar, @NonNull D d6, int i6) {
            if (hVar == this) {
                return i6;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i6) {
            return -1L;
        }

        public int getItemViewType(int i6) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyItemChanged(int i6) {
            this.mObservable.c(i6, 1);
        }

        public final void notifyItemMoved(int i6, int i7) {
            this.mObservable.b(i6, i7);
        }

        public final void notifyItemRangeChanged(int i6, int i7) {
            this.mObservable.c(i6, i7);
        }

        public final void notifyItemRangeInserted(int i6, int i7) {
            this.mObservable.e(i6, i7);
        }

        public final void notifyItemRangeRemoved(int i6, int i7) {
            this.mObservable.f(i6, i7);
        }

        public final void notifyItemRemoved(int i6) {
            this.mObservable.f(i6, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(D d6, int i6);

        public void onBindViewHolder(@NonNull D d6, int i6, @NonNull List<Object> list) {
            onBindViewHolder(d6, i6);
        }

        public abstract D onCreateViewHolder(ViewGroup viewGroup, int i6);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull D d6) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull D d6) {
        }

        public void onViewDetachedFromWindow(@NonNull D d6) {
        }

        public void onViewRecycled(@NonNull D d6) {
        }

        public void registerAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z6) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z6;
        }

        public void unregisterAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemRangeChanged(int i6, int i7, Object obj) {
            this.mObservable.d(i6, i7, obj);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b(int i6, int i7) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i6, i7, 1);
            }
        }

        public void c(int i6, int i7) {
            d(i6, i7, null);
        }

        public void d(int i6, int i7, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a(i6, i7, obj);
            }
        }

        public void e(int i6, int i7) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i6, i7);
            }
        }

        public void f(int i6, int i7) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i6, i7);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class j {
        public abstract void a(int i6, int i7, Object obj);

        public abstract void b(int i6, int i7);

        public abstract void c(int i6, int i7, int i8);

        public abstract void d(int i6, int i7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface k {
        int a(int i6, int i7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i6) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public b f9773a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f9774b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f9775c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f9776d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f9777e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f9778f = 250;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface b {
            void a(D d6);
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f9779a;

            /* renamed from: b, reason: collision with root package name */
            public int f9780b;

            /* renamed from: c, reason: collision with root package name */
            public int f9781c;

            /* renamed from: d, reason: collision with root package name */
            public int f9782d;

            public c a(D d6) {
                return b(d6, 0);
            }

            public c b(D d6, int i6) {
                View view = d6.itemView;
                this.f9779a = view.getLeft();
                this.f9780b = view.getTop();
                this.f9781c = view.getRight();
                this.f9782d = view.getBottom();
                return this;
            }
        }

        public static int e(D d6) {
            int i6 = d6.mFlags;
            int i7 = i6 & 14;
            if (d6.isInvalid()) {
                return 4;
            }
            if ((i6 & 4) == 0) {
                int oldPosition = d6.getOldPosition();
                int absoluteAdapterPosition = d6.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i7 | 2048;
                }
            }
            return i7;
        }

        public abstract boolean a(D d6, c cVar, c cVar2);

        public abstract boolean b(D d6, D d7, c cVar, c cVar2);

        public abstract boolean c(D d6, c cVar, c cVar2);

        public abstract boolean d(D d6, c cVar, c cVar2);

        public abstract boolean f(D d6);

        public boolean g(D d6, List list) {
            return f(d6);
        }

        public final void h(D d6) {
            s(d6);
            b bVar = this.f9773a;
            if (bVar != null) {
                bVar.a(d6);
            }
        }

        public final void i() {
            if (this.f9774b.size() <= 0) {
                this.f9774b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f9774b.get(0));
                throw null;
            }
        }

        public abstract void j(D d6);

        public abstract void k();

        public long l() {
            return this.f9775c;
        }

        public long m() {
            return this.f9778f;
        }

        public long n() {
            return this.f9777e;
        }

        public long o() {
            return this.f9776d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p6 = p();
            if (aVar != null) {
                if (!p6) {
                    aVar.a();
                    return p6;
                }
                this.f9774b.add(aVar);
            }
            return p6;
        }

        public c r() {
            return new c();
        }

        public void s(D d6) {
        }

        public c t(A a6, D d6) {
            return r().a(d6);
        }

        public c u(A a6, D d6, int i6, List list) {
            return r().a(d6);
        }

        public abstract void v();

        public void w(b bVar) {
            this.f9773a = bVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(D d6) {
            d6.setIsRecyclable(true);
            if (d6.mShadowedHolder != null && d6.mShadowingHolder == null) {
                d6.mShadowedHolder = null;
            }
            d6.mShadowingHolder = null;
            if (d6.shouldBeKeptAsChild() || RecyclerView.this.V0(d6.itemView) || !d6.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d6.itemView, false);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i6, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, A a6) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a6) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a6) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.c f9784a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f9785b;

        /* renamed from: c, reason: collision with root package name */
        public final o.b f9786c;

        /* renamed from: d, reason: collision with root package name */
        public final o.b f9787d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.o f9788e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.o f9789f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9790g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9791h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9792i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9793j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f9794k;

        /* renamed from: l, reason: collision with root package name */
        public int f9795l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f9796m;

        /* renamed from: n, reason: collision with root package name */
        public int f9797n;

        /* renamed from: o, reason: collision with root package name */
        public int f9798o;

        /* renamed from: p, reason: collision with root package name */
        public int f9799p;

        /* renamed from: q, reason: collision with root package name */
        public int f9800q;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i6) {
                return p.this.I(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.n0() - p.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i6) {
                return p.this.I(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.U(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.W() - p.this.c0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.O(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public interface c {
            void a(int i6, int i7);
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f9803a;

            /* renamed from: b, reason: collision with root package name */
            public int f9804b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f9805c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f9806d;
        }

        public p() {
            a aVar = new a();
            this.f9786c = aVar;
            b bVar = new b();
            this.f9787d = bVar;
            this.f9788e = new androidx.recyclerview.widget.o(aVar);
            this.f9789f = new androidx.recyclerview.widget.o(bVar);
            this.f9790g = false;
            this.f9791h = false;
            this.f9792i = false;
            this.f9793j = true;
            this.f9794k = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.K(int, int, int, int, boolean):int");
        }

        public static d h0(Context context, AttributeSet attributeSet, int i6, int i7) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2.d.f19058f, i6, i7);
            dVar.f9803a = obtainStyledAttributes.getInt(t2.d.f19059g, 1);
            dVar.f9804b = obtainStyledAttributes.getInt(t2.d.f19069q, 1);
            dVar.f9805c = obtainStyledAttributes.getBoolean(t2.d.f19068p, false);
            dVar.f9806d = obtainStyledAttributes.getBoolean(t2.d.f19070r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
        }

        public static boolean v0(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (i8 > 0 && i6 != i8) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i6;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i6;
            }
            return true;
        }

        public void A(RecyclerView recyclerView, w wVar) {
            this.f9791h = false;
            H0(recyclerView, wVar);
        }

        public void A0(int i6, int i7) {
            View I6 = I(i6);
            if (I6 != null) {
                x(i6);
                h(I6, i7);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i6 + this.f9785b.toString());
            }
        }

        public void A1(Rect rect, int i6, int i7) {
            z1(n(i6, rect.width() + d0() + e0(), b0()), n(i7, rect.height() + f0() + c0(), a0()));
        }

        public View B(View view) {
            View S5;
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView == null || (S5 = recyclerView.S(view)) == null || this.f9784a.n(S5)) {
                return null;
            }
            return S5;
        }

        public void B0(int i6) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                recyclerView.z0(i6);
            }
        }

        public void B1(int i6, int i7) {
            int J6 = J();
            if (J6 == 0) {
                this.f9785b.w(i6, i7);
                return;
            }
            int i8 = IntCompanionObject.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < J6; i12++) {
                View I6 = I(i12);
                Rect rect = this.f9785b.f9703i;
                P(I6, rect);
                int i13 = rect.left;
                if (i13 < i11) {
                    i11 = i13;
                }
                int i14 = rect.right;
                if (i14 > i8) {
                    i8 = i14;
                }
                int i15 = rect.top;
                if (i15 < i9) {
                    i9 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i10) {
                    i10 = i16;
                }
            }
            this.f9785b.f9703i.set(i11, i9, i8, i10);
            A1(this.f9785b.f9703i, i6, i7);
        }

        public View C(int i6) {
            int J6 = J();
            for (int i7 = 0; i7 < J6; i7++) {
                View I6 = I(i7);
                D g02 = RecyclerView.g0(I6);
                if (g02 != null && g02.getLayoutPosition() == i6 && !g02.shouldIgnore() && (this.f9785b.f9716o0.e() || !g02.isRemoved())) {
                    return I6;
                }
            }
            return null;
        }

        public void C0(int i6) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                recyclerView.A0(i6);
            }
        }

        public void C1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f9785b = null;
                this.f9784a = null;
                this.f9799p = 0;
                this.f9800q = 0;
            } else {
                this.f9785b = recyclerView;
                this.f9784a = recyclerView.f9695e;
                this.f9799p = recyclerView.getWidth();
                this.f9800q = recyclerView.getHeight();
            }
            this.f9797n = 1073741824;
            this.f9798o = 1073741824;
        }

        public abstract q D();

        public void D0(h hVar, h hVar2) {
        }

        public boolean D1(View view, int i6, int i7, q qVar) {
            return (!view.isLayoutRequested() && this.f9793j && v0(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) qVar).width) && v0(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean E0(RecyclerView recyclerView, ArrayList arrayList, int i6, int i7) {
            return false;
        }

        public boolean E1() {
            return false;
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void F0(RecyclerView recyclerView) {
        }

        public boolean F1(View view, int i6, int i7, q qVar) {
            return (this.f9793j && v0(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) qVar).width) && v0(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        public void G1() {
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).f9808b.bottom;
        }

        public void H0(RecyclerView recyclerView, w wVar) {
            G0(recyclerView);
        }

        public abstract boolean H1();

        public View I(int i6) {
            androidx.recyclerview.widget.c cVar = this.f9784a;
            if (cVar != null) {
                return cVar.f(i6);
            }
            return null;
        }

        public abstract View I0(View view, int i6, w wVar, A a6);

        public int J() {
            androidx.recyclerview.widget.c cVar = this.f9784a;
            if (cVar != null) {
                return cVar.g();
            }
            return 0;
        }

        public void J0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f9785b;
            K0(recyclerView.f9689b, recyclerView.f9716o0, accessibilityEvent);
        }

        public void K0(w wVar, A a6, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f9785b.canScrollVertically(-1) && !this.f9785b.canScrollHorizontally(-1) && !this.f9785b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            h hVar = this.f9785b.f9709l;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public final int[] L(View view, Rect rect) {
            int d02 = d0();
            int f02 = f0();
            int n02 = n0() - e0();
            int W5 = W() - c0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i6 = left - d02;
            int min = Math.min(0, i6);
            int i7 = top - f02;
            int min2 = Math.min(0, i7);
            int i8 = width - n02;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, height - W5);
            if (Y() != 1) {
                if (min == 0) {
                    min = Math.min(i6, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i8);
            }
            if (min2 == 0) {
                min2 = Math.min(i7, max2);
            }
            return new int[]{max, min2};
        }

        public void L0(A0.s sVar) {
            RecyclerView recyclerView = this.f9785b;
            M0(recyclerView.f9689b, recyclerView.f9716o0, sVar);
        }

        public boolean M() {
            RecyclerView recyclerView = this.f9785b;
            return recyclerView != null && recyclerView.f9699g;
        }

        public void M0(w wVar, A a6, A0.s sVar) {
            if (this.f9785b.canScrollVertically(-1) || this.f9785b.canScrollHorizontally(-1)) {
                sVar.a(ConstantsKt.DEFAULT_BUFFER_SIZE);
                sVar.W(true);
            }
            if (this.f9785b.canScrollVertically(1) || this.f9785b.canScrollHorizontally(1)) {
                sVar.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
                sVar.W(true);
            }
            sVar.R(s.e.a(j0(wVar, a6), N(wVar, a6), u0(wVar, a6), k0(wVar, a6)));
        }

        public int N(w wVar, A a6) {
            return -1;
        }

        public void N0(View view, A0.s sVar) {
            D g02 = RecyclerView.g0(view);
            if (g02 == null || g02.isRemoved() || this.f9784a.n(g02.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f9785b;
            O0(recyclerView.f9689b, recyclerView.f9716o0, view, sVar);
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(w wVar, A a6, View view, A0.s sVar) {
        }

        public void P(View view, Rect rect) {
            RecyclerView.h0(view, rect);
        }

        public View P0(View view, int i6) {
            return null;
        }

        public int Q(View view) {
            return view.getLeft() - Z(view);
        }

        public void Q0(RecyclerView recyclerView, int i6, int i7) {
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).f9808b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView) {
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f9808b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView, int i6, int i7, int i8) {
        }

        public int T(View view) {
            return view.getRight() + i0(view);
        }

        public void T0(RecyclerView recyclerView, int i6, int i7) {
        }

        public int U(View view) {
            return view.getTop() - l0(view);
        }

        public void U0(RecyclerView recyclerView, int i6, int i7) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f9784a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i6, int i7, Object obj) {
            U0(recyclerView, i6, i7);
        }

        public int W() {
            return this.f9800q;
        }

        public abstract void W0(w wVar, A a6);

        public int X() {
            return this.f9798o;
        }

        public void X0(A a6) {
        }

        public int Y() {
            return AbstractC2393D.p(this.f9785b);
        }

        public void Y0(w wVar, A a6, int i6, int i7) {
            this.f9785b.w(i6, i7);
        }

        public int Z(View view) {
            return ((q) view.getLayoutParams()).f9808b.left;
        }

        public boolean Z0(RecyclerView recyclerView, View view, View view2) {
            return w0() || recyclerView.u0();
        }

        public int a0() {
            return AbstractC2393D.q(this.f9785b);
        }

        public boolean a1(RecyclerView recyclerView, A a6, View view, View view2) {
            return Z0(recyclerView, view, view2);
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return AbstractC2393D.r(this.f9785b);
        }

        public abstract void b1(Parcelable parcelable);

        public void c(View view, int i6) {
            f(view, i6, true);
        }

        public int c0() {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable c1();

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void d1(int i6) {
        }

        public void e(View view, int i6) {
            f(view, i6, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean e1(int i6, Bundle bundle) {
            RecyclerView recyclerView = this.f9785b;
            return f1(recyclerView.f9689b, recyclerView.f9716o0, i6, bundle);
        }

        public final void f(View view, int i6, boolean z6) {
            D g02 = RecyclerView.g0(view);
            if (z6 || g02.isRemoved()) {
                this.f9785b.f9697f.b(g02);
            } else {
                this.f9785b.f9697f.p(g02);
            }
            q qVar = (q) view.getLayoutParams();
            if (g02.wasReturnedFromScrap() || g02.isScrap()) {
                if (g02.isScrap()) {
                    g02.unScrap();
                } else {
                    g02.clearReturnedFromScrapFlag();
                }
                this.f9784a.c(view, i6, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f9785b) {
                int m6 = this.f9784a.m(view);
                if (i6 == -1) {
                    i6 = this.f9784a.g();
                }
                if (m6 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f9785b.indexOfChild(view) + this.f9785b.P());
                }
                if (m6 != i6) {
                    this.f9785b.f9711m.A0(m6, i6);
                }
            } else {
                this.f9784a.a(view, i6, false);
                qVar.f9809c = true;
            }
            if (qVar.f9810d) {
                g02.itemView.invalidate();
                qVar.f9810d = false;
            }
        }

        public int f0() {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean f1(w wVar, A a6, int i6, Bundle bundle) {
            int W5;
            int n02;
            int i7;
            int i8;
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView == null) {
                return false;
            }
            if (i6 == 4096) {
                W5 = recyclerView.canScrollVertically(1) ? (W() - f0()) - c0() : 0;
                if (this.f9785b.canScrollHorizontally(1)) {
                    n02 = (n0() - d0()) - e0();
                    i7 = W5;
                    i8 = n02;
                }
                i7 = W5;
                i8 = 0;
            } else if (i6 != 8192) {
                i8 = 0;
                i7 = 0;
            } else {
                W5 = recyclerView.canScrollVertically(-1) ? -((W() - f0()) - c0()) : 0;
                if (this.f9785b.canScrollHorizontally(-1)) {
                    n02 = -((n0() - d0()) - e0());
                    i7 = W5;
                    i8 = n02;
                }
                i7 = W5;
                i8 = 0;
            }
            if (i7 == 0 && i8 == 0) {
                return false;
            }
            this.f9785b.p1(i8, i7, null, IntCompanionObject.MIN_VALUE, true);
            return true;
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean g1(View view, int i6, Bundle bundle) {
            RecyclerView recyclerView = this.f9785b;
            return h1(recyclerView.f9689b, recyclerView.f9716o0, view, i6, bundle);
        }

        public void h(View view, int i6) {
            i(view, i6, (q) view.getLayoutParams());
        }

        public boolean h1(w wVar, A a6, View view, int i6, Bundle bundle) {
            return false;
        }

        public void i(View view, int i6, q qVar) {
            D g02 = RecyclerView.g0(view);
            if (g02.isRemoved()) {
                this.f9785b.f9697f.b(g02);
            } else {
                this.f9785b.f9697f.p(g02);
            }
            this.f9784a.c(view, i6, qVar, g02.isRemoved());
        }

        public int i0(View view) {
            return ((q) view.getLayoutParams()).f9808b.right;
        }

        public void i1(w wVar) {
            for (int J6 = J() - 1; J6 >= 0; J6--) {
                if (!RecyclerView.g0(I(J6)).shouldIgnore()) {
                    l1(J6, wVar);
                }
            }
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.k0(view));
            }
        }

        public int j0(w wVar, A a6) {
            return -1;
        }

        public void j1(w wVar) {
            int j6 = wVar.j();
            for (int i6 = j6 - 1; i6 >= 0; i6--) {
                View n6 = wVar.n(i6);
                D g02 = RecyclerView.g0(n6);
                if (!g02.shouldIgnore()) {
                    g02.setIsRecyclable(false);
                    if (g02.isTmpDetached()) {
                        this.f9785b.removeDetachedView(n6, false);
                    }
                    m mVar = this.f9785b.f9684M;
                    if (mVar != null) {
                        mVar.j(g02);
                    }
                    g02.setIsRecyclable(true);
                    wVar.y(n6);
                }
            }
            wVar.e();
            if (j6 > 0) {
                this.f9785b.invalidate();
            }
        }

        public abstract boolean k();

        public int k0(w wVar, A a6) {
            return 0;
        }

        public void k1(View view, w wVar) {
            n1(view);
            wVar.B(view);
        }

        public abstract boolean l();

        public int l0(View view) {
            return ((q) view.getLayoutParams()).f9808b.top;
        }

        public void l1(int i6, w wVar) {
            View I6 = I(i6);
            o1(i6);
            wVar.B(I6);
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public void m0(View view, boolean z6, Rect rect) {
            Matrix matrix;
            if (z6) {
                Rect rect2 = ((q) view.getLayoutParams()).f9808b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f9785b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f9785b.f9707k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean m1(Runnable runnable) {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int n0() {
            return this.f9799p;
        }

        public void n1(View view) {
            this.f9784a.p(view);
        }

        public abstract void o(int i6, int i7, A a6, c cVar);

        public int o0() {
            return this.f9797n;
        }

        public void o1(int i6) {
            if (I(i6) != null) {
                this.f9784a.q(i6);
            }
        }

        public void p(int i6, c cVar) {
        }

        public boolean p0() {
            int J6 = J();
            for (int i6 = 0; i6 < J6; i6++) {
                ViewGroup.LayoutParams layoutParams = I(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean p1(RecyclerView recyclerView, View view, Rect rect, boolean z6) {
            return q1(recyclerView, view, rect, z6, false);
        }

        public abstract int q(A a6);

        public boolean q0() {
            return this.f9791h;
        }

        public boolean q1(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
            int[] L5 = L(view, rect);
            int i6 = L5[0];
            int i7 = L5[1];
            if ((z7 && !s0(recyclerView, i6, i7)) || (i6 == 0 && i7 == 0)) {
                return false;
            }
            if (z6) {
                recyclerView.scrollBy(i6, i7);
            } else {
                recyclerView.m1(i6, i7);
            }
            return true;
        }

        public abstract int r(A a6);

        public abstract boolean r0();

        public void r1() {
            RecyclerView recyclerView = this.f9785b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int s(A a6);

        public final boolean s0(RecyclerView recyclerView, int i6, int i7) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int d02 = d0();
            int f02 = f0();
            int n02 = n0() - e0();
            int W5 = W() - c0();
            Rect rect = this.f9785b.f9703i;
            P(focusedChild, rect);
            return rect.left - i6 < n02 && rect.right - i6 > d02 && rect.top - i7 < W5 && rect.bottom - i7 > f02;
        }

        public void s1() {
            this.f9790g = true;
        }

        public abstract int t(A a6);

        public final boolean t0() {
            return this.f9794k;
        }

        public final void t1(w wVar, int i6, View view) {
            D g02 = RecyclerView.g0(view);
            if (g02.shouldIgnore()) {
                return;
            }
            if (g02.isInvalid() && !g02.isRemoved() && !this.f9785b.f9709l.hasStableIds()) {
                o1(i6);
                wVar.C(g02);
            } else {
                x(i6);
                wVar.D(view);
                this.f9785b.f9697f.k(g02);
            }
        }

        public abstract int u(A a6);

        public boolean u0(w wVar, A a6) {
            return false;
        }

        public abstract int u1(int i6, w wVar, A a6);

        public abstract int v(A a6);

        public abstract void v1(int i6);

        public void w(w wVar) {
            for (int J6 = J() - 1; J6 >= 0; J6--) {
                t1(wVar, J6, I(J6));
            }
        }

        public boolean w0() {
            return false;
        }

        public abstract int w1(int i6, w wVar, A a6);

        public void x(int i6) {
            y(i6, I(i6));
        }

        public boolean x0(View view, boolean z6, boolean z7) {
            boolean z8 = this.f9788e.b(view, 24579) && this.f9789f.b(view, 24579);
            return z6 ? z8 : !z8;
        }

        public void x1(RecyclerView recyclerView) {
            y1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void y(int i6, View view) {
            this.f9784a.d(i6);
        }

        public void y0(View view, int i6, int i7, int i8, int i9) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f9808b;
            view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void y1(int i6, int i7) {
            this.f9799p = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            this.f9797n = mode;
            if (mode == 0 && !RecyclerView.f9657K0) {
                this.f9799p = 0;
            }
            this.f9800q = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f9798o = mode2;
            if (mode2 != 0 || RecyclerView.f9657K0) {
                return;
            }
            this.f9800q = 0;
        }

        public void z(RecyclerView recyclerView) {
            this.f9791h = true;
            F0(recyclerView);
        }

        public void z0(View view, int i6, int i7) {
            q qVar = (q) view.getLayoutParams();
            Rect k02 = this.f9785b.k0(view);
            int i8 = i6 + k02.left + k02.right;
            int i9 = i7 + k02.top + k02.bottom;
            int K5 = K(n0(), o0(), d0() + e0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i8, ((ViewGroup.MarginLayoutParams) qVar).width, k());
            int K6 = K(W(), X(), f0() + c0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) qVar).height, l());
            if (D1(view, K5, K6, qVar)) {
                view.measure(K5, K6);
            }
        }

        public void z1(int i6, int i7) {
            this.f9785b.setMeasuredDimension(i6, i7);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class s {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i6) {
        }

        public abstract void b(RecyclerView recyclerView, int i6, int i7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class v {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray f9811a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public int f9812b = 0;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f9813a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            public int f9814b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f9815c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f9816d = 0;
        }

        public void a() {
            this.f9812b++;
        }

        public void b() {
            for (int i6 = 0; i6 < this.f9811a.size(); i6++) {
                ((a) this.f9811a.valueAt(i6)).f9813a.clear();
            }
        }

        public void c() {
            this.f9812b--;
        }

        public void d(int i6, long j6) {
            a g6 = g(i6);
            g6.f9816d = j(g6.f9816d, j6);
        }

        public void e(int i6, long j6) {
            a g6 = g(i6);
            g6.f9815c = j(g6.f9815c, j6);
        }

        public D f(int i6) {
            a aVar = (a) this.f9811a.get(i6);
            if (aVar == null || aVar.f9813a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f9813a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((D) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (D) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i6) {
            a aVar = (a) this.f9811a.get(i6);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f9811a.put(i6, aVar2);
            return aVar2;
        }

        public void h(h hVar, h hVar2, boolean z6) {
            if (hVar != null) {
                c();
            }
            if (!z6 && this.f9812b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(D d6) {
            int itemViewType = d6.getItemViewType();
            ArrayList arrayList = g(itemViewType).f9813a;
            if (((a) this.f9811a.get(itemViewType)).f9814b <= arrayList.size()) {
                return;
            }
            d6.resetInternal();
            arrayList.add(d6);
        }

        public long j(long j6, long j7) {
            return j6 == 0 ? j7 : ((j6 / 4) * 3) + (j7 / 4);
        }

        public boolean k(int i6, long j6, long j7) {
            long j8 = g(i6).f9816d;
            return j8 == 0 || j6 + j8 < j7;
        }

        public boolean l(int i6, long j6, long j7) {
            long j8 = g(i6).f9815c;
            return j8 == 0 || j6 + j8 < j7;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class w {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f9817a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f9818b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f9819c;

        /* renamed from: d, reason: collision with root package name */
        public final List f9820d;

        /* renamed from: e, reason: collision with root package name */
        public int f9821e;

        /* renamed from: f, reason: collision with root package name */
        public int f9822f;

        /* renamed from: g, reason: collision with root package name */
        public v f9823g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f9817a = arrayList;
            this.f9818b = null;
            this.f9819c = new ArrayList();
            this.f9820d = Collections.unmodifiableList(arrayList);
            this.f9821e = 2;
            this.f9822f = 2;
        }

        public void A(int i6) {
            a((D) this.f9819c.get(i6), true);
            this.f9819c.remove(i6);
        }

        public void B(View view) {
            D g02 = RecyclerView.g0(view);
            if (g02.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g02.isScrap()) {
                g02.unScrap();
            } else if (g02.wasReturnedFromScrap()) {
                g02.clearReturnedFromScrapFlag();
            }
            C(g02);
            if (RecyclerView.this.f9684M == null || g02.isRecyclable()) {
                return;
            }
            RecyclerView.this.f9684M.j(g02);
        }

        public void C(D d6) {
            boolean z6;
            boolean z7 = true;
            if (d6.isScrap() || d6.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d6.isScrap());
                sb.append(" isAttached:");
                sb.append(d6.itemView.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d6.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d6 + RecyclerView.this.P());
            }
            if (d6.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean doesTransientStatePreventRecycling = d6.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f9709l;
            if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(d6)) || d6.isRecyclable()) {
                if (this.f9822f <= 0 || d6.hasAnyOfTheFlags(526)) {
                    z6 = false;
                } else {
                    int size = this.f9819c.size();
                    if (size >= this.f9822f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f9659M0 && size > 0 && !RecyclerView.this.f9714n0.d(d6.mPosition)) {
                        int i6 = size - 1;
                        while (i6 >= 0) {
                            if (!RecyclerView.this.f9714n0.d(((D) this.f9819c.get(i6)).mPosition)) {
                                break;
                            } else {
                                i6--;
                            }
                        }
                        size = i6 + 1;
                    }
                    this.f9819c.add(size, d6);
                    z6 = true;
                }
                if (z6) {
                    z7 = false;
                } else {
                    a(d6, true);
                }
                r1 = z6;
            } else {
                z7 = false;
            }
            RecyclerView.this.f9697f.q(d6);
            if (r1 || z7 || !doesTransientStatePreventRecycling) {
                return;
            }
            d6.mBindingAdapter = null;
            d6.mOwnerRecyclerView = null;
        }

        public void D(View view) {
            D g02 = RecyclerView.g0(view);
            if (!g02.hasAnyOfTheFlags(12) && g02.isUpdated() && !RecyclerView.this.p(g02)) {
                if (this.f9818b == null) {
                    this.f9818b = new ArrayList();
                }
                g02.setScrapContainer(this, true);
                this.f9818b.add(g02);
                return;
            }
            if (!g02.isInvalid() || g02.isRemoved() || RecyclerView.this.f9709l.hasStableIds()) {
                g02.setScrapContainer(this, false);
                this.f9817a.add(g02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        public void E(v vVar) {
            v vVar2 = this.f9823g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f9823g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f9823g.a();
        }

        public void F(B b6) {
        }

        public void G(int i6) {
            this.f9821e = i6;
            K();
        }

        public final boolean H(D d6, int i6, int i7, long j6) {
            d6.mBindingAdapter = null;
            d6.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d6.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j6 != LongCompanionObject.MAX_VALUE && !this.f9823g.k(itemViewType, nanoTime, j6)) {
                return false;
            }
            RecyclerView.this.f9709l.bindViewHolder(d6, i6);
            this.f9823g.d(d6.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d6);
            if (!RecyclerView.this.f9716o0.e()) {
                return true;
            }
            d6.mPreLayoutPosition = i7;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.D I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$D");
        }

        public void J(D d6) {
            if (d6.mInChangeScrap) {
                this.f9818b.remove(d6);
            } else {
                this.f9817a.remove(d6);
            }
            d6.mScrapContainer = null;
            d6.mInChangeScrap = false;
            d6.clearReturnedFromScrapFlag();
        }

        public void K() {
            p pVar = RecyclerView.this.f9711m;
            this.f9822f = this.f9821e + (pVar != null ? pVar.f9795l : 0);
            for (int size = this.f9819c.size() - 1; size >= 0 && this.f9819c.size() > this.f9822f; size--) {
                A(size);
            }
        }

        public boolean L(D d6) {
            if (d6.isRemoved()) {
                return RecyclerView.this.f9716o0.e();
            }
            int i6 = d6.mPosition;
            if (i6 >= 0 && i6 < RecyclerView.this.f9709l.getItemCount()) {
                if (RecyclerView.this.f9716o0.e() || RecyclerView.this.f9709l.getItemViewType(d6.mPosition) == d6.getItemViewType()) {
                    return !RecyclerView.this.f9709l.hasStableIds() || d6.getItemId() == RecyclerView.this.f9709l.getItemId(d6.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d6 + RecyclerView.this.P());
        }

        public void M(int i6, int i7) {
            int i8;
            int i9 = i7 + i6;
            for (int size = this.f9819c.size() - 1; size >= 0; size--) {
                D d6 = (D) this.f9819c.get(size);
                if (d6 != null && (i8 = d6.mPosition) >= i6 && i8 < i9) {
                    d6.addFlags(2);
                    A(size);
                }
            }
        }

        public void a(D d6, boolean z6) {
            RecyclerView.r(d6);
            View view = d6.itemView;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f9730v0;
            if (lVar != null) {
                C2415a n6 = lVar.n();
                AbstractC2393D.N(view, n6 instanceof l.a ? ((l.a) n6).n(view) : null);
            }
            if (z6) {
                g(d6);
            }
            d6.mBindingAdapter = null;
            d6.mOwnerRecyclerView = null;
            i().i(d6);
        }

        public final void b(D d6) {
            if (RecyclerView.this.t0()) {
                View view = d6.itemView;
                if (AbstractC2393D.n(view) == 0) {
                    AbstractC2393D.U(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f9730v0;
                if (lVar == null) {
                    return;
                }
                C2415a n6 = lVar.n();
                if (n6 instanceof l.a) {
                    ((l.a) n6).o(view);
                }
                AbstractC2393D.N(view, n6);
            }
        }

        public void c() {
            this.f9817a.clear();
            z();
        }

        public void d() {
            int size = this.f9819c.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((D) this.f9819c.get(i6)).clearOldPosition();
            }
            int size2 = this.f9817a.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((D) this.f9817a.get(i7)).clearOldPosition();
            }
            ArrayList arrayList = this.f9818b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    ((D) this.f9818b.get(i8)).clearOldPosition();
                }
            }
        }

        public void e() {
            this.f9817a.clear();
            ArrayList arrayList = this.f9818b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i6) {
            if (i6 >= 0 && i6 < RecyclerView.this.f9716o0.b()) {
                return !RecyclerView.this.f9716o0.e() ? i6 : RecyclerView.this.f9693d.m(i6);
            }
            throw new IndexOutOfBoundsException("invalid position " + i6 + ". State item count is " + RecyclerView.this.f9716o0.b() + RecyclerView.this.P());
        }

        public void g(D d6) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f9713n.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f9713n.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f9709l;
            if (hVar != null) {
                hVar.onViewRecycled(d6);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f9716o0 != null) {
                recyclerView.f9697f.q(d6);
            }
        }

        public D h(int i6) {
            int size;
            int m6;
            ArrayList arrayList = this.f9818b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i7 = 0; i7 < size; i7++) {
                    D d6 = (D) this.f9818b.get(i7);
                    if (!d6.wasReturnedFromScrap() && d6.getLayoutPosition() == i6) {
                        d6.addFlags(32);
                        return d6;
                    }
                }
                if (RecyclerView.this.f9709l.hasStableIds() && (m6 = RecyclerView.this.f9693d.m(i6)) > 0 && m6 < RecyclerView.this.f9709l.getItemCount()) {
                    long itemId = RecyclerView.this.f9709l.getItemId(m6);
                    for (int i8 = 0; i8 < size; i8++) {
                        D d7 = (D) this.f9818b.get(i8);
                        if (!d7.wasReturnedFromScrap() && d7.getItemId() == itemId) {
                            d7.addFlags(32);
                            return d7;
                        }
                    }
                }
            }
            return null;
        }

        public v i() {
            if (this.f9823g == null) {
                this.f9823g = new v();
            }
            return this.f9823g;
        }

        public int j() {
            return this.f9817a.size();
        }

        public List k() {
            return this.f9820d;
        }

        public D l(long j6, int i6, boolean z6) {
            for (int size = this.f9817a.size() - 1; size >= 0; size--) {
                D d6 = (D) this.f9817a.get(size);
                if (d6.getItemId() == j6 && !d6.wasReturnedFromScrap()) {
                    if (i6 == d6.getItemViewType()) {
                        d6.addFlags(32);
                        if (d6.isRemoved() && !RecyclerView.this.f9716o0.e()) {
                            d6.setFlags(2, 14);
                        }
                        return d6;
                    }
                    if (!z6) {
                        this.f9817a.remove(size);
                        RecyclerView.this.removeDetachedView(d6.itemView, false);
                        y(d6.itemView);
                    }
                }
            }
            int size2 = this.f9819c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d7 = (D) this.f9819c.get(size2);
                if (d7.getItemId() == j6 && !d7.isAttachedToTransitionOverlay()) {
                    if (i6 == d7.getItemViewType()) {
                        if (!z6) {
                            this.f9819c.remove(size2);
                        }
                        return d7;
                    }
                    if (!z6) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public D m(int i6, boolean z6) {
            View e6;
            int size = this.f9817a.size();
            for (int i7 = 0; i7 < size; i7++) {
                D d6 = (D) this.f9817a.get(i7);
                if (!d6.wasReturnedFromScrap() && d6.getLayoutPosition() == i6 && !d6.isInvalid() && (RecyclerView.this.f9716o0.f9746h || !d6.isRemoved())) {
                    d6.addFlags(32);
                    return d6;
                }
            }
            if (z6 || (e6 = RecyclerView.this.f9695e.e(i6)) == null) {
                int size2 = this.f9819c.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    D d7 = (D) this.f9819c.get(i8);
                    if (!d7.isInvalid() && d7.getLayoutPosition() == i6 && !d7.isAttachedToTransitionOverlay()) {
                        if (!z6) {
                            this.f9819c.remove(i8);
                        }
                        return d7;
                    }
                }
                return null;
            }
            D g02 = RecyclerView.g0(e6);
            RecyclerView.this.f9695e.s(e6);
            int m6 = RecyclerView.this.f9695e.m(e6);
            if (m6 != -1) {
                RecyclerView.this.f9695e.d(m6);
                D(e6);
                g02.addFlags(8224);
                return g02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g02 + RecyclerView.this.P());
        }

        public View n(int i6) {
            return ((D) this.f9817a.get(i6)).itemView;
        }

        public View o(int i6) {
            return p(i6, false);
        }

        public View p(int i6, boolean z6) {
            return I(i6, z6, LongCompanionObject.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z6) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z6) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(D d6) {
            View view = d6.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f9819c.size();
            for (int i6 = 0; i6 < size; i6++) {
                q qVar = (q) ((D) this.f9819c.get(i6)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f9809c = true;
                }
            }
        }

        public void t() {
            int size = this.f9819c.size();
            for (int i6 = 0; i6 < size; i6++) {
                D d6 = (D) this.f9819c.get(i6);
                if (d6 != null) {
                    d6.addFlags(6);
                    d6.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f9709l;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        public void u(int i6, int i7) {
            int size = this.f9819c.size();
            for (int i8 = 0; i8 < size; i8++) {
                D d6 = (D) this.f9819c.get(i8);
                if (d6 != null && d6.mPosition >= i6) {
                    d6.offsetPosition(i7, false);
                }
            }
        }

        public void v(int i6, int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            if (i6 < i7) {
                i8 = -1;
                i10 = i6;
                i9 = i7;
            } else {
                i8 = 1;
                i9 = i6;
                i10 = i7;
            }
            int size = this.f9819c.size();
            for (int i12 = 0; i12 < size; i12++) {
                D d6 = (D) this.f9819c.get(i12);
                if (d6 != null && (i11 = d6.mPosition) >= i10 && i11 <= i9) {
                    if (i11 == i6) {
                        d6.offsetPosition(i7 - i6, false);
                    } else {
                        d6.offsetPosition(i8, false);
                    }
                }
            }
        }

        public void w(int i6, int i7, boolean z6) {
            int i8 = i6 + i7;
            for (int size = this.f9819c.size() - 1; size >= 0; size--) {
                D d6 = (D) this.f9819c.get(size);
                if (d6 != null) {
                    int i9 = d6.mPosition;
                    if (i9 >= i8) {
                        d6.offsetPosition(-i7, z6);
                    } else if (i9 >= i6) {
                        d6.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z6) {
            c();
            i().h(hVar, hVar2, z6);
        }

        public void y(View view) {
            D g02 = RecyclerView.g0(view);
            g02.mScrapContainer = null;
            g02.mInChangeScrap = false;
            g02.clearReturnedFromScrapFlag();
            C(g02);
        }

        public void z() {
            for (int size = this.f9819c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f9819c.clear();
            if (RecyclerView.f9659M0) {
                RecyclerView.this.f9714n0.b();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface x {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class y extends j {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a(int i6, int i7, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f9693d.r(i6, i7, obj)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i6, int i7) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f9693d.s(i6, i7)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i6, int i7, int i8) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f9693d.t(i6, i7, i8)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i6, int i7) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f9693d.u(i6, i7)) {
                e();
            }
        }

        public void e() {
            if (RecyclerView.f9658L0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f9723s && recyclerView.f9721r) {
                    AbstractC2393D.I(recyclerView, recyclerView.f9701h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f9664A = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f9662P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f9663Q0 = new InterpolatorC1070c();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2075a.f19045a);
    }

    public static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView W5 = W(viewGroup.getChildAt(i6));
            if (W5 != null) {
                return W5;
            }
        }
        return null;
    }

    public static D g0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f9807a;
    }

    private C2433s getScrollingChildHelper() {
        if (this.f9736y0 == null) {
            this.f9736y0 = new C2433s(this);
        }
        return this.f9736y0;
    }

    public static void h0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f9808b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public static void r(D d6) {
        WeakReference<RecyclerView> weakReference = d6.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d6.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d6.mNestedRecyclerView = null;
        }
    }

    public final void A() {
        int i6 = this.f9737z;
        this.f9737z = 0;
        if (i6 == 0 || !t0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        A0.b.b(obtain, i6);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void A0(int i6) {
        int g6 = this.f9695e.g();
        for (int i7 = 0; i7 < g6; i7++) {
            this.f9695e.f(i7).offsetTopAndBottom(i6);
        }
    }

    public void B() {
        if (this.f9709l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f9711m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f9716o0.f9748j = false;
        boolean z6 = this.f9673E0 && !(this.f9675F0 == getWidth() && this.f9677G0 == getHeight());
        this.f9675F0 = 0;
        this.f9677G0 = 0;
        this.f9673E0 = false;
        if (this.f9716o0.f9743e == 1) {
            C();
            this.f9711m.x1(this);
            D();
        } else if (this.f9693d.q() || z6 || this.f9711m.n0() != getWidth() || this.f9711m.W() != getHeight()) {
            this.f9711m.x1(this);
            D();
        } else {
            this.f9711m.x1(this);
        }
        E();
    }

    public void B0(int i6, int i7) {
        int j6 = this.f9695e.j();
        for (int i8 = 0; i8 < j6; i8++) {
            D g02 = g0(this.f9695e.i(i8));
            if (g02 != null && !g02.shouldIgnore() && g02.mPosition >= i6) {
                g02.offsetPosition(i7, false);
                this.f9716o0.f9745g = true;
            }
        }
        this.f9689b.u(i6, i7);
        requestLayout();
    }

    public final void C() {
        this.f9716o0.a(1);
        Q(this.f9716o0);
        this.f9716o0.f9748j = false;
        q1();
        this.f9697f.f();
        G0();
        O0();
        e1();
        A a6 = this.f9716o0;
        a6.f9747i = a6.f9749k && this.f9724s0;
        this.f9724s0 = false;
        this.f9722r0 = false;
        a6.f9746h = a6.f9750l;
        a6.f9744f = this.f9709l.getItemCount();
        V(this.f9734x0);
        if (this.f9716o0.f9749k) {
            int g6 = this.f9695e.g();
            for (int i6 = 0; i6 < g6; i6++) {
                D g02 = g0(this.f9695e.f(i6));
                if (!g02.shouldIgnore() && (!g02.isInvalid() || this.f9709l.hasStableIds())) {
                    this.f9697f.e(g02, this.f9684M.u(this.f9716o0, g02, m.e(g02), g02.getUnmodifiedPayloads()));
                    if (this.f9716o0.f9747i && g02.isUpdated() && !g02.isRemoved() && !g02.shouldIgnore() && !g02.isInvalid()) {
                        this.f9697f.c(d0(g02), g02);
                    }
                }
            }
        }
        if (this.f9716o0.f9750l) {
            f1();
            A a7 = this.f9716o0;
            boolean z6 = a7.f9745g;
            a7.f9745g = false;
            this.f9711m.W0(this.f9689b, a7);
            this.f9716o0.f9745g = z6;
            for (int i7 = 0; i7 < this.f9695e.g(); i7++) {
                D g03 = g0(this.f9695e.f(i7));
                if (!g03.shouldIgnore() && !this.f9697f.i(g03)) {
                    int e6 = m.e(g03);
                    boolean hasAnyOfTheFlags = g03.hasAnyOfTheFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
                    if (!hasAnyOfTheFlags) {
                        e6 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    }
                    m.c u6 = this.f9684M.u(this.f9716o0, g03, e6, g03.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        R0(g03, u6);
                    } else {
                        this.f9697f.a(g03, u6);
                    }
                }
            }
            s();
        } else {
            s();
        }
        H0();
        s1(false);
        this.f9716o0.f9743e = 2;
    }

    public void C0(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int j6 = this.f9695e.j();
        if (i6 < i7) {
            i10 = -1;
            i9 = i6;
            i8 = i7;
        } else {
            i8 = i6;
            i9 = i7;
            i10 = 1;
        }
        for (int i12 = 0; i12 < j6; i12++) {
            D g02 = g0(this.f9695e.i(i12));
            if (g02 != null && (i11 = g02.mPosition) >= i9 && i11 <= i8) {
                if (i11 == i6) {
                    g02.offsetPosition(i7 - i6, false);
                } else {
                    g02.offsetPosition(i10, false);
                }
                this.f9716o0.f9745g = true;
            }
        }
        this.f9689b.v(i6, i7);
        requestLayout();
    }

    public final void D() {
        q1();
        G0();
        this.f9716o0.a(6);
        this.f9693d.j();
        this.f9716o0.f9744f = this.f9709l.getItemCount();
        this.f9716o0.f9742d = 0;
        if (this.f9691c != null && this.f9709l.canRestoreState()) {
            Parcelable parcelable = this.f9691c.f9826c;
            if (parcelable != null) {
                this.f9711m.b1(parcelable);
            }
            this.f9691c = null;
        }
        A a6 = this.f9716o0;
        a6.f9746h = false;
        this.f9711m.W0(this.f9689b, a6);
        A a7 = this.f9716o0;
        a7.f9745g = false;
        a7.f9749k = a7.f9749k && this.f9684M != null;
        a7.f9743e = 4;
        H0();
        s1(false);
    }

    public void D0(int i6, int i7, boolean z6) {
        int i8 = i6 + i7;
        int j6 = this.f9695e.j();
        for (int i9 = 0; i9 < j6; i9++) {
            D g02 = g0(this.f9695e.i(i9));
            if (g02 != null && !g02.shouldIgnore()) {
                int i10 = g02.mPosition;
                if (i10 >= i8) {
                    g02.offsetPosition(-i7, z6);
                    this.f9716o0.f9745g = true;
                } else if (i10 >= i6) {
                    g02.flagRemovedAndOffsetPosition(i6 - 1, -i7, z6);
                    this.f9716o0.f9745g = true;
                }
            }
        }
        this.f9689b.w(i6, i7, z6);
        requestLayout();
    }

    public final void E() {
        RecyclerView recyclerView;
        this.f9716o0.a(4);
        q1();
        G0();
        A a6 = this.f9716o0;
        a6.f9743e = 1;
        if (a6.f9749k) {
            for (int g6 = this.f9695e.g() - 1; g6 >= 0; g6--) {
                D g02 = g0(this.f9695e.f(g6));
                if (!g02.shouldIgnore()) {
                    long d02 = d0(g02);
                    m.c t6 = this.f9684M.t(this.f9716o0, g02);
                    D g7 = this.f9697f.g(d02);
                    if (g7 == null || g7.shouldIgnore()) {
                        this.f9697f.d(g02, t6);
                    } else {
                        boolean h6 = this.f9697f.h(g7);
                        boolean h7 = this.f9697f.h(g02);
                        if (h6 && g7 == g02) {
                            this.f9697f.d(g02, t6);
                        } else {
                            m.c n6 = this.f9697f.n(g7);
                            this.f9697f.d(g02, t6);
                            m.c m6 = this.f9697f.m(g02);
                            if (n6 == null) {
                                l0(d02, g02, g7);
                            } else {
                                m(g7, g02, n6, m6, h6, h7);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f9697f.o(recyclerView.f9679H0);
        } else {
            recyclerView = this;
        }
        recyclerView.f9711m.j1(recyclerView.f9689b);
        A a7 = recyclerView.f9716o0;
        a7.f9741c = a7.f9744f;
        recyclerView.f9670D = false;
        recyclerView.f9672E = false;
        a7.f9749k = false;
        a7.f9750l = false;
        recyclerView.f9711m.f9790g = false;
        ArrayList arrayList = recyclerView.f9689b.f9818b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f9711m;
        if (pVar.f9796m) {
            pVar.f9795l = 0;
            pVar.f9796m = false;
            recyclerView.f9689b.K();
        }
        recyclerView.f9711m.X0(recyclerView.f9716o0);
        H0();
        s1(false);
        recyclerView.f9697f.f();
        int[] iArr = recyclerView.f9734x0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        S0();
        c1();
    }

    public void E0(View view) {
    }

    public boolean F(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return getScrollingChildHelper().d(i6, i7, iArr, iArr2, i8);
    }

    public void F0(View view) {
    }

    public final void G(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    public void G0() {
        this.f9674F++;
    }

    public void H(int i6) {
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.d1(i6);
        }
        K0(i6);
        u uVar = this.f9718p0;
        if (uVar != null) {
            uVar.a(this, i6);
        }
        List list = this.f9720q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f9720q0.get(size)).a(this, i6);
            }
        }
    }

    public void H0() {
        I0(true);
    }

    public void I(int i6, int i7) {
        this.f9676G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i7);
        L0(i6, i7);
        u uVar = this.f9718p0;
        if (uVar != null) {
            uVar.b(this, i6, i7);
        }
        List list = this.f9720q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f9720q0.get(size)).b(this, i6, i7);
            }
        }
        this.f9676G--;
    }

    public void I0(boolean z6) {
        int i6 = this.f9674F - 1;
        this.f9674F = i6;
        if (i6 < 1) {
            this.f9674F = 0;
            if (z6) {
                A();
                J();
            }
        }
    }

    public void J() {
        int i6;
        for (int size = this.f9669C0.size() - 1; size >= 0; size--) {
            D d6 = (D) this.f9669C0.get(size);
            if (d6.itemView.getParent() == this && !d6.shouldIgnore() && (i6 = d6.mPendingAccessibilityState) != -1) {
                AbstractC2393D.U(d6.itemView, i6);
                d6.mPendingAccessibilityState = -1;
            }
        }
        this.f9669C0.clear();
    }

    public final void J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9686W) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f9686W = motionEvent.getPointerId(i6);
            int x6 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f9694d0 = x6;
            this.f9690b0 = x6;
            int y6 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f9696e0 = y6;
            this.f9692c0 = y6;
        }
    }

    public final boolean K(MotionEvent motionEvent) {
        t tVar = this.f9719q;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return U(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f9719q = null;
        }
        return true;
    }

    public void K0(int i6) {
    }

    public void L() {
        if (this.f9683L != null) {
            return;
        }
        EdgeEffect a6 = this.f9678H.a(this, 3);
        this.f9683L = a6;
        if (this.f9699g) {
            a6.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a6.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void L0(int i6, int i7) {
    }

    public void M() {
        if (this.f9680I != null) {
            return;
        }
        EdgeEffect a6 = this.f9678H.a(this, 0);
        this.f9680I = a6;
        if (this.f9699g) {
            a6.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a6.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void M0() {
        if (this.f9728u0 || !this.f9721r) {
            return;
        }
        AbstractC2393D.I(this, this.f9671D0);
        this.f9728u0 = true;
    }

    public void N() {
        if (this.f9682K != null) {
            return;
        }
        EdgeEffect a6 = this.f9678H.a(this, 2);
        this.f9682K = a6;
        if (this.f9699g) {
            a6.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a6.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final boolean N0() {
        return this.f9684M != null && this.f9711m.H1();
    }

    public void O() {
        if (this.f9681J != null) {
            return;
        }
        EdgeEffect a6 = this.f9678H.a(this, 1);
        this.f9681J = a6;
        if (this.f9699g) {
            a6.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a6.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void O0() {
        boolean z6;
        if (this.f9670D) {
            this.f9693d.y();
            if (this.f9672E) {
                this.f9711m.R0(this);
            }
        }
        if (N0()) {
            this.f9693d.w();
        } else {
            this.f9693d.j();
        }
        boolean z7 = this.f9722r0 || this.f9724s0;
        this.f9716o0.f9749k = this.f9727u && this.f9684M != null && ((z6 = this.f9670D) || z7 || this.f9711m.f9790g) && (!z6 || this.f9709l.hasStableIds());
        A a6 = this.f9716o0;
        a6.f9750l = a6.f9749k && z7 && !this.f9670D && N0();
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.f9709l + ", layout:" + this.f9711m + ", context:" + getContext();
    }

    public void P0(boolean z6) {
        this.f9672E = z6 | this.f9672E;
        this.f9670D = true;
        x0();
    }

    public final void Q(A a6) {
        if (getScrollState() != 2) {
            a6.f9754p = 0;
            a6.f9755q = 0;
        } else {
            OverScroller overScroller = this.f9710l0.f9758c;
            a6.f9754p = overScroller.getFinalX() - overScroller.getCurrX();
            a6.f9755q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r1 = r6.f9680I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            C0.c.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.N()
            android.widget.EdgeEffect r1 = r6.f9682K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            C0.c.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.O()
            android.widget.EdgeEffect r9 = r6.f9681J
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            C0.c.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.L()
            android.widget.EdgeEffect r9 = r6.f9683L
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            C0.c.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            z0.AbstractC2393D.H(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q0(float, float, float, float):void");
    }

    public View R(float f6, float f7) {
        for (int g6 = this.f9695e.g() - 1; g6 >= 0; g6--) {
            View f8 = this.f9695e.f(g6);
            float translationX = f8.getTranslationX();
            float translationY = f8.getTranslationY();
            if (f6 >= f8.getLeft() + translationX && f6 <= f8.getRight() + translationX && f7 >= f8.getTop() + translationY && f7 <= f8.getBottom() + translationY) {
                return f8;
            }
        }
        return null;
    }

    public void R0(D d6, m.c cVar) {
        d6.setFlags(0, ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (this.f9716o0.f9747i && d6.isUpdated() && !d6.isRemoved() && !d6.shouldIgnore()) {
            this.f9697f.c(d0(d6), d6);
        }
        this.f9697f.e(d6, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View S(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S(android.view.View):android.view.View");
    }

    public final void S0() {
        View findViewById;
        if (!this.f9708k0 || this.f9709l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f9661O0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f9695e.n(focusedChild)) {
                    return;
                }
            } else if (this.f9695e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        D Z5 = (this.f9716o0.f9752n == -1 || !this.f9709l.hasStableIds()) ? null : Z(this.f9716o0.f9752n);
        if (Z5 != null && !this.f9695e.n(Z5.itemView) && Z5.itemView.hasFocusable()) {
            view = Z5.itemView;
        } else if (this.f9695e.g() > 0) {
            view = X();
        }
        if (view != null) {
            int i6 = this.f9716o0.f9753o;
            if (i6 != -1 && (findViewById = view.findViewById(i6)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public D T(View view) {
        View S5 = S(view);
        if (S5 == null) {
            return null;
        }
        return f0(S5);
    }

    public final void T0() {
        boolean z6;
        EdgeEffect edgeEffect = this.f9680I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = this.f9680I.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f9681J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 |= this.f9681J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9682K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 |= this.f9682K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9683L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z6 |= this.f9683L.isFinished();
        }
        if (z6) {
            AbstractC2393D.H(this);
        }
    }

    public final boolean U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f9717p.size();
        for (int i6 = 0; i6 < size; i6++) {
            t tVar = (t) this.f9717p.get(i6);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.f9719q = tVar;
                return true;
            }
        }
        return false;
    }

    public void U0() {
        m mVar = this.f9684M;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.i1(this.f9689b);
            this.f9711m.j1(this.f9689b);
        }
        this.f9689b.c();
    }

    public final void V(int[] iArr) {
        int g6 = this.f9695e.g();
        if (g6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = IntCompanionObject.MAX_VALUE;
        int i7 = IntCompanionObject.MIN_VALUE;
        for (int i8 = 0; i8 < g6; i8++) {
            D g02 = g0(this.f9695e.f(i8));
            if (!g02.shouldIgnore()) {
                int layoutPosition = g02.getLayoutPosition();
                if (layoutPosition < i6) {
                    i6 = layoutPosition;
                }
                if (layoutPosition > i7) {
                    i7 = layoutPosition;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public boolean V0(View view) {
        q1();
        boolean r6 = this.f9695e.r(view);
        if (r6) {
            D g02 = g0(view);
            this.f9689b.J(g02);
            this.f9689b.C(g02);
        }
        s1(!r6);
        return r6;
    }

    public void W0(o oVar) {
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f9715o.remove(oVar);
        if (this.f9715o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public final View X() {
        D Y5;
        A a6 = this.f9716o0;
        int i6 = a6.f9751m;
        if (i6 == -1) {
            i6 = 0;
        }
        int b6 = a6.b();
        for (int i7 = i6; i7 < b6; i7++) {
            D Y6 = Y(i7);
            if (Y6 == null) {
                break;
            }
            if (Y6.itemView.hasFocusable()) {
                return Y6.itemView;
            }
        }
        int min = Math.min(b6, i6);
        do {
            min--;
            if (min < 0 || (Y5 = Y(min)) == null) {
                return null;
            }
        } while (!Y5.itemView.hasFocusable());
        return Y5.itemView;
    }

    public void X0(r rVar) {
        List list = this.f9668C;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public D Y(int i6) {
        D d6 = null;
        if (this.f9670D) {
            return null;
        }
        int j6 = this.f9695e.j();
        for (int i7 = 0; i7 < j6; i7++) {
            D g02 = g0(this.f9695e.i(i7));
            if (g02 != null && !g02.isRemoved() && c0(g02) == i6) {
                if (!this.f9695e.n(g02.itemView)) {
                    return g02;
                }
                d6 = g02;
            }
        }
        return d6;
    }

    public void Y0(t tVar) {
        this.f9717p.remove(tVar);
        if (this.f9719q == tVar) {
            this.f9719q = null;
        }
    }

    public D Z(long j6) {
        h hVar = this.f9709l;
        D d6 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j7 = this.f9695e.j();
            for (int i6 = 0; i6 < j7; i6++) {
                D g02 = g0(this.f9695e.i(i6));
                if (g02 != null && !g02.isRemoved() && g02.getItemId() == j6) {
                    if (!this.f9695e.n(g02.itemView)) {
                        return g02;
                    }
                    d6 = g02;
                }
            }
        }
        return d6;
    }

    public void Z0(u uVar) {
        List list = this.f9720q0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void a(int i6, int i7) {
        if (i6 < 0) {
            M();
            if (this.f9680I.isFinished()) {
                this.f9680I.onAbsorb(-i6);
            }
        } else if (i6 > 0) {
            N();
            if (this.f9682K.isFinished()) {
                this.f9682K.onAbsorb(i6);
            }
        }
        if (i7 < 0) {
            O();
            if (this.f9681J.isFinished()) {
                this.f9681J.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            L();
            if (this.f9683L.isFinished()) {
                this.f9683L.onAbsorb(i7);
            }
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        AbstractC2393D.H(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.D a0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.c r0 = r5.f9695e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.c r3 = r5.f9695e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$D r3 = g0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.c r1 = r5.f9695e
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0(int, boolean):androidx.recyclerview.widget.RecyclerView$D");
    }

    public void a1() {
        D d6;
        int g6 = this.f9695e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            View f6 = this.f9695e.f(i6);
            D f02 = f0(f6);
            if (f02 != null && (d6 = f02.mShadowingHolder) != null) {
                View view = d6.itemView;
                int left = f6.getLeft();
                int top = f6.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i6, int i7) {
        p pVar = this.f9711m;
        if (pVar == null || !pVar.E0(this, arrayList, i6, i7)) {
            super.addFocusables(arrayList, i6, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b0(int i6, int i7) {
        p pVar = this.f9711m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f9733x) {
            return false;
        }
        boolean k6 = pVar.k();
        boolean l6 = this.f9711m.l();
        if (k6 == 0 || Math.abs(i6) < this.f9700g0) {
            i6 = 0;
        }
        if (!l6 || Math.abs(i7) < this.f9700g0) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        float f6 = i6;
        float f7 = i7;
        if (!dispatchNestedPreFling(f6, f7)) {
            boolean z6 = k6 != 0 || l6;
            dispatchNestedFling(f6, f7, z6);
            int i8 = k6;
            if (z6) {
                if (l6) {
                    i8 = (k6 ? 1 : 0) | 2;
                }
                r1(i8, 1);
                int i9 = this.f9702h0;
                int max = Math.max(-i9, Math.min(i6, i9));
                int i10 = this.f9702h0;
                this.f9710l0.b(max, Math.max(-i10, Math.min(i7, i10)));
                return true;
            }
        }
        return false;
    }

    public final void b1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f9703i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f9809c) {
                Rect rect = qVar.f9808b;
                Rect rect2 = this.f9703i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f9703i);
            offsetRectIntoDescendantCoords(view, this.f9703i);
        }
        this.f9711m.q1(this, view, this.f9703i, !this.f9727u, view2 == null);
    }

    public int c0(D d6) {
        if (d6.hasAnyOfTheFlags(524) || !d6.isBound()) {
            return -1;
        }
        return this.f9693d.e(d6.mPosition);
    }

    public final void c1() {
        A a6 = this.f9716o0;
        a6.f9752n = -1L;
        a6.f9751m = -1;
        a6.f9753o = -1;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f9711m.m((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.k()) {
            return this.f9711m.q(this.f9716o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.k()) {
            return this.f9711m.r(this.f9716o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.k()) {
            return this.f9711m.s(this.f9716o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.l()) {
            return this.f9711m.t(this.f9716o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.l()) {
            return this.f9711m.u(this.f9716o0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.f9711m;
        if (pVar != null && pVar.l()) {
            return this.f9711m.v(this.f9716o0);
        }
        return 0;
    }

    public long d0(D d6) {
        return this.f9709l.hasStableIds() ? d6.getItemId() : d6.mPosition;
    }

    public final void d1() {
        VelocityTracker velocityTracker = this.f9688a0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return getScrollingChildHelper().a(f6, f7, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().f(i6, i7, i8, i9, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        int size = this.f9715o.size();
        boolean z7 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ((o) this.f9715o.get(i6)).onDrawOver(canvas, this, this.f9716o0);
        }
        EdgeEffect edgeEffect = this.f9680I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f9699g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f9680I;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f9681J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f9699g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f9681J;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f9682K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f9699g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f9682K;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f9683L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f9699g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f9683L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z6 || this.f9684M == null || this.f9715o.size() <= 0 || !this.f9684M.p()) ? z6 : true) {
            AbstractC2393D.H(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public int e0(View view) {
        D g02 = g0(view);
        if (g02 != null) {
            return g02.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public final void e1() {
        View focusedChild = (this.f9708k0 && hasFocus() && this.f9709l != null) ? getFocusedChild() : null;
        D T5 = focusedChild != null ? T(focusedChild) : null;
        if (T5 == null) {
            c1();
            return;
        }
        this.f9716o0.f9752n = this.f9709l.hasStableIds() ? T5.getItemId() : -1L;
        this.f9716o0.f9751m = this.f9670D ? -1 : T5.isRemoved() ? T5.mOldPosition : T5.getAbsoluteAdapterPosition();
        this.f9716o0.f9753o = i0(T5.itemView);
    }

    public final void f(D d6) {
        View view = d6.itemView;
        boolean z6 = view.getParent() == this;
        this.f9689b.J(f0(view));
        if (d6.isTmpDetached()) {
            this.f9695e.c(view, -1, view.getLayoutParams(), true);
        } else if (z6) {
            this.f9695e.k(view);
        } else {
            this.f9695e.b(view, true);
        }
    }

    public D f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void f1() {
        int j6 = this.f9695e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            D g02 = g0(this.f9695e.i(i6));
            if (!g02.shouldIgnore()) {
                g02.saveOldPosition();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i6) {
        View view2;
        boolean z6;
        View P02 = this.f9711m.P0(view, i6);
        if (P02 != null) {
            return P02;
        }
        boolean z7 = (this.f9709l == null || this.f9711m == null || u0() || this.f9733x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z7 && (i6 == 2 || i6 == 1)) {
            if (this.f9711m.l()) {
                int i7 = i6 == 2 ? 130 : 33;
                z6 = focusFinder.findNextFocus(this, view, i7) == null;
                if (f9660N0) {
                    i6 = i7;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f9711m.k()) {
                int i8 = (this.f9711m.Y() == 1) ^ (i6 == 2) ? 66 : 17;
                boolean z8 = focusFinder.findNextFocus(this, view, i8) == null;
                if (f9660N0) {
                    i6 = i8;
                }
                z6 = z8;
            }
            if (z6) {
                u();
                if (S(view) == null) {
                    return null;
                }
                q1();
                this.f9711m.I0(view, i6, this.f9689b, this.f9716o0);
                s1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i6);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i6);
            if (findNextFocus == null && z7) {
                u();
                if (S(view) == null) {
                    return null;
                }
                q1();
                view2 = this.f9711m.I0(view, i6, this.f9689b, this.f9716o0);
                s1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return v0(view, view2, i6) ? view2 : super.focusSearch(view, i6);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i6);
        }
        b1(view2, null);
        return view;
    }

    public void g(o oVar) {
        h(oVar, -1);
    }

    public boolean g1(int i6, int i7, MotionEvent motionEvent, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        u();
        if (this.f9709l != null) {
            int[] iArr = this.f9667B0;
            iArr[0] = 0;
            iArr[1] = 0;
            h1(i6, i7, iArr);
            int[] iArr2 = this.f9667B0;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i11 = i6 - i13;
            i12 = i7 - i14;
            i10 = i14;
            i9 = i13;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.f9715o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f9667B0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i9, i10, i11, i12, this.f9738z0, i8, iArr3);
        int[] iArr4 = this.f9667B0;
        int i15 = iArr4[0];
        int i16 = i11 - i15;
        int i17 = iArr4[1];
        int i18 = i12 - i17;
        boolean z6 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.f9694d0;
        int[] iArr5 = this.f9738z0;
        int i20 = iArr5[0];
        this.f9694d0 = i19 - i20;
        int i21 = this.f9696e0;
        int i22 = iArr5[1];
        this.f9696e0 = i21 - i22;
        int[] iArr6 = this.f9665A0;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC2432r.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i16, motionEvent.getY(), i18);
            }
            t(i6, i7);
        }
        if (i9 != 0 || i10 != 0) {
            I(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z6 && i9 == 0 && i10 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f9711m;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f9711m;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f9709l;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f9711m;
        return pVar != null ? pVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i6, int i7) {
        k kVar = this.f9732w0;
        return kVar == null ? super.getChildDrawingOrder(i6, i7) : kVar.a(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f9699g;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f9730v0;
    }

    @NonNull
    public l getEdgeEffectFactory() {
        return this.f9678H;
    }

    public m getItemAnimator() {
        return this.f9684M;
    }

    public int getItemDecorationCount() {
        return this.f9715o.size();
    }

    public p getLayoutManager() {
        return this.f9711m;
    }

    public int getMaxFlingVelocity() {
        return this.f9702h0;
    }

    public int getMinFlingVelocity() {
        return this.f9700g0;
    }

    public long getNanoTime() {
        if (f9659M0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f9708k0;
    }

    @NonNull
    public v getRecycledViewPool() {
        return this.f9689b.i();
    }

    public int getScrollState() {
        return this.f9685V;
    }

    public void h(o oVar, int i6) {
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f9715o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i6 < 0) {
            this.f9715o.add(oVar);
        } else {
            this.f9715o.add(i6, oVar);
        }
        w0();
        requestLayout();
    }

    public void h1(int i6, int i7, int[] iArr) {
        q1();
        G0();
        v0.p.a("RV Scroll");
        Q(this.f9716o0);
        int u12 = i6 != 0 ? this.f9711m.u1(i6, this.f9689b, this.f9716o0) : 0;
        int w12 = i7 != 0 ? this.f9711m.w1(i7, this.f9689b, this.f9716o0) : 0;
        v0.p.b();
        a1();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = u12;
            iArr[1] = w12;
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(r rVar) {
        if (this.f9668C == null) {
            this.f9668C = new ArrayList();
        }
        this.f9668C.add(rVar);
    }

    public final int i0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public void i1(int i6) {
        if (this.f9733x) {
            return;
        }
        u1();
        p pVar = this.f9711m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.v1(i6);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f9721r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f9733x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(t tVar) {
        this.f9717p.add(tVar);
    }

    public final String j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + com.amazon.a.a.o.c.a.b.f11260a + str;
    }

    public final void j1(h hVar, boolean z6, boolean z7) {
        h hVar2 = this.f9709l;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f9687a);
            this.f9709l.onDetachedFromRecyclerView(this);
        }
        if (!z6 || z7) {
            U0();
        }
        this.f9693d.y();
        h hVar3 = this.f9709l;
        this.f9709l = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f9687a);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.D0(hVar3, this.f9709l);
        }
        this.f9689b.x(hVar3, this.f9709l, z6);
        this.f9716o0.f9745g = true;
    }

    public void k(u uVar) {
        if (this.f9720q0 == null) {
            this.f9720q0 = new ArrayList();
        }
        this.f9720q0.add(uVar);
    }

    public Rect k0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f9809c) {
            return qVar.f9808b;
        }
        if (this.f9716o0.e() && (qVar.b() || qVar.d())) {
            return qVar.f9808b;
        }
        Rect rect = qVar.f9808b;
        rect.set(0, 0, 0, 0);
        int size = this.f9715o.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f9703i.set(0, 0, 0, 0);
            ((o) this.f9715o.get(i6)).getItemOffsets(this.f9703i, view, this, this.f9716o0);
            int i7 = rect.left;
            Rect rect2 = this.f9703i;
            rect.left = i7 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f9809c = false;
        return rect;
    }

    public boolean k1(D d6, int i6) {
        if (!u0()) {
            AbstractC2393D.U(d6.itemView, i6);
            return true;
        }
        d6.mPendingAccessibilityState = i6;
        this.f9669C0.add(d6);
        return false;
    }

    public void l(D d6, m.c cVar, m.c cVar2) {
        d6.setIsRecyclable(false);
        if (this.f9684M.a(d6, cVar, cVar2)) {
            M0();
        }
    }

    public final void l0(long j6, D d6, D d7) {
        int g6 = this.f9695e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            D g02 = g0(this.f9695e.f(i6));
            if (g02 != d6 && d0(g02) == j6) {
                h hVar = this.f9709l;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g02 + " \n View Holder 2:" + d6 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g02 + " \n View Holder 2:" + d6 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d7 + " cannot be found but it is necessary for " + d6 + P());
    }

    public boolean l1(AccessibilityEvent accessibilityEvent) {
        if (!u0()) {
            return false;
        }
        int a6 = accessibilityEvent != null ? A0.b.a(accessibilityEvent) : 0;
        this.f9737z |= a6 != 0 ? a6 : 0;
        return true;
    }

    public final void m(D d6, D d7, m.c cVar, m.c cVar2, boolean z6, boolean z7) {
        d6.setIsRecyclable(false);
        if (z6) {
            f(d6);
        }
        if (d6 != d7) {
            if (z7) {
                f(d7);
            }
            d6.mShadowedHolder = d7;
            f(d6);
            this.f9689b.J(d6);
            d7.setIsRecyclable(false);
            d7.mShadowingHolder = d6;
        }
        if (this.f9684M.b(d6, d7, cVar, cVar2)) {
            M0();
        }
    }

    public boolean m0() {
        return !this.f9727u || this.f9670D || this.f9693d.p();
    }

    public void m1(int i6, int i7) {
        n1(i6, i7, null);
    }

    public void n(D d6, m.c cVar, m.c cVar2) {
        f(d6);
        d6.setIsRecyclable(false);
        if (this.f9684M.c(d6, cVar, cVar2)) {
            M0();
        }
    }

    public final boolean n0() {
        int g6 = this.f9695e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            D g02 = g0(this.f9695e.f(i6));
            if (g02 != null && !g02.shouldIgnore() && g02.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public void n1(int i6, int i7, Interpolator interpolator) {
        o1(i6, i7, interpolator, IntCompanionObject.MIN_VALUE);
    }

    public void o(String str) {
        if (u0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.f9676G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o0() {
        this.f9693d = new a(new f());
    }

    public void o1(int i6, int i7, Interpolator interpolator, int i8) {
        p1(i6, i7, interpolator, i8, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f9674F = r0
            r1 = 1
            r5.f9721r = r1
            boolean r2 = r5.f9727u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f9727u = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f9711m
            if (r1 == 0) goto L1e
            r1.z(r5)
        L1e:
            r5.f9728u0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f9659M0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.g.f10013e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.g r1 = (androidx.recyclerview.widget.g) r1
            r5.f9712m0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.g r1 = new androidx.recyclerview.widget.g
            r1.<init>()
            r5.f9712m0 = r1
            android.view.Display r1 = z0.AbstractC2393D.l(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.g r2 = r5.f9712m0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10017c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.g r0 = r5.f9712m0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.g gVar;
        super.onDetachedFromWindow();
        m mVar = this.f9684M;
        if (mVar != null) {
            mVar.k();
        }
        u1();
        this.f9721r = false;
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.A(this, this.f9689b);
        }
        this.f9669C0.clear();
        removeCallbacks(this.f9671D0);
        this.f9697f.j();
        if (!f9659M0 || (gVar = this.f9712m0) == null) {
            return;
        }
        gVar.j(this);
        this.f9712m0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f9715o.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((o) this.f9715o.get(i6)).onDraw(canvas, this, this.f9716o0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f9711m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f9733x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f9711m
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f9711m
            boolean r3 = r3.k()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f9711m
            boolean r3 = r3.l()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f9711m
            boolean r3 = r3.k()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f9704i0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f9706j0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.y0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (this.f9733x) {
            return false;
        }
        this.f9719q = null;
        if (U(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.f9711m;
        if (pVar == null) {
            return false;
        }
        boolean k6 = pVar.k();
        boolean l6 = this.f9711m.l();
        if (this.f9688a0 == null) {
            this.f9688a0 = VelocityTracker.obtain();
        }
        this.f9688a0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f9735y) {
                this.f9735y = false;
            }
            this.f9686W = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f9694d0 = x6;
            this.f9690b0 = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f9696e0 = y6;
            this.f9692c0 = y6;
            if (this.f9685V == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.f9665A0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i6 = k6;
            if (l6) {
                i6 = (k6 ? 1 : 0) | 2;
            }
            r1(i6, 0);
        } else if (actionMasked == 1) {
            this.f9688a0.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f9686W);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f9686W + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f9685V != 1) {
                int i7 = x7 - this.f9690b0;
                int i8 = y7 - this.f9692c0;
                if (k6 == 0 || Math.abs(i7) <= this.f9698f0) {
                    z6 = false;
                } else {
                    this.f9694d0 = x7;
                    z6 = true;
                }
                if (l6 && Math.abs(i8) > this.f9698f0) {
                    this.f9696e0 = y7;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f9686W = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f9694d0 = x8;
            this.f9690b0 = x8;
            int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f9696e0 = y8;
            this.f9692c0 = y8;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.f9685V == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        v0.p.a("RV OnLayout");
        B();
        v0.p.b();
        this.f9727u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        p pVar = this.f9711m;
        if (pVar == null) {
            w(i6, i7);
            return;
        }
        boolean z6 = false;
        if (pVar.r0()) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f9711m.Y0(this.f9689b, this.f9716o0, i6, i7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f9673E0 = z6;
            if (z6 || this.f9709l == null) {
                return;
            }
            if (this.f9716o0.f9743e == 1) {
                C();
            }
            this.f9711m.y1(i6, i7);
            this.f9716o0.f9748j = true;
            D();
            this.f9711m.B1(i6, i7);
            if (this.f9711m.E1()) {
                this.f9711m.y1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f9716o0.f9748j = true;
                D();
                this.f9711m.B1(i6, i7);
            }
            this.f9675F0 = getMeasuredWidth();
            this.f9677G0 = getMeasuredHeight();
            return;
        }
        if (this.f9723s) {
            this.f9711m.Y0(this.f9689b, this.f9716o0, i6, i7);
            return;
        }
        if (this.f9664A) {
            q1();
            G0();
            O0();
            H0();
            A a6 = this.f9716o0;
            if (a6.f9750l) {
                a6.f9746h = true;
            } else {
                this.f9693d.j();
                this.f9716o0.f9746h = false;
            }
            this.f9664A = false;
            s1(false);
        } else if (this.f9716o0.f9750l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f9709l;
        if (hVar != null) {
            this.f9716o0.f9744f = hVar.getItemCount();
        } else {
            this.f9716o0.f9744f = 0;
        }
        q1();
        this.f9711m.Y0(this.f9689b, this.f9716o0, i6, i7);
        s1(false);
        this.f9716o0.f9746h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f9691c = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f9691c;
        if (zVar2 != null) {
            zVar.c(zVar2);
            return zVar;
        }
        p pVar = this.f9711m;
        if (pVar != null) {
            zVar.f9826c = pVar.c1();
            return zVar;
        }
        zVar.f9826c = null;
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 == i8 && i7 == i9) {
            return;
        }
        s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(D d6) {
        m mVar = this.f9684M;
        return mVar == null || mVar.g(d6, d6.getUnmodifiedPayloads());
    }

    public final void p0() {
        if (AbstractC2393D.o(this) == 0) {
            AbstractC2393D.W(this, 8);
        }
    }

    public void p1(int i6, int i7, Interpolator interpolator, int i8, boolean z6) {
        p pVar = this.f9711m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9733x) {
            return;
        }
        if (!pVar.k()) {
            i6 = 0;
        }
        if (!this.f9711m.l()) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (i8 != Integer.MIN_VALUE && i8 <= 0) {
            scrollBy(i6, i7);
            return;
        }
        if (z6) {
            int i9 = i6 != 0 ? 1 : 0;
            if (i7 != 0) {
                i9 |= 2;
            }
            r1(i9, 1);
        }
        this.f9710l0.e(i6, i7, i8, interpolator);
    }

    public final void q() {
        d1();
        setScrollState(0);
    }

    public final void q0() {
        this.f9695e = new c(new e());
    }

    public void q1() {
        int i6 = this.f9729v + 1;
        this.f9729v = i6;
        if (i6 != 1 || this.f9733x) {
            return;
        }
        this.f9731w = false;
    }

    public void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC2076b.f19046a), resources.getDimensionPixelSize(AbstractC2076b.f19048c), resources.getDimensionPixelOffset(AbstractC2076b.f19047b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean r1(int i6, int i7) {
        return getScrollingChildHelper().p(i6, i7);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z6) {
        D g02 = g0(view);
        if (g02 != null) {
            if (g02.isTmpDetached()) {
                g02.clearTmpDetachFlag();
            } else if (!g02.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g02 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f9711m.a1(this, this.f9716o0, view, view2) && view2 != null) {
            b1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f9711m.p1(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        int size = this.f9717p.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((t) this.f9717p.get(i6)).e(z6);
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f9729v != 0 || this.f9733x) {
            this.f9731w = true;
        } else {
            super.requestLayout();
        }
    }

    public void s() {
        int j6 = this.f9695e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            D g02 = g0(this.f9695e.i(i6));
            if (!g02.shouldIgnore()) {
                g02.clearOldPosition();
            }
        }
        this.f9689b.d();
    }

    public void s0() {
        this.f9683L = null;
        this.f9681J = null;
        this.f9682K = null;
        this.f9680I = null;
    }

    public void s1(boolean z6) {
        if (this.f9729v < 1) {
            this.f9729v = 1;
        }
        if (!z6 && !this.f9733x) {
            this.f9731w = false;
        }
        if (this.f9729v == 1) {
            if (z6 && this.f9731w && !this.f9733x && this.f9711m != null && this.f9709l != null) {
                B();
            }
            if (!this.f9733x) {
                this.f9731w = false;
            }
        }
        this.f9729v--;
    }

    @Override // android.view.View
    public void scrollBy(int i6, int i7) {
        p pVar = this.f9711m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9733x) {
            return;
        }
        boolean k6 = pVar.k();
        boolean l6 = this.f9711m.l();
        if (k6 || l6) {
            if (!k6) {
                i6 = 0;
            }
            if (!l6) {
                i7 = 0;
            }
            g1(i6, i7, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (l1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f9730v0 = lVar;
        AbstractC2393D.N(this, lVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        j1(hVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.f9732w0) {
            return;
        }
        this.f9732w0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f9699g) {
            s0();
        }
        this.f9699g = z6;
        super.setClipToPadding(z6);
        if (this.f9727u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull l lVar) {
        y0.g.f(lVar);
        this.f9678H = lVar;
        s0();
    }

    public void setHasFixedSize(boolean z6) {
        this.f9723s = z6;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f9684M;
        if (mVar2 != null) {
            mVar2.k();
            this.f9684M.w(null);
        }
        this.f9684M = mVar;
        if (mVar != null) {
            mVar.w(this.f9726t0);
        }
    }

    public void setItemViewCacheSize(int i6) {
        this.f9689b.G(i6);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f9711m) {
            return;
        }
        u1();
        if (this.f9711m != null) {
            m mVar = this.f9684M;
            if (mVar != null) {
                mVar.k();
            }
            this.f9711m.i1(this.f9689b);
            this.f9711m.j1(this.f9689b);
            this.f9689b.c();
            if (this.f9721r) {
                this.f9711m.A(this, this.f9689b);
            }
            this.f9711m.C1(null);
            this.f9711m = null;
        } else {
            this.f9689b.c();
        }
        this.f9695e.o();
        this.f9711m = pVar;
        if (pVar != null) {
            if (pVar.f9785b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f9785b.P());
            }
            pVar.C1(this);
            if (this.f9721r) {
                this.f9711m.z(this);
            }
        }
        this.f9689b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        getScrollingChildHelper().m(z6);
    }

    public void setOnFlingListener(s sVar) {
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f9718p0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f9708k0 = z6;
    }

    public void setRecycledViewPool(v vVar) {
        this.f9689b.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    public void setScrollState(int i6) {
        if (i6 == this.f9685V) {
            return;
        }
        this.f9685V = i6;
        if (i6 != 2) {
            v1();
        }
        H(i6);
    }

    public void setScrollingTouchSlop(int i6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 == 1) {
                this.f9698f0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
        }
        this.f9698f0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(B b6) {
        this.f9689b.F(b6);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().o(i6);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        if (z6 != this.f9733x) {
            o("Do not suppressLayout in layout or scroll");
            if (z6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f9733x = true;
                this.f9735y = true;
                u1();
                return;
            }
            this.f9733x = false;
            if (this.f9731w && this.f9711m != null && this.f9709l != null) {
                requestLayout();
            }
            this.f9731w = false;
        }
    }

    public void t(int i6, int i7) {
        boolean z6;
        EdgeEffect edgeEffect = this.f9680I;
        if (edgeEffect == null || edgeEffect.isFinished() || i6 <= 0) {
            z6 = false;
        } else {
            this.f9680I.onRelease();
            z6 = this.f9680I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9682K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f9682K.onRelease();
            z6 |= this.f9682K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9681J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.f9681J.onRelease();
            z6 |= this.f9681J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9683L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.f9683L.onRelease();
            z6 |= this.f9683L.isFinished();
        }
        if (z6) {
            AbstractC2393D.H(this);
        }
    }

    public boolean t0() {
        AccessibilityManager accessibilityManager = this.f9666B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void t1(int i6) {
        getScrollingChildHelper().r(i6);
    }

    public void u() {
        if (!this.f9727u || this.f9670D) {
            v0.p.a("RV FullInvalidate");
            B();
            v0.p.b();
            return;
        }
        if (this.f9693d.p()) {
            if (!this.f9693d.o(4) || this.f9693d.o(11)) {
                if (this.f9693d.p()) {
                    v0.p.a("RV FullInvalidate");
                    B();
                    v0.p.b();
                    return;
                }
                return;
            }
            v0.p.a("RV PartialInvalidate");
            q1();
            G0();
            this.f9693d.w();
            if (!this.f9731w) {
                if (n0()) {
                    B();
                } else {
                    this.f9693d.i();
                }
            }
            s1(true);
            H0();
            v0.p.b();
        }
    }

    public boolean u0() {
        return this.f9674F > 0;
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    public final void v(Context context, String str, AttributeSet attributeSet, int i6, int i7) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String j02 = j0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(j02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(f9662P0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i6), Integer.valueOf(i7)};
                } catch (NoSuchMethodException e6) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e7) {
                        e7.initCause(e6);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + j02, e7);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + j02, e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + j02, e9);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + j02, e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j02, e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + j02, e12);
            }
        }
    }

    public final boolean v0(View view, View view2, int i6) {
        int i7;
        if (view2 == null || view2 == this || view2 == view || S(view2) == null) {
            return false;
        }
        if (view == null || S(view) == null) {
            return true;
        }
        this.f9703i.set(0, 0, view.getWidth(), view.getHeight());
        this.f9705j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f9703i);
        offsetDescendantRectToMyCoords(view2, this.f9705j);
        char c6 = 65535;
        int i8 = this.f9711m.Y() == 1 ? -1 : 1;
        Rect rect = this.f9703i;
        int i9 = rect.left;
        Rect rect2 = this.f9705j;
        int i10 = rect2.left;
        if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
            i7 = 1;
        } else {
            int i11 = rect.right;
            int i12 = rect2.right;
            i7 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? -1 : 0;
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
            c6 = 1;
        } else {
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && i13 < i16) || i13 <= i14) {
                c6 = 0;
            }
        }
        if (i6 == 1) {
            return c6 < 0 || (c6 == 0 && i7 * i8 < 0);
        }
        if (i6 == 2) {
            return c6 > 0 || (c6 == 0 && i7 * i8 > 0);
        }
        if (i6 == 17) {
            return i7 < 0;
        }
        if (i6 == 33) {
            return c6 < 0;
        }
        if (i6 == 66) {
            return i7 > 0;
        }
        if (i6 == 130) {
            return c6 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i6 + P());
    }

    public final void v1() {
        this.f9710l0.f();
        p pVar = this.f9711m;
        if (pVar != null) {
            pVar.G1();
        }
    }

    public void w(int i6, int i7) {
        setMeasuredDimension(p.n(i6, getPaddingLeft() + getPaddingRight(), AbstractC2393D.r(this)), p.n(i7, getPaddingTop() + getPaddingBottom(), AbstractC2393D.q(this)));
    }

    public void w0() {
        int j6 = this.f9695e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            ((q) this.f9695e.i(i6).getLayoutParams()).f9809c = true;
        }
        this.f9689b.s();
    }

    public void w1(int i6, int i7, Object obj) {
        int i8;
        int j6 = this.f9695e.j();
        int i9 = i6 + i7;
        for (int i10 = 0; i10 < j6; i10++) {
            View i11 = this.f9695e.i(i10);
            D g02 = g0(i11);
            if (g02 != null && !g02.shouldIgnore() && (i8 = g02.mPosition) >= i6 && i8 < i9) {
                g02.addFlags(2);
                g02.addChangePayload(obj);
                ((q) i11.getLayoutParams()).f9809c = true;
            }
        }
        this.f9689b.M(i6, i7);
    }

    public final boolean x(int i6, int i7) {
        V(this.f9734x0);
        int[] iArr = this.f9734x0;
        return (iArr[0] == i6 && iArr[1] == i7) ? false : true;
    }

    public void x0() {
        int j6 = this.f9695e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            D g02 = g0(this.f9695e.i(i6));
            if (g02 != null && !g02.shouldIgnore()) {
                g02.addFlags(6);
            }
        }
        w0();
        this.f9689b.t();
    }

    public void y(View view) {
        D g02 = g0(view);
        E0(view);
        h hVar = this.f9709l;
        if (hVar != null && g02 != null) {
            hVar.onViewAttachedToWindow(g02);
        }
        List list = this.f9668C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f9668C.get(size)).d(view);
            }
        }
    }

    public final void y0(int i6, int i7, MotionEvent motionEvent, int i8) {
        p pVar = this.f9711m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9733x) {
            return;
        }
        int[] iArr = this.f9667B0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean k6 = pVar.k();
        boolean l6 = this.f9711m.l();
        r1(l6 ? (k6 ? 1 : 0) | 2 : k6 ? 1 : 0, i8);
        if (F(k6 ? i6 : 0, l6 ? i7 : 0, this.f9667B0, this.f9738z0, i8)) {
            int[] iArr2 = this.f9667B0;
            i6 -= iArr2[0];
            i7 -= iArr2[1];
        }
        g1(k6 ? i6 : 0, l6 ? i7 : 0, motionEvent, i8);
        androidx.recyclerview.widget.g gVar = this.f9712m0;
        if (gVar != null && (i6 != 0 || i7 != 0)) {
            gVar.f(this, i6, i7);
        }
        t1(i8);
    }

    public void z(View view) {
        D g02 = g0(view);
        F0(view);
        h hVar = this.f9709l;
        if (hVar != null && g02 != null) {
            hVar.onViewDetachedFromWindow(g02);
        }
        List list = this.f9668C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f9668C.get(size)).b(view);
            }
        }
    }

    public void z0(int i6) {
        int g6 = this.f9695e.g();
        for (int i7 = 0; i7 < g6; i7++) {
            this.f9695e.f(i7).offsetLeftAndRight(i6);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f9687a = new y();
        this.f9689b = new w();
        this.f9697f = new androidx.recyclerview.widget.p();
        this.f9701h = new RunnableC1068a();
        this.f9703i = new Rect();
        this.f9705j = new Rect();
        this.f9707k = new RectF();
        this.f9713n = new ArrayList();
        this.f9715o = new ArrayList();
        this.f9717p = new ArrayList();
        this.f9729v = 0;
        this.f9670D = false;
        this.f9672E = false;
        this.f9674F = 0;
        this.f9676G = 0;
        this.f9678H = new l();
        this.f9684M = new d();
        this.f9685V = 0;
        this.f9686W = -1;
        this.f9704i0 = Float.MIN_VALUE;
        this.f9706j0 = Float.MIN_VALUE;
        this.f9708k0 = true;
        this.f9710l0 = new C();
        this.f9714n0 = f9659M0 ? new g.b() : null;
        this.f9716o0 = new A();
        this.f9722r0 = false;
        this.f9724s0 = false;
        this.f9726t0 = new n();
        this.f9728u0 = false;
        this.f9734x0 = new int[2];
        this.f9738z0 = new int[2];
        this.f9665A0 = new int[2];
        this.f9667B0 = new int[2];
        this.f9669C0 = new ArrayList();
        this.f9671D0 = new RunnableC1069b();
        this.f9675F0 = 0;
        this.f9677G0 = 0;
        this.f9679H0 = new C1071d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9698f0 = viewConfiguration.getScaledTouchSlop();
        this.f9704i0 = AbstractC2396G.e(viewConfiguration, context);
        this.f9706j0 = AbstractC2396G.h(viewConfiguration, context);
        this.f9700g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9702h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f9684M.w(this.f9726t0);
        o0();
        q0();
        p0();
        if (AbstractC2393D.n(this) == 0) {
            AbstractC2393D.U(this, 1);
        }
        this.f9666B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        int[] iArr = t2.d.f19058f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        AbstractC2393D.L(this, context, iArr, attributeSet, obtainStyledAttributes, i6, 0);
        String string = obtainStyledAttributes.getString(t2.d.f19067o);
        if (obtainStyledAttributes.getInt(t2.d.f19061i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f9699g = obtainStyledAttributes.getBoolean(t2.d.f19060h, true);
        boolean z6 = obtainStyledAttributes.getBoolean(t2.d.f19062j, false);
        this.f9725t = z6;
        if (z6) {
            r0((StateListDrawable) obtainStyledAttributes.getDrawable(t2.d.f19065m), obtainStyledAttributes.getDrawable(t2.d.f19066n), (StateListDrawable) obtainStyledAttributes.getDrawable(t2.d.f19063k), obtainStyledAttributes.getDrawable(t2.d.f19064l));
        }
        obtainStyledAttributes.recycle();
        v(context, string, attributeSet, i6, 0);
        int[] iArr2 = f9655I0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        AbstractC2393D.L(this, context, iArr2, attributeSet, obtainStyledAttributes2, i6, 0);
        boolean z7 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class z extends G0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f9826c;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i6) {
                return new z[i6];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9826c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public void c(z zVar) {
            this.f9826c = zVar.f9826c;
        }

        @Override // G0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeParcelable(this.f9826c, 0);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public D f9807a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f9808b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9809c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9810d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9808b = new Rect();
            this.f9809c = true;
            this.f9810d = false;
        }

        public int a() {
            return this.f9807a.getLayoutPosition();
        }

        public boolean b() {
            return this.f9807a.isUpdated();
        }

        public boolean c() {
            return this.f9807a.isRemoved();
        }

        public boolean d() {
            return this.f9807a.isInvalid();
        }

        public q(int i6, int i7) {
            super(i6, i7);
            this.f9808b = new Rect();
            this.f9809c = true;
            this.f9810d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9808b = new Rect();
            this.f9809c = true;
            this.f9810d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9808b = new Rect();
            this.f9809c = true;
            this.f9810d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f9808b = new Rect();
            this.f9809c = true;
            this.f9810d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f9711m;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
