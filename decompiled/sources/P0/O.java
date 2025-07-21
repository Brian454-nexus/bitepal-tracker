package P0;

import P0.a0;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1057i;
import com.android.installreferrer.api.InstallReferrerClient;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    public final C f4026a;

    /* renamed from: b, reason: collision with root package name */
    public final P f4027b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0708p f4028c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4029d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4030e = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4031a;

        public a(View view) {
            this.f4031a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4031a.removeOnAttachStateChangeListener(this);
            AbstractC2393D.K(this.f4031a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4033a;

        static {
            int[] iArr = new int[AbstractC1057i.b.values().length];
            f4033a = iArr;
            try {
                iArr[AbstractC1057i.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4033a[AbstractC1057i.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4033a[AbstractC1057i.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4033a[AbstractC1057i.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public O(C c6, P p6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        this.f4026a = c6;
        this.f4027b = p6;
        this.f4028c = abstractComponentCallbacksC0708p;
    }

    public void a() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4028c);
        }
        Bundle bundle = this.f4028c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f4028c.performActivityCreated(bundle2);
        this.f4026a.a(this.f4028c, bundle2, false);
    }

    public void b() {
        AbstractComponentCallbacksC0708p l02 = I.l0(this.f4028c.mContainer);
        AbstractComponentCallbacksC0708p parentFragment = this.f4028c.getParentFragment();
        if (l02 != null && !l02.equals(parentFragment)) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
            Q0.c.j(abstractComponentCallbacksC0708p, l02, abstractComponentCallbacksC0708p.mContainerId);
        }
        int j6 = this.f4027b.j(this.f4028c);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
        abstractComponentCallbacksC0708p2.mContainer.addView(abstractComponentCallbacksC0708p2.mView, j6);
    }

    public void c() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4028c);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = abstractComponentCallbacksC0708p.mTarget;
        O o6 = null;
        if (abstractComponentCallbacksC0708p2 != null) {
            O n6 = this.f4027b.n(abstractComponentCallbacksC0708p2.mWho);
            if (n6 == null) {
                throw new IllegalStateException("Fragment " + this.f4028c + " declared target fragment " + this.f4028c.mTarget + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
            abstractComponentCallbacksC0708p3.mTargetWho = abstractComponentCallbacksC0708p3.mTarget.mWho;
            abstractComponentCallbacksC0708p3.mTarget = null;
            o6 = n6;
        } else {
            String str = abstractComponentCallbacksC0708p.mTargetWho;
            if (str != null && (o6 = this.f4027b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4028c + " declared target fragment " + this.f4028c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (o6 != null) {
            o6.m();
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
        abstractComponentCallbacksC0708p4.mHost = abstractComponentCallbacksC0708p4.mFragmentManager.v0();
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = this.f4028c;
        abstractComponentCallbacksC0708p5.mParentFragment = abstractComponentCallbacksC0708p5.mFragmentManager.y0();
        this.f4026a.g(this.f4028c, false);
        this.f4028c.performAttach();
        this.f4026a.b(this.f4028c, false);
    }

    public int d() {
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        if (abstractComponentCallbacksC0708p.mFragmentManager == null) {
            return abstractComponentCallbacksC0708p.mState;
        }
        int i6 = this.f4030e;
        int i7 = b.f4033a[abstractComponentCallbacksC0708p.mMaxState.ordinal()];
        if (i7 != 1) {
            i6 = i7 != 2 ? i7 != 3 ? i7 != 4 ? Math.min(i6, -1) : Math.min(i6, 0) : Math.min(i6, 1) : Math.min(i6, 5);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
        if (abstractComponentCallbacksC0708p2.mFromLayout) {
            if (abstractComponentCallbacksC0708p2.mInLayout) {
                i6 = Math.max(this.f4030e, 2);
                View view = this.f4028c.mView;
                if (view != null && view.getParent() == null) {
                    i6 = Math.min(i6, 2);
                }
            } else {
                i6 = this.f4030e < 4 ? Math.min(i6, abstractComponentCallbacksC0708p2.mState) : Math.min(i6, 1);
            }
        }
        if (!this.f4028c.mAdded) {
            i6 = Math.min(i6, 1);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
        ViewGroup viewGroup = abstractComponentCallbacksC0708p3.mContainer;
        a0.d.a s6 = viewGroup != null ? a0.u(viewGroup, abstractComponentCallbacksC0708p3.getParentFragmentManager()).s(this) : null;
        if (s6 == a0.d.a.ADDING) {
            i6 = Math.min(i6, 6);
        } else if (s6 == a0.d.a.REMOVING) {
            i6 = Math.max(i6, 3);
        } else {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
            if (abstractComponentCallbacksC0708p4.mRemoving) {
                i6 = abstractComponentCallbacksC0708p4.isInBackStack() ? Math.min(i6, 1) : Math.min(i6, -1);
            }
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = this.f4028c;
        if (abstractComponentCallbacksC0708p5.mDeferStart && abstractComponentCallbacksC0708p5.mState < 5) {
            i6 = Math.min(i6, 4);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p6 = this.f4028c;
        if (abstractComponentCallbacksC0708p6.mTransitioning && abstractComponentCallbacksC0708p6.mContainer != null) {
            i6 = Math.max(i6, 3);
        }
        if (I.I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i6 + " for " + this.f4028c);
        }
        return i6;
    }

    public void e() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4028c);
        }
        Bundle bundle = this.f4028c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        if (abstractComponentCallbacksC0708p.mIsCreated) {
            abstractComponentCallbacksC0708p.mState = 1;
            abstractComponentCallbacksC0708p.restoreChildFragmentState();
        } else {
            this.f4026a.h(abstractComponentCallbacksC0708p, bundle2, false);
            this.f4028c.performCreate(bundle2);
            this.f4026a.c(this.f4028c, bundle2, false);
        }
    }

    public void f() {
        String str;
        if (this.f4028c.mFromLayout) {
            return;
        }
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4028c);
        }
        Bundle bundle = this.f4028c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = this.f4028c.performGetLayoutInflater(bundle2);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i6 = abstractComponentCallbacksC0708p.mContainerId;
            if (i6 != 0) {
                if (i6 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4028c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0708p.mFragmentManager.r0().c(this.f4028c.mContainerId);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
                    if (!abstractComponentCallbacksC0708p2.mRestored) {
                        try {
                            str = abstractComponentCallbacksC0708p2.getResources().getResourceName(this.f4028c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4028c.mContainerId) + " (" + str + ") for fragment " + this.f4028c);
                    }
                } else if (!(viewGroup instanceof C0715x)) {
                    Q0.c.i(this.f4028c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
        abstractComponentCallbacksC0708p3.mContainer = viewGroup;
        abstractComponentCallbacksC0708p3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.f4028c.mView != null) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f4028c);
            }
            this.f4028c.mView.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
            abstractComponentCallbacksC0708p4.mView.setTag(O0.b.f3881a, abstractComponentCallbacksC0708p4);
            if (viewGroup != null) {
                b();
            }
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = this.f4028c;
            if (abstractComponentCallbacksC0708p5.mHidden) {
                abstractComponentCallbacksC0708p5.mView.setVisibility(8);
            }
            if (this.f4028c.mView.isAttachedToWindow()) {
                AbstractC2393D.K(this.f4028c.mView);
            } else {
                View view = this.f4028c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f4028c.performViewCreated();
            C c6 = this.f4026a;
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p6 = this.f4028c;
            c6.m(abstractComponentCallbacksC0708p6, abstractComponentCallbacksC0708p6.mView, bundle2, false);
            int visibility = this.f4028c.mView.getVisibility();
            this.f4028c.setPostOnViewCreatedAlpha(this.f4028c.mView.getAlpha());
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p7 = this.f4028c;
            if (abstractComponentCallbacksC0708p7.mContainer != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0708p7.mView.findFocus();
                if (findFocus != null) {
                    this.f4028c.setFocusedView(findFocus);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4028c);
                    }
                }
                this.f4028c.mView.setAlpha(0.0f);
            }
        }
        this.f4028c.mState = 2;
    }

    public void g() {
        AbstractComponentCallbacksC0708p f6;
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4028c);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        boolean z6 = true;
        boolean z7 = abstractComponentCallbacksC0708p.mRemoving && !abstractComponentCallbacksC0708p.isInBackStack();
        if (z7) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
            if (!abstractComponentCallbacksC0708p2.mBeingSaved) {
                this.f4027b.B(abstractComponentCallbacksC0708p2.mWho, null);
            }
        }
        if (!z7 && !this.f4027b.p().r(this.f4028c)) {
            String str = this.f4028c.mTargetWho;
            if (str != null && (f6 = this.f4027b.f(str)) != null && f6.mRetainInstance) {
                this.f4028c.mTarget = f6;
            }
            this.f4028c.mState = 0;
            return;
        }
        A a6 = this.f4028c.mHost;
        if (a6 instanceof androidx.lifecycle.Q) {
            z6 = this.f4027b.p().o();
        } else if (a6.f() instanceof Activity) {
            z6 = true ^ ((Activity) a6.f()).isChangingConfigurations();
        }
        if ((z7 && !this.f4028c.mBeingSaved) || z6) {
            this.f4027b.p().g(this.f4028c, false);
        }
        this.f4028c.performDestroy();
        this.f4026a.d(this.f4028c, false);
        for (O o6 : this.f4027b.k()) {
            if (o6 != null) {
                AbstractComponentCallbacksC0708p k6 = o6.k();
                if (this.f4028c.mWho.equals(k6.mTargetWho)) {
                    k6.mTarget = this.f4028c;
                    k6.mTargetWho = null;
                }
            }
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
        String str2 = abstractComponentCallbacksC0708p3.mTargetWho;
        if (str2 != null) {
            abstractComponentCallbacksC0708p3.mTarget = this.f4027b.f(str2);
        }
        this.f4027b.s(this);
    }

    public void h() {
        View view;
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4028c);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        ViewGroup viewGroup = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC0708p.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4028c.performDestroyView();
        this.f4026a.n(this.f4028c, false);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
        abstractComponentCallbacksC0708p2.mContainer = null;
        abstractComponentCallbacksC0708p2.mView = null;
        abstractComponentCallbacksC0708p2.mViewLifecycleOwner = null;
        abstractComponentCallbacksC0708p2.mViewLifecycleOwnerLiveData.p(null);
        this.f4028c.mInLayout = false;
    }

    public void i() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4028c);
        }
        this.f4028c.performDetach();
        this.f4026a.e(this.f4028c, false);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        abstractComponentCallbacksC0708p.mState = -1;
        abstractComponentCallbacksC0708p.mHost = null;
        abstractComponentCallbacksC0708p.mParentFragment = null;
        abstractComponentCallbacksC0708p.mFragmentManager = null;
        if ((!abstractComponentCallbacksC0708p.mRemoving || abstractComponentCallbacksC0708p.isInBackStack()) && !this.f4027b.p().r(this.f4028c)) {
            return;
        }
        if (I.I0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f4028c);
        }
        this.f4028c.initState();
    }

    public void j() {
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        if (abstractComponentCallbacksC0708p.mFromLayout && abstractComponentCallbacksC0708p.mInLayout && !abstractComponentCallbacksC0708p.mPerformedCreateView) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4028c);
            }
            Bundle bundle = this.f4028c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
            abstractComponentCallbacksC0708p2.performCreateView(abstractComponentCallbacksC0708p2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f4028c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
                abstractComponentCallbacksC0708p3.mView.setTag(O0.b.f3881a, abstractComponentCallbacksC0708p3);
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
                if (abstractComponentCallbacksC0708p4.mHidden) {
                    abstractComponentCallbacksC0708p4.mView.setVisibility(8);
                }
                this.f4028c.performViewCreated();
                C c6 = this.f4026a;
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = this.f4028c;
                c6.m(abstractComponentCallbacksC0708p5, abstractComponentCallbacksC0708p5.mView, bundle2, false);
                this.f4028c.mState = 2;
            }
        }
    }

    public AbstractComponentCallbacksC0708p k() {
        return this.f4028c;
    }

    public final boolean l(View view) {
        if (view == this.f4028c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4028c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4029d) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f4029d = true;
            boolean z6 = false;
            while (true) {
                int d6 = d();
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
                int i6 = abstractComponentCallbacksC0708p.mState;
                if (d6 == i6) {
                    if (!z6 && i6 == -1 && abstractComponentCallbacksC0708p.mRemoving && !abstractComponentCallbacksC0708p.isInBackStack() && !this.f4028c.mBeingSaved) {
                        if (I.I0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4028c);
                        }
                        this.f4027b.p().g(this.f4028c, true);
                        this.f4027b.s(this);
                        if (I.I0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4028c);
                        }
                        this.f4028c.initState();
                    }
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
                    if (abstractComponentCallbacksC0708p2.mHiddenChanged) {
                        if (abstractComponentCallbacksC0708p2.mView != null && (viewGroup = abstractComponentCallbacksC0708p2.mContainer) != null) {
                            a0 u6 = a0.u(viewGroup, abstractComponentCallbacksC0708p2.getParentFragmentManager());
                            if (this.f4028c.mHidden) {
                                u6.k(this);
                            } else {
                                u6.m(this);
                            }
                        }
                        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
                        I i7 = abstractComponentCallbacksC0708p3.mFragmentManager;
                        if (i7 != null) {
                            i7.G0(abstractComponentCallbacksC0708p3);
                        }
                        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
                        abstractComponentCallbacksC0708p4.mHiddenChanged = false;
                        abstractComponentCallbacksC0708p4.onHiddenChanged(abstractComponentCallbacksC0708p4.mHidden);
                        this.f4028c.mChildFragmentManager.I();
                    }
                    this.f4029d = false;
                    return;
                }
                if (d6 <= i6) {
                    switch (i6 - 1) {
                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0708p.mBeingSaved && this.f4027b.q(abstractComponentCallbacksC0708p.mWho) == null) {
                                this.f4027b.B(this.f4028c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f4028c.mState = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0708p.mInLayout = false;
                            abstractComponentCallbacksC0708p.mState = 2;
                            break;
                        case 3:
                            if (I.I0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4028c);
                            }
                            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = this.f4028c;
                            if (abstractComponentCallbacksC0708p5.mBeingSaved) {
                                this.f4027b.B(abstractComponentCallbacksC0708p5.mWho, q());
                            } else if (abstractComponentCallbacksC0708p5.mView != null && abstractComponentCallbacksC0708p5.mSavedViewState == null) {
                                r();
                            }
                            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p6 = this.f4028c;
                            if (abstractComponentCallbacksC0708p6.mView != null && (viewGroup2 = abstractComponentCallbacksC0708p6.mContainer) != null) {
                                a0.u(viewGroup2, abstractComponentCallbacksC0708p6.getParentFragmentManager()).l(this);
                            }
                            this.f4028c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            abstractComponentCallbacksC0708p.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i6 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0708p.mView != null && (viewGroup3 = abstractComponentCallbacksC0708p.mContainer) != null) {
                                a0.u(viewGroup3, abstractComponentCallbacksC0708p.getParentFragmentManager()).j(a0.d.b.c(this.f4028c.mView.getVisibility()), this);
                            }
                            this.f4028c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            abstractComponentCallbacksC0708p.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f4029d = false;
            throw th;
        }
    }

    public void n() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4028c);
        }
        this.f4028c.performPause();
        this.f4026a.f(this.f4028c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f4028c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f4028c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f4028c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
            abstractComponentCallbacksC0708p.mSavedViewState = abstractComponentCallbacksC0708p.mSavedFragmentState.getSparseParcelableArray("viewState");
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f4028c;
            abstractComponentCallbacksC0708p2.mSavedViewRegistryState = abstractComponentCallbacksC0708p2.mSavedFragmentState.getBundle("viewRegistryState");
            N n6 = (N) this.f4028c.mSavedFragmentState.getParcelable("state");
            if (n6 != null) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = this.f4028c;
                abstractComponentCallbacksC0708p3.mTargetWho = n6.f4023l;
                abstractComponentCallbacksC0708p3.mTargetRequestCode = n6.f4024m;
                Boolean bool = abstractComponentCallbacksC0708p3.mSavedUserVisibleHint;
                if (bool != null) {
                    abstractComponentCallbacksC0708p3.mUserVisibleHint = bool.booleanValue();
                    this.f4028c.mSavedUserVisibleHint = null;
                } else {
                    abstractComponentCallbacksC0708p3.mUserVisibleHint = n6.f4025n;
                }
            }
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = this.f4028c;
            if (abstractComponentCallbacksC0708p4.mUserVisibleHint) {
                return;
            }
            abstractComponentCallbacksC0708p4.mDeferStart = true;
        } catch (BadParcelableException e6) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e6);
        }
    }

    public void p() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4028c);
        }
        View focusedView = this.f4028c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (I.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f4028c);
                sb.append(" resulting in focused view ");
                sb.append(this.f4028c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f4028c.setFocusedView(null);
        this.f4028c.performResume();
        this.f4026a.i(this.f4028c, false);
        this.f4027b.B(this.f4028c.mWho, null);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        abstractComponentCallbacksC0708p.mSavedFragmentState = null;
        abstractComponentCallbacksC0708p.mSavedViewState = null;
        abstractComponentCallbacksC0708p.mSavedViewRegistryState = null;
    }

    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f4028c;
        if (abstractComponentCallbacksC0708p.mState == -1 && (bundle = abstractComponentCallbacksC0708p.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new N(this.f4028c));
        if (this.f4028c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f4028c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4026a.j(this.f4028c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f4028c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle i12 = this.f4028c.mChildFragmentManager.i1();
            if (!i12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", i12);
            }
            if (this.f4028c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f4028c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f4028c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f4028c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f4028c.mView == null) {
            return;
        }
        if (I.I0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4028c + " with view " + this.f4028c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4028c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4028c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4028c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4028c.mSavedViewRegistryState = bundle;
    }

    public void s(int i6) {
        this.f4030e = i6;
    }

    public void t() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4028c);
        }
        this.f4028c.performStart();
        this.f4026a.k(this.f4028c, false);
    }

    public void u() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4028c);
        }
        this.f4028c.performStop();
        this.f4026a.l(this.f4028c, false);
    }

    public O(C c6, P p6, ClassLoader classLoader, AbstractC0717z abstractC0717z, Bundle bundle) {
        this.f4026a = c6;
        this.f4027b = p6;
        AbstractComponentCallbacksC0708p a6 = ((N) bundle.getParcelable("state")).a(abstractC0717z, classLoader);
        this.f4028c = a6;
        a6.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a6.setArguments(bundle2);
        if (I.I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a6);
        }
    }

    public O(C c6, P p6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Bundle bundle) {
        this.f4026a = c6;
        this.f4027b = p6;
        this.f4028c = abstractComponentCallbacksC0708p;
        abstractComponentCallbacksC0708p.mSavedViewState = null;
        abstractComponentCallbacksC0708p.mSavedViewRegistryState = null;
        abstractComponentCallbacksC0708p.mBackStackNesting = 0;
        abstractComponentCallbacksC0708p.mInLayout = false;
        abstractComponentCallbacksC0708p.mAdded = false;
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = abstractComponentCallbacksC0708p.mTarget;
        abstractComponentCallbacksC0708p.mTargetWho = abstractComponentCallbacksC0708p2 != null ? abstractComponentCallbacksC0708p2.mWho : null;
        abstractComponentCallbacksC0708p.mTarget = null;
        abstractComponentCallbacksC0708p.mSavedFragmentState = bundle;
        abstractComponentCallbacksC0708p.mArguments = bundle.getBundle("arguments");
    }
}
