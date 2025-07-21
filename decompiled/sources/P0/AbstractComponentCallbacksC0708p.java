package P0;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.AbstractC1065q;
import androidx.lifecycle.C1062n;
import androidx.lifecycle.C1067t;
import androidx.lifecycle.InterfaceC1055g;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import z0.AbstractC2426l;

/* renamed from: P0.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractComponentCallbacksC0708p implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1061m, androidx.lifecycle.Q, InterfaceC1055g, y2.f {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    g mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    N.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    I mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1062n mLifecycleRegistry;
    AbstractComponentCallbacksC0708p mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    y2.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    AbstractComponentCallbacksC0708p mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    V mViewLifecycleOwner;
    int mState = -1;

    @NonNull
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;

    @NonNull
    I mChildFragmentManager = new J();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new a();
    AbstractC1057i.b mMaxState = AbstractC1057i.b.RESUMED;
    C1067t mViewLifecycleOwnerLiveData = new C1067t();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<i> mOnPreAttachedListeners = new ArrayList<>();
    private final i mSavedStateAttachListener = new b();

    /* renamed from: P0.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC0708p.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: P0.p$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends i {
        public b() {
            super(null);
        }

        @Override // P0.AbstractComponentCallbacksC0708p.i
        public void a() {
            AbstractComponentCallbacksC0708p.this.mSavedStateRegistryController.c();
            androidx.lifecycle.F.c(AbstractComponentCallbacksC0708p.this);
            Bundle bundle = AbstractComponentCallbacksC0708p.this.mSavedFragmentState;
            AbstractComponentCallbacksC0708p.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: P0.p$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC0708p.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: P0.p$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f4249a;

        public d(a0 a0Var) {
            this.f4249a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4249a.w()) {
                this.f4249a.n();
            }
        }
    }

    /* renamed from: P0.p$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends AbstractC0714w {
        public e() {
        }

        @Override // P0.AbstractC0714w
        public View c(int i6) {
            View view = AbstractComponentCallbacksC0708p.this.mView;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC0708p.this + " does not have a view");
        }

        @Override // P0.AbstractC0714w
        public boolean d() {
            return AbstractComponentCallbacksC0708p.this.mView != null;
        }
    }

    /* renamed from: P0.p$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements InterfaceC1059k {
        public f() {
        }

        @Override // androidx.lifecycle.InterfaceC1059k
        public void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
            View view;
            if (aVar != AbstractC1057i.a.ON_STOP || (view = AbstractComponentCallbacksC0708p.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: P0.p$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public View f4253a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4254b;

        /* renamed from: c, reason: collision with root package name */
        public int f4255c;

        /* renamed from: d, reason: collision with root package name */
        public int f4256d;

        /* renamed from: e, reason: collision with root package name */
        public int f4257e;

        /* renamed from: f, reason: collision with root package name */
        public int f4258f;

        /* renamed from: g, reason: collision with root package name */
        public int f4259g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f4260h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f4261i;

        /* renamed from: j, reason: collision with root package name */
        public Object f4262j = null;

        /* renamed from: k, reason: collision with root package name */
        public Object f4263k;

        /* renamed from: l, reason: collision with root package name */
        public Object f4264l;

        /* renamed from: m, reason: collision with root package name */
        public Object f4265m;

        /* renamed from: n, reason: collision with root package name */
        public Object f4266n;

        /* renamed from: o, reason: collision with root package name */
        public Object f4267o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f4268p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f4269q;

        /* renamed from: r, reason: collision with root package name */
        public float f4270r;

        /* renamed from: s, reason: collision with root package name */
        public View f4271s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f4272t;

        public g() {
            Object obj = AbstractComponentCallbacksC0708p.USE_DEFAULT_TRANSITION;
            this.f4263k = obj;
            this.f4264l = null;
            this.f4265m = obj;
            this.f4266n = null;
            this.f4267o = obj;
            this.f4270r = 1.0f;
            this.f4271s = null;
        }
    }

    /* renamed from: P0.p$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: P0.p$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class i {
        public i() {
        }

        public abstract void a();

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC0708p() {
        h();
    }

    public static /* synthetic */ void d(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        abstractComponentCallbacksC0708p.mViewLifecycleOwner.d(abstractComponentCallbacksC0708p.mSavedViewRegistryState);
        abstractComponentCallbacksC0708p.mSavedViewRegistryState = null;
    }

    @NonNull
    @Deprecated
    public static AbstractComponentCallbacksC0708p instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) AbstractC0717z.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return abstractComponentCallbacksC0708p;
            }
            bundle.setClassLoader(abstractComponentCallbacksC0708p.getClass().getClassLoader());
            abstractComponentCallbacksC0708p.setArguments(bundle);
            return abstractComponentCallbacksC0708p;
        } catch (IllegalAccessException e6) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e6);
        } catch (InstantiationException e7) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (NoSuchMethodException e8) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e8);
        } catch (InvocationTargetException e9) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e9);
        }
    }

    public void callStartTransitionListener(boolean z6) {
        ViewGroup viewGroup;
        I i6;
        g gVar = this.mAnimationInfo;
        if (gVar != null) {
            gVar.f4272t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (i6 = this.mFragmentManager) == null) {
            return;
        }
        a0 u6 = a0.u(viewGroup, i6);
        u6.x();
        if (z6) {
            this.mHost.h().post(new d(u6));
        } else {
            u6.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public AbstractC0714w createFragmentContainer() {
        return new e();
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC0708p g6 = g(false);
        if (g6 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(g6);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            V0.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final g e() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new g();
        }
        return this.mAnimationInfo;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int f() {
        AbstractC1057i.b bVar = this.mMaxState;
        return (bVar == AbstractC1057i.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.f());
    }

    public AbstractComponentCallbacksC0708p findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.j0(str);
    }

    public final AbstractComponentCallbacksC0708p g(boolean z6) {
        String str;
        if (z6) {
            Q0.c.h(this);
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.mTarget;
        if (abstractComponentCallbacksC0708p != null) {
            return abstractComponentCallbacksC0708p;
        }
        I i6 = this.mFragmentManager;
        if (i6 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return i6.f0(str);
    }

    public final AbstractActivityC0712u getActivity() {
        A a6 = this.mHost;
        if (a6 == null) {
            return null;
        }
        return (AbstractActivityC0712u) a6.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        g gVar = this.mAnimationInfo;
        if (gVar == null || (bool = gVar.f4269q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        g gVar = this.mAnimationInfo;
        if (gVar == null || (bool = gVar.f4268p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        return gVar.f4253a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final I getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a6 = this.mHost;
        if (a6 == null) {
            return null;
        }
        return a6.f();
    }

    @Override // androidx.lifecycle.InterfaceC1055g
    @NonNull
    public U0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && I.I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        U0.b bVar = new U0.b();
        if (application != null) {
            bVar.c(N.a.f9017h, application);
        }
        bVar.c(androidx.lifecycle.F.f8987a, this);
        bVar.c(androidx.lifecycle.F.f8988b, this);
        if (getArguments() != null) {
            bVar.c(androidx.lifecycle.F.f8989c, getArguments());
        }
        return bVar;
    }

    public int getEnterAnim() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 0;
        }
        return gVar.f4255c;
    }

    public Object getEnterTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        return gVar.f4262j;
    }

    public androidx.core.app.w getEnterTransitionCallback() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public int getExitAnim() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 0;
        }
        return gVar.f4256d;
    }

    public Object getExitTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        return gVar.f4264l;
    }

    public androidx.core.app.w getExitTransitionCallback() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public View getFocusedView() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        return gVar.f4271s;
    }

    public final Object getHost() {
        A a6 = this.mHost;
        if (a6 == null) {
            return null;
        }
        return a6.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a6 = this.mHost;
        if (a6 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater k6 = a6.k();
        AbstractC2426l.a(k6, this.mChildFragmentManager.w0());
        return k6;
    }

    @Override // androidx.lifecycle.InterfaceC1061m
    @NonNull
    public AbstractC1057i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public int getNextTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 0;
        }
        return gVar.f4259g;
    }

    public final AbstractComponentCallbacksC0708p getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final I getParentFragmentManager() {
        I i6 = this.mFragmentManager;
        if (i6 != null) {
            return i6;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return false;
        }
        return gVar.f4254b;
    }

    public int getPopEnterAnim() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 0;
        }
        return gVar.f4257e;
    }

    public int getPopExitAnim() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 0;
        }
        return gVar.f4258f;
    }

    public float getPostOnViewCreatedAlpha() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f4270r;
    }

    public Object getReenterTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f4265m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getReturnTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f4263k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // y2.f
    @NonNull
    public final y2.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        return gVar.f4266n;
    }

    public Object getSharedElementReturnTransition() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f4267o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        g gVar = this.mAnimationInfo;
        return (gVar == null || (arrayList = gVar.f4260h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        g gVar = this.mAnimationInfo;
        return (gVar == null || (arrayList = gVar.f4261i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getTag() {
        return this.mTag;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public AbstractC1065q getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.Q
    @NonNull
    public androidx.lifecycle.P getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (f() != AbstractC1057i.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final void h() {
        this.mLifecycleRegistry = new C1062n(this);
        this.mSavedStateRegistryController = y2.e.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        i(this.mSavedStateAttachListener);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(i iVar) {
        if (this.mState >= 0) {
            iVar.a();
        } else {
            this.mOnPreAttachedListeners.add(iVar);
        }
    }

    public void initState() {
        h();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new J();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        I i6 = this.mFragmentManager;
        return i6 != null && i6.L0(this.mParentFragment);
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        I i6 = this.mFragmentManager;
        return i6 == null || i6.M0(this.mParentFragment);
    }

    public boolean isPostponed() {
        g gVar = this.mAnimationInfo;
        if (gVar == null) {
            return false;
        }
        return gVar.f4272t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isStateSaved() {
        I i6 = this.mFragmentManager;
        if (i6 == null) {
            return false;
        }
        return i6.P0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final void j() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (I.I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i7 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        A a6 = this.mHost;
        Activity e6 = a6 == null ? null : a6.e();
        if (e6 != null) {
            this.mCalled = false;
            onAttach(e6);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.O0(1)) {
            return;
        }
        this.mChildFragmentManager.B();
    }

    public Animation onCreateAnimation(int i6, boolean z6, int i7) {
        return null;
    }

    public Animator onCreateAnimator(int i6, boolean z6, int i7) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6 = this.mContentLayoutId;
        if (i6 != 0) {
            return layoutInflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z6) {
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a6 = this.mHost;
        Activity e6 = a6 == null ? null : a6.e();
        if (e6 != null) {
            this.mCalled = false;
            onInflate(e6, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z6) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z6) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z6) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i6, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            j();
            this.mChildFragmentManager.x();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<i> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.l(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.H(this);
            this.mChildFragmentManager.y();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.A(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new f());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.h(AbstractC1057i.a.ON_CREATE);
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z6 = true;
        }
        return this.mChildFragmentManager.C(menu, menuInflater) | z6;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new V(this, getViewModelStore(), new Runnable() { // from class: P0.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC0708p.d(AbstractComponentCallbacksC0708p.this);
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (I.I0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.S.a(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.T.a(this.mView, this.mViewLifecycleOwner);
        y2.g.a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.p(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.D();
        this.mLifecycleRegistry.h(AbstractC1057i.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.E();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().b(AbstractC1057i.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1057i.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            V0.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.H0()) {
                return;
            }
            this.mChildFragmentManager.D();
            this.mChildFragmentManager = new J();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDetach()");
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z6) {
        onMultiWindowModeChanged(z6);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.J(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.K(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.M();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1057i.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(AbstractC1057i.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z6) {
        onPictureInPictureModeChanged(z6);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z6 = true;
        }
        return this.mChildFragmentManager.O(menu) | z6;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean N02 = this.mFragmentManager.N0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != N02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(N02);
            onPrimaryNavigationFragmentChanged(N02);
            this.mChildFragmentManager.P();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S0();
        this.mChildFragmentManager.a0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onResume()");
        }
        C1062n c1062n = this.mLifecycleRegistry;
        AbstractC1057i.a aVar = AbstractC1057i.a.ON_RESUME;
        c1062n.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Q();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.S0();
        this.mChildFragmentManager.a0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onStart()");
        }
        C1062n c1062n = this.mLifecycleRegistry;
        AbstractC1057i.a aVar = AbstractC1057i.a.ON_START;
        c1062n.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.R();
    }

    public void performStop() {
        this.mChildFragmentManager.T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1057i.a.ON_STOP);
        }
        this.mLifecycleRegistry.h(AbstractC1057i.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.U();
    }

    @NonNull
    public final AbstractActivityC0712u requireActivity() {
        AbstractActivityC0712u activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.g1(bundle);
        this.mChildFragmentManager.B();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC1057i.a.ON_CREATE);
            }
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAnimations(int i6, int i7, int i8, int i9) {
        if (this.mAnimationInfo == null && i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        e().f4255c = i6;
        e().f4256d = i7;
        e().f4257e = i8;
        e().f4258f = i9;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setFocusedView(View view) {
        e().f4271s = view;
    }

    public void setNextTransition(int i6) {
        if (this.mAnimationInfo == null && i6 == 0) {
            return;
        }
        e();
        this.mAnimationInfo.f4259g = i6;
    }

    public void setPopDirection(boolean z6) {
        if (this.mAnimationInfo == null) {
            return;
        }
        e().f4254b = z6;
    }

    public void setPostOnViewCreatedAlpha(float f6) {
        e().f4270r = f6;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        e();
        g gVar = this.mAnimationInfo;
        gVar.f4260h = arrayList;
        gVar.f4261i = arrayList2;
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i6) {
        startActivityForResult(intent, i6, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !e().f4272t) {
            return;
        }
        if (this.mHost == null) {
            e().f4272t = false;
        } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
            this.mHost.h().postAtFrontOfQueue(new c());
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i6, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().Q0(this, intent, i6, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
