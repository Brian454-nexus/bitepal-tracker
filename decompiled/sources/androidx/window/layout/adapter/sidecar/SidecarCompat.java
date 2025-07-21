package androidx.window.layout.adapter.sidecar;

import N2.k;
import Q2.j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10180f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f10181a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.a f10182b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f10183c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10184d;

    /* renamed from: e, reason: collision with root package name */
    public b f10185e;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSidecarCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SidecarCompat.kt\nandroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1855#2:435\n1856#2:437\n1#3:436\n*S KotlinDebug\n*F\n+ 1 SidecarCompat.kt\nandroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback\n*L\n334#1:435\n334#1:437\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface h6;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.f10183c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder a6 = SidecarCompat.f10180f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a6 != null && (h6 = sidecarCompat.h()) != null) {
                    sidecarWindowLayoutInfo = h6.getWindowLayoutInfo(a6);
                }
                b bVar = sidecarCompat.f10185e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f10182b.e(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f10183c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            T2.a aVar = SidecarCompat.this.f10182b;
            SidecarInterface h6 = SidecarCompat.this.h();
            if (h6 == null || (sidecarDeviceState = h6.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j e6 = aVar.e(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.f10185e;
            if (bVar != null) {
                bVar.a(activity, e6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return k.f3606f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements a.InterfaceC0150a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0150a f10187a;

        /* renamed from: b, reason: collision with root package name */
        public final ReentrantLock f10188b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakHashMap f10189c;

        public b(a.InterfaceC0150a callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.f10187a = callbackInterface;
            this.f10188b = new ReentrantLock();
            this.f10189c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0150a
        public void a(Activity activity, j newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f10188b;
            reentrantLock.lock();
            try {
                if (Intrinsics.areEqual(newLayout, (j) this.f10189c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f10187a.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReentrantLock reentrantLock = this.f10188b;
            reentrantLock.lock();
            try {
                this.f10189c.put(activity, null);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final SidecarCompat f10190a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f10191b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f10190a = sidecarCompat;
            this.f10191b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f10191b.get();
            IBinder a6 = SidecarCompat.f10180f.a(activity);
            if (activity == null || a6 == null) {
                return;
            }
            this.f10190a.j(a6, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, T2.a sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.f10181a = sidecarInterface;
        this.f10182b = sidecarAdapter;
        this.f10183c = new LinkedHashMap();
        this.f10184d = new LinkedHashMap();
    }

    public static final void l(SidecarCompat this$0, Activity activity, Configuration configuration) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        b bVar = this$0.f10185e;
        if (bVar != null) {
            bVar.a(activity, this$0.i(activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0150a extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.f10185e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f10181a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f10182b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a6 = f10180f.a(activity);
        if (a6 != null) {
            j(a6, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a6 = f10180f.a(activity);
        if (a6 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f10181a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a6);
        }
        m(activity);
        b bVar = this.f10185e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z6 = this.f10183c.size() == 1;
        this.f10183c.remove(a6);
        if (!z6 || (sidecarInterface = this.f10181a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.f10181a;
    }

    public final j i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a6 = f10180f.a(activity);
        if (a6 == null) {
            return new j(CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.f10181a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a6) : null;
        T2.a aVar = this.f10182b;
        SidecarInterface sidecarInterface2 = this.f10181a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f10183c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f10181a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f10183c.size() == 1 && (sidecarInterface = this.f10181a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f10185e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(final Activity activity) {
        if (this.f10184d.get(activity) == null && (activity instanceof n0.c)) {
            InterfaceC2343a interfaceC2343a = new InterfaceC2343a() { // from class: T2.b
                @Override // y0.InterfaceC2343a
                public final void accept(Object obj) {
                    SidecarCompat.l(SidecarCompat.this, activity, (Configuration) obj);
                }
            };
            this.f10184d.put(activity, interfaceC2343a);
            ((n0.c) activity).addOnConfigurationChangedListener(interfaceC2343a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Activity activity) {
        InterfaceC2343a interfaceC2343a = (InterfaceC2343a) this.f10184d.get(activity);
        if (interfaceC2343a == null) {
            return;
        }
        if (activity instanceof n0.c) {
            ((n0.c) activity).removeOnConfigurationChangedListener(interfaceC2343a);
        }
        this.f10184d.remove(activity);
    }

    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f10181a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!Intrinsics.areEqual(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f10181a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f10181a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f10181a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f10181a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f10181a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!Intrinsics.areEqual(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!Intrinsics.areEqual(arrayList, (List) invoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f10180f.b(context), new T2.a(null, 1, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
