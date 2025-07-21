package e;

import U0.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.C1062n;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1055g;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import e.AbstractActivityC1216j;
import f.C1281a;
import f.InterfaceC1282b;
import h.AbstractC1389a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.InterfaceC2343a;
import y2.d;
import z0.C2429o;
import z0.InterfaceC2428n;
import z0.InterfaceC2431q;

/* renamed from: e.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractActivityC1216j extends androidx.core.app.g implements InterfaceC1061m, Q, InterfaceC1055g, y2.f, y, g.f, n0.c, n0.d, androidx.core.app.r, androidx.core.app.s, InterfaceC2428n, u {

    @NotNull
    private static final c Companion = new c(null);

    @Nullable
    private P _viewModelStore;

    @NotNull
    private final g.e activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final Lazy fullyDrawnReporter$delegate;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final Lazy onBackPressedDispatcher$delegate;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC2343a> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC2343a> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC2343a> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC2343a> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC2343a> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final e reportFullyDrawnExecutor;

    @NotNull
    private final y2.e savedStateRegistryController;

    @NotNull
    private final C1281a contextAwareHelper = new C1281a();

    @NotNull
    private final C2429o menuHostHelper = new C2429o(new Runnable() { // from class: e.d
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC1216j.p(AbstractActivityC1216j.this);
        }
    });

    /* renamed from: e.j$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC1059k {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1059k
        public void c(InterfaceC1061m source, AbstractC1057i.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractActivityC1216j.this.o();
            AbstractActivityC1216j.this.getLifecycle().c(this);
        }
    }

    /* renamed from: e.j$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13525a = new b();

        @NotNull
        public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: e.j$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    /* renamed from: e.j$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Object f13526a;

        /* renamed from: b, reason: collision with root package name */
        public P f13527b;

        public final P a() {
            return this.f13527b;
        }

        public final void b(Object obj) {
            this.f13526a = obj;
        }

        public final void c(P p6) {
            this.f13527b = p6;
        }
    }

    /* renamed from: e.j$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e extends Executor {
        void I(View view);

        void a();
    }

    /* renamed from: e.j$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final long f13528a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b, reason: collision with root package name */
        public Runnable f13529b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13530c;

        public f() {
        }

        public static final void d(f this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Runnable runnable = this$0.f13529b;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                this$0.f13529b = null;
            }
        }

        @Override // e.AbstractActivityC1216j.e
        public void I(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.f13530c) {
                return;
            }
            this.f13530c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // e.AbstractActivityC1216j.e
        public void a() {
            AbstractActivityC1216j.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC1216j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f13529b = runnable;
            View decorView = AbstractActivityC1216j.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.f13530c) {
                decorView.postOnAnimation(new Runnable() { // from class: e.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC1216j.f.d(AbstractActivityC1216j.f.this);
                    }
                });
            } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f13529b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f13528a) {
                    this.f13530c = false;
                    AbstractActivityC1216j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f13529b = null;
            if (AbstractActivityC1216j.this.getFullyDrawnReporter().c()) {
                this.f13530c = false;
                AbstractActivityC1216j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC1216j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: e.j$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends g.e {
        public g() {
        }

        public static final void s(g this$0, int i6, AbstractC1389a.C0202a c0202a) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f(i6, c0202a.a());
        }

        public static final void t(g this$0, int i6, IntentSender.SendIntentException e6) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(e6, "$e");
            this$0.e(i6, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e6));
        }

        @Override // g.e
        public void i(final int i6, AbstractC1389a contract, Object obj, androidx.core.app.b bVar) {
            Bundle bundle;
            final int i7;
            Intrinsics.checkNotNullParameter(contract, "contract");
            AbstractActivityC1216j abstractActivityC1216j = AbstractActivityC1216j.this;
            final AbstractC1389a.C0202a b6 = contract.b(abstractActivityC1216j, obj);
            if (b6 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC1216j.g.s(AbstractActivityC1216j.g.this, i6, b6);
                    }
                });
                return;
            }
            Intent a6 = contract.a(abstractActivityC1216j, obj);
            if (a6.getExtras() != null) {
                Bundle extras = a6.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    a6.setExtrasClassLoader(abstractActivityC1216j.getClassLoader());
                }
            }
            if (a6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a6.getAction())) {
                String[] stringArrayExtra = a6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.a(abstractActivityC1216j, stringArrayExtra, i6);
                return;
            }
            if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a6.getAction())) {
                androidx.core.app.a.c(abstractActivityC1216j, a6, i6, bundle2);
                return;
            }
            g.g gVar = (g.g) a6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(gVar);
                i7 = i6;
                try {
                    androidx.core.app.a.d(abstractActivityC1216j, gVar.e(), i7, gVar.a(), gVar.c(), gVar.d(), 0, bundle2);
                } catch (IntentSender.SendIntentException e6) {
                    e = e6;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC1216j.g.t(AbstractActivityC1216j.g.this, i7, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i7 = i6;
            }
        }
    }

    /* renamed from: e.j$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I invoke() {
            Application application = AbstractActivityC1216j.this.getApplication();
            AbstractActivityC1216j abstractActivityC1216j = AbstractActivityC1216j.this;
            return new I(application, abstractActivityC1216j, abstractActivityC1216j.getIntent() != null ? AbstractActivityC1216j.this.getIntent().getExtras() : null);
        }
    }

    /* renamed from: e.j$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: e.j$i$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1216j f13535a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractActivityC1216j abstractActivityC1216j) {
                super(0);
                this.f13535a = abstractActivityC1216j;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m6invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() {
                this.f13535a.reportFullyDrawn();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke() {
            return new t(AbstractActivityC1216j.this.reportFullyDrawnExecutor, new a(AbstractActivityC1216j.this));
        }
    }

    /* renamed from: e.j$j, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0190j extends Lambda implements Function0 {
        public C0190j() {
            super(0);
        }

        public static final void d(AbstractActivityC1216j this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                AbstractActivityC1216j.super.onBackPressed();
            } catch (IllegalStateException e6) {
                if (!Intrinsics.areEqual(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e6;
                }
            } catch (NullPointerException e7) {
                if (!Intrinsics.areEqual(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e7;
                }
            }
        }

        public static final void e(AbstractActivityC1216j this$0, w dispatcher) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
            this$0.l(dispatcher);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            final AbstractActivityC1216j abstractActivityC1216j = AbstractActivityC1216j.this;
            final w wVar = new w(new Runnable() { // from class: e.n
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC1216j.C0190j.d(AbstractActivityC1216j.this);
                }
            });
            final AbstractActivityC1216j abstractActivityC1216j2 = AbstractActivityC1216j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC1216j.C0190j.e(AbstractActivityC1216j.this, wVar);
                        }
                    });
                    return wVar;
                }
                abstractActivityC1216j2.l(wVar);
            }
            return wVar;
        }
    }

    public AbstractActivityC1216j() {
        y2.e a6 = y2.e.f21218d.a(this);
        this.savedStateRegistryController = a6;
        this.reportFullyDrawnExecutor = n();
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC1059k() { // from class: e.e
            @Override // androidx.lifecycle.InterfaceC1059k
            public final void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
                AbstractActivityC1216j.h(AbstractActivityC1216j.this, interfaceC1061m, aVar);
            }
        });
        getLifecycle().a(new InterfaceC1059k() { // from class: e.f
            @Override // androidx.lifecycle.InterfaceC1059k
            public final void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
                AbstractActivityC1216j.i(AbstractActivityC1216j.this, interfaceC1061m, aVar);
            }
        });
        getLifecycle().a(new a());
        a6.c();
        F.c(this);
        getSavedStateRegistry().h("android:support:activity-result", new d.c() { // from class: e.g
            @Override // y2.d.c
            public final Bundle a() {
                Bundle j6;
                j6 = AbstractActivityC1216j.j(AbstractActivityC1216j.this);
                return j6;
            }
        });
        addOnContextAvailableListener(new InterfaceC1282b() { // from class: e.h
            @Override // f.InterfaceC1282b
            public final void a(Context context) {
                AbstractActivityC1216j.k(AbstractActivityC1216j.this, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new h());
        this.onBackPressedDispatcher$delegate = LazyKt.lazy(new C0190j());
    }

    public static final void h(AbstractActivityC1216j this$0, InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
        Window window;
        View peekDecorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1061m, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1057i.a.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    public static final void i(AbstractActivityC1216j this$0, InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1061m, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1057i.a.ON_DESTROY) {
            this$0.contextAwareHelper.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.a();
        }
    }

    public static final Bundle j(AbstractActivityC1216j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.k(bundle);
        return bundle;
    }

    public static final void k(AbstractActivityC1216j this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle b6 = this$0.getSavedStateRegistry().b("android:support:activity-result");
        if (b6 != null) {
            this$0.activityResultRegistry.j(b6);
        }
    }

    public static final void m(w dispatcher, AbstractActivityC1216j this$0, InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1061m, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1057i.a.ON_CREATE) {
            dispatcher.n(b.f13525a.a(this$0));
        }
    }

    public static final void p(AbstractActivityC1216j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // z0.InterfaceC2428n
    public void addMenuProvider(@NotNull InterfaceC2431q provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // n0.c
    public final void addOnConfigurationChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull InterfaceC1282b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnMultiWindowModeChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.s
    public final void addOnPictureInPictureModeChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // n0.d
    public final void addOnTrimMemoryListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // g.f
    @NotNull
    public final g.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1055g
    @NotNull
    public U0.a getDefaultViewModelCreationExtras() {
        U0.b bVar = new U0.b(null, 1, null);
        if (getApplication() != null) {
            a.b bVar2 = N.a.f9017h;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(F.f8987a, this);
        bVar.c(F.f8988b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(F.f8989c, extras);
        }
        return bVar;
    }

    @NotNull
    public t getFullyDrawnReporter() {
        return (t) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // androidx.core.app.g, androidx.lifecycle.InterfaceC1061m
    @NotNull
    public AbstractC1057i getLifecycle() {
        return super.getLifecycle();
    }

    @Override // e.y
    @NotNull
    public final w getOnBackPressedDispatcher() {
        return (w) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // y2.f
    @NotNull
    public final y2.d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.Q
    @NotNull
    public P getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        o();
        P p6 = this._viewModelStore;
        Intrinsics.checkNotNull(p6);
        return p6;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        S.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        T.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        y2.g.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        AbstractC1206B.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        AbstractC1205A.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    public final void l(final w wVar) {
        getLifecycle().a(new InterfaceC1059k() { // from class: e.i
            @Override // androidx.lifecycle.InterfaceC1059k
            public final void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
                AbstractActivityC1216j.m(w.this, this, interfaceC1061m, aVar);
            }
        });
    }

    public final e n() {
        return new f();
    }

    public final void o() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.a();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new P();
            }
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (this.activityResultRegistry.e(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedDispatcher().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC2343a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.z.f9107b.c(this);
        int i6 = this.contentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        this.menuHostHelper.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i6, item)) {
            return true;
        }
        if (i6 == 0) {
            return this.menuHostHelper.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC2343a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.i(z6));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC2343a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.c(menu);
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC2343a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.u(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        this.menuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.e(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i6, permissions, grantResults);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        P p6 = this._viewModelStore;
        if (p6 == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            p6 = dVar.a();
        }
        if (p6 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(onRetainCustomNonConfigurationInstance);
        dVar2.c(p6);
        return dVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C1062n) {
            AbstractC1057i lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1062n) lifecycle).m(AbstractC1057i.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator<InterfaceC2343a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i6));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @NotNull
    public final <I, O> g.c registerForActivityResult(@NotNull AbstractC1389a contract, @NotNull g.e registry, @NotNull g.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // z0.InterfaceC2428n
    public void removeMenuProvider(@NotNull InterfaceC2431q provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.f(provider);
    }

    @Override // n0.c
    public final void removeOnConfigurationChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnMultiWindowModeChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.s
    public final void removeOnPictureInPictureModeChangedListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // n0.d
    public final void removeOnTrimMemoryListener(@NotNull InterfaceC2343a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (G2.a.h()) {
                G2.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            G2.a.f();
        } catch (Throwable th) {
            G2.a.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i6) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i6) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i6, @Nullable Intent intent2, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i6, intent2, i7, i8, i9);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i6, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i6, @Nullable Intent intent2, int i7, int i8, int i9, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i6, intent2, i7, i8, i9, bundle);
    }

    @NotNull
    public final <I, O> g.c registerForActivityResult(@NotNull AbstractC1389a contract, @NotNull g.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC2343a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(z6, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC2343a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.u(z6, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.I(decorView);
        super.setContentView(view, layoutParams);
    }
}
